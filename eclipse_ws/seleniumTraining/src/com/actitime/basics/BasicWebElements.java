package com.actitime.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElements {

	static WebDriver driver = null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		
		// Launching Formy Application
		driver.get("http://formy-project.herokuapp.com/form");
		
		
		//Enter Form Details
		driver.findElement(By.id("first-name")).sendKeys("User First Name");
		driver.findElement(By.id("last-name")).sendKeys("User Last Name");
		driver.findElement(By.id("job-title")).sendKeys("Software Engg");
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.linkText("Submit")).click();
		
		
		driver.close();
		driver = null;
		
		
		
		
		
		
	}
}
