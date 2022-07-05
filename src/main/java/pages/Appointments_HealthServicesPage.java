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

public class Appointments_HealthServicesPage extends TestBase {

	protected Appointments_HealthServicesPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
	}

	
	
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Health Services']")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Health Services']")
	private MobileElement lblHealthServices;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Wellness Center Location')]//following-sibling::android.view.ViewGroup/android.widget.TextView")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Wellness Center Location']//following-sibling::XCUIElementTypeButton[1]")
	private MobileElement eleSelectedWellnessCenterLocation;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Health Services')]//following::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeStaticText[@name='Health Services']//following-sibling::XCUIElementTypeStaticText)[2]")
	private MobileElement eleIVTheraphyAvailability;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Pick a date*']")
	private MobileElement txtTravelDate;
	
	@AndroidFindBy(xpath ="//android.widget.AutoCompleteTextView[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='calendar']")
	private MobileElement btnCalender;

	@AndroidFindBy(xpath ="	//android.widget.ImageButton[@content-desc='Next month']")
	private MobileElement btnCalenderNext;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btniOS_Done;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement elePickerWheel;

	@AndroidFindBy(xpath ="//android.widget.Button[contains(@resource-id,'id/btn_proceed')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement btnProceed;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement btnOKChatcareDependantPopUp;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/dialog_negative')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	private MobileElement  btnCanCelChatcareDependantPopUp;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]//preceding-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleTextChatcareDependantPopUp;
	

	@AndroidFindBy(xpath ="//android.widget.EditText[contains(@resource-id,':id/et_text')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeImage[@name='searchLight']//following-sibling::XCUIElementTypeTextField")
	private MobileElement txtSearchService;
	
	@iOSXCUITFindBy(xpath = "//android.widget.AutoCompleteTextView[@resource-id='com.xpresspa.treatmobile.dev:id/edit_arrival_time']")
	@AndroidFindBy(xpath ="//android.widget.EditText[contains(@resource-id,'id/edit_arrival_time')]")
	private MobileElement btnClock;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private List<MobileElement> eleTimePickerWheel;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'android:id/toggle_mode')]")
	private MobileElement btnAndroidClockKeyPad;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'android:id/input_hour')]")
	private MobileElement txtAndroidClockHour;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'android:id/input_minute')]")
	private MobileElement txtAndroidClockMinute;

	@AndroidFindBy(xpath = "//android.widget.Spinner[@resource-id='android:id/am_pm_spinner']")
	private MobileElement btnSelectAndroidClockAMPM;
	
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='am' or @text='AM']")
	private MobileElement btnAndroidClockAM;
	

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='pm' or @text='PM']")
	private MobileElement btnAndroidClockPM;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	private MobileElement btnAndroidOk;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
	private MobileElement btnAndroidClockCancel;
	
	@AndroidFindBy(xpath ="//android.view.ViewGroup[contains(@resource-id,'id/time_slot')]//android.widget.TextView")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeImage[@name='clock']//following::XCUIElementTypeOther/XCUIElementTypeButton")
	private MobileElement btnSelectTimeSlot;
	
	@AndroidFindBy(xpath ="//android.widget.ImageButton[@content-desc='Show drop-down menu']")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeImage[@name='dropDown'])[2]")
	private MobileElement btnAppointmentForDropdown;
	
	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeImage[@name='dropDown']//preceding-sibling:: XCUIElementTypeStaticText[1])[2]")
	private MobileElement txtAppointmentFor;
	
	
		
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/iv_cancel')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='closeX']")
	private MobileElement btnCloseAppointmentFor;
	
