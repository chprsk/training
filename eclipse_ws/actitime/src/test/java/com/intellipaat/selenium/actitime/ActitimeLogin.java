package com.intellipaat.selenium.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeLogin {

	
	@Test
	public void validateLogin()
	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =  new FirefoxDriver();
		
		
		driver.get("https://maven.apache.org/download.cgi");
		
		
		
		
		
//		System.setProperty("webdriver.chrome.driver", "exe loacaiton")
//		WebDriver driver = new ChromeDriver();
	}
	
	
	
}
