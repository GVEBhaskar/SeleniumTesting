package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstColDataOfWebPage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		
		String url = "https://www.timeanddate.com/worldclock/";
		driver.get(url);
		driver.manage().window().maximize();
		
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]/a
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[3]/a
		
		String Part1 = "html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String Part2 = "]/td[1]/a";
		
		for (int i=1; i<=36; i++)
		{
			//String CityName=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[+i+]/td[1]/a")).getText();
			String CityName=driver.findElement(By.xpath(Part1+i+Part2)).getText();
			System.out.println(i+" "+"The City Name is: "+CityName);
		}

	}

}
