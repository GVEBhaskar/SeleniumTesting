package com.POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewToursHomePageTesting 
{
	WebDriver driver = null;
	String url="http://newtours.demoaut.com";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Bhaskar_Selenium\\Selenium\\driverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void homePage() throws IOException
	{
	WelcomeMercuryTours wmt=PageFactory.initElements(driver, WelcomeMercuryTours.class);
	
	wmt.SignOn();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	driver.navigate().back();
	
	wmt.Register();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	driver.navigate().back();
	
	FileInputStream file=new FileInputStream(".\\src\\ApplicationTestDataFiles\\POM.xlsx");
	XSSFWorkbook workBook=new XSSFWorkbook(file);
	XSSFSheet sheet=workBook.getSheet("Sheet1");
	
	int rowCount=sheet.getLastRowNum();
	for (int i=1; i<=rowCount; i++)
	{
		Row r=sheet.getRow(i);
		wmt.LogIn(r.getCell(0).getStringCellValue(), r.getCell(1).getStringCellValue());
		String expected_Title="Find";
		String actual_Title=driver.getTitle();
		
		if (actual_Title.contains(expected_Title))
		{
			r.createCell(2).setCellValue("LogIn Successful - PASS");;
		}
		else
		{
			r.createCell(2).setCellValue("LogIn Failed - FAIL");
		}
		driver.navigate().back();
		driver.navigate().refresh();
		FileOutputStream file1=new FileOutputStream(".\\src\\ApplicationTestDataFiles\\POM.xlsx");
		workBook.write(file1);
		
			
		}
	
	
	}	

}
