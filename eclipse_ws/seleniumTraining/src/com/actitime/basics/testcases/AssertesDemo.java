package com.actitime.basics.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertesDemo {

	
	@Test
	public void sum()
	{
		SoftAssert sa  = new SoftAssert();
		int a  = 10;
		int b  = 20;
		
		int c  = 35;
		
		sa.assertEquals((a+b), c);
		System.out.println("Test completed");
		sa.assertEquals((a+b), 30);
		
		System.out.println("Total execution is completed");
		sa.assertAll();
	}
	
	
	
}
