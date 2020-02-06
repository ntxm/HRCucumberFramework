package com.hr.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.hr.bases.PageInitializer;

public class CommonMethods extends PageInitializer {
	
	public static void jsClick(WebElement element) {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("argument[0].click()", element);
		
	}
	
	public static void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
		

}
