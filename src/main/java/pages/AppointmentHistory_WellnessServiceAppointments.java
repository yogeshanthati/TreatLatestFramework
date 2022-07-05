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

public class AppointmentHistory_WellnessServiceAppointments extends TestBase {

	protected AppointmentHistory_WellnessServiceAppointments(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
		
	}

	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Wellness Appointments')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Wellness Appointments']")
	private MobileElement lblWellnessAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Wellness Appointments')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Wellness Appointments']")
	private MobileElement btnWellnessAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.Spinner")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']//preceding-sibling::XCUIElementTypeStaticText")
	private MobileElement txtAppointmentFor;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Show drop-down menu']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']")
	private MobileElement dropdownAppointmentFor;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Upcoming')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Upcoming']")
	private MobileElement btnUpcoming_AppointmentHistory;
   
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Canceled')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Canceled']")
	private MobileElement btnCanceled_AppointmentHistory;


	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Past')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Past']")
	private MobileElement btnPast_AppointmentHistory;
	
	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='arrowLeft'])[1]")
	private MobileElement NavBackButton;


	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_appointment_status')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='disclosureIndicator'])//preceding-sibling:: XCUIElementTypeStaticText[3]")
	private List<MobileElement> txtAppointmentStatus_AppointmentHistoryAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_service_name')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='disclosureIndicator'])//preceding-sibling:: XCUIElementTypeStaticText[2]")
	private List<MobileElement> txtAppointmentName_AppointmentHistoryAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_location_name')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='disclosureIndicator'])//preceding-sibling:: XCUIElementTypeStaticText[1]")
	private List<MobileElement> txtAppointmentLocation_AppointmentHistoryAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_year')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='disclosureIndicator'])//preceding-sibling:: XCUIElementTypeStaticText[4]")
	private List<MobileElement> txtAppointmentYear_AppointmentHistoryAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_day_month')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='disclosureIndicator'])//preceding-sibling:: XCUIElementTypeStaticText[5]")
	private List<MobileElement> txtAppointmentDayMonth_AppointmentHistoryAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_forward')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='disclosureIndicator']")
	private List<MobileElement> btnForward_AppointmentHistory;
	
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_service_icon')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage)[1]")
	private MobileElement eleAppointmentDetails_ServiceIcon;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_test_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Details']//following::XCUIElementTypeStaticText[1]")
	private MobileElement eleAppointmentDetails_ServiceName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_address')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Details']//following::XCUIElementTypeStaticText[2]")
	private MobileElement eleAppointmentDetails_ServiceAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Patient Name')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Name')]//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAppointmentDetails_PatientName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Appointment Schedule')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Schedule']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAppointmentDetails_AppointmentSchedule;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Phone')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Phone']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAppointmentDetails_Phone;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Email']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAppointmentDetails_Email;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Appointment Status')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Status']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAppointmentDetails_AppointmentStatus;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Upcoming']")
	private MobileElement btnUpcoming;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Completed']")
	private MobileElement btnCompleted;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Canceled']")
	private MobileElement btnCanceled;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Past']")
	private MobileElement btnPast;
	
	
	public void ValidateWellnessAppointmentsdetailsInMyProfilePage()
	{
		try 
		{
			waitForElement(btnWellnessAppointments);
			
			clickOn(btnWellnessAppointments, "WellnessAppointmentButton");
			
			ValidateElementTextInPage(btnUpcoming, Constants.MyProfilePage_UpcomingButton_text, "MyProfilePage", "UpcomingButton");
			
			ValidateElementTextInPage(btnPast, Constants.MyProfilePage_PastButton_text, "MyProfilePage", "PastButton");
			
			ValidateElementTextInPage(btnCanceled, Constants.MyProfilePage_CanceledButton_text, "MyProfilePage", "CanceledButton");
			
			clickOn(NavBackButton, "Navigate to Appointment History Page");
			
			clickOn(NavBackButton, "Navigate to MyProfile Page");
	    } 
		
		catch (Exception e) 
		{
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
	}
	
	public void clickOnUpcomingButtonInWellnessAppointments() {
		
try {
	waitForElement(btnUpcoming_AppointmentHistory);
			
			clickOn(btnUpcoming_AppointmentHistory, "Upcoming  button In Appointment History");
} catch (Exception e) {

	failed(driver, "Exception caught " + e.getMessage());
}
	}
	
	public void clickOnCanceledInWellnessAppointments() {
		
		try {
			
			
			waitForElement(btnCanceled_AppointmentHistory);
					
			clickOn(btnCanceled_AppointmentHistory, "Canceled  button In Appointment History");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
			}
	
	public void clickOnBackButtonInAppointmentDetails() {
		
		try {
			
			waitForElement(NavBackButton);
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
			
			clickOn(NavBackButton, "Back  Button In AppointmentDetails");
			}else {
			TapByCoordinates(NavBackButton.getLocation().x+15, NavBackButton.getLocation().y+10, "Back  Button In AppointmentDetails");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
	
	public void clickOnNavButtonInAppointmentHistory() {
		
		try {
			waitForElement(btnForward_AppointmentHistory.get(0));
			
			clickOn(btnForward_AppointmentHistory.get(0), "Latest Nav Button");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}

	
	
	
	
	
	
public void ValidateAppointmentDetailsInAppointmentHistory() {
		
		try {

			waitForElement(eleAppointmentDetails_ServiceIcon);

			if (isElementPresent(eleAppointmentDetails_ServiceIcon)) {

				passed("Sucessfully Validated the Service icon in Appointment Details");

			} else {

				failed(driver, " failed to Validate the Service icon in Appointment Details");
			}

			waitForElement(eleAppointmentDetails_ServiceName);

			if (eleAppointmentDetails_ServiceName.getText().trim().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectServiceName.trim().replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service  Name in Appointment Details As "
						+ eleAppointmentDetails_ServiceName.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Service Name in Appointment Details Expected As"
								+ GlobalVariables.SelectServiceName.replaceAll("\\s+", "") + "but Actual is"
								+ eleAppointmentDetails_ServiceName.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleAppointmentDetails_ServiceAddress);

			if (eleAppointmentDetails_ServiceAddress.getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service Address in Appointment Details As "
						+ eleAppointmentDetails_ServiceAddress.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Service Address in Appointment Details Expected As"
								+ GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "") + "but Actual is"
								+ eleAppointmentDetails_ServiceAddress.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleAppointmentDetails_PatientName);

			if (eleAppointmentDetails_PatientName.getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.FirstName + GlobalVariables.LastName)) {
				passed("Successsfully validated the Patient Name in Appointment Details As "
						+ eleAppointmentDetails_PatientName.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Patient Name in Appointment Details Expected As" + GlobalVariables.FirstName
								+ GlobalVariables.LastName + "but Actual is"
								+ eleAppointmentDetails_PatientName.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleAppointmentDetails_AppointmentSchedule);

			String AppointmentSchedule = eleAppointmentDetails_AppointmentSchedule.getText().trim();

			String[] arrAppointmentSchedule = AppointmentSchedule.split(",");

			String Apoointment_Time = arrAppointmentSchedule[0];

			String Apoointment_Date = arrAppointmentSchedule[1];

			if (Apoointment_Time.equals(GlobalVariables.SelectTimeSlotForAppointment)) {

				passed("Successfully Validated the  Appointment schedule time in Appointment Details As"
						+ Apoointment_Time);
			} else {
				failed_Continue(driver, "Failed To Validate the Appointment schedule time In Appointment Details Expected As "
						+ (GlobalVariables.SelectTimeSlotForAppointment) + ",But Actual is" + Apoointment_Time);
			}

//			if (Apoointment_Date.replaceAll("\\s+", "")
//					.equals(GlobalVariables.SelectTravelDate.replaceAll("\\s+", ""))) {
//
//				passed("Successfully Validated the  Appointment schedule Date in Appointment Details As"
//						+ Apoointment_Date);
//			} else {
//				failed_Continue(driver, "Failed To Validate the  Appointment schedule Date In Appointment Details Expected As "
//						+ (GlobalVariables.SelectTravelDate) + ",But Actual is" + Apoointment_Date);
//			}

			waitForElement(eleAppointmentDetails_Phone);

			String UIPhoneNumber = eleAppointmentDetails_Phone.getText();

			String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

			String PhoneNumberInPatientDetails = arrsUIPhoneNumber.replaceAll("[^\\d]", "");

			if (PhoneNumberInPatientDetails.equals(GlobalVariables.PhoneNumber)) {
				passed("Successfully Validated the  Phone Number in Appointment Details As" + PhoneNumberInPatientDetails);

			} else {
				failed_Continue(driver, "Failed To Validate the Phone Number Identity In Appointment Details Expected As "
						+ (GlobalVariables.PhoneNumber) + ",But Actual is" + PhoneNumberInPatientDetails);

			}

			waitForElement(eleAppointmentDetails_Email);

			if (eleAppointmentDetails_Email.getText().equals(GlobalVariables.CreateUserName)) {
				passed("Successfully Validated the Email in Appointment Details As" + eleAppointmentDetails_Email.getText());
			} else {
				failed_Continue(driver, "Failed To Validate the Gender Identity in Appointment Details Expected As "
						+ (GlobalVariables.CreateUserName) + ",But Actual is" + eleAppointmentDetails_Email.getText());
			}

			waitForElement(eleAppointmentDetails_AppointmentStatus);
			
			
			if (eleAppointmentDetails_AppointmentStatus.getText().equalsIgnoreCase(GlobalVariables.AppointmentStatus)) {
				passed("Successfully Validated the Appointment status in Appointment Details As" + eleAppointmentDetails_AppointmentStatus.getText());
			} else {
				failed_Continue(driver, "Failed To Validate the Appointment status in Appointment Details Expected As "
						+ (GlobalVariables.AppointmentStatus) + ",But Actual is" + eleAppointmentDetails_AppointmentStatus.getText());
			}

			
			
			
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		
	}
 public void ValidateAppointmentHistoryDetailsInWellnessAppointments() {
	
	try {
		
		if(GlobalVariables.AppointmentStatus.equals("ACTIVE")) {
			
			clickOnUpcomingButtonInWellnessAppointments();
		}
		else {
			clickOnCanceledInWellnessAppointments();
		}
		
		
		waitForElement(txtAppointmentStatus_AppointmentHistoryAppointments.get(0));
		
		if (txtAppointmentStatus_AppointmentHistoryAppointments.get(0).getText().equals(GlobalVariables.AppointmentStatus)) {
			passed("Successfully Validated the Appointment status in Health Appointments As" + txtAppointmentStatus_AppointmentHistoryAppointments.get(0).getText());
		} else {
			failed_Continue(driver, "Failed To Validate the Appointment status in Health Appointments Expected As "
					+ (GlobalVariables.AppointmentStatus) + ",But Actual is" + txtAppointmentStatus_AppointmentHistoryAppointments.get(0).getText());
		}

		
		waitForElement(txtAppointmentName_AppointmentHistoryAppointments.get(0));

		if (txtAppointmentName_AppointmentHistoryAppointments.get(0).getText().trim().replaceAll("\\s+", "")
				.equalsIgnoreCase(GlobalVariables.SelectServiceName.trim().replaceAll("\\s+", ""))) {
			passed("Successsfully validated the Service  Name in Health Appointments As "
					+ txtAppointmentName_AppointmentHistoryAppointments.get(0).getText());
		} else {
			failed_Continue(driver,
					"Failed To Validate the Service  Name in Health Appointments Expected As"
							+ GlobalVariables.SelectServiceName.replaceAll("\\s+", "") + "but Actual is"
							+ txtAppointmentName_AppointmentHistoryAppointments.get(0).getText().replaceAll("\\s+", ""));
		}

		waitForElement(txtAppointmentLocation_AppointmentHistoryAppointments.get(0));

		if (txtAppointmentLocation_AppointmentHistoryAppointments.get(0).getText().replaceAll("\\s+", "")
				.equalsIgnoreCase(GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", ""))) {
			passed("Successsfully validated the Service Address  in Health Appointments As As "
					+ txtAppointmentLocation_AppointmentHistoryAppointments.get(0).getText());
		} else {
			failed_Continue(driver,
					"Failed To Validate the Service Address  in Health Appointments  Expected As"
							+ GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "") + "but Actual is"
							+ txtAppointmentLocation_AppointmentHistoryAppointments.get(0).getText().replaceAll("\\s+", ""));
		}
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}


	}

public void ValidateWellnessAppointmentsAppointmentHistoryDetails() {
	
	try {
		switch (GlobalVariables.AppointmentStatus) {

		case "ACTIVE":
			
			clickOnUpcomingButtonInWellnessAppointments();

			ValidateAppointmentHistoryDetailsInWellnessAppointments();

			clickOnNavButtonInAppointmentHistory();

			ValidateAppointmentDetailsInAppointmentHistory();

			clickOnBackButtonInAppointmentDetails();

			break;

		case "CANCELED":
						
			clickOnCanceledInWellnessAppointments();
			
			ValidateAppointmentHistoryDetailsInWellnessAppointments();

			clickOnNavButtonInAppointmentHistory();

			ValidateAppointmentDetailsInAppointmentHistory();
			
			clickOnBackButtonInAppointmentDetails();

			break;

		default:

			info("Invalid option Record Type selected");
		}
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}


}

public MyProfilePage NavBackToMyProfilePage() {
	
	clickOnBackButtonInAppointmentDetails();
	
	clickOnBackButtonInAppointmentDetails();
		
	SwipeDown();
	
	SwipeDown();
	
	return new MyProfilePage(driver, data);
}
	
	

@AndroidFindBy(xpath ="//android.widget.ImageButton[@content-desc='Show drop-down menu']")
@iOSXCUITFindBy(xpath ="(//XCUIElementTypeImage[@name='dropDown'])[2]")
private MobileElement btnAppointmentForDropdown;

@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
private MobileElement btniOS_Done;

@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
private MobileElement elePickerWheel;

@AndroidFindBy(xpath ="//android.widget.Button[contains(@resource-id,'id/btn_proceed')]")
@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='Proceed']")
private MobileElement btnProceed;

public void SelectInValidAppointmentForDependent() {
	

	
	try {
		waitForElement(btnAppointmentForDropdown);

		clickOn(btnAppointmentForDropdown, "Appointments dropdown");

		if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

			waitForElement(txtAppointmentFor);

			TapByCoordinates(btnProceed.getLocation().getX() + 300, btnProceed.getLocation().getY() + 100,"Proceed button");


			
		} else {
			waitForElement(elePickerWheel);

			elePickerWheel.sendKeys(Constants.Child);

			waitForElement(btniOS_Done);

			clickOn(btniOS_Done, "Done Button");
		}
		
		
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}



}
	
	
	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(lblWellnessAppointments);
			
			if (isElementPresent(lblWellnessAppointments)) {

				passed("User Successfully Navigated To Wellness Appointments Page");
			} else {
				failed(driver, "User Failed To navigate To  Wellness Appointments  Page");
			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	
		
	}

}
