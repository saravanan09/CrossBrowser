package mint.accountmanagement.page.navigation;

import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.pageobjects.containers.LoginPageObjects;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class TempPasswordPageNav {
	private static final LoginPageObjects loginContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageObjects.class);
	
	public void temporaryPasswordPageCheck(String TemporaryPasswordLink)
	{
		BrowserDriver.waitForElement(loginContainer.TempPwdText);
		assertTrue(loginContainer.TempPwdText.isDisplayed());
		BrowserDriver.URLCheck(TemporaryPasswordLink, 20);
	}
	
	public void I_click_on_Send_Password_to_My_Device_button(){
		loginContainer.sendPasswordButton.click();	}
	public void I_should_see_forgot_password_success_msg(String successMsg){
		BrowserDriver.waitForElement(loginContainer.InputSuccessMsg);
		assertTrue(loginContainer.InputSuccessMsg.isDisplayed());
		assertEquals(successMsg, loginContainer.InputSuccessMsg.getText());
	}
	public void I_click_on_Back_To_Login_button(){
		BrowserDriver.WebPageLoader(1000);
		BrowserDriver.waitForElement(loginContainer.backToLogin);
		loginContainer.backToLogin.click();
	}
	public void I_should_see_Login_Page(String LoginLink){
		BrowserDriver.waitForElement(loginContainer.logInButton);
		assertTrue(loginContainer.logInButton.isDisplayed());
		BrowserDriver.URLCheck(LoginLink, 20);
	}
}
