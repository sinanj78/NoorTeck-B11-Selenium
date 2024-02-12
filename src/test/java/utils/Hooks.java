package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	public static WebDriver driver;
	
	public static void setUp() {
		
		//WebDriverManager.firefoxdriver().setup(); //for Win using firefox browser
		//driver = new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//webdrivermanager.safaridriver().setup();  for MAC users
		//driver = new safariDriver();
		
		
		//webdrivermanager.edgedriver().setup();  for Win using Edge browser
		//driver = new edgeDriver();
		
					
	}
	
	
	
	public static void tearDown() {
		
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
