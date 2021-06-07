package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerHomePage extends BasePage {
	public @FindBy(id = "sbmt") WebElement logout;
	public @FindBy(id = "sbmit-a") WebElement approve_request;
	public @FindBy(id = "rId") WebElement request_id;

	public ManagerHomePage() throws IOException {
		super();
	}
	
	public ManagerHomePage isRequestVisible() throws Exception {
		WaitUntilWebElementIsVisibleUsingByLocator(By.xpath("//td[contains(text(),'test3@gmail.com')]"));
		WaitUntilWebElementIsVisibleUsingByLocator(By.xpath("//td[contains(text(),'Certificate Exam')]"));
		return new ManagerHomePage();
	}
	
	public ManagerHomePage enterRequestId() throws Exception {
		String rId = driver.findElement(By.xpath("//body//td[3]")).getText();
		sendKeysToWebElement(request_id, rId);
		return new ManagerHomePage();
	}
	
	public ManagerHomePage clickApprove() throws Exception {
		waitAndClickElement(approve_request);
		return new ManagerHomePage();
	}
	
	public ManagerHomePage isRequestGone() throws Exception {
		waitUntilElementDissapears(By.xpath("//td[contains(text(),'Certificate Exam')]"));
		return new ManagerHomePage();
	}
	
	
	public ManagerHomePage clickLogout() throws Exception {
		waitAndClickElement(logout);
		return new ManagerHomePage();
	}

}
