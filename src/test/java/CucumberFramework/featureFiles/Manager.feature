Feature: Login to manager account
	Existing user should be able to login to account using correct credentials
	
Scenario: Login to account with correct credentials
	Given User navigates over to ERS website as manager
	And User enters valid username as manager 
	And User enters valid password as manager
	And User clicks on the login button as manager
	And User can view the pending request on homepage
	And User enters request id
	When User clicks approve button 
	Then User can no longer view the request on homepage
	And User clicks logout button as manager