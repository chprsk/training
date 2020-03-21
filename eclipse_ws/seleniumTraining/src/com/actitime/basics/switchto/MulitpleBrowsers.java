package com.actitime.basics.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.actitime.basics.utils.ActitimeUtils;

public class MulitpleBrowsers extends ActitimeUtils
{
	public static void main(String[] args) {
		
		WebDriver driver =  getMyDriver();
		launchApp("https://www.irctc.co.in/eticketing/errors.html#");
		click("xpath", "//a[text()='Contact Us']");
		
		Set<String> windowIDs = driver.getWindowHandles();
		// Please refer java video
		Iterator<String> it = windowIDs.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		System.out.println("Parent windowID - " + parentWindowID);
		System.out.println("Child windowID - " + childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		List<WebElement> hyperLinks = driver.findElements(By.tagName("a"));
		for (WebElement hyperLink : hyperLinks) {
			System.out.println(hyperLink.getText());
		}
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		
		click("xpath", "//a[text()='Compatible Browser']");
		sleep(3000);
		driver.quit();
		
	}

}
