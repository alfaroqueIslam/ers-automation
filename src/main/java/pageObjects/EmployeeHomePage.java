package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeHomePage extends BasePage {
	public @FindBy(id = "sbmt") WebElement logout;
	public @FindBy(id = "sbmit") WebElement submit_request;
	public @FindBy(id = "amount") WebElement amount;
	public @FindBy(id = "reason") WebElement reason;

	public EmployeeHomePage() throws IOException {
		super();
	}
	
	public EmployeeHomePage enterAmount() throws Exception {
		sendKeysToWebElement(amount, "100");
		return new EmployeeHomePage();
	}
	
	public EmployeeHomePage enterReason() throws Exception {
		sendKeysToWebElement(reason, "Certificate Exam");
		return new EmployeeHomePage();
	}
	
	public EmployeeHomePage clickSubmit() throws Exception {
		waitAndClickElement(submit_request);
		return new EmployeeHomePage();
	}
	
	public EmployeeHomePage isRequestVisible() throws Exception {
		WaitUntilWebElementIsVisibleUsingByLocator(By.xpath("//td[contains(text(),'test3@gmail.com')]"));
		WaitUntilWebElementIsVisibleUsingByLocator(By.xpath("//td[contains(text(),'Certificate Exam')]"));
		return new EmployeeHomePage();
	}
	
	public EmployeeHomePage clickLogout() throws Exception {
		waitAndClickElement(logout);
		return new EmployeeHomePage();
	}

}
