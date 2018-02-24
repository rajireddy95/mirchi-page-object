package com.test.mirchi.modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.test.mirchi.pageobjects.MirchiHomePage;

public class GoogleAdsAction {
	public static void Execute(WebDriver driver) throws Exception {

		Assert.assertEquals(5, MirchiHomePage.GoogleAdsPage.ads.size());

		Reporter.log("Clicked on Ad");
	}
}
