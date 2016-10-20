package mint.accountmanagement.page.navigation;

import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.pageobjects.containers.LoadWalletPageObjects;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class LoadWalletPageNav {
	private static final LoadWalletPageObjects loadwalletContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoadWalletPageObjects.class);
	
	public void I_should_see_Load_Wallet_Page(String LoadWalletLink){
		BrowserDriver.waitForElement(loadwalletContainer.Wallet_20);
		assertTrue(loadwalletContainer.Wallet_5.isDisplayed());
		assertTrue(loadwalletContainer.Wallet_10.isDisplayed());
		assertTrue(loadwalletContainer.Wallet_20.isDisplayed());
		BrowserDriver.URLCheck(LoadWalletLink, 10);
	}
	public void I_click_on_Continue_button_for_wallet_amount(String WalletAmount){
		if(WalletAmount.equalsIgnoreCase("5")){
			loadwalletContainer.Wallet_5.click();
		}
		else if(WalletAmount.equalsIgnoreCase("10")){
			loadwalletContainer.Wallet_10.click();
		}
		else if(WalletAmount.equalsIgnoreCase("20")){
			loadwalletContainer.Wallet_20.click();
		}
		BrowserDriver.URLCheck("/account/checkout?amount="+WalletAmount+"&item=wallet", 20);
	}
}
