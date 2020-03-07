package com.actitime.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium
{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello all welcome to Selenium Classes..\nlets get started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://localhost/login.do");
	
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.close();
		driver = null;
		
		
		System.out.println("END");
	
		
		
	}

}
