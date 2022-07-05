package pages;

import java.util.List;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Constants;
import utilities.Data;
import utilities.GlobalKeys;

public class PaymentMethodsPage extends TestBase {

	protected PaymentMethodsPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Payment Methods')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Payment Methods']")
	private MobileElement elePaymentMethods;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_no_cards')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='creditCardBig']")
	private MobileElement ImgNoCreditCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_no_cards_added')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Payment Methods']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleNoCardsAddedTitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_no_card_description')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Payment Methods']//following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement eleNoCardsAddedDesc;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/bt_add_credit_card')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Add Credit Card']")
	private MobileElement btnAddCreditCard;
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_add_card')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Add This Card']")
	private MobileElement btnAddCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Add Credit Card')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Add Credit Card']") // change
	private MobileElement eleAddCreditCardTitle;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/et_card_number')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Add Credit Card']//following::XCUIElementTypeOther/XCUIElementTypeTextField)[1]")
	private MobileElement txtCardNumber;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/et_expiry')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Add Credit Card']//following::XCUIElementTypeOther/XCUIElementTypeTextField)[2]")
	private MobileElement txtExpDate;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/et_cvc')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Add Credit Card']//following::XCUIElementTypeOther/XCUIElementTypeTextField)[3]")
	private MobileElement txtCVC;

	@AndroidFindBy(xpath = "//android.widget.Spinner]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Add Credit Card']//following::XCUIElementTypeOther/XCUIElementTypeTextField)[4]")
	private MobileElement txtCountry;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/postal_code')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Add Credit Card']//following::XCUIElementTypeOther/XCUIElementTypeTextField)[5]")
	private MobileElement txtPostalCode;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/ic_card')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'XXXX')]//preceding-sibling::XCUIElementTypeImage")
	private List<MobileElement> ImgAddedCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_account_no')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'XXXX')]")
	private List<MobileElement> eleAddedCardNumber;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_card_expiry')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Expires')]")
	private List<MobileElement> eleAddedCardExpDate;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/delete_card')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='trash']")
	private List<MobileElement> btnAddedCardDelete;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_text')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']//preceding-sibling::XCUIElementTypeStaticText")
	private List<MobileElement> eleCardDeleteDialogText;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement btnCardDeleteDialogYes;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_negative')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	private MobileElement btnCardDeleteDialogNo;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/errors')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Payment Methods']")
	private MobileElement errInPaymentMethods;

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

	public void clickOnAddCreditCardButton() {

		try {

			waitForElement(btnAddCreditCard);

			clickOn(btnAddCreditCard, "Add Credit Card Button");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateAddCardSuccessMessage() {

		try {
			waitForElement(msgAddCardSuccess);
			if (isElementPresent(msgAddCardSuccess)) {

				if (msgAddCardSuccess.getText().trim().equalsIgnoreCase(Constants.msgSuccessAddCard)) {

					passed("Successfully validate Card Added Success Message");

				} else {
					failed(driver, "Failed To Validate  Card Added  Success Message");
				}

			}

			Thread.sleep(5000);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateNoCardsAddedInPaymentMethods() {

		try {
			waitForElement(ImgNoCreditCard);

			if (isElementPresent(ImgNoCreditCard)) {

				passed("User successfully validated the  No Credit card image in payment methods ");
			} else {
				failed(driver, "User failed To Validate the  No Credit card image in payment methods");
			}

			waitForElement(eleNoCardsAddedTitle);

			if (eleNoCardsAddedTitle.getText().trim().replaceAll("\\s+", "")
					.equalsIgnoreCase(Constants.NoCardsAddedTitle.replaceAll("\\s+", ""))) {

				passed("User successfully validated the  No Cards Added Title in payment methods ");
			} else {
				failed(driver, "User failed To Validate thge No Cards Added Title in payment methods");
			}

			waitForElement(eleNoCardsAddedDesc);

			if (eleNoCardsAddedDesc.getText().trim().replaceAll("\\s+", "")
					.equalsIgnoreCase(Constants.NoCardsAddedDesc.replaceAll("\\s+", ""))) {

				passed("User successfully validated the  No Cards Added Description in payment methods ");
			} else {
				failed(driver, "User failed To Validate thge No Cards Added Description in payment methods");
			}

			waitForElement(btnAddCreditCard);

			if (isElementPresent(btnAddCreditCard)) {
				passed("User successfully validated the   Add credit card button in payment methods ");
			} else {
				failed(driver, "User failed To Validate thge Add credit card button in payment methods");
			}

			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnAddCardButton() {

		try {
			waitForElement(btnAddCard);
			clickOn(btnAddCard, "Add Card Button");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateCreditCardFieldsInPaymentMethods() {

		try {
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				clickOnAddCreditCardButton();
				
				waitForElement(txtCardNumber);

				enterText(txtCardNumber, "Credit Card Number", data.get("InValidCardNumber"));

				waitForElement(txtExpDate);

				enterText(txtExpDate, "Expiry Date", data.get("ValidExpiryDate"));

				waitForElement(txtCVC);

				enterText(txtCVC, "CVC", generateRandomNumber(3));

				waitForElement(txtPostalCode);

				enterText(txtPostalCode, "Post code", generateRandomNumber(6));

				clickOnAddCardButton();

				if (isElementPresent(errCardNumber)) {

					passed("Successfully validated the InValid CardNumber Error Message");

					takeScreenshot(driver);
				} else {
					failed(driver, "Failed To Validate the InValid CardNumber Error Message");
				}

				waitForElement(txtCardNumber);

				enterText(txtCardNumber, "Credit Card Number", data.get("ValidCardNumber"));

				waitForElement(txtExpDate);

				enterText(txtExpDate, "Expiry Date", data.get("InValidExpiryDate"));

				waitForElement(txtCVC);

				enterText(txtCVC, "CVC", generateRandomNumber(3));

				waitForElement(txtPostalCode);

				enterText(txtPostalCode, "Post code", generateRandomNumber(6));

				clickOnAddCardButton();

				if (isElementPresent(errExpiryYear)) {
					passed("Successfully validated the InValid Expiry date Error Message");
					takeScreenshot(driver);
				} else {
					failed(driver, "Failed To Validate the InValid Expiry date Error Message");
				}

				waitForElement(txtCardNumber);

				enterText(txtCardNumber, "Credit Card Number", data.get("ValidCardNumber"));

				waitForElement(txtExpDate);

				enterText(txtExpDate, "Expiry Date", data.get("ValidExpiryDate"));

				waitForElement(txtCVC);

				enterText(txtCVC, "CVC", " ");

				waitForElement(txtPostalCode);

				enterText(txtPostalCode, "Post code", generateRandomNumber(6));

				clickOnAddCardButton();
				if (isElementPresent(errSecurityCode)) {
					passed("Successfully validated the InValid Security Code Error Message");
					takeScreenshot(driver);
				} else {
					failed(driver, "Failed To Validate the InValid Security Code Error Message");
				}
				
				clickonNavigateBackButtonInPaymentMethods();
			}

//				waitForElement(txtCardNumber);
//
//				enterText(txtCardNumber, "Credit Card Number", data.get("ValidCardNumber"));
//
//				waitForElement(txtExpDate);
//
//				enterText(txtExpDate, "Expiry Date", data.get("ValidExpiryDate"));
//
//				waitForElement(txtCVC);
//
//				enterText(txtCVC, "CVC", generateRandomNumber(3));
//
//				waitForElement(txtPostalCode);
//
//				enterText(txtPostalCode, "Post code", " ");
//
//				clickOnAddCardButton();
//
//				if (isElementPresent(errPostalCode)) {
//					passed("Successfully validated the InValid Postal Code Error Message");
//					takeScreenshot(driver);
//				} else {
//					failed(driver, "Failed To Validate the InValid Postal Code Error Message");
//				}
//				
//				
			

//			} else {
//
//				waitForElement(txtCardNumber);
//
//				enterText(txtCardNumber, "Credit Card Number", data.get("InValidCardNumber"));
//
//				waitForElement(txtExpDate);
//
//				enterText(txtExpDate, "Expiry Date", data.get("ValidExpiryDate"));
//
//				waitForElement(txtCVC);
//
//				enterText(txtCVC, "CVC", generateRandomNumber(3));
//
//				waitForElement(txtPostalCode);
//
//				enterText(txtPostalCode, "Post code", generateRandomNumber(6));
//
//				if (isElementPresent(errCardNumber)) {
//
//					passed("Successfully validated the InValid CardNumber Error Message");
//					takeScreenshot(driver);
//				} else {
//					failed(driver, "Failed To Validate the InValid CardNumber Error Message");
//				}
//
//				waitForElement(txtCardNumber);
//
//				enterText(txtCardNumber, "Credit Card Number", data.get("ValidCardNumber"));
//
//				waitForElement(txtExpDate);
//
//				enterText(txtExpDate, "Expiry Date", data.get("InValidExpiryDate"));
//
//				if (isElementPresent(errExpiryYear)) {
//
//					passed("Successfully validated the InValid Expiry date Error Message");
//					takeScreenshot(driver);
//				} else {
//					failed(driver, "Failed To Validate the InValid Expiry date Error Message");
//				}
//
//				enterText(txtExpDate, "Expiry Date", data.get("ValidExpiryDate"));
//
//				waitForElement(txtCardNumber);
//
//				enterText(txtCardNumber, "Credit Card Number", data.get("ValidCardNumber"));
//
//			}

		} catch (Exception e) {

			failed(driver, "Exception caught As" + e.getMessage());
		}

	}

	public void EnterValidCardDetailsInAddCreditCardPage() {

		try {
			waitForElement(txtCardNumber);

			enterText(txtCardNumber, "Credit Card Number", data.get("ValidCardNumber"));

			waitForElement(txtExpDate);

			enterText(txtExpDate, "Expiry Date", data.get("ValidExpiryDate"));

			waitForElement(txtCVC);

			enterText(txtCVC, "CVC", generateRandomNumber(3));

			waitForElement(txtPostalCode);

			enterText(txtPostalCode, "Post code", generateRandomNumber(6));

			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught As" + e.getMessage());

		}

	}

	public void EnterValidCardDetailsForSecondCardInAddCreditCardPage() {

		try {
			waitForElement(txtCardNumber);

			enterText(txtCardNumber, "Credit Card Number", data.get("ValidCardNumber2"));

			waitForElement(txtExpDate);

			enterText(txtExpDate, "Expiry Date", data.get("ValidExpiryDate"));

			waitForElement(txtCVC);

			enterText(txtCVC, "CVC", generateRandomNumber(3));

			waitForElement(txtPostalCode);

			enterText(txtPostalCode, "Post code", generateRandomNumber(6));
			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught As" + e.getMessage());

		}

	}

	public void ValidateAddedCardDetailsInPaymentMethods() {
		try {
			waitForElement(ImgAddedCard.get(0));

			waitForElement(ImgAddedCard.get(0));

			if (isElementPresent(ImgAddedCard.get(0))) {
				passed("Successfully Validated Added card Image in Payment Methods");
			} else {
				failed(driver, "Failed To Validate Added card Image in Payment Methods");
			}

			waitForElement(eleAddedCardNumber.get(0));

			if (isElementPresent(eleAddedCardNumber.get(0))) {
				passed("Successfully Validated Added card Number in Payment Methods");
			} else {
				failed(driver, "Failed To Validate Added card Number in Payment Methods");
			}

			waitForElement(eleAddedCardExpDate.get(0));

			if (isElementPresent(eleAddedCardExpDate.get(0))) {
				passed("Successfully Validated Added card  Expiry Date  in Payment Methods");
			} else {
				failed(driver, "Failed To Validate Added card  Expiry Date in Payment Methods");
			}

			waitForElement(btnAddedCardDelete.get(0));

			if (isElementPresent(btnAddedCardDelete.get(0))) {

				passed("Successfully Validated Added card delete button in Payment Methods");
			} else {
				failed(driver, "Failed To Validate Added card delete button in Payment Methods");
			}

			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateAddedSecondCardDetailsInPaymentMethods() {
		try {
			waitForElement(ImgAddedCard.get(1));

			if (isElementPresent(ImgAddedCard.get(1))) {
				passed("Successfully Validated Added Second card Image in Payment Methods");
			} else {
				failed(driver, "Failed To Validate Added Second card Image in Payment Methods");
			}

			waitForElement(eleAddedCardNumber.get(1));

			if (isElementPresent(eleAddedCardNumber.get(1))) {
				passed("Successfully Validated Added Second card Number in Payment Methods");
			} else {
				failed(driver, "Failed To Validate Added  Second card Number in Payment Methods");
			}

			waitForElement(eleAddedCardExpDate.get(1));

			if (isElementPresent(eleAddedCardExpDate.get(1))) {
				passed("Successfully Validated Added Second card  Expiry Date  in Payment Methods");
			} else {
				failed(driver, "Failed To Validate Added  Secondcard  Expiry Date in Payment Methods");
			}

			waitForElement(btnAddedCardDelete.get(1));

			if (isElementPresent(btnAddedCardDelete.get(1))) {

				passed("Successfully Validated Added Second card delete button in Payment Methods");
			} else {
				failed(driver, "Failed To Validate Added  Second card delete button in Payment Methods");
			}

			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void DeleteAddedCardInPaymentMethods() {

		try {

			Thread.sleep(4000);

			waitForElement(btnAddedCardDelete.get(0));

			if (isElementPresent(btnAddedCardDelete.get(0))) {

				clickOn(btnAddedCardDelete.get(0), "Added card delete button");
			}

			waitForElement(btnCardDeleteDialogNo);

			clickOn(btnCardDeleteDialogNo, " Card Delete Dialog box No button ");

			if (isElementPresent(eleAddedCardNumber.get(0)) && isElementPresent(btnAddedCardDelete.get(0))) {

				passed("User successfully Validated Card Delete Dialog box No button Functionality");
				takeScreenshot(driver);
			} else {
				failed(driver, "User Failed To Validate the  Delete Dialog box No button Functionality");
			}

			waitForElement(btnAddedCardDelete.get(0));

			if (isElementPresent(btnAddedCardDelete.get(0))) {

				clickOn(btnAddedCardDelete.get(0), "Added card delete button");

			}
			waitForElement(btnCardDeleteDialogYes);

			clickOn(btnCardDeleteDialogYes, " Card Delete Dialog box Yes button ");

			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public MyProfilePage NavigateBackToMyProfilePage() {

		try {
			Thread.sleep(5000);
			waitForElement(NavBackButton);

			clickOn(NavBackButton, "Navigate Back button");
			
			SwipeDown();
			
			SwipeDown();
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		return new MyProfilePage(driver, data);

	}

	public void clickonNavigateBackButtonInPaymentMethods() {

		try {
			waitForElement(NavBackButton);

			clickOn(NavBackButton, "Navigate Back button");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(elePaymentMethods);

			if (isElementPresent(elePaymentMethods)) {

				passed("User Successfully Navigated To Payment Methods Page");
			} else {
				failed(driver, "User Failed To navigate To Payment Methods Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
