package com.actitime.basics.testng;

import org.testng.annotations.Test;

public class OrderOfExecutionUsingPriority {

	
	@Test(priority = 1)
	public void launch()
	{
		System.out.println("launch");
		
	}
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("login");
		
	}
	
	@Test(priority = 3)
	public void createCustomer()
	{
		System.out.println("createCustomer");
		
	}
	
	@Test(priority = 4)
	public void logout()
	{
		System.out.println("logout");
		
	}
	
	
}
