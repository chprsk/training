package com.actitime.basics.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void enterModule(String name)
	{
		System.out.println("clicking on module " + name);
		switch (name.toUpperCase()) {
		case "TASKS":
			driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
			break;
		case "USERS":
			driver.findElement(By.xpath("//div[text()='USERS']/parent::a")).click();
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
		
	}
	
	
	public static void createCustomer(String customerName,String customerDesc)
	{
		System.out.println("--- Creating Customer ---" + customerName + " and " + customerDesc);
		
		type("id", "customerLightBox_nameField", customerName);
		type("id","customerLightBox_descriptionField",customerDesc);
		click("id", "customerLightBox_commitBtn");
		
		
		
	}
	
	public static void logout()
	{
		System.out.println("--- Logout of Actitime ");
		click("id", "logoutLink");
		driver.close();
		driver = null;
			
	}
	
	
	
	
	
	
	
	
	
}
