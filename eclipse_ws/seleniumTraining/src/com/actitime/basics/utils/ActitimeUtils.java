package com.actitime.basics.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends DriverUtils
{

	/***
	 * Login utility to perform login operation
	 * @author Aravind
	 * @param un => username to login
	 * @param pwd => password to login 
	 */
	public static void login(String un, String pwd)
	{
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		sleep(5000);
		validateTitle("actiTIME - Enter Time-Track");
	}
	
	
	public static void enterModule(String name)
	{
		System.out.println("clicking on module " + name);
		switch (name.toUpperCase()) {
		case "TASKS":
			driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
			sleep(2000);
			validateTitle("actiTIME - Task List");
			break;
		case "USERS":
			driver.findElement(By.xpath("//div[text()='USERS']/parent::a")).click();
			validateTitle("actiTIME - User List");
			break;

		default:
			System.out.println("Please contact, Automation Team to support new module ");
			break;
		}
		
	}
	
	
	public static void clickOnNewCustomerButton()
	{
		//driver.findElement(By.xpath("//div[text()='Add New']/parent::div")).click();
		System.out.println("--- clicking on New Customer Button ----");
		click("xpath", "//div[text()='Add New']/parent::div");
		click("xpath", "//div[contains(text(),'New Customer')]");
		
		if(getElement("id", "customerLightBox").isDisplayed())
		{
			System.out.println("##############################[step pass] -- Create customer Pop-up is displayed");
		}
		else
		{
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$[step fail] -- Create customer Pop-up is NOT displayed");
		}
	}
	
	
	public static void createCustomer(String customerName,String customerDesc)
	{
		System.out.println("--- Creating Customer ---" + customerName + " and " + customerDesc);
		
		type("id", "customerLightBox_nameField", customerName);
		type("id","customerLightBox_descriptionField",customerDesc);
		click("id", "customerLightBox_commitBtn");
		System.out.println("Waiting for Success Toast Message to appear---");
		validateToastMessageUsingWebDriverWait();

	}


	private static void validateToastMessageUsingWebDriverWait() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement successToastMsg = wait.until(ExpectedConditions.visibilityOf(getElement("xpath", "//div[@class='toast']")));
		System.out.println("Success message is displayed..." + successToastMsg.getText());

		System.out.println("Waiting for success message to disappear");
		wait.until(ExpectedConditions.invisibilityOf(getElement("xpath", "//div[@class='toast']")));
		System.out.println("Success Toast message is disappeared");
	}
	
	public static void logout()
	{
		System.out.println("--- Logout of Actitime ");
		click("id", "logoutLink");
//		driver.close();
//		driver = null;
			
	}
	
	
	
	
	
	
	
	
	
}
