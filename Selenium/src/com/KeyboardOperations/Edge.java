package com.KeyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Edge {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\MicrosoftWebDriver.exe");
		WebDriver driver = null;
		driver = new EdgeDriver();
		String url = "http://facebook.com";
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("basubsc85@gmail.com");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("GVEBhaskar").perform();
		act.sendKeys(Keys.ENTER).perform();

	}

}
