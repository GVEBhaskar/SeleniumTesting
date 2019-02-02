package com.OHRM_login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LogIn_IdentifyTheLinks {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url = "http://localhost/orangehrm-2.6/login.php";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.className("button")).click();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linksCount=links.size();
		System.out.println("Tot no of links are: "+linksCount);
		
		for (int i=0; i<linksCount; i++)
		{
			//if (links.get(i).isDisplayed())
			//{
				//System.out.println(i+" "+links.get(i).getText());
			//}
			
			System.out.println(i+" "+links.get(i).getText());
		}
		//driver.quit();
	}

}
