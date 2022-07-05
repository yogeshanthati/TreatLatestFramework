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

public class BuyMembershipPage extends TestBase {

	protected BuyMembershipPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Buy Membership')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Buy Membership']")
	private MobileElement eleBuyMembership;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_coupon_code')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Coupon Code']")
	private MobileElement eleCouponCodeTitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_coupon_description')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Coupon Code']//following-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement eleCouponCodeDescription;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_coupon_code')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Coupon Code']//following-sibling::XCUIElementTypeTextField")
	private MobileElement txtCouponCode;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_apply_coupon')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Apply Coupon']")
	private MobileElement btnApplyCoupon;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_no_coupon')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'HAVE A COUPON CODE')]")
	private MobileElement btnIdonthaveCoupon;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_cancel_discount')]")
	@iOSXCUITFindBy(xpath = "	//XCUIElementTypeButton[@name='cancel']")
	private MobileElement btnCancelDiscount;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_membership_cost')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Payment Summary']//following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement eleMembershipCost;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_membership_discount')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Coupon Code Discount')]//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleMembershipDiscount;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_final_amount')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Amount to Pay']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAmountToPay;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement btnProceed;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'id/item_discount')]//android.widget.TextView[contains(@text,'applied')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'applied')]")
	private MobileElement eleCouponApplied;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Add Credit Card')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Add Credit Card')]")
	private MobileElement eleAddCreditCard;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/et_card_number')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@name,'Add Credit Card')]//following:: XCUIElementTypeOther/XCUIElementTypeTextField)[1]")
	private MobileElement txtCardNumber;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/et_expiry')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@name,'Add Credit Card')]//following:: XCUIElementTypeOther/XCUIElementTypeTextField)[2]")
	private MobileElement txtExpiryDate;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/et_cvc')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@name,'Add Credit Card')]//following:: XCUIElementTypeOther/XCUIElementTypeTextField)[3]")
	private MobileElement txtCVC;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'id/country_layout')]//android.widget.Spinner")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@name,'Add Credit Card')]//following:: XCUIElementTypeOther/XCUIElementTypeTextField)[4]")
	private MobileElement txtCountry;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/postal_code')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@name,'Add Credit Card')]//following::XCUIElementTypeOther/XCUIElementTypeTextField)[5]")
	private MobileElement txtPostCode;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_add_card')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Add This Card']")
	private MobileElement btnAddCard;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'XXXX')]//following-sibling::XCUIElementTypeButton")
	private MobileElement btnSelectCard;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_make_payment')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Make Payment']")
	private MobileElement btnMakePayment;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Your card number is invalid.')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Your card number is invalid.')]")
	private MobileElement errCardNumber;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'expiry year is invalid.')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'expiration year is invalid.')]")
	private MobileElement errExpiryYear;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'security code is invalid.')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'security code is invalid.')]")
	private MobileElement errSecurityCode;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Your postal code is invalid')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Your postal code is invalid')]")
	private MobileElement errPostalCode;

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement NavBackButton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_done')]//following-sibling::android.widget.TextView[contains(@resource-id,'id/tv_description')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='doneToast']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement msgAddCardSuccess;

	public void EnterCouponCode() {

		try {
			waitForElement(txtCouponCode);

			enterText(txtCouponCode, "", data.get("CouponCode"));
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnBackButtonInBuyMembership() {
		try {
			waitForElement(NavBackButton);
			clickOn(NavBackButton, "Navigate Back Button");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

//	public MembershipPlansPage NavigateBackToMembershipPlans() {
//		try {
//			waitForElement(NavBackButton);
//			clickOn(NavBackButton, "Navigate Back Button");
//			SwipeDown();
//			SwipeDown();
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//		return new MembershipPlansPage(driver, data);
//	}

	public void clickOnApplyCoupon() {
		try {
			waitForElement(btnApplyCoupon);
			clickOn(btnApplyCoupon, "Apply coupoon button");
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnIdontHaveCouponButton() {

		try {
			waitForElement(btnIdonthaveCoupon);
			clickOn(btnIdonthaveCoupon, "I dont have coupon button");
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void ValidateDetailsInBuyMembership() {

		try {
			waitForElement(eleCouponCodeTitle);

			if (eleCouponCodeTitle.getText().trim().equals(Constants.txtHeadCouponCode.trim())) {

				passed("User Successfully Validated the  Coupon Code Title In Buy Membership Page");

			} else {
				failed(driver, "User Failed To Validate  the  Coupon Code Title In Buy Membership Page");
			}

			if (eleCouponCodeDescription.getText().trim().equals(Constants.txtEnterCouponCodeDescription.trim())) {

				passed("User Successfully Validated the Enter Coupon Code Description In Buy Membership Page");

			} else {
				failed(driver, "User Failed To Validate  the Enter Coupon Code Description In Buy Membership Page");
			}

			waitForElement(btnIdonthaveCoupon);

			if (isElementPresent(btnIdonthaveCoupon)) {

				passed("User Successfully Validated the I don't have Coupon code link In Buy Membership Page");
			} else {

				failed(driver, "User Failed To Validate  the I don't have Coupon code link In Buy Membership Page");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateInvalidInputsTotheFieldsInAddCreditCardPage() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				waitForElement(txtCardNumber);

				enterText(txtCardNumber, "Credit Card Number", data.get("InValidCardNumber"));

				waitForElement(txtExpiryDate);

				enterText(txtExpiryDate, "Expiry Date", data.get("ValidExpiryDate"));

				waitForElement(txtCVC);

				enterText(txtCVC, "CVC", generateRandomNumber(3));

				waitForElement(txtPostCode);

				enterText(txtPostCode, "Post code", generateRandomNumber(6));

				clickOnAddCardButton();

				if (isElementPresent(errCardNumber)) {

					passed("Successfully validated the InValid CardNumber Error Message");
				} else {
					failed(driver, "Failed To Validate the InValid CardNumber Error Message");
				}

				waitForElement(txtCardNumber);

				enterText(txtCardNumber, "Credit Card Number", data.get("ValidCardNumber"));

				waitForElement(txtExpiryDate);

				enterText(txtExpiryDate, "Expiry Date", data.get("InValidExpiryDate"));

				waitForElement(txtCVC);

				enterText(txtCVC, "CVC", generateRandomNumber(3));

				waitForElement(txtPostCode);

				enterText(txtPostCode, "Post code", generateRandomNumber(6));

				clickOnAddCardButton();

				if (isElementPresent(errExpiryYear)) {
					passed("Successfully validated the InValid Expiry date Error Message");
				} else {
					failed(driver, "Failed To Validate the InValid Expiry date Error Message");
				}

				waitForElement(txtCardNumber);

				enterText(txtCardNumber, "Credit Card Number", data.get("ValidCardNumber"));

				waitForElement(txtExpiryDate);

				enterText(txtExpiryDate, "Expiry Date", data.get("ValidExpiryDate"));

				waitForElement(txtCVC);

				enterText(txtCVC, "CVC", " ");

				waitForElement(txtPostCode);

				enterText(txtPostCode, "Post code", generateRandomNumber(6));

				clickOnAddCardButton();
				if (isElementPresent(errSecurityCode)) {
					passed("Successfully validated the InValid Security Code Error Message");
				} else {
					failed(driver, "Failed To Validate the InValid Security Code Error Message");
				}

				waitForElement(txtCardNumber);

				enterText(txtCardNumber, "Credit Card Number", data.get("ValidCardNumber"));

				waitForElement(txtExpiryDate);

				enterText(txtExpiryDate, "Expiry Date", data.get("ValidExpiryDate"));

				waitForElement(txtCVC);

				enterText(txtCVC, "CVC", generateRandomNumber(3));

				waitForElement(txtPostCode);

				enterText(txtPostCode, "Post code", " ");

				clickOnAddCardButton();

				if (isElementPresent(errPostalCode)) {
					passed("Successfully validated the InValid Postal Code Error Message");
				} else {
					failed(driver, "Failed To Validate the InValid Postal Code Error Message");
				}

			} else {

				waitForElement(txtCardNumber);

				enterText(txtCardNumber, "Credit Card Number", data.get("InValidCardNumber"));

				waitForElement(txtExpiryDate);

				enterText(txtExpiryDate, "Expiry Date", data.get("ValidExpiryDate"));

				waitForElement(txtCVC);

				enterText(txtCVC, "CVC", generateRandomNumber(3));

				waitForElement(txtPostCode);

				enterText(txtPostCode, "Post code", generateRandomNumber(6));

				if (isElementPresent(errCardNumber)) {

					passed("Successfully validated the InValid CardNumber Error Message");
				} else {
					failed(driver, "Failed To Validate the InValid CardNumber Error Message");
				}

				waitForElement(txtCardNumber);

				enterText(txtCardNumber, "Credit Card Number", data.get("ValidCardNumber"));

				waitForElement(txtExpiryDate);

				enterText(txtExpiryDate, "Expiry Date", data.get("InValidExpiryDate"));

				if (isElementPresent(errExpiryYear)) {
					passed("Successfully validated the InValid Expiry date Error Message");
				} else {
					failed(driver, "Failed To Validate the InValid Expiry date Error Message");
				}

				waitForElement(NavBackButton);

				clickOn(NavBackButton, "Navigate Back button");

				waitForElement(btnIdonthaveCoupon);

				clickOn(btnIdonthaveCoupon, "I dont have coupon button");

			}

		} catch (Exception e) {

			failed(driver, "Exception caught As" + e.getMessage());
		}

	}

	public void EnterValidCardDetailsInAddCreditCardPage() {

		try {
			waitForElement(txtCardNumber);

			enterText(txtCardNumber, "Credit Card Number", data.get("ValidCardNumber"));

			waitForElement(txtExpiryDate);

			enterText(txtExpiryDate, "Expiry Date", data.get("ValidExpiryDate"));

			waitForElement(txtCVC);

			enterText(txtCVC, "CVC", generateRandomNumber(3));

			waitForElement(txtPostCode);

			enterText(txtPostCode, "Post code", generateRandomNumber(6));
		} catch (Exception e) {

			failed(driver, "Exception caught As" + e.getMessage());

		}

	}

	public void clickOnAddCardButton() {

		try {
			waitForElement(btnAddCard);

			clickOn(btnAddCard, "Add Card button");

		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}
	}

	public MembershipCongratulationsPage clickOnMakePaymentButton() {

		try {
			waitForElement(btnMakePayment);

			clickOn(btnMakePayment, "Make Payment button");

		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}

		return new MembershipCongratulationsPage(driver, data);
	}

	public MembershipDetailsPage clickOnMakePaymentButtonInUpGrade() {

		try {
			waitForElement(btnMakePayment);
			clickOn(btnMakePayment, "Make Payment button");
		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}

		return new MembershipDetailsPage(driver, data);
	}

	public void selectCardInAddCreditCardPage() {

		try {
			waitForElement(btnSelectCard);
			clickOn(btnSelectCard, "Card Select button");
		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}
	}

	public void ValidateAddingCardInAddCreditCardPage() {

		try {

			waitForElement(btnSelectCard);

			waitForElement(btnMakePayment);

			if (isElementPresent(btnSelectCard) || isElementPresent(btnMakePayment)) {

				passed("User successfully added the card In Add credit card page");

			}

			else {
				failed(driver, "User Failed to add the card In Add credit card Page");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}

	}

	public void ValidateAddCardSuccessMessage() {

		try {
			if (isElementPresent(msgAddCardSuccess)) {

				if (msgAddCardSuccess.getText().trim().equalsIgnoreCase(Constants.msgSuccessAddCard)) {

					passed("Successfully validate Card Added Success Message");

				} else {
					failed(driver, "Failed To Validate  Card Added  Success Message");
				}
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateApplyCouponDetailsInBuyMembership() {

		try {
			waitForElement(eleCouponApplied);

			takeScreenshot(driver);

			if (isElementPresent(eleCouponApplied)) {

				passed("User successfully validated  applied coupon  in Buy Membership Page");
			} else {

				failed(driver, "User Failed To validate  applied coupon  in Buy Membership Page");
			}

			waitForElement(eleMembershipCost);

			if (getFloatFormatOfString(eleMembershipCost.getText().trim()) == getFloatFormatOfString(
					GlobalVariables.SelectMembershipAmount.trim())) {

				passed("User Successfully validated the Membership cost In Buy Membership Page As "
						+ eleMembershipCost.getText());

			} else {
				failed(driver,
						" User Failed to validate the Membership cost In Buy Membership Page Expected As "
								+ getFloatFormatOfString(GlobalVariables.SelectMembershipAmount.trim())
								+ "But Actual is" + getFloatFormatOfString(eleMembershipCost.getText().trim()));
			}

			if (getFloatFormatOfString(eleMembershipDiscount.getText().trim()) == getFloatFormatOfString(
					GlobalVariables.SelectMembershipAmount.trim())) {

				passed("User Successfully validated the Membership Discount In Buy Membership Page As"
						+ getFloatFormatOfString(eleMembershipDiscount.getText().trim()));

			} else {
				failed(driver,
						" User Failed to validate the Membership Discount In Buy Membership Page Expected As"
								+ getFloatFormatOfString(GlobalVariables.SelectMembershipAmount.trim())
								+ "But Actual is " + getFloatFormatOfString(eleMembershipDiscount.getText().trim()));
			}

			if (getFloatFormatOfString(eleAmountToPay.getText()) == getFloatFormatOfString(
					Constants.AmtToPayForCouponCode.trim())) {

				passed("User Successfully validated the Amount To Pay In Buy Membership Page As "
						+ eleAmountToPay.getText());

			} else {
				failed(driver,
						" User Failed to validate the Amount To Pay In Buy Membership Page Expected As"
								+ getFloatFormatOfString(Constants.AmtToPayForCouponCode.trim()) + "But Actual is"
								+ getFloatFormatOfString(eleAmountToPay.getText()));
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	public MembershipCongratulationsPage clickOnProceedButton() {

		try {
			clickOn(btnProceed, "Proceed button");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new MembershipCongratulationsPage(driver, data);

	}

	public void SelectCardToBuyMembership() {
		try {
			clickOnIdontHaveCouponButton();

			EnterValidCardDetailsInAddCreditCardPage();

			clickOnAddCardButton();

			ValidateAddingCardInAddCreditCardPage();

			selectCardInAddCreditCardPage();

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(eleBuyMembership);

			if (isElementPresent(eleBuyMembership)) {

				passed("User Successfully Navigated To Buy Membership Page");
			} else {
				failed(driver, "User Failed To navigate To Buy Membership Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
