package com.actitime.basics.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.basics.utils.ActitimeUtils;

public class BaseClass 
{
	public static WebDriver driver = null;
	@BeforeTest
	public void setup()
	{
		driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp();
	}
	
	
	@AfterTest
	public void cleanUp()
	{
		driver.close();
		driver = null;
	}

	@Parameters({"username" , "password"})
	@BeforeClass
	public void login(String un, String pwd)
	{
		ActitimeUtils.login(un, pwd);
	}
	
	@AfterClass
	public void logout()
	{
		ActitimeUtils.logout();
	}
	









}
