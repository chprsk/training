package com.actitime.basics.popup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.actitime.basics.utils.ActitimeUtils;

public class FileUploadPopUpDemo {

	
	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("D:\\Intellipaat\\Intellipaat_09_Feb\\autoit\\FileUploadPopUp.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 WebDriver driver =  ActitimeUtils.getMyDriver();
		 ActitimeUtils.launchApp("http://formy-project.herokuapp.com/fileupload");
		 
		 ActitimeUtils.click("id", "file-upload-field");
	}
}
