package com.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	
	public static void initial(){
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
	public void getLink(){
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	}
	
	
	

			

}
