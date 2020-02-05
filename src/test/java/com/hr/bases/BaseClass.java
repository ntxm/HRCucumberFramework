package com.hr.bases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hr.utils.Constants;
import com.hr.utils.FileReader;

public class BaseClass {

public static WebDriver driver;
	
	
	public static void setUp() {
		
		FileReader.readFileProperties(Constants.CONFIG_FILEPATH);
		
		switch(FileReader.getProperty("browser").toLowerCase()) {
			
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
		
		driver.get(FileReader.getProperty("url"));
		
	}
	
	
	
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
		}
		
	}
	
	
}
