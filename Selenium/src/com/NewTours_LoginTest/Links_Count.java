package com.NewTours_LoginTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Count {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url = "http://newtours.demoaut.com";
		driver.get(url);
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int links_count=links.size();
		System.out.println("The total no of links on the HomePage is: "+links_count);
		
		for (int i=0; i<links_count; i++)
		{
			//String LinkName=links.get(i).getText();
			System.out.println(i+" "+links.get(i).getText());
		}

	}

}
