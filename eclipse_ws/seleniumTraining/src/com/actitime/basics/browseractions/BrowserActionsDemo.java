package com.actitime.basics.browseractions;

import org.openqa.selenium.WebDriver;

import com.actitime.basics.utils.DriverUtils;

public class BrowserActionsDemo {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverUtils.getMyDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
}
