package com.actitime.basics.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.actitime.basics.utils.ActitimeUtils;

public class KeyboardActionsDemo 
{
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp();
		
		//1. Create and Object to Actions by passing your driver Object
		Actions act = new Actions(driver);
		act.sendKeys("admin").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("manager").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		
	  // some more kb actions
		act.doubleClick();
		act.contextClick();
		act.clickAndHold();
		act.release();
		
			
	}

}
