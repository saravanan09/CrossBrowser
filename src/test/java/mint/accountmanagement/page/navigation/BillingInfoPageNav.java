package mint.accountmanagement.page.navigation;

import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.pageobjects.containers.BillingInfoPageObjects;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class BillingInfoPageNav {
	private static final BillingInfoPageObjects billinginfoContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), BillingInfoPageObjects.class);
	
	public void I_should_see_Edit_Billing_Info_Page(String editBillingInfoLink){
		BrowserDriver.WebPageLoader(3000);
		BrowserDriver.waitForElement(billinginfoContainer.UpdateBillingInfoBtn, 20);
		assertTrue(billinginfoContainer.UpdateBillingInfoBtn.isDisplayed());
		BrowserDriver.URLCheck(editBillingInfoLink, 20);
	}
	
	public void I_should_see_Billing_Info_Page(String billingInfoLink){
		BrowserDriver.WebPageLoader(3000);
		BrowserDriver.waitForElement(billinginfoContainer.ChangeBillingInfo, 20);
		assertTrue(billinginfoContainer.ChangeBillingInfo.isDisplayed());
		BrowserDriver.URLCheck(billingInfoLink, 20);
	}
	
	public void I_click_on_Change_Billing_Info_button(){
		BrowserDriver.WebPageLoader(3000);
		billinginfoContainer.ChangeBillingInfo.click();
	}
	
	public void I_provide_in_CreditCard_field(String CCNumber){
		BrowserDriver.WebPageLoader(3000);
		BrowserDriver.waitForElement(billinginfoContainer.UpdateBillingInfoBtn, 20);
		assertTrue(billinginfoContainer.UpdateBillingInfoBtn.isDisplayed());
		billinginfoContainer.CCNumberInfo.sendKeys(CCNumber);
	}
	
	public void I_provide_in_CVV_field(String CVV){
		billinginfoContainer.CVVInfo.sendKeys(CVV);
	}
	public void I_provide_in_Expiry_field(String exp){
		billinginfoContainer.ExpiryInfo.sendKeys(exp);
	}
	public void I_provide_in_FirstName_field(String firstName){
		billinginfoContainer.FirstName.sendKeys(firstName);
	}
	public void I_provide_in_LastName_field(String lastName){
		billinginfoContainer.LastName.sendKeys(lastName);
	}
	public void I_provide_in_Address_field(String address1){
		billinginfoContainer.Address1.sendKeys(address1);
	}
	public void I_provide_in_SecAddress_field(String address2){
		billinginfoContainer.Address2.sendKeys(address2);
	}
	public void I_provide_in_City_field(String city){
		billinginfoContainer.City.sendKeys(city);
	}
	public void I_provide_in_State_field(String state){
		billinginfoContainer.State.sendKeys(state);
	}
	public void I_provide_in_ZipCode_field(String zipCode){
		billinginfoContainer.ZipCode.sendKeys(zipCode);
	}
	public void I_click_on_UpDate_Billing_Info_button(){
		billinginfoContainer.UpdateBillingInfoBtn.click();
	}
	
	public void i_should_see_Success_Message_in_Billing_Info_Page(){
		BrowserDriver.WebPageLoader(3000);
		BrowserDriver.waitForElement(billinginfoContainer.BillingInfoSuccessMsg, 20);
		assertTrue(billinginfoContainer.BillingInfoSuccessMsg.isDisplayed());
		assertEquals("You've successfully updated your credit card.",billinginfoContainer.BillingInfoSuccessMsg.getText());
	}
}
