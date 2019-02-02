package com.OHRMTestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.OHRMLib.LogInKeywords;

public class LogInTest 
{
	@Test
	public void LogIn() throws IOException
	{
		LogInKeywords keys = new LogInKeywords();
		FileInputStream file = new FileInputStream(".\\src\\comm\\ExcelTestDataFiles\\KeywordDriven.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		Row r = null;
		int rowCount=ws.getLastRowNum();
		for (int i=1; i<=rowCount; i++)
		{
			r=ws.getRow(i);
			String runMode=r.getCell(4).getStringCellValue();
			if (runMode.equals("y"))
			{
				String keyword=r.getCell(3).getStringCellValue();
				if (keyword.equals("launchBrowser"))
				{
					keys.launchBrowser();
				}
				else if (keyword.equals("navigate"))
				{
					keys.navigate();
				}
				else if (keyword.equals("enterUsername"))
				{
					keys.enterUsername();
				}
				else if (keyword.equals("enterPassword"))
				{
					keys.enterPassword();
				}
				else if (keyword.equals("clicklogin"))
				{
					keys.enterLogin();
				}
			}
		}
	}

}
