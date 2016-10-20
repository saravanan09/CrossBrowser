package mint.accountmanagement.page.navigation;

import mint.accounrmanagement.utils.BrowserDriver;
import mint.accountmanagement.pageobjects.containers.ManagePlanPageObjects;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class ManagePlanPageNav {
	private static final ManagePlanPageObjects manageplanContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ManagePlanPageObjects.class);
	public static String PlanName;
	public void I_should_see_Manage_Plan_Page(String managePlanLink){
		BrowserDriver.waitForElement(manageplanContainer.NextPlan);
		assertTrue(manageplanContainer.NextPlan.isDisplayed());
		BrowserDriver.URLCheck(managePlanLink, 20);
	}
	
	public void I_select_Next_Plan_as(String nextPlan){
		BrowserDriver.WebPageLoader(5000);
		BrowserDriver.waitForElement(manageplanContainer.Plan_M01S);
		if(nextPlan.equalsIgnoreCase("M01S")){
			manageplanContainer.Plan_M01S.click();}
		else if(nextPlan.equalsIgnoreCase("M01M")){
			manageplanContainer.Plan_M01M.click();}
		else if(nextPlan.equalsIgnoreCase("M01L")){
			manageplanContainer.Plan_M01L.click();}
		else if(nextPlan.equalsIgnoreCase("M03S")){
			manageplanContainer.Plan_M03S.click();}
		else if(nextPlan.equalsIgnoreCase("M03M")){
			manageplanContainer.Plan_M03M.click();}
		else if(nextPlan.equalsIgnoreCase("M03L")){
			manageplanContainer.Plan_M03L.click();}
		else if(nextPlan.equalsIgnoreCase("M06S")){
			manageplanContainer.Plan_M06S.click();}
		else if(nextPlan.equalsIgnoreCase("M06M")){
			manageplanContainer.Plan_M06M.click();}
		else if(nextPlan.equalsIgnoreCase("M06L")){
			manageplanContainer.Plan_M06L.click();}
		else if(nextPlan.equalsIgnoreCase("M12S")){
			manageplanContainer.Plan_M12S.click();}
		else if(nextPlan.equalsIgnoreCase("M12M")){
			manageplanContainer.Plan_M12M.click();}
		else if(nextPlan.equalsIgnoreCase("M12L")){
			manageplanContainer.Plan_M12L.click();}
	}
	public void I_click_on_Set_as_Next_Plan_button(){
		manageplanContainer.NextPlan.click();
	}
	public void i_should_see_Success_Message_in_Manage_Plan_Page(){
		BrowserDriver.waitForElement(manageplanContainer.SuccessMsg, 20);
		assertTrue(manageplanContainer.SuccessMsg.isDisplayed());
		assertEquals("You have successfully selected your next plan.",manageplanContainer.SuccessMsg.getText());
	}
	
	public void i_select_Immediate_Plan_as(String ImmediatePlan){
		BrowserDriver.WebPageLoader(5000);
		if(ImmediatePlan.equalsIgnoreCase("M01M")){
			manageplanContainer.Plan_M01M.click();}
		else if(ImmediatePlan.equalsIgnoreCase("M01L")){
			manageplanContainer.Plan_M01L.click();}
		else if(ImmediatePlan.equalsIgnoreCase("M03M")){
			manageplanContainer.Plan_M03M.click();}
		else if(ImmediatePlan.equalsIgnoreCase("M03L")){
			manageplanContainer.Plan_M03L.click();}
		else if(ImmediatePlan.equalsIgnoreCase("M06M")){
			manageplanContainer.Plan_M06M.click();}
		else if(ImmediatePlan.equalsIgnoreCase("M06L")){
			manageplanContainer.Plan_M06L.click();}
		else if(ImmediatePlan.equalsIgnoreCase("M12M")){
			manageplanContainer.Plan_M12M.click();}
		else if(ImmediatePlan.equalsIgnoreCase("M12L")){
			manageplanContainer.Plan_M12L.click();}
		PlanName=ImmediatePlan;
	}
	public void i_click_on_Switch_Immediately_button(){
		
		BrowserDriver.waitForElementToClickable(manageplanContainer.SwitchImmediately, 10);
		manageplanContainer.SwitchImmediately.click();
		BrowserDriver.URLCheck("/account/checkout?item=plan&id="+PlanName, 20);
	}
}
