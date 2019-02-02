package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingCompleteData {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		
		String url = "https://www.timeanddate.com/worldclock/";
		driver.get(url);
		driver.manage().window().maximize();
		
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		
		String Part1 = "html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String Part2 = "]/td[";
		String Part3 = "]/a";
		
		for (int i=1; i<=37; i++)
		{
			for (int j=0; j<=8; j++)
			{
				String data=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[i]/td[j]/a")).getText();
				//String data=driver.findElement(By.xpath(Part1+i+Part2+j+Part3)).getText();
				System.out.println(data+" ");
			}
			System.out.println();
		}
		driver.quit();

	}

}
