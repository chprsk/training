package com.actitime.basics.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		
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
		
		WebElement ele  = driver.findElement(By.id("select-menu"));
		Select dropDown = new Select(ele);
		
		dropDown.selectByIndex(1);
		Thread.sleep(2000);
		
		dropDown.selectByValue("4");
		Thread.sleep(2000);
		
		dropDown.selectByVisibleText("5-9");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Submit")).click();
		
		
		driver.close();
		driver = null;
		
		
		
		
		
		
	}
}
