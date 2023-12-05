package com.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void seachOpr(String str){
		search.sendKeys(str);
		search.submit();
	}
	
	public void selectProd(WebDriver driver){
       driver.findElement(By.partialLinkText("iPhone 13")).click();
	}
	
	 public void windowHandle(String par_win,WebDriver driver){
		 Set<String> tabs=driver.getWindowHandles();
			for (String string : tabs) {
				if(!string.equals(par_win)){
					driver.switchTo().window(string);
					break;
				}
			}
		
	}
	
	 public void waitDriver(WebDriver driver){
		  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		  }
}
