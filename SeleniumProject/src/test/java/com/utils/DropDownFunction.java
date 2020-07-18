package com.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFunction {

	
	public void DropDown() {
		
		System.setProperty("WebDriver.chrome.driver","./Drivers/Chromedriver/chromedriver" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select s = new Select(driver.findElement(By.id("twotabsearchtextbox")));
		s.deselectByVisibleText("golden dog stuffed animal");
		List<WebElement> l = s.getOptions();
		System.out.println(l.size());
		
		
			
				
		
		
		
		
		
		
		
	}
	
	
	
}
