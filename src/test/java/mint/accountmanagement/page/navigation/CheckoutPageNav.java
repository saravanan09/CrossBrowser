package mint.accountmanagement.page.navigation;

import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.pageobjects.containers.CheckoutPageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class CheckoutPageNav {
	private static final CheckoutPageObjects checkoutContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), CheckoutPageObjects.class);
	public void I_should_see_Checkout_Page(String checkoutLink){
		BrowserDriver.waitForElement(checkoutContainer.PurchaseNow);
		assertTrue(checkoutContainer.PurchaseNow.isDisplayed());
		BrowserDriver.URLCheck(checkoutLink, 10);
	}
	
	public void I_select_Payment_Method_as(String paymentMethod){
		BrowserDriver.WebPageLoader(5000);
			checkoutContainer.CC.isDisplayed();
			checkoutContainer.Wallet.isDisplayed();
			if(paymentMethod.equalsIgnoreCase("Credit Card")){
				System.out.println("CC");
				checkoutContainer.CC.click();
			}
			else if(paymentMethod.equalsIgnoreCase("Wallet")){
				checkoutContainer.Wallet.click();
			}
		
		
	}
	
	public void i_click_on_Purchase_Now_button() {
	    // Write code here that turns the phrase above into concrete actions
	
		BrowserDriver.WebPageLoader(5000);
		checkoutContainer.PurchaseNow.click();
	    
	}
	public void I_should_see_Success_Message() {
		try{	
		BrowserDriver.WebPageLoader(5000);
//		BrowserDriver.waitForElement(checkoutContainer.SuccessMsg,20);
		assertTrue(checkoutContainer.SuccessMsg.isDisplayed());
		}catch(NoSuchElementException e)
		{
			System.out.println(e);
			assertTrue(checkoutContainer.ErrorMsg.isDisplayed());
	        System.out.println("Purchase Error [" + checkoutContainer.ErrorMsg.getText() + "]");
		}
	}
	public void I_click_on_Return_to_Account_Summary_button(){
		BrowserDriver.WebPageLoader(7000);
		BrowserDriver.waitForElement(checkoutContainer.SuccessMsg,20);
		checkoutContainer.ReturntoAccountSummary.click();
	}
	
}
