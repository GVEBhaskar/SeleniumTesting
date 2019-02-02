package com.RadioButtons_Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Echo_Echo_RadioButtons_Testing {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url = "http://www.echoecho.com/htmlforms10.htm";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radioButtons=block.findElements(By.name("group1"));
		//int radioButtons_Count=radioButtons.size();
		System.out.println(radioButtons.size());
		for (int i=0; i<radioButtons.size(); i++)
		{
			radioButtons.get(i).click();
			for (int p=0; p<radioButtons.size(); p++)
			{
				System.out.println(radioButtons.get(p).getAttribute("value")+" "+radioButtons.get(p).getAttribute("checked"));
			}
		}
	}

}
