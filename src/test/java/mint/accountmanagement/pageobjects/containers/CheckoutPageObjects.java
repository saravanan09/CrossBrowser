package mint.accountmanagement.pageobjects.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPageObjects {

	@FindBy(how = How.ID, using = "PaymentMethod_cc")
    public WebElement CC;
	
	@FindBy(how = How.ID, using = "PaymentMethod_wallet")
    public WebElement Wallet;
	
	@FindBy(how = How.ID, using = "Button")
    public WebElement PurchaseNow;
	
	@FindBy(how = How.ID, using = "InputSuccess")
    public WebElement SuccessMsg;
	
	@FindBy(how = How.ID, using = "InputError")
    public WebElement ErrorMsg;
	
	@FindBy(how = How.ID, using = "Button")
    public WebElement ReturntoAccountSummary;
	
}
