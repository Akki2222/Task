package com.stepdef;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.Base;
import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefAddCart extends Base{
	//int amount;
	HomePage hp;
	String par_win;
	
	@Given("user should be on amazon home page")
	public void user_should_be_on_amazon_home_page() {
	   initial(); 
	   getLink();
	}

	@When("user search iphone")
	public void user_search_iphone() {
	 hp = new HomePage(driver);
	hp.seachOpr("iphone");
	 par_win=driver.getWindowHandle();
	}

	@When("user clicks on any iphone from list")
	public void user_clicks_on_any_iphone_from_list() {
		hp.selectProd(driver);
	} 
	
	@When("user click on add to cart")
	public void user_click_on_add_to_cart() {
       hp.waitDriver(driver);
		hp.windowHandle(par_win, driver);
		ProductPage pp = new ProductPage(driver);
	   pp.clickCart(driver);
	   pp.checkCart(driver);
	}

	@Then("selected product should be added to cart")
	public void selected_product_should_be_added_to_cart() {
	   CartPage cp = new CartPage(driver);
	   Assert.assertEquals(true, cp.getElem());
	}
}
