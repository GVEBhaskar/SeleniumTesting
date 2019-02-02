package com.BrowserAutomation1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver=null; 
		driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		String title=driver.getTitle();
		System.out.println("The Title of facebook HomePage is: "+title);

	}

}
