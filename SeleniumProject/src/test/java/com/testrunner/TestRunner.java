package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "Features",
		glue = "com.stepdef",
		tags = "@Amazon"
		
		
		
		
		)





public class TestRunner extends AbstractTestNGCucumberTests {

}
