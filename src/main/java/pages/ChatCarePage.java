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

public class ChatCarePage extends TestBase {

	protected ChatCarePage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}
	

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_become_a_treat_member')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Become a Treat Member']")
	private MobileElement btnBecomeTreatMember;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_become_a_treat_member')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Become a Treat Member']//preceding-sibling::XCUIElementTypeStaticText")
	private MobileElement eleChatCareText;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Chat Care')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Chat Care']")
	private MobileElement eleChatcareTitle;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_main_icon')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='careOnChatImage']")
	private MobileElement imgChatCareLogo;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/description_care_on_chat')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Chat Care']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleChatcareDescriptionForMemberUSer;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/description_benefit_unavailable')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Become a Treat Member']//preceding-sibling::XCUIElementTypeStaticText")
	private MobileElement eleChatCareDescriptionForNonMember;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/text_input_end_icon')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']")
	private MobileElement btnDropdownInChatCare;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_done')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement btnProceedFirstTime;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/button_proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement btnProceed;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.xpresspa.treatmobile.dev:id/btn_done')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement btnProceed1;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,':id/tv_cancel')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	private MobileElement btnCancel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btnDone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement elePickerWheel;

	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Select an option')]")
	private MobileElement txtSelectConsultationFor;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_who_is_this_for')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Chat Care']//following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement eleConsulationQuestion;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/button_begin_consultation')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Begin Consultation']")
	private MobileElement btnBeginConsultation;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Patient Details')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Patient Details']")
	private MobileElement elePatientDetails;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Name')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Patient Name')]//following-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement elePatientName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Date of Birth')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Date of Birth')]//following-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement elePatientDOB;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Gender Identity')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Gender Identity')]//following-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement elePatientGenderIdentity;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Phone')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Phone')]//following-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement elePatientPhoneNumber;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Email')]//following-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement elePatientEmail;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/welcome')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Welcome, Treat Member!')]")
	private MobileElement ele98point6WelcomeText;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/tour_skip')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SkipButton']")
	private MobileElement btnSkip;

	@AndroidFindBy(accessibility = "Exit 98point6")
	@iOSXCUITFindBy(accessibility = "Exit 98point6")
	private MobileElement ele98point6Exit;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Leave')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Leave']")
	private MobileElement btn98point6Exit_LEAVE;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Stay')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Stay']")
	private MobileElement btn98point6Exit_STAY;

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement btnNavigateBack;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/login_phone_number')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='PhoneNumberField']")
	private MobileElement ele98point6PhoneNumberTextField;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/login_next_button')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SubmitButton']")
	private MobileElement ele98point6SubmitButton;

	
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
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_email')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[4]")
	private MobileElement txtEmail;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_address_1')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[5]")
	private MobileElement txtAddress1;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_address_2')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[6]")
	private MobileElement txtAddress2;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_city')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[7]")
	private MobileElement txtCity;

	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='dropDown'])[2]//preceding-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement txtState;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_zip')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField[8]")
	private MobileElement txtZIPCode;
	
	
	public void ValidateButtonTextfieldInChatCarePage()
	{
		ValidateElementTextInPage(btnBeginConsultation, Constants.ChatCarePage_BeginConsultation_text, "ChatCarePage", "Begin Consultation Button");
	}
	
	public void ValidateChatCarePermissionsForNonMemberUser() {

		try {
			waitForElement(btnBecomeTreatMember);
			if (isElementPresent(btnBecomeTreatMember)) {
				passed("Successfully Validate the Become Atreat Member button  For Non Member User In ChatCare page PopUp");
			} else {
				failed(driver,
						"Failed To Validate the Become Atreat Member button  For Non Member User In ChatCare page PopUp");
			}

			waitForElement(eleChatCareDescriptionForNonMember);

			if (eleChatCareDescriptionForNonMember.getText().replaceAll("\\s+", "")
					.equals(Constants.nonSubChatCareIntro.replaceAll("\\s+", ""))) {

				passed("Successfully Validate the Chat Care Description For Non Member User In ChatCare page Popup");
			} else {
				failed(driver,
						"Failed To Validate the Chat Care Description For Non Member User In ChatCare page Popup");
			}

			waitForElement(btnCancel);
			if (isElementPresent(btnCancel)) {
				passed("Successfully Validate the Cancel button  For Non Member User  In ChatCare page Popup");
			} else {
				failed(driver, "Failed To Validate the Cancel button For Non Member User  In ChatCare page Popup");
			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnCancelButtonInChatCare() {

		try {
			waitForElement(btnCancel);
			if (isElementPresent(btnCancel)) {
				passed("Successfully Validate the Cancel button  For Non Member User  In ChatCare page Popup");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void validateCancelButtonFunctionalityInChatCare() {

		try {
			if (!isElementPresent(btnBecomeTreatMember)) {
				passed("User successfully validated the cancel button Functionality In Chat care");
				takeScreenshot(driver);
			} else {
				failed(driver, "User Failed To Validate the cancel button Functionality In Chat care ");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

//	public MembershipPlansPage clickOnBecomeATreatMemberButton() {
//
//		try {
//			waitForElement(btnBecomeTreatMember);
//
//			clickOn(btnBecomeTreatMember, "Become A Treat Member In Chat Care");
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//		return new MembershipPlansPage(driver, data);
//	}

	//

	public void ValidateChatCarePermissionsForMemberUser() {

		try {
			ValidateChatCareDetailsForMemberUser();

			SelectConsultationForSelf();
			
			ValidateFirstimeChatCareLaunchPatientDetailsForSelf();
			
			ValidateChatCareLaunchForSelf();

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
	
	
	
	
	public void ValidateChatCarePermissionForDependent() {
		
		ValidateChatCareDetailsForMemberUser();
		
	    SelectConsultationForDependent();
		
	    ValidateChatCareLaunchForDependent();
	}
	
	
	public void ValidateButtonTextfieldsInChatCarePage()
	{
		ValidateElementTextInPage(btnProceed, Constants.ChatCarePage_ProceedButton_text, "ChatCarePage", "ProceedButton");
	}

	
	
	public void ValidateChatCareDetailsForMemberUser() {

		try {
			waitForElement(imgChatCareLogo);

			if (isElementPresent(imgChatCareLogo)) {
				passed("Successfully Validate the Chat Care Logo  for Member User In ChatCare page.");
			} else {
				failed_Continue(driver, "Failed To Validate the Chat Care Logo  for  For  Member User In ChatCare page.");
			}

			waitForElement(eleChatcareTitle);

			if (isElementPresent(eleChatcareTitle)) {
				passed("Successfully Validate the Chat Care Title  for Member User In ChatCare page.");
			} else {
				failed_Continue(driver, "Failed To Validate the Chat Care Title  for  For  Member User In ChatCare page.");
			}

			waitForElement(eleConsulationQuestion);

			if (eleConsulationQuestion.getText().replaceAll("\\s+", "")
					.equals(Constants.chatCareConsultationQuestion.replaceAll("\\s+", ""))) {

				passed("Successfully Validate the Chat Care Consultation Question For  Member User In ChatCare page ");
			} else {
				failed_Continue(driver, "Failed To Validate the Chat Consultation Question For  Member User In ChatCare page ");
			}

			waitForElement(btnDropdownInChatCare);
			if (isElementPresent(btnDropdownInChatCare)) {
				passed("Successfully Validate the Select consulatation Dropdown  For Member User In ChatCare page");
			} else {
				failed_Continue(driver, "Failed To Validate the Select consulatation Dropdown  Member User In ChatCare page");
			}
			waitForElement(btnProceed);
			if (isElementPresent(btnProceed)) {
				passed("Successfully Validate the Proceed button  For Member User In ChatCare page");
			} else {
				failed_Continue(driver, "Failed To Validate the Proceed button For  Member User In ChatCare page");
			}

		} catch (Exception e) {
			failed_Continue(driver, "Exception caught " + e.getMessage());
		}

	}

	public void SelectConsultationForSelf() {

		try {
			waitForElement(btnDropdownInChatCare);

			clickOn(btnDropdownInChatCare, "Chat Care dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtSelectConsultationFor);

				enterText(txtSelectConsultationFor, "Select Consultation For Textbox",
						GlobalVariables.FirstName + " " + GlobalVariables.LastName);

				clickOn(btnDropdownInChatCare, "Chat Care dropdown");
			} else {
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(GlobalVariables.FirstName + " " + GlobalVariables.LastName + " " + "(Self)");

				waitForElement(btnDone);

				clickOn(btnDone, "Done Button");
			}
				waitForElement(btnProceed);
				
				clickOn(btnProceed, "Proceed Button");
			}
	
		 catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
}
	
	public void ValidateProceedButtonInChatCarePage()
	{
		ValidateElementTextInPage(btnProceed, Constants.ChatCarePage_ProceedButton_text, "ChatCarePage", "ProceedButton");
	}

	
	public ChatCare_PatientDetails SelectChildToAddInChatCare() {
		try {
			waitForElement(btnDropdownInChatCare);

			clickOn(btnDropdownInChatCare, "Chat Care dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtSelectConsultationFor);
				
				TapByCoordinates(btnProceed.getLocation().getX()+300, btnProceed.getLocation().getY()+100,"Proceed button");
			} else {
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(Constants.Child);

				waitForElement(btnDone);

				clickOn(btnDone, "Done Button");
			}
			
			waitForElement(btnProceed);
			
			clickOn(btnProceed, "Proceed Button");
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		return new ChatCare_PatientDetails(driver,data);
		
		
	}
	
	public void SelectConsultationForDependent() {
		try {
			waitForElement(btnDropdownInChatCare);

			clickOn(btnDropdownInChatCare, "Chat Care dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtSelectConsultationFor);
				
				
				TapByCoordinates(btnProceed.getLocation().getX()+300, btnProceed.getLocation().getY()+100,"Proceed button");
				//enterText(txtSelectConsultationFor, "Select Consultation For Textbox",
				//	GlobalVariables.ChildName);

				//clickOn(btnDropdownInChatCare, "Chat Care dropdown");
			} else {
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(GlobalVariables.ChildName);

				waitForElement(btnDone);

				clickOn(btnDone, "Done Button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		
	}

	public void ValidatePatientDetailsForSelf() {

		try {
			waitForElement(elePatientName);

			if (elePatientName.getText().replaceAll("\\s+", "")
					.equals(GlobalVariables.FirstName + GlobalVariables.LastName)) {
				passed("Successfully Validated the  Name in Patient Details As" + elePatientName.getText());
			} else {
				failed(driver,
						"Failed To Validate the Name In Patient Details Page Expected As "
								+ (GlobalVariables.FirstName + GlobalVariables.LastName) + ",But Actual is"
								+ elePatientName.getText());
			}

			if (elePatientDOB.getText().equals(GlobalVariables.DOB)) {
				passed("Successfully Validated the  Date of Birth in Patient Details As" + elePatientDOB.getText());
			} else {
				failed(driver, "Failed To Validate the Date of Birth In Patient Details Page Expected As "
						+ (GlobalVariables.DOB) + ",But Actual is" + elePatientDOB.getText());
			}

			if (elePatientGenderIdentity.getText().equals(GlobalVariables.GenderIdentity)) {
				passed("Successfully Validated the  Gender Identity in Patient Details As"
						+ elePatientGenderIdentity.getText());
			} else {
				failed(driver, "Failed To Validate the Gender Identity In Patient Details Page Expected As "
						+ (GlobalVariables.GenderIdentity) + ",But Actual is" + elePatientGenderIdentity.getText());
			}

			String UIPhoneNumber = elePatientPhoneNumber.getText();

			String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

			String PhoneNumberInPatientDetails = arrsUIPhoneNumber.replaceAll("[^\\d]", "");

			if (PhoneNumberInPatientDetails.equals(GlobalVariables.PhoneNumber)) {
				passed("Successfully Validated the  Phone Number in Patient Details As" + PhoneNumberInPatientDetails);

			} else {
				failed(driver, "Failed To Validate the Phone Number Identity In Patient Details Page Expected As "
						+ (GlobalVariables.PhoneNumber) + ",But Actual is" + PhoneNumberInPatientDetails);

			}
			
		

			if (elePatientEmail.getText().equals(GlobalVariables.CreateUserName)) {
				passed("Successfully Validated the Email in Patient Details As" + elePatientEmail.getText());
			} else {
				failed(driver, "Failed To Validate the Gender Identity In Patient Details Page Expected As "
						+ (GlobalVariables.CreateUserName) + ",But Actual is" + elePatientEmail.getText());
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

	
	
	
	//validate non editable
	
	//print message for login with second time 
	
	
	
	public void ValidateNonEditableFieldsInChatCareLaunchProfileInAndroid() {
		
        try {
			txtFirstName.clear();
			
			
			if (txtFirstName.getAttribute("text").replaceAll("\\s+", "")
					.equals(GlobalVariables.FirstName.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the First Name field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the First Name field In Patient Details is Non Editable");
			}
			
			txtLastName.clear();

			if (txtLastName.getAttribute("text").replaceAll("\\s+", "")
					.equals(GlobalVariables.LastName.replaceAll("\\s+", ""))) {
				passed("Successfully Validated the Last Name field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the Last Name field In Patient Details Page Expected is Non Editable");
			}
			
			txtDOB.clear();

			if (txtDOB.getAttribute("text").replaceAll("\\s+", "")
					.equals(GlobalVariables.DOB.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the DOB field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the DOB field In Patient Details Page Expected is Non Editable");
			}
			
			txtGenderIdentity.clear();

			if (txtGenderIdentity.getAttribute("text").replaceAll("\\s+", "")
					.equals(GlobalVariables.GenderIdentity.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Gender identity field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the Gender identity field In Patient Details Page Expected is Non Editable");
			}
			
			SwipeUp();

			String UIUpdatedphoneNumber = txtPhoneNumber.getAttribute("text");

			String UpdatedphoneNumber = UIUpdatedphoneNumber.replaceAll("[^\\d.]", "");
			
		    txtPhoneNumber.clear();

			if (UpdatedphoneNumber.equals(GlobalVariables.PhoneNumber.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Phone Number field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the Phone Number field In Patient Details Page Expected is Non Editable");
			}
			
			txtEmail.clear();

			if (txtEmail.getAttribute("text").replaceAll("\\s+", "").equals(GlobalVariables.CreateUserName.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Email field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the Email field In Patient Details Page is Non Editable Actual as");
			}
			
			txtAddress1.clear();
			if (txtAddress1.getAttribute("text").replaceAll("\\s+", "").equals(data.get("Address1").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Address1 field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the Address1 field In Patient Details Page Expected is Non Editable");
			}

			txtAddress2.clear();
			
			if (txtAddress2.getAttribute("text").replaceAll("\\s+", "").equals(data.get("Address2").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Address2 field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the Address2 field In Patient Details Page Expected is Non Editable");
			}
			
			txtCity.clear();

			if (txtCity.getAttribute("text").replaceAll("\\s+", "").equals(data.get("City").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the City field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the City field In Patient Details Page Expected is Non Editable");
			}
			
			txtState.clear();
			
			if (txtState.getAttribute("text").replaceAll("\\s+", "").equals(data.get("State").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the State field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the State field In Patient Details Page Expected is Non Editable");
			}
			
			txtZIPCode.clear();

			if (txtZIPCode.getAttribute("text").replaceAll("\\s+", "").equals(GlobalVariables.ZIPCode.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the ZIPCode field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the ZIPCode field In Patient Details Page Expected is Non Editable");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
	}
	
	
	public void ValidateNonEditableFieldsInChatCareLaunchProfileInIOS() {
		
        try {
			txtFirstName.clear();
		
			
			if (txtFirstName.getAttribute("value").isEmpty()) {

				passed("Successfully Validated the First Name field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the First Name field In Patient Details is Non Editable");
			}
			
			txtLastName.clear();

			if (txtLastName.getAttribute("value").isEmpty()) {
				passed("Successfully Validated the Last Name field in Patient Details is Non Editable");

     		} else {
				failed(driver, "Failed To Validate the Last Name field In Patient Details Page Expected is Non Editable");
			}
			
			txtDOB.clear();

			
			
			if (txtDOB.getAttribute("value").isEmpty()) {

				passed("Successfully Validated the DOB field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the DOB field In Patient Details Page Expected is Non Editable");
			}
			
			txtGenderIdentity.clear();

			if (txtGenderIdentity.getAttribute("value").isEmpty()) {

				passed("Successfully Validated the Gender identity field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the Gender identity field In Patient Details Page Expected is Non Editable");
			}			
			SwipeUp();
			
			
			IOS_SwipeUP();

		
			txtPhoneNumber.clear();

				if (txtPhoneNumber.getAttribute("value").isEmpty())  {

				passed("Successfully Validated the Phone Number field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the Phone Number field In Patient Details Page Expected is Non Editable");
			}
			
			txtEmail.clear();
        	
        	waitForElement(txtEmail);
        	
        	txtAddress1.clear();

			if (txtEmail.getAttribute("value").isEmpty())  {

				passed("Successfully Validated the Email field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the Email field In Patient Details Page is Non Editable Actual as");
			}
			
			txtAddress1.clear();
			if (txtAddress1.getAttribute("value").isEmpty())  {

				passed("Successfully Validated the Address1 field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the Address1 field In Patient Details Page Expected is Non Editable");
			}

			txtAddress2.clear();
			
			if (txtAddress2.getAttribute("value").isEmpty())  {

				passed("Successfully Validated the Address2 field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the Address2 field In Patient Details Page Expected is Non Editable");
			}
			
			txtCity.clear();

			if (txtCity.getAttribute("value").isEmpty())  {

				passed("Successfully Validated the City field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the City field In Patient Details Page Expected is Non Editable");
			}
			
			txtState.clear();
			
			if (txtState.getAttribute("value").isEmpty())  {

				passed("Successfully Validated the State field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the State field In Patient Details Page Expected is Non Editable");
			}
			
			txtZIPCode.clear();

			if (txtZIPCode.getAttribute("value").isEmpty())  {

				passed("Successfully Validated the ZIPCode field in Patient Details is Non Editable");

			} else {
				failed(driver, "Failed To Validate the ZIPCode field In Patient Details Page Expected is Non Editable");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
	
	public void ValidateChatcareFirstTimeLaunchProfileDetailsInAndroid() {

		try {
		
			if (txtFirstName.getAttribute("text").replaceAll("\\s+", "")
					.equals(GlobalVariables.FirstName.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the First Name in Patient Details As" + txtFirstName.getAttribute("text"));

			} else {
				failed(driver, "Failed To Validate the First Name In Patient Details Page Expected As  " +GlobalVariables.FirstName + "but Actual is  "
						+ txtFirstName.getAttribute("text"));
			}

			if (txtLastName.getAttribute("text").replaceAll("\\s+", "")
					.equals(GlobalVariables.LastName.replaceAll("\\s+", ""))) {
				passed("Successfully Validated the Last Name in Patient Details As" + txtLastName.getAttribute("text"));

			} else {
				failed(driver, "Failed To Validate the Last Name In Patient Details Page Expected As  " +GlobalVariables.LastName + "but Actual is  "
						+ txtLastName.getAttribute("text"));
			}

			if (txtDOB.getAttribute("text").replaceAll("\\s+", "")
					.equals(GlobalVariables.DOB.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the DOB in Patient Details As " + txtDOB.getAttribute("text"));

			} else {
				failed(driver, "Failed To Validate the DOB In Patient Details Page Expected As " + GlobalVariables.DOB + "but Actual is  "
						+ txtDOB.getAttribute("text"));
			}

			if (txtGenderIdentity.getAttribute("text").replaceAll("\\s+", "")
					.equals(GlobalVariables.GenderIdentity.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Gender identity in Patient Details As " + txtGenderIdentity.getAttribute("text"));

			} else {
				failed(driver, "Failed To Validate the Gender identity In Patient Details Page Expected As " + GlobalVariables.GenderIdentity + "but Actual is  "
						+ txtGenderIdentity.getAttribute("text"));
			}
			
			SwipeUp();

			String UIUpdatedphoneNumber = txtPhoneNumber.getAttribute("text");

			String UpdatedphoneNumber = UIUpdatedphoneNumber.replaceAll("[^\\d.]", "");

			if (UpdatedphoneNumber.equals(GlobalVariables.PhoneNumber.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Phone Number in Patient Details As " + UpdatedphoneNumber);

			} else {
				failed(driver, "Failed To Validate the Phone Number In Patient Details Page Expected As " + GlobalVariables.PhoneNumber+ "but Actual as "
						+ UpdatedphoneNumber);
			}

			if (txtEmail.getAttribute("text").replaceAll("\\s+", "").equals(GlobalVariables.CreateUserName.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Address1 in Patient Details As " + txtEmail.getAttribute("text"));

			} else {
				failed(driver, "Failed To Validate the Address1 In Patient Details Page Expected As "  + GlobalVariables.CreateUserName + "but Actual as "
						+ txtEmail.getAttribute("text"));
			}
			
			
			if (txtAddress1.getAttribute("text").replaceAll("\\s+", "").equals(data.get("Address1").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Address1 in Patient Details As " + txtAddress1.getAttribute("text"));

			} else {
				failed(driver, "Failed To Validate the Address1 In Patient Details Page Expected As " + data.get("Address1") + "but Actual as "
						+ txtAddress1.getAttribute("text"));
			}

		
			
			if (txtAddress2.getAttribute("text").replaceAll("\\s+", "").equals(data.get("Address2").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Address2 in Patient Details As " + txtAddress2.getAttribute("text"));

			} else {
				failed(driver, "Failed To Validate the Address2 In Patient Details Page Expected As " + data.get("Address2") + "but Actual as "
			            + txtAddress2.getAttribute("text"));
			}

			if (txtCity.getAttribute("text").replaceAll("\\s+", "").equals(data.get("City").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the City in Patient Details As " + txtCity.getAttribute("text"));

			} else {
				failed(driver, "Failed To Validate the City In Patient Details Page Expected As " + data.get("City") + "but Actual as "
						+ txtCity.getAttribute("text"));
			}
			if (txtState.getAttribute("text").replaceAll("\\s+", "").equals(data.get("State").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the State in Patient Details As " + txtState.getAttribute("text"));

			} else {
				failed(driver, "Failed To Validate the State In Patient Details Page Expected As " + data.get("State") + "but Actual as "
						+ txtState.getAttribute("text"));
			}

			if (txtZIPCode.getAttribute("text").replaceAll("\\s+", "").equals(GlobalVariables.ZIPCode.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the ZIPCode in Patient Details As " + txtZIPCode.getAttribute("text"));

			} else {
				failed(driver, "Failed To Validate the ZIPCode In Patient Details Page Expected As " + data.get("ZIPCode") + "but Actual as "
						+ txtZIPCode.getAttribute("text"));
			}
			
			   SwipeUp();
				
				if (isElementPresent(btnProceed)) {

					clickOn(btnProceed, "Proceed button");
				}
		
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}
		
		

	}


	public void ValidateChatcareFirstTimeLaunchProfileDetailsInIOS() {

		try {
			if (txtFirstName.getAttribute("value").replaceAll("\\s+", "")
					.equals(GlobalVariables.FirstName.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the First Name in Patient Details As" + txtFirstName.getAttribute("value"));

			} else {
				failed(driver, "Failed To Validate the First Name In Patient Details Page Expected As  " +GlobalVariables.FirstName + "but Actual is  "
						+ txtFirstName.getAttribute("value"));
			}

			if (txtLastName.getAttribute("value").replaceAll("\\s+", "")
					.equals(GlobalVariables.LastName.replaceAll("\\s+", ""))) {
				passed("Successfully Validated the Last Name in Patient Details As" + txtLastName.getAttribute("value"));

			} else {
				failed(driver, "Failed To Validate the Last Name In Patient Details Page Expected As  " +GlobalVariables.LastName + "but Actual is  "
						+ txtLastName.getAttribute("value"));
			}

			if (txtDOB.getAttribute("value").replaceAll("\\s+", "")
					.equals(GlobalVariables.DOB.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the DOB in Patient Details As " + txtDOB.getAttribute("value"));

			} else {
				failed(driver, "Failed To Validate the DOB In Patient Details Page Expected As " + GlobalVariables.DOB + "but Actual is  "
						+ txtDOB.getAttribute("value"));
			}

			if (txtGenderIdentity.getAttribute("value").replaceAll("\\s+", "")
					.equals(GlobalVariables.GenderIdentity.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Gender identity in Patient Details As " + txtGenderIdentity.getAttribute("value"));

			} else {
				failed(driver, "Failed To Validate the Gender identity In Patient Details Page Expected As " + GlobalVariables.GenderIdentity + "but Actual is  "
						+ txtGenderIdentity.getAttribute("value"));
			}

			String UIUpdatedphoneNumber = txtPhoneNumber.getAttribute("value");

			String UpdatedphoneNumber = UIUpdatedphoneNumber.replaceAll("[^\\d.]", "");

			if (UpdatedphoneNumber.equals("1"+GlobalVariables.PhoneNumber.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Phone Number in Patient Details As " + UpdatedphoneNumber);

			} else {
				failed(driver, "Failed To Validate the Phone Number In Patient Details Page Expected As " + GlobalVariables.PhoneNumber+ "but Actual as "
						+ UpdatedphoneNumber);
			}

			if (txtEmail.getAttribute("value").replaceAll("\\s+", "").equals(GlobalVariables.CreateUserName.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Address1 in Patient Details As " + txtEmail.getAttribute("value"));

			} else {
				failed(driver, "Failed To Validate the Address1 In Patient Details Page Expected As "  + GlobalVariables.CreateUserName + "but Actual as "
						+ txtEmail.getAttribute("value"));
			}
			
			
			if (txtAddress1.getAttribute("value").replaceAll("\\s+", "").equals(data.get("Address1").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Address1 in Patient Details As " + txtAddress1.getAttribute("value"));

			} else {
				failed(driver, "Failed To Validate the Address1 In Patient Details Page Expected As " + data.get("Address1") + "but Actual as "
						+ txtAddress1.getAttribute("value"));
			}

			if (txtAddress2.getAttribute("value").replaceAll("\\s+", "").equals(data.get("Address2").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Address2 in Patient Details As " + txtAddress2.getAttribute("value"));

			} else {
				failed(driver, "Failed To Validate the Address2 In Patient Details Page Expected As " + data.get("Address2") + "but Actual as "
			            + txtAddress2.getAttribute("value"));
			}

			if (txtCity.getAttribute("value").replaceAll("\\s+", "").equals(data.get("City").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the City in Patient Details As " + txtCity.getAttribute("value"));

			} else {
				failed(driver, "Failed To Validate the City In Patient Details Page Expected As " + data.get("City") + "but Actual as "
						+ txtCity.getAttribute("value"));
			}
			if (txtState.getAttribute("value").replaceAll("\\s+", "").equals(data.get("State").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the State in Patient Details As " + txtState.getAttribute("value"));

			} else {
				failed(driver, "Failed To Validate the State In Patient Details Page Expected As " + data.get("State") + "but Actual as "
						+ txtState.getAttribute("value"));
			}

			if (txtZIPCode.getAttribute("value").replaceAll("\\s+", "").equals(GlobalVariables.ZIPCode.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the ZIPCode in Patient Details As " + txtZIPCode.getAttribute("value"));

			} else {
				failed(driver, "Failed To Validate the ZIPCode In Patient Details Page Expected As " + data.get("ZIPCode") + "but Actual as "
						+ txtZIPCode.getAttribute("value"));
			}} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
	public void ValidateBeginConsultationButtonInChatCarePage()
	{
		ValidateElementTextInPage(btnBeginConsultation, Constants.ChatCarePage_BeginConsultation_text, "ChatCarePage", "BeginConsultationButton");
	}


	
	public void ValidateFirstimeChatCareLaunchPatientDetailsForSelf() {
	
		try {
			waitForElement(elePatientDetails);
			
			if(isElementPresent(elePatientDetails)) {
				
				passed("Successfully validated patient Details label In Chat care Launch");
				
			}
			else {
				failed(driver,"Failed To validate Patient Details label in Chat care Launch");
			}

			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				ValidateChatcareFirstTimeLaunchProfileDetailsInAndroid();
				
//				ValidateNonEditableFieldsInChatCareLaunchProfileInAndroid();
				
			}
			else 
			{
				
			ValidateChatcareFirstTimeLaunchProfileDetailsInIOS();
			
//			ValidateNonEditableFieldsInChatCareLaunchProfileInIOS();
			
			}
			
			
			
			waitForElement(btnProceedFirstTime);
			
			clickOn(btnProceedFirstTime, "Proceed Button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

}
	public void ValidatePatientDetailsForDependent() {
	
		try {
			waitForElement(elePatientName);

			if (elePatientName.getText().replaceAll("\\s+", "")
					.equals(GlobalVariables.ChildName.replaceAll("\\s+", ""))) {
				passed("Successfully Validated the Dependent  Name in Patient Details As" + elePatientName.getText());
			} else {
				failed(driver,
						"Failed To Validate the Dependent Name In Patient Details Page Expected As "
								+ (GlobalVariables.ChildName) + ",But Actual is"
								+ elePatientName.getText());
			}

			if (elePatientDOB.getText().equals(GlobalVariables.DOB)) {
				passed("Successfully Validated the Dependent  Date of Birth in Patient Details As" + elePatientDOB.getText());
			} else {
				failed(driver, "Failed To Validate the Dependent Date of Birth In Patient Details Page Expected As "
						+ (GlobalVariables.DOB) + ",But Actual is" + elePatientDOB.getText());
			}

			if (elePatientGenderIdentity.getText().equals(GlobalVariables.ChildGender)) {
				passed("Successfully Validated the Dependent  Gender Identity in Patient Details As"
						+ elePatientGenderIdentity.getText());
			} else {
				failed(driver, "Failed To Validate the Dependent Gender Identity In Patient Details Page Expected As "
						+ (GlobalVariables.ChildGender) + ",But Actual is" + elePatientGenderIdentity.getText());
			}

			String UIPhoneNumber = elePatientPhoneNumber.getText();

			String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

			String PhoneNumberInPatientDetails = arrsUIPhoneNumber.replaceAll("[^\\d]", "");

			if (PhoneNumberInPatientDetails.equals(GlobalVariables.PhoneNumber)) {
				passed("Successfully Validated the  Phone Number in Patient Details As" + PhoneNumberInPatientDetails);

			} else {
				failed(driver, "Failed To Validate the Phone Number Identity In Patient Details Page Expected As "
						+ (GlobalVariables.PhoneNumber) + ",But Actual is" + PhoneNumberInPatientDetails);

			}
			


			if (elePatientEmail.getText().equals(GlobalVariables.CreateUserName)) {
				passed("Successfully Validated the Email in Patient Details As" + elePatientEmail.getText());
			} else {
				failed(driver, "Failed To Validate the Gender Identity In Patient Details Page Expected As "
						+ (GlobalVariables.CreateUserName) + ",But Actual is" + elePatientEmail.getText());
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	
		
	}

	public AppNavPage NavigateToAppNavPage() {

		try {
			passed("Navigate To AppNav Page");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		return new AppNavPage(driver, data);
	}

	public AppNavPage NavigateBackToApplicationFrom98point6SDK() {
		try {
			waitForElement(ele98point6Exit);

			if (isElementPresent(ele98point6Exit)) {

				clickOn(ele98point6Exit, "98point6SDK Exit");
			}

			waitForElement(btn98point6Exit_LEAVE);

			if (isElementPresent(btn98point6Exit_LEAVE)) {

				clickOn(btn98point6Exit_LEAVE, "98point6SDK Exit Leave button");
			}

			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate Back In Patient details");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppNavPage(driver, data);

	}

	public void ValidateChatCareLaunchForSelf() {
		try {
			
			waitForElement(elePatientDetails);

			if (isElementPresent(elePatientDetails)) {

				passed("User Successfully Navigated To Patient Details Page");
				takeScreenshot(driver);
			} else {
				failed(driver, "User Failed To Navigate To Patient Details Page");
			}

			ValidatePatientDetailsForSelf();

			waitForElement(btnBeginConsultation);

			clickOn(btnBeginConsultation, "Begin Consultation button");

			waitForElement(ele98point6WelcomeText);

			if (isElementPresent(ele98point6WelcomeText)) {

				takeScreenshot(driver);

				passed("Successfully Validated The 98Point6 Launch Welcome Page In Chat Care");
			}

			waitForElement(btnSkip);
			if (isElementPresent(btnSkip)) {

				clickOn(btnSkip, "Skip Button");
			}

			waitForElement(ele98point6SubmitButton);

			if (isElementPresent(ele98point6SubmitButton) || isElementPresent(ele98point6PhoneNumberTextField)) {

				takeScreenshot(driver);

				passed("Successfully Validated The 98Point6 Launch In Chat Care");
			} else {
				failed(driver, "Failed To Validate The 98Point6 Launch  In Chat Care.");
			}

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}
	
	
	public void ValidateChatCareLaunchForDependent() {


		try {
			waitForElement(btnProceed);

			clickOn(btnProceed, "Proceed Button");

			waitForElement(btnProceed);
			if (isElementPresent(btnProceed)) {
				clickOn(btnProceed, "Proceed Button");

			}
			waitForElement(elePatientDetails);

			if (isElementPresent(elePatientDetails)) {

				passed("User Successfully Navigated To Patient Details Page");
				takeScreenshot(driver);
			} else {
				failed(driver, "User Failed To Navigate To Patient Details Page");
			}

			ValidatePatientDetailsForDependent();

			waitForElement(btnBeginConsultation);

			clickOn(btnBeginConsultation, "Begin Consultation button");

			waitForElement(ele98point6WelcomeText);

			if (isElementPresent(ele98point6WelcomeText)) {

				takeScreenshot(driver);

				passed("Successfully Validated The 98Point6 Launch Welcome Page In Chat Care");
			}

			waitForElement(btnSkip);
			if (isElementPresent(btnSkip)) {

				clickOn(btnSkip, "Skip Button");
			}

			waitForElement(ele98point6SubmitButton);

			if (isElementPresent(ele98point6SubmitButton) || isElementPresent(ele98point6PhoneNumberTextField)) {

				takeScreenshot(driver);

				passed("Successfully Validated The 98Point6 Launch In Chat Care");
			} else {
				failed(driver, "Failed To Validate The 98Point6 Launch  In Chat Care.");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	
		
	}

	public AppNavPage clickOnCancelButton() {

		try {
			waitForElement(btnCancel);

			clickOn(btnCancel, "Cancel Button In Chat Care");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppNavPage(driver, data);
	}

	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(imgChatCareLogo);

			waitForElement(btnBecomeTreatMember);

			if (isElementPresent(btnBecomeTreatMember) || isElementPresent(imgChatCareLogo)) {

				passed("User Successfully Navigated To Chat Care   Page");
			} else {
				failed(driver, "User Failed To navigate To Chat Care  Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
