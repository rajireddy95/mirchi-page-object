package com.test.mirchi.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.test.mirchi.pageobjects.MirchiHomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigationSteps {

	public WebDriver driver;

	public NavigationSteps() {
		driver = Hooks.driver;
	}

	@When("^I click on search button and enter text$")
	public void i_click_on_search_button_and_enter_text() throws Throwable {
		PageFactory.initElements(driver,MirchiHomePage.class);
		MirchiHomePage.search.sendKeys("Reviews");		
	}

	@Then("^I should links relevant to search text on the page$")
	public void i_should_links_relevant_to_search_text_on_the_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.getPageSource().contains("https://www.mirchi9.com"));

	}
}
