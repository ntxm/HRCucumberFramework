package com.hr.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.hr.bases.PageInitializer;

public class CommonMethods extends PageInitializer {
	
	/**
	 * 
	 * JavaScript click
	 * @param element
	 */
	
	public static void jsClick(WebElement element) {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("argument[0].click()", element);
		
	}
	
	/**
	 * Method clear the textFiled and send the value to this field
	 * @param element
	 * @param value
	 */
	public static void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
		

}
