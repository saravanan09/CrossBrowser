package mint.accounrmanagement.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.Scenario;


public class BrowserDriver {
private static WebDriver driver;
	
	public synchronized static WebDriver getCurrentDriver() {
		if (driver==null) {
			try {
				System.out.println("one");
				driver = BrowserFactory.getBrowser();
	        } catch (UnreachableBrowserException e) {
	        	driver = BrowserFactory.getBrowser();
	        }finally{
	        	System.out.println("work");
	        	Runtime.getRuntime().addShutdownHook(new Thread(new CloseBrowser()));
	        }
		}
        return driver;
    }
	
	public static void click(String elementToClick)
	{
		getCurrentDriver().findElement(By.id(elementToClick)).click();
	}
	
	public static void sendKeys(String element,String elementValue)
	{
		getCurrentDriver().findElement(By.id(element)).sendKeys(elementValue);
	}

	public static void loadURL(String url){
		getCurrentDriver().get(url);
	}
	
	public static WebElement waitForElement(WebElement elementToWaitFor){
		return waitForElement(elementToWaitFor, null);
	}
	
	public static WebElement waitForElement(WebElement elementToWaitFor, Integer waitTimeInSeconds) {
	    if (waitTimeInSeconds == null) {
	    	waitTimeInSeconds = 10;
	    }
	    
	    WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
	    return wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
	}
	public static WebElement waitForElementToClickable(WebElement elementToWaitFor, Integer waitTimeInSeconds) {
	    if (waitTimeInSeconds == null) {
	    	waitTimeInSeconds = 10;
	    }
	    
	    WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
	    return wait.until(ExpectedConditions.elementToBeClickable(elementToWaitFor));
	}
	public static Boolean URLCheck(String url, Integer waitTimeInSeconds) {
	    if (waitTimeInSeconds == null) {
	    	waitTimeInSeconds = 10;
	    }
	    
	    WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
	    return wait.until(ExpectedConditions.urlContains(url));
	}
	public static void WebPageLoader(int seconds){
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    

    
    
	private static class CloseBrowser implements Runnable {
		
        public void run() {
        	
        	try {
        		System.out.println("four");
                getCurrentDriver().quit();
                driver = null;
                
            } catch (UnreachableBrowserException e) {
                
            }
        }
    }
}