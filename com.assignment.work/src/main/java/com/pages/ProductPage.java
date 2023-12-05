package com.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
  @FindBy(partialLinkText="iPhone 13 ")
  WebElement price;
  
  @FindBy(xpath="//a[@id='mbbPopoverLink']//following::input[@id='add-to-cart-button']")
  WebElement cart;
  
  public ProductPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
  
  public void clickCart(WebDriver driver){
	  JavascriptExecutor js = (JavascriptExecutor)driver;	 
	js.executeScript("arguments[0].scrollIntoView(true);", cart);
	 cart.click();
  }
  
  public int getPrice(){
		int amount = Integer.parseInt(price.getText().replace(",", ""));
		return amount;
  }
  
  public void checkCart(WebDriver driver){
	  driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button-announce']//preceding-sibling::input[@class='a-button-input']")).click();

  }
  
}
