package com.intellipaat.selenium.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver  = null;
	
	@FindBy(id = "username")
	WebElement usernameTxtBox;
	
	@FindBy(name = "pwd")
	WebElement passwordTxtBox;
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	
	public void login(String un,String pwd)
	{
		usernameTxtBox.sendKeys(un);
		passwordTxtBox.sendKeys(pwd);
		loginButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void validateLoginTitle()
	{
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
	}
	
	
	public void launch(String url)
	{
		driver.get(url);
	}
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	
}
