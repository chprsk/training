package com.actitime.basics.testng;

import org.testng.annotations.DataProvider;

public class TestData 
{
	//Data provider for creating Customer
	@DataProvider
	  public Object[][] customerData() 
	  {
	    return new Object[][] {
	      new Object[] { 1, "customer-dp-1", "customer-dp-desc-1" },
	      new Object[] { 2, "customer-dp-2", "customer-dp-desc-2" },
	      new Object[] { 3, "customer-dp-3", "customer-dp-desc-3" },
	      new Object[] { 4, "customer-dp-4", "customer-dp-desc-4" },
	      new Object[] { 5, "customer-dp-5", "customer-dp-desc-5" },
	      new Object[] { 6, "customer-dp-6", "customer-dp-desc-6" },
	    };
	  }

}
