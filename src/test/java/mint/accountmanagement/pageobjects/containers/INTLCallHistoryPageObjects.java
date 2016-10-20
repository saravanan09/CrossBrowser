package mint.accountmanagement.pageobjects.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class INTLCallHistoryPageObjects {

	@FindBy(how = How.ID, using = "Button")
    public WebElement SeeMoreBtn;
	
	@FindBy(how = How.XPATH, using = "//*[text()='TIME']")
    public WebElement TIME;
	
	@FindBy(how = How.XPATH, using = "//*[text()='DESTINATION']")
    public WebElement DESTINATION;
	
	@FindBy(how = How.XPATH, using = "//*[text()='NUMBER']")
    public WebElement NUMBER;
	
	@FindBy(how = How.XPATH, using = "//*[text()='DURATION']")
    public WebElement DURATION;
	
	@FindBy(how = How.XPATH, using = "//*[text()='RATE']")
    public WebElement RATE;
	
	@FindBy(how = How.XPATH, using = "//*[text()='COST']")
    public WebElement COST;

}
