package com.actitime.basics.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrderOfExecutionUsingDependsOn {

	
	@Test
	public void launch()
	{
		Reporter.log("Executing launch Test  ");
		
	}
	
	@Test(dependsOnMethods = "launch")
	public void login()
	{
		Reporter.log("Executing login Test");
		
	}
	
	@Test(dependsOnMethods = { "login" , "launch"})
	public void createCustomer()
	{
		Reporter.log("Executing createCustomer Test");
		
	}
	
	@Test(dependsOnMethods = "createCustomer")
	public void logout()
	{
		Reporter.log("Executing logout Test");
		
	}
	
	
}
