package com.ApplicationToExcelOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application_NewTourRegister_DropDown_Write_ExcelOperation {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url = "http://newtours.demoaut.com";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country=driver.findElement(By.name("country"));
		//country.click();
		List<WebElement>Countries = country.findElements(By.tagName("option"));
		int Countries_Count=Countries.size();
		System.out.println("Total no. of Countries: "+Countries_Count);
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\src\\com\\ExcelTestDataFiles\\TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		for (int i = 0; i<Countries_Count; i++)
		{
			String Country_Name=Countries.get(i).getText();
			System.out.println(i+" "+Country_Name);
			
			Row r=sheet.createRow(i);
			Cell c=r.createCell(0);
			c.setCellValue(Country_Name);
			
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\src\\com\\ExcelTestDataFiles\\TestData.xlsx");
			workBook.write(file1);
		}
		
		driver.close();
	}
}
