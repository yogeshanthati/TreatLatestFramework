package pages;

import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Data;

public class UpdatePasswordPage extends TestBase {

	protected UpdatePasswordPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
	}

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_current_password')]") // android.widget.EditText
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Update Password']//following-sibling:: XCUIElementTypeSecureTextField[1]")
	private MobileElement txtCurrentPassword;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_new_password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Update Password']//following-sibling:: XCUIElementTypeSecureTextField[2]")
	private MobileElement txtNewPassword;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_update_password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Update Password']")
	private MobileElement btnUpdatePassword;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Update Password']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Update Password']")
	private MobileElement lblUpdatePassword;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Password Updated')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Password Updated')]")
	private MobileElement msgSuccessPwdUpdate;

	// -----------------------------------------------------------------------------------------------
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Please enter a Password')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Update Password']//following:: XCUIElementTypeStaticText[@name='Please enter a Password'][1]")
	private MobileElement errEmptyCurrentPwd;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Please enter a Password')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Update Password']//following:: XCUIElementTypeStaticText[@name='Please enter a Password'][2]")
	private MobileElement errEmptyNewPwd;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter a valid Password')][1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter a valid Password']")
	private MobileElement errInValidNewPwd;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Current Password is Wrong. Please try again.')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Incorrect username or password.']")
	private MobileElement errInCorrectCurrentPwd;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter a valid Password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter a valid Password']")
	private MobileElement errInValidCurrentPwd;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Your password must be at least 8 characters long')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText [contains(@name,'Your password must be at least 8 characters long')]")
	private MobileElement lblPassworddRegex;

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement btnBack;

	public MyProfilePage clickOnUpdatePassswordButton() {
		try {
			waitForElement(btnUpdatePassword);

			clickOn(btnUpdatePassword, "Update password button");

			waitForElement(msgSuccessPwdUpdate);
			
			waitForElement(msgSuccessPwdUpdate);

			if (isElementPresent(msgSuccessPwdUpdate)) {

				passed("Successfully validated the password updated Message");
			} else {
				failed(driver, "Failed to validate the password updated Message");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		return new MyProfilePage(driver, data);
	}

	public MyProfilePage clickOnBackButton() {

		try {
			waitForElement(btnBack);

			clickOn(btnBack, "Back button");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new MyProfilePage(driver, data);
	}

	public void EnterCurrentPassword() {
		try {
			waitForElement(txtCurrentPassword);

			enterText(txtCurrentPassword, "Current Password", data.get("Password"));

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void EnterNewPassword() {
		try {
			waitForElement(txtNewPassword);

			enterText(txtNewPassword, "New Password", data.get("NewPassword"));

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void validateUserUpdateEmptyCurrentPasswordAndEmptyNewPassword() {

		try {
			waitForElement(txtCurrentPassword);

			clearText(txtCurrentPassword);

			waitForElement(txtNewPassword);

			clearText(txtNewPassword);

			clickOn(btnUpdatePassword, "Update password button");

			if (isElementPresent(errEmptyCurrentPwd)) {

				passed("Successfully validated the Empty Current password Error Message");
			} else {
				failed(driver, "Failed to validate the Empty Current password Error Message");
			}

			if (isElementPresent(errEmptyNewPwd)) {

				passed("Successfully validated the Empty New password Error Message");
			} else {
				failed(driver, "Failed to validate the Empty New password Error Message");
			}

			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	public void ValidateUserUpdateValidCurrentPasswordAndInValidNewPassword() {

		try {
			waitForElement(txtCurrentPassword);

			enterText(txtCurrentPassword, "Current Password", data.get("Password"));

			waitForElement(txtNewPassword);

			enterText(txtNewPassword, "New Password", data.get("InValidNewPassword"));

			clickOn(btnUpdatePassword, "Update password button");
			
			waitForElement(errInValidNewPwd);

			if (isElementPresent(errInValidNewPwd)) {

				passed("Successfully validated the Invalid password Error Message");
			} else {
				failed(driver, "Failed to validate the Invalid password Error Message");
			}

			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}
	}

	public void ValidateUserUpdateIncorrectCurrentPasswordAndValidNewPassword() {

		try {
			waitForElement(txtCurrentPassword);

			enterText(txtCurrentPassword, "Current Password", data.get("WrongCurrentPassword"));

			waitForElement(txtNewPassword);

			enterText(txtNewPassword, " New Password", data.get("NewPassword"));

			clickOn(btnUpdatePassword, "Update password button");
			
			waitForElement(btnUpdatePassword);

			if (isElementPresent(errInCorrectCurrentPwd)) {

				passed("Successfully validated the Incorrect Current password Error Message");
			} else {
				failed(driver, "Failed to validate the Incorrect Current password Error Message");
			}

			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	public void ValidateUserUpdateInValidCurrentPasswordAndValidNewPassword() {

		try {
			waitForElement(txtCurrentPassword);

			enterText(txtCurrentPassword, "Current Password", data.get("InValidCurrentPassword"));

			waitForElement(txtNewPassword);

			enterText(txtNewPassword, " New Password", data.get("NewPassword"));

			clickOn(btnUpdatePassword, "Update password button");
			
			waitForElement(errInValidCurrentPwd);

			if (isElementPresent(errInValidCurrentPwd)) {

				passed("Successfully validated the InValid Current password Error Message");
			} else {
				failed(driver, "Failed to validate the InValid Current password Error Message");
			}

			takeScreenshot(driver);

			waitForElement(lblPassworddRegex);

			if (isElementPresent(lblPassworddRegex)) {

				passed("User successfully validated the  password regex description for Invalid password  In Update password  Page ");

				takeScreenshot(driver);

			} else {
				failed(driver,
						"Failed To  validate the  password regex description for Invalid password  In Update password  Page");
			}

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(lblUpdatePassword);

			if (isElementPresent(lblUpdatePassword)) {

				passed("User Successfully Navigated To Update password Page");
			} else {
				failed(driver, "User Failed To navigate To  Update password Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
