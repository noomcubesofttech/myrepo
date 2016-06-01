Feature: Search Google action
	As a user of Google
	I want to be able to search
	So I can use the features provided
	
	Scenario: Search Google in successfully
	Given the Google home page is displayed
	When Search using keyword  "F117"
	Then the search is successful "F117"