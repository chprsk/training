package com.actitime.basics.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileHandler 
{
	static FileInputStream fis = null;
	static Workbook wb = null;
	public static String getPropertyValue(String key)
	{
		File file = null; 
		FileInputStream fis = null;
		Properties props = null;
		String value = null;
		try {
			file = new File("data\\config.properties");
			fis = new FileInputStream(file);
			props = new Properties();
			props.load(fis);
			value = props.getProperty(key);
			} 
		catch (IOException e) {
				System.out.println("Exception while Reading Properties File...");
		}
		finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value;
	}
	
	public static Workbook getWorkBook()
	{
		File file = new File("data\\TestData.xls");
		
		try {
			fis = new FileInputStream(file);
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wb;
	}
	
	public static Sheet getMySheet(String name)
	{
		Workbook wb = getWorkBook();
		Sheet sheet =  wb.getSheet(name);
		return sheet;
	}
	
	
	public static int getRowCount(String sheetName)
	{
		Sheet sh = getMySheet(sheetName); 
		return sh.getLastRowNum() + 1;
	}
	
	public static String getMyCellValue(String sheetName, int rowNumber, int columnNumber)
	{
		Sheet sh = getMySheet(sheetName);
		Row row  =  sh.getRow(rowNumber);
		Cell cell = row.getCell(columnNumber);
		
		return cell.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
				
}
