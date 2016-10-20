package mint.accountmanagement.pageobjects.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalInfoPageObjects {

	@FindBy(how = How.ID, using = "InputFirstName")
    public WebElement firstName;
	
	@FindBy(how = How.ID, using = "InputLastName")
    public WebElement lastName;
	
	@FindBy(how = How.ID, using = "InputTextEmail")
    public WebElement email;
	
	@FindBy(how = How.ID, using = "InputGroupPassword")
    public WebElement password;
	
	@FindBy(how = How.ID, using = "InputGroupPasswordConfirm")
    public WebElement confirmpassword;
	
	@FindBy(how = How.ID, using = "Button")
    public WebElement UpdatePersonalInfoBtn;
	
	@FindBy(how = How.ID, using = "InputSuccess")
    public WebElement UpdatePersonalInfoSuccessMsg;
}
