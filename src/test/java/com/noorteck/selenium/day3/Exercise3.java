package com.noorteck.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise3 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
	setUp();
	
	driver.get("https://demo.nopcommerce.com/");
	
	Thread.sleep(1000);
	
	WebElement registerLink = driver.findElement(By.linkText("Register"));
	registerLink.click();
	
	String pageTitle = driver.getTitle();
	
	System.out.println(pageTitle);
	
	if(pageTitle.equals("nopCommerce demo store. Register")) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
	
	Thread.sleep(1000);
	
	WebElement genderRadio = driver.findElement(By.id("gender-male"));
	genderRadio.click();
	
	Thread.sleep(1000);
	
	WebElement firstName = driver.findElement(By.id("FirstName"));
	firstName.sendKeys("John");
	
	Thread.sleep(1000);
	
	WebElement lastName = driver.findElement(By.id("LastName"));
	lastName.sendKeys("Cena");
	
	Thread.sleep(1000);
	
	WebElement dateOfBirthDay = driver.findElement(By.name("DateOfBirthDay"));
	Select selectObj = new Select(dateOfBirthDay);
	selectObj.selectByValue("11");
	
	Thread.sleep(1000);
	
	WebElement dateOfBirthMonth = driver.findElement(By.name("DateOfBirthMonth"));
	Select selectObj1 = new Select(dateOfBirthMonth);
	selectObj1.selectByValue("2");
	
	Thread.sleep(1000);
	
	WebElement dateOfBirthYear = driver.findElement(By.name("DateOfBirthYear"));
	Select selectObj2 = new Select(dateOfBirthYear);
	selectObj2.selectByValue("2000");
	
	Thread.sleep(1000);
	
	WebElement emailField = driver.findElement(By.id("Email"));
	emailField.sendKeys("john.cena@gmail.com");
	
	Thread.sleep(1000);
	
	WebElement companyField = driver.findElement(By.id("Company"));
	companyField.sendKeys("John Cena Inc");
	
	Thread.sleep(1000);
	
	WebElement newsLetterCheck = driver.findElement(By.id("Newsletter"));
	newsLetterCheck.click();
	
	Thread.sleep(1000);
	
	WebElement passwordField = driver.findElement(By.name("Password"));
	passwordField.sendKeys("123456");
	
	Thread.sleep(1000);
	
	WebElement confirmPasswordField = driver.findElement(By.name("ConfirmPassword"));
	confirmPasswordField.sendKeys("123456");
	
	Thread.sleep(1000);
	
	WebElement registerButton = driver.findElement(By.name("register-button"));
	registerButton.click();
	
	Thread.sleep(1000);
	
	WebElement confirmMessage = driver.findElement(By.className("result"));
	
	if(confirmMessage.getText().equals("Your registration completed!!!")) {
		System.out.println("TESTCASE PASSED");
	}else {
		System.out.println("TESTCASE FAILED");
	}
	
	
	
	
	tearDown();
	}
}