//	@AndroidFindBy(xpath ="//android.widget.LinearLayout[contains(@resource-id,':id/root_layout')]/android.widget.TextView[1]")
//	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeImage[@name='health'])[2]//following-sibling::XCUIElementTypeStaticText[2]")
//	private MobileElement eleReviewAppointment_MembershipBenfitText;
	
	
	@AndroidFindBy(xpath ="//android.widget.ImageView[contains(@resource-id,'id/iv_service_icon')]")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeImage[@name='health'])[1]")
	private MobileElement eleReviewAppointment_ServiceIcon;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_test_name')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Review your appointment details']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleReviewAppointment_ServiceName;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_address')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Review your appointment details']//following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement eleReviewAppointment_ServiceAddress;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Patient Name')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Patient Name']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleReviewAppointment_PatientName;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Appointment Schedule')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Appointment Schedule']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleReviewAppointment_AppointmentSchedule;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Date of Birth')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Date of Birth']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleReviewAppointment_DOB;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Gender Identity')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Gender Identity']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleReviewAppointment_Gender;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Phone')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Phone']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleReviewAppointment_Phone;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Email')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Email']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleReviewAppointment_Email;
	
	
	@AndroidFindBy(xpath ="//android.widget.Button[contains(@text,'Confirm Booking')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='Confirm Booking']")
	private MobileElement btnConfirmBooking;
	
	
	//---------------------------------------------------------------------------------------------------------------------
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_test_name')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Booking Confirmed']//following::XCUIElementTypeStaticText[1]")
	private MobileElement eleBookingConfirmed_ServiceName;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_address')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Booking Confirmed']//following::XCUIElementTypeStaticText[2]")
	private MobileElement eleBookingConfirmed_ServiceAddress;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Patient Name')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeStaticText[@name='Patient Name']//following-sibling::XCUIElementTypeStaticText[1])[2]")
	private MobileElement eleBookingConfirmed_PatientName;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Appointment Schedule')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeStaticText[@name='Appointment Schedule']//following-sibling::XCUIElementTypeStaticText[1])[2]")
	private MobileElement eleBookingConfirmed_AppointmentSchedule;
	
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Phone')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeStaticText[@name='Phone']//following-sibling::XCUIElementTypeStaticText[1])[2]")
	private MobileElement eleBookingConfirmed_Phone;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Email')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeStaticText[@name='Email']//following-sibling::XCUIElementTypeStaticText[1])[2]")
	private MobileElement eleBookingConfirmed_Email;
	

	@AndroidFindBy(xpath ="//android.widget.Button[contains(@resource-id,'id/btn_done')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='Done']")
	private MobileElement DoneButton;
	
	
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeStaticText[@name='Add to Apple Wallet'])[1]")	
	private MobileElement btnAddToWallet;
	
	@iOSXCUITFindBy(accessibility = "Add")
	private MobileElement btnAddToWallet_Add;
	
	@iOSXCUITFindBy(accessibility = "Cancel")
	private MobileElement btnAddToWallet_Cancel;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement btnAddToWallet_OK;
	
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeOther[@name='SERVICE']") 
	private MobileElement eleAddToWallet_AppointmentName;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_add_to_calendar')]")
	private MobileElement btnAddToCalender;
	
	@AndroidFindBy(xpath ="//android.widget.ImageButton[@content-desc='OK']")
	private MobileElement btnAddToCalender_YES;
	
	@AndroidFindBy(xpath ="//android.widget.ImageButton[@content-desc='Cancel']")
	private MobileElement btnAddToCalender_NO;
	
	@AndroidFindBy(xpath ="//android.widget.EditText")
	private MobileElement eleAddToCalender_AppointmentName; 
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Booking Confirmed')]")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Booking Confirmed']")
	private MobileElement lblBookingConfirmed;
	
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/textinput_error')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeImage[@name='calendar']//following-sibling::XCUIElementTypeStaticText")
	private MobileElement errSelectTravelDate;
	
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_description')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Please select a health service']")
	private MobileElement errSelectHealthService;
	

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement NavBackInHealthServices;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_become_a_treat_member')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Become a Treat Member')]")
	private MobileElement btnbecomeATreatMember;

	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Review your appointment details')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Review your appointment details']")
	private MobileElement lblReviewAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement btnNoHealthProfile_Yes;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_negative')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	private MobileElement btnNoHealthProfile_No;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]//preceding-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleNoHealthProfileText;
	
	
	
	
	
	
	
	//XCUIElementTypeButton[@name="OK"]
	
	//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]
	
	//XCUIElementTypeButton[@name="CANCEL"]
	
	
	
	

	
	
	
//	
	
	
	
