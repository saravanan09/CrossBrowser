 package mint.accounrmanagement.utils;

import org.openqa.selenium.WebDriver;

public class EnvironmentProperties {
	private static final String ENV_PROP_KEY = "env";
	public static String getEnvironment() {
		Environments environment;
		String URL;
		if(System.getProperty(ENV_PROP_KEY)==null){
			System.out.println("env");
			environment = Environments.QA;
		}else{
			environment = Environments.environment(System.getProperty(ENV_PROP_KEY));
		}
		switch(environment){
		case PROD:
			URL = PRODurl();
			break;	
		case QA:
		default:
			URL = QAurl();
				break;
		}
		return URL;
	}
private static String PRODurl()
{
	String url="https://my.mintsim.com/";
	return url;
	
}
private static String QAurl()
{
	String url="http://web-qa-08.ultra.me:3001/login";
	return url;
	
}

}
