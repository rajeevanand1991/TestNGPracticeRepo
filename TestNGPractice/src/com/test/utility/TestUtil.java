package com.test.utility;

import java.util.ArrayList;

import com.excel.lib.util.Xls_Reader;

public class TestUtil {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("E:\\eclipseWorkspace\\TestNGPractice\\TestData\\HalfEbayTestData.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("RegTestData"); rowNum++) {
			String firstname = reader.getCellData("RegTestData", "firstname", rowNum);
			String lastname = reader.getCellData("RegTestData", "lastname", rowNum);
			Object obj[] = { firstname, lastname };
			myData.add(obj);
		}
		return myData;
	}
}
