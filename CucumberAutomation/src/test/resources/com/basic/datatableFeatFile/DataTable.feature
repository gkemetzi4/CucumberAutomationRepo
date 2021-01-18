Feature: Create Facebook account - DATA TABLE

Scenario: Validate user multiple fields
Given user is on the FB login page
When following data entered
	|firstName |surname |mobile		 |
	|George		 |Tzi			|1234567890|
	|Michael	 |Jordan	|0987654321|
	