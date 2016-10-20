package mint.accountmanagement.pageobjects.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoadWalletPageObjects {

	@FindBy(how = How.ID, using = "5")
    public WebElement Wallet_5;
	
	@FindBy(how = How.ID, using = "10")
    public WebElement Wallet_10;
	
	@FindBy(how = How.ID, using = "20")
    public WebElement Wallet_20;
}
