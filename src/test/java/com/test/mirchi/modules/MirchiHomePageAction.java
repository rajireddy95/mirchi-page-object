package com.test.mirchi.modules;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.test.mirchi.helpers.Log;
import com.test.mirchi.pageobjects.MirchiHomePage;
public class MirchiHomePageAction {
	public static void Execute(WebDriver driver) throws Exception{
		MirchiHomePage.navbar.click();
		Log.info("Click action is perfromed on My Account link" );
		
		Reporter.log("SignIn Action is successfully perfomred");
	}
}
