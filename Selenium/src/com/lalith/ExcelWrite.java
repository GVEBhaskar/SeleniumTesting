package com.lalith;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("‪C:\\Users\\Dell 5570\\Desktop\\lalith.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
	    Row	r=sheet.createRow(2);
	    Cell c=r.createCell(5);
	    c.setCellValue("selenium");
	    
	    FileOutputStream file1 = new FileOutputStream("‪C:\\Users\\Dell 5570\\Desktop\\lalith.xlsx");
		workbook.write(file1);

	}

}
