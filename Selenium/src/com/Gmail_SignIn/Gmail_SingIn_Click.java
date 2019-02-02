package com.Gmail_SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_SingIn_Click 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("basubsc85");
		
		//<content class="CwaK9"><span class="RveJvd snByac">Next</span></content>
		driver.findElement(By.className("CwaK9")).click();
		
		//<input type="password" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="current-password" spellcheck="false" tabindex="0" aria-label="Enter your password" name="password" autocapitalize="off" autocorrect="off" dir="ltr" data-initial-dir="ltr" 
		//data-initial-value="">
		//<input type="password" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="current-password" spellcheck="false" tabindex="0" aria-label="Enter your password" name="password" autocapitalize="off" autocorrect="off" dir="ltr" data-initial-dir="ltr" data-initial-value="">
		////*[@id="yDmH0d"]
		//#yDmH0d
		//driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]")).sendKeys("basu@1985");
		//driver.findElement(By.name("password")).sendKeys("basu@1985");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("basu@1985");
		
		//<span class="RveJvd snByac">Next</span>
		driver.findElement(By.className("CwaK9")).click();
		
		driver.findElement(By.className("aio UKr6le")).click();
		driver.findElement(By.name("palla")).click();
		Thread.sleep(3000);
	}

}
