package com.actitime.basics.validations;

import org.openqa.selenium.WebDriver;

import com.actitime.basics.utils.ActitimeUtils;

public class DisplayDemo 
{
	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp("file:///D:/Intellipaat/Intellipaat_09_Feb/html/tiimeout.html");
		ActitimeUtils.click("tagname", "button");
		
		ActitimeUtils.getElement("id", "demo");
	}

}
