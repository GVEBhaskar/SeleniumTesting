package com.NewTours_LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes_Newtours_Register_GetURL {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url = "http://newtours.demoaut.com";
		driver.get(url);
		driver.manage().window().maximize();
		
		String referanceUrl=driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		System.out.println("The referanceUrl of REGISTER Element is: "+referanceUrl);
		
		driver.findElement(By.linkText("REGISTER")).click();
		String actualUrl=driver.getCurrentUrl();
		System.out.println("The Register Element navigated WEB URL is: "+actualUrl);
		
		if (actualUrl.equals(referanceUrl))
		{
			System.out.println("Successfully navigated to Register Web Page - PASS");
		}
		else
		{
			System.out.println("Failed navigation to Register Web Page - FAIL");
		}
		

	}

}
