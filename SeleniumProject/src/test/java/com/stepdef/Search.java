package com.stepdef;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.common.Base;
import com.pages.PageObjectModel;
import com.utils.DropDownFunction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;



public class Search extends Base {
	PageObjectModel POM;

    @Given("^I am on Amazon webiste$")
    public void i_am_on_amazon_webiste()  {
    	getdriver();
    	
    	driver.findElement(By.xpath("//input[@id='login-user']")).sendKeys("testuser+wh2ls8@example.com");
    	driver.findElement(By.xpath("//input[@id='login-pass']")).sendKeys("testwh2ls8");
    	driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
    	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/aside[1]/ul[1]/li[3]/a[1]")).click();
    	
        
    }

    @When("^I search for golden doggy$")
    public void i_search_for_golden_doggy()  {
    	
    	//POM= PageFactory.initElements(driver, PageObjectModel.class);
    	//POM.SearchBox.sendKeys("Golden Dog");
    	//POM.Searchbutton.click();
    	

		
		
    	
    
    	
        
    }

    @Then("^I see golden doggy$")
    public void i_see_golden_doggy() {
        
    }

}