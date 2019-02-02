package com.BrowserAutomation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Validation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url = "http://bing.com";
		driver.get(url);
		
		//String expected_Tile = "Bing";
		String expected_Title="Bing";
		System.out.println("Te Expected Title of Bing HomePage is:"+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println("The Actual Title of Bing HomePage is :"+actual_Title);

		if (actual_Title.equals(expected_Title))
		{
			System.out.println("Title matched-Bing HomePage Successfully Opened - PASS");
		}
		else
		{
			System.out.println("Title not matched - FAIL");
		}
		driver.close();
	}

}
