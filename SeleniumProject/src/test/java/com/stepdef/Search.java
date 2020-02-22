package com.stepdef;


import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;



public class Search extends Base {

    @Given("^I am on Amazon webiste$")
    public void i_am_on_amazon_webiste()  {
    	getdriver();
    	driver.manage().window().maximize();
    	
        
    }

    @When("^I search for golden doggy$")
    public void i_search_for_golden_doggy()  {
        
    }

    @Then("^I see golden doggy$")
    public void i_see_golden_doggy() {
        
    }

}