package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
@FindBy(xpath="//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-base sc-item-content-list']")
WebElement prod;

public CartPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

 public boolean getElem(){
	 prod.isDisplayed();
	 return true;
 }

}
