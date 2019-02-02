package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		
		String url = "https://www.timeanddate.com/worldclock/";
		driver.get(url);
		driver.manage().window().maximize();
		
		///html/body/div[1]/div[6]/section[1]
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]"));
		List <WebElement> rows=table.findElements(By.tagName("tr"));
		int rows_count = rows.size();
		System.out.println("The Total No of rows in the table: "+rows_count);
		
		for (int i=0; i<rows_count; i++)
		{
			List <WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			int colscount= cols.size();
			System.out.println("The Tot no of columns in the table are: "+colscount);
			
			for (int j=0; j<colscount; j++)
			{
				String data=cols.get(j).getText();
				System.out.println(data+" ");
			}
			System.out.println();
		}

	}

}
