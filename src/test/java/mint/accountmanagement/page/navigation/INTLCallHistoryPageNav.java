package mint.accountmanagement.page.navigation;

import static org.junit.Assert.assertTrue;
import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.pageobjects.containers.INTLCallHistoryPageObjects;
import mint.accountmanagement.pageobjects.containers.TransactionHistoryPageObjects;

import org.openqa.selenium.support.PageFactory;

public class INTLCallHistoryPageNav {

	private static final INTLCallHistoryPageObjects intlcallhistoryContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), INTLCallHistoryPageObjects.class);
	
	public void I_should_see_INTL_Call_History_Page(String intlCallLink){
		BrowserDriver.WebPageLoader(3000);
		BrowserDriver.waitForElement(intlcallhistoryContainer.SeeMoreBtn, 20);
		assertTrue(intlcallhistoryContainer.SeeMoreBtn.isDisplayed());
		BrowserDriver.URLCheck(intlCallLink, 20);
	}
	
	public void I_should_see_INTL_Call_Info_Time_Destination_Number_Duration_Rate_and_Cost(){
		BrowserDriver.WebPageLoader(3000);
		assertTrue(intlcallhistoryContainer.TIME.isDisplayed());
		assertTrue(intlcallhistoryContainer.DESTINATION.isDisplayed());
		assertTrue(intlcallhistoryContainer.NUMBER.isDisplayed());
		assertTrue(intlcallhistoryContainer.DURATION.isDisplayed());
		assertTrue(intlcallhistoryContainer.RATE.isDisplayed());
		assertTrue(intlcallhistoryContainer.COST.isDisplayed());
	}
	public void I_click_on_See_More_button_in_INTL_Call_History_Page(){
		intlcallhistoryContainer.SeeMoreBtn.click();
	}
}
