package com.intellipaat.selenium.actitime.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import com.intellipaat.selenium.actitime.page.DashboardPage;
import com.intellipaat.selenium.actitime.page.LoginPage;
import com.intellipaat.selenium.actitime.utils.GenericUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest  extends BaseReporter
{

	
	LoginPage loginPage = null;
	DashboardPage dashboardPage = null;
	
	@BeforeTest
	public void setup()
	{
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		dashboardPage =  new DashboardPage(driver);
	}
	
	@AfterTest
	public void cleanup()
	{
		driver.close();
		driver = null;
	}
	
	@Test(priority = 2)
	public void validLoginTest()
	{
		test = reports.startTest("-- valid login test ---");
		test.log(LogStatus.INFO	, "--- launching applicaiton---");
		driver.get("http://localhost/login.do");
		
		test.log(LogStatus.INFO	, "--- Logging  in to  applicaiton---");
		loginPage.login("admin", "manager");
		test.log(LogStatus.PASS	, "--- Login successfull applicaiton---");
		
		test.log(LogStatus.INFO	, "--- Vaidating Dashboard page ---");
		dashboardPage.validateDashBoardTitle();
		test.log(LogStatus.PASS	, "--- Vaidating Dashboard page success ---");
	
		test.log(LogStatus.INFO	, "--- performing logout ---");
		dashboardPage.logout();
		test.log(LogStatus.PASS	, "--- logout successfull---");
		
		reports.endTest(test);
		
	}
	
	@Test(priority = 1)
	public void invalidLoginTest()
	{
		test = reports.startTest("-- in valid login test ---");
		test.log(LogStatus.INFO	, "--- launching applicaiton---");
		driver.get("http://localhost/login.do");
		
		test.log(LogStatus.INFO	, "--- Logging  in to  applicaiton---");
		loginPage.login("admin1", "manager1");
		test.log(LogStatus.PASS	, "--- Login un successfull applicaiton---");
		
		test.log(LogStatus.INFO	, "--- Vaidating Login page ---");
		dashboardPage.validateDashBoardTitle();
		test.log(LogStatus.PASS, "--- Validating title successful---");
		reports.endTest(test);
	}
	
	
}
