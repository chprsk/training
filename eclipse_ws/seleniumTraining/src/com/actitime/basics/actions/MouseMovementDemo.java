package com.actitime.basics.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.basics.utils.ActitimeUtils;

public class MouseMovementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp("https://www.flipkart.com/");
		
		WebDriverWait wait =  new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(ActitimeUtils.getElement("xpath", "//button[@class='_2AkmmA _29YdH8']"))).click();
		
		WebElement moreEle = ActitimeUtils.getElement("xpath", "//div[@class='_2aUbKa']");
		WebElement electronicsTab = ActitimeUtils.getElement("xpath", "//span[text()='Electronics']");
		WebElement menTab = ActitimeUtils.getElement("xpath", "//span[text()='Men']");
		WebElement womenTab = ActitimeUtils.getElement("xpath", "//span[text()='Women']");
		WebElement hfTab = ActitimeUtils.getElement("xpath", "//span[text()='Home & Furniture']/parent::li");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(hfTab).perform();
		Thread.sleep(2000);
		act.moveToElement(womenTab).perform();
		Thread.sleep(2000);
		act.moveToElement(electronicsTab).perform();
		Thread.sleep(2000);
		act.moveToElement(moreEle).perform();
		Thread.sleep(2000);
		act.moveToElement(menTab).perform();
		Thread.sleep(2000);
		act.moveToElement(hfTab).perform();
		Thread.sleep(2000);

		
		
		
			
	}
}
