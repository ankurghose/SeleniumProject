package com.testrunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "Features", 
		glue = "com.stepDef",
		tags = "@JetBlue"
		
		
		
		
)




	public class TestRunner extends AbstractTestNGCucumberTests{
		
	}

