package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionalValuefromDropDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\geckodriver.exe");
		WebDriver driver = null;
		driver = new FirefoxDriver();
		String url = "http://my.monsterindia.com/sponsered_popup.html";
		driver.get(url);
		
		
		driver.manage().window().maximize();
		WebElement country_location=driver.findElement(By.className("border_grey1"));
		List<WebElement> City_Names=country_location.findElements(By.tagName("option"));
		int City_Count=City_Names.size();
		System.out.println("Total No. Of Cities: "+City_Count);
		
		for (int i=0; i<City_Count; i++)
		{
			System.out.println(i+" "+City_Names.get(i).getText());
		}

		Select selection = new Select(country_location);
		selection.selectByVisibleText("Chennai");
		selection.selectByIndex(433);
		selection.selectByValue("820");
		
		WebElement industry=driver.findElement(By.id("id_industry"));
		Select sel=new Select(industry);
		sel.selectByIndex(2);
		sel.selectByValue("419");
		sel.selectByVisibleText("Banking/Financial Services");
		
		sel.deselectByIndex(2);
		sel.deselectByValue("419");
		sel.deselectByVisibleText("Banking/Financial Services");
		sel.deselectAll();
		industry.sendKeys("Any");
		
		driver.quit();
		
	}

}
