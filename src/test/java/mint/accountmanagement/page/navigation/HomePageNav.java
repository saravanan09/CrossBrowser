package mint.accountmanagement.page.navigation;

import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.pageobjects.containers.HomePageObjects;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class HomePageNav {
	private static final HomePageObjects homeContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePageObjects.class);
	
	public void homePageCheck(String HomeLink)
	{
		BrowserDriver.waitForElement(homeContainer.Homelogo,20);
		assertTrue(homeContainer.Homelogo.isDisplayed());
		BrowserDriver.URLCheck(HomeLink, 20);
	}
	public void I_click_on_UpData_button()
	{
		BrowserDriver.WebPageLoader(3000);
		homeContainer.UpData.click();
	}
	public void I_click_on_Load_Wallet_button()
	{
		BrowserDriver.WebPageLoader(3000);
		homeContainer.LoadWallet.click();
	}
	public void I_click_on_Manage_Plan_button()
	{
		BrowserDriver.WebPageLoader(3000);
		homeContainer.ManagePlan.click();
	}
	public void I_click_on_Auto_Recharge_button()
	{
		BrowserDriver.WebPageLoader(3000);
		homeContainer.AutoRecharge.click();
	}
	public void I_click_on_Billing_Info_button()
	{
		BrowserDriver.WebPageLoader(3000);
		homeContainer.BillingInfo.click();
	}
	public void I_click_on_Personal_Info_button()
	{
		BrowserDriver.WebPageLoader(3000);
		homeContainer.PersonalInfo.click();
	}
	public void I_click_on_Preferences_button()
	{
		BrowserDriver.WebPageLoader(3000);
		homeContainer.Preferences.click();
	}
	public void I_click_on_Transaction_History_button()
	{
		BrowserDriver.WebPageLoader(3000);
		homeContainer.TransactionHistory.click();
	}
	public void I_click_on_INTL_Call_History_button()
	{
		BrowserDriver.WebPageLoader(3000);
		homeContainer.INTLCallHistory.click();
	}
	public void I_click_on_Logout_button()
	{
		BrowserDriver.WebPageLoader(3000);
		assertTrue(homeContainer.LogOut.getAttribute("href").contains("/logout"));
		homeContainer.LogOut.click();
		
	}
	public void I_click_on_Data_Check_button()
	{
		BrowserDriver.WebPageLoader(3000);
		homeContainer.DataCheckButton.click();
	}
	public void I_should_see_available_Data_Balance(){
		BrowserDriver.waitForElement(homeContainer.DataBalance,20);
		assertTrue(homeContainer.DataBalance.isDisplayed());
	}
	
	public void I_click_on_Recharge_Now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BrowserDriver.WebPageLoader(3000);
		homeContainer.RechargeNowBtn.click();
		BrowserDriver.URLCheck("/account/checkout?item=recharge", 20);
	}

}
