package com.actitime.basics;

import java.util.Date;

public class Dummy {

	
	
	public static void main(String[] args) {
		
		Date date  = new Date();
		System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
	}
	
	/*
	 * public static void main(String[] args) throws IOException {
	 * 
	 * File file = new File("data\\TestData.xls"); FileInputStream fis = new
	 * FileInputStream(file);
	 * 
	 * Workbook wb = WorkbookFactory.create(fis);
	 * 
	 * int totalSheets = wb.getNumberOfSheets();
	 * 
	 * System.out.println("total sheets " + totalSheets);
	 * 
	 * for(int i =0 ; i < totalSheets ; i++) {
	 * System.out.println(wb.getSheetName(i)); }
	 * 
	 * Sheet sheet = wb.getSheet("cusotmer");
	 * 
	 * int lastRowNum = sheet.getLastRowNum() + 1;
	 * 
	 * System.out.println("Rowcount "+ lastRowNum);
	 * 
	 * 
	 * for (int i = 0; i < lastRowNum; i++) { Row row = sheet.getRow(i);
	 * 
	 * Cell col1 = row.getCell(0); Cell col2 = row.getCell(1);
	 * 
	 * System.out.println("| " + col1 +" | " + col2 + " |");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * private static void getmypropvalue(String key) throws FileNotFoundException,
	 * IOException { File file = new File("data\\config.properties");
	 * FileInputStream fis = new FileInputStream(file); Properties props = new
	 * Properties();
	 * 
	 * props.load(fis);
	 * 
	 * System.out.println(props.getProperty(key));
	 * 
	 * 
	 * 
	 * fis.close(); }
	 */
}
