Feature: MINT Account Management

@ValidLogin
Scenario: Valid Login
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"

@InvalidLogin
Scenario: Invalid Login
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test456" in Password field
	Then I click on LogIn button
	Then I should see "Invalid Phone Number or Password" error message

@TempPassword
Scenario: Temporary Password
	Given I navigate to the MINT Account Management
	When I click on SMS a password to My Device button
	Then I should see Temporary Password Page "/login/sms/temp"
	When I provide "2135366248" in PhoneNumber field
	And I click on Send Password to My Device button 
	Then I should see "An SMS with a password will arrive shortly." message
	Then I click on Back To Login button
	Then I should see Login Page "/login"
	
@UpData+CC
Scenario: Purchasing UpData via CC
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	When I click on UpData button
	Then I should see UpData Page "/account/data"
	Then I click on Continue button for Data "3GB"
	Then I should see Checkout Page "/account/checkout"
	Then I select Payment Method as "Credit Card" 
	Then I click on Purchase Now button
	Then I should see Success Message 
	Then I click on Return to Account Summary button
	Then I should see MINT Account Management hompage "/account/summary"

@UpData+Wallet	
Scenario: Purchasing UpData via Wallet
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	When I click on UpData button
	Then I should see UpData Page "/account/data"
	Then I click on Continue button for Data "1GB"
	Then I should see Checkout Page "/account/checkout"
	Then I select Payment Method as "Wallet" 
	Then I click on Purchase Now button
	Then I should see Success Message 
	Then I click on Return to Account Summary button
	Then I should see MINT Account Management hompage "/account/summary"
	
@LoadWallet
Scenario: Load Wallet 
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	When I click on Load Wallet button
	Then I should see Load Wallet Page "/account/wallet"
	Then I click on Continue button for wallet amount "5"
	Then I should see Checkout Page "/account/checkout" 
	Then I click on Purchase Now button
	Then I should see Success Message 
	Then I click on Return to Account Summary button
	Then I should see MINT Account Management hompage "/account/summary"

@ManagePlan-FuturePlanChange
Scenario: Future Plan Change 
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	When I click on Manage Plan button
	Then I should see Manage Plan Page "/account/plan"
	Then I select Next Plan as "M03S"
	Then I click on Set as Next Plan button
	Then I should see Success Message in Manage Plan Page
	
@ManagePlan-ImmediatePlanChange
Scenario: Immediate Plan Change 
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	When I click on Manage Plan button
	Then I should see Manage Plan Page "/account/plan"
	Then I select Immediate Plan as "M01M"
	Then I click on Switch Immediately button
	Then I should see Checkout Page "/account/checkout"
	Then I select Payment Method as "Credit Card" 
	Then I click on Purchase Now button
	Then I should see Success Message 
	Then I click on Return to Account Summary button
	Then I should see MINT Account Management hompage "/account/summary"
	
@AutoRecharge-On+EditBillingInfo
Scenario: Auto Recharge On and Edit Billing Info
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	When I click on Auto Recharge button
	Then I should see Auto Recharge Page "/account/auto-recharge"
	Then I select Auto Recharge "On" button
	Then I click on Save Settings button
	Then I should see Success Message in Auto Recharge Page
	Then I click on Edit Billing Info link
	Then I should see Edit Billing Info Page "/account/billing?from=auto-recharge"
	Then I provide "4012301230123010" in CreditCard field
	Then I provide "123" in CVV field
	Then I provide "12/18" in Expiry field
	Then I provide "Saravanan" in FirstName field
	Then I provide "Ultrasmith" in LastName field
	Then I provide "4676 Tuttles" in Address field
	Then I provide "View Drive" in SecAddress field
	Then I provide "Dublin" in City field
	Then I provide "OH" in State field
	Then I provide "92626" in ZipCode field
	Then I click on UpDate Billing Info button
	Then I should see Auto Recharge Page "/account/auto-recharge"
	
@AutoRecharge-Off
Scenario: Auto Recharge Off 
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	When I click on Auto Recharge button
	Then I should see Auto Recharge Page "/account/auto-recharge"
	Then I select Auto Recharge "Off" button
	Then I click on Save Settings button
	Then I should see Success Message in Auto Recharge Page
	
@BillingInfo
Scenario: Update Billing Info 
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	When I click on Billing Info button
	Then I should see Billing Info Page "/account/billing"
	Then I click on Change Billing Info button
	Then I provide "4012301230123010" in CreditCard field
	Then I provide "123" in CVV field
	Then I provide "12/18" in Expiry field
	Then I provide "Saravanan" in FirstName field
	Then I provide "Ultrasmith" in LastName field
	Then I provide "4676 Tuttles" in Address field
	Then I provide "View Drive" in SecAddress field
	Then I provide "Dublin" in City field
	Then I provide "OH" in State field
	Then I provide "92626" in ZipCode field
	Then I click on UpDate Billing Info button
	Then I should see Success Message in Billing Info Page
	
@PersonalInfo
Scenario: Update Personal Info 
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	When I click on Personal Info button
	Then I should see Personal Info Page "/account/info"
	Then I provide "Saravanan" in First Name field
	Then I provide "Ultrons" in Last Name field
	Then I provide "sarav@ultra.me" in Email field
	Then I provide "test123" in Update Password field
	Then I provide "test123" in Update Confirm Password field
	Then I click on Update Personal Information button
	Then I should see Success Message in Personal Info Page
	
@Preferences
Scenario: Update Preferences 
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	When I click on Preferences button
	Then I should see Account Preferences Page "/account/preferences"
	Then I "select" SMS to receive promotional communications
	Then I "select" Email to receive promotional communications
	Then I "unselect" Phone Calls to receive promotional communications
	Then I click on Save Settings button in Account Preferences Page
	Then I should see Success Message in Account Preferences Page
	
@TransactionHistory
Scenario: Transaction History 
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	When I click on Transaction History button
	Then I should see Transaction History Page "/account/transactions"
	Then I should see Transaction Info Date,OrderID,Type,Ammount and Description
	Then I click on See More button in Transaction History Page

@INTLCallHistory
Scenario: INTL Call History 
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	When I click on INTL Call History button
	Then I should see INTL Call History Page "/account/calls"
	Then I should see INTL Call Info Time,Destination,Number,Duration,Rate and Cost
	Then I click on See More button in INTL Call History Page

@Logout
Scenario: Logout
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	Then I click on Logout button
	Then I should see Login Page "/login"
	
@DataBalanceCheck
Scenario: Data Balance Check
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	Then I click on Data Check button
	Then I should see available Data Balance
	
@Recharge
Scenario: Data Balance Check
	Given I navigate to the MINT Account Management
	When I provide "6572669242" in PhoneNumber field 
	And I provide "test123" in Password field
	Then I click on LogIn button
	Then I should see MINT Account Management hompage "/account/summary"
	Then I click on Recharge Now button
	Then I should see Checkout Page "/account/checkout"
	Then I select Payment Method as "Credit Card"
	Then I click on Purchase Now button
	Then I should see Success Message 
	Then I click on Return to Account Summary button
	Then I should see MINT Account Management hompage "/account/summary"