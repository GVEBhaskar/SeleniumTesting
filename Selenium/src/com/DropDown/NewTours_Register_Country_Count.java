package com.DropDown;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class NewTours_Register_Country_Count {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url = "http://newtours.demoaut.com";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country=driver.findElement(By.name("country"));
		//country.click();
		List<WebElement>Countries = country.findElements(By.tagName("option"));
		int Countries_Count=Countries.size();
		System.out.println("Total no. of Countries: "+Countries_Count);
		
		for (int i=0; i<Countries_Count; i++)
		{
			String Country_Name=Countries.get(i).getText();
			System.out.println(i+" "+Country_Name);
			
		}
	
	//driver.quit();
}

}
