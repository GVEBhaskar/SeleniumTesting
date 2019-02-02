package com.BrowserAutomation1;

import org.openqa.selenium.opera.OperaDriver;

public class Opera {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\operadriver.exe");
		OperaDriver driver = new OperaDriver();
		driver.get("http://facebook.com");
		

	}

}
