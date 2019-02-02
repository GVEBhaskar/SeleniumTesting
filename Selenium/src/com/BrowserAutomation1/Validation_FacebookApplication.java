package com.BrowserAutomation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_FacebookApplication {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		
		String url = "http://facebook.com";
		driver.get(url);
		
		String expected_url="facebook.com";
		System.out.println("The Client Expected URL is: "+expected_url);
		
		String actual_url=driver.getCurrentUrl();
		System.out.println("The actual url on the Browser is: "+actual_url);
		
		if (actual_url.contains(expected_url))
		{
			System.out.println("URL matched-Successfully Launched Facebook HomePage-PASS");
		}
		else
		{
			System.out.println("URL mismatched-FAIL");
		}

	}

}
