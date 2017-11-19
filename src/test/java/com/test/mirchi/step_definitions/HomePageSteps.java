package com.test.mirchi.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.mirchi.modules.MirchiHomePageAction;
import com.test.mirchi.pageobjects.MirchiHomePage;

import cucumber.api.java.en.When;

public class HomePageSteps {
    public WebDriver driver;
    
   
    public HomePageSteps()
    {
    	driver = Hooks.driver;
     
    }
    
    @When("^I open mirchi website$")
    public void i_open_mirchi_website() {
    	driver.get("https://www.mirchi9.com/");
    }
    
    @When("^I click on NavBar$")
    public void i_click_on_NavBar() throws Throwable {
    	PageFactory.initElements(driver, MirchiHomePage.class);
    	MirchiHomePageAction.Execute(driver);
    }
    
}