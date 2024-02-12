package com.noorteck.selenium.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise6 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(1000);
		
		String pageTitle = driver.getTitle();
		
		if(pageTitle.equals("Alerts")) {
			System.out.println("Yes, page tite Alerts");
		} else {
			System.out.println("No, page title not Alerts");
		}
		
		Thread.sleep(1000);
		
		WebElement alertWithText = driver.findElement(By.linkText("Alert with Textbox"));
		alertWithText.click();
		
		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		promptBox.click();
		
		Alert promptBoxObj = driver.switchTo().alert();
		
		Thread.sleep(1000);
		
		promptBoxObj.sendKeys("John Cena");
		
		Thread.sleep(1000);
		
		promptBoxObj.accept();
		
		Thread.sleep(1000);
		
		WebElement message = driver.findElement(By.id("demo1"));
		
		System.out.println(message.getText());
		
		Thread.sleep(2000);
		
		
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
				
		WebElement alertWithOkAndCancel = driver.findElement(By.linkText("Alert with OK & Cancel"));
		alertWithOkAndCancel.click();
		
		WebElement promptBox2 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		promptBox2.click();
		
		Alert promptBox2Obj = driver.switchTo().alert();
		
		Thread.sleep(1000);
		
		String textMessage = promptBox2Obj.getText();
		
		if(textMessage.equals("Press a Button !")) {
		
			promptBox2Obj.dismiss();
			
		} else {
			promptBox2Obj.accept();
			
		}
		
		Thread.sleep(1000);
		
		WebElement message2 = driver.findElement(By.id("demo"));
		
		System.out.println(message2.getText());
		
		tearDown();
	}

}
