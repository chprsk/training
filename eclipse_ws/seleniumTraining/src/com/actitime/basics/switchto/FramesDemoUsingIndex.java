package com.actitime.basics.switchto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.actitime.basics.utils.ActitimeUtils;

public class FramesDemoUsingIndex {

	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame(ActitimeUtils.getElement("xpath", "//iframe[@class='demo-frame']"));
		WebElement srcElement = ActitimeUtils.getElement("id", "draggable");
		WebElement destElement = ActitimeUtils.getElement("id", "droppable");
		
		Actions act = new Actions(driver);
		System.out.println("Berfore performing drag and drop");
		System.out.println("Src Element Text " + srcElement.getText());
		System.out.println("Dest Element Text " + destElement.getText());
		
		
		act.dragAndDrop(srcElement, destElement).perform();
		
		
		System.out.println("After performing drag and drop");
		System.out.println("Src Element Text " + srcElement.getText());
		System.out.println("Dest Element Text " + destElement.getText());
		
		driver.switchTo().defaultContent();
		ActitimeUtils.click("xpath", "//a[text()='Draggable']");
		
		
		
		
		
	}
}
