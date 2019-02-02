package com.NewTours_Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_HomePage_LinksCount 
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		
		WebDriver driver = null;
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("Vacations")).click();
		//driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();
		driver.quit();
	}

}
