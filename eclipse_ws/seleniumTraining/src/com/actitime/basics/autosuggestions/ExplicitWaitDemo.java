package com.actitime.basics.autosuggestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		System.out.println("=== Printing Hello Text ===");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("file:///D:/Intellipaat/Intellipaat_09_Feb/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
	
		WebElement ele = driver.findElement(By.id("demo"));
		WebElement ele2 = driver.findElement(By.id("demo2"));
		
		System.out.println("--Printing output---"  +ele.getText());
		System.out.println("--Printing output---"  +ele2.getText());
		
	}
}
