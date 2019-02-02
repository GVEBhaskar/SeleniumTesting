package com.OHRMLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInKeywords
{
	WebDriver driver = null;
	String url = "https://opensource-demo.orangehrmlive.com/";
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Bhaskar_Selenium\\Selenium\\driverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void navigate()
	{
		driver.get(url);
	}
	
	public void enterUsername()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	
	public void enterPassword()
	{
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	
	public void enterLogin()
	{
		driver.findElement(By.id("btnLogin")).click();
	}

}
