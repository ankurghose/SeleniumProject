package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {

	public WebDriver driver;

	public PageObjectModel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement SearchBox;

	public WebElement getSearchBox() {
		return SearchBox;
	}
	
	@FindBy (xpath = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	public WebElement Searchbutton;

	public WebElement getSearchbutton() {
		return Searchbutton;
	}
	
	
	
	
}