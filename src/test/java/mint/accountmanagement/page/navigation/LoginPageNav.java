package mint.accountmanagement.page.navigation;

import java.util.Properties;

import mint.accounrmanagement.utils.BrowserDriver;
import mint.accounrmanagement.utils.EnvironmentProperties;
import mint.accounrmanagement.utils.Environments;
import mint.accountmanagement.pageobjects.containers.LoginPageObjects;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;


public class LoginPageNav {
	private static final LoginPageObjects loginContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageObjects.class);
	
	public void given_I_navigate_to_the_mint_url(){
		
		String url = EnvironmentProperties.getEnvironment();
		BrowserDriver.loadURL(url);
//		BrowserDriver.URLCheck("/login", 20);
//		LoginView.isDisplayedCheck();
	}
	
	
	public void when_I_provide_username(String username)
	{
		loginContainer.msisdnInput.sendKeys(username);
	}
	public void when_I_provide_password(String password)
	{
		loginContainer.passwordInput.sendKeys(password);
	}
	
	public void I_click_on_LogIn_button()
	{
		BrowserDriver.WebPageLoader(6000);
			loginContainer.logInButton.click();
		
	}
	public void I_should_see_error_msg(String ErrorMsg)
	{
		BrowserDriver.waitForElement(loginContainer.InputErrorMsg);
		assertTrue(loginContainer.InputErrorMsg.isDisplayed());
		assertEquals(ErrorMsg,loginContainer.InputErrorMsg.getText());
	}
	
	public void I_click_on_SMS_a_password_to_My_Device_button(){
		loginContainer.forgotPasswordButton.click();
	}

}
