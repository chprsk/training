package com.intellipaat.selenium.actitime.utils;

import java.util.Date;

public class GenericUtils {

	
	public static void sleep(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static String dateAndTime()
	{
		String date_and_time = null;
		Date date = new Date();
		date_and_time = date.toString().replace(" ", "_").replace(":", "_");
		return date_and_time;
	}
}
