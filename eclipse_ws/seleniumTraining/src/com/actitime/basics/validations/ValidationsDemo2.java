package com.actitime.basics.validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.actitime.basics.utils.ActitimeUtils;

public class ValidationsDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp("http://formy-project.herokuapp.com/enabled");
			
		ActitimeUtils.type("id", "input", "Helloooooooooooooooooo");
		ActitimeUtils.type("id", "disabledInput", "Helloooooooooooooooooo");
		
		
		
	}

}