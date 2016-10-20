package mint.accountmanagement.pageobjects.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UpDataPageObjects {

	
	@FindBy(how = How.ID, using = "MDATA_1024_10")
    public WebElement Data_1GB;
	
	@FindBy(how = How.ID, using = "MDATA_3072_20")
    public WebElement Data_3GB;
}
