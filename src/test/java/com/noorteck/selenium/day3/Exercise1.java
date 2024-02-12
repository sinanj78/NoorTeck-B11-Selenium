package com.noorteck.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		
		//usernameField
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("ntk-admin");
		Thread.sleep(1000);
		
		//passwordField
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(1000);
		
		//login
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		
		Thread.sleep(1000);
		
		//retrieve the header
		WebElement header = driver.findElement(By.className("oxd-topbar-header-title"));
		
		if(header.getText().equals("Dashboard")){
			
			System.out.println("Header text it's Dashboard");
		} else {
			
			System.out.println("Header text not Dashboard");
		}
		
		
		tearDown();
		
		
	}
}
