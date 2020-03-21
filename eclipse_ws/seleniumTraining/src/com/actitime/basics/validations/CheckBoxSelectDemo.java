package com.actitime.basics.validations;

import org.openqa.selenium.WebDriver;

import com.actitime.basics.utils.ActitimeUtils;

public class CheckBoxSelectDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver =  ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp("http://formy-project.herokuapp.com/form");
		ActitimeUtils.sleep(5000);
		ActitimeUtils.selectCheckBox("id", "checkbox-1");
		ActitimeUtils.selectCheckBox("id", "checkbox-2");
		ActitimeUtils.selectCheckBox("id", "checkbox-3");
	}
}
