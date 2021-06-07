package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import utils.DriverFactory;

public class EmployeeLoginSteps extends DriverFactory {
	
	@Given("^User navigates over to ERS website$")
	public void user_navigates_over_to_revature_website() throws Exception {
		LoginPage.getLoginPage();

	}

	@And("^User enters valid username$")
	public void user_enters_valid_username() throws Exception {
		LoginPage.enterUserName(System.getenv("TEST_EMPLOYEE"));
	    
	}

	@And("^User enters valid password$")
	public void user_enters_valid_password() throws Exception {
		LoginPage.enterPassword(System.getenv("TEST_PASSWORD"));
	    
	}

	@And("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Exception {
		LoginPage.clickOnLoginButton();
	    
	}
	

}
