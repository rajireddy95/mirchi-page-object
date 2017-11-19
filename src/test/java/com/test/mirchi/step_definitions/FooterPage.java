package com.test.mirchi.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.mirchi.modules.MirchiHomePageAction;
import com.test.mirchi.pageobjects.MirchiHomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FooterPage {
	
	
	
	 public WebDriver driver;
	    
	   
	    public FooterPage()
	    {
	    	driver = Hooks.driver;
	     
	    }
	@When("^I Traverse to Footer$")
	public void i_Traverse_to_Footer() throws Throwable {
	    
	}

	@Then("^I select all links and verify if works and lands on right page$")
	public void i_select_all_links_and_verify_if_works_and_lands_on_right_page() throws Throwable {
		PageFactory.initElements(driver, MirchiHomePage.FooterPage.class);
    	MirchiHomePageAction.Execute(driver);
	}
}
