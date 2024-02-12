package com.noorteck.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise2 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		
		Thread.sleep(2000);
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
		if(pageTitle.equals("Mercury Tours")) {
			System.out.println("Page Title is Mercury Tours");
		} else {
			System.out.println("Page Title not Mercury Tours");
		}
		
		
		
		WebElement firstNameField = driver.findElement(By.name("firstName"));
		firstNameField.sendKeys("John");
		Thread.sleep(1000);
		
		WebElement lastNameField = driver.findElement(By.name("lastName"));
		lastNameField.sendKeys("Cena");
		Thread.sleep(1000);
		
		WebElement phoneField = driver.findElement(By.name("phone"));
		phoneField.sendKeys("777-777-7777");
		Thread.sleep(1000);
		
		WebElement emailField = driver.findElement(By.id("username"));
		emailField.sendKeys("john.cena@gmail.com");
		Thread.sleep(1000);
		
		WebElement addressField = driver.findElement(By.name("address1"));
		addressField.sendKeys("123 Main Str");
		Thread.sleep(1000);
		
		WebElement cityField = driver.findElement(By.name("city"));
		cityField.sendKeys("Roseville");
		Thread.sleep(1000);
		
		WebElement stateField = driver.findElement(By.name("state"));
		stateField.sendKeys("California");
		Thread.sleep(1000);
		
		WebElement postalCodeField = driver.findElement(By.name("postalCode"));
		postalCodeField.sendKeys("95888");
		Thread.sleep(1000);
		
		WebElement userNameField = driver.findElement(By.id("email"));
		userNameField.sendKeys("john.cena@gmail.com");
		Thread.sleep(1000);
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("123456");
		Thread.sleep(1000);
		
		WebElement confirmPasswordField = driver.findElement(By.name("confirmPassword"));
		confirmPasswordField.sendKeys("123456");
		Thread.sleep(1000);
		
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		Thread.sleep(1000);
		
		
		WebElement confirmMessage = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
		
		
		if(confirmMessage.getText().contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		
		tearDown();
		
	}

}
