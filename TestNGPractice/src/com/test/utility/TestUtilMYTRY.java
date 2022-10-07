package com.test.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.excel.lib.util.Xls_Reader;


public class TestUtilMYTRY {
	static Xls_Reader reader;
	public static void main(String[] args) throws IOException {
	//public static ArrayList<Object[]> getDataFromExcel() throws IOException {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		File file = new File("E:\\eclipseWorkspace\\TestNGPractice\\TestData\\HalfEbayTestData.xlsx");
		FileInputStream fis = new FileInputStream(file); 
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("RegTestData"); 
		 int rowCount=sheet.getLastRowNum()- sheet.getFirstRowNum();
		 System.out.println("rowCount ==> "+rowCount);
		 Row row = sheet.getRow(0);
		 int colCount=row.getLastCellNum();
		 System.out.println("colCount ==> "+colCount);
		 for(int rowNum=1; rowNum<=colCount;rowNum++) {
			 for(int colNum=0; colNum<=rowCount;colNum++) {
			String firstname=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			String lastname=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("Data from row " +rowNum +" First names are " +firstname);
			Object obj[]= {firstname,lastname};
			myData.add(obj);
			
		 }
		 }
		 System.out.println("arraylist ======>"+myData);
		 wb.close();
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//return myData;
		
	}

}
