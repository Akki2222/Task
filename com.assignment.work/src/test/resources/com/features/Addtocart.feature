Feature: cart

Scenario: Add product to cart

Given user should be on amazon home page
When user search iphone
And user clicks on any iphone from list
And user click on add to cart
Then selected product should be added to cart