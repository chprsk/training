package com.actitime.basics.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.actitime.basics.utils.ActitimeUtils;

public class ValidateTasksPageUsingTestNG extends BaseClass
{

	
	@Test
	public void validateTasks()
	{
		ActitimeUtils.enterModule("tasks");
		ActitimeUtils.validateTitle("JUNLKKKK");
		
		
	}
	
	
	
	
	
}
