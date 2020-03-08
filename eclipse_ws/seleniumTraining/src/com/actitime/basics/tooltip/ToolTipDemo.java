package com.actitime.basics.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.actitime.basics.utils.DriverUtils;

public class ToolTipDemo {

	public static void main(String[] args) {
		System.out.println("--- Welcome to tooltip Demo ---");
		WebDriver driver = DriverUtils.getMyDriver();
		driver.get("https://www.google.com/");
		
		String toolTip = driver.findElement(By.xpath("//a[@class='gb_D gb_pc']")).getAttribute("title");
		System.out.println(toolTip);
		if(toolTip.equals("Google apps"))
		{
			System.out.println("PASSED - Tool tip is matched");
		}
		else
		{
			System.out.println("FAILED - Expected tool tip is Google apps but found " + toolTip);
		}

	}

}
