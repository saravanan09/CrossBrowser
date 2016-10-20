package mint.accountmanagement.pageobjects.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {

	@FindBy(how = How.ID, using = "LoginPage")
    public WebElement loginPageDiv;
	
	@FindBy(how = How.ID, using = "InputTextPhoneNumber")
    public  WebElement msisdnInput;
	
	@FindBy(how = How.ID, using = "InputTextPassword")
    public WebElement passwordInput;
	
	@FindBy(how = How.ID, using = "btn-login-submit")
    public WebElement logInButton;
	
	@FindBy(how = How.ID, using = "InputError")
	public WebElement InputErrorMsg;
	
	
	@FindBy(how = How.ID, using = "login-btn-sms-desktop")
	public WebElement forgotPasswordButton;
	
	@FindBy(how = How.ID, using = "login-sms-temp")
	public WebElement sendPasswordButton;
	
	@FindBy(how = How.ID, using = "Button")
	public WebElement backToLogin;
	
	@FindBy(how = How.ID, using = "InputSuccess")
	public WebElement InputSuccessMsg;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Send Me a Temporary Password']")
	public WebElement TempPwdText;
}
