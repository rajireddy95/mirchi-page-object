package com.test.mirchi.modules;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.test.mirchi.helpers.Log;
public class FooterPageAction {
	public static void Execute(WebDriver driver) throws Exception{
		@SuppressWarnings("unused")
		WebDriverWait wait = new WebDriverWait(driver, 10);
		List<WebElement> items = driver.findElements(By.cssSelector(".footer-social-wrap a"));
		Reporter.log("Found Footer links: ", items.size());
		Log.info("Found Footer Links");
		Assert.assertEquals(5,items.size());
		
	}

}
