package com.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	
	public WebDriver driver;
	
	public WebDriver getdriver() {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver 83");
		driver = new ChromeDriver();
		driver.get("https://www.jetblue.com/");
		
		return driver;
		
}
}
