package com.test.mirchi.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MirchiHomePage extends BaseClass {

	public MirchiHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "top-mobile-toggle")
	public static WebElement navbar;

	@FindBy(how = How.CLASS_NAME, using = "menu-item")
	public static WebElement menu_item;
	
	@FindBy(how = How.ID, using = "header-search")
	public static WebElement header_search;
	
	@FindBy(how = How.NAME, using = "q")
	public static WebElement search;
}
