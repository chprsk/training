package com.actitime.basics.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownFromCustomTag
{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://localhost/login.do");
	
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//td[@class='userSelectorButton']")).click();
		driver.findElement(By.xpath("//span[text()='Kloss, Barbara']/parent::div")).click();
		
		Thread.sleep(5000);
		System.out.println("END");
	
		
		
	}

}
