package com.automationproject.excelreader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fi= new FileInputStream("C:\\Users\\gurum\\Desktop\\Evening\\TestData.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet sh= wb.getSheet("Data");
		
		String username = sh.getRow(1).getCell(0).getStringCellValue();
		
		String password= sh.getRow(1).getCell(1).getStringCellValue();
		
		String username1= sh.getRow(2).getCell(0).getStringCellValue();
		
		String password1= sh.getRow(2).getCell(1).getStringCellValue();
		
		System.out.println("1st user data is ::"+username+" "+password);
		
		System.out.println("2nd user data is ::"+username1+" "+password1);
	}

}
