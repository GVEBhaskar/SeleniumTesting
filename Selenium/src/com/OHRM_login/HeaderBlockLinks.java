package com.OHRM_login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HeaderBlockLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		
		String url = "http://localhost/orangehrm-2.6/login.php"; 
		driver.get(url);
		driver.manage().window().maximize();
		
		
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys("admin").perform();
	act.sendKeys(Keys.ENTER).perform();
	
	WebElement HeaderBlock=driver.findElement(By.id("top-menu"));
	List <WebElement> Links=HeaderBlock.findElements(By.tagName("a"));
	int Links_Count=Links.size();
	System.out.println("Total Links: "+Links_Count);
	
	for (int i = 0; i<Links_Count; i++)
	{
		System.out.println(i+" "+Links.get(i).getText());
		Links.get(i).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		HeaderBlock=driver.findElement(By.id("top-menu"));
		Links=HeaderBlock.findElements(By.tagName("a"));
	}

	}

}
