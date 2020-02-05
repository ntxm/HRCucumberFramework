package com.hr.utils;

import com.hr.bases.BaseClass;

public class TestClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		BaseClass.setUp();
		
		Thread.sleep(3000);
		
		BaseClass.tearDown();
		
		
	}

}
