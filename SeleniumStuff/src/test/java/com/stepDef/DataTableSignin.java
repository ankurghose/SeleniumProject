package com.stepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.Common.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableSignin extends Base{
	
	
	
	@Given("^I am on http://automationpractice\\.com/index\\.php$")
	public void i_am_on_http_automationpractice_com_index_php() throws Throwable {
		getdriver();
	    
	}

	@When("^I click login$")
	public void i_click_login() throws Throwable {
		
	//	driver.findElement(By.xpath("//a[@class='main-nav-link avenir b white no-underline nowrap dib ng-star-inserted']")).click();
		
		
		
		
		
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password(DataTable creds) throws Throwable {
		List <Map <String,String>> data= creds.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get(0).get("password"));
	
	}

	@When("^I click enter$")
	public void i_click_enter() throws Throwable {
	   
	}

	@Then("^I should recieve an error message$")
	public void i_should_recieve_an_error_message() throws Throwable {
	    
	}


}
