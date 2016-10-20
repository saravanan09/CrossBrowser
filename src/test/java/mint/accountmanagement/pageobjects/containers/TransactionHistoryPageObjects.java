package mint.accountmanagement.pageobjects.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TransactionHistoryPageObjects {

	@FindBy(how = How.ID, using = "Button")
    public WebElement SeeMoreBtn;
	
	@FindBy(how = How.XPATH, using = "//*[text()='DATE']")
    public WebElement DATE;
	
	@FindBy(how = How.XPATH, using = "//*[text()='ORDER ID']")
    public WebElement ORDERID;
	
	@FindBy(how = How.XPATH, using = "//*[text()='TYPE']")
    public WebElement TYPE;
	
	@FindBy(how = How.XPATH, using = "//*[text()='AMOUNT']")
    public WebElement AMOUNT;
	
	@FindBy(how = How.XPATH, using = "//*[text()='DESCRIPTION']")
    public WebElement DESCRIPTION;
}
