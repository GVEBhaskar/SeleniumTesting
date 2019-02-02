package com.OHRM_login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {


	public static void main(String[] args) 
	{
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
		
		WebElement PIM=driver.findElement(By.xpath("//*[@id=\'pim\']/a/span"));
		act.moveToElement(PIM).perform();
		driver.findElement(By.xpath("//*[@id=\'pim\']/ul/li[1]/a/span")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'rightMenu\']")));
		WebElement EmpInfo=driver.findElement(By.xpath("//*[@id=\'loc_code\']"));
		List <WebElement> EmpInfo_SearchBy=EmpInfo.findElements(By.tagName("option"));
		int EmpInfo_SearchByCount=EmpInfo_SearchBy.size();
		System.out.println("Employee Info Data: "+EmpInfo_SearchByCount);
		
		for (int i=0; i<EmpInfo_SearchByCount; i++)
		{
			EmpInfo_SearchBy.get(i).click();
			if (EmpInfo_SearchBy.get(i).isDisplayed())
			{
				System.out.println(i+" "+EmpInfo_SearchBy.get(i).getText());
				if (EmpInfo_SearchBy.get(i).isSelected())
				{
					System.out.println("Element is active");
				}
				else
				{
					System.out.println("Element is not active");
				}
			}
		}
		driver.close();

	}

}
