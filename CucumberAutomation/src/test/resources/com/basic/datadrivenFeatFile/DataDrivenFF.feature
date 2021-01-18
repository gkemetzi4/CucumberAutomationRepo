Feature: Create Facebook account - DATA DRIVEN

Scenario Outline: Validate user multiple fields
Given user is on the FB login page
When user enters <firstname> first name
And user enters <surname> surname
Then user checks first name <firstname> is present
#And user checks surname is present
Then user mobile field should be blank
Then close browser
Examples:
|firstname|surname|
|George		|Tzi		|
|Michael	|Jordan	|