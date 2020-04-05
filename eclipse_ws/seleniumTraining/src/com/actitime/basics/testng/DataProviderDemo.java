package com.actitime.basics.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderDemo {
 @Parameters({"username","password","browser"})
 @BeforeClass
 public void login(String un, String pwd,String browser)
 {
	 System.out.println("---- Login with - " + un + " and " + pwd);
 }
	
  @Test(dataProviderClass = TestData.class, dataProvider = "customerData")
  public void createCustome(Integer index, String cn, String cd) 
  {
	  System.out.println("Test Execution with data " + index + " - " + cn + " - " + cd);
  }

  @AfterClass
  public void logout()
  {
	  System.out.println("---- Logout ----");
  }
  
}
