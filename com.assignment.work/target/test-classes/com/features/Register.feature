Feature: Register

Scenario: Register at amazon

Given user should be at amazon registration page
When user enters valid name
And user enters valid mobile number
And user enters valid mail id
And user enters valid password
Then user click on verify number


