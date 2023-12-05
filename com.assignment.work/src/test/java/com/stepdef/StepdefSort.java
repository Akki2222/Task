package com.stepdef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.pages.Base;
import com.pages.HomePage;
import com.pages.Phones;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefSort extends Base{
	HomePage hp;
	Phones pp;

	
	@Given("user should be at amazon homepage")
	public void user_should_be_on_amazon_home_page() {
		 getLink();
	}

	@When("user search phones")
	public void user_search_phones() {
		 hp = new HomePage(driver);
			hp.seachOpr("phones");
	}

	@When("user apply filter low to high price")
	public void user_apply_filter_low_to_high_price() {
		pp = new Phones(driver);
		pp.selectDropdwn1();
		hp.waitDriver(driver);
	}

	@Then("phones should be filter per low to high price")
	public void phones_should_be_filter_per_low_to_high_price() {
		
		Assert.assertEquals(true, pp.priceCheck_lowtohigh(driver));
	}
	
	@When("user apply filter high to low price")
	public void user_apply_filter_high_to_low_price() {
		pp=new Phones(driver);
		pp.selectDropdwn2();
		hp.waitDriver(driver);
	}
	
	@Then("phones should be filter per high to low price")
	public void phones_should_be_filter_per_high_to_low_price() {
		
    Assert.assertEquals(true, pp.priceCheck_Hightolow(driver));
		
	}
}
