package pages;

import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Constants;
import utilities.Data;
import utilities.GlobalKeys;
import utilities.GlobalVariables;

public class SignInPage extends TestBase {

	private static final String accessibility = null;

	protected SignInPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
	}

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_email')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
	private MobileElement txtEmailAddress;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_password')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[1]")
	private MobileElement txtPassword;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
	private MobileElement txtShowPassword;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_login')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Sign In']")
	private MobileElement btnSignIn;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/btn_create_account')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='BECOME A MEMBER']")	
	private MobileElement btnBecomeAMember;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/forgot_password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='FORGOT PASSWORD?']")
	private MobileElement btnForgotPwd;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter an Email Address']") 
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter an Email Address']")
	private MobileElement errEmptyEmail;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter a Password']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter a Password']")
	private MobileElement errEmptyPassword;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='The email entered is invalid. Please try again.']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='The email entered is invalid. Please try again.']")
	private MobileElement errInValidEmail;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'User not registered')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Please try again.')]")
	private MobileElement errUnregisteredEmail;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter a valid Password']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Incorrect username or password.']")
	private MobileElement errInvalidPassword;

	@AndroidFindBy(accessibility = "Show password")
	@iOSXCUITFindBy(accessibility = "showPassword")
	private MobileElement btnShowPwd;

	@AndroidFindBy(accessibility = "Show password")
	@iOSXCUITFindBy(accessibility = "hidePassword")
	private MobileElement btnHidePwd;

	@AndroidFindBy(id = "android:id/button2")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Not Now']")
	private MobileElement btnNotNow;
	
	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement NavBack;
	
	@AndroidFindBy(xpath = "//*[@text='Next']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Next']")
	private MobileElement btnNextInAppTutorials;
	
	
	
	@AndroidFindBy(xpath = "//*[@text='Get Started']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Get Started']")
	private MobileElement btnGetStartedInAppTutorials;
	//
	
	
	public void ValidateLinkAndButtonTextfieldsInSignInPage()
	{
		ValidateElementTextInPage(btnForgotPwd, Constants.SignInPage_ForgotPasswordLink_text, "SignInPage", "Forgot Password Button");
		
		ValidateElementTextInPage(btnSignIn, Constants.SignInPage_SignInButton_text, "SignInPage", "Sign In Button");
		
		ValidateElementTextInPage(btnBecomeAMember, Constants.SignInPage_BecomeAMemberLink_text, "SignInPage", "Become A Member Link text");
	}

	public SignInPage EnterUserNameAndPassword() {

		try {

			GlobalVariables.FirstName = data.get("FirstName");

			GlobalVariables.LastName = data.get("LastName");

			String UserFromTestDataSheet = GlobalKeys.configData.get("UserFromTestDataSheet");

			if (UserFromTestDataSheet.equalsIgnoreCase("No")) {

				GlobalVariables.CreateUserName = GlobalKeys.configData.get("UserEmail");
			} else {
				GlobalVariables.CreateUserName = data.get("EmailAddress");
			}
			GlobalVariables.CreateUserPwd = data.get("Password");

			GlobalVariables.DOB = data.get("DOB");

			enterText(txtEmailAddress, "EmailAddress", data.get("EmailAddress"));

			enterText(txtPassword, "Password", data.get("Password"));

			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		return new SignInPage(driver, data);

	}
	
public void HandleAppTutorialButtons() {
		
		try {
			waitForElement(btnNextInAppTutorials);
			if(isElementPresent(btnNextInAppTutorials)) {
			clickOn(btnNextInAppTutorials, "Next Button In App Tutorials");	
			}
			waitForElement(btnNextInAppTutorials);
			if(isElementPresent(btnNextInAppTutorials)) {
			clickOn(btnNextInAppTutorials, "Next Button In App Tutorials");	
			}
			waitForElement(btnNextInAppTutorials);
			if(isElementPresent(btnNextInAppTutorials)) {
			clickOn(btnNextInAppTutorials, "Next Button In App Tutorials");	
			}
			
			waitForElement(btnNextInAppTutorials);
			if(isElementPresent(btnNextInAppTutorials)) {
			clickOn(btnNextInAppTutorials, "Next Button In App Tutorials");	
			}
			waitForElement(btnGetStartedInAppTutorials);
			if(isElementPresent(btnGetStartedInAppTutorials)) {
			clickOn(btnGetStartedInAppTutorials, "Get  Started Button In App Tutorials");	
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	
}

	public AppNavPage clickOnSignInButton() {

		try {
			clickOn(btnSignIn, "Sign In Button");

			clickOnNotNowButton();

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppNavPage(driver, data);

	}

	public void clickOnNotNowButton() {

		try {
//			waitForElement(btnNotNow);
//			
//			waitForElement(btnNotNow);

			if (isElementPresent(btnNotNow)) {

				clickOn(btnNotNow, "NotNow  button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public ForgotPasswordPage clickOnForgotPasswordButton() {

		try {
			clickOn(btnForgotPwd, "Forgot Password Button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new ForgotPasswordPage(driver, data);

	}

	public void ValidateUserLogInWithEmptyUseAndPassword() {
		try {

			clearText(txtEmailAddress);

			clearText(txtPassword);

			clickOn(btnSignIn, "SignIn button In User SignIn Page");

			waitForElement(errEmptyEmail);

			if (isElementPresent(errEmptyEmail)) {

				passed("User successfully verfied the Empty email address error message.");
			} else {
				failed(driver, "Failed to verify  Empty email address error message ");
			}

			waitForElement(errEmptyPassword);

			if (isElementPresent(errEmptyPassword)) {

				passed("User successfully verfied the Empty Password error message.");
			} else {
				failed(driver, "Failed to verify  Empty Password error message ");
			}
			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	public void ValidateUserLogInWithInvalidEmailAddressAndValidPassword() {

		try {
			enterText(txtEmailAddress, "Email Address In User SignIn Page", data.get("InValidEmailAddress"));

			enterText(txtPassword, "Password In User SignIn Page", data.get("Password"));

			clickOn(btnSignIn, "SignIn button In User SignIn Page");

			waitForElement(errInValidEmail);

			if (isElementPresent(errInValidEmail)) {

				passed("User successfully verfied the InValid email address error message.");
			} else {
				failed(driver, "Failed to verify  InValid email address error message ");
			}

			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	public void ValidatePasswordTextFieldMaskingInSignInPage() {

		try {
			waitForElement(txtPassword);

			enterText(txtPassword, "Password In CreateProfile Landing Page", data.get("Password"));

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				String Passwpord = txtPassword.getAttribute("password");

				boolean bolPasswpord = Boolean.parseBoolean(Passwpord);

				if (bolPasswpord) {

					passed("User successfully validated  masking of the Password text field In SignIn  Page");

					takeScreenshot(driver);

				} else {
					failed(driver, "Failed To Validate masking of the Password text field  In SignIn  Page");
				}

				clickOn(btnShowPwd, "Show password icon");

				String ShowPasswpord = txtPassword.getAttribute("password");

				boolean bolShowPasswpord = Boolean.parseBoolean(ShowPasswpord);

				if (!bolShowPasswpord) {

					passed("User successfully validated the Show password icon Functionality  In SignIn  Page ");

					takeScreenshot(driver);

				} else {
					failed(driver, "Failed To Validate the Show password icon Functionality  In SignIn  Page");
				}

				clickOn(btnHidePwd, "Hide password icon");

			} else {

				String PasswpordTag = txtPassword.getAttribute("type");

				if (PasswpordTag.equals("XCUIElementTypeSecureTextField")) {

					passed("User successfully validated  masking of the Password text field In SignIn  Page");

					takeScreenshot(driver);

				} else {
					failed(driver, "Failed To Validate masking of the Password text field  In SignIn  Page");
				}

				clickOn(btnShowPwd, "Show password icon");

				String ShowPasswpordTag = txtShowPassword.getAttribute("type");

				if (ShowPasswpordTag.equals("XCUIElementTypeTextField")) {

					passed("User successfully validated the Show password icon Functionality  In SignIn  Page ");

					takeScreenshot(driver);

				} else {
					failed(driver, "Failed To Validate the Show password icon Functionality  In SignIn  Page");
				}

				clickOn(btnHidePwd, "Hide password icon");

			}

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUserLogInWithValidEmailAndInValidPassword() {
		try {
			enterText(txtEmailAddress, "Email Address In User SignIn Page", data.get("EmailAddress"));

			enterText(txtPassword, "Password In User SignIn Page", data.get("InValidPassword"));

			clickOn(btnSignIn, "SignIn button In User SignIn Page");
			
			waitForElement(errInvalidPassword);

			if (isElementPresent(errInvalidPassword)) {

				passed("User successfully verfied the InValid password error message.");

			} else {
				failed(driver, "Failed to verify  InValid Password error message ");
			}
			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUserLogInWithUnregisterEmailAddressAndValidPassword() {
		try {
			enterText(txtEmailAddress, "Email Address In User SignIn Page", data.get("UnRegisteredEmail"));

			enterText(txtPassword, "Password In User SignIn Page", data.get("Password"));

			clickOn(btnSignIn, "SignIn button In User SignIn Page");
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

			waitForElement(errUnregisteredEmail);

			if (isElementPresent(errUnregisteredEmail)) {

				passed("User successfully verfied the Unregistered Email Address error message.");
			} else {
				failed(driver, "Failed to verify  Unregistered Email Address error message ");
			}
			}
			else {
				waitForElement(errUnregisteredEmail);

				if (errUnregisteredEmail.getText().replaceAll("\\s+", "").equals(Constants.iOSErrorMessageUnregister.replaceAll("\\s+", ""))) {

					passed("User successfully verfied the Unregistered Email Address error message.");
				} else {
					
					System.out.println(errUnregisteredEmail.getText().replaceAll("\\s+", ""));
					
					System.out.println(Constants.iOSErrorMessageUnregister.replaceAll("\\s+", ""));
					
					
				//	failed(driver, "Failed to verify  Unregistered Email Address error message ");
				}
			}
			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public MembershipBenefitsPage clickOnBecomeAMemberButton() {

		try {
			
			waitForElement(btnBecomeAMember);
			
			clickOn(btnBecomeAMember, "Become A Member button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new MembershipBenefitsPage(driver, data);

	}

	
	
	public AppNavPage ValidateUserLogInWithUpdatedPassword() {

		try {
			enterText(txtEmailAddress, "Email Address In User SignIn Page", data.get("EmailAddress"));

			enterText(txtPassword, "Password In User SignIn Page", data.get("NewPassword"));

			clickOnSignInButton();

			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppNavPage(driver, data);

	}

	public AppNavPage ValidateUserLogInWithUpdatedEmailAddress() {

		try {
			enterText(txtEmailAddress, "Email Address In User SignIn Page", data.get("UpdatedEmailAddress"));

			enterText(txtPassword, "Password In User SignIn Page", data.get("Password"));

			clickOnSignInButton();

			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppNavPage(driver, data);

	}
	
	public AppointmentsPage ClickOnNavigateBackToAppointments() {
		try {
			clickOn(NavBack, "Navigate Back button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppointmentsPage(driver, data);
	}

	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(txtEmailAddress);

			if (isElementPresent(txtEmailAddress)) {

				passed("User Successfully Navigated To SignInPage");
				takeScreenshot(driver);
			} else {
				failed(driver, "User Failed To navigate To SignInPage");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
