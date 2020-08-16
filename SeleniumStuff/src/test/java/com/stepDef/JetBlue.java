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
		driver.get("https://www.jetblue.com/");
		// Click on where to?
		driver.findElement(By.xpath(
				"/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/jb-city-pair-selector[1]/div[1]/jb-city-selector[2]/div[1]/div[1]/div[1]/input[1]"))
				.click();
		// driver.findElement(By.xpath("//input[@id='city-selector_hi3fquom0']")).click();
		Thread.sleep(300);
		// After clicking on where to adding Den
		driver.findElement(By.xpath(
				"/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/jb-city-pair-selector[1]/div[1]/jb-city-selector[2]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("DEN");

		Thread.sleep(200);

// after writing den click on denver
		//driver.findElement(By.xpath(
			//	"//body[@class='ng-tns-0-1']/jb-app/jb-basic-template/div[@class='w-100']/div/jb-section-header-container[@class='ng-star-inserted']/div[@class='jb-section-header ng-star-inserted']/div/div[@class='list-of-sections ng-star-inserted']/div[@class='center page-margin']/jb-section-container/div[@class='center mb0 ng-star-inserted']/div[@class='w-100']/jb-book-trip-container[@class='ng-star-inserted']/jb-pattern-block[@class='ng-star-inserted']/div[@class='booker-container bg-core-blue relative negative-page-margin']/div[@class='center pa3 pt7-ns ph5-m pa7-ns pb-5-m pb7 relative ph0-l ph0-m ph2-ns page-margin-m page-margin-l']/div[@class='flex flex-column jb-max-width center']/jb-booker-tabs-container[@class='jb-grid one-up grid-offset-l']/div/jb-tabs[@id='first-tab']/section[@class='tab-window tl']/div[@class='ng-star-inserted']/jb-tab-panel[@id='jb-tabpanel-id-4']/jb-booker-tabs-wrapper[@class='db pt3 black ng-star-inserted']/div/jb-booker-air-wrapper[@class='ng-star-inserted']/div[@class='flex flex-column']/jb-booker-air/form[@class='ng-untouched ng-pristine ng-valid']/div[@class='br3 bg-off-white pa3 flex flex-column mt1 flex-row-ns flex-wrap-ns justify-between-ns']/jb-city-pair-selector[@class='w-100 order-2-ns ng-tns-c66-19']/div[@class='city-selector-wrapper flex justify-around flex-row-ns flex-column relative']/jb-city-selector[@class='self-start w-100 w-50-ns ng-tns-c66-19 ng-star-inserted']/div[@class='flex flex-column relative']/div[@class='copy-s avenir absolute bg-white top-100 w-100 suggestion-z-index menu-shadow suggestion-list suggestions-not-focus ng-star-inserted']/ul[@id='listbox']/li[1]/span[2]/span[1]"))
			//	.click();
			// trying with rel xpath
		driver.findElement(By.xpath("//ul[@id='listbox']//li[1]")).click();

		// driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/div[3]/div[1]/jb-traveler-selector[1]/div[1]/div[1]/button[1]")).click();

		// driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/div[3]/div[1]/jb-traveler-selector[1]/div[1]/div[1]/button[1]")).sendKeys(Keys.ARROW_DOWN);

		// see this comment change
		// now see this in git
		int x = 1;
		while (x <= 4) {
			driver.findElement(By.xpath(
					"//li[@class='f6 mt3 mt0-ns bb pb3 flex justify-between items-center']//jb-icon[@name='incrementerUp']//*[local-name()='svg']"))
					.click();
			x++;
		}

		do {
			driver.findElement(By.xpath(
					"//li[@class='f6 mt3 mt0-ns bb pb3 flex justify-between items-center']//jb-icon[@name='incrementerUp']//*[local-name()='svg']"))
					.click();
			x++;
		} while (x <= 5);

//	for (int y = 1; y <= 2; y++) {
		// driver.findElement(By.xpath("//li[@class='f6 mt3 mt0-ns bb pb3 flex
		// justify-between
		// items-center']//jb-icon[@name='incrementerUp']//*[local-name()='svg']")).click();

//	}

	} // end of given

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
