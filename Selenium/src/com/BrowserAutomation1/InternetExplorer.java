package com.BrowserAutomation1;


import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("basubsc");

	}

}
