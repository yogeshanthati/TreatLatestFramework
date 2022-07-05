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
import utilities.YopMail;

public class ForgotPasswordPage extends TestBase {

	protected ForgotPasswordPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/forgot_password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Forgot Password?']")
	private MobileElement lblForgotPassword;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_email')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private MobileElement txtEmailAddress;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_reset_password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Reset Password']")
	private MobileElement btnResetPwd;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_verification_code')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Check Your Email']//following-sibling::XCUIElementTypeTextField")
	private MobileElement txtVerificationCode;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_new_password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Check Your Email']//following-sibling::XCUIElementTypeSecureTextField")
	private MobileElement txtNewPassword;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_verify_reset')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Set Password']")
	private MobileElement btnSetPwd;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/txt_password_updated')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your password has been reset successfully.']")
	private MobileElement lblPwdSuccessUpdate;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_back_to_login')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Back To Login']")
	private MobileElement btnBackToLogIn;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter an Email Address')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter an Email Address']")
	private MobileElement errEmptyEmailAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'The email entered is invalid. Please try again.')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'The email entered is invalid. Please try again.')]")
	private MobileElement errInvalidEmailAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email Id does not exist. Please check and try again.')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Please try again.')]")
	private MobileElement errUnRegisterEmailAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter Verification code')]")
	@iOSXCUITFindBy(accessibility = "Please enter Verification Code")
	private MobileElement errEmptyVerificationCode;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter a Password')]")
	@iOSXCUITFindBy(accessibility = "Please enter a Password")
	private MobileElement errEmptypassword;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='The Verification code is invalid. Please check again.']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Invalid verification code provided, please try again.')]")
	private MobileElement errInValidVerificationCode;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter a valid Password']")
	@iOSXCUITFindBy(accessibility = "Please enter a valid Password")
	private MobileElement errInValidNewPassword;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/resend_email')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='RESEND EMAIL']")	
	private MobileElement btnResendEmail;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Code sent Successfully')]")
	@iOSXCUITFindBy(accessibility = "Please enter a valid Password")
	private MobileElement msgCodeSentSuccessfully;

	public void ResetPasswordInForgetPasswordPage() {

		try {
			waitForElement(lblForgotPassword);

			if (isElementPresent(lblForgotPassword)) {

				enterText(txtEmailAddress, "EmailAddress", data.get("EmailAddress"));

				clickOn(btnResetPwd, "Reset Password button");

				YopMail yopMail = new YopMail(data);

				String VerificationCode = yopMail.getVerificationCode();

				enterText(txtVerificationCode, "Verification Code", VerificationCode);

				enterText(txtNewPassword, "New Password", data.get("NewPassword"));

				clickOn(btnSetPwd, "Set Password button");

				waitForElement(lblPwdSuccessUpdate);

				if (isElementPresent(lblPwdSuccessUpdate)) {

					passed("User Successfully Reset the Password.");
				} else {
					failed(driver, "Failed To Reset the Password");
				}

			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void ValidateResetPasswordButtonInForgotPasswordPage()
	{
		ValidateElementTextInPage(btnResetPwd, Constants.SignInPage_ResetPasswordButton_text, "ForgotPasswordPage", "ResetPasswordButton");
	}

	public void validateEmailAddressFieldInForgotPasswordPage() {

		try {
			waitForElement(txtEmailAddress);

			clearText(txtEmailAddress);

			clickOn(btnResetPwd, "Reset Password button");

			waitForElement(errEmptyEmailAddress);

			if (isElementPresent(errEmptyEmailAddress)) {

				passed("User successfully verfied the Empty email address error message.");
			} else {
				failed(driver, "Failed to verify  Empty email address error message ");
			}
			takeScreenshot(driver);

			enterText(txtEmailAddress, "Email Address", data.get("InValidEmailAddress")); // data

			clickOn(btnResetPwd, "Reset Password button");

			waitForElement(errInvalidEmailAddress);

			if (isElementPresent(errInvalidEmailAddress)) {

				passed("User successfully verfied the Invalid email address error message.");
			} else {
				failed(driver, "Failed to verify  Invalid email address error message ");
			}
			takeScreenshot(driver);

			enterText(txtEmailAddress, "Email Address", data.get("UnRegisteredEmail"));

			clickOn(btnResetPwd, "Reset Password button");

			waitForElement(errUnRegisterEmailAddress);

			if (isElementPresent(errUnRegisterEmailAddress)) {

				passed("User successfully verfied the Unregistered email address error message.");
				takeScreenshot(driver);
			} else {
				failed(driver, "Failed to verify  Unregistered email address error message ");
			}

			enterText(txtEmailAddress, "EmailAddress", data.get("EmailAddress"));

			clickOn(btnResetPwd, "Reset Password button");

			waitForElement(txtVerificationCode);

			if (isElementPresent(txtVerificationCode)) {
				
				passed("User successfully verfied  the valid email address Navigate to Check your Email Page ");

				takeScreenshot(driver);
			} else {
				failed(driver, "Failed to verify  the valid email address Navigate to Check your Email Page  ");
			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void ValidateSetPasswordButtonAndResendEmailLinkInForgotPasswordPage()
	{
		ValidateElementTextInPage(btnSetPwd, Constants.SignInPage_SetPasswordButton_text, "ForgotPasswordPage", "SetPasswordButton");
		
		ValidateElementTextInPage(btnResendEmail, Constants.SignInPage_ResendEmailLink_text, "ForgotPasswordPage", "ResendEmailLink");
	}

	public void validateVerificationCodeAndNewPasswordFields() {

		try {
			waitForElement(txtVerificationCode);

			clearText(txtVerificationCode);

			clearText(txtNewPassword);

			clickOn(btnSetPwd, "Reset Password button");

			waitForElement(errEmptyVerificationCode);

			if (isElementPresent(errEmptyVerificationCode)) {

				passed("User successfully verfied the Empty Verification Code error message.");

			} else {
				failed(driver, "Failed to verify  Empty Verification Code error message ");
			}

			waitForElement(errEmptypassword);

			if (isElementPresent(errEmptypassword)) {

				passed("User successfully verfied the Empty password error message.");
			} else {
				failed(driver, "Failed to verify  Empty Password error message ");
			}
			takeScreenshot(driver);

			enterText(txtVerificationCode, "Verification Code", data.get("InValidVerificationCode"));

			enterText(txtNewPassword, "New Password", data.get("NewPassword"));

			clickOn(btnSetPwd, "Set Password button");

			waitForElement(errInValidVerificationCode);

			if (isElementPresent(errInValidVerificationCode)) {

				passed("User successfully verfied the Invalid Verification Code error message.");
			} else {
				failed(driver, "Failed to verify  Invalid Verification Code error message ");
			}
			takeScreenshot(driver);

			YopMail yopMail = new YopMail(data);

			String VerificationCode = yopMail.getVerificationCode();

			enterText(txtVerificationCode, "Verification Code", VerificationCode);

			enterText(txtNewPassword, "New Password", data.get("InValidPassword")); // data

			clickOn(btnSetPwd, "Set Password button");

			waitForElement(errInValidNewPassword);

			if (isElementPresent(errInValidNewPassword)) {

				passed("User successfully verfied the Invalid Password error message.");
			} else {
				failed(driver, "Failed to verify  Invalid Password error message ");
			}
			takeScreenshot(driver);
			
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {	
				
           waitForElement(btnResendEmail);
			
			clickOn(btnResendEmail, "Resend Email button");

			waitForElement(txtVerificationCode);

			enterText(txtVerificationCode, "Verification Code", VerificationCode);

			enterText(txtNewPassword, "New Password", data.get("NewPassword"));

			clickOn(btnSetPwd, "Set Password button");

			waitForElement(errInValidVerificationCode);

			if (isElementPresent(errInValidVerificationCode)) {

				passed("User successfully verfied the Invalid Resend Password error message.");
			} else {
				failed(driver, "Failed to verify  Invalid Resend Password error message ");
			}
			takeScreenshot(driver);
			}

			
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public SignInPage clickOnBackToLogInButton() {

		try {
			waitForElement(btnBackToLogIn);

			clickOn(btnBackToLogIn, "Back To LogIn Page");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		return new SignInPage(driver, data);
	}

	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(lblForgotPassword);

			if (isElementPresent(lblForgotPassword)) {

				passed("User Successfully Navigated To Forgot Password Page");
			} else {
				failed(driver, "User Failed To navigate Forgot Password Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

}
