package com.hr.bases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hr.utils.Constants;

public class BaseClass {

public static WebDriver driver;
	
	
	public static void setUp() {
		
		switch(Constants.BROWSER.toLowerCase()) {
			
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constants.FIREFOX_DRIVER);
			driver = new FirefoxDriver();
			break;
			
		default:
            System.err.println("Browser is not supported");	
		
		}
		
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(Constants.MAIN_URL);
		
	}
	
	
	
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
		}
		
	}
	
	
}
