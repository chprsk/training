package com.actitime.basics.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.actitime.basics.utils.ActitimeUtils;

public class FileDownloadUsingCapabalities {

	public static void main(String[] args) {
		
		FirefoxProfile fp =  new FirefoxProfile();
		fp.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		fp.setPreference("browser.download.folderList", 2);
	//	fp.setPreference("browser.download.useDownloadDir", false);
		fp.setPreference("browser.download.dir", "D:\\Intellipaat\\Intellipaat_09_Feb\\autoit\\");
		
		/*
		 *  0 - Automatically it downloads to desktop
		 *  1 - Automatically it downloads to download dir
		 *  2 - Automatically it downloads to any specfic folder
		 */
		
		FirefoxOptions options =  new FirefoxOptions();
		options.setProfile(fp);
	
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver(options);
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//a[contains(text(),'64 bit Windows IE')]")).click();;//("xpath", "//a[contains(text(),'64 bit Windows IE')]");
		ActitimeUtils.sleep(3000);
		
		
		
	}
	
	
	
}
