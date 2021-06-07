Feature: Login to employee account
	Existing user should be able to login to account using correct credentials
	
Scenario: Login to account with correct credentials
	Given User navigates over to ERS website 
	And User enters valid username   
	And User enters valid password
	And User clicks on the login button
	And User enters reimbursement amount
	And User enters reimbursement reason
	When User clicks submit request button
	Then User can view the request on homepage
	And User clicks logout button