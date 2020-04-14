package com.intellipaat.selenium.actitime.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.intellipaat.selenium.actitime.page.DashboardPage;
import com.intellipaat.selenium.actitime.page.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTestUsingGrid  extends BaseReporter
{

	String nodeUrl  = "http://192.168.0.105:5556/wd/hub";
	LoginPage loginPage = null;
	DashboardPage dashboardPage = null;
	
	@BeforeTest
	public void setup() throws MalformedURLException
	{
	
//		ChromeOptions options = new ChromeOptions();
//		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
//		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
//		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		options.addArguments("disable-infobars");
		
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("browserName", "firefox");
		options.addPreference("browserversion", "55.0.2");
		options.addPreference("network.proxy.type", 0);
		options.setAcceptInsecureCerts(true);
		
		driver = new RemoteWebDriver(new URL(nodeUrl),options);
		
		
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
