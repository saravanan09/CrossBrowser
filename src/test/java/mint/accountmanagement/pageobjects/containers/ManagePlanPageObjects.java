package mint.accountmanagement.pageobjects.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ManagePlanPageObjects {

	@FindBy(how = How.ID, using = "M01S")
    public WebElement Plan_M01S;
	
	@FindBy(how = How.ID, using = "M01M")
    public WebElement Plan_M01M;
	
	@FindBy(how = How.ID, using = "M01L")
    public WebElement Plan_M01L;
	
	@FindBy(how = How.ID, using = "M03S")
    public WebElement Plan_M03S;
	
	@FindBy(how = How.ID, using = "M03M")
    public WebElement Plan_M03M;
	
	@FindBy(how = How.ID, using = "M03L")
    public WebElement Plan_M03L;
	
	@FindBy(how = How.ID, using = "M06S")
    public WebElement Plan_M06S;
	
	@FindBy(how = How.ID, using = "M06M")
    public WebElement Plan_M06M;
	
	@FindBy(how = How.ID, using = "M06L")
    public WebElement Plan_M06L;
	
	@FindBy(how = How.ID, using = "M12S")
    public WebElement Plan_M12S;
	
	@FindBy(how = How.ID, using = "M12M")
    public WebElement Plan_M12M;
	
	@FindBy(how = How.ID, using = "M12L")
    public WebElement Plan_M12L;
	
	@FindBy(how = How.ID, using = "SetNextBtn")
    public WebElement NextPlan;
	
	@FindBy(how = How.ID, using = "ImmediateBtn")
    public WebElement SwitchImmediately;
	
	@FindBy(how = How.ID, using = "AutoRecharge_Enable Auto Recharge")
    public WebElement AutoRecharge;
	
	@FindBy(how = How.ID, using = "InputSuccess")
    public WebElement SuccessMsg;
	
	
	
}
