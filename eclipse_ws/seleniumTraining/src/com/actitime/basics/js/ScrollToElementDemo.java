package com.actitime.basics.js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.actitime.basics.utils.ActitimeUtils;

public class ScrollToElementDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp("http://formy-project.herokuapp.com/scroll");
		ActitimeUtils.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", ActitimeUtils.getElement("id", "name"));
		
		
		
		
	}
}
