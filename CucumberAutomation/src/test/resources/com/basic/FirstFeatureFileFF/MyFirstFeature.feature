Feature: Create Facebook account - MY FIRST FEATURE

Scenario: Validate "First Name" field
Given user is on the FB login page
When user enters first name
Then user checks first name is present

#Scenario: Validate user multiple fields
#Given user is on the FB login page
#When user enters first name
#And user enters surname
#Then user checks first name is present
#And user checks surname is present
#But user mobile field should be blank