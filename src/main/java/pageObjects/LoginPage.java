package pageObjects;

import java.io.IOException;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public @FindBy(id = "email") WebElement textfield_Username;
	public @FindBy(id = "password") WebElement textfield_Password;
	public @FindBy(id = "sbmt") WebElement button_Login;

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LoginPage getLoginPage() throws IOException {
		getDriver().get("http://localhost:8080/project1-ers/static/login.html");
		return new LoginPage();
	}
	
	public LoginPage enterUserName(String userName) throws Exception {
		sendKeysToWebElement(textfield_Username, userName);
		return new LoginPage();
	}
	
	public LoginPage enterPassword(String password) throws Exception {
		sendKeysToWebElement(textfield_Password, password);
		return new LoginPage();
	}
	
	public LoginPage clickOnLoginButton() throws Exception {
//		Assert.fail();
		waitAndClickElement(button_Login);
		return new LoginPage();
	}
	
	

}
