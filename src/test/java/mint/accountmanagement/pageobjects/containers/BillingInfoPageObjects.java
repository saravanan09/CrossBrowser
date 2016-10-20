package mint.accountmanagement.pageobjects.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BillingInfoPageObjects {

	@FindBy(how = How.ID, using = "toggleButton")
    public WebElement ChangeBillingInfo;
	
	@FindBy(how = How.ID, using = "CardNumber")
    public WebElement CCNumberInfo;
	
	@FindBy(how = How.ID, using = "CVV")
    public WebElement CVVInfo;
	
	@FindBy(how = How.ID, using = "ExpirationDate")
    public WebElement ExpiryInfo;
	
	@FindBy(how = How.ID, using = "InputFirstName")
    public WebElement FirstName;
	
	@FindBy(how = How.ID, using = "InputLastName")
    public WebElement LastName;
	
	@FindBy(how = How.ID, using = "InputAddress1")
    public WebElement Address1;
	
	@FindBy(how = How.ID, using = "InputAddress2")
    public WebElement Address2;
	
	@FindBy(how = How.ID, using = "InputCity")
    public WebElement City;
	
	@FindBy(how = How.ID, using = "InputState")
    public WebElement State;
	
	@FindBy(how = How.ID, using = "InputTextZipCode")
    public WebElement ZipCode;
	
	@FindBy(how = How.ID, using = "updateButton")
    public WebElement UpdateBillingInfoBtn;
	
	@FindBy(how = How.ID, using = "Button")
    public WebElement CancelBtn;
	
	@FindBy(how = How.ID, using = "InputSuccess")
    public WebElement BillingInfoSuccessMsg;
}
