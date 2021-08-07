package com.bit.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest1 {


	public WebDriver driver;
	
	
	
	
		@Before
		public void openBrowser() throws IOException {
			FileInputStream fl = new FileInputStream("config.properties");
			Properties p = new Properties();
			p.load(fl);
			//String browser = p.getProperty("browser");
			
			String browser = System.getProperty("browser");
			if(browser.equals("chrome")) {			
				System.setProperty("webdriver.chrome.driver", "/Users/asap_nav/Downloads/chromedriver");
				driver = new ChromeDriver();
				System.out.println("Running Chrome");
			}
			else if(browser.equals("firefox")){
				System.setProperty("webdriver.gecko.driver", "/Users/asap_nav/Downloads/geckodriver");
				driver = new FirefoxDriver();
				System.out.println("Running Firefox");
			}
			else {
				System.out.println("No broswer found");
			}
			driver.get(p.getProperty("url"));
		}


		
		
		
		
			@After
			public void closeChromeBrowser() throws InterruptedException {
				Thread.sleep(5000);
				driver.quit();
				
			}









}
