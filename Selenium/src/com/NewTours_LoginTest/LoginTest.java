package com.NewTours_LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\geckodriver.exe");
		WebDriver driver=null;
		driver=new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		
		String expected_HomePageTitle="Welcome: Mercury Tours";
		System.out.println("Expected Title of NewTours HomePage is: "+expected_HomePageTitle);
		
		String actual_HomePageTitle=driver.getTitle();
		System.out.println("Actual title of NewTours HomePage is: "+actual_HomePageTitle);
		
		if (actual_HomePageTitle.contains(expected_HomePageTitle))
		{
			System.out.println("NewTours HomePage Successfully Launched-PASS");
		}
		else
		{
			System.out.println("NewTours HomePage Failed to Launch-FAIL");
		}
		//driver.close();
		
		
	}

}
