package com.actitime.basics.popup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.actitime.basics.utils.ActitimeUtils;

public class FileDownloadPopUp {

	
	public static void main(String[] args) throws IOException
	{
		
		WebDriver driver = ActitimeUtils.getMyDriver("ff");
		ActitimeUtils.launchApp("https://www.selenium.dev/downloads/");
		ActitimeUtils.click("xpath", "//a[contains(text(),'64 bit Windows IE')]");
		ActitimeUtils.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\Intellipaat\\Intellipaat_09_Feb\\autoit\\FileDonloadUsingAutoIt.exe");
		
	}
}
