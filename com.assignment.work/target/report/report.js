$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/features/Addtocart.feature");
formatter.feature({
  "name": "cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add product to cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should be on amazon home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdef.StepdefAddCart.user_should_be_on_amazon_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search iphone",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdef.StepdefAddCart.user_search_iphone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on any iphone from list",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdef.StepdefAddCart.user_clicks_on_any_iphone_from_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdef.StepdefAddCart.user_click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selected product should be added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdef.StepdefAddCart.selected_product_should_be_added_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/com/features/Register.feature");
formatter.feature({
  "name": "Register",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register at amazon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should be at amazon registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdef.StepdefRegister.user_should_be_at_amazon_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid name",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdef.StepdefRegister.user_enters_valid_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid mobile number",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdef.StepdefRegister.user_enters_valid_mobile_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid mail id",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdef.StepdefRegister.user_enters_valid_mail_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid password",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdef.StepdefRegister.user_enters_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on verify number",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdef.StepdefRegister.user_click_on_verify_number()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/com/features/Sort.feature");
formatter.feature({
  "name": "Register",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should be at amazon homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdef.StepdefSort.user_should_be_on_amazon_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search phones",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdef.StepdefSort.user_search_phones()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "phone price sort low to high",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user apply filter low to high price",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdef.StepdefSort.user_apply_filter_low_to_high_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "phones should be filter per low to high price",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdef.StepdefSort.phones_should_be_filter_per_low_to_high_price()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should be at amazon homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdef.StepdefSort.user_should_be_on_amazon_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search phones",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdef.StepdefSort.user_search_phones()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "phone price sort high to low",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user apply filter high to low price",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdef.StepdefSort.user_apply_filter_high_to_low_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "phones should be filter per high to low price",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdef.StepdefSort.phones_should_be_filter_per_high_to_low_price()"
});
formatter.result({
  "status": "passed"
});
});