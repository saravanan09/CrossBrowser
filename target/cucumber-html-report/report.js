$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/MintAccountManagement.feature");
formatter.feature({
  "line": 1,
  "name": "MINT Account Management",
  "description": "",
  "id": "mint-account-management",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 251,
  "name": "Data Balance Check",
  "description": "",
  "id": "mint-account-management;data-balance-check",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 250,
      "name": "@Recharge"
    }
  ]
});
formatter.step({
  "line": 252,
  "name": "I navigate to the MINT Account Management",
  "keyword": "Given "
});
formatter.step({
  "line": 253,
  "name": "I provide \"6572669242\" in PhoneNumber field",
  "keyword": "When "
});
formatter.step({
  "line": 254,
  "name": "I provide \"test123\" in Password field",
  "keyword": "And "
});
formatter.step({
  "line": 255,
  "name": "I click on LogIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 256,
  "name": "I should see MINT Account Management hompage \"/account/summary\"",
  "keyword": "Then "
});
formatter.step({
  "line": 257,
  "name": "I click on Recharge Now button",
  "keyword": "Then "
});
formatter.step({
  "line": 258,
  "name": "I should see Checkout Page \"/account/checkout\"",
  "keyword": "Then "
});
formatter.step({
  "line": 259,
  "name": "I select Payment Method as \"Credit Card\"",
  "keyword": "Then "
});
formatter.step({
  "line": 260,
  "name": "I click on Purchase Now button",
  "keyword": "Then "
});
formatter.step({
  "line": 261,
  "name": "I should see Success Message",
  "keyword": "Then "
});
formatter.step({
  "line": 262,
  "name": "I click on Return to Account Summary button",
  "keyword": "Then "
});
formatter.step({
  "line": 263,
  "name": "I should see MINT Account Management hompage \"/account/summary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_navigate_to_the_MINT_Account_Management()"
});
formatter.result({
  "duration": 17323824232,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6572669242",
      "offset": 11
    }
  ],
  "location": "StepDefs.i_provide_in_PhoneNumber_field(String)"
});
formatter.result({
  "duration": 190017392,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test123",
      "offset": 11
    }
  ],
  "location": "StepDefs.i_provide_in_Password_field(String)"
});
formatter.result({
  "duration": 101404754,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_click_on_LogIn_button()"
});
formatter.result({
  "duration": 6079288580,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/account/summary",
      "offset": 46
    }
  ],
  "location": "StepDefs.i_should_see_MINT_Account_Management_hompage(String)"
});
formatter.result({
  "duration": 2523869681,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_click_on_Recharge_Now_button()"
});
formatter.result({
  "duration": 3586124985,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/account/checkout",
      "offset": 28
    }
  ],
  "location": "StepDefs.i_should_see_Checkout_Page(String)"
});
formatter.result({
  "duration": 1127241275,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Credit Card",
      "offset": 28
    }
  ],
  "location": "StepDefs.i_select_Payment_Method_as(String)"
});
formatter.result({
  "duration": 5129307826,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_click_on_Purchase_Now_button()"
});
formatter.result({
  "duration": 5077344000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_should_see_Success_Message()"
});
formatter.result({
  "duration": 20120102957,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_click_on_Return_to_Account_Summary_button()"
});
formatter.result({
  "duration": 52611063653,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 20 seconds waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.id: InputSuccess\u0027\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027Saravanan\u0027, ip: \u002710.100.252.31\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.22.397933 (1cab651507b88dec79b2b2a22d1943c01833cc1b), userDataDir\u003dC:\\Users\\SARAVA~1\\AppData\\Local\\Temp\\scoped_dir7096_30861}, takesHeapSnapshot\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d53.0.2785.143, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: d0f46c746993050a54be8e01ed099f02\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:261)\r\n\tat mint.accounrmanagement.utils.BrowserDriver.waitForElement(BrowserDriver.java:59)\r\n\tat mint.accountmanagement.page.navigation.CheckoutPageNav.I_click_on_Return_to_Account_Summary_button(CheckoutPageNav.java:55)\r\n\tat mint.accountmanagement.stepDefs.runner.StepDefs.i_click_on_Return_to_Account_Summary_button(StepDefs.java:196)\r\n\tat ✽.Then I click on Return to Account Summary button(features/MintAccountManagement.feature:262)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"InputSuccess\"}\n  (Session info: chrome\u003d53.0.2785.143)\n  (Driver info: chromedriver\u003d2.22.397933 (1cab651507b88dec79b2b2a22d1943c01833cc1b),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 15.04 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027Saravanan\u0027, ip: \u002710.100.252.31\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.22.397933 (1cab651507b88dec79b2b2a22d1943c01833cc1b), userDataDir\u003dC:\\Users\\SARAVA~1\\AppData\\Local\\Temp\\scoped_dir7096_30861}, takesHeapSnapshot\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d53.0.2785.143, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: d0f46c746993050a54be8e01ed099f02\n*** Element info: {Using\u003did, value\u003dInputSuccess}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:302)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$100(ExpectedConditions.java:41)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:288)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:285)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:238)\r\n\tat mint.accounrmanagement.utils.BrowserDriver.waitForElement(BrowserDriver.java:59)\r\n\tat mint.accountmanagement.page.navigation.CheckoutPageNav.I_click_on_Return_to_Account_Summary_button(CheckoutPageNav.java:55)\r\n\tat mint.accountmanagement.stepDefs.runner.StepDefs.i_click_on_Return_to_Account_Summary_button(StepDefs.java:196)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "/account/summary",
      "offset": 46
    }
  ],
  "location": "StepDefs.i_should_see_MINT_Account_Management_hompage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is http://web-qa-08.ultra.me:3001/account/checkout?item\u003drecharge");
formatter.after({
  "duration": 333266551,
  "status": "passed"
});
});