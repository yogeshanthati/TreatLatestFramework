package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Data;

public class EmailAddressPage extends TestBase {

	protected EmailAddressPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email Address')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Email Address']")
	private MobileElement lblUpdateEmail;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_toggle_edit')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='EDIT']")
	private MobileElement btnEdit;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email Address')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Email Address']")
	private MobileElement btnCancel;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email Address')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Email Address']")
	private MobileElement btnUpdateEmailAddress;

	@AndroidFindBy(xpath = " //android.widget.EditText[contains(@resource-id,'id/text_email')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Email Address']//following-sibling::XCUIElementTypeTextField")
	private MobileElement txtEmailAddress;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_update_email')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Update Email Address']")
	private MobileElement btnUpdateEmail;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email Address Updated')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Email Address Updated']")
	private MobileElement msgSuccessUpdateEmail;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter an Email Address')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Please enter an Email Address')]")
	private MobileElement errEmptyUpdateEmail;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'The email entered is invalid. Please try again.')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'The email entered is invalid. Please try again.')]")
	private MobileElement errInValideEmail;

	public void clickOnEditButton() {
		try {
			clickOn(btnEdit, "Edit button");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterEmailAddressInEmailAddressPage() {

		try {
			sleep(3000);

			enterText(txtEmailAddress, "Email Address", data.get("UpdatedEmailAddress"));

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUpdateEmptyEmailAddress() {

		try {
			sleep(3000);

			txtEmailAddress.clear();

			txtEmailAddress.click();

			txtEmailAddress.clear();

			clickOn(btnUpdateEmail, "Update Email Address Button");

			waitForElement(errEmptyUpdateEmail);

			if (isElementPresent(errEmptyUpdateEmail)) {
				passed("User successfully Validated Empty EmailAddress  Error Message.");
			} else {
				failed(driver, "Failed To Validate  Empty EmailAddress  Error Message. ");
			}

			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUpdateInvalidEmailAddress() {

		try {
			sleep(3000);

			txtEmailAddress.clear();

			txtEmailAddress.sendKeys(data.get("InValidEmailAddress"));

			clickOn(btnUpdateEmail, "Update Email Address Button");

			waitForElement(errInValideEmail);

			if (isElementPresent(errInValideEmail)) {
				passed("User successfully Validated InValid EmailAddress  Error Message.");
			} else {
				failed(driver, "Failed To Validate  InValid EmailAddress  Error Message. ");
			}
			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public MyProfilePage clickOnUpdateEmailAddressButton() {

		try {
			clickOn(btnUpdateEmail, "Update Email Address Button");

			waitForElement(msgSuccessUpdateEmail);

			if (isElementPresent(msgSuccessUpdateEmail)) {
				passed("User successfully Validated Successfully Updated Email Message.");
			} else {
				failed(driver, "Failed To Validate Successfully Updated Email Message ");
			}
			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new MyProfilePage(driver, data);
	}

	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(lblUpdateEmail);

			if (isElementPresent(lblUpdateEmail)) {

				passed("User Successfully Navigated To Update Email Page");
			} else {
				failed(driver, "User Failed To navigate To Update Email Page");
			}

			takeScreenshot(driver);

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
