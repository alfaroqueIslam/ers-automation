package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ManagerSteps extends DriverFactory {
	@And("^User can view the pending request on homepage$")
	public void user_can_view_the_pending_request_on_homepage() throws Throwable {
		ManagerHomePage.isRequestVisible();
	}

	@And("^User enters request id$")
	public void user_enters_request_id() throws Throwable {
		ManagerHomePage.enterRequestId();
	}

	@When("^User clicks approve button$")
	public void user_clicks_approve_button() throws Throwable {
		ManagerHomePage.clickApprove();
	}

	@Then("^User can no longer view the request on homepage$")
	public void user_can_no_longer_view_the_request_on_homepage() throws Throwable {
		ManagerHomePage.isRequestGone();
	}

	@And("^User clicks logout button as manager$")
	public void user_clicks_logout_button_as_manager() throws Throwable {
		ManagerHomePage.clickLogout();
	}
}
