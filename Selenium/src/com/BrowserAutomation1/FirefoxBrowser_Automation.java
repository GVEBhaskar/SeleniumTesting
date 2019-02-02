package com.BrowserAutomation1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser_Automation {

	public static void main(String[] args)  
	
	{
		FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\geckodriver.exe");
	
		driver.get("http://bing.com");
		String title=driver.getTitle();
		System.out.println("The Title of Bing HomePage is: "+title);
		driver.close();
		
		
		
		
	}

}
