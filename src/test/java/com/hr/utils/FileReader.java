package com.hr.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @filePath FileReader take a path to the file as a parameter. 
 * @return properties
 * 
 * @author natalia
 *
 */

public class FileReader {
	
	public static Properties properties;
	
	public static Properties readFileProperties(String filePath) {
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			properties = new Properties();
			try {
				properties.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
		return properties;
		
	}
	
	
	
	public static String getProperty(String key) {
		
		return properties.getProperty(key);
		
	}
	
	

}