//	android.widget.Spinner
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickOnBackButtonInHealthServices() {

		try {
			waitForElement(NavBackInHealthServices);

			if (isElementPresent(NavBackInHealthServices)) {

				clickOn(NavBackInHealthServices, "Back button Health Services");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught As" + e.getMessage());
		}
	}
	

	public void ValidateAppointmentAddToCalender() {
		
		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
			
			waitForElement(btnAddToCalender);
			
			clickOn(btnAddToCalender, "Add To Calender");
			
			waitForElement(eleAddToCalender_AppointmentName);
			
			if(eleAddToCalender_AppointmentName.getText().trim().replaceAll("\\s+", "").contains(GlobalVariables.SelectServiceName.replaceAll("\\s+", ""))){
				passed("Successfully Added  the Appointment Name to Calender As"+GlobalVariables.SelectServiceName);
			}
			else {
				failed(driver,"Failed To Add  the Appointment Name to Calender Expected As "+GlobalVariables.SelectServiceName+" But  Actual is "+eleAddToCalender_AppointmentName.getText());
			}

			waitForElement(btnAddToCalender_YES);
			
			clickOn(btnAddToCalender_YES, "Calender Yes button");
			
			passed("User successfully added the appointment To the Calender");
			
						
			
			
			
			}
			else {
				
				waitForElement(btnAddToWallet);
				
				TapByCoordinates(btnAddToWallet.getLocation().x+100, btnAddToWallet.getLocation().y,"Add To Wallet Button");
				
				waitForElement(eleAddToWallet_AppointmentName);
				
				if(eleAddToWallet_AppointmentName.getText().trim().replaceAll("\\s+", "").contains(GlobalVariables.SelectServiceName.replaceAll("\\s+", ""))){
					
					passed("Successfully Added  the Appointment Name to Aplle Wallet As"+GlobalVariables.SelectServiceName);
				}
				else {
					failed(driver,"Failed To Add  the Appointment Name to Apple Wallet Expected As "+GlobalVariables.SelectServiceName+" But  Actual is "+eleAddToWallet_AppointmentName.getText());
				}

				waitForElement(btnAddToWallet_Add);
				
				
				IOS_TapOnElement(btnAddToWallet_Add,"AddTo Wallet");
			//	TapByCoordinates(btnAddToWallet_Add.getLocation().x+100, btnAddToWallet_Add.getLocation().y);
				
				passed("User successfully added the appointment To the Calender");
				
				waitForElement(btnAddToWallet_OK);
				
				if(isElementPresent(btnAddToWallet_OK)) {
					
				TapByCoordinates(btnAddToWallet_OK.getLocation().x+100, btnAddToWallet_OK.getLocation().y+50,"Ok Button");
				}
				
			}
		} catch (Exception e) {
		
			failed(driver, "Exception caught As" + e.getMessage());
		}
		
		
	}
	
	
	
	public void ValidateIVTheraphyAvailabilityText() {
		try {
			waitForElement(eleIVTheraphyAvailability);
			
			
			if(isElementPresent(eleIVTheraphyAvailability)) {
				
				if(eleIVTheraphyAvailability.getText().trim().replaceAll("\\s+", "").equals(Constants.IVTheraphyAvailabilityText.replaceAll("\\s+", ""))) {
					
					passed("Sucessfully validated the The IVTheraphy Eligibility Text  As"+eleIVTheraphyAvailability.getText());
				}
				else {
					
					failed_Continue(driver," failed To Validate IVTheraphy Eligibility Text  ,Expected As"+Constants.IVTheraphyAvailabilityText.replaceAll("\\s+", "")+"But Actual is "+eleIVTheraphyAvailability.getText().replaceAll("\\s+", ""));
				}
				
			}
		} catch (Exception e) {
			failed_Continue(driver, "Exception caught " + e.getMessage());
		}
		
	}


	public void ValidateSelectedWellnessCenterLocation() {
		
		
		try {
			waitForElement(eleSelectedWellnessCenterLocation);
			
			
			if(isElementPresent(eleSelectedWellnessCenterLocation)) {
				
				
				takeScreenshot(driver);
				if(eleSelectedWellnessCenterLocation.getText().trim().replaceAll("\\s+", "").equals(GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", ""))) {
					
					passed("Sucessfully validated the The Wellness Center Location As"+eleSelectedWellnessCenterLocation.getText());
				}
				else {
					
					failed_Continue(driver," failed To Validate The Wellness Center Location ,Expected As"+GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "")+"But Actual is "+eleSelectedWellnessCenterLocation.getText().replaceAll("\\s+", ""));
				}
				
			}
		} catch (Exception e) {
			failed_Continue(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
	

	public  void SelectTravellingDateAsCurrentDate() {
		
		SelectTravellingDateForAppointment(getCurrentDate());
	}
	
	
	
	
	
	public void SelectTravellingDateForAppointment(String TravelDate) {
		try {

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(btnCalender);

				clickOn(btnCalender, "Calender button ");

				List<WebElement> btnDate = driver.findElements(By.xpath(
						"//android.view.View[@content-desc='" + getDateFormatToStringInAndroid(TravelDate) + "']"));

				if(btnDate.size()>0) {
				clickOn(btnDate.get(0), "Date button");
				}
				else {
					clickOn(btnCalenderNext, "Date Next Month button");
					
					 btnDate = driver.findElements(By.xpath(
								"//android.view.View[@content-desc='" + getDateFormatToStringInAndroid(TravelDate) + "']"));
						 
						clickOn(btnDate.get(0), "Date button");
				}

				
				waitForElement(btnAndroidOk);

				clickOn(btnAndroidOk, "OK Button");
			}

			else {

				waitForElement(btnCalender);

				clickOn(btnCalender, "Calender button ");
				
				List<WebElement> PickerWheel = driver.findElements(By.xpath("//XCUIElementTypePickerWheel"));

				String TavelDateString = getDateFormatToString(TravelDate);

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
			GlobalVariables.SelectTravelDate = getDateFormatToStringToCompare(TravelDate);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
		
	public void SelectAServiceInHealthServices(String HealthServiceName ) {
		try {
			
			waitForElement(btnProceed);
			
			waitForElement(btnProceed);
			List	<WebElement> btnSelectService;
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				 btnSelectService= driver.findElements(By.xpath("//android.widget.TextView[contains(@text,'"
						+ HealthServiceName + "')]//following-sibling::android.widget.ImageView"));
				
				
			} else {

				 btnSelectService = driver
						.findElements(By.xpath("//XCUIElementTypeButton[@name='" + HealthServiceName + "']"));
			}
			
			waitForElement(btnSelectService.get(0));
			clickOn(btnSelectService.get(0), "Health Servive");

			GlobalVariables.SelectServiceName = HealthServiceName;
			
	
			
			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}
	
	

	public void selectAirportReachingTime() {
		try {

			String AirportReachingTime = getTimeFormatString(Constants.AirPortReachingTime);

			waitForElement(btnClock);

			if (isElementPresent(btnClock)) {

				clickOn(btnClock, "Clock button");

			}

			waitForElement(btnAndroidClockKeyPad);

			if (isElementPresent(btnAndroidClockKeyPad)) {

				clickOn(btnAndroidClockKeyPad, "Clock Keypad button");

			}

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				Thread.sleep(3000);

				if (isElementPresent(btnSelectAndroidClockAMPM)) {

					String[] arrformattedTime = AirportReachingTime.split(" ");

					String AMorPM = arrformattedTime[1];

					String arrtime[] = arrformattedTime[0].split(":");

					String hh = arrtime[0];

					String mm = arrtime[1];

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

					if (AMorPM.equalsIgnoreCase("AM")) {

						clickOn(btnAndroidClockAM, "AM button");
					}

					else if (AMorPM.equalsIgnoreCase("PM")) {
						clickOn(btnAndroidClockPM, "PM button");
					}

					waitForElement(btnAndroidOk);
					if (isElementPresent(btnAndroidOk)) {

						clickOn(btnAndroidOk, "OK Button");
					}
					takeScreenshot(driver);
				}

				else {

					String HourTimeFormat = getTimeIn24HourFormat(AirportReachingTime);

					String arrtime[] = HourTimeFormat.split(":");

					String hh = arrtime[0];

					String mm = arrtime[1];

					waitForElement(txtAndroidClockHour);

					if (isElementPresent(txtAndroidClockHour)) {

						enterText(txtAndroidClockHour, "Hours text box", hh);
					}
					waitForElement(txtAndroidClockMinute);

					if (isElementPresent(txtAndroidClockMinute)) {

						enterText(txtAndroidClockMinute, "Minutes text box", mm);
					}

					waitForElement(btnAndroidOk);
					if (isElementPresent(btnAndroidOk)) {

						clickOn(btnAndroidOk, "OK Button");
					}
					takeScreenshot(driver);

				}
			}

			else {

				String[] arrformattedTime = AirportReachingTime.split(" ");

				String AMorPM = arrformattedTime[1];

				String arrtime[] = arrformattedTime[0].split(":");

				String hh = arrtime[0];

				String mm = arrtime[1];

				waitForElement(btnClock);

				if (isElementPresent(btnClock)) {

					clickOn(btnClock, "Clock button");

				}

				waitForElement(elePickerWheel);

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
			
			if(isElementPresent(btnSelectTimeSlot)) {
				
				clickOn(btnSelectTimeSlot, "Time slot button");
			}
			
			GlobalVariables.SelectTimeSlotForAppointment=btnSelectTimeSlot.getText().trim();
			
			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
	public void SelectAppointmentForSelf() {
	
		try {
			waitForElement(btnAppointmentForDropdown);

			clickOn(btnAppointmentForDropdown, "Appointments dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtAppointmentFor);

				enterText(txtAppointmentFor, "Select Appointment For Textbox",
						GlobalVariables.FirstName + " " + GlobalVariables.LastName+ " " + "(Self)");
				
				TapOnElement(btnProceed, "Proceed button");
				
			} else {
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(GlobalVariables.FirstName + " " + GlobalVariables.LastName + " " + "(Self)");

				waitForElement(btniOS_Done);

				clickOn(btniOS_Done, "Done Button");
				
//				waitForElement(btnProceed);
//					
//			    clickOn(btnProceed, " Proceed Button");
				
			}
			
              
			
			
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	
	}
	
	
	public void SelectAppointmentForDependent() {
		

		
		try {
			waitForElement(btnAppointmentForDropdown);

			clickOn(btnAppointmentForDropdown, "Appointments dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtAppointmentFor);

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
	public Appointments_SelectAppointmentForPage returnAppointmentSelectAppointmentForPage() {
	
		
		return new Appointments_SelectAppointmentForPage(driver, data);
		
	}
	
	public void clickOnProceedButton() {

		try {
			
			SwipeUp();
			
			waitForElement(btnProceed);
			
			

			clickOn(btnProceed, " Proceed Button");

		} catch (Exception e) {
			
			

			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}

	public void clickOnConfirmBookingButton() {
		try {
			
			SwipeUp();
			
			waitForElement(btnConfirmBooking);
			
			SwipeUp();
			
			waitForElement(btnConfirmBooking);
			
		
			clickOn(btnConfirmBooking, " Confirm booking Button");
			
			

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
	}
	
//	public void ValidateMembershipAppointmentBenfitText() {
//		
//		try {
//			waitForElement(eleReviewAppointment_MembershipBenfitText);
//			
//			if(eleReviewAppointment_MembershipBenfitText.getText().replaceAll("\\s+", "").equals(Constants.MembershipBenfitAppointmentFreeText.replaceAll("\\s+", ""))) {
//				
//				passed("Successfully Validated the Free Appointment Membership benfit text As"+eleReviewAppointment_MembershipBenfitText.getText());
//			}
//			else {
//				failed(driver,"Failed To Validate  the Free Appointment Membership benfit text Expected As"+Constants.MembershipBenfitAppointmentFreeText+"But Actual is "+eleReviewAppointment_MembershipBenfitText.getText());
//			}
//			
//
//if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//	
//	SwipeUp();
//
//}else {
//	IOS_SwipeUP();
//}
//			
//			
//			
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//	}
	
	
	public void ValidateReviewYourAppointmentDetails() {

		try {

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				SwipeUp();

			}else {
				IOS_SwipeUP();
			}
			
			takeScreenshot(driver);
			
			waitForElement(eleReviewAppointment_ServiceIcon);

			if (isElementPresent(eleReviewAppointment_ServiceIcon)) {

				passed("Sucessfully Validated the Service icon In Review Your AppointmentDetails");

			} else {

				failed(driver, " failed to Validate the Service icon In Review Your AppointmentDetails");
			}

			waitForElement(eleReviewAppointment_ServiceName);

			if (eleReviewAppointment_ServiceName.getText().trim().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectServiceName.trim().replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service  Name in Review Appointment details As "
						+ eleReviewAppointment_ServiceName.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Service Name in Review Appointment details Expected As"
								+ GlobalVariables.SelectServiceName.replaceAll("\\s+", "") + "but Actual is"
								+ eleReviewAppointment_ServiceName.getText().replaceAll("\\s+", ""));
			}
			
			waitForElement(eleReviewAppointment_ServiceAddress);

			if (eleReviewAppointment_ServiceAddress.getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service Address in Review Appointment details As "
						+ eleReviewAppointment_PatientName.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Service Address in Review Appointment details Expected As"
								+GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "") + "but Actual is"
								+ eleReviewAppointment_ServiceAddress.getText().replaceAll("\\s+", ""));
			}
			
		
			waitForElement(eleReviewAppointment_PatientName);

			if (eleReviewAppointment_PatientName.getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.FirstName + GlobalVariables.LastName)) {
				passed("Successsfully validated the Patient Name in Review Appointment details As "
						+ eleReviewAppointment_PatientName.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Patient Name in Review Appointment details Expected As"
								+ GlobalVariables.FirstName + GlobalVariables.LastName + "but Actual is"
								+ eleReviewAppointment_PatientName.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleReviewAppointment_AppointmentSchedule);

			String AppointmentSchedule = eleReviewAppointment_AppointmentSchedule.getText().trim();

			String[] arrAppointmentSchedule = AppointmentSchedule.split(",");

			String Apoointment_Time = arrAppointmentSchedule[0];

			String Apoointment_Date = arrAppointmentSchedule[1];

			if (Apoointment_Time.equals(GlobalVariables.SelectTimeSlotForAppointment)) {

				passed("Successfully Validated the  Appointment schedule time in Review Appointment details As"
						+ Apoointment_Time);
			} else {
				failed_Continue(driver,
						"Failed To Validate the Appointment schedule time In Review Appointment details Expected As "
								+ (GlobalVariables.SelectTimeSlotForAppointment) + ",But Actual is" + Apoointment_Time);
			}

			if (Apoointment_Date.trim().replaceAll("\\s+", "").equals(GlobalVariables.SelectTravelDate.trim().replaceAll("\\s+", ""))) {

				passed("Successfully Validated the  Appointment schedule Date in Review Appointment details As"
						+ Apoointment_Date);
			} else {
				failed_Continue(driver,
						"Failed To Validate the  Appointment schedule Date In Review Appointment details Expected As "
								+ (GlobalVariables.SelectTravelDate) + ",But Actual is" + Apoointment_Date);
			}

			waitForElement(eleReviewAppointment_DOB);

			if (eleReviewAppointment_DOB.getText().trim().replaceAll("\\s+", "").equals(GlobalVariables.DOB.trim().replaceAll("\\s+", ""))) {

				passed("Successfully Validated the  date of Birth in Review Appointment details As"
						+ eleReviewAppointment_DOB.getText());
			} else {
				failed_Continue(driver, "Failed To Validate the date of Birth  In Review Appointment details Expected As "
						+ (GlobalVariables.DOB) + ",But Actual is" + eleReviewAppointment_DOB.getText());
			}
			waitForElement(eleReviewAppointment_Gender);

			if (eleReviewAppointment_Gender.getText().equals(GlobalVariables.GenderIdentity)) {
				passed("Successfully Validated the  Gender Identity in Review Appointment details As"
						+ eleReviewAppointment_Gender.getText());

			} else {
				failed_Continue(driver, "Failed To Validate the Gender Identity In Review Appointment details Expected As "
						+ (GlobalVariables.GenderIdentity) + ",But Actual is" + eleReviewAppointment_Gender.getText());
			}

			waitForElement(eleReviewAppointment_Phone);

			String UIPhoneNumber = eleReviewAppointment_Phone.getText();

			String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

			String PhoneNumberInPatientDetails = arrsUIPhoneNumber.replaceAll("[^\\d]", "");

			if (PhoneNumberInPatientDetails.equals(GlobalVariables.PhoneNumber)) {
				passed("Successfully Validated the  Phone Number in Review Appointment details As"
						+ PhoneNumberInPatientDetails);

			} else {
				failed_Continue(driver, "Failed To Validate the Phone Number Identity In Review Appointment details Expected As "
						+ (GlobalVariables.PhoneNumber) + ",But Actual is" + PhoneNumberInPatientDetails);

			}

			waitForElement(eleReviewAppointment_Email);

			if (eleReviewAppointment_Email.getText().equals(GlobalVariables.CreateUserName)) {
				passed("Successfully Validated the Email in Review Appointment details As"
						+ eleReviewAppointment_Email.getText());
			} else {
				failed_Continue(driver, "Failed To Validate the Email in  Review Appointment details Expected As "
						+ (GlobalVariables.CreateUserName) + ",But Actual is" + eleReviewAppointment_Email.getText());
			}

		} catch (Exception e) {

			failed_Continue(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
	
	
	public void ValidateBookingConfirmedDetails() {

		try {
			waitForElement(lblBookingConfirmed);

			if (isElementPresent(lblBookingConfirmed)) {

				passed("Successfully Validated the Booking Confirmed label");
			}

			
			takeScreenshot(driver);
			
//			waitForElement(eleReviewAppointment_ServiceIcon);
//
//			if (isElementPresent(eleReviewAppointment_ServiceIcon)) {
//				passed("Sucessfully Validated the Service icon In Booking Confirmed");
//			} else {
//				failed(driver, " failed to Validate the Service icon In Booking Confirmed");
//			}

			waitForElement(eleBookingConfirmed_ServiceName);

			if (eleBookingConfirmed_ServiceName.getText().trim().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectServiceName.trim().replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service  Name in Booking Confirmed As "
						+ eleBookingConfirmed_ServiceName.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Service Name in Booking Confirmed Expected As"
								+ GlobalVariables.SelectServiceName.replaceAll("\\s+", "") + "but Actual is"
								+ eleBookingConfirmed_ServiceName.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleBookingConfirmed_ServiceAddress);

			if (eleBookingConfirmed_ServiceAddress.getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service Address in Booking Confirmed As "
						+ eleBookingConfirmed_ServiceAddress.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Service Address in Booking Confirmed Expected As"
								+ GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "") + "but Actual is"
								+ eleBookingConfirmed_ServiceAddress.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleBookingConfirmed_PatientName);

			if (eleBookingConfirmed_PatientName.getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.FirstName + GlobalVariables.LastName)) {
				passed("Successsfully validated the Patient Name in Booking Confirmed As "
						+ eleReviewAppointment_PatientName.getText());
			} else {
				failed_Continue(driver,
						"Failed To Validate the Patient Name in Booking Confirmed Expected As" + GlobalVariables.FirstName
								+ GlobalVariables.LastName + "but Actual is"
								+ eleBookingConfirmed_PatientName.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleBookingConfirmed_AppointmentSchedule);

			String AppointmentSchedule = eleBookingConfirmed_AppointmentSchedule.getText().trim();

			String[] arrAppointmentSchedule = AppointmentSchedule.split(",");

			String Apoointment_Time = arrAppointmentSchedule[0];

			String Apoointment_Date = arrAppointmentSchedule[1];

			if (Apoointment_Time.equals(GlobalVariables.SelectTimeSlotForAppointment)) {

				passed("Successfully Validated the  Appointment schedule time in Booking Confirmed As" + Apoointment_Time);
			} else {
				failed_Continue(driver, "Failed To Validate the Appointment schedule time In Booking Confirmed Expected As "
						+ (GlobalVariables.SelectTimeSlotForAppointment) + ",But Actual is" + Apoointment_Time);
			}

			if (Apoointment_Date.trim().replaceAll("\\s+", "").equals(GlobalVariables.SelectTravelDate.trim().replaceAll("\\s+", ""))) {

				passed("Successfully Validated the  Appointment schedule Date in Booking Confirmed As" + Apoointment_Date);
			} else {
				failed_Continue(driver, "Failed To Validate the  Appointment schedule Date In Booking Confirmed Expected As "
						+ (GlobalVariables.SelectTravelDate) + ",But Actual is" + Apoointment_Date);
			}

			waitForElement(eleBookingConfirmed_Phone);

			String UIPhoneNumber = eleBookingConfirmed_Phone.getText();

			String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

			String PhoneNumberInPatientDetails = arrsUIPhoneNumber.replaceAll("[^\\d]", "");

			if (PhoneNumberInPatientDetails.equals(GlobalVariables.PhoneNumber)) {
				passed("Successfully Validated the  Phone Number in Booking Confirmed As" + PhoneNumberInPatientDetails);

			} else {
				failed_Continue(driver, "Failed To Validate the Phone Number Identity In Booking Confirmed Expected As "
						+ (GlobalVariables.PhoneNumber) + ",But Actual is" + PhoneNumberInPatientDetails);

			}

			waitForElement(eleBookingConfirmed_Email);

			if (eleBookingConfirmed_Email.getText().equals(GlobalVariables.CreateUserName)) {
				passed("Successfully Validated the Email in Booking Confirmed As" + eleBookingConfirmed_Email.getText());
			} else {
				failed_Continue(driver, "Failed To Validate the Gender Identity in Booking Confirmed Expected As "
						+ (GlobalVariables.CreateUserName) + ",But Actual is" + eleBookingConfirmed_Email.getText());
			}
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
	
	public AppointmentsPage clickOnDoneInBookingConfirmed() {

		try {
			
			waitForElement(DoneButton);
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
		

			clickOn(DoneButton, "Done button");
			
			}else {
			
			TapByCoordinates(DoneButton.getLocation().x+100, DoneButton.getLocation().y,"Done button");
			}
			
			GlobalVariables.AppointmentStatus=Constants.ActiveStatus;
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppointmentsPage(driver, data);
	}
	
	
	
	public void ClickOnBecomeTreatMemberFromHealthAppointment() {

		try {
			waitForElement(btnAppointmentForDropdown);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				clickOn(btnAppointmentForDropdown, "Appointments dropdown");

				waitForElement(txtAppointmentFor);

				TapByCoordinates(btnProceed.getLocation().getX() + 300, btnProceed.getLocation().getY() + 100,"Proceed button");
			} else {
				
				clickOn(btnAppointmentForDropdown, "Appointments dropdown");
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(Constants.Child);

				waitForElement(btniOS_Done);

				clickOn(btniOS_Done, "Done Button");
			}

			waitForElement(btnProceed);

			clickOn(btnProceed, "Proceed Button");

			waitForElement(btnbecomeATreatMember);

			clickOn(btnbecomeATreatMember, "Become A Treat member Button");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		

	}	
		

	
	
	
	public void ValidateCreateAHealthServiceAppointmentForNewChild() {
		
		try {
			SelectTravellingDateForAppointment(getCurrentDate());

			clickOnProceedButton();

			SelectAServiceInHealthServices(Constants.HealthService_CovidTest);

			clickOnProceedButton();

			selectAirportReachingTime();

			SelectTimeSlotForAnAppointment();

			clickOnProceedButton();
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}
	

	public void ValidateCreateAHealthServiceAppointment(String AppointmentFor) {

		try {
			
		
			SelectTravellingDateForAppointment(getFutureDate(1));

			clickOnProceedButton();

			SelectAServiceInHealthServices(Constants.HealthService_CovidTest);

			clickOnProceedButton();

			selectAirportReachingTime();

			SelectTimeSlotForAnAppointment();

			clickOnProceedButton();
			
			if(AppointmentFor.equals("Self")) {

			SelectAppointmentForSelf();
			
			}else if(AppointmentFor.equals("Child")) {
				
				SelectAppointmentForDependent();
			}

			clickOnProceedButton();

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void ValidateHealthProfileTextForChatCareDependent() {
		
		try {
			waitForElement(eleNoHealthProfileText);
			
			if(eleNoHealthProfileText.getText().replaceAll("\\s+", "").contains(Constants.AddChildFromHealthServicesText.replaceAll("\\s+", ""))) {
				
				passed("Successfully Validated the No Health Profile  Text For Dependent Created From ChatCare  As "+eleNoHealthProfileText.getText());
			}
			
			else {
				failed_Continue(driver,"Failed To Validate First time Child create Text  Expected As"+Constants.AddChildFromHealthServicesText+"But Actual is"+eleNoHealthProfileText.getText());
			}
			
			waitForElement(btnNoHealthProfile_Yes);
			
			clickOn(btnNoHealthProfile_Yes, "Yes Button");
			
			
		} catch (Exception e) {
			
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	
	}
		
	
	
	
	//update
	
//	public void AddChildInHealthServicesAppointments() {
//
//		try {
//			String randNum = generateRandomNumber(2);
//
//			waitForElement(txtFirstName);
//
//			if (isElementPresent(txtFirstName)) {
//
//				enterText(txtFirstName, "First Name", Constants.ChildFirstName + randNum);
//			}
//
//			waitForElement(txtLastName);
//			if (isElementPresent(txtLastName)) {
//
//				enterText(txtLastName, "Last Name", Constants.ChildLastName + randNum);
//			}
//
//			GlobalVariables.ChildName = Constants.ChildFirstName + randNum + " " + Constants.ChildLastName + randNum;
//
//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//
//				EnterDateOfBirthInAndroid();
//
//			} else {
//
//				if (isElementPresent(imgCalender)) {
//
//					EnterDateOfBirthIniOS();
//				}
//
//			}
//
//			
//
//			String ChildGender = Constants.ChildGender[new Random().nextInt(3)];
//
//			GlobalVariables.ChildGender = ChildGender;
//
//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//				EnterGenderIdentityInAndroid();
//			} else {
//				EnterGenderIdentityIniOS();
//			}
//
//			waitForElement(btnProceed);
//
//			clickOn(btnProceed, "Proceed Button");
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//	}
	
	
	
	
	
//	public MembershipPlansPage ValidateMembershipFromHealthServicesAppointments() {
//		try {
//			SelectTravellingDateForAppointment(getCurrentDate());
//
//			clickOnProceedButton();
//
//			SelectAServiceInHealthServices(Constants.HealthService_CovidTest);
//
//			clickOnProceedButton();
//
//			selectAirportReachingTime();
//
//			SelectTimeSlotForAnAppointment();
//
//			clickOnProceedButton();
//			
//			ClickOnBecomeTreatMemberFromHealthAppointment();
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//		
//		return new MembershipPlansPage(driver, data);
//	}
//	
		
		public void ValidateCreateAHealthServiceSecondAppointment(String AppointmentFor) {

			try {
				SelectTravellingDateForAppointment(getFutureDate(2));

				clickOnProceedButton();

				SelectAServiceInHealthServices(Constants.HealthService_FluVaccine);

				clickOnProceedButton();

				selectAirportReachingTime();

				SelectTimeSlotForAnAppointment();

				clickOnProceedButton();

				if(AppointmentFor.equals("Self")) {

					SelectAppointmentForSelf();
					
					}else if(AppointmentFor.equals("Child")) {
						
						SelectAppointmentForDependent();
					}

				clickOnProceedButton();

				
			} catch (Exception e) {

				failed(driver, "Exception caught " + e.getMessage());
			}

		}
		
		public void ValidateCreateIVTheraphyHealthServiceAppointmentForDependent() {
			
			SelectTravellingDateForAppointment(getFutureDate(3));

			clickOnProceedButton();
			
			SwipeUp();

			SelectAServiceInHealthServices(Constants.HealthService_IVTheraphy);
			
			clickOnProceedButton();

			selectAirportReachingTime();

			SelectTimeSlotForAnAppointment();

			clickOnProceedButton();
			
			SelectInValidAppointmentForDependent();
			
			ValidateSelectedAppointmentForTextField();
			
		}
		
		public AppointmentsPage ClickOnCloseAppointmentAtSelectAppointmentFor() {
			
			try {
				waitForElement(btnCloseAppointmentFor);
				
				clickOn(btnCloseAppointmentFor, "Close appointment Button");
				
				waitForElement(btnOKChatcareDependantPopUp);
				
				clickOn(btnOKChatcareDependantPopUp, "Ok button In Close appointment");
				
			} catch (Exception e) {
				
				failed(driver, "Exception caught " + e.getMessage());
			}
			
			
			return new AppointmentsPage(driver, data);
			
		}
		
		public void ValidateSelectedAppointmentForTextField() {
			
			try {
				waitForElement(txtAppointmentFor);
				
				if(!txtAppointmentFor.getText().equalsIgnoreCase(GlobalVariables.ChildName)) {
					
					passed("Successfully Validated IV Theraphy Appointment is not Available for Children ");
				}
				else {
					failed_Continue(driver,"Failed To Validate IV Theraphy Appointment is not Available for Children ");
				}
			} catch (Exception e) {
				failed(driver, "Exception caught " + e.getMessage());
			}
		}
		
		
		
		public void ValidateCreateAHealthServiceThirdAppointment(String AppointmentFor) {

			try {
				SelectTravellingDateForAppointment(getFutureDate(2));

				clickOnProceedButton();

				SelectAServiceInHealthServices(Constants.HealthService_EyeProblem);

				clickOnProceedButton();

				selectAirportReachingTime();

				SelectTimeSlotForAnAppointment();

				clickOnProceedButton();

				if (AppointmentFor.equals("Self")) {
					
					SelectAppointmentForSelf();
					
				} else if (AppointmentFor.equals("Child")) {
					
					SelectAppointmentForDependent();
				}
				

				clickOnProceedButton();

			} catch (Exception e) {

				failed(driver, "Exception caught " + e.getMessage());
			}

		}
	
	
	


		
	public void ValidateSelectTravellingDateErrorMessageInHealthServices() {
		
		try {
			waitForElement(btnCalender);
			
			if(isElementPresent(btnProceed)) {
				
				clickOn(btnProceed, "Proceed button");
				
			}
			
			waitForElement(errSelectTravelDate);
			
			if(errSelectTravelDate.getText().replaceAll("\\s+", "").equals(Constants.errPickDate.replaceAll("\\s+", ""))) {
				
				passed("Successfully Validated the Select Travel date Error Message As"+errSelectTravelDate.getText());
			}
			
			else {
				failed_Continue(driver,"Failed To Validate the Select Travel date Error Message ,Expected As"+Constants.errPickDate+"But Actual is "+errSelectTravelDate.getText());
				
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
		
	
	public void ValidateSelectHealthServiceErrorMessageInHealthServices() {
		
		try {
			waitForElement(btnProceed);
			
			if(isElementPresent(btnProceed)) {
				
				clickOn(btnProceed, "Proceed button");
				
			}
			
	
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				waitForElement(errSelectHealthService);
			
			if(errSelectHealthService.getText().replaceAll("\\s+", "").equals(Constants.errSelectService.replaceAll("\\s+", ""))) {
				
				passed("Successfully Validated the Select Health Service Error Message As"+errSelectHealthService.getText());
			}
			
			else {
				failed_Continue(driver,"Failed To Validate the Select Health Service Error Message ,Expected As"+Constants.errSelectService+"But Actual is "+errSelectHealthService.getText());
				
			}
			}
			else {
				if(isElementPresent(errSelectHealthService)){
					
					passed("Successfully Validated the Select Health Service Error Message As"+errSelectHealthService.getText());
				}
				
				else {
					failed_Continue(driver,"Failed To Validate the Select Health Service Error Message ,Expected As"+Constants.errSelectService+"But Actual is "+errSelectHealthService.getText());
					
				}
				
			}
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	
		
	}
	
	
	
	
		
	
	
	

	

	
	
	
	

	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	

	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(lblHealthServices);
			
			if (isElementPresent(lblHealthServices)||isElementPresent(lblReviewAppointments)) {

				passed("User Successfully Navigated To Health Services Page");
			} else {
				failed(driver, "User Failed To navigate To  Health Services Page");
			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
		
	

}
