package com.test.mirchi.modules;

import org.openqa.selenium.WebDriver;
import com.test.mirchi.helpers.Log;
import com.test.mirchi.pageobjects.MirchiHomePage;

public class NavDropDownAction {
	public static void Execute(WebDriver driver) throws Exception {
		MirchiHomePage.navbar_MovieNews.click();
        Log.info("Click action is perfromed on Movie News" );
        MirchiHomePage.navbar_Politics.click();
        Log.info("Click action is perfromed on Politics" );
        MirchiHomePage.navbar_Bollywood.click();
        Log.info("Click action is perfromed on Bollywood" );
        MirchiHomePage.navbar_Gallery.click();
        Log.info("Click action is perfromed on Gallery" );
        MirchiHomePage.navbar_Reviews.click();
        Log.info("Click action is perfromed on Reviews" );
		
	
	}
}