package com.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Common.Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JetBlue extends Base {

	@Given("^I am on JetBlue$")
	public void i_am_on_JetBlue() throws InterruptedException {
		getdriver();
		driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/jb-city-pair-selector[1]/div[1]/jb-city-selector[2]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/jb-city-pair-selector[1]/div[1]/jb-city-selector[2]/div[1]/div[1]/div[1]/input[1]"))
		.sendKeys("DEN");
		driver.findElement(By.xpath("//span[@class='b'][contains(text(),'DEN')]")).click();

Thread.sleep(200);
	driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/div[3]/div[1]/jb-traveler-selector[1]/div[1]/div[1]/button[1]")).click();
	
	driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/div[3]/div[1]/jb-traveler-selector[1]/div[1]/div[1]/button[1]")).sendKeys(Keys.ARROW_DOWN);

	
	
	int x = 1;
	while ( x <= 2) {
	driver.findElement(By.xpath("//li[@class='f6 mt3 mt0-ns bb pb3 flex justify-between items-center']//jb-icon[@name='incrementerUp']//*[local-name()='svg']")).click();
	x++; }
	
	do {
	driver.findElement(By.xpath("//li[@class='f6 mt3 mt0-ns bb pb3 flex justify-between items-center']//jb-icon[@name='incrementerUp']//*[local-name()='svg']")).click();
	x++;	} 
	while (x <= 4);
	
	
//	for (int y = 1; y <= 2; y++) {
	//driver.findElement(By.xpath("//li[@class='f6 mt3 mt0-ns bb pb3 flex justify-between items-center']//jb-icon[@name='incrementerUp']//*[local-name()='svg']")).click();

		
//	}
	
	
	
	
	} //end of given
	


	@Given("^try to book a flight$")
	public void try_to_book_a_flight() {

	}

	@When("^I add more tickets$")
	public void i_add_more_tickets() {

	}

	@Then("^I have my tickets$")
	public void i_have_my_tickets() {

	}

}
