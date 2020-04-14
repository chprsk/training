package com.intellipaat.selenium.actitime.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.intellipaat.selenium.actitime.utils.GenericUtils;

public class TasksPage {

	WebDriver driver = null;
	//constructor
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	

	// Page Properties
	@FindBy(xpath = "//div[@id='cpTreeBlock']//input")
	WebElement serachBox;
	
	@FindBy(xpath = "//div[@class='filteredContainer']//div[@class='node customerNode notSelected']")
	WebElement searchResult;
	
	@FindBy(xpath = "//div[@class='filteredContainer']//div[@class='node customerNode notSelected']//div[@class='editButton available']")
	WebElement gearIcon;
	
	@FindBy(xpath = "//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='actions']")
	WebElement actionsButton;
	
	@FindBy(xpath = "//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='deleteButton']")
	WebElement deleteButton;
	
	@FindBy(id = "customerPanel_deleteConfirm_submitTitle")
	WebElement deletePermanently;
	
	@FindBy(xpath = "//div[@class='toast']")
	WebElement toastMsg;
	
	
	//Methods
	
	public void search(String name)
	{
		serachBox.sendKeys(name);
	}
	
	public void selectCustomerFromSearchResult()
	{
		Actions act = new Actions(driver);
		GenericUtils.sleep(3000);
		act.moveToElement(searchResult).perform();
		GenericUtils.sleep(3000);
		act.click(gearIcon).perform();
		GenericUtils.sleep(3000);
		
	}
	
	public void clickOnActions()
	{
		actionsButton.click();
	}
	
	private void validateToastMessageUsingWebDriverWait() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		WebElement successToastMsg = wait.until(ExpectedConditions.visibilityOf(toastMsg));
		System.out.println("Success message is displayed..." + successToastMsg.getText());
		toastMsg = driver.findElement(By.xpath("//div[@class='toast']"));
		System.out.println("Waiting for success message to disappear");
		wait.until(ExpectedConditions.invisibilityOf(toastMsg));
		System.out.println("Success Toast message is disappeared");
	}
	public void deleteCustomerAndValidateSuccessMsg()
	{
		deleteButton.click();
		deletePermanently.click();
		validateToastMessageUsingWebDriverWait();
		serachBox.clear();
		
	}
	
}
