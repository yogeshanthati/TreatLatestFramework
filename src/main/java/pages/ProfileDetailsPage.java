package pages;

import java.util.List;

import org.openqa.selenium.By;
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

public class ProfileDetailsPage extends TestBase {

	protected ProfileDetailsPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Profile Details')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Profile Details']")
	private MobileElement lblProfileDetails;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_first_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[1]")
	private MobileElement txtFirstName;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_last_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[2]")
	private MobileElement txtLastName;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='calendar']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtDOB;

	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/edit_gender')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='dropDown'])[1]//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtGenderIdentity;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_phone')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[3]")
	private MobileElement txtPhoneNumber;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_address_1')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[4]")
	private MobileElement txtAddress1;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_address_2')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[5]")
	private MobileElement txtAddress2;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_city')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[6]")
	private MobileElement txtCity;

	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='dropDown'])[2]//preceding-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement txtState;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_zip')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[7]")
	private MobileElement txtZIPCode;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_done')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Update Profile Details']")
	private MobileElement btnUpdateProfileDetails;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_toggle_edit')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='EDIT']")
	private MobileElement btnEdit;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_toggle_edit')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	private MobileElement btnCancel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement PickerWheel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btnDone;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Personal Information Updated')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Personal Information Updated']")
	private MobileElement msgSuccessUpdate;

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement btnBack;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'You must agree to our Terms of Service, EULA, and Privacy Policy to continue')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='You must agree to our Terms of Service to continue.']")
	private MobileElement errAgreements;
	
	
	

	public void updateFieldsInProfileDetailsPage() {

		try {
			waitForElement(btnEdit);

			clickOn(btnEdit, "Edit button");

			enterText(txtFirstName, "First Name In  Profile Details", data.get("FirstName"));

			enterText(txtLastName, "Last Name In  Profile Details", data.get("LastName"));

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				EnterDateOfBirthInAndroid();
			} else {
				EnterDateOfBirthIniOS();
			}

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				EnterGenderIdentityInAndroid();
			} else {
				EnterGenderIdentityIniOS();
			}

			EnterPhoneNumber();

			enterText(txtAddress1, "Address1 In Profile Details", data.get("Address1"));

			enterText(txtAddress2, "Address2 In Profile Details", data.get("Address2"));
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Update Profile Details");
			}else {
			SwipeUp();
			}
			
			
			enterText(txtCity, "City In Profile Details", data.get("City"));

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				EnterStateInAndroid();
			} else {
				EnterStateIniOS();
			}

			enterText(txtZIPCode, "ZIP Code In Profile Details", data.get("ZIPCode"));

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterPhoneNumber() {

		try {
			waitForElement(txtPhoneNumber);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				String PhoneNumber = generaterandomNANPnumber(data.get("PhoneNumber"));

				GlobalVariables.PhoneNumber = PhoneNumber;

				enterText(txtPhoneNumber, "PhoneNumber In Profile Details", PhoneNumber);

			} else {
				String PhoneNumber = generaterandomNANPnumber(data.get("PhoneNumber"));
				
				txtPhoneNumber.clear();

				txtPhoneNumber.sendKeys(PhoneNumber);

				//txtPhoneNumber.sendKeys(generateRandomNumber(1));
				
				String UIPhoneNumber=GlobalVariables.PhoneNumber = txtPhoneNumber.getText();
				
				String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

				String PhoneNumberInCreateprofile= arrsUIPhoneNumber.replaceAll("[^\\d]", "");
				
				GlobalVariables.PhoneNumber = PhoneNumberInCreateprofile;
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterDateOfBirthInAndroid() {

		try {
			enterText(txtDOB, "DOB In Create Profile", data.get("DOB"));

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void EnterGenderIdentityIniOS() {

		try {
			waitForElement(txtGenderIdentity);

			clickOn(txtGenderIdentity, "Gender Identity");

			PickerWheel.sendKeys(data.get("Gender"));
			waitForElement(btnDone);

			if (isElementPresent(btnDone)) {

				clickOn(btnDone, "Done button");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterGenderIdentityInAndroid() {

		try {
			enterText(txtGenderIdentity, "Gender Identity In Create Profile", data.get("Gender"));

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void ValidateUpdatedProfileDetails() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				ValidateUpdatedProfileDetailsInAndroid();

			} else {

				ValidateUpdateProfileDetailsInIOS();
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter First name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter First Name']")
	private MobileElement errEmptyFirstName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter Last name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter Last Name']")
	private MobileElement errEmptyLastName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter Phone number')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter Phone Number']")
	private MobileElement errEmptyPhoneNumber;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter Address')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter Address']")
	private MobileElement errEmptyAddress1;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter City')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter City']")
	private MobileElement errEmptyCity;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please select a state')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please select State']")
	private MobileElement errEmptyState;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter ZIP Code')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter ZIP Code']")
	private MobileElement errEmptyZIPCode;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'You must be 18 years old or above')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText)[4]")
	private MobileElement errInValidDOB;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Your first name should be 1 to 30 characters long')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your First Name should be 1 to 30 characters long']")
	private MobileElement errInValidFirstName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Your last name should be 1 to 30 characters long')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your Last Name should be 1 to 30 characters long']")
	private MobileElement errInValidLastName;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter a valid North American phone number')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter a valid North American phone number']")
	private MobileElement errInValidPhoneNumber;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Your address cannot be more than 50 characters')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your address cannot be more than 50 characters']")
	private MobileElement errInValidAddress1;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Your address cannot be more than 50 characters')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your address cannot be more than 50 characters']")
	private MobileElement errInValidAddress2;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Your City should be 1 to 30 characters long')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your City cannot be more than 30 characters']")
	private MobileElement errInvalidCity;

	
	public void ValidateTheFieldsInProfileDetailsPage() {

		try {
			waitForElement(btnEdit);

			clickOn(btnEdit, "Edit button");

			clearTheTextFieldsInProfileDetailsPage();
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Update Profile Details");
			}
			
			waitForElement(btnUpdateProfileDetails);

			if (isElementPresent(btnUpdateProfileDetails)) {

				clickOn(btnUpdateProfileDetails, "Update profile details button ");
			}

			
			takeScreenshot(driver);
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Profile Details");
			}else {
		IOS_SwipeDown();
			}
			waitForElement(errEmptyFirstName);

			if (isElementPresent(errEmptyFirstName)) {
				passed("Successfully verified  Mandatory First Name Field Error Message");
			} else {
				failed(driver, "Failed To verify Mandatory First Name Field Error Message");
			}

			waitForElement(errEmptyLastName);

			if (isElementPresent(errEmptyLastName)) {

				passed("Successfully verified  Mandatory Last Name Field Error Message");
			} else {
				failed(driver, "Failed To verify Mandatory Last Name Field Error Message");
			}
			waitForElement(errEmptyPhoneNumber);

			if (isElementPresent(errEmptyPhoneNumber)) {

				passed("Successfully verified  Mandatory Phone Number Field Error Message");
			} else {
				failed(driver, "Failed To verify Mandatory Phone Number Field Error Message");
			}

			waitForElement(errEmptyAddress1);

			if (isElementPresent(errEmptyAddress1)) {

				passed("Successfully verified  Mandatory Address1 Field Error Message");
			} else {
				failed(driver, "Failed To verify Mandatory Address1 Field Error Message");
			}

			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Update Profile Details");
			}else {
	    IOS_SwipeUP();
			}

			waitForElement(errEmptyCity);

			if (isElementPresent(errEmptyCity)) {

				passed("Successfully verified  Mandatory City FieldError Message");
			} else {
				failed(driver, "Failed To verify Mandatory City Field Error Message");
			}

			waitForElement(errEmptyZIPCode);

			if (isElementPresent(errEmptyZIPCode)) {

				passed("Successfully verified  Mandatory ZIPCode Field  Error Message");
			} else {
				failed(driver, "Failed To verify Mandatory ZIPCode Field Error Message");
			}

			EnterInValidInputsToTheFieldsInProfileDetailsPage();
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Update Profile Details");
			}else {
			SwipeUp();
			}
		

			waitForElement(btnUpdateProfileDetails);

			if (isElementPresent(btnUpdateProfileDetails)) {

				clickOn(btnUpdateProfileDetails, "Update profile details button ");
			}

			takeScreenshot(driver);
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//				scrollToViewElementWithText("Profile Details");
//			}else {
			SwipeDown();
			
			SwipeDown();
			}
	

			
			waitForElement(errInValidFirstName);

			if (isElementPresent(errInValidFirstName)) {

				passed("Successfully verified  InValid First Name Error Message");
			} else {
				failed(driver, "Failed To verify InValid First Name Error Message");
			}

			waitForElement(errInValidLastName);

			if (isElementPresent(errInValidLastName)) {

				passed("Successfully verified  InValid Last Name Error Message");
			} else {
				failed(driver, "Failed To verify InValid Last Name Error Message");
			}
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				waitForElement(errInValidDOB);

				if (isElementPresent(errInValidDOB)) {

					passed("Successfully verified  InValid DOB Error Message");
				} else {
					failed(driver, "Failed To verify InValid DOB Error Message");
				}
			}

			
			waitForElement(errInValidPhoneNumber);

			if (isElementPresent(errInValidPhoneNumber)) {

				passed("Successfully verified  InValid North American Phone Number error Message");
			} else {
				failed(driver, "Failed To verify  InValid North American Phone Number error Message");
			}
			
			waitForElement(errInValidAddress1);

			if (isElementPresent(errInValidAddress1)) {

				passed("Successfully verified  InValid Address1 Error Message");
			} else {
				failed(driver, "Failed To verify InValid Address1 Error Message");
			}
		
			waitForElement(errInValidAddress2);

			if (isElementPresent(errInValidAddress2)) {

				passed("Successfully verified  InValid Address2 Error Message");
			} else {
				failed(driver, "Failed To verify InValid Address2 Error Message");
			}
		
			waitForElement(errInvalidCity);

			if (isElementPresent(errInvalidCity)) {

				passed("Successfully verified  InValid City Error Message");
			} else {
				failed(driver, "Failed To verify InValid City Error Message");
			}
			

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}
	
	
	
	public void EnterZIPCode() {

		try {

			String ZIPCode = generateRandomNumber(5);

			waitForElement(txtZIPCode);

			enterText(txtZIPCode, "ZIP Code In Create Profile", ZIPCode);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}
	
	public void EnterCity() {

		try {

			Thread.sleep(2000);
			
			waitForElement(txtCity);
			
			txtCity.sendKeys( data.get("City"));
			
			passed("Entered value - " + data.get("City") + " in the text field- " + "City");
 
		

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
	public void EnterFirstPriorityFieldsInProfileDetailsPage() {
		try {

			waitForElement(txtFirstName);
			enterText(txtFirstName, "First Name In Create Profile", data.get("FirstName"));

			waitForElement(txtFirstName);
			enterText(txtLastName, "Last Name In Create Profile", data.get("LastName"));

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				EnterDateOfBirthInAndroid();
			} else {
				EnterDateOfBirthIniOS();
			}

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				EnterGenderIdentityInAndroid();
			} else {
				EnterGenderIdentityIniOS();
			}

			enterText(txtPhoneNumber, "PhoneNumber In Create Profile", data.get("PhoneNumber"));

			enterText(txtAddress1, "Address1 In Create Profile", data.get("Address1"));

			enterText(txtAddress2, "Address2 In Create Profile", data.get("Address2"));

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clearTheTextFieldsInProfileDetailsPage() {
		try {
			waitForElement(txtFirstName);

			waitForElement(txtFirstName);

			txtFirstName.clear();

			waitForElement(txtLastName);

			txtLastName.clear();

			waitForElement(txtPhoneNumber);

			txtPhoneNumber.clear();

			waitForElement(txtAddress1);

			txtAddress1.clear();

			waitForElement(txtAddress2);

			txtAddress2.clear();
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Update Profile Details");
			}else {
			
			IOS_SwipeUP();
			
			}	

			waitForElement(txtCity);

			txtCity.clear();

			waitForElement(txtZIPCode);

			txtZIPCode.clear();

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterInValidInputsToTheFieldsInProfileDetailsPage() {
		try {
			

			String MaxUserName = generateRandomString(31);
			
			String MaxAddress=generateRandomString(51);
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
			
			SwipeDown();

			SwipeDown();
			}else {
				IOS_SwipeDown();
			}
			enterText(txtFirstName, "First Name In Profile Details", MaxUserName);

			enterText(txtLastName, "Last Name In Profile Details", MaxUserName);
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				EnterInvalidDateOfBirthInAndroid();
			}
			else {
				EnterInValidDOBIniOS();
			}
			
			
			EnterInValidNANPPhoneNumber();
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Update Profile Details");
			}else {
				IOS_SwipeUP();
			}
			
			enterText(txtAddress1, "Address1 In Profile Details", MaxAddress);

			enterText(txtAddress2, "Address2 In Profile Details", MaxAddress);
			
			enterText(txtCity, "City In Profile Details", MaxUserName);
			
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

public void EnterInValidNANPPhoneNumber() {
		


		try {
			waitForElement(txtPhoneNumber);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				String PhoneNumber =Constants.InValidNANPNumber;

				GlobalVariables.PhoneNumber = PhoneNumber;

				enterText(txtPhoneNumber, "PhoneNumber In Create Profile", PhoneNumber);

			} else {
				String PhoneNumber = Constants.InValidNANPNumber;

				txtPhoneNumber.sendKeys(PhoneNumber);

				txtPhoneNumber.sendKeys(generateRandomNumber(1));
				
				String UIPhoneNumber=GlobalVariables.PhoneNumber = txtPhoneNumber.getText();
				
				String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

				String PhoneNumberInCreateprofile= arrsUIPhoneNumber.replaceAll("[^\\d]", "");
				
				
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	
	}
	public void EnterInvalidDateOfBirthInAndroid() {

		try {
			enterText(txtDOB, "DOB In Create Profile", data.get("InValidDOB"));

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void EnterInValidDOBIniOS() {

		try {
			waitForElement(txtDOB);

			clickOn(txtDOB, "Date of Birth");

			List<WebElement> PickerWheel = driver.findElements(By.xpath("//XCUIElementTypePickerWheel"));
			
			System.out.println(PickerWheel.size());

			String DOB = data.get("InValidDOB");
			String DOBString = getDateFormatToString(DOB);

			String DOBArr[] = DOBString.split(" ");

			

			waitForElement(PickerWheel.get(0));

			if (isElementPresent(PickerWheel.get(0))) {

				enterText(PickerWheel.get(0), "PickerValue Element Date", DOBArr[0]);

			}

			if (isElementPresent(PickerWheel.get(1))) {

				enterText(PickerWheel.get(1), "PickerValue Element Month", DOBArr[1]);

			}

			if (isElementPresent(PickerWheel.get(2))) {

				enterText(PickerWheel.get(2), "PickerValue Element Year", DOBArr[2]);

			}

			waitForElement(btnDone);

			if (isElementPresent(btnDone)) {

				clickOn(btnDone, "Done button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void ValidateUpdatedProfileDetailsInAndroid() {

		try {
			if (txtFirstName.getAttribute("text").equals(data.get("FirstName"))) {

				passed("First Name Text Field successfully Updated As " + txtFirstName.getAttribute("text"));

			} else {
				failed(driver, "First Name text Field expected as " + data.get("FirstName") + "but updated as "
						+ txtFirstName.getAttribute("text"));
			}

			if (txtLastName.getAttribute("text").equals(data.get("LastName"))) {

				passed("Last Name Text Field successfully Updated As " + txtLastName.getAttribute("text"));

			} else {
				failed(driver, "Last Name text Field expected as " + data.get("LastName") + "but updated as "
						+ txtLastName.getAttribute("text"));
			}

			if (txtDOB.getAttribute("text").equals(data.get("DOB"))) {

				passed("DOB text Field successfully Updated As " + txtDOB.getAttribute("text"));

			} else {
				failed(driver, "DOB text Field expected as " + data.get("DOB") + "but updated as "
						+ txtDOB.getAttribute("text"));
			}

			if (txtGenderIdentity.getAttribute("text").equals(data.get("Gender"))) {

				passed("Gender Identity text Field successfully Updated As " + txtGenderIdentity.getAttribute("text"));

			} else {
				failed(driver, "Gender Identity text Field expected as " + data.get("Gender") + "but updated as "
						+ txtGenderIdentity.getAttribute("text"));
			}

			String UIUpdatedphoneNumber = txtPhoneNumber.getAttribute("text");

			String UpdatedphoneNumber = UIUpdatedphoneNumber.replace("-", "");

			if (UpdatedphoneNumber.equals(GlobalVariables.PhoneNumber)) {

				passed("Phone Number text Field successfully Updated As " + UpdatedphoneNumber);

			} else {
				failed(driver, "Phone Number text Field expected as " + data.get("PhoneNumber") + "but updated as "
						+ UpdatedphoneNumber);
			}

			if (txtAddress1.getAttribute("text").equals(data.get("Address1"))) {

				passed("Address1 text Field successfully Updated As " + txtAddress1.getAttribute("text"));

			} else {
				failed(driver, "Address1 text Field expected as " + data.get("Address1") + "but updated as "
						+ txtAddress1.getAttribute("text"));
			}

			if (txtAddress2.getAttribute("text").equals(data.get("Address2"))) {

				passed("Address2 text Field successfully Updated As " + txtAddress2.getAttribute("text"));

			} else {
				failed(driver, "Address2 text Field expected as " + data.get("Address2") + "but updated as "
						+ txtAddress2.getAttribute("text"));
			}
	
				SwipeUp();
			
			if (txtCity.getAttribute("text").equals(data.get("City"))) {

				passed("City text Field successfully Updated As " + txtCity.getAttribute("text"));

			} else {
				failed(driver, "City text Field expected as " + data.get("City") + "but updated as "
						+ txtCity.getAttribute("text"));
			}
			if (txtState.getAttribute("text").equals(data.get("State"))) {

				passed("State text Field successfully Updated As " + txtState.getAttribute("text"));

			} else {
				failed(driver, "State text Field expected as " + data.get("State") + "but updated as "
						+ txtState.getAttribute("text"));
			}

			if (txtZIPCode.getAttribute("text").equals(data.get("ZIPCode"))) {

				passed("ZIPCode text Field successfully Updated As " + txtZIPCode.getAttribute("text"));

			} else {
				failed(driver, "ZIPCode text Field expected as " + data.get("ZIPCode") + "but updated as "
						+ txtZIPCode.getAttribute("text"));
			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}



	public void ValidateUpdateProfileDetailsInIOS() {

		try {
			if (txtFirstName.getAttribute("value").equals(data.get("FirstName"))) {

				passed("First Name Text Field successfully Updated As " + txtFirstName.getAttribute("value"));

			} else {
				failed(driver, "First Name text Field expected as " + data.get("FirstName") + "but updated as "
						+ txtFirstName.getAttribute("value"));
			}

			if (txtLastName.getAttribute("value").equals(data.get("LastName"))) {

				passed("Last Name Text Field successfully Updated As " + txtLastName.getAttribute("value"));

			} else {
				failed(driver, "Last Name text Field expected as " + data.get("LastName") + "but updated as "
						+ txtLastName.getAttribute("value"));
			}

			if (txtDOB.getAttribute("label").equals(GlobalVariables.DOB)) {

				passed("DOB text Field successfully Updated As " + txtDOB.getAttribute("label"));

			} else {
				failed(driver, "DOB text Field expected as " + data.get("DOB") + "but updated as "
						+ txtDOB.getAttribute("label"));
			}

			if (txtGenderIdentity.getAttribute("value").equals(data.get("Gender"))) {

				passed("Gender Identity text Field successfully Updated As " + txtGenderIdentity.getAttribute("value"));

			} else {
				failed(driver, "Gender Identity text Field expected as " + data.get("Gender") + "but updated as "
						+ txtGenderIdentity.getAttribute("value"));
			}

			String UIUpdatedphoneNumber = txtPhoneNumber.getAttribute("value");

			String UpdatedphoneNumber = UIUpdatedphoneNumber.replaceAll("[^\\d.]", "");

			if (UpdatedphoneNumber.equals("1" + GlobalVariables.PhoneNumber)) {

				passed("Phone Number text Field successfully Updated As " + UpdatedphoneNumber);

			} else {
				failed(driver, "Phone Number text Field expected as " + data.get("PhoneNumber") + "but updated as "
						+ UpdatedphoneNumber);
			}

			if (txtAddress1.getAttribute("value").equals(data.get("Address1"))) {

				passed("Address1 text Field successfully Updated As " + txtAddress1.getAttribute("value"));

			} else {
				failed(driver, "Address1 text Field expected as "  + data.get("Address1") + "but updated as "
						+ txtAddress1.getAttribute("text"));
			}

			if (txtAddress2.getAttribute("value").equals(data.get("Address2"))) {

				passed("Address2 text Field successfully Updated As " + txtAddress2.getAttribute("value"));

			} else {
				failed(driver, "Address2 text Field expected as " + data.get("Address2") + "but updated as "
						+ txtAddress2.getAttribute("value"));
			}

			if (txtCity.getAttribute("value").equals(data.get("City"))) {

				passed("City text Field successfully Updated As " + txtCity.getAttribute("value"));

			} else {
				failed(driver, "City text Field expected as " + data.get("City") + "but updated as "
						+ txtCity.getAttribute("value"));
			}
			if (txtState.getAttribute("value").equals(data.get("State"))) {

				passed("State text Field successfully Updated As " + txtState.getAttribute("value"));

			} else {
				failed(driver, "State text Field expected as " + data.get("State") + "but updated as "
						+ txtState.getAttribute("value"));
			}

			if (txtZIPCode.getAttribute("value").equals(data.get("ZIPCode"))) {

				passed("ZIPCode text Field successfully Updated As " + txtZIPCode.getAttribute("value"));

			} else {
				failed(driver, "ZIPCode text Field expected as " + data.get("ZIPCode") + "but updated as "
						+ txtZIPCode.getAttribute("value"));
			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public MyProfilePage clickOnUpdateProfileDetailsButton() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Update Profile Details");
			}else {
			SwipeUp();
			}

			waitForElement(btnUpdateProfileDetails);

			if (isElementPresent(btnUpdateProfileDetails)) {

				clickOn(btnUpdateProfileDetails, "Update profile details button ");
			}

//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				waitForElement(msgSuccessUpdate);

				if (isElementPresent(msgSuccessUpdate)) {

					passed("Successfully validated the Update password Success Message");

				} else {
					failed(driver, "Failed to validate Update password Success Message");
				}
//			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new MyProfilePage(driver, data);
	}

	public void EnterStateInAndroid() {

		try {
			waitForElement(txtState);
			enterText(txtState, "State In Create Profile", data.get("State"));

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterStateIniOS() {
		try {
			waitForElement(txtState);

			clickOn(txtState, "State");

			// enterText(PickerWheel, "State", data.get("State"));
			
			waitForElement(PickerWheel);

			PickerWheel.sendKeys(data.get("State"));

			passed("Enter state As" + data.get("State"));

			waitForElement(btnDone);

			if (isElementPresent(btnDone)) {

				clickOn(btnDone, "Done button");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterDateOfBirthIniOS() {

		try {
			waitForElement(txtDOB);

			clickOn(txtDOB, "Date of Birth");
			
			waitForElement(PickerWheel);
			

			List<WebElement> PickerWheel = driver.findElements(By.xpath("//XCUIElementTypePickerWheel"));
			System.out.println(PickerWheel.size());

			String DOB = data.get("DOB");

		
			String DOBString = getDateFormatToString(DOB);

			String DOBArr[] = DOBString.split(" ");

			String date1[] = DOBArr[0].split("0");

			waitForElement(PickerWheel.get(0));

			if (isElementPresent(PickerWheel.get(0))) {

				// enterText(PickerWheel.get(0), "PickerValue Element Date", date1[1]);

				PickerWheel.get(0).sendKeys(DOBArr[0]);

				passed("Enter Day As" + DOBArr[1]);

			}

			if (isElementPresent(PickerWheel.get(1))) {

				// enterText(PickerWheel.get(1), "PickerValue Element Month", DOBArr[1]);

				PickerWheel.get(1).sendKeys(DOBArr[1]);
				passed("Enter Month As" + DOBArr[1]);

			}

			if (isElementPresent(PickerWheel.get(2))) {

				// enterText(PickerWheel.get(2), "PickerValue Element Year", DOBArr[2]);

				PickerWheel.get(2).sendKeys(DOBArr[2]);
				passed("Enter year As" + DOBArr[2]);
			}

			waitForElement(btnDone);

			if (isElementPresent(btnDone)) {

				clickOn(btnDone, "Done button");
			}
			
			GlobalVariables.DOB = txtDOB.getAttribute("name");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public MyProfilePage clickOnBackButton() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Profile Details");
			}
			
			waitForElement(btnBack);

			clickOn(btnBack, "Navigate Back Arrow button");

		} catch (Exception e) {

			e.printStackTrace();
		}

		return new MyProfilePage(driver, data);

	}

	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(lblProfileDetails);

			if (isElementPresent(lblProfileDetails)) {

				passed("User Successfully Navigated To Profile Details Page");
			} else {
				failed(driver, "User Failed To navigate To Profile Details Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
