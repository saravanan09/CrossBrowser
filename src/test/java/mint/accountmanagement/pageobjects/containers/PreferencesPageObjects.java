package mint.accountmanagement.pageobjects.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PreferencesPageObjects {

	@FindBy(how = How.ID, using = "promotional_SMS")
    public WebElement SMS;
	
	@FindBy(how = How.ID, using = "promotional_Emails")
    public WebElement emails;
	
	@FindBy(how = How.ID, using = "promotional_Phone Calls")
    public WebElement phoneCalls;
	
	@FindBy(how = How.ID, using = "Button")
    public WebElement saveSettingdBtn;
	
	@FindBy(how = How.ID, using = "InputSuccess")
    public WebElement preferencesSuccessMsg;
}
