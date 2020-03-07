package com.actitime.basics.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownDemo {
	
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:///D:/Intellipaat/Intellipaat_09_Feb/html/multiSelect.html");
		
		WebElement multiSelectDropDown = driver.findElement(By.tagName("select"));
		
		Select sel  = new Select(multiSelectDropDown);
		
		sel.selectByValue("volvo");
		Thread.sleep(2000);
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		//de select
		sel.deselectByValue("audi");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Mercedes");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		
		sel.selectByValue("volvo");
		Thread.sleep(2000);
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		sel.deselectAll();
		Thread.sleep(2000);
		
	}
}
