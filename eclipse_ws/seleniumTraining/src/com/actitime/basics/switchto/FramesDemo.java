package com.actitime.basics.switchto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.actitime.basics.utils.ActitimeUtils;

public class FramesDemo extends ActitimeUtils
{
	static WebDriver driver = null;
	public static void main(String[] args) {
		driver = getMyDriver();
		launchApp("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_styles_intro");
		
		click("xpath", "//button[contains(text(),'Run')]");
		
		driver.switchTo().frame("iframeResult");
		List<WebElement> results = driver.findElements(By.tagName("p"));
		
		for (WebElement result : results) 
		{
			System.out.println(result.getText());
			
		}
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
	}

}
