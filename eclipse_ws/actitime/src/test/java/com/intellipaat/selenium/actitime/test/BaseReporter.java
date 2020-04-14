package com.intellipaat.selenium.actitime.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.internal.TestResult;

import com.intellipaat.selenium.actitime.utils.GenericUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseReporter {

	static WebDriver driver = null;
	static ExtentReports reports  = null;
	ExtentTest test = null;
	
	@BeforeSuite
	public void setupReports()
	{
		System.out.println("creating reports");
		reports = new ExtentReports("reports\\Test_Execution_report_" + GenericUtils.dateAndTime() + ".html");
		GenericUtils.sleep(5000);
	}
	
	
	@AfterSuite
	public void saveReports()
	{
		
		reports.flush();
		
	}
	
	@AfterMethod
	public void checkExecutionStatus(ITestResult result)
	{
		File file = new File("reports\\screenshots\\SS_"+GenericUtils.dateAndTime() + ".png");
		if(result.getStatus() == TestResult.FAILURE)
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			File ss = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(ss, new File(file.getAbsolutePath()));
				test.log(LogStatus.INFO, test.addScreenCapture(file.getAbsolutePath()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			test.log(LogStatus.FAIL, "test failed to execute");
			reports.endTest(test);
		}
	}
	
	
}
