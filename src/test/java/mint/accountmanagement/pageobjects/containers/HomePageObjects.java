package mint.accountmanagement.pageobjects.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageObjects {

	@FindBy(how = How.ID, using = "logo")
    public WebElement Homelogo;
	
	@FindBy(how = How.ID, using = "Home")
    public WebElement home;
	
	@FindBy(how = How.ID, using = "UpData")
    public WebElement UpData;
	
	@FindBy(how = How.ID, using = "AutoRecharge")
    public WebElement AutoRecharge;
	
	@FindBy(how = How.ID, using = "LoadWallet")
    public WebElement LoadWallet;
	
	@FindBy(how = How.ID, using = "Billing")
    public WebElement BillingInfo;
	
	@FindBy(how = How.ID, using = "ManagePlan")
    public WebElement ManagePlan;
	
	@FindBy(how = How.ID, using = "TransactionHistory")
    public WebElement TransactionHistory;
	
	@FindBy(how = How.ID, using = "INTLCallHistory")
    public WebElement INTLCallHistory;
	
	@FindBy(how = How.ID, using = "Preferences")
    public WebElement Preferences;
	
	@FindBy(how = How.ID, using = "Info")
    public WebElement PersonalInfo;
	
	@FindBy(how = How.ID, using = "LogOut")
    public WebElement LogOut;
	
	@FindBy(how = How.ID, using = "chatBtn")
    public WebElement chatBtn;
	
	@FindBy(how = How.ID, using = "Button")
    public WebElement DataCheckButton;
	
	@FindBy(how = How.ID, using = "dataBalance")
    public WebElement DataBalance;
	
	@FindBy(how = How.ID, using = "RechargeNow")
    public WebElement RechargeNowBtn;
}
