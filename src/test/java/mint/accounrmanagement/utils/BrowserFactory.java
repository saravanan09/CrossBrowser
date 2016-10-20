package mint.accounrmanagement.utils;

import java.awt.Toolkit;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.safari.SafariDriver;




//import cucumber.api.Scenario;
//import cucumber.api.java.After;

public class BrowserFactory {
	private static final String BROWSER_PROP_KEY = "browser";
	public static WebDriver getBrowser() {
		Browsers browser;
		WebDriver driver;
		
		if(System.getProperty(BROWSER_PROP_KEY)==null){
			System.out.println("chrome");
			browser = Browsers.CHROME;
		}else{
			browser = Browsers.browserForName(System.getProperty(BROWSER_PROP_KEY));
		}
		switch(browser){
			case CHROME:
				driver = createChromeDriver();
				break;
			case IE:
				driver = createIEDriver();
				break;
			case FIREFOX:
			default:
				driver = createFirefoxDriver();
				break;
		}
		addAllBrowserSetup(driver);
		return driver;
	}

	private static WebDriver createIEDriver() {
		System.setProperty("webdriver.ie.driver", "src//main//resources//IEDriver//IEDriverServer.exe");
		return new InternetExplorerDriver();
	}

	private static WebDriver createChromeDriver() {
		System.out.println("ins");
		System.setProperty("webdriver.chrome.driver", "E://Project//ChromeDriver_2.22//chromedriver.exe");
		return new ChromeDriver();
	}
	
	private static WebDriver createFirefoxDriver() {
        return new FirefoxDriver();
    }

//	private static FirefoxProfile getFirefoxProfile() {
//		return null;
//        FirefoxProfile firefoxProfile = new FirefoxProfile();
//        try {
//			firefoxProfile.addExtension(FileUtils.getFile("firebug/firebug-1.9.2.xpi"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (URISyntaxException e){
//        	e.printStackTrace();
//        }

        //See http://getfirebug.com/wiki/index.php/Firebug_Preferences
//        firefoxProfile.setPreference("extensions.firebug.currentVersion", "1.9.2");  // Avoid startup screen
//        firefoxProfile.setPreference("extensions.firebug.script.enableSites", true);
//        firefoxProfile.setPreference("extensions.firebug.console.enableSites", true);
//        firefoxProfile.setPreference("extensions.firebug.allPagesActivation", true);
//        firefoxProfile.setPreference("extensions.firebug.delayLoad", false);
//        return firefoxProfile;
//    }
	
	private static void addAllBrowserSetup(WebDriver driver) {
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//        driver.manage().window().setPosition(new Point(0, 0));
//        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        Dimension dim = new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
//        driver.manage().window().setSize(dim);
	}

	
//private static WebDriver driver;
//	public static WebDriver getBrowser()
//	{
//		System.out.println("two");
//		System.setProperty("webdriver.chrome.driver", "src/main/resources/ChromeDriver/chromedriver.exe");
//		driver = new ChromeDriver();
//		System.out.println("three");
//		driver.manage().deleteAllCookies();
//    	driver.manage().window().maximize();
//		return driver;	
//		}

	
}
