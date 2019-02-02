package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultiTestData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\src\\com\\ExcelTestDataFiles\\MultipleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		for (int i =0; i<=rowCount; i++)
		{
			Row r=sheet.getRow(i);
			int cellCount=r.getLastCellNum();
			for (int j=0; j<cellCount; j++)
			{
				Cell c=r.getCell(j);
				String data=c.getStringCellValue();
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}

}
