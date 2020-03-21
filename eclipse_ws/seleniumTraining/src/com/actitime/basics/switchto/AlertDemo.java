package com.actitime.basics.switchto;

import org.openqa.selenium.WebDriver;

import com.actitime.basics.utils.ActitimeUtils;

public class AlertDemo {
	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApp();
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.enterModule("tasks");
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.sleep(2000);
		ActitimeUtils.type("id", "customerLightBox_nameField","JUNK-TEST-CUSTOMER");
		ActitimeUtils.click("id", "customerLightBox_cancelBtn");
		ActitimeUtils.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		ActitimeUtils.sleep(2000);
		ActitimeUtils.type("id", "customerLightBox_descriptionField", "after clicking on cancel");
		ActitimeUtils.click("id", "customerLightBox_cancelBtn");
		ActitimeUtils.sleep(2000);
		driver.switchTo().alert().accept();
		
		ActitimeUtils.logout();
		
	}

}
