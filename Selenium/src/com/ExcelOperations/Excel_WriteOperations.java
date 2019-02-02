package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperations {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Dell 5570\\Desktop\\Bhaskar_Selenium\\Selenium\\src\\ExcelTestDataFiles\\SingleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		Row r=sheet.createRow(2);
		Cell c=r.createCell(5);
		c.setCellValue("Raja");
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\Dell 5570\\Desktop\\Bhaskar_Selenium\\Selenium\\src\\ExcelTestDataFiles\\SingleTestData.xlsx");
		workBook.write(file1);
		
	}

}
