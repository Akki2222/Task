Feature: Register

Background:
Given user should be at amazon homepage
When user search phones


Scenario: phone price sort low to high

And user apply filter low to high price
Then phones should be filter per low to high price


Scenario: phone price sort high to low

And user apply filter high to low price
Then phones should be filter per high to low price