package com.actitime.basics.dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintingAllValuesOfDropDown {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		// Launching Formy Application
		driver.get("http://formy-project.herokuapp.com/form");
		
		WebElement ele  =  driver.findElement(By.id("select-menu"));
		
		Select sel = new Select(ele);
		
		List<WebElement> options = sel.getOptions();
		System.out.println("Total elements in dropDown is " + options.size());
		for (WebElement option : options)
		{
			System.out.println(option.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
