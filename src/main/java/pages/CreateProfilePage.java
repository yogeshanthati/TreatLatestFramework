package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.css.Rect;

import base.TestBase;
import groovyjarjarantlr4.runtime.tree.BufferedTreeNodeStream;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Constants;
import utilities.Data;
import utilities.GlobalKeys;
import utilities.GlobalVariables;

public class CreateProfilePage extends TestBase {

	protected CreateProfilePage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/title_become_treat_member')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Create a Profile']")
	private MobileElement eleCreateProfile;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_first_name')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
	private MobileElement txtFirstName;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_last_name')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
	private MobileElement txtLastName;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='calendar']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtDOB;

	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/edit_gender')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Gender*']")
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
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='dropDown'])[2]")
	private MobileElement txtState;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_zip')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[7]")
	private MobileElement txtZIPCode;



	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/iv_terms_of_service')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Terms of Service']//preceding-sibling::XCUIElementTypeButton[1]")
	private MobileElement chkTermsOfService;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/iv_eula')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='End-user License Agreement']//preceding-sibling::XCUIElementTypeButton[1]")
	private MobileElement chkEULAgreement;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/iv_privacy_policy')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Privacy Policy']//preceding-sibling::XCUIElementTypeButton[1]")
	private MobileElement chkPrivacyPolicy;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/iv_newsletter')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Opt in for our Newsletter']//preceding-sibling::XCUIElementTypeButton")
	private MobileElement chkOptForNewsLetter;
	

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_terms_of_service')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Terms of Service']")
	private MobileElement lnkTermsOfService;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_eula')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='End-user License Agreement']")
	private MobileElement lnkEULAgreement;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_privacy_policy')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Privacy Policy']")
	private MobileElement lnkPrivacyPolicy;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'TREAT MOBILE APP TERMS OF USE')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'TREAT MOBILE APP TERMS OF USE')]")
	private MobileElement eleInTermsOfUse;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Mobile Software Application License Agreement')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Mobile Software Application License Agreement')]")
	private MobileElement eleInEULAgreements;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Privacy Policy')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Privacy Policy')]")
	private MobileElement eleInPrivacyPolicy;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_done')]")
	@iOSXCUITFindBy(accessibility = "Continue")
	private MobileElement btnContinue_Done;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement PickerWheel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btnDone;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email or Phone already exists.')]")
	private MobileElement errAlreadyExists;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/skip_for_now')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SKIP FOR NOW']")
	private MobileElement btnSkipForNow;

	@AndroidFindBy(id = "android:id/button2")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Not Now']")
	private MobileElement btnNotNow;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_done')]//following-sibling::android.widget.TextView[contains(@resource-id,'id/tv_description')]")
	private MobileElement msgRegSuccess;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_start_my_journey')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Become a Treat Member']")
	private MobileElement btnbecomeATreatMember;


	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	private MobileElement AndroidStateDrpdown;
	
	
	
	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement NavBack;

	public void EnterCreateAccountFields() {

		try {
			
			
			EnterFirstName();

			
			EnterLastName();

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

			EnterAddress1();

			EnterAddress2();
					
			EnterCity();
			
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				scrollToViewElementWithText("Terms Of Service");
				
			} else {
				SwipeUp(); 
			}
	
			
	

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				EnterStateInAndroid();
			} else {
				EnterStateIniOS();
			}

			EnterZIPCode();
			
		

			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

//	public MembershipPlansPage clickOnBecomeATreatMemberButton() {
//
//		try {
//			
//			waitForElement(btnbecomeATreatMember);
//			clickOn(btnbecomeATreatMember, "Become A TreatMember Button");
//
//		} catch (Exception e) {
//
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//		return new MembershipPlansPage(driver, data);
//	}

	public void SelectUserAgreements() {

		try {
			
			SwipeUp();
			
			ValidateOptForNewsLetterCheckbox();
			
			clickOnOptForNewsLetterCheckbox();
			
			clickOnTermsOfServiceCheckBox();

			clickOnEULAgreementCheckBox();

			clickOnPrivacyPolicyCheckBox();
			
		

			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught As " + e.getMessage());
		}

	}
	
	

	public void EnterFirstName() {

		try {

			waitForElement(txtFirstName);
			enterText(txtFirstName, "First Name In Create Profile", data.get("FirstName"));

			GlobalVariables.FirstName = data.get("FirstName");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void EnterLastName() {

		try {
			waitForElement(txtLastName);
			enterText(txtLastName, "Last Name In Create Profile", data.get("LastName"));

			GlobalVariables.LastName = data.get("LastName");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void EnterDateOfBirthInAndroid() {

		try {
			waitForElement(txtDOB);
			
			enterText(txtDOB, "DOB In Create Profile", data.get("DOB"));

			GlobalVariables.DOB = data.get("DOB");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void EnterDateOfBirthIniOS() {

		try {
			waitForElement(txtDOB);

			clickOn(txtDOB, "Date of Birth");
			
		//	Thread.sleep(5000);

			List<WebElement> PickerWheel = driver.findElements(By.xpath("//XCUIElementTypePickerWheel"));

			String DOB = data.get("DOB");

			String DOBString = getDateFormatToString(DOB);

			String DOBArr[] = DOBString.split(" ");

		//	String date1[] = DOBArr[0].split("0");

			waitForElement(PickerWheel.get(0));
			
			if (isElementPresent(PickerWheel.get(1))) {

			//	 enterText(PickerWheel.get(1), "PickerValue Element Month", DOBArr[1]);

				PickerWheel.get(1).sendKeys(DOBArr[1]);
				
			

			}


			if (isElementPresent(PickerWheel.get(0))) {

				// enterText(PickerWheel.get(0), "PickerValue Element Date", date1[1]);

				PickerWheel.get(0).sendKeys(DOBArr[0]);

			}

		
			if (isElementPresent(PickerWheel.get(2))) {

				// enterText(PickerWheel.get(2), "PickerValue Element Year", DOBArr[2]);

				PickerWheel.get(2).sendKeys(DOBArr[2]);

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

	public void EnterInvalidDateOfBirthInAndroid() {

		try {
			waitForElement(txtDOB);
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

			String DOB = data.get("IOSInValidDOB");
			String DOBString = getDateFormatToString(DOB);

			String DOBArr[] = DOBString.split(" ");

			String date1[] = DOBArr[0].split("0");

			waitForElement(PickerWheel.get(0));

			if (isElementPresent(PickerWheel.get(0))) {

				enterText(PickerWheel.get(0), "PickerValue Element Date", date1[1]);

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
			failed(driver, "Exception caught As " + e.getMessage());
		}
	}

	public void EnterGenderIdentityIniOS() {

		try {
			waitForElement(txtGenderIdentity);

			clickOn(txtGenderIdentity, "Gender Identity");

	
			PickerWheel.sendKeys(data.get("Gender"));

			GlobalVariables.GenderIdentity = data.get("Gender");
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
			waitForElement(txtGenderIdentity);
			
			txtGenderIdentity.sendKeys(data.get("Gender"));
		
			GlobalVariables.GenderIdentity = data.get("Gender");

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
				
				enterText(txtPhoneNumber, "PhoneNumber In Create Profile", PhoneNumber);

			//	txtPhoneNumber.sendKeys(PhoneNumber);

				txtPhoneNumber.sendKeys(generateRandomNumber(1));
				
				String UIPhoneNumber=GlobalVariables.PhoneNumber = txtPhoneNumber.getText();
				
				String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

				String PhoneNumberInCreateprofile= arrsUIPhoneNumber.replaceAll("[^\\d]", "");
				
				
			}

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

				enterText(txtPhoneNumber, "PhoneNumber In Create Profile", PhoneNumber);

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

	public void EnterAddress1() {

		try {
			waitForElement(txtAddress1);
			enterText(txtAddress1, "Address1 In Create Profile", data.get("Address1"));

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterAddress2() {

		try {
			waitForElement(txtAddress2);
			enterText(txtAddress2, "Address2 In Create Profile", data.get("Address2"));

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

	public void EnterStateInAndroid() {

		try {
			
			
			waitForElement(AndroidStateDrpdown);

			TapOnElement(AndroidStateDrpdown, "State dropdown Element");
			
			Thread.sleep(2000);
   
			enterText(txtState, "State", data.get("State"));
			
			TapOnElement(txtZIPCode, "ZIP Code");
		} catch (Exception e) {
			
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		
	}

	
	public void EnterStateIniOS() {
		try {
			waitForElement(txtState);

			
			if(isElementPresent(txtState)) {
				
				clickOn(txtState, "State");
			}
			
			waitForElement(txtState);


		

			PickerWheel.sendKeys(data.get("State"));

			waitForElement(btnDone);

			if (isElementPresent(btnDone)) {

				clickOn(btnDone, "Done button");
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

	
	public void ValidateOptForNewsLetterCheckbox() {
		
		try {
			waitForElement(chkOptForNewsLetter);
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
			
			if(!chkOptForNewsLetter.isSelected()){
				
				passed("Successfully validated OPt in for Our NewsLetter has Checked by default");
				
			}
			else {
				failed(driver,"Failed  To Validate Default check for  OPt in for Our NewsLetter  Check box");
				
				
			}
			}
			else {
				
				if(chkOptForNewsLetter.getAttribute("name").equals("check")) {
					passed("Successfully validated OPt in for Our NewsLetter has Checked by default");
					
				}
				else {
					failed(driver,"Failed  To Validate Default check for  OPt in for Our NewsLetter  Check box");
					
					
				}
				
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
				}
	
		
	}
	
	public void clickOnOptForNewsLetterCheckbox() {

		try {
			waitForElement(chkOptForNewsLetter);

			clickOn(chkOptForNewsLetter, "Opt in for Our NewsLetter check box");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	
	
	public void clickOnTermsOfServiceCheckBox() {

		try {
			waitForElement(chkTermsOfService);

			clickOn(chkTermsOfService, "TermsOfService check box");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnEULAgreementCheckBox() {

		try {
			waitForElement(chkEULAgreement);

			clickOn(chkEULAgreement, "EUL Agreement check box");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void clickOnPrivacyPolicyCheckBox() {

		try {
			waitForElement(chkPrivacyPolicy);

			clickOn(chkPrivacyPolicy, "PrivacyPolicyCheckBox");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void clickOnContinue_DoneButton() {

		try {
			waitForElement(btnContinue_Done);

			clickOn(btnContinue_Done, "Continue button");
			Thread.sleep(3000);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void VerifyRegistrationStatus() {

		try {

			VerifyRegisterationSuccessMessage();
			
			Thread.sleep(10000);

			waitForElement(btnbecomeATreatMember);

			if (isElementPresent(btnbecomeATreatMember)) {

				passed("User succesfully completed the registration in treat App, ");

				takeScreenshot(driver);

			} else {
				failed(driver, "User failed to complete the registration in treat App.");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void VerifyRegisterationSuccessMessage() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
			
				waitForElement(msgRegSuccess);
			if (isElementPresent(msgRegSuccess)) {

				if (msgRegSuccess.getText().trim().equalsIgnoreCase(Constants.msgSuccessRegisteration)) {

					passed("Successfully validate Registration Success Message");

				} else {
					failed(driver, "Failed To Validate  Registration Success Message");
				}
			}
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public AppNavPage clickOnSkipForNow() {

		try {

			sleep(3000);

			waitForElement(btnSkipForNow);

			clickOn(btnSkipForNow, "Skip for Now Button");

			clickOnNotNowButton();

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppNavPage(driver, data);

	}

	public void clickOnNotNowButton() {

		try {
	
			if (isElementPresent(btnNotNow)) {

				clickOn(btnNotNow, "NotNow  button");
			}
		} catch (Exception e) { 
			failed(driver, "Exception caught " + e.getMessage());
		}
	}
	
	public void validateNavigationToMandatoryAgreementCheckboxLinks() {
		
		try {

			waitForElement(lnkTermsOfService);

			clickOn(lnkTermsOfService, "Terms Of Service Link");

			waitForElement(eleInTermsOfUse);

			waitForElement(eleInTermsOfUse);
                                             
			if (isElementPresent(eleInTermsOfUse)) {
				passed("Successfully Validated Navigation for Terms Of Service Link");
			} else {
				failed(driver, "Failed To validate the Navigation For Terms Of Service Link");
			}

			waitForElement(NavBack);

			clickOn(NavBack, "Navigate Back button");

			Thread.sleep(2000);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				scrollToViewElementWithText("Terms Of Service");

			} else {
				SwipeUp();
			}

			waitForElement(lnkEULAgreement); 
			
			
			

			clickOn(lnkEULAgreement, "EUL Agreements Link");

			waitForElement(eleInEULAgreements);

			waitForElement(eleInEULAgreements);

			if (isElementPresent(eleInEULAgreements)) {
				passed("Successfully Validated Navigation for EUL Agreements  Link");
			} else {
				failed(driver, "Failed To validate the Navigation For EUL Agreements Link");
			}

			waitForElement(NavBack);

			clickOn(NavBack, "Navigate Back button");

			Thread.sleep(2000);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				scrollToViewElementWithText("Terms Of Service");

			} else {
				SwipeUp();
			}

			waitForElement(lnkPrivacyPolicy);

			clickOn(lnkPrivacyPolicy, "Privacy Policy Link");

			waitForElement(eleInPrivacyPolicy);	

			waitForElement(eleInPrivacyPolicy);  

			if (isElementPresent(eleInPrivacyPolicy)) {
				passed("Successfully Validated Navigation for Privacy Policy Link");
			} else {
				failed(driver, "Failed To validate the Navigation For Privacy Policy Link");
			}

			waitForElement(NavBack);

			clickOn(NavBack, "Navigate Back button");
			Thread.sleep(2000);
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				scrollToViewElementWithText("Terms Of Service");

			} else {
				SwipeUp();
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

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please select Date of Birth')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please select Date of Birth']")
	private MobileElement errEmptyDOB;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please select Gender')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please select Gender']")
	private MobileElement errEmptyGender;

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

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'You must agree to our Terms of Service, EULA, and Privacy Policy to continue')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='You must agree to our Terms of Service to continue.']")
	private MobileElement errAgreements;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'You must be 18 years old or above')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText)[6]")
	private MobileElement errInValidDOB;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Your first name should be 1 to 50 characters long')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your First Name should be 1 to 50 characters long']")
	private MobileElement errInValidFirstName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Your last name should be 1 to 50 characters long')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your Last Name should be 1 to 50 characters long']")
	private MobileElement errInValidLastName;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter a valid North American phone number')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter a valid North American phone number']")
	private MobileElement errInValidPhoneNumber;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_email')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private MobileElement txtEmailAddress;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
	private MobileElement txtPassword;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
	private MobileElement txtShowPassword;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_continue')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
	private MobileElement btnContinue;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter an Email Address')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter an Email Address']")
	private MobileElement errEmptyEmailAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter a Password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter a Password']")
	private MobileElement errEmptyPassword;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'The email entered is invalid. Please try again.')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='The email entered is invalid. Please try again.']")
	private MobileElement errInvalidEmailAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter a valid Password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter a valid Password']")
	private MobileElement errInvalidPassword;

	@AndroidFindBy(accessibility = "Show password")
	@iOSXCUITFindBy(accessibility = "showPassword")
	private MobileElement btnShowPwd;

	@AndroidFindBy(accessibility = "Show password")
	@iOSXCUITFindBy(accessibility = "hidePassword")
	private MobileElement btnHidePwd;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Your password must be at least 8 characters long')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText [contains(@name,'Your password must be at least 8 characters long')]")
	private MobileElement lblPassworddRegex;

	public void ValidateMandatoryFieldsInCreateProfilePage() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Continue");
			}
			else {
			SwipeUp();
			}
			clickOnContinue_DoneButton();

			takeScreenshot(driver);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Create Profile");
			}else {
			SwipeDown();
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

			waitForElement(errEmptyDOB);

			if (isElementPresent(errEmptyDOB)) {

				passed("Successfully verified  Mandatory DOB Field Error Message");
			} else {
				failed(driver, "Failed To verify Mandatory DOB Field Error Message");
			}

			waitForElement(errEmptyGender);

			if (isElementPresent(errEmptyGender)) {

				passed("Successfully verified  Mandatory Gender Field Error Message");
			} else {
				failed(driver, "Failed To verify Mandatory Gender Field Error Message");
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
				scrollToViewElementWithText("Continue");
			}else {
				SwipeUp();
			}
			

			waitForElement(errEmptyCity);

			if (isElementPresent(errEmptyCity)) {

				passed("Successfully verified  Mandatory City FieldError Message");
			} else {
				failed(driver, "Failed To verify Mandatory City Field Error Message");
			}

			waitForElement(errEmptyState);

			if (isElementPresent(errEmptyState)) {

				passed("Successfully verified  Mandatory State Field Error Message");
			} else {
				failed(driver, "Failed To verify Mandatory State Field Error Message");
			}

			waitForElement(errEmptyZIPCode);

			if (isElementPresent(errEmptyZIPCode)) {

				passed("Successfully verified  Mandatory ZIPCode Field  Error Message");
			} else {
				failed(driver, "Failed To verify Mandatory ZIPCode Field Error Message");
			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void verifyInvalidInputsToFieldsInCreateProfilePage() {

		try {
			String MaxUserName = generateRandomString(51);
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Create Profile");
			}else {
			SwipeDown();

			SwipeDown();
			}
			enterText(txtFirstName, "First Name In Create Profile", MaxUserName);

			enterText(txtLastName, "Last Name In Create Profile", MaxUserName);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				EnterInvalidDateOfBirthInAndroid();
			}

			EnterInValidNANPPhoneNumber();
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Continue");
			}else {

			SwipeUp();
			}
			clickOnContinue_DoneButton();
			
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				scrollToViewElementWithText("Create Profile");
			}else {
			SwipeDown();
			}

			takeScreenshot(driver);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				waitForElement(errInValidDOB);

				if (isElementPresent(errInValidDOB)) {

					passed("Successfully verified  InValid DOB Error Message");
				} else {
					failed(driver, "Failed To verify InValid DOB Error Message");
				}
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
			
			waitForElement(errInValidPhoneNumber);

			if (isElementPresent(errInValidPhoneNumber)) {

				passed("Successfully verified  InValid North American Phone Number error Message");
			} else {
				failed(driver, "Failed To verify  InValid North American Phone Number error Message");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void verifyAgreementsInCreateProfilePage() {

		try {
			EnterCreateAccountFields();

			clickOnContinue_DoneButton();

			if (isElementPresent(errAgreements)) {

				passed("User Successfully Verified Mandatory Agreements Error Message");

				takeScreenshot(driver);
			} else {
				failed(driver, "User Failed To Verify Mandatory Agreements Error Message");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	

	public void CreateAProfileInTreat() {

		try {
			EnterEmailAddressAndPasswordInCreateProfile();

			clickOnContinueButton();

			EnterCreateAccountFields();

			SelectUserAgreements();

			clickOnContinue_DoneButton();

			VerifyRegistrationStatus();
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}
	}

	public void EnterEmailAddressAndPasswordInCreateProfile() {

		try {

			GlobalVariables.CreateUserName = data.get("EmailAddress") + generateRandomNumber(3)+generateRandomNumber(3) + "@yopmail.com";


			GlobalVariables.CreateUserPwd = data.get("Password");

			enterText(txtEmailAddress, "Email Address In Create Profile Landing  Page", GlobalVariables.CreateUserName);

			enterText(txtPassword, "Password In Create Profile Landing Page", GlobalVariables.CreateUserPwd);

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnContinueButton() {

		try {

		//	TapOnElement(btnContinue, "Continue button");
			clickOn(btnContinue, "Continue button In Create Profile Landing Page");
			clickOnNotNowButton();
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		
	}
	
	public void ValidateNavigationToMandatoryAgreementPagesInCreateProfilePage() {
		waitForElement(lnkEULAgreement);
		
		if(isElementPresent(lnkTermsOfService)) {
			
			clickOn(lnkTermsOfService, "Terms of Service Link");
		}
		
		
		
		
	}

	public void ValidatePasswordRegexAndMaskingInCreateProfileLandingPage() {

		try {
			waitForElement(txtPassword);

			enterText(txtPassword, "Password In CreateProfile Landing Page", data.get("Password"));

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				String Passwpord = txtPassword.getAttribute("password");

				boolean bolPasswpord = Boolean.parseBoolean(Passwpord);

				if (bolPasswpord) {

					passed("User successfully validated  masking of the Password text field In Create Profile Landing  Page");

					takeScreenshot(driver);

				} else {
					failed(driver,
							"Failed To Validate masking of the Password text field  In Create Profile Landing  Page");
				}

				TapOnElement(btnShowPwd, "Show password icon");

				String ShowPasswpord = txtPassword.getAttribute("password");

				boolean bolShowPasswpord = Boolean.parseBoolean(ShowPasswpord);

				if (!bolShowPasswpord) {

					passed("User successfully validated the Show password icon Functionality  In Create Profile Landing  Page ");

					takeScreenshot(driver);

				} else {
					failed(driver,
							"Failed To Validate the Show password icon Functionality  In Create Profile Landing  Page");
				}

				clickOn(btnHidePwd, "Hide password icon");

			} else {

				String PasswpordTag = txtPassword.getAttribute("type");

				if (PasswpordTag.equals("XCUIElementTypeSecureTextField")) {

					passed("User successfully validated  masking of the Password text field In Create Profile Landing  Page");

					takeScreenshot(driver);

				} else {
					failed(driver,
							"Failed To Validate masking of the Password text field  In Create Profile Landing  Page");
				}

				clickOn(btnShowPwd, "Show password icon");

				String ShowPasswpordTag = txtShowPassword.getAttribute("type");

				if (ShowPasswpordTag.equals("XCUIElementTypeTextField")) {

					passed("User successfully validated the Show password icon Functionality  In Create Profile Landing  Page ");

					takeScreenshot(driver);

				} else {
					failed(driver,
							"Failed To Validate the Show password icon Functionality  In Create Profile Landing  Page");
				}

				clickOn(btnHidePwd, "Hide password icon");

			}

			enterText(txtPassword, "Password In Create Profile  Page", data.get("InValidPassword"));

			waitForElement(lblPassworddRegex);

			if (isElementPresent(lblPassworddRegex)) {

				passed("User successfully validated the  password regex description for Invalid password  In Create Profile Landing  Page ");

				takeScreenshot(driver);

			} else {
				failed(driver,
						"Failed To  validate the  password regex description for Invalid password  In Create Profile Landing  Page");
			}

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUserLogInWithEmptyEmailAddressAndPassword() {

		try {

			clearText(txtEmailAddress);

			clearText(txtPassword);

			clickOn(btnContinue, "Continue button In Create Profile Landing Page");

			waitForElement(errEmptyEmailAddress);

			if (isElementPresent(errEmptyEmailAddress)) {

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
			enterText(txtEmailAddress, "Email Address In Create Profile  Page", data.get("InValidEmailAddress"));

			enterText(txtPassword, "Password In Create Profile  Page", data.get("Password"));

			clickOn(btnContinue, "Continue button In Create Profile Page");

			waitForElement(errInvalidEmailAddress);

			if (isElementPresent(errInvalidEmailAddress)) {

				passed("User successfully verfied the InValid email address error message In Create Profile Landing  Page");
			} else {
				failed(driver,
						"Failed to verify  InValid email address error message  In Create Profile Landing  Page");
			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}
	
	public AppointmentsPage ClickOnNavigateBackToAppointments() {
		try {
			clickOn(NavBack, "Navigate Back button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppointmentsPage(driver, data);
	}
	
	
	
	
	

	public void ValidateUserLogInWithValidEmailAddressAndInvalidPassword() {

		try {
			enterText(txtEmailAddress, "Email Address In Create Profile  Page", data.get("EmailAddress"));

			enterText(txtPassword, "Password In Create Profile  Page", data.get("InValidPassword"));

			clickOn(btnContinue, "Continue button In Create ProfileLogIn Page");

			waitForElement(errInvalidPassword);

			if (isElementPresent(errInvalidPassword)) {

				passed("User successfully verfied the Invalid Password error message In Create Profile Landing  Page");
			} else {
				failed(driver, "Failed to verify  Invalid Password error message In Create Profile Landing  Page ");
			}

			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUserLogInWithInvalidEmailAddressAndInvalidPassword() {

		try {
			enterText(txtEmailAddress, "Email Address In Create Profile  Page", data.get("InValidEmailAddress"));

			enterText(txtPassword, "Password In Create Profile  Page", data.get("InValidPassword"));

			clickOn(btnContinue, "Continue button In Create Profile Page");

			waitForElement(errInvalidEmailAddress);

			if (isElementPresent(errInvalidEmailAddress)) {

				passed("User successfully verfied the InValid email address error message  In Create Profile Landing  Page");
			} else {
				failed(driver,
						"Failed to verify  InValid email address error message  In Create Profile Landing  Page ");
			}

			waitForElement(errInvalidPassword);

			if (isElementPresent(errInvalidPassword)) {

				passed("User successfully verfied the Invalid Password error message  In Create Profile Landing  Page");
			} else {
				failed(driver, "Failed to verify  Invalid Password error message  In Create Profile Landing  Page");
			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(eleCreateProfile);

			if (isElementPresent(eleCreateProfile)) {

				passed("User Successfully Navigated To CreateProfilePage");
			} else {
				failed(driver, "User Failed To navigate To the Createprofile Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
