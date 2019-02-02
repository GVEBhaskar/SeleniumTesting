package com.IsSelected;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_Country_IsSelected {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url = "http://www.newtours.demoaut.com";
		driver.get(url);
		
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country=driver.findElement(By.name("country"));
		List <WebElement> Countries=country.findElements(By.tagName("option"));
		int country_count=Countries.size();
		System.out.println("Tot no of countries are: "+country_count);
		
		for (int i=0; i<country_count; i++)
		{
			Countries.get(i).click();
			if (Countries.get(i).isDisplayed())
			{
				String Country_Name=Countries.get(i).getText();
				System.out.println(i+" "+Country_Name);
				if (Countries.get(i).isSelected())
				{
					System.out.println("Element Active");
				}
				else
				{
					System.out.println("Element Not Active");
				}
			}
		}
		driver.quit();

	}

}
