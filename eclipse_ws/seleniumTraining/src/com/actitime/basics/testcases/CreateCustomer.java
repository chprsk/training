package com.actitime.basics.testcases;

import org.openqa.selenium.WebDriver;

import com.actitime.basics.utils.ActitimeUtils;

public class CreateCustomer {

	
	public static void main(String[] args)
	{
		System.out.println(" --- Customer Creation --- ");
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp();
		ActitimeUtils.login("admin","manager");
		ActitimeUtils.enterModule("tasks");
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.createCustomer("Feb-Batch_Customer12", "Feb-Batch_Customer12_Desc");
		ActitimeUtils.logout();
		
		
	}
	
}
