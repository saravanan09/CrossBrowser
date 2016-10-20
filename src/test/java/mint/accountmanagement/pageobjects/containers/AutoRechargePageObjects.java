package mint.accountmanagement.pageobjects.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutoRechargePageObjects {

	@FindBy(how = How.ID, using = "autoRecharge_true")
    public WebElement AR_On;
	
	@FindBy(how = How.ID, using = "autoRecharge_false")
    public WebElement AR_Off;
	
	@FindBy(how = How.ID, using = "Button")
    public WebElement SaveSettings;
	
	@FindBy(how = How.ID, using = "Link")
    public WebElement EditBillingInfo;
	
	@FindBy(how = How.ID, using = "InputSuccess")
    public WebElement SuccessMsg;
}
