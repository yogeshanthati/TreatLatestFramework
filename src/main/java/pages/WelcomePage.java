package pages;

import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Constants;
import utilities.Data;

public class WelcomePage extends TestBase {

	protected WelcomePage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Welcome']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Welcome']")
	private MobileElement eleWelcomeString;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Welcome']//following-sibling::android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Welcome']//following-sibling::XCUIElementTypeStaticText")
	private MobileElement eleWelcomePageDesc;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/bt_forward')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowRight']")
	private MobileElement btnArrowRight;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/bt_back')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement btnArrowLeft;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/imageView')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatIconSmall']")
	private MobileElement eleTreatICONSmall;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/imageView')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatIconSmall']//following::XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	private MobileElement eleWelcomeSecondPageHeadingString;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/imageView')]//following-sibling::android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatIconSmall']//following::XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
	private MobileElement eleWelcomeSecondPageDesString;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/button_become_a_member')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Become a Member']")
	private MobileElement btnBecomeMemberInWelcomePage;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void ValidateTextFieldsInWelcomScreens() {

		try {
			waitForElement(eleWelcomeString);

			if (isElementPresent(eleWelcomeString)) {
				passed("Successfully validated the Welcome string In Welcome Page");

			} else {
				failed_Continue(driver, "Failed To validate the Welcome String In Welcome Page ");
			}

			waitForElement(eleWelcomePageDesc);

			if (eleWelcomePageDesc.getText().replaceAll("\\s+", "")
					.equals(Constants.WelcomeFirstPageDesc.replaceAll("\\s+", ""))) {

				passed("Successfully Validated WelcomePage Description AS " + eleWelcomePageDesc.getText());

			} else {
				failed_Continue(driver, "Failed To Validate  WelcomePage Description Expected " + Constants.WelcomeFirstPageDesc
						+ " But Actual is " + eleWelcomePageDesc.getText());
			}

			waitForElement(btnArrowRight);

			clickOn(btnArrowRight, "Right Arrow button");

			waitForElement(eleTreatICONSmall);

			if (isElementPresent(eleTreatICONSmall)) {

				passed("Successfully Validated Treat small Icon In Welcome Second Page");
			} else {
				failed_Continue(driver, "Failed To Validate Treat small Icon In Welcome Second Page");
			}

			waitForElement(eleWelcomeSecondPageHeadingString);

			if (eleWelcomeSecondPageHeadingString.getText().replaceAll("\\s+", "")
					.equals(Constants.WelcomeSecondPageHeading.replaceAll("\\s+", ""))) {

				passed("Successfully Validated Welcome Second Page heading AS "
						+ eleWelcomeSecondPageHeadingString.getText());

			} else {
				failed_Continue(driver,
						"Failed To Validated Welcome Second Page heading Expected " + Constants.WelcomeSecondPageHeading
								+ " But Actual is " + eleWelcomeSecondPageHeadingString.getText());
			}

			waitForElement(eleWelcomeSecondPageDesString);

			if (eleWelcomeSecondPageDesString.getText().replaceAll("\\s+", "")
					.equals(Constants.WelcomeSecondPageDesc.replaceAll("\\s+", ""))) {

				passed("Successfully Validated Welcome Second Page Description AS "
						+ eleWelcomeSecondPageDesString.getText());

			} else {
				failed_Continue(driver,
						"Failed To Validated Welcome Second Page Description Expected "
								+ Constants.WelcomeSecondPageDesc + " But Actual is "
								+ eleWelcomeSecondPageDesString.getText());
			}

			waitForElement(btnBecomeMemberInWelcomePage);

			if (isElementPresent(btnBecomeMemberInWelcomePage)) {

				passed("Successfully validated the Become A Member button In Welcome Screen");
			} else {
				failed_Continue(driver, "Failed To Validate  Become A Member button In Welcome Screen");
			}
		} catch (Exception e) {
			failed_Continue(driver, "Exception caught " + e.getMessage());
		}

	}

	public MembershipBenefitsPage clickOnBecomeMember() {

		try {
			waitForElement(btnBecomeMemberInWelcomePage);

			if (isElementPresent(btnBecomeMemberInWelcomePage)) {

				clickOn(btnBecomeMemberInWelcomePage, "Become A Member In Welcome Page");
			}

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new MembershipBenefitsPage(driver, data);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	protected void VerifyNavigationToValidPage() {

		try {
		

			waitForElement(eleWelcomeString);

			if (isElementPresent(eleWelcomeString)) {

				passed("User Successfully Navigated To Welcome    Page");
			} else {
				failed(driver, "User Failed To navigate To Welcome  Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
