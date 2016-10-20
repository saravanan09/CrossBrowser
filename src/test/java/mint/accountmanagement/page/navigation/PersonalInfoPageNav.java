package mint.accountmanagement.page.navigation;


import static org.junit.Assert.*;
import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.pageobjects.containers.PersonalInfoPageObjects;

import org.openqa.selenium.support.PageFactory;

public class PersonalInfoPageNav {

	private static final PersonalInfoPageObjects personalinfoContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PersonalInfoPageObjects.class);
	
	public void I_should_see_Personal_Info_Page(String personalInfoLink){
		BrowserDriver.WebPageLoader(3000);
		BrowserDriver.waitForElement(personalinfoContainer.UpdatePersonalInfoBtn, 20);
		assertTrue(personalinfoContainer.UpdatePersonalInfoBtn.isDisplayed());
		BrowserDriver.URLCheck(personalInfoLink, 20);
	}
	
	public void I_provide_in_First_Name_field(String firstName){
		BrowserDriver.WebPageLoader(3000);
		personalinfoContainer.firstName.clear();
		personalinfoContainer.firstName.sendKeys(firstName);
	}
	
	public void I_provide_in_Last_Name_field(String secondName){
		personalinfoContainer.lastName.clear();
		personalinfoContainer.lastName.sendKeys(secondName);
	}
	
	public void I_provide_in_Email_field(String email){
		personalinfoContainer.email.clear();
		personalinfoContainer.email.sendKeys(email);
	}
	
	public void I_provide_in_Update_Password_field(String password){
		personalinfoContainer.password.sendKeys(password);
	}
	
	public void I_provide_in_Confirm_Password_field(String cnfmpassword){
		personalinfoContainer.confirmpassword.sendKeys(cnfmpassword);
	}
	
	public void I_click_on_Update_Personal_Information_button(){
		BrowserDriver.WebPageLoader(3000);
		personalinfoContainer.UpdatePersonalInfoBtn.click();
	}
	
	public void I_should_see_Success_Message_in_Personal_Info_Page(){
		BrowserDriver.WebPageLoader(3000);
		BrowserDriver.waitForElement(personalinfoContainer.UpdatePersonalInfoSuccessMsg, 20);
		assertTrue(personalinfoContainer.UpdatePersonalInfoSuccessMsg.isDisplayed());
		assertEquals("Your information has been saved.",personalinfoContainer.UpdatePersonalInfoSuccessMsg.getText());
	}
}
