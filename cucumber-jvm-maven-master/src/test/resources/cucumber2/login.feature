Feature: Login action
	As a user of ParaBank
	I want to be able to log in
	So I can use the features provided
	
	Scenario: An authorized user logs in successfully
	Given the ParaBank home page is displayed
	When user "john" logs in using password "demo"
	Then the login is successful