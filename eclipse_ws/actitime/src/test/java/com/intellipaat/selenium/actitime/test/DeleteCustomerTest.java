package com.intellipaat.selenium.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.intellipaat.selenium.actitime.page.DashboardPage;
import com.intellipaat.selenium.actitime.page.LoginPage;
import com.intellipaat.selenium.actitime.page.TasksPage;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteCustomerTest extends BaseReporter
{

	WebDriver driver = null;
	LoginPage loginPage = null;
	DashboardPage dashboardPage = null;
	TasksPage tasksPage = null;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		dashboardPage =  new DashboardPage(driver);
		tasksPage = new TasksPage(driver);
		
	}
	
	@AfterTest
	public void cleanup()
	{
		driver.close();
		driver = null;
	}
	
	//@Parameters("url")
	@Test
	public void deleteCustomer()
	{
		test = reports.startTest("-- Deleting a costumer ---");
		test.log(LogStatus.INFO	, "--- launching applicaiton---");
		driver.get("http://localhost/login.do");
		
		test.log(LogStatus.INFO	, "--- Logging  in to  applicaiton---");
		loginPage.login("admin", "manager");
		test.log(LogStatus.PASS	, "--- Login successfull applicaiton---");
		
		test.log(LogStatus.INFO	, "--- Vaidating Dashboard page ---");
		dashboardPage.validateDashBoardTitle();
		test.log(LogStatus.PASS	, "--- Vaidating Dashboard page success ---");
		
		test.log(LogStatus.INFO	, "--- Clicking on tasks ---");
		dashboardPage.clickOnTasks();
		
		test.log(LogStatus.INFO	, "--- Searching Customer ---");
		tasksPage.search("Customer");
		
		test.log(LogStatus.INFO	, "--- Selecting a customer ---");
		tasksPage.selectCustomerFromSearchResult();
		
		test.log(LogStatus.INFO	, "--- Clicking on delete ---");
		tasksPage.clickOnActions();
		
		test.log(LogStatus.INFO	, "--- Delete customer and validate success message ---");
		tasksPage.deleteCustomerAndValidateSuccessMsg();
		test.log(LogStatus.PASS	, "--- Delete customer and validate success message ---");
		
		test.log(LogStatus.INFO	, "--- Logout ---");
		dashboardPage.logout();
		
		reports.endTest(test);
		
	}
	
	
	
	
	
	
	
	
}
