package com.test.mirchi.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class MirchiHomePage extends BaseClass{

	public MirchiHomePage(WebDriver driver){
		super(driver);
	}    
	@FindBy(how=How.ID, using="top-mobile-toggle")
	public static WebElement navbar;
	
	@FindBy(how=How.LINK_TEXT, using="Movie News")
	public static WebElement navbar_MovieNews;
	
	@FindBy(how=How.LINK_TEXT, using="Politics")
	public static WebElement navbar_Politics;
	
	@FindBy(how=How.LINK_TEXT, using="Bollywood")
	public static WebElement navbar_Bollywood;
	
	@FindBy(how=How.LINK_TEXT, using="Gallery")
	public static WebElement navbar_Gallery;
	
	@FindBy(how=How.LINK_TEXT, using="Reviews")
	public static WebElement navbar_Reviews;
		
	public static class FooterPage
	{
		
		
		

		
	}
	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	