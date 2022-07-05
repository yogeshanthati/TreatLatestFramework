package pages;

import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Constants;
import utilities.Data;
import utilities.GlobalVariables;

public class MembershipCongratulationsPage extends TestBase {

	protected MembershipCongratulationsPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_congratulations')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[contains(@name,'Congratulations')]")
	private MobileElement txtCongratulations;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/imageView3')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']")
	private MobileElement imgTreatLogoInMemberCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/user_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtUserNameInMemberCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_membership_ends_label')] ")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement txtMembershipEndsInMemberCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/membership_period')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[3]")
	private MobileElement txtMembershipPeriodInMemberCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,':id/tv_membership_ends_label')] ")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement txtMembershipEndsInMemberCardUsingCoupon;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,':id/membership_period')] ")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[3]")
	private MobileElement txtMembershipPeriodInMemberCardUsingCoupon;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/bt_done')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btnDone;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_done')]//following-sibling::android.widget.TextView[contains(@resource-id,'id/tv_description')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='doneToast']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement msgUpgradedSuccess;

	@AndroidFindBy(id = "android:id/button2")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Not Now']")
	private MobileElement btnNotNow;

	public void ValidateDetailsInMembershipCardUsingCardPayment() {

		try {
			ValidateMembershipUpgradeSuccessMessage();

			waitForElement(imgTreatLogoInMemberCard);

			if (isElementPresent(imgTreatLogoInMemberCard)) {
				passed("User Successfully Validated  The Teat Logo In  Membership Congratulations Page");

			} else {
				failed(driver, "Failed To Validate The Treat Logo In  Membership Congratulations Page");
			}

			waitForElement(txtUserNameInMemberCard);

			if (txtUserNameInMemberCard.getText().equals(GlobalVariables.FirstName + " " + GlobalVariables.LastName)) {

				passed("User Successfully Validated the User Name In   Membership Congratulations Page As"
						+ txtUserNameInMemberCard.getText());

			} else {

				failed(driver, "Failed To Validate the User NAme In   Membership Congratulations Page ");
			}

			waitForElement(txtMembershipPeriodInMemberCard);

			if (txtMembershipPeriodInMemberCard.getText()
					.equals(getSubscriptionDate(GlobalVariables.SelectMembershipPlanType))) {

				passed("User Successfully Validated The Membership Period In    Membership Congratulations Page As"
						+ txtMembershipPeriodInMemberCard.getText());

			} else {

				failed(driver, "User Failed To Validate the Membership Period In    Membership Congratulations Page");

			}

			waitForElement(txtMembershipEndsInMemberCard);

			if (txtMembershipEndsInMemberCard.getText().trim().equals(Constants.MembershipRenewsText)) {

				passed("User Successfully Validated  Membership Ends Text In  Membership Congratulations Page for Payment through Card As"
						+ txtMembershipEndsInMemberCard.getText());

			} else {
				failed(driver,
						"Failed To Validate The Membership Ends Text In  Membership Congratulations Page for Payment through Card");
			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	public void ValidateDetailsInMembershipCardUsingCouponCode() {

		try {
			waitForElement(imgTreatLogoInMemberCard);

			if (isElementPresent(imgTreatLogoInMemberCard)) {

				passed("User Successfully Validated  The Teat Logo In  Membership Congratulations Page");

			} else {
				failed(driver, "Failed To Validate The Treat Logo In  Membership Congratulations Page");
			}

			waitForElement(txtUserNameInMemberCard);

			if (txtUserNameInMemberCard.getText().equals(GlobalVariables.FirstName + " " + GlobalVariables.LastName)) {

				passed("User Successfully Validated the User Name In   Membership Congratulations Page As"
						+ txtUserNameInMemberCard.getText());
			} else {
				failed(driver, "Failed To Validate the User NAme In   Membership Congratulations Page ");
			}

			waitForElement(txtMembershipPeriodInMemberCardUsingCoupon);

			if (txtMembershipPeriodInMemberCardUsingCoupon.getText()
					.equals(getSubscriptionDate(GlobalVariables.SelectMembershipPlanType))) {

				passed("User Successfully Validated The Membership Period In    Membership Congratulations Page As"
						+ txtMembershipPeriodInMemberCardUsingCoupon.getText());

			} else {

				failed(driver, "User Failed To Validate the Membership Period In    Membership Congratulations Page");

			}

			waitForElement(txtMembershipEndsInMemberCardUsingCoupon);

			if (txtMembershipEndsInMemberCardUsingCoupon.getText().trim().equals(Constants.MembershipExpiresText)) {

				passed("User Successfully Validated  Membership Ends Text In  Membership Congratulations Page for Payment through Card As"
						+ txtMembershipEndsInMemberCardUsingCoupon.getText());

			} else {
				failed(driver,
						"Failed To Validate The Membership Ends Text In  Membership Congratulations Page for Payment through Card");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	public void ValidateMembershipUpgradeSuccessMessage() {

		try {
			if (isElementPresent(msgUpgradedSuccess)) {

				if (msgUpgradedSuccess.getText().trim().equalsIgnoreCase(Constants.msgSuccessMembershipUpgraded)) {

					passed("Successfully validate Membership Upgrade Success Message");

				} else {
					failed(driver, "Failed To Validate  Membership Upgrade Success Message");
				}
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public AppNavPage clickOnDonebutton() {

		try {
			waitForElement(btnDone);

			clickOn(btnDone, "Done button");

			clickOnNotNow();

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}
		return new AppNavPage(driver, data);
	}
	
	public Appointments_SelectAppointmentForPage clickOnDonebuttonForAddChildFromHealth() {

		try {
			waitForElement(btnDone);

			clickOn(btnDone, "Done button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}
		return new Appointments_SelectAppointmentForPage(driver, data);
	}

	
	
	public void clickOnNotNow() {

		try {
			waitForElement(btnNotNow);

			if (isElementPresent(btnNotNow)) {

				clickOn(btnNotNow, "NotNow button");
			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}
	


	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(txtCongratulations);

			if (isElementPresent(txtCongratulations)) {

				passed("User Successfully Navigated To Membership Congratulations Page");
			} else {
				failed(driver, "User Failed To navigate To Membership Congratulations Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}



}
