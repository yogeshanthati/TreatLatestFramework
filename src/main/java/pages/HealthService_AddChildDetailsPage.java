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

public class HealthService_AddChildDetailsPage extends TestBase {

	protected HealthService_AddChildDetailsPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
		
	
	}

	
	
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Enter your child’s details below']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Enter your child’s details below']")

	private MobileElement lblEnterChildDetails;
		
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_first_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Enter your child’s details below']//following::XCUIElementTypeTextField[1]")
	private MobileElement txtFirstName;
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_last_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Enter your child’s details below']//following::XCUIElementTypeTextField[2]")
	private MobileElement txtLastName;
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='calendar']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtDOB;
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='calendar']")
	private MobileElement imgCalender;
	
	
	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/edit_gender')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='dropDown']//preceding-sibling::XCUIElementTypeStaticText)[1]")
	private MobileElement txtGender;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/text_input_end_icon')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='dropDown'])[2]")
	private MobileElement btndrpDownGender;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement btnProceed;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement PickerWheel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btnDone;

	
	public Appointments_HealthServicesPage AddChildInHealthServiceAppointmentPage() {

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

			
					EnterDateOfBirthIniOS();
				

			}


			String ChildGender = Constants.ChildGender;

			GlobalVariables.GenderIdentity= ChildGender;
			 
			

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
		
		return new Appointments_HealthServicesPage(driver, data);

	}
	
	
	
	public void EnterGenderIdentityIniOS() {

		try {
			waitForElement(btndrpDownGender);

			clickOn(btndrpDownGender, "Gender Identity");
			
		
			PickerWheel.sendKeys(GlobalVariables.GenderIdentity);

			
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
			waitForElement(txtGender);
			
			txtGender.sendKeys(GlobalVariables.GenderIdentity);
			
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
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(lblEnterChildDetails);

			if (isElementPresent(lblEnterChildDetails)) {

				passed("User Successfully Navigated To  Enter Childs Details  Page");
			} else {
				failed(driver, "User Failed To navigate To Enter Childs Details Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		
	}

}
