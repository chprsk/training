package com.actitime.basics.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.basics.utils.ActitimeUtils;

public class AssertsDemo {

	
	
	@Test
	public void validateAsserts()
	{
		WebDriver driver  = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp();
		ActitimeUtils.validateTitle("ASDFASDF");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.logout();
		
	}
}
