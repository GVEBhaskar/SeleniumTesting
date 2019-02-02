package com.BrowserAutomation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\MicrosoftWebDriver.exe");
		
		WebDriver driver=null;
		
		driver=new EdgeDriver();
		String url=("facebook.com");
		driver.get(url);
		
		

	}

}
