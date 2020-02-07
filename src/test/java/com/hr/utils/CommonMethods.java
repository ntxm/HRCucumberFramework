package com.hr.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		
	
	public static void takeScreenshot() {
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("target/screenshots/screen.png"));
			System.out.println("scr done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
