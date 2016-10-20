package mint.accountmanagement.stepDefs.runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.page.navigation.NavigatorFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
BrowserDriver driver = new BrowserDriver();
public String userdir=System.getProperty("user.dir");
	@Given("^I navigate to the MINT Account Management$")
	public void i_navigate_to_the_MINT_Account_Management() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.LoginNavigator().given_I_navigate_to_the_mint_url();
	}
	@When("^I provide \"([^\"]*)\" in PhoneNumber field$")
	public void i_provide_in_PhoneNumber_field(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NavigatorFactory.LoginNavigator().when_I_provide_username(username);
	}
	@When("^I provide \"([^\"]*)\" in Password field$")
	public void i_provide_in_Password_field(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NavigatorFactory.LoginNavigator().when_I_provide_password(password);
	}
	@Then("^I click on LogIn button$")
	public void i_click_on_LogIn_button() throws Throwable {

	    // Write code here that turns the phrase above into concrete actions
		NavigatorFactory.LoginNavigator().I_click_on_LogIn_button();
	}
	
	//Valid Login
	@Then("^I should see MINT Account Management hompage \"([^\"]*)\"$")
	public void i_should_see_MINT_Account_Management_hompage(String homeLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NavigatorFactory.HomeNavigator().homePageCheck(homeLink);
	}
	
	//Invalid Login
	@Then("^I should see \"([^\"]*)\" error message$")
	public void i_should_see_error_message(String errorMsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NavigatorFactory.LoginNavigator().I_should_see_error_msg(errorMsg);
	}

	//Temp Password
	@When("^I click on SMS a password to My Device button$")
	public void i_click_on_SMS_a_password_to_My_Device_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.LoginNavigator().I_click_on_SMS_a_password_to_My_Device_button();
	}
	@Then("^I should see Temporary Password Page \"([^\"]*)\"$")
	public void i_should_see_Temporary_Password_Page(String temporaryPasswordLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.TempPwdNavigator().temporaryPasswordPageCheck(temporaryPasswordLink);
	}
	@When("^I click on Send Password to My Device button$")
	public void i_click_on_Send_Password_to_My_Device_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.TempPwdNavigator().I_click_on_Send_Password_to_My_Device_button();
	}
	@Then("^I should see \"([^\"]*)\" message$")
	public void i_should_see_message(String successMsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.TempPwdNavigator().I_should_see_forgot_password_success_msg(successMsg);
	}
	@Then("^I click on Back To Login button$")
	public void i_click_on_Back_To_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.TempPwdNavigator().I_click_on_Back_To_Login_button();
	}
	@Then("^I should see Login Page \"([^\"]*)\"$")
	public void i_should_see_Login_Page(String loginLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.TempPwdNavigator().I_should_see_Login_Page(loginLink);
	}

	//UpData
	@When("^I click on UpData button$")
	public void i_click_on_UpData_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 NavigatorFactory.HomeNavigator().I_click_on_UpData_button();  
	}

	@Then("^I should see UpData Page \"([^\"]*)\"$")
	public void i_should_see_UpData_Page(String upDataLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.UpDataNavigator().I_should_see_UpData_Page(upDataLink);
	}

	@Then("^I click on Continue button for Data \"([^\"]*)\"$")
	public void i_click_on_Continue_button_for_Data(String UpData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   NavigatorFactory.UpDataNavigator().I_click_on_Continue_button_for_Data(UpData);
	}
	//Load Wallet
	@When("^I click on Load Wallet button$")
	public void i_click_on_Load_Wallet_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.HomeNavigator().I_click_on_Load_Wallet_button();
	}

	@Then("^I should see Load Wallet Page \"([^\"]*)\"$")
	public void i_should_see_Load_Wallet_Page(String loadWalletLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.LoadWalletNavigator().I_should_see_Load_Wallet_Page(loadWalletLink);
	}

	@Then("^I click on Continue button for wallet amount \"([^\"]*)\"$")
	public void i_click_on_Continue_button_for_wallet_amount(String walletAmount) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.LoadWalletNavigator().I_click_on_Continue_button_for_wallet_amount(walletAmount);
	}
	//Manage Plan - Future
	@When("^I click on Manage Plan button$")
	public void i_click_on_Manage_Plan_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.HomeNavigator().I_click_on_Manage_Plan_button();
	}

	@Then("^I should see Manage Plan Page \"([^\"]*)\"$")
	public void i_should_see_Manage_Plan_Page(String managePlanLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.ManagePlanNavigator().I_should_see_Manage_Plan_Page(managePlanLink);
	}

	@Then("^I select Next Plan as \"([^\"]*)\"$")
	public void i_select_Next_Plan_as(String nextPlan) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.ManagePlanNavigator().I_select_Next_Plan_as(nextPlan);
	}

	@Then("^I click on Set as Next Plan button$")
	public void i_click_on_Set_as_Next_Plan_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.ManagePlanNavigator().I_click_on_Set_as_Next_Plan_button();
	}
	
	@Then("^I should see Success Message in Manage Plan Page$")
	public void i_should_see_Success_Message_in_Manage_Plan_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.ManagePlanNavigator().i_should_see_Success_Message_in_Manage_Plan_Page();
	}
	//Manage Plan - Immediate Plan Change
	@Then("^I select Immediate Plan as \"([^\"]*)\"$")
	public void i_select_Immediate_Plan_as(String ImmediatePlan) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.ManagePlanNavigator().i_select_Immediate_Plan_as(ImmediatePlan);
	}

	@Then("^I click on Switch Immediately button$")
	public void i_click_on_Switch_Immediately_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NavigatorFactory.ManagePlanNavigator().i_click_on_Switch_Immediately_button();	   
	}
	//Checkout
	@Then("^I should see Checkout Page \"([^\"]*)\"$")
	public void i_should_see_Checkout_Page(String checkoutLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.CheckoutNavigator().I_should_see_Checkout_Page(checkoutLink);
	}

	@Then("^I select Payment Method as \"([^\"]*)\"$")
	public void i_select_Payment_Method_as(String paymentMethod) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.CheckoutNavigator().I_select_Payment_Method_as(paymentMethod);
	}

	@Then("^I click on Purchase Now button$")
	public void i_click_on_Purchase_Now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.CheckoutNavigator().i_click_on_Purchase_Now_button();
	}

	@Then("^I should see Success Message$")
	public void i_should_see_Success_Message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.CheckoutNavigator().I_should_see_Success_Message();
	}

	@Then("^I click on Return to Account Summary button$")
	public void i_click_on_Return_to_Account_Summary_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.CheckoutNavigator().I_click_on_Return_to_Account_Summary_button();
	}
	
	//Auto Recharge On/Off
	@When("^I click on Auto Recharge button$")
	public void i_click_on_Auto_Recharge_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.HomeNavigator().I_click_on_Auto_Recharge_button();
	}

	@Then("^I should see Auto Recharge Page \"([^\"]*)\"$")
	public void i_should_see_Auto_Recharge_Page(String autoRechargeLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.AutoRechargeNavigator().I_should_see_Auto_Recharge_Page(autoRechargeLink);
	}

	@Then("^I select Auto Recharge \"([^\"]*)\" button$")
	public void i_select_Auto_Recharge_button(String autoRecharge) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.AutoRechargeNavigator().I_select_Auto_Recharge_button(autoRecharge);
	}

	@Then("^I click on Save Settings button$")
	public void i_click_on_Save_Settings_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  NavigatorFactory.AutoRechargeNavigator().I_click_on_Save_Settings_button();
	}

	@Then("^I should see Success Message in Auto Recharge Page$")
	public void i_should_see_Success_Message_in_Auto_Recharge_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.AutoRechargeNavigator().i_should_see_Success_Message_in_Auto_Recharge_Page();
	}
	@Then("^I click on Edit Billing Info link$")
	public void i_click_on_Edit_Billing_Info_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.AutoRechargeNavigator().i_click_on_Edit_Billing_Info_link();
	}

	@Then("^I should see Edit Billing Info Page \"([^\"]*)\"$")
	public void i_should_see_Edit_Billing_Info_Page(String editBillingInfoLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_should_see_Edit_Billing_Info_Page(editBillingInfoLink);
	}
	
	
	//Billing Info
	@When("^I click on Billing Info button$")
	public void i_click_on_Billing_Info_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.HomeNavigator().I_click_on_Billing_Info_button();
	}

	@Then("^I should see Billing Info Page \"([^\"]*)\"$")
	public void i_should_see_Billing_Info_Page(String billingInfoLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_should_see_Billing_Info_Page(billingInfoLink);
	}

	@Then("^I click on Change Billing Info button$")
	public void i_click_on_Change_Billing_Info_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_click_on_Change_Billing_Info_button();
	}
	@Then("^I provide \"([^\"]*)\" in CreditCard field$")
	public void i_provide_in_CreditCard_field(String CCNumber) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_provide_in_CreditCard_field(CCNumber);
	}

	@Then("^I provide \"([^\"]*)\" in CVV field$")
	public void i_provide_in_CVV_field(String CVV) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_provide_in_CVV_field(CVV);
	}

	@Then("^I provide \"([^\"]*)\" in Expiry field$")
	public void i_provide_in_Expiry_field(String exp) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_provide_in_Expiry_field(exp);
	}

	@Then("^I provide \"([^\"]*)\" in FirstName field$")
	public void i_provide_in_FirstName_field(String firstName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_provide_in_FirstName_field(firstName);
	}

	@Then("^I provide \"([^\"]*)\" in LastName field$")
	public void i_provide_in_LastName_field(String lastName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_provide_in_LastName_field(lastName);
	}

	@Then("^I provide \"([^\"]*)\" in Address field$")
	public void i_provide_in_Address_field(String address1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_provide_in_Address_field(address1);
	}
	@Then("^I provide \"([^\"]*)\" in SecAddress field$")
	public void i_provide_in_SecAddress_field(String address2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_provide_in_SecAddress_field(address2);
	}
	@Then("^I provide \"([^\"]*)\" in City field$")
	public void i_provide_in_City_field(String city) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_provide_in_City_field(city);
	}

	@Then("^I provide \"([^\"]*)\" in State field$")
	public void i_provide_in_State_field(String state) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_provide_in_State_field(state);
	}

	@Then("^I provide \"([^\"]*)\" in ZipCode field$")
	public void i_provide_in_ZipCode_field(String zipCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_provide_in_ZipCode_field(zipCode);
	}

	@Then("^I click on UpDate Billing Info button$")
	public void i_click_on_UpDate_Billing_Info_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().I_click_on_UpDate_Billing_Info_button();
	}

	@Then("^I should see Success Message in Billing Info Page$")
	public void i_should_see_Success_Message_in_Billing_Info_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.BillingInfoNavigator().i_should_see_Success_Message_in_Billing_Info_Page();
	}
	
	
	//Updating Personal Info
	@When("^I click on Personal Info button$")
	public void i_click_on_Personal_Info_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.HomeNavigator().I_click_on_Personal_Info_button();
	}

	@Then("^I should see Personal Info Page \"([^\"]*)\"$")
	public void i_should_see_Personal_Info_Page(String personalInfoLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.PersonalInfoNavigator().I_should_see_Personal_Info_Page(personalInfoLink);
	}

	@Then("^I provide \"([^\"]*)\" in First Name field$")
	public void i_provide_in_First_Name_field(String firstName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.PersonalInfoNavigator().I_provide_in_First_Name_field(firstName);
	}

	@Then("^I provide \"([^\"]*)\" in Last Name field$")
	public void i_provide_in_Last_Name_field(String lastName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.PersonalInfoNavigator().I_provide_in_Last_Name_field(lastName);
	}

	@Then("^I provide \"([^\"]*)\" in Email field$")
	public void i_provide_in_Email_field(String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.PersonalInfoNavigator().I_provide_in_Email_field(email);
	}

	@Then("^I provide \"([^\"]*)\" in Update Password field$")
	public void i_provide_in_Update_Password_field(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.PersonalInfoNavigator().I_provide_in_Update_Password_field(password);
	}

	@Then("^I provide \"([^\"]*)\" in Update Confirm Password field$")
	public void i_provide_in_Update_Confirm_Password_field(String cnfmpassword) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.PersonalInfoNavigator().I_provide_in_Confirm_Password_field(cnfmpassword);
	}

	@Then("^I click on Update Personal Information button$")
	public void i_click_on_Update_Personal_Information_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NavigatorFactory.PersonalInfoNavigator().I_click_on_Update_Personal_Information_button();
	}

	@Then("^I should see Success Message in Personal Info Page$")
	public void i_should_see_Success_Message_in_Personal_Info_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.PersonalInfoNavigator().I_should_see_Success_Message_in_Personal_Info_Page();
	}

	//Account Preferences
	@When("^I click on Preferences button$")
	public void i_click_on_Preferences_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.HomeNavigator().I_click_on_Preferences_button();
	}

	@Then("^I should see Account Preferences Page \"([^\"]*)\"$")
	public void i_should_see_Account_Preferences_Page(String accountPreferencesLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.PreferencesNavigator().I_should_see_Account_Preferences_Page(accountPreferencesLink);
	}

	@Then("^I \"([^\"]*)\" SMS to receive promotional communications$")
	public void i_SMS_to_receive_promotional_communications(String preferenceOption) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.PreferencesNavigator().I_SMS_to_receive_promotional_communications(preferenceOption);
	}

	@Then("^I \"([^\"]*)\" Email to receive promotional communications$")
	public void i_Email_to_receive_promotional_communications(String preferenceOption) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.PreferencesNavigator().I_Email_to_receive_promotional_communications(preferenceOption);
	}

	@Then("^I \"([^\"]*)\" Phone Calls to receive promotional communications$")
	public void i_Phone_Calls_to_receive_promotional_communications(String preferenceOption) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   NavigatorFactory.PreferencesNavigator().I_Phone_Calls_to_receive_promotional_communications(preferenceOption);
	}

	@Then("^I click on Save Settings button in Account Preferences Page$")
	public void i_click_on_Save_Settings_button_in_Account_Preferences_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.PreferencesNavigator().I_click_on_Save_Settings_button_in_Account_Preferences_Page();
	}

	@Then("^I should see Success Message in Account Preferences Page$")
	public void i_should_see_Success_Message_in_Account_Preferences_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.PreferencesNavigator().I_should_see_Success_Message_in_Account_Preferences_Page();
	}
	
	
	//Transaction History
	@When("^I click on Transaction History button$")
	public void i_click_on_Transaction_History_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.HomeNavigator().I_click_on_Transaction_History_button();
	}

	@Then("^I should see Transaction History Page \"([^\"]*)\"$")
	public void i_should_see_Transaction_History_Page(String transactionLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   NavigatorFactory.TransactionHistoryNavigator().I_should_see_Transaction_History_Page(transactionLink);
	}

	@Then("^I should see Transaction Info Date,OrderID,Tpe,Ammount and Description$")
	public void i_should_see_Transaction_Info_Date_OrderID_Type_Amount_and_Description() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   NavigatorFactory.TransactionHistoryNavigator().I_should_see_Transaction_Info_Date_OrderID_Type_Amount_and_Description();
	}

	@Then("^I click on See More button in Transaction History Page$")
	public void i_click_on_See_More_button_in_Transaction_History_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NavigatorFactory.TransactionHistoryNavigator().I_click_on_See_More_button_in_Transaction_History_Page();
	   	}

	
	//INTL Call History
	@When("^I click on INTL Call History button$")
	public void i_click_on_INTL_Call_History_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   NavigatorFactory.HomeNavigator().I_click_on_INTL_Call_History_button();
	}

	@Then("^I should see INTL Call History Page \"([^\"]*)\"$")
	public void i_should_see_INTL_Call_History_Page(String intlCallLink) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   NavigatorFactory.INTLCallHistoryNavigator().I_should_see_INTL_Call_History_Page(intlCallLink);
	}

	@Then("^I should see INTL Call Info Time,Destination,Number,Duration,Rate and Cost$")
	public void i_should_see_INTL_Call_Info_Time_Destination_Number_Duration_Rate_and_Cost() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   NavigatorFactory.INTLCallHistoryNavigator().I_should_see_INTL_Call_Info_Time_Destination_Number_Duration_Rate_and_Cost();
	}

	@Then("^I click on See More button in INTL Call History Page$")
	public void i_click_on_See_More_button_in_INTL_Call_History_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   NavigatorFactory.INTLCallHistoryNavigator().I_click_on_See_More_button_in_INTL_Call_History_Page();
	}
	
	//Logout
	@Then("^I click on Logout button$")
	public void i_click_on_Logout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    NavigatorFactory.HomeNavigator().I_click_on_Logout_button();
	}
	
	//Data Balance Check
	@Then("^I click on Data Check button$")
	public void i_click_on_Data_Check_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NavigatorFactory.HomeNavigator().I_click_on_Data_Check_button();
	}

	@Then("^I should see available Data Balance$")
	public void i_should_see_available_Data_Balance() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NavigatorFactory.HomeNavigator().I_should_see_available_Data_Balance();
	}
	
	//Recharge
	@Then("^I click on Recharge Now button$")
	public void i_click_on_Recharge_Now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NavigatorFactory.HomeNavigator().I_click_on_Recharge_Now_button();
	}
     @After
     public void embedScreenshot(Scenario scenario) {
         System.out.println("as");
         if(scenario.isFailed()) {
         try {
        	 System.out.println("yes");
         	 scenario.write("Current Page URL is " + driver.getCurrentDriver().getCurrentUrl());
         	 System.out.println(driver.getCurrentDriver().getCurrentUrl());
         	 System.out.println(scenario.getName());
//             byte[] screenshot = getScreenshotAs(OutputType.BYTES);
             File screenshot = ((TakesScreenshot)driver.getCurrentDriver()).getScreenshotAs(OutputType.FILE);
             try {
				FileUtils.copyFile(screenshot, new File(userdir+"/Screenshots/"+scenario.getName()+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
             System.out.println(screenshot.getAbsolutePath());
//             scenario.embed(screenshot, "image/png");
         } catch (WebDriverException somePlatformsDontSupportScreenshots) {
             System.err.println(somePlatformsDontSupportScreenshots.getMessage());
         }
         
         }
         
     }
 
}
