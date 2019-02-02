package com.KeyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class Firefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\geckodriver.exe");
		WebDriver driver = null;
		driver = new FirefoxDriver();
		String url = "http://facebook.com";
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("basubsc85@gmail.com");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("GVEBhaskar").perform();
		act.sendKeys(Keys.ENTER).perform();
		

	}

}
