package mint.accounrmanagement.utils;


public enum Environments {
	QA,
	PROD;
	public static Environments environment(String envName) throws IllegalArgumentException{
        for(Environments e: values()){
    		if(e.toString().equalsIgnoreCase(envName)){
    			return e;
    		}
        }
        throw EnvironmentNotFound(envName);
    }
	private static IllegalArgumentException EnvironmentNotFound(String environment) {
        return new IllegalArgumentException(("Invalid Environment [" + environment + "]"));
    }

}
