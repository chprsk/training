package com.actitime.basics.testcases;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.actitime.basics.utils.ActitimeUtils;
import com.actitime.basics.utils.FileHandler;

public class CreateCustomerUsingExternalData {

	static String sheetName = "customer";
	public static void main(String[] args)
	{
		System.out.println(" --- Customer Creation --- ");
		String url = FileHandler.getPropertyValue("url");
		String userName = FileHandler.getPropertyValue("username");
		String password = FileHandler.getPropertyValue("password");
		
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp(url);
		ActitimeUtils.login(userName,password);
		ActitimeUtils.enterModule("tasks");
		
		int rowCount = FileHandler.getRowCount(sheetName);
		for (int i = 1; i < rowCount; i++)
		{
			String customerName = FileHandler.getMyCellValue(sheetName, i, 0);
			String customerDesc = FileHandler.getMyCellValue(sheetName, i, 1);
			ActitimeUtils.clickOnNewCustomerButton();
			ActitimeUtils.createCustomer(customerName,customerDesc);
		}
		
		
		ActitimeUtils.logout();
		
		
	}
	
}
