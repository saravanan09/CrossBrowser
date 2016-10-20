package mint.accountmanagement.page.navigation;

import static org.junit.Assert.*;
import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.pageobjects.containers.PreferencesPageObjects;

import org.openqa.selenium.support.PageFactory;

public class PreferencesPageNav {
	private static final PreferencesPageObjects preferencesContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PreferencesPageObjects.class);
	
	public void I_should_see_Account_Preferences_Page(String accountPreferencesLink){
		BrowserDriver.WebPageLoader(3000);
		BrowserDriver.waitForElement(preferencesContainer.saveSettingdBtn, 20);
		assertTrue(preferencesContainer.saveSettingdBtn.isDisplayed());
		BrowserDriver.URLCheck(accountPreferencesLink, 20);
	}
	
	public void I_SMS_to_receive_promotional_communications(String preferenceOption){
		if(preferenceOption.equalsIgnoreCase("select")){
			System.out.println(preferencesContainer.SMS.isSelected());
			if(!preferencesContainer.SMS.isSelected()){
				System.out.println("Selected");
				preferencesContainer.SMS.click();
				
			}
			else{
				System.out.println("Already selected");
				
			}
		}
		else if(preferenceOption.equalsIgnoreCase("unselect")){
		if(!preferencesContainer.SMS.isSelected()){
			System.out.println("Unselect");
			preferencesContainer.SMS.click();
			
		}
		else{
			System.out.println("Already Unselected");
			}
		}
	}
	
	public void I_Email_to_receive_promotional_communications(String preferenceOption){
		if(preferenceOption.equalsIgnoreCase("select")){
			if(!preferencesContainer.emails.isSelected()){
				System.out.println("Selected");
				preferencesContainer.emails.click();
				
			}
			else{
				System.out.println("Already selected");
			}
		}
		else if(preferenceOption.equalsIgnoreCase("unselect")){
		if(!preferencesContainer.emails.isSelected()){
			System.out.println("Unselect");
			preferencesContainer.emails.click();
			
		}
		else{
			
			System.out.println("Already Unselected");
		}
		}
	}
	
	public void I_Phone_Calls_to_receive_promotional_communications(String preferenceOption){
		if(preferenceOption.equalsIgnoreCase("select")){
			if(!preferencesContainer.phoneCalls.isSelected()){
				System.out.println("Selected");
				preferencesContainer.phoneCalls.click();
				
				
			}
			else{
				System.out.println("Already selected");
				
			}
		}
		else if(preferenceOption.equalsIgnoreCase("unselect")){
			System.out.println(preferencesContainer.phoneCalls.isSelected());
		if(!preferencesContainer.phoneCalls.isSelected()){
			System.out.println("Unselect");
			preferencesContainer.phoneCalls.click();
			
		}
		else{
			System.out.println("Already Unselected");
		}
		}
	}
	
	public void I_click_on_Save_Settings_button_in_Account_Preferences_Page(){
		BrowserDriver.WebPageLoader(3000);
		preferencesContainer.saveSettingdBtn.click();
	}
	
	public void I_should_see_Success_Message_in_Account_Preferences_Page(){
		BrowserDriver.WebPageLoader(3000);
		BrowserDriver.waitForElement(preferencesContainer.preferencesSuccessMsg, 20);
		assertTrue(preferencesContainer.preferencesSuccessMsg.isDisplayed());
		assertEquals("Your preferences have successfully been updated.",preferencesContainer.preferencesSuccessMsg.getText());
	}
}
