package pages;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Constants;
import utilities.Data;
import utilities.GlobalKeys;

public class LandingPage extends TestBase {

	public LandingPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
	}

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/login_button')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Sign In']")
	private MobileElement btnSignInLandingPage;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/get_started_button')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Get Started']")
	private MobileElement btnGetStarted;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/btn_guest_user')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CONTINUE AS GUEST']")
	private MobileElement btnContinueAsGuest;

	@AndroidFindBy( accessibility ="My Profile")	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='accountInactive']")
	private MobileElement btnMyAccount;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_sign_out')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SIGN OUT']")
	private MobileElement btnSignOut;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='YES']")
	private MobileElement btnSignOutPopUpYES;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_negative')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='NO']")
	private MobileElement btnSignOutPopUpNO;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='TREA']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogoOnboarding']")
	private MobileElement eleTreatLogo;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='TREA']//following-sibling::android.widget.TextView[contains(@resource-id,'id/app_desc')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogoOnboarding']//following-sibling::XCUIElementTypeStaticText")
	private MobileElement eleAppDescription;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Allow']")
	private MobileElement btnAllowTracking;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Ask App Not to Track')]")
	private MobileElement btnAskNotToTrack;
	
	
	
	
	
	public void ValidateButtonTextfieldsInWelcomePage() {
		
		
		ValidateElementTextInPage(btnGetStarted, Constants.WelcomePage_GetStartedButton_text, "Welcome Page", "Get started button");
		
		ValidateElementTextInPage(btnSignInLandingPage,Constants.WelcomePage_SignInButton_text, "Welcome Page", "Sign In button");
		
		ValidateElementTextInPage(btnContinueAsGuest, Constants.WelcomePage_ContinueAsGuestLink_text, "Welcome Page", "Continue As Guest Link text");
	}
	
	public SignInPage clickOnSignInButtonInLandingPage() {

		try {

			waitForElement(btnSignInLandingPage);

			clickOn(btnSignInLandingPage, "Sign In Button in Landing Page");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new SignInPage(driver, data);
	}

	
	public AppNavPage clicOnContinueAsGuest() {
		try {

			waitForElement(btnContinueAsGuest);

			clickOn(btnContinueAsGuest, "Copntinue As Guest button In Landing Page");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppNavPage(driver, data);
		
	}
	public void LogOutFromApp() {

		try {
			if (isElementPresent(btnMyAccount)) {

				clickOn(btnMyAccount, "My Account button");

				waitForElement(btnSignOut);

				clickOn(btnSignOut, "Sign out button");
				
				waitForElement(btnSignOutPopUpYES);
				
				if(isElementPresent(btnSignOutPopUpYES)) {
					clickOn(btnSignOutPopUpYES, "SignOut YES Button");
				}
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}
	
public void ClickOnAllowAppTrackingIniOS() {
	
	if (!GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
		
		try {

			waitForElement(btnAllowTracking);

			clickOn(btnAllowTracking, "Allow Tracking Button in Landing Page");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}



	}

		
	}



public WelcomePage clickOnGetStartedButton() {
	
	try {
		waitForElement(btnGetStarted);
		
		if(isElementPresent(btnGetStarted)) {
			
			clickOn(btnGetStarted,"Get Started Button");
		}
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}
	
	
	
	return new WelcomePage(driver, data);
}
	
	public void ClickOnAppAskNotToTrackIniOS() {
		
		if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("iOS")) {

			try {

				waitForElement(btnAskNotToTrack);
				
				if(isElementPresent(btnAskNotToTrack)) {

			//	clickOn(btnAskNotToTrack, "Ask Not to Track Button in Landing Page");
				
					TapByCoordinates(btnAskNotToTrack.getLocation().getX()+100, btnAskNotToTrack.getLocation().getY()+50,"AppNotToTrack button");
				
				
				}

			} catch (Exception e) {
				failed(driver, "Exception caught " + e.getMessage());
			}


		}

		
	}

	
	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(btnSignInLandingPage);
			
			ClickOnAppAskNotToTrackIniOS();

			if (isElementPresent(btnSignInLandingPage)) {
				passed("User Successfully Navigated To the Treat Landing Page");
			} else {

				LogOutFromApp();
			}
			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
