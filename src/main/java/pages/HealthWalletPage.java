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

public class HealthWalletPage extends TestBase {

	protected HealthWalletPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Health Wallet')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Health Wallet']")
	private MobileElement lblHealthWallet;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_login')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Login']")
	private MobileElement btnLogInInHealthWallet;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_description_2')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Login']")
	private MobileElement eleNeedLoginTextInHealthWallet;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'MEMBER')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='MEMBER']")
	private MobileElement labelMember;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/user_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo'][2]//following-sibling::XCUIElementTypeStaticText[7]")
	private MobileElement txtUserNameInHealthWallet;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/user_email')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo'][2]//following-sibling::XCUIElementTypeStaticText[11]")
	private MobileElement txtUserEmailInHealthWallet;

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement NavBackButton;


	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/imageView3')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo'][2]")
	private MobileElement eleTreatLogoInHealthWallet;

	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Upload a Record')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Upload a Record')]")
	private MobileElement btnUploadARecord;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Get COVID Vaccine Pass')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Get COVID Vaccine Pass, SMART® pass for COVID vaccination')]")
	private MobileElement btnCovidVaccinePass;
	

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Test Results')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Test Results')]")

	private MobileElement btnTestResults;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Vaccinations')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Vaccinations')]")
	private MobileElement btnVaccinations;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Health Records')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Health Records')]")
	private MobileElement btnHealthRecords;


	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Health Portal')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Health Portal')]")

	private MobileElement btnHealthPortal;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'OK')]")
	private MobileElement btnHealthPortal_YES;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/dialog_negative')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'CANCEL')]")
	private MobileElement btnHealthPortal_NO;

	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'OK')]")
	private MobileElement eleInHealthPortal;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Consent Forms')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Consent Forms')]")
	private MobileElement btnConsentForms;

	// CapitalRX

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/imageView5')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo'][1]")
	private MobileElement eleCapRxTreatLogo;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/imageView6')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='capitalRxLogo']")
	private MobileElement eleCapRxLogo;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/textView4')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo'][1]//following-sibling::XCUIElementTypeStaticText[4]")
	private MobileElement eleCapRxDesc;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_helpline')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo'][1]//following-sibling::XCUIElementTypeStaticText[12]")
	private MobileElement eleCapRxHelpLineNum;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_title')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo'][1]/following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleCapRxCardField1;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_subtitle')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo'][1]/following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement eleCapRxCardField1Value;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_title')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo'][1]/following-sibling::XCUIElementTypeStaticText[5]")
	private MobileElement eleCapRxCardField2;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_subtitle')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo'][1]/following-sibling::XCUIElementTypeStaticText[6]")
	private MobileElement eleCapRxCardField2Value;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_title')])[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo'][1]/following-sibling::XCUIElementTypeStaticText[7]")
	private MobileElement eleCapRxCardField3;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_subtitle')])[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo'][1]/following-sibling::XCUIElementTypeStaticText[10]")
	private MobileElement eleCapRxCardField3Value;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_title')])[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']/following-sibling::XCUIElementTypeStaticText[13]")
	private MobileElement eleCapRxCardField4;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_subtitle')])[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']/following-sibling::XCUIElementTypeStaticText[14]")
	private MobileElement eleCapRxCardField4Value;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'COVID vaccines')]")
	private MobileElement txtCOVIDVaccinePassDesc;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='No records to display.']")
	private MobileElement txtNoRecordDisplay;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	private MobileElement btnCancel;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Health Portal will open in your default web')]")
	private MobileElement txtHealthPortalDefaultBrowser;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Consent Forms']")
	private MobileElement txtConsentForms;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Test Results']")
	private MobileElement txtTestResults;
	
	//XCUIElementTypeStaticText[@name='Test Results']
	
	
	
	
	//XCUIElementTypeStaticText[@name="Sorry, we couldn't find any COVID vaccines for you administered by Treat"]
	
	public void ValidateTextElementsInHealthWalletPage()
	{
		ValidateElementTextInPage(btnUploadARecord, Constants.HealthWalletPage_UploadARecord_text, "HealthWalletPage", "UploadARecordButton");
		
		ValidateElementTextInPage(btnHealthRecords, Constants.HealthWalletPage_HealthRecords_text, "HealthWalletPage", "HealthRecordsButton");
		
		SwipeUp();
		
		ValidateElementTextInPage(btnCovidVaccinePass, Constants.HealthWalletpage_CovidVaccinePass_text, "HealthWalletPage", "CovidVaccinePassButton");
		
		ValidateElementTextInPage(btnTestResults, Constants.HealthWalletPage_TestResults_text, "HealthWalletPage", "TestResultsButton");
		
		ValidateElementTextInPage(btnVaccinations, Constants.HealthWalletPage_Vaccinations_text, "HealthWalletPage", "VaccinationsButton");
		
		ValidateElementTextInPage(btnConsentForms, Constants.HealthWalletPage_ConsentForms_text, "HealthWalletPage", "ConsentFormsButton");
		
		ValidateElementTextInPage(btnHealthPortal, Constants.HealthWalletPage_HealthPortal_text, "HealthWalletPage", "HealthPortalButton");
	}
	
	
	public HealthWalletPage clickOnGetCOVIDVaccinePass()
	{
		try 
		{
			
			waitForElement(btnCovidVaccinePass);
			
			if(isElementPresent(btnCovidVaccinePass))
			{
				clickOn(btnCovidVaccinePass, "Get COVID Vaccine Pass Button");
				
			}
			
		} 
		
	     catch (Exception e) 
		{
	    	 failed(driver, "Exception caught " + e.getMessage());
		}
		return new HealthWalletPage(driver, data);
		
	}
	
	
	
	public void  ValidateGetCOVIDVaccinePassDescription()
	{
		waitForElement(txtCOVIDVaccinePassDesc);
		
		ValidateElementTextInPage(txtCOVIDVaccinePassDesc, Constants.HealthWalletPage_HealthPortalDesc_text, "HealthWalletPage", "GetCOVIDVaccinePassText");
		
		if(isElementPresent(btnCancel))
		{
			clickOn(btnCancel, "Cancel Button");
		}
	}
	
	
	public void clickOnTestResultsButton()
	{
		if(isElementPresent(btnTestResults))
		{
			clickOn(btnTestResults, "Test Results Button");
			
		}
	}
	
	public void ValidateTextNoRecordDisplayInTestResultsPage() 
	{
		waitForElement(txtNoRecordDisplay);
		
		ValidateElementTextInPage(txtNoRecordDisplay, Constants.HealthWalletPage_TestResultRecordDisplay_text, "HealthWalletPage", "No Record Display Text");
		
		if(isElementPresent(NavBackButton))
		{
			clickOn(NavBackButton, "Navigate Back Button");
		}
		
	}
	
	public void ValidateTextTestResultsInTestResultsPage()
	{
	   
		ValidateElementTextInPage(txtTestResults, Constants.HealthWalletPage_TestResultsHeader_text, "HealthWalletPage", "TestResultsText");
	   
	  
	   if(isElementPresent(NavBackButton))
		{
			clickOn(NavBackButton, "Navigate Back Button");
		}
	}
	

	
	public void  clickOnVaccinationsButton()
	{
		if(isElementPresent(btnVaccinations))
		{
			clickOn(btnVaccinations, "Vaccinations Button");
			
		}
	}
	
	
	public HealthWalletPage ValidateTextNoRecordDisplayInVaccinationsPage()
	{
		waitForElement(txtNoRecordDisplay);
		
		ValidateElementTextInPage(txtNoRecordDisplay, Constants.HealthWalletPage_TestResultRecordDisplay_text, "HealthWalletPage", "No Record Display Text");
		
		  if(isElementPresent(NavBackButton))
			{
				clickOn(NavBackButton, "Navigate Back Button");
			}
		
		return new HealthWalletPage(driver, data);
		
	}
	
	public void clickOnCosentFormsButton()
	{
		if(isElementPresent(btnConsentForms))
		{
			clickOn(btnConsentForms, "Consent Forms Button");
			
		}
	}
	
	public void ValidateTextConsentFormsInConsentFormsPage()
	{
		waitForElement(txtConsentForms);
		
		ValidateElementTextInPage(txtConsentForms, Constants.HealthWalletPage_ConsentFormsText_text, "HealthWalletPage", "ConsentFormsText");
		
		if(isElementPresent(NavBackButton))
		{
			clickOn(NavBackButton, "Navigate Back Button");
		}
		
	}
	
	
	public HealthWalletPage clickOnHealthPortalButton()
	{
		try 
		{
			
			waitForElement(btnHealthPortal);
			if(isElementPresent(btnHealthPortal))
			{
				clickOn(btnHealthPortal, "Vaccinations Button");
				
			}
			
		} 
		
	     catch (Exception e) 
		{
	    	 failed(driver, "Exception caught " + e.getMessage());
		}
		return new HealthWalletPage(driver, data);
		
	}
	
	public AppNavPage ValidateTextHealthPortalDefaultBrowserInHealthPortalPage()
	{
		waitForElement(txtHealthPortalDefaultBrowser);
		
		ValidateElementTextInPage(txtHealthPortalDefaultBrowser, Constants.HealthWalletPage_HealthPortalDefaultWebBrowser_text, "HealthWalletPage", "HeathPortalDefaultWebBrowserText");
		
		if(isElementPresent(btnCancel))
		{
			clickOn(btnCancel, "Cancel Button");
		}
		
		return new AppNavPage(driver, data);
		
	}

	public void ValidateHealthWalletDetailsForGuestUser() {

		try {
			waitForElement(eleNeedLoginTextInHealthWallet);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				if (eleNeedLoginTextInHealthWallet.getText().trim().equals(Constants.LogInNeededText)) {

					passed("Sucessfully validated the Text in Health Wallet For Guest User As"
							+ eleNeedLoginTextInHealthWallet.getText());

				} else {
					failed(driver, "Failed To Validate The Text in Health Wallet For Guest User");
				}

			}

			waitForElement(eleNeedLoginTextInHealthWallet);

			if (isElementPresent(eleNeedLoginTextInHealthWallet) && isElementPresent(btnLogInInHealthWallet)) {

				passed("Successfully validated Guest User not able use the Health Wallet to Upload Records");

			}

			else {

				failed(driver, "Failed To Validate the Guest User unable to use the Health Wallet to Upload Records");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public SignInPage clickOnLogInButtonInHealthWallet() {

		try {
			waitForElement(btnLogInInHealthWallet);

			if (isElementPresent(btnLogInInHealthWallet)) {
				clickOn(btnLogInInHealthWallet, "LogInButton In Health Wallet");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new SignInPage(driver, data);

	}

	
//<<<<<<< HEAD
//	public void ValidateCapitalRXCardDetailsForAMemeber() {
//
//		try {
//			waitForElement(eleCapRxLogo);
//
//			if (isElementPresent(eleCapRxLogo)) {
//
//				passed("Successfully Validated CapitalRxCard is displayed By Default For Member User In Treat");
//				passed("Successfully validated CapitalRxCard Logo is Displayed On The CapitalRx Card In Health Wallet");
//				takeScreenshot(driver);
//			} else {
//				failed(driver, "Failed To Validate  Display of CapitalRxCard By Default For Member User In Treat");
//
//				failed(driver,
//						"Failed To Validate CapitalRxCard Logo is Display On The CapitalRx Card In Health Wallet ");
//			}
//
//			waitForElement(eleCapRxTreatLogo);
//
//			if (isElementPresent(eleCapRxTreatLogo)) {
//
//				passed("Successfully validated the CapRxTreatLogo On The CapRx Card In Health Wallet Page");
//			} else {
//				failed(driver, "Failed To Validate  CapRxTreatLogo On The CapRx Card In Health Wallet Page ");
//			}
//
//			waitForElement(eleCapRxDesc);
//
//			if (eleCapRxDesc.getText().trim().replaceAll("\\s+", "")
//					.equals(Constants.CapRxDesc.replaceAll("\\s+", ""))) {
//
//				passed("Successfully Validated The CapRx Card Description As" + eleCapRxDesc.getText());
//
//			} else {
//				failed(driver, "Failed To validate The CapRx Card Description,Expected " + Constants.CapRxDesc
//						+ "But Actual As" + eleCapRxDesc.getText());
//			}
//
//			waitForElement(eleCapRxHelpLineNum);



	
	public void ValidateCapitalRXCardDetailsForAMemeber() {
		
		
		try {
			waitForElement(eleCapRxLogo);
			
			if(isElementPresent(eleCapRxLogo)) {
				
				passed("Successfully Validated CapitalRxCard is displayed By Default For Member User In Treat");
				
				passed("Successfully validated CapitalRxCard Logo is Displayed On The CapitalRx Card In Health Wallet");
				takeScreenshot(driver);
			}
			else {
				failed(driver,"Failed To Validate  Display of CapitalRxCard By Default For Member User In Treat");
				
				failed(driver,"Failed To Validate CapitalRxCard Logo is Display On The CapitalRx Card In Health Wallet ");
			}
			
     waitForElement(eleCapRxTreatLogo);
			
			if(isElementPresent(eleCapRxTreatLogo)) {
				
				passed("Successfully validated the CapRxTreatLogo On The CapRx Card In Health Wallet Page");
			}
			else {
				failed(driver,"Failed To Validate  CapRxTreatLogo On The CapRx Card In Health Wallet Page ");
			}
			
			
			waitForElement(eleCapRxDesc);
			
			if (eleCapRxDesc.getText().trim().replaceAll("\\s+", "").equals(Constants.CapRxDesc.replaceAll("\\s+", ""))) {

				passed("Successfully Validated The CapRx Card Description As"+eleCapRxDesc.getText());
				

			} else {
				failed(driver,"Failed To validate The CapRx Card Description,Expected "+Constants.CapRxDesc+"But Actual As"+eleCapRxDesc.getText());
			}
			
waitForElement(eleCapRxHelpLineNum);
			

			if (eleCapRxHelpLineNum.getText().trim().equals(Constants.CapRxHelpLineNo)) {

				passed("Successfully Validated The CapRx Card Help Line Number As" + eleCapRxHelpLineNum.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card Help Line Number,Expected "
						+ Constants.CapRxHelpLineNo + "But Actual As" + eleCapRxHelpLineNum.getText());
			}

			waitForElement(eleCapRxCardField1);

			if (eleCapRxCardField1.getText().trim().equals(Constants.CapRxCardField1Name)) {

				passed("Successfully Validated The CapRx Card Field 1 As" + eleCapRxCardField1.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card  Field 1,Expected " + Constants.CapRxCardField1Name
						+ "But Actual As" + eleCapRxCardField1.getText());
			}

			waitForElement(eleCapRxCardField1Value);

			if (eleCapRxCardField1Value.getText().trim().equals(Constants.CapRxCardField1Value)) {

				passed("Successfully Validated The CapRx Card Field 1 Value  As" + eleCapRxCardField1.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card Field 1 Value ,Expected "
						+ Constants.CapRxCardField1Name + "But Actual As" + eleCapRxCardField1.getText());
			}

			waitForElement(eleCapRxCardField2);

			if (eleCapRxCardField2.getText().trim().equals(Constants.CapRxCardField2Name)) {

				passed("Successfully Validated The CapRx Card Field 2 As" + eleCapRxCardField2.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card  Field 2,Expected " + Constants.CapRxCardField2Name
						+ "But Actual As" + eleCapRxCardField2.getText());
			}

			waitForElement(eleCapRxCardField2Value);

			if (eleCapRxCardField2Value.getText().trim().equals(Constants.CapRxCardField2Value)) {

				passed("Successfully Validated The CapRx Card Field 2 Value  As" + eleCapRxCardField2Value.getText());

			} else {


				failed(driver, "Failed To validate The CapRx Card Field 2 Value ,Expected " + Constants.CapRxCardField2Value
						+ "But Actual As" + eleCapRxCardField2Value.getText());

			}

			waitForElement(eleCapRxCardField3);

			if (eleCapRxCardField3.getText().trim().equals(Constants.CapRxCardField3Name)) {

				passed("Successfully Validated The CapRx Card Field 3 As" + eleCapRxCardField3.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card  Field 3,Expected " + Constants.CapRxCardField3Name
						+ "But Actual As" + eleCapRxCardField3.getText());
			}

			waitForElement(eleCapRxCardField3Value);

			if (eleCapRxCardField3Value.getText().trim().equals(Constants.CapRxCardField3Value)) {

				passed("Successfully Validated The CapRx Card Field 3 Value  As" + eleCapRxCardField3.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card Field 3 Value ,Expected "
						+ Constants.CapRxCardField3Name + "But Actual As" + eleCapRxCardField3.getText());
			}

			waitForElement(eleCapRxCardField4);

			if (eleCapRxCardField4.getText().trim().equals(Constants.CapRxCardField4Name)) {

				passed("Successfully Validated The CapRx Card Field 4 As" + eleCapRxCardField4.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card  Field 4,Expected " + Constants.CapRxCardField4Name
						+ "But Actual As" + eleCapRxCardField4.getText());
			}

			waitForElement(eleCapRxCardField4Value);

			if (eleCapRxCardField4Value.getText().trim().contains(Constants.CapRxCardField4Value)) {

				passed("Successfully Validated The CapRx Card Field 4 Value  As" + eleCapRxCardField4.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card Field 4 Value ,Expected "
						+ Constants.CapRxCardField4Name + "But Actual As" + eleCapRxCardField4.getText());
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	public void SwipeToViewMembershipCardInHealthWallet() {
		try {
			scrollByDimension(0.9, 0.3, 0.3, 0.3);
		    } 
		catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
	
	
	
	
	public void ValidateHealthWalletDetailsForMemberUser() {

		try {
			
			SwipeDown();

			SwipeToViewMembershipCardInHealthWallet();
			
			waitForElement(labelMember);

			if (isElementPresent(labelMember)) {
				passed("User Successfully Validated  The Member label In  Health Wallet Page");

			} else {
				failed(driver, "Failed To Validate The Member label In  Health Wallet Page");
			}

			waitForElement(eleTreatLogoInHealthWallet);

			if (isElementPresent(eleTreatLogoInHealthWallet)) {
				passed("User Successfully Validated  The Teat Logo In  Health Wallet Page");

			} else {
				failed(driver, "Failed To Validate The Treat Logo In  Health Wallet Page");
			}

			waitForElement(txtUserNameInHealthWallet);

			if (txtUserNameInHealthWallet.getText()
					.equals(GlobalVariables.FirstName + " " + GlobalVariables.LastName)) {

				passed("User Successfully Validated the User Name In   Health Wallet Page As"
						+ txtUserNameInHealthWallet.getText());

			} else {

				failed(driver, "Failed To Validate the User Name In  Health Wallet Page ");
			}

			
			
			waitForElement(txtUserEmailInHealthWallet);

			if (txtUserEmailInHealthWallet.getText()
					.equals(GlobalVariables.CreateUserName)) {


				passed("User Successfully Validated the User Email In   Health Wallet Page As"
						+ txtUserEmailInHealthWallet.getText());

			}else {
				failed(driver, "Failed To Validate the User Email In  Health Wallet Page ");
			}



		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public HealthWallet_UploadARecordPage clickOnUploadARecordButton() {
		try {
			waitForElement(btnUploadARecord);

			if (isElementPresent(btnUploadARecord)) {

				clickOn(btnUploadARecord, "Upload A Record button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());

		}

		return new HealthWallet_UploadARecordPage(driver, data);
	}

	public HealthWallet_HealthRecordsPage clickOnHealthRecordsButton() {
		try {
			waitForElement(btnHealthRecords);

			if (isElementPresent(btnHealthRecords)) {

				clickOn(btnHealthRecords, "Health records button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());

		}

		return new HealthWallet_HealthRecordsPage(driver, data);
	}

	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(lblHealthWallet);

			if (isElementPresent(lblHealthWallet)) {

				passed("User Successfully Navigated To Health Wallet Page");
			} else {
				failed(driver, "User Failed To navigate To Health Wallet Page");
			}
			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
