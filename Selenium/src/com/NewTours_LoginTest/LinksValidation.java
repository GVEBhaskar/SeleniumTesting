package com.NewTours_LoginTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksValidation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Bhaskar_Selenium\\Selenium\\driverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url = "http://newtours.demoaut.com";
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linkscount=links.size();
		System.out.println("Total no of Links: "+linkscount);
		
		for (int i=0; i<linkscount; i++)
		{
			System.out.println(i+" "+links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
		}
		
	}

}
