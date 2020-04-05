package com.actitime.basics.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.actitime.basics.testng.TestData;
import com.actitime.basics.utils.ActitimeUtils;

public class CreateCustomerUsingTestNGDataProvider extends BaseClass
{
	@Test
	public void preConditionToCreateCustomer()
	{
		ActitimeUtils.enterModule("tasks");
	}
	
	@Test(dependsOnMethods = "preConditionToCreateCustomer" ,dataProviderClass = TestData.class,dataProvider = "customerData")
	public void createCustomer(Integer index, String cn, String cd)
	{
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.createCustomer(cn,cd);
	}
	
	
	
	
	
	
	
	
}
