package com.bit.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}


	
	public void getText() {
		List<WebElement> a = driver.findElements(By.tagName("link"));
		for(WebElement e : a){
			String text = e.getText();
			System.out.println(text);
			
		}
	}
	
	public void getTextFooter() throws InterruptedException {
		List<WebElement> allThElements = driver.findElements(By.xpath("//div[@id='footer']/div/div/div/button"));
		int total = allThElements.size();
		
		
		//
		
		List<WebElement> allThElements2 = driver.findElements(By.xpath("//ul[@id='options']/li/a/div/div"));
		int total2 = allThElements.size();
		
		for(int i = 1; i<total; i++) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@id='footer']/div/div/div["+i+"]/button")).click();
			Thread.sleep(5000);
			for(int a = 2; a<total2; a++) {
				Thread.sleep(5000);
				System.out.println(driver.findElement(By.xpath("//ul[@id='options']/li["+a+"]/a/div/div")).getText());
				Thread.sleep(5000);
			}
		}
	
	
	

	}
	
	
	public void gitPrac() {
		
	}
	
	
	
	
	
	

}