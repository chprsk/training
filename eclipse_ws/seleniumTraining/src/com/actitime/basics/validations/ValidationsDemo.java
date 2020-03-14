package com.actitime.basics.validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.actitime.basics.utils.ActitimeUtils;

public class ValidationsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp("http://formy-project.herokuapp.com/enabled");
		
		verifyDisplayedAndEnabled(driver,driver.findElement(By.id("disabledInput")));
		verifyDisplayedAndEnabled(driver,driver.findElement(By.id("input")));
		
		
		
		
		
	}

	private static void verifyDisplayedAndEnabled(WebDriver driver, WebElement ele) 
	{
		if(ele.isDisplayed())
		{
			System.out.println("Elment is displayed...");
			if(ele.isEnabled())
			{
				System.out.println("Element is Enabled..");
				ele.sendKeys("Hello");
			}
			else
			{
				System.out.println("Element is not Enabled.... not able to perfor type operation");
			}
		}
		else
		{
			System.out.println("Element is not displlayed.....");
		}
	}
}
