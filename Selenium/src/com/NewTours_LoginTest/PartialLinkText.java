package com.NewTours_LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url = "http://google.com";
		driver.get(url);
		//driver.findElement(By.linkText("Sign in")).click();
		WebElement SignIn=driver.findElement(By.partialLinkText("Sign"));
		SignIn.click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
