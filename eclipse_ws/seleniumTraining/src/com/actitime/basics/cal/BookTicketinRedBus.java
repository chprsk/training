package com.actitime.basics.cal;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.actitime.basics.utils.ActitimeUtils;

public class BookTicketinRedBus {
	static WebDriver driver = null;
	public static void main(String[] args) {
		
		driver = ActitimeUtils.getMyDriver("ff");
		ActitimeUtils.launchApp("https://www.redbus.in/");
		Actions act =  new Actions(driver);
		
		ActitimeUtils.type("id", "src", "Bangalore");
		act.sendKeys(Keys.ENTER).perform();
		ActitimeUtils.sleep(2000);
		
		ActitimeUtils.type("id", "dest", "Goa");
		act.sendKeys(Keys.ENTER).perform();
		ActitimeUtils.sleep(2000);
		
		selectDate("onward", 29);
		ActitimeUtils.sleep(2000);
		selectDate("return", 31);
				
	}
	/***
	 * 
	 * @param typeOfcal - onward, return
	 * @param date
	 */
	static void selectDate(String typeOfcal, int date)
	{
		if(typeOfcal.equals("onward"))
		{
			//ActitimeUtils.click("id", "onward_cal");
			Actions act = new Actions(driver);
			act.click(ActitimeUtils.getElement("id", "onward_cal")).perform();
			
			ActitimeUtils.click("xpath", "//div[@id='rb-calendar_onward_cal']//td[(@class='wd day' or @class='current day' or @class='we day') and text()='" + date +"']");
		}
		else
		{
			Actions act = new Actions(driver);
			act.click(ActitimeUtils.getElement("id", "return_cal")).perform();
			
			ActitimeUtils.click("xpath", "//div[@id='rb-calendar_return_cal']//td[(@class='wd day' or @class='current day' or @class='we day') and text()='" + date +"']");
			
		}
	}
	
	
	
}
