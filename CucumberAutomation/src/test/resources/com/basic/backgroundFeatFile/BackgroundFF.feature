Feature: Create Facebook account - BACKGROUND

Background: common login steps
Given user is on the FB login page

Scenario: Validate First Name field
When user enters "George" first name
Then user checks first name "George" is present
Then close browser

Scenario: Validate user multiple fields
When user enters "George" first name
And user enters "Tzi" surname
Then user checks first name "George" is present
#And user checks surname is present
Then user mobile field should be blank
Then close browser