package mint.accountmanagement.page.navigation;

import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.pageobjects.containers.AutoRechargePageObjects;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class AutoRechargePageNav {
	private static final AutoRechargePageObjects autorechargeContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AutoRechargePageObjects.class);

	public void I_should_see_Auto_Recharge_Page(String autoRechargeLink){
		BrowserDriver.waitForElement(autorechargeContainer.AR_On);
		assertTrue(autorechargeContainer.AR_On.isDisplayed());
		BrowserDriver.URLCheck(autoRechargeLink, 10);
	}
	
	public void I_select_Auto_Recharge_button(String autoRecharge){
		BrowserDriver.WebPageLoader(3000);
		if(autoRecharge.equalsIgnoreCase("On")){
			autorechargeContainer.AR_On.click();
		}
		else if(autoRecharge.equalsIgnoreCase("Off")){
			autorechargeContainer.AR_Off.click();
		}
	}
	public void I_click_on_Save_Settings_button(){
		BrowserDriver.WebPageLoader(3000);
		BrowserDriver.waitForElement(autorechargeContainer.SaveSettings, 20);
		autorechargeContainer.SaveSettings.click();
	}
	public void i_should_see_Success_Message_in_Auto_Recharge_Page(){
		BrowserDriver.waitForElement(autorechargeContainer.SuccessMsg, 20);
		autorechargeContainer.SuccessMsg.isDisplayed();
		assertEquals("You've successfully updated your Auto Recharge settings.",autorechargeContainer.SuccessMsg.getText());
	}
	public void i_click_on_Edit_Billing_Info_link(){
		BrowserDriver.WebPageLoader(3000);
		autorechargeContainer.EditBillingInfo.click();
	}
	
}
