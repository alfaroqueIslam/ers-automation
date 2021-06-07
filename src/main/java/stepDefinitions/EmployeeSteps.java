package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class EmployeeSteps extends DriverFactory {
	@And("^User enters reimbursement amount$")
	public void user_enters_reimbursement_amount() throws Throwable {
		EmployeeHomePage.enterAmount();
	}

	@And("^User enters reimbursement reason$")
	public void user_enters_reimbursement_reason() throws Throwable {
		EmployeeHomePage.enterReason();
	}

	@When("^User clicks submit request button$")
	public void user_clicks_submit_request_button() throws Throwable {
		EmployeeHomePage.clickSubmit();
	}

	@Then("^User can view the request on homepage$")
	public void user_can_view_the_request_on_homepage() throws Throwable {
		EmployeeHomePage.isRequestVisible();
	}

	@And("^User clicks logout button$")
	public void user_clicks_logout_button() throws Throwable {
		EmployeeHomePage.clickLogout();
	}
}
