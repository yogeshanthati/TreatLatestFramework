package pages;

import java.util.List;
import java.util.Random;

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

public class ChatCare_PatientDetails extends TestBase {

	protected ChatCare_PatientDetails(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Patient Details')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Patient Details']")
	private MobileElement lblChatCarePatientDetails;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_first_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Patient Details']//following::XCUIElementTypeTextField[1]")
	private MobileElement txtFirstName;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_last_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Patient Details']//following::XCUIElementTypeTextField[2]")
	private MobileElement txtLastName;
	
	@AndroidFindBy(xpath = "//android.widget.AutoCompleteTextView[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='calendar']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtDOB;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='calendar']")
	private MobileElement imgCalender;
	
	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/edit_gender')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Gender*']")
	private MobileElement txtGender;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/text_input_end_icon')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']")
	private MobileElement btndrpDownGender;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement btnProceed;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/btn_okay')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement btnOK;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/btn_okay')]//preceding-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAddDependentInChatCareText;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement errEmptyFirstName;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement errEmptyLastName;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement errEmptyDOB;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement errEmptyGender;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement errInValidFirstName;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement errInValidLastName;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement errInValidDOB;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement PickerWheel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btnDone;
	

	
	
	public void AddChildInChatCarePatientDetailsPage() {

		try {
			String randNum = generateRandomNumber(2);

			waitForElement(txtFirstName);

			if (isElementPresent(txtFirstName)) {

				enterText(txtFirstName, "First Name", Constants.ChildFirstName + randNum);
			}

			GlobalVariables.FirstName=Constants.ChildFirstName+ randNum;
			
			
			waitForElement(txtLastName);
			if (isElementPresent(txtLastName)) {

				enterText(txtLastName, "Last Name", Constants.ChildLastName + randNum);
			}


			GlobalVariables.LastName=Constants.ChildLastName+ randNum;
			
			GlobalVariables.ChildName = Constants.ChildFirstName + randNum + " " + Constants.ChildLastName + randNum;

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				EnterDateOfBirthInAndroid();

			} else {

				if (isElementPresent(imgCalender)) {

					EnterDateOfBirthIniOS();
				}

			}

			

			String ChildGender = Constants.ChildGender;

			GlobalVariables.ChildGender = ChildGender;

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				EnterGenderIdentityInAndroid();
			} else {
				EnterGenderIdentityIniOS();
			}

			waitForElement(btnProceed);

			clickOn(btnProceed, "Proceed Button");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
	
	
	public void EnterGenderIdentityIniOS() {

		try {
			waitForElement(txtGender);

			clickOn(txtGender, "Gender Identity");
			
		
			PickerWheel.sendKeys(GlobalVariables.ChildGender);

			
			waitForElement(btnDone);

			if (isElementPresent(btnDone)) {

				clickOn(btnDone, "Done button");
			}

			GlobalVariables.GenderIdentity=GlobalVariables.ChildGender;
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterGenderIdentityInAndroid() {

		try {
			waitForElement(txtGender);
			
			txtGender.sendKeys(GlobalVariables.ChildGender);
			
			GlobalVariables.GenderIdentity=GlobalVariables.ChildGender;
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	
	
	public void EnterDateOfBirthInAndroid() {
		
		try {
			waitForElement(txtDOB);
			

			if (isElementPresent(txtDOB)) {

				enterText(txtDOB, "Date Of Birth", Constants.ChildDOB);
			}
			GlobalVariables.DOB = Constants.ChildDOB;
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	public void EnterDateOfBirthIniOS() {

		try {
			waitForElement(imgCalender);

			clickOn(imgCalender, "Date of Birth");
			
			Thread.sleep(3000);

			List<WebElement> PickerWheel = driver.findElements(By.xpath("//XCUIElementTypePickerWheel"));

			String DOB =Constants.ChildDOB;

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
		
	public ChatCarePage ValidateChareFirstTimeChildCreateText() {
		
		try {
			waitForElement(eleAddDependentInChatCareText);
			
			if(eleAddDependentInChatCareText.getText().replaceAll("\\s+", "").contains(Constants.ChatCareFirstTimeChildCreateText.replaceAll("\\s+", ""))) {
				
				passed("Successfully Validated the First time Child create Text As "+eleAddDependentInChatCareText.getText());
			}
			
			else {
				failed(driver,"Failed To Validate First time Child create Text  Expected As"+Constants.ChatCareFirstTimeChildCreateText);
			}
			
			waitForElement(btnOK);
			
			clickOn(btnOK, "OK Button");
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		return new ChatCarePage(driver, data);
	}
	
	
public AppNavPage clickOnChatCareTextPopUpOkButton() {

	try {
		waitForElement(btnOK);
		
		clickOn(btnOK, "OK Button");
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}
	
	return new AppNavPage(driver, data);
}
	
	
	
	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(lblChatCarePatientDetails);

			if (isElementPresent(lblChatCarePatientDetails)) {

				passed("User Successfully Navigated To Chat care Patient details Page");
			} else {
				failed(driver, "User Failed To navigate To Chat care Patient details Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
		
	

}
