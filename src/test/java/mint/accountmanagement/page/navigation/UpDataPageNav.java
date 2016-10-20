package mint.accountmanagement.page.navigation;

import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.pageobjects.containers.UpDataPageObjects;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class UpDataPageNav {
	
	
	private static final UpDataPageObjects updataContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), UpDataPageObjects.class);
	
	
	public void I_should_see_UpData_Page(String upDataLink)
	{
		BrowserDriver.waitForElement(updataContainer.Data_1GB);
		assertTrue(updataContainer.Data_1GB.isDisplayed());
		BrowserDriver.URLCheck(upDataLink, 20);
	}
	public void I_click_on_Continue_button_for_Data(String UpData)
	{
		if(UpData.equalsIgnoreCase("1GB")){
			updataContainer.Data_1GB.click();
			BrowserDriver.URLCheck("/account/checkout?id=MDATA_1024_10&item=boltOn", 20);
			}
		else if(UpData.equalsIgnoreCase("3GB")){
			updataContainer.Data_3GB.click();
			BrowserDriver.URLCheck("/account/checkout?id=MDATA_3072_20&item=boltOn", 20);
		}
	}
}
