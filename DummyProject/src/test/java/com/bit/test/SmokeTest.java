package com.bit.test;

import org.junit.Test;

import com.bit.pages.HomePage;

public class SmokeTest extends BaseTest1{

	
	
	@Test
	public void test1() throws InterruptedException {
		System.out.println(")------------------------------");
		System.out.println("I ran from Maven Horayyyyyyyy");
		System.out.println("-------------------------------");
		
		HomePage hp = new HomePage(driver);
		
		hp.getText();
		//hp.getTextFooter();
	}
	
	
	
	
	
	
	
}
