package com.hr.utils;

public class Constants {
	
	public static final String CONFIG_FILEPATH = "(user.dir)" + "/configs/config.properties";
	
	public static final String MAIN_URL = "http://166.62.36.207/Syntax_HRM/symfony/web/index.php/auth/login";
	
	public static final String LOGIN =  "Admin";
	
	public static final String PASSWORD = "Syntax@123";
	
	public static final String BROWSER = "firefox";
	
	public static final String CHROME_DRIVER = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
	
	public static final String FIREFOX_DRIVER = System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver";
	
	public static final int PAGE_LOAD_TIME = 30;
	
	public static final int IMPLICIT_LOAD_TIME = 10;
	
	public static final int EXPLICIT_LOAD_TIME = 30;

}
