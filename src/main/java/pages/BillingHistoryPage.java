package pages;

import java.util.List;

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

public class BillingHistoryPage extends TestBase {

	protected BillingHistoryPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Billing History')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Billing History']")
	private MobileElement lblBillingHistory;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Billing History')]//following::android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Billing History')]//following-sibling::XCUIElementTypeStaticText")
	private MobileElement eleNoBillingHistoryText;

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement NavBack;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_amount')]")
	private List<MobileElement> eleAndroidBillingAmount;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_date')]")
	private List<MobileElement> eleAndroidPaidDate;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Billing History']//following:: XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton")
	private List<MobileElement> eleiOSBillingAmtAndPaidDate;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_amount')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Billing History']//following::XCUIElementTypeButton")
	private List<MobileElement> elbtnGOInToBillingHistory;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Invoice paid')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Invoice paid']//following::XCUIElementTypeStaticText[1]")
	private MobileElement eleInvoicePaidAmount;

	@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Payment date')]//following-sibling::android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Payment date']//following::XCUIElementTypeStaticText[1]")
	private MobileElement eleInvoicePaymentDate;

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement NavBackInVoice;

	public void ValidateBillingHistoryForNoMembershipPlan() {

		try {
			waitForElement(eleNoBillingHistoryText);

			if (isElementPresent(eleNoBillingHistoryText)) {
				{

					passed("User Successfully Validated Empty Billing History Text With No Membership plan As "
							+ eleNoBillingHistoryText.getText());
				}

			}
		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}
	}

	public MyProfilePage NavigateBackFromBillingHistory() {

		try {
			waitForElement(NavBack);

			clickOn(NavBack, "Navigate Back Button");
			
			SwipeDown();
			
			SwipeDown();

		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}

		return new MyProfilePage(driver, data);
	}

	public void ValidateBillingHistoryForMembershipUsingCouponCode() {

		try {
			waitForElement(elbtnGOInToBillingHistory.get(0));

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				if (getFloatFormatOfString(eleAndroidBillingAmount.get(0).getText()
						.trim()) == (getFloatFormatOfString(Constants.AmtToPayForCouponCode))) {

					passed("User successfully validated the Amount in Billing History As"
							+ eleAndroidBillingAmount.get(0).getText());

				} else {
					failed(driver, "User Failed to Validate  the Amount in Billing History  Expected As"
							+ Constants.AmtToPayForCouponCode + ",but is" + eleAndroidBillingAmount.get(0).getText()); 
				}
				String UIPaidOnDate = eleAndroidPaidDate.get(0).getText().trim();

				String strArrPaidOn[] = UIPaidOnDate.split("Paid on");

				if (strArrPaidOn[1].trim().equals(getTodayBillingDate())) {

					passed("User successfully validated the Paid on Date in Billing History As" + strArrPaidOn[1]);

				} else {
					failed(driver, "User Failed to Validate Paid on date in Billing History Expected As"
							+ getTodayBillingDate() + ",but is" + strArrPaidOn[1]);
				}

			}

			else {
				String[] UIBillingDetails = eleiOSBillingAmtAndPaidDate.get(0).getText().split(",");

				String UIBillingAmount = UIBillingDetails[0].trim();

				String UIPaidOnDate = UIBillingDetails[1].trim();

				String strArrPaidOn[] = UIPaidOnDate.split("Paid on");

				if (getFloatFormatOfString(UIBillingAmount) == getFloatFormatOfString(
						Constants.AmtToPayForCouponCode)) {

					passed("User successfully validated the Amount in Billing History As" + UIBillingAmount);

				} else {
					failed(driver, "User Failed to Validate  the Amount in Billing History  Expected As"
							+ Constants.AmtToPayForCouponCode + ",but is" + UIBillingAmount);
				}

				if (strArrPaidOn[1].trim().equals(getTodayBillingDate())) {

					passed("User successfully validated the Paid on Date in Billing History As" + strArrPaidOn[1]);

				} else {
					failed(driver, "User Failed to Validate Paid on date in Billing History Expected As"
							+ getTodayBillingDate() + ",but is" + strArrPaidOn[1]);
				}

			}
		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}

	}

	public void ValidateBillingHistoryForUserWithMembershipPlanUsingCard() {

		try {
			waitForElement(elbtnGOInToBillingHistory.get(0));

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				if (getFloatFormatOfString(eleAndroidBillingAmount.get(0).getText().trim()) == getFloatFormatOfString(
						GlobalVariables.SelectMembershipAmount)) {

					passed("User successfully validated the Amount in Billing History As"
							+ eleAndroidBillingAmount.get(0).getText());

				} else {
					failed(driver,
							"User Failed to Validate  the Amount in Billing History  Expected As"
									+ GlobalVariables.SelectMembershipAmount + ",but is"
									+ eleAndroidBillingAmount.get(0).getText());
				}
				String UIPaidOnDate = eleAndroidPaidDate.get(0).getText().trim();

				String strArrPaidOn[] = UIPaidOnDate.split("Paid on");

				if (strArrPaidOn[1].trim().equals(getTodayBillingDate())) {

					passed("User successfully validated the Paid on Date in Billing History As" + strArrPaidOn[1]);

				} else {
					failed(driver, "User Failed to Validate Paid on date in Billing History Expected As"
							+ getTodayBillingDate() + ",but is" + strArrPaidOn[1]);
				}

			} else {

				String[] UIBillingDetails = eleiOSBillingAmtAndPaidDate.get(0).getText().split(",");

				String UIBillingAmount = UIBillingDetails[0].trim();

				String UIPaidOnDate = UIBillingDetails[1].trim();

				String strArrPaidOn[] = UIPaidOnDate.split("Paid on");

				if (getFloatFormatOfString(UIBillingAmount) == getFloatFormatOfString(
						GlobalVariables.SelectMembershipAmount)) {

					passed("User successfully validated the Amount in Billing History As" + UIBillingAmount);

				} else {
					failed(driver, "User Failed to Validate  the Amount in Billing History  Expected As"
							+ GlobalVariables.SelectMembershipAmount + ",but is" + UIBillingAmount);
				}

				if (strArrPaidOn[1].trim().equals(getTodayBillingDate())) {

					passed("User successfully validated the Paid on Date in Billing History As" + strArrPaidOn[1]);

				} else {
					failed(driver, "User Failed to Validate Paid on date in Billing History Expected As"
							+ getTodayBillingDate() + ",but is" + strArrPaidOn[1]);
				}

			}
		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}

	}

	public void ValidateBillingHistoryForUserWithMembershipPlanUpgradeUsingCard() {

		try {
			waitForElement(elbtnGOInToBillingHistory.get(0));

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				if (getFloatFormatOfString(eleAndroidBillingAmount.get(0).getText().trim()) == getFloatFormatOfString(
						GlobalVariables.SelectUpgradeMembershipAmount)) {

					passed("User successfully validated the Amount in Billing History As"
							+ eleAndroidBillingAmount.get(0).getText());

				} else {
					failed(driver,
							"User Failed to Validate  the Amount in Billing History  Expected As"
									+ GlobalVariables.SelectMembershipAmount + ",but is"
									+ eleAndroidBillingAmount.get(0).getText());
				}
				String UIPaidOnDate = eleAndroidPaidDate.get(0).getText().trim();

				String strArrPaidOn[] = UIPaidOnDate.split("Paid on");

				if (strArrPaidOn[1].trim().equals(getTodayBillingDate())) {

					passed("User successfully validated the Paid on Date in Billing History As" + strArrPaidOn[1]);

				} else {
					failed(driver, "User Failed to Validate Paid on date in Billing History Expected As"
							+ getTodayBillingDate() + ",but is" + strArrPaidOn[1]);
				}

			} else {

				String[] UIBillingDetails = eleiOSBillingAmtAndPaidDate.get(0).getText().split(",");

				String UIBillingAmount = UIBillingDetails[0].trim();

				String UIPaidOnDate = UIBillingDetails[1].trim();

				String strArrPaidOn[] = UIPaidOnDate.split("Paid on");

				if (Math.round(getFloatFormatOfString(UIBillingAmount)) ==Math.round(getFloatFormatOfString(
						GlobalVariables.SelectUpgradeMembershipAmount))) { 

					passed("User successfully validated the Amount in Billing History As" + UIBillingAmount);

				} else {
					failed(driver, "User Failed to Validate  the Amount in Billing History  Expected As"
							+ GlobalVariables.SelectUpgradeMembershipAmount + ",but is" + UIBillingAmount);
				}

				if (strArrPaidOn[1].trim().equals(getTodayBillingDate())) {

					passed("User successfully validated the Paid on Date in Billing History As" + strArrPaidOn[1]);

				} else {
					failed(driver, "User Failed to Validate Paid on date in Billing History Expected As"
							+ getTodayBillingDate() + ",but is" + strArrPaidOn[1]);
				}

			}
		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}

	}

	public void NavigateBackFromInvoicePage() {

		try {
			waitForElement(NavBackInVoice);

			if (isElementPresent(NavBackInVoice)) {

				clickOn(NavBackInVoice, "Back button In Billing History Invoice Screen");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}
	}

	public void NavigateIntoBillingHistoryInVoicePage() {

		try {
			waitForElement(elbtnGOInToBillingHistory.get(0));

			if (isElementPresent(elbtnGOInToBillingHistory.get(0))) {

				clickOn(elbtnGOInToBillingHistory.get(0), "Go button In Billing History Screen");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}

	}

	public void ValidateInVoiceDetailsInBillingHistoryForCouponCode() {

		try {
			NavigateIntoBillingHistoryInVoicePage();

			waitForElement(eleInvoicePaidAmount);

			Thread.sleep(5000);
			if (isElementPresent(eleInvoicePaidAmount)) {

				passed("User successfully Navigated To Billing History InVoice Page");
			}

			else {
				failed(driver, "User failed To Navigate To Billing History InVoice Page");
			}

			if (Math.round(getFloatFormatOfString(eleInvoicePaidAmount.getText())) ==Math.round( getFloatFormatOfString(
					removeSpecialCharacters(Constants.AmtToPayForCouponCode)))){

				passed("User successfully Validated The Billing History InVoice Paid Amount As"
						+ eleInvoicePaidAmount.getText());

			}

			else {
				failed(driver, "User Failed To Validate The Billing History InVoice Paid Amount Expected As"
					+ Constants.AmtToPayForCouponCode + ",But Actual is " + eleInvoicePaidAmount.getText());
			}

			waitForElement(eleInvoicePaymentDate);

			if (getInVoiceDateFormat(getTodayBillingDate().trim()).equals(eleInvoicePaymentDate.getText().trim())) {

				passed("User Successfully Validated  the InVoice Payment Date As " + eleInvoicePaymentDate.getText());

			} else {
				failed(driver, "User Failed To Validate the In Voice Payment Date Expected As" + getTodayBillingDate()
						+ ",But Actual is " + eleInvoicePaymentDate.getText().trim());
			}
		} catch (Exception e) {

			failed(driver, "Exception caught As" + e.getMessage());
		}

	}

	public void ValidateInVoiceDetailsInBillingHistoryForCardPayment() {

		try {
			NavigateIntoBillingHistoryInVoicePage();

			waitForElement(eleInvoicePaidAmount);
			
			waitForElement(eleInvoicePaidAmount);
			
		//	Thread.sleep(10000);

			if (isElementPresent(eleInvoicePaidAmount)) {

				passed("User successfully Navigated To Billing History InVoice Page");
			}

			else {
				failed(driver, "User failed To Navigate To Billing History InVoice Page");
			}

			
			if (Math.round(getFloatFormatOfString(eleInvoicePaidAmount.getText())) ==Math.round(getFloatFormatOfString(
					GlobalVariables.SelectMembershipAmount))) { 

				passed("User successfully validated the Amount in Billing History InVoice Paid Amount As" + eleInvoicePaidAmount.getText());

			} else {
				failed(driver, "User Failed to Validate  the Amount in Billing History InVoice Paid Amount Expected As"
						+ GlobalVariables.SelectMembershipAmount + ",but is" + eleInvoicePaidAmount.getText());
			}


			waitForElement(eleInvoicePaymentDate);

			if (getInVoiceDateFormat(getTodayBillingDate()).equals(eleInvoicePaymentDate.getText().trim())) {

				passed("User Successfully Validated  the In Voice Payment Date As " + eleInvoicePaymentDate.getText());

			} else {
				failed(driver, "User Failed To Validate the In Voice Payment Date Expected As" + getTodayBillingDate()
						+ ",But Actual is " + eleInvoicePaymentDate.getText().trim());
			}
		} catch (Exception e) {

			failed(driver, "Exception caught As" + e.getMessage());
		}

	}

	public void ValidateInVoiceDetailsInBillingHistoryForUpgradePlanCardPayment() {

		try {
			NavigateIntoBillingHistoryInVoicePage();

			waitForElement(eleInvoicePaidAmount);

			if (isElementPresent(eleInvoicePaidAmount)) {

				passed("User successfully Navigated To Billing History InVoice Page");
			}

			else {
				failed(driver, "User failed To Navigate To Billing History InVoice Page");
			}

			
			waitForElement(eleInvoicePaidAmount);
			
			if (Math.round(getFloatFormatOfString(eleInvoicePaidAmount.getText())) == Math.round(
					getFloatFormatOfString(GlobalVariables.SelectUpgradeMembershipAmount))) {

				passed("User successfully Validated The Billing History InVoice Paid Amount As"
						+ eleInvoicePaidAmount.getText());

			}


			else {
				failed(driver,
						"User Failed To Validate The Billing History InVoice Paid Amount Expected As"
								+ GlobalVariables.SelectUpgradeMembershipAmount + ",But Actual is "
								+ eleInvoicePaidAmount.getText());
			}

			waitForElement(eleInvoicePaymentDate);

			if (getInVoiceDateFormat(getTodayBillingDate()).equals(eleInvoicePaymentDate.getText().trim())) {

				passed("User Successfully Validated  the In Voice Payment Date As " + eleInvoicePaymentDate.getText());

			} else {
				failed(driver, "User Failed To Validate the In Voice Payment Date Expected As" + getTodayBillingDate()
						+ ",But Actual is " + eleInvoicePaymentDate.getText().trim());
			}
		} catch (Exception e) {

			failed(driver, "Exception caught As" + e.getMessage());
		}

	}

	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			Thread.sleep(8000);
			waitForElement(lblBillingHistory);
			
			waitForElement(lblBillingHistory);

			if (isElementPresent(lblBillingHistory)) {

				passed("User Successfully Navigated To Billing History  Page");
			} else {
				failed(driver, "User Failed To navigate To Billing History Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
