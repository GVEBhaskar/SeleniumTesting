package com.MouseHoverOperaton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url = "http://amazon.in";
		driver.get(url);
		WebElement helloSignIn = driver.findElement(By.id("nav-link-yourAccount"));
		Actions act=new Actions(driver);
		act.moveToElement(helloSignIn).perform();
		driver.findElement(By.xpath("//*[@id=\'nav-link-yourAccount\']/span[1]")).click();
	driver.close();	
	}
	

}
