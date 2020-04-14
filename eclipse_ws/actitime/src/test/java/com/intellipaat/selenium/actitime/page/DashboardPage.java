package com.intellipaat.selenium.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage {

	
	WebDriver driver = null;
	
	@FindBy(id = "logoutLink")
	WebElement logoutLink;
	
	@FindBy(xpath = "//div[text()='TASKS']/parent::a")
	WebElement tasksLink;
	
	
	
	public void logout()
	{
		System.out.println("logging out of the application");
		logoutLink.click();
	}
	
	public void validateDashBoardTitle()
	{
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	}
	
	
	public DashboardPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnTasks()
	{
		tasksLink.click();
	}
	
	
	
	
}
