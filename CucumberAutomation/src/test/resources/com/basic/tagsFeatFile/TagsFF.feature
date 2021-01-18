@Important
Feature: Create Facebook account - TAGS

@Smoke
Scenario: Validate First Name field1
Given user is on the FB login page
When user enters "George" first name
Then user checks first name "George" is present
Then close browser

@Smoke @Regression
Scenario: Validate user multiple fields2
Given user is on the FB login page
When user enters "George" first name
And user enters "Tzi" surname
Then user checks first name "George" is present
#And user checks surname is present
Then user mobile field should be blank
Then close browser

Scenario: Validate First Name field3
Given user is on the FB login page
When user enters "George" first name
Then user checks first name "George" is present
Then close browser

@Regression
Scenario: Validate First Name field4
Given user is on the FB login page
When user enters "George" first name
Then user checks first name "George" is present
Then close browser

@Smoke
Scenario: Validate First Name field5
Given user is on the FB login page
When user enters "George" first name
Then user checks first name "George" is present
Then close browser