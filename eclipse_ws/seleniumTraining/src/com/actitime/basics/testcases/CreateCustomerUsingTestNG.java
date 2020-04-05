package com.actitime.basics.testcases;

import org.testng.annotations.Test;

import com.actitime.basics.utils.ActitimeUtils;

public class CreateCustomerUsingTestNG extends BaseClass
{

	@Test
	public void test()
	{
		ActitimeUtils.enterModule("tasks");
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.createCustomer("TestNg-Feb-09-Customer-1", "TestNg-Feb-09-Customer-Desc-1");
	}
	
	
	
	
	
	
	
	
}
