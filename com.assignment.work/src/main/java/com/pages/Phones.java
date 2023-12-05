package com.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Phones {
@FindBy(xpath="//select[@id='s-result-sort-select']")
WebElement sel;

public Phones(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public  void selectDropdwn1(){
	Select option = new Select(sel);
	option.selectByVisibleText("Price: Low to High");
	
}
public  void selectDropdwn2(){
	Select option = new Select(sel);
	option.selectByVisibleText("Price: High to Low");
}

public boolean priceCheck_lowtohigh(WebDriver driver){
	List<WebElement> phn = driver.findElements(By.xpath("//div [@tabindex='0']//following::span[@class='a-price-whole'] [position()<=18]"));
	ArrayList<Integer> compare = new ArrayList<Integer>();
for (WebElement webElement : phn) {
	compare.add(Integer.parseInt(webElement.getText().replace(",", "")));
}
ArrayList<Integer> newcompare = new ArrayList<Integer>(compare);
Collections.sort(newcompare);
Assert.assertEquals(newcompare, compare);
	return true;
}

public boolean priceCheck_Hightolow(WebDriver driver){

	List<WebElement> phn = driver.findElements(By.xpath("//div [@tabindex='0']//following::span[@class='a-price-whole'] [position()<=7]"));
	ArrayList<Integer> compare = new ArrayList<Integer>();
		for (WebElement webElement : phn) {
			compare.add(Integer.parseInt(webElement.getText().replace(",", "")));
		}
		ArrayList<Integer> newcompare = new ArrayList<Integer>(compare);
		Collections.sort(newcompare);
		Collections.reverse(newcompare);
		Assert.assertEquals(newcompare, compare);
		return true;
}
}
