package com.getPageSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_FindingAnElement_RoBo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		
		String url = "http://facebook.com";
		driver.get(url);
		driver.manage().window().maximize();
		String pageSource = driver.getPageSource();
		if (pageSource.contains("Login"))
		{
			System.out.println("Element Existing");
		}
		else
		{
			System.out.println("Element not found");
		}

	}

}



