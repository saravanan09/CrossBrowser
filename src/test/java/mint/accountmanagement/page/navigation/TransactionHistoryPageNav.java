package mint.accountmanagement.page.navigation;

import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.pageobjects.containers.HomePageObjects;
import mint.accountmanagement.pageobjects.containers.TransactionHistoryPageObjects;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class TransactionHistoryPageNav {

	private static final TransactionHistoryPageObjects transhistoryContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), TransactionHistoryPageObjects.class);
	
	public void I_should_see_Transaction_History_Page(String transactionLink){
		BrowserDriver.WebPageLoader(3000);
		BrowserDriver.waitForElement(transhistoryContainer.SeeMoreBtn, 20);
		assertTrue(transhistoryContainer.SeeMoreBtn.isDisplayed());
		BrowserDriver.URLCheck(transactionLink, 20);
	}
	public void I_should_see_Transaction_Info_Date_OrderID_Type_Amount_and_Description(){
		BrowserDriver.WebPageLoader(3000);
		assertTrue(transhistoryContainer.DATE.isDisplayed());
		assertTrue(transhistoryContainer.ORDERID.isDisplayed());
		assertTrue(transhistoryContainer.TYPE.isDisplayed());
		assertTrue(transhistoryContainer.AMOUNT.isDisplayed());
		assertTrue(transhistoryContainer.DESCRIPTION.isDisplayed());
		}
	public void I_click_on_See_More_button_in_Transaction_History_Page(){
		transhistoryContainer.SeeMoreBtn.click();
	}
}