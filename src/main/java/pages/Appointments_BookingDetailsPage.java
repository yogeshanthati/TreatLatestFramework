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

public class Appointments_BookingDetailsPage extends TestBase {

	protected Appointments_BookingDetailsPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Appointment Details']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Details']")
	private MobileElement lblBooking_Appointment_Details;

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement NavBackButton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_service_icon')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage)[1]")
	private MobileElement eleBookingDetails_ServiceIcon;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_test_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Details']//following::XCUIElementTypeStaticText[1]")
	private MobileElement eleBookingDetails_ServiceName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_address')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Details']//following::XCUIElementTypeStaticText[2]")
	private MobileElement eleBookingDetails_ServiceAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Patient Name')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Name')]//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleBookingDetails_PatientName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Appointment Schedule')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Schedule']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleBookingDetails_AppointmentSchedule;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Phone')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Phone']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleBookingDetails_Phone;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Email']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleBookingDetails_Email;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Add to Calendar')]")
	private MobileElement btn_AddToCalender;


	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement btnAddToWallet_OK;
	
	@AndroidFindBy(xpath ="	//android.widget.ImageButton[@content-desc='Next month']")
	private MobileElement btnCalenderNext;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Add to Apple Wallet']")
	private MobileElement btn_AddToWallet;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Modify Booking')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Modify Booking']")
	private MobileElement btn_ModifyBooking;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Cancel Booking')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel Booking']")
	private MobileElement btn_CancelBooking;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Cancel')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel Booking']")
	private MobileElement btnWellnessServiceCancelBooking;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Reschedule Booking')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Reschedule Booking']")
	private MobileElement btn_RescheduleBooking;

	@AndroidFindBy(xpath = "//android.widget.AutoCompleteTextView[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='calendar']")
	private MobileElement ele_RescheduleBooking_PickDate;

	@AndroidFindBy(xpath = "//android.widget.AutoCompleteTextView[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='clock']")
	private MobileElement ele_RescheduleBooking_PickTime;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/time_slot')]//android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='clock']//following::XCUIElementTypeOther/XCUIElementTypeButton")
	private MobileElement btnSelectTimeSlot;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement btnProceed;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Booking Updated')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Booking Updated']")
	private MobileElement lblBooking_Updated;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_done')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement DoneButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Add to Apple Wallet']")
	private MobileElement btnAddToWallet;


	@AndroidFindBy(xpath ="//android.view.ViewGroup[contains(@resource-id,'id/cv_add_to_calendar')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Add to Calendar']")
	private MobileElement btnAddToCalender;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private List<MobileElement> eleTimePickerWheel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement elePickerWheel;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'android:id/toggle_mode')]")
	private MobileElement btnAndroidClockKeyPad;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'android:id/input_hour')]")
	private MobileElement txtAndroidClockHour;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'android:id/input_minute')]")
	private MobileElement txtAndroidClockMinute;

	@AndroidFindBy(xpath = "//android.widget.Spinner[@resource-id='android:id/am_pm_spinner']")
	private MobileElement btnSelectAndroidClockAMPM;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='am']")
	private MobileElement btnAndroidClockAM;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='pm']")
	private MobileElement btnAndroidClockPM;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	private MobileElement btnAndroidOk;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btniOS_Done;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_test_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Cancel Booking']//following-sibling::XCUIElementTypeStaticText[4]")
	private MobileElement eleCancelBooking_ServiceName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_location')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Cancel Booking']//following-sibling::XCUIElementTypeStaticText[5]")
	private MobileElement eleCancelBooking_ServiceAddress;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/text_input_end_icon')]")
	@iOSXCUITFindBy(accessibility = "dropDown")
	private MobileElement btnReasonForCancelDropdown;

	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	private MobileElement txtAndroidReasonForCancel;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_cancel')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel Booking']")
	private MobileElement btn_CancelBookingInCancelBooking;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement btnCancelBookingYes;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_negative')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	private MobileElement btnCancelBookingNo;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/textinput_error')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='warningDark']//following-sibling::XCUIElementTypeStaticText")
	private MobileElement errSelectReasonForCancel;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Add']")
	private MobileElement btnAddToWallet_Add;


	@iOSXCUITFindBy(accessibility = "Cancel")
	private MobileElement btnAddToWallet_Cancel;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Ok']")
	private MobileElement btnAddToWalletOk;
	
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeOther[@name='SERVICE']")  
	private MobileElement eleAddToWallet_AppointmentName;
	
	@AndroidFindBy(xpath ="//android.widget.ImageButton[@content-desc='OK']")
	private MobileElement btnAddToCalender_YES;
	
	@AndroidFindBy(xpath ="//android.widget.ImageButton[@content-desc='Cancel']")
	private MobileElement btnAddToCalender_NO;
	
	@AndroidFindBy(xpath ="//android.widget.EditText")
	private MobileElement eleAddToCalender_AppointmentName; 
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Allow' or @text='ALLOW']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Upload from Gallery']")
	private MobileElement btnAllowPermissionForCancelBooking;
	
	
	
	
	public void ValidateButtonTextfieldsInAppointmentsBookingDetailsPage()
	{
		ValidateElementTextInPage(btn_ModifyBooking, Constants.AppointmentsPage_ModifyBooking_text, "AppointmentsBookingDetailsPage", "Modify Booking Button");
		
		ValidateElementTextInPage(btnAddToCalender, Constants.AppointmentsPage_AddtoCalendar_text, "AppointmentsBookingDetailsPage", "Add to Calendar Button");
		
		ValidateElementTextInPage(btnAddToWallet, Constants.AppointmentsPage_AddtoAppleWallet_text, "AppointmentsBookingDetailsPage", "Add to Apple Wallet Button");
	}
	

	public void ValidateAppointmentDetailsInBookingDetailsPage() {

		try {

			waitForElement(eleBookingDetails_ServiceIcon);

			if (isElementPresent(eleBookingDetails_ServiceIcon)) {

				passed("Sucessfully Validated the Service icon in Booking Details");

			} else {

				failed_Continue(driver, " failed to Validate the Service icon in Booking Details");
			}

			waitForElement(eleBookingDetails_ServiceName);

			if (eleBookingDetails_ServiceName.getText().trim().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectServiceName.trim().replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service  Name in Booking Details As "
						+ eleBookingDetails_ServiceName.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Service Name in Booking Details Expected As"
								+ GlobalVariables.SelectServiceName.replaceAll("\\s+", "") + "but Actual is"
								+ eleBookingDetails_ServiceName.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleBookingDetails_ServiceAddress);

			if (eleBookingDetails_ServiceAddress.getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service Address in Booking Details As "
						+ eleBookingDetails_ServiceAddress.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Service Address in Booking Details Expected As"
								+ GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "") + "but Actual is"
								+ eleBookingDetails_ServiceAddress.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleBookingDetails_PatientName);

			if (eleBookingDetails_PatientName.getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.FirstName + GlobalVariables.LastName)) {
				passed("Successsfully validated the Patient Name in Booking Details As "
						+ eleBookingDetails_PatientName.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Patient Name in Booking Details Expected As" + GlobalVariables.FirstName
								+ GlobalVariables.LastName + "but Actual is"
								+ eleBookingDetails_PatientName.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleBookingDetails_AppointmentSchedule);

			String AppointmentSchedule = eleBookingDetails_AppointmentSchedule.getText().trim();

			String[] arrAppointmentSchedule = AppointmentSchedule.split(",");

			String Apoointment_Time = arrAppointmentSchedule[0];

			String Apoointment_Date = arrAppointmentSchedule[1];

			if (Apoointment_Time.equals(GlobalVariables.SelectTimeSlotForAppointment)) {

				passed("Successfully Validated the  Appointment schedule time in Booking Details As"
						+ Apoointment_Time);
			} else {
				failed_Continue(driver, "Failed To Validate the Appointment schedule time In Booking Details Expected As "
						+ (GlobalVariables.SelectTimeSlotForAppointment) + ",But Actual is" + Apoointment_Time);
			}

			if (Apoointment_Date.replaceAll("\\s+", "")
					.equals(GlobalVariables.SelectTravelDate.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the  Appointment schedule Date in Booking Details As"
						+ Apoointment_Date);
			} else {
				failed_Continue(driver, "Failed To Validate the  Appointment schedule Date In Booking Details Expected As "
						+ (GlobalVariables.SelectTravelDate) + ",But Actual is" + Apoointment_Date);
			}

			waitForElement(eleBookingDetails_Phone);

			String UIPhoneNumber = eleBookingDetails_Phone.getText();

			String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

			String PhoneNumberInPatientDetails = arrsUIPhoneNumber.replaceAll("[^\\d]", "");

			if (PhoneNumberInPatientDetails.equals(GlobalVariables.PhoneNumber)) {
				passed("Successfully Validated the  Phone Number in Booking Details As" + PhoneNumberInPatientDetails);

			} else {
				failed_Continue(driver, "Failed To Validate the Phone Number Identity In Booking Details Expected As "
						+ (GlobalVariables.PhoneNumber) + ",But Actual is" + PhoneNumberInPatientDetails);

			}

			waitForElement(eleBookingDetails_Email);

			if (eleBookingDetails_Email.getText().equals(GlobalVariables.CreateUserName)) {
				passed("Successfully Validated the Email in Booking Details As" + eleBookingDetails_Email.getText());
			} else {
				failed_Continue(driver, "Failed To Validate the Gender Identity in Booking Details Expected As "
						+ (GlobalVariables.CreateUserName) + ",But Actual is" + eleBookingDetails_Email.getText());
			}

		} catch (Exception e) {

			failed_Continue(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnProceedButton() {

		try {
			waitForElement(btnProceed);

			if (isElementPresent(btnProceed)) {

				clickOn(btnProceed, "Proceed button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
public void clickOnAllowPermissionForUploadFromGallery() {
		
		
		
		try {

			if (isElementPresent(btnAllowPermissionForCancelBooking)) {


				TapOnElement(btnAllowPermissionForCancelBooking, "Allow Permission For Gallery");
				
				clickOnProceedButton();
				
//				ClickOnUploadImageFromGallery();
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}

	public void ValidateRescheduleAppointmentInBookingUpdated() {

		try {
			waitForElement(eleBookingDetails_AppointmentSchedule);

			String AppointmentSchedule = eleBookingDetails_AppointmentSchedule.getText().trim();

			String[] arrAppointmentSchedule = AppointmentSchedule.split(",");

			String Apoointment_Time = arrAppointmentSchedule[0];

			String Apoointment_Date = arrAppointmentSchedule[1];

			if (Apoointment_Time.equals(GlobalVariables.SelectTimeSlotForAppointment)) {

				passed("Successfully Validated the  Appointment Rescheduled time in Booking Updated As"
						+ Apoointment_Time);
			} else {
				failed_Continue(driver, "Failed To Validate the Appointment Rescheduled time In Booking Updated Expected As "
						+ (GlobalVariables.SelectTimeSlotForAppointment) + ",But Actual is" + Apoointment_Time);
			}

			if (Apoointment_Date.replaceAll("\\s+", "")
					.equals(GlobalVariables.SelectTravelDate.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the  Appointment Rescheduled Date in Booking Updated As"
						+ Apoointment_Date);
			} else {
				failed_Continue(driver, "Failed To Validate the  Appointment Rescheduled Date In Booking Updated Expected As "
						+ (GlobalVariables.SelectTravelDate) + ",But Actual is" + Apoointment_Date);
			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnModifyBookingInBookingdetails() {

		try {
			waitForElement(btn_ModifyBooking);

				clickOn(btn_ModifyBooking, "Modify booking button");
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void clickOnCancelBookingInBookingdetails() {

		try {
			waitForElement(btnWellnessServiceCancelBooking);

			

				clickOn(btnWellnessServiceCancelBooking, " Wellness Service Cancel  booking button");
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	

	public void clickOnRescheduleBookingButton() {

		try {
			waitForElement(btn_RescheduleBooking);

			

				clickOn(btn_RescheduleBooking, "Reschedule booking button");
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void SelectRescheduleDateInReschedulePage() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(ele_RescheduleBooking_PickDate);

				clickOn(ele_RescheduleBooking_PickDate, "Calender button ");

				List<WebElement> btnDate = driver.findElements(By.xpath(
						"//android.view.View[@content-desc='" + getDateFormatToStringInAndroid(getFutureDate(2)) + "']"));

				if(btnDate.size()>0) {
				clickOn(btnDate.get(0), "Date button");
				}
				else {
					clickOn(btnCalenderNext, "Date Next Month button");
					
					 btnDate = driver.findElements(By.xpath(
								"//android.view.View[@content-desc='" + getDateFormatToStringInAndroid(getFutureDate(2)) + "']"));
						 
						clickOn(btnDate.get(0), "Date button");
				}
				
				waitForElement(btnAndroidOk);

				clickOn(btnAndroidOk, "OK Button");

			}

			else {

				waitForElement(ele_RescheduleBooking_PickDate);

				clickOn(ele_RescheduleBooking_PickDate, "Reschedule pick Date Calender ");
				
				List<WebElement> PickerWheel = driver.findElements(By.xpath("//XCUIElementTypePickerWheel"));

				String TavelDateString = getDateFormatToString(getFutureDate(2));

				String TavelDateArr[] = TavelDateString.split(" ");

				waitForElement(PickerWheel.get(0));

				
				if (isElementPresent(PickerWheel.get(1))) {

					PickerWheel.get(1).sendKeys(TavelDateArr[1]);

				}
				
				if (isElementPresent(PickerWheel.get(0))) {

					PickerWheel.get(0).sendKeys(TavelDateArr[0]);

				}


				if (isElementPresent(PickerWheel.get(2))) {

					PickerWheel.get(2).sendKeys(TavelDateArr[2]);

				}

				waitForElement(btniOS_Done);

				if (isElementPresent(btniOS_Done)) {

					clickOn(btniOS_Done, "Done button");
				}

			}

			takeScreenshot(driver);
			
			GlobalVariables.SelectTravelDate = getDateFormatToStringToCompare(getFutureDate(2));
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void SelectRescheduleTimeInReschedulePage() {
		try {
			String AirportReachingTime = getTimeFormatString(Constants.RescheduleTime);

			String[] arrformattedTime = AirportReachingTime.split(" ");

			String AMorPM = arrformattedTime[1];

			String arrtime[] = arrformattedTime[0].split(":");

			String hh = arrtime[0];

			String mm = arrtime[1];

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(ele_RescheduleBooking_PickTime);

				if (isElementPresent(ele_RescheduleBooking_PickTime)) {

					clickOn(ele_RescheduleBooking_PickTime, "Clock button");

				}

				waitForElement(btnAndroidClockKeyPad);

				if (isElementPresent(btnAndroidClockKeyPad)) {

					clickOn(btnAndroidClockKeyPad, "Clock Keypad button");

				}

				waitForElement(txtAndroidClockHour);

				if (isElementPresent(txtAndroidClockHour)) {

					enterText(txtAndroidClockHour, "Hours text box", hh);
				}
				waitForElement(txtAndroidClockMinute);

				if (isElementPresent(txtAndroidClockMinute)) {

					enterText(txtAndroidClockMinute, "Minutes text box", mm);
				}
				waitForElement(btnSelectAndroidClockAMPM);

				if (isElementPresent(btnSelectAndroidClockAMPM)) {

					clickOn(btnSelectAndroidClockAMPM, "AM/PM Button");

				}

				if (AMorPM.equals("AM")) {

					clickOn(btnAndroidClockAM, "AM button");
				}

				else if (AMorPM.equals("PM")) {
					clickOn(btnAndroidClockPM, "AM button");
				}

				waitForElement(btnAndroidOk);
				if (isElementPresent(btnAndroidOk)) {

					clickOn(btnAndroidOk, "OK Button");
				}
				takeScreenshot(driver);
			}

			else {
				waitForElement(ele_RescheduleBooking_PickTime);

				if (isElementPresent(ele_RescheduleBooking_PickTime)) {

					clickOn(ele_RescheduleBooking_PickTime, "Clock button");

				}

				waitForElement(eleTimePickerWheel.get(0));

				List<WebElement> PickerWheel = driver.findElements(By.xpath("//XCUIElementTypePickerWheel"));

				waitForElement(PickerWheel.get(0));

				if (isElementPresent(PickerWheel.get(0))) {

					PickerWheel.get(0).sendKeys(hh);

				}

				if (isElementPresent(PickerWheel.get(1))) {

					PickerWheel.get(1).sendKeys(mm);

				}

				if (isElementPresent(PickerWheel.get(2))) {

					PickerWheel.get(2).sendKeys(AMorPM.toUpperCase());

				}

				waitForElement(btniOS_Done);

				if (isElementPresent(btniOS_Done)) {

					clickOn(btniOS_Done, "Done button");
				}

				takeScreenshot(driver);

			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void SelectTimeSlotForAnAppointment() {

		try {
			waitForElement(btnSelectTimeSlot);

			if (isElementPresent(btnSelectTimeSlot)) {

				clickOn(btnSelectTimeSlot, "Time slot button");
			}

			GlobalVariables.SelectTimeSlotForAppointment = btnSelectTimeSlot.getText().trim();

			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnCancelBookingButton() {
		try {
			waitForElement(btn_CancelBooking);

			clickOn(btn_CancelBooking, "Cancel booking button");
		}
		
		catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void validateBookingInformationInCancelBooking() {
		try {
			takeScreenshot(driver);

			waitForElement(eleCancelBooking_ServiceName);

			if (eleCancelBooking_ServiceName.getText().trim().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectServiceName.trim().replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service  Name in Cancel Booking As "
						+ eleCancelBooking_ServiceName.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Service Name Cancel Booking Expected As"
								+ GlobalVariables.SelectServiceName.replaceAll("\\s+", "") + "but Actual is"
								+ eleCancelBooking_ServiceName.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleCancelBooking_ServiceAddress);

			if (eleCancelBooking_ServiceAddress.getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service Address in Cancel Booking  As "
						+ eleCancelBooking_ServiceAddress.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Service Address in Cancel Booking Expected As"
								+ GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "") + "but Actual is"
								+ eleCancelBooking_ServiceAddress.getText().replaceAll("\\s+", ""));
			}
		} catch (Exception e) {
			failed_Continue(driver, "Exception caught " + e.getMessage());
		}
	}

	public void SelectReasonForCancel() {
		try {
			waitForElement(btnReasonForCancelDropdown);

			clickOn(btnReasonForCancelDropdown, "Appointments dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtAndroidReasonForCancel);

				TapByCoordinates(txtAndroidReasonForCancel.getLocation().getX() + 300,
						txtAndroidReasonForCancel.getLocation().y + 300,"Reason for Cancel");

				
			} else {
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(Constants.ReaseonForCancelAppointment);

				passed("Entered value - " + Constants.ReaseonForCancelAppointment + " in the text field- "
						+ "Reason For Cancel text box");

				waitForElement(btniOS_Done);

				clickOn(btniOS_Done, "Done Button");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnCancelBookingButtonInCancelBookingPage() {
		try {
			waitForElement(btn_CancelBookingInCancelBooking);

			clickOn(btn_CancelBookingInCancelBooking, "Cancel booking button In Cancel Booking Page");
		}
		
		catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnCancelYesButtonInCancelBookingPage() {

		try {
			waitForElement(btnCancelBookingYes);
			if (isElementPresent(btnCancelBookingYes)) {

				clickOn(btnCancelBookingYes, "Cancel Yes button In cancel booking ");
				
				GlobalVariables.AppointmentStatus=Constants.CanceledStatus;
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
public void clickOnAllowPermissionForCancelBooking() {
		
		
		
		try {

			if (isElementPresent(btnAllowPermissionForCancelBooking)) {


				TapOnElement(btnAllowPermissionForCancelBooking, "Allow Permission For Gallery");
				
				clickOnCancelBookingButtonInCancelBookingPage();
				
				clickOnCancelYesButtonInCancelBookingPage();
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}

	public void clickOnCancelNoButtonInCancelBookingPage() {

		try {
			waitForElement(btnCancelBookingNo);
			if (isElementPresent(btnCancelBookingNo)) {

				clickOn(btnCancelBookingNo, "Cancel No button In Cancel Booking");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateCancelNoButtonFunctionality() {

		try {
			waitForElement(btn_CancelBookingInCancelBooking);
			if (isElementPresent(btn_CancelBookingInCancelBooking)) {

				passed("Successfully Validated the Cancel No Button Functionality");
			} else {

				failed(driver, "Failed To Validate Cancel No Button Functionality");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void RescheduleAppointmentInBookingDetails() {
		try {
			clickOnModifyBookingInBookingdetails();

			clickOnRescheduleBookingButton();

			SelectRescheduleDateInReschedulePage();

			SelectRescheduleTimeInReschedulePage();

			SelectTimeSlotForAnAppointment();

			clickOnProceedButton();
			
			clickOnAllowPermissionForUploadFromGallery();

			ValidateRescheduleAppointmentInBookingUpdated();
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	
	public AppointmentsPage CancelAppointmentInBookingDetailsForWellnessService() {

		try {

			clickOnCancelBookingInBookingdetails();

			validateBookingInformationInCancelBooking();

			SelectReasonForCancel();

			clickOnCancelBookingButtonInCancelBookingPage();

			clickOnCancelNoButtonInCancelBookingPage();

			validateBookingInformationInCancelBooking();

			clickOnCancelBookingButtonInCancelBookingPage();

			clickOnCancelYesButtonInCancelBookingPage();
			
			Thread.sleep(5000);

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppointmentsPage(driver, data);
	}
	
	public AppointmentsPage CancelAppointmentInBookingDetails() {

		try {

			clickOnModifyBookingInBookingdetails();

			clickOnCancelBookingButton();

			validateBookingInformationInCancelBooking();

			SelectReasonForCancel();

			clickOnCancelBookingButtonInCancelBookingPage();

			clickOnCancelNoButtonInCancelBookingPage();

			validateBookingInformationInCancelBooking();

			clickOnCancelBookingButtonInCancelBookingPage();

			clickOnCancelYesButtonInCancelBookingPage();
			
			Thread.sleep(3000);
			
			clickOnAllowPermissionForCancelBooking();
			
              }
		
		catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppointmentsPage(driver, data);
	}

	public void clickOnNavBackButtonInCancelBooking() {

		try {
			waitForElement(NavBackButton);

			clickOn(NavBackButton, "Navigate Back button");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public AppNavPage clickOnNavBackButtonInBookingDetails() {

		try {
			waitForElement(NavBackButton);

			clickOn(NavBackButton, "Navigate Back button");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppNavPage(driver, data);
	}

	public AppointmentsPage clickOnDoneInBookingUpdated() {

		try {
			waitForElement(DoneButton);
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {


			clickOn(DoneButton, "Done button");
			
			}else {
			
			TapByCoordinates(DoneButton.getLocation().x+100, DoneButton.getLocation().y,"Done button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		

		return new AppointmentsPage(driver, data);
	}

	public void ValidateSelectReasonForCancelErrorMessageForHealthServices() {

		try {

			clickOnModifyBookingInBookingdetails();

			clickOnCancelBookingButton();

			waitForElement(btn_CancelBookingInCancelBooking);

			clickOn(btn_CancelBookingInCancelBooking, "Cancel booking button In Cancel Booking Page");

			waitForElement(errSelectReasonForCancel);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				if (errSelectReasonForCancel.getText().replaceAll("\\s+", "")
						.equals(Constants.errSelectCancelReason.replaceAll("\\s+", ""))) {

					passed("Successfully Validated the Select Reason For Cancellation  Error Message As"
							+ errSelectReasonForCancel.getText());
				}

				else {
					failed_Continue(driver, "Failed To Validate the Select  Reason For Cancellation Error Message ,Expected As"
							+ Constants.errSelectCancelReason + "But Actual is " + errSelectReasonForCancel.getText());

				}
			} else {
				if (errSelectReasonForCancel.getText().replaceAll("\\s+", "")
						.equals(Constants.erriOS_SelectCancelReason.replaceAll("\\s+", ""))) {

					passed("Successfully Validated the Select  Reason For Cancellation Error Message As"
							+ errSelectReasonForCancel.getText());
				}

				else {
					failed_Continue(driver, "Failed To Validate the Select  Reason For Cancellation Error Message ,Expected As"
							+ Constants.errSelectCancelReason + "But Actual is " + errSelectReasonForCancel.getText());

				}

			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	
	
	public void ValidateSelectReasonForCancelErrorMessageForWellnessServices() {

		try {

			clickOnCancelBookingInBookingdetails();

			clickOnCancelBookingButtonInCancelBookingPage();

			waitForElement(errSelectReasonForCancel);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				if (errSelectReasonForCancel.getText().replaceAll("\\s+", "")
						.equals(Constants.errSelectCancelReason.replaceAll("\\s+", ""))) {

					passed("Successfully Validated the Select Reason For Cancellation  Error Message As"
							+ errSelectReasonForCancel.getText());
				}

				else {
					failed_Continue(driver, "Failed To Validate the Select  Reason For Cancellation Error Message ,Expected As"
							+ Constants.errSelectCancelReason + "But Actual is " + errSelectReasonForCancel.getText());

				}
			} else {
				if (errSelectReasonForCancel.getText().replaceAll("\\s+", "")
						.equals(Constants.erriOS_SelectCancelReason.replaceAll("\\s+", ""))) {

					passed("Successfully Validated the Select  Reason For Cancellation Error Message As"
							+ errSelectReasonForCancel.getText());
				}

				else {
					failed_Continue(driver, "Failed To Validate the Select  Reason For Cancellation Error Message ,Expected As"
							+ Constants.errSelectCancelReason + "But Actual is " + errSelectReasonForCancel.getText());

				}

			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}
	
	public void ValidateAddAppointmentsToTheCalender() {
		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
			
			waitForElement(btnAddToCalender);
			
			clickOn(btnAddToCalender, "Add To Calender");
			
			waitForElement(eleAddToCalender_AppointmentName);
			
			if(eleAddToCalender_AppointmentName.getText().trim().replaceAll("\\s+", "").contains(GlobalVariables.SelectServiceName.replaceAll("\\s+", ""))){
				passed("Successfully Added  the Appointment Name to Calender As"+GlobalVariables.SelectServiceName);
			}
			else {
				failed_Continue(driver,"Failed To Add  the Appointment Name to Calender Expected As "+GlobalVariables.SelectServiceName+" But  Actual is "+eleAddToCalender_AppointmentName.getText());
			}

			waitForElement(btnAddToCalender_YES);
			
			clickOn(btnAddToCalender_YES, "Calender Yes button");
			
			passed("User successfully added the appointment To the Calender");
			
			
			}
//			else {
//				

////				waitForElement(btnAddToWallet);
////				
////				TapOnElement(btnAddToWallet, "Add To Wallet");
////				
////				waitForElement(eleAddToWallet_AppointmentName);
////				
////				if(eleAddToWallet_AppointmentName.getText().trim().replaceAll("\\s+", "").contains(GlobalVariables.SelectServiceName.replaceAll("\\s+", ""))){
////					
////					passed("Successfully Added  the Appointment Name to Aplle Wallet As"+GlobalVariables.SelectServiceName);
////				}
////				else {
////					failed(driver,"Failed To Add  the Appointment Name to Apple Wallet Expected As "+GlobalVariables.SelectServiceName+" But  Actual is "+eleAddToWallet_AppointmentName.getText());
////				}
////
////				waitForElement(btnAddToWallet_Add);
////				
////				TapOnElement(btnAddToWallet_Add, "Apple wallet Add  button");
////				
////				passed("User successfully added the appointment To the Calender");
////				
////				
////				
////                waitForElement(btnAddToWallet_OK);
////				
////				if(isElementPresent(btnAddToWallet_OK)) {
////					
////				TapByCoordinates(btnAddToWallet_OK.getLocation().x+10, btnAddToWallet_OK.getLocation().y+100,"Ok Button");
////				}
////				TapByCoordinates(206, 496, "Ok button"); 

//				waitForElement(btnAddToWallet);
//				
//				TapOnElement(btnAddToWallet, "Add To Wallet");
//				
//				waitForElement(eleAddToWallet_AppointmentName);
//				
//				if(eleAddToWallet_AppointmentName.getText().trim().replaceAll("\\s+", "").contains(GlobalVariables.SelectServiceName.replaceAll("\\s+", ""))){
//					
//					passed("Successfully Added  the Appointment Name to Aplle Wallet As"+GlobalVariables.SelectServiceName);
//				}
//				else {
//					failed(driver,"Failed To Add  the Appointment Name to Apple Wallet Expected As "+GlobalVariables.SelectServiceName+" But  Actual is "+eleAddToWallet_AppointmentName.getText());
//				}
//
//				waitForElement(btnAddToWallet_Add);
//				
//				clickOn(btnAddToWallet_Add, "Calender Yes button");
//				
//				passed("User successfully added the appointment To the Calender");
//				
//                waitForElement(btnAddToWallet_OK);
//				
//				if(isElementPresent(btnAddToWallet_OK)) {
//					
//				TapByCoordinates(btnAddToWallet_OK.getLocation().x+100, btnAddToWallet_OK.getLocation().y+100,"Ok Button");
//				}
//				

//			}
		} catch (Exception e) {
		
			failed(driver, "Exception caught As" + e.getMessage());
		}
		
	}

	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(lblBooking_Appointment_Details);

			if (isElementPresent(lblBooking_Appointment_Details)) {

				passed("User Successfully Navigated To Booking Details Page");
			} else {
				failed(driver, "User Failed To navigate To Booking Details Page");
			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
