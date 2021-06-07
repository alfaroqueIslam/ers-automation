package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import utils.DriverFactory;

public class ManagerLoginSteps extends DriverFactory {
	
	@Given("^User navigates over to ERS website as manager$")
	public void user_navigates_over_to_revature_website() throws Exception {
		LoginPage.getLoginPage();

	}

	@And("^User enters valid username as manager$")
	public void user_enters_valid_username() throws Exception {
		LoginPage.enterUserName(System.getenv("TEST_MANAGER"));
	    
	}

	@And("^User enters valid password as manager$")
	public void user_enters_valid_password() throws Exception {
		LoginPage.enterPassword(System.getenv("TEST_PASSWORD"));
	    
	}

	@And("^User clicks on the login button as manager$")
	public void user_clicks_on_the_login_button() throws Exception {
		LoginPage.clickOnLoginButton();
	    
	}
	

}
