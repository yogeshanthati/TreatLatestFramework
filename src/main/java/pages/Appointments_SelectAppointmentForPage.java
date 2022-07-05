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

public class Appointments_SelectAppointmentForPage extends TestBase {

	protected Appointments_SelectAppointmentForPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
		
	}

	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement btnYES;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_text')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAddDependentInHealthServiceText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_negative')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement btnNo;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_appointment_whom')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']//preceding-sibling::XCUIElementTypeStaticText[contains(@name,'Who is this appointment for?')]")
	private MobileElement lblAppointmentFor;
	
	@AndroidFindBy(xpath ="//android.widget.ImageButton[@content-desc='Show drop-down menu']")
	@iOSXCUITFindBy(accessibility ="dropDown")
	private MobileElement btnAppointmentForDropdown;
	
	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	private MobileElement txtAndroidAppointmentFor;
	
	@AndroidFindBy(xpath ="//android.widget.Button[contains(@resource-id,'id/btn_proceed')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement btnProceed;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement elePickerWheel;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btniOS_Done;
	
	public void SelectCreatedChildToProceed() {
		try {
			waitForElement(btnAppointmentForDropdown);

			clickOn(btnAppointmentForDropdown, "Appointments dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtAndroidAppointmentFor);

				TapByCoordinates(btnProceed.getLocation().getX() + 300, btnProceed.getLocation().getY() + 100,"Proceed button");

			} else {
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(GlobalVariables.ChildName);

				waitForElement(btniOS_Done);

				clickOn(btniOS_Done, "Done Button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		
		
	}
	
	public Appointments_HealthServicesPage ValidatePopTextForTheUserCreatedFromHealthServiceAppointment() {
		try {
			waitForElement(eleAddDependentInHealthServiceText);
			
			if(eleAddDependentInHealthServiceText.getText().replaceAll("\\s+", "").contains(Constants.AddChildFromHealthServicesText.replaceAll("\\s+", ""))) {
				
				passed("Successfully Validated the Child created From Health Services Text As "+eleAddDependentInHealthServiceText.getText());
			}
			
			else {
				failed_Continue(driver,"Failed To Validated the Child create From Health Services Text Expected As"+Constants.AddChildFromHealthServicesText+"But Actual is "+eleAddDependentInHealthServiceText.getText());
			}
			
			waitForElement(btnYES);
			
			clickOn(btnYES, "Yes Button");
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		return new Appointments_HealthServicesPage(driver, data);
	}
	
	
	
	public void clickOnProceedButton() {

		try {
			waitForElement(btnProceed);

			clickOn(btnProceed, " Proceed Button");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
	
	
	
	
	
	
	public HealthService_AddChildDetailsPage SelectChildToCreate() {
	
		try {
			waitForElement(btnAppointmentForDropdown);

			clickOn(btnAppointmentForDropdown, "Appointments dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtAndroidAppointmentFor);

				TapByCoordinates(btnProceed.getLocation().getX() + 300, btnProceed.getLocation().getY() + 100,"Proceed button");
			} else {
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(Constants.Child);

				waitForElement(btniOS_Done);

				clickOn(btniOS_Done, "Done Button");
			}
			
			clickOnProceedButton();
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	
		return new HealthService_AddChildDetailsPage(driver, data);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(lblAppointmentFor);

			if (isElementPresent(lblAppointmentFor)) {

				passed("User Successfully Navigated To Select Appointment For Page");
			} else {
				failed(driver, "User Failed To navigate To Select Appointment For Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
		
	

}
