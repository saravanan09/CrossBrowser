package mint.accountmanagement.page.navigation;



import org.openqa.selenium.WebDriver.Navigation;



public class NavigatorFactory {
private static LoginPageNav loginnav = null;
private static HomePageNav homenav=null;
private static TempPasswordPageNav tempPwdnav=null;
private static UpDataPageNav updatanav=null;
private static LoadWalletPageNav loadwalletnav=null;
private static ManagePlanPageNav manageplannav=null;
private static CheckoutPageNav checkoutnav=null;
private static AutoRechargePageNav autorechargenav=null;
private static BillingInfoPageNav billinginfonav=null;
private static PersonalInfoPageNav personalinfonav=null;
private static PreferencesPageNav preferencesnav=null;
private static TransactionHistoryPageNav transhistorynav=null;
private static INTLCallHistoryPageNav intlcallhistorynav=null;

	public static synchronized LoginPageNav LoginNavigator(){
		if(loginnav == null){
			loginnav = new LoginPageNav();
		}
		return loginnav;
	}
public static synchronized HomePageNav HomeNavigator(){
	if(homenav == null){
		homenav = new HomePageNav();
	}
	return homenav;
}
public static synchronized TempPasswordPageNav TempPwdNavigator(){
	if(tempPwdnav == null){
		tempPwdnav = new TempPasswordPageNav();
	}
	return tempPwdnav;
}
public static synchronized UpDataPageNav UpDataNavigator(){
	if(updatanav == null){
		updatanav = new UpDataPageNav();
	}
	return updatanav;
}
public static synchronized LoadWalletPageNav LoadWalletNavigator(){
	if(loadwalletnav == null){
		loadwalletnav = new LoadWalletPageNav();
	}
	return loadwalletnav;
}
public static synchronized ManagePlanPageNav ManagePlanNavigator(){
	if(manageplannav == null){
		manageplannav = new ManagePlanPageNav();
	}
	return manageplannav;
}
public static synchronized CheckoutPageNav CheckoutNavigator(){
	if(checkoutnav == null){
		checkoutnav = new CheckoutPageNav();
	}
	return checkoutnav;
}
public static synchronized AutoRechargePageNav AutoRechargeNavigator(){
	if(autorechargenav == null){
		autorechargenav = new AutoRechargePageNav();
	}
	return autorechargenav;
}
public static synchronized BillingInfoPageNav BillingInfoNavigator(){
	if(billinginfonav == null){
		billinginfonav = new BillingInfoPageNav();
	}
	return billinginfonav;
}
public static synchronized PersonalInfoPageNav PersonalInfoNavigator(){
	if(personalinfonav == null){
		personalinfonav = new PersonalInfoPageNav();
	}
	return personalinfonav;
}
public static synchronized PreferencesPageNav PreferencesNavigator(){
	if(preferencesnav == null){
		preferencesnav = new PreferencesPageNav();
	}
	return preferencesnav;
}
public static synchronized TransactionHistoryPageNav TransactionHistoryNavigator(){
	if(transhistorynav == null){
		transhistorynav = new TransactionHistoryPageNav();
	}
	return transhistorynav;
}
public static synchronized INTLCallHistoryPageNav INTLCallHistoryNavigator(){
	if(intlcallhistorynav == null){
		intlcallhistorynav = new INTLCallHistoryPageNav();
	}
	return intlcallhistorynav;
}
}
