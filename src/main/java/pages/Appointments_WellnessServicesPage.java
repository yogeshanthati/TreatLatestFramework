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

public class Appointments_WellnessServicesPage extends TestBase {

	protected Appointments_WellnessServicesPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
		
	}

	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Wellness Center Location')]//following-sibling::android.view.ViewGroup/android.widget.TextView")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Select a wellness center location']//following::XCUIElementTypeScrollView//XCUIElementTypeButton")
	private MobileElement eleSelectedWellnessCenterLocation;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Wellness Services']")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Wellness Services']")
	private MobileElement lblWellnessServices;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='calendar']")
	private MobileElement btnCalender;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btniOS_Done;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement elePickerWheel;

	@AndroidFindBy(xpath ="//android.widget.Button[contains(@resource-id,'id/btn_proceed')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement btnProceed;
	
	@AndroidFindBy(xpath ="//XCUIElementTypeImage[@name='searchLight']//following-sibling::XCUIElementTypeTextField")
	@iOSXCUITFindBy(xpath ="//android.widget.EditText[contains(@resource-id,':id/et_text')]")
	private MobileElement txtSearchService;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='clock']")
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
	
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='am']")
	private MobileElement btnAndroidClockAM;
	
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='pm']")
	private MobileElement btnAndroidClockPM;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	private MobileElement btnAndroidOk;
	
	@AndroidFindBy(xpath ="	//android.widget.ImageButton[@content-desc='Next month']")
	private MobileElement btnCalenderNext;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
	private MobileElement btnAndroidClockCancel;
	
	@AndroidFindBy(xpath ="//android.view.ViewGroup[contains(@resource-id,'id/time_slot')]//android.widget.TextView")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeImage[@name='clock']//following::XCUIElementTypeOther/XCUIElementTypeButton")
	private MobileElement btnSelectTimeSlot;
	
	
	@AndroidFindBy(xpath ="//android.widget.ImageButton[contains(@resource-id,'id/text_input_end_icon')]")
	@iOSXCUITFindBy(accessibility ="dropDown")
	private MobileElement btnAppointmentForDropdown ;
	
	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	private MobileElement txtAndroidAppointmentFor;
	
	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeImage[@name='dropDown']//preceding-sibling:: XCUIElementTypeStaticText[1])[2]")
	private MobileElement txtAppointmentFor;
	
	@AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[contains(@resource-id,'id/cv_service')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Wellness Services']//following::XCUIElementTypeOther/XCUIElementTypeImage")
	private List<MobileElement>eleSelectWellnessService ;

	@AndroidFindBy(xpath ="//androidx.cardview.widget.CardView[contains(@resource-id,'id/cv_service')]//android.widget.TextView")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Wellness Services']//following::XCUIElementTypeImage//following-sibling::XCUIElementTypeStaticText")
	private List<MobileElement>txtSelectWellnessService ;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[contains(@resource-id,'id/iv_service_selected')])[1]")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeImage//following-sibling::XCUIElementTypeButton)[1]")
	private MobileElement btnSelectWellnessCategory;

	@AndroidFindBy(xpath="(//android.widget.ImageView[contains(@resource-id,'id/iv_service_selected')])[1]")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeImage//following-sibling::XCUIElementTypeButton)[1]")
	private MobileElement btnSelectDurationOftheService;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[contains(@resource-id,'id/iv_service_selected')])[1]//preceding-sibling::android.widget.TextView")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeImage//following-sibling::XCUIElementTypeButton)[1]//preceding-sibling::XCUIElementTypeStaticText")
	private MobileElement txtSelectWellnessCategory;
	
	@AndroidFindBy(xpath ="//android.widget.ImageView[contains(@resource-id,'id/iv_service_icon')]")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeImage)[1]")
	private MobileElement eleReviewAppointment_ServiceIcon;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_test_name')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Review your appointment details']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleReviewAppointment_ServiceName;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_address')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Review your appointment details']//following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement eleReviewAppointment_ServiceAddress;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Patient Name')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[contains(@name,'Name')]//following-sibling::XCUIElementTypeStaticText[1]")
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
	
	
		
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_test_name')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Booking Confirmed']//following::XCUIElementTypeStaticText[1]")
	private MobileElement eleBookingConfirmed_ServiceName;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_address')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Booking Confirmed']//following::XCUIElementTypeStaticText[2]")
	private MobileElement eleBookingConfirmed_ServiceAddress;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Patient Name')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeStaticText[contains(@name,'Name')]//following-sibling::XCUIElementTypeStaticText[1])[2]")
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
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Wellness Services')]//following::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeStaticText[@name='Wellness Services']//following-sibling::XCUIElementTypeStaticText)[2]")
	private MobileElement eleWellnessServicesAvailability;

	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_add_to_calendar')]")
	private MobileElement btnAddToCalender;
	
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='Add to Apple Wallet']")	
	private MobileElement btnAddToWallet;
	
	@iOSXCUITFindBy(accessibility = "Add")
	private MobileElement btnAddToWallet_Add;
	
	@iOSXCUITFindBy(accessibility = "Cancel")
	private MobileElement btnAddToWallet_Cancel;
	
	
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='OK']")	
	private MobileElement btnOK;
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeOther[@name='SERVICE']")  
	private MobileElement eleAddToWallet_AppointmentName;
	

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
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Please choose a service']")
	private MobileElement errSelectHealthService;
	

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement NavBackInWellnessServices;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/iv_cancel')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='closeX']")
	private MobileElement btnCloseAppointmentFor;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement btnOKChatcareDependantPopUp;
	
	
	

	public void ValidateCreateAWellnessServiceAppointmentNonMemberForSelf() {
		try {
			SelectTravellingDateForAppointment(getCurrentDate());
			
			clickOnProceedButton();

			selectAServiceInWellnessServices();
		
			SelectServiceCategoryInWellnessServices();

			clickOnProceedButton();
			
			SelectDurationOfTheService();
			
			clickOnProceedButton();

			selectAirportReachingTime();

			SelectTimeSlotForAnAppointment();

			clickOnProceedButton();

			SelectAppointmentForSelf();

			clickOnProceedButton();
			
			SwipeUp();

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void ValidateCreateAWellnessServiceAppointmentMemberForSelf() {
		try {
			SelectTravellingDateForAppointment(getFutureDate(2));
			
			clickOnProceedButton();

			selectAServiceInWellnessServices();
		
			SelectServiceCategoryInWellnessServices();

			clickOnProceedButton();
			
			SelectDurationOfTheService();
			
			clickOnProceedButton();

			selectAirportReachingTime();

			SelectTimeSlotForAnAppointment();

			clickOnProceedButton();

			SelectAppointmentForSelf();

			clickOnProceedButton();

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	

	public void ValidateCreateAWellnessServiceAppointmentForDependent() {
		try {
			SelectTravellingDateForAppointment(getCurrentDate());
			
			clickOnProceedButton();

			selectAServiceInWellnessServices();
		
			SelectServiceCategoryInWellnessServices();

			clickOnProceedButton();
			
			SelectDurationOfTheService();
			
			clickOnProceedButton();

			selectAirportReachingTime();

			SelectTimeSlotForAnAppointment();

			clickOnProceedButton();
			
			SelectInvalidAppointmentForDependent();
			
			ValidateSelectedAppointmentForTextField();
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	public void ValidateSelectedAppointmentForTextField() {
		
		try {
			waitForElement(txtAppointmentFor);
			
			if(!txtAppointmentFor.getText().equalsIgnoreCase(GlobalVariables.ChildName)) {
				
				passed("Successfully Validated Wellness service Appointment is not Available for Children ");
			}
			else {
				failed_Continue(driver,"Failed To Validate Wellness service Appointment is not Available for Children ");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
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

			if (isElementPresent(PickerWheel.get(0))) {

				PickerWheel.get(0).sendKeys(TavelDateArr[0]);

			}

			if (isElementPresent(PickerWheel.get(1))) {

				PickerWheel.get(1).sendKeys(TavelDateArr[1]);

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


	

	
public void SelectInvalidAppointmentForDependent() {
	

	
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
	
	
	public void ValidateWellnessServiceEligibilityText() {
		
		try {
			waitForElement(eleWellnessServicesAvailability);
			
			
			if(isElementPresent(eleWellnessServicesAvailability)) {
				
				if(eleWellnessServicesAvailability.getText().trim().replaceAll("\\s+", "").equals(Constants.WellnessServicesAvailabilityText.replaceAll("\\s+", ""))) {
					
					passed("Sucessfully validated the Wellness Services Availability Text  As"+eleWellnessServicesAvailability.getText());
				}
				else {
					
					failed_Continue(driver," failed To Validate Wellness Services Availability Text  ,Expected As"+Constants.IVTheraphyAvailabilityText.replaceAll("\\s+", "")+"But Actual is "+eleWellnessServicesAvailability.getText().replaceAll("\\s+", ""));
				}
				
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
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
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
	
	public void SelectTravellingDateInWellnessServices() {

		try {

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(btnCalender);

				clickOn(btnCalender, "Calender button ");

				WebElement btnDate = driver.findElement(By.xpath("//android.view.View[@content-desc='"
						+ getDateFormatToStringInAndroid(getCurrentDate()) + "']"));

				clickOn(btnDate, "Date button");

				waitForElement(btnAndroidOk);

				clickOn(btnAndroidOk, "OK Button");

			}

			else {

				waitForElement(btnCalender);

				clickOn(btnCalender, "Calender button ");

				List<WebElement> PickerWheel = driver.findElements(By.xpath("//XCUIElementTypePickerWheel"));

				String TavelDateString = getDateFormatToString(getCurrentDate());

				String TavelDateArr[] = TavelDateString.split(" ");

				waitForElement(PickerWheel.get(0));

				if (isElementPresent(PickerWheel.get(0))) {

					PickerWheel.get(0).sendKeys(TavelDateArr[0]);

				}

				if (isElementPresent(PickerWheel.get(1))) {

					PickerWheel.get(1).sendKeys(TavelDateArr[1]);

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
			GlobalVariables.SelectTravelDate = getDateFormatToString(getCurrentDate());

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}	

	public void selectAServiceInWellnessServices() {

		try {
			Thread.sleep(3000);
			
			int Selectindex =new Random().nextInt(eleSelectWellnessService.size() - 1) + 0;

			waitForElement(eleSelectWellnessService.get(Selectindex));

			clickOn(eleSelectWellnessService.get(Selectindex), Selectindex + "Wellness Service ");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void SelectServiceCategoryInWellnessServices() {

		try {
			
			Thread.sleep(3000);
			waitForElement(btnSelectWellnessCategory);
			
			clickOn(btnSelectWellnessCategory, "Wellness service category radio button");

			waitForElement(txtSelectWellnessCategory);

			GlobalVariables.SelectServiceName = txtSelectWellnessCategory.getText();

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void SelectDurationOfTheService() {

		try {
			
			
			waitForElement(btnSelectDurationOftheService);

			if (isElementPresent(btnSelectDurationOftheService)) {

				clickOn(btnSelectDurationOftheService, "Service Durration radio button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

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
	
	public void selectAirportReachingTime() {
		try {

			String AirportReachingTime = getTimeFormatString(Constants.WellnessAirPortReachingTime);

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
			failed(driver, "Exception caught " + e.getMessage());		}
		
	}

public void SelectAppointmentForSelf() {
	
	try {
		waitForElement(btnAppointmentForDropdown);

		clickOn(btnAppointmentForDropdown, "Appointments dropdown");

		if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

			waitForElement(txtAndroidAppointmentFor);

			enterText(txtAndroidAppointmentFor, "Select Appointment For Textbox",
					GlobalVariables.FirstName + " " + GlobalVariables.LastName+ " " + "(Self)");
			
			TapOnElement(btnProceed, "Proceed button");
			
		} else {
			waitForElement(elePickerWheel);

			elePickerWheel.sendKeys(GlobalVariables.FirstName + " " + GlobalVariables.LastName + " " + "(Self)");

			waitForElement(btniOS_Done);

			clickOn(btniOS_Done, "Done Button");
		}
		
		
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}


}



public void clickOnConfirmBookingButton() {
	try {
		if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
			
			SwipeUp();

		}else {
		IOS_SwipeUP();
		}
		
		waitForElement(btnConfirmBooking);

		clickOn(btnConfirmBooking, " Confirm booking Button");

	} catch (Exception e) {

		failed(driver, "Exception caught " + e.getMessage());
	}
	
	
}

public void ValidateReviewYourAppointmentDetails() {

	try {
		takeScreenshot(driver);

		waitForElement(eleReviewAppointment_ServiceIcon);

		if (isElementPresent(eleReviewAppointment_ServiceIcon)) {

			passed("Sucessfully Validated the Service icon In Review Your AppointmentDetails");

		} else {

			failed_Continue(driver, " failed to Validate the Service icon In Review Your AppointmentDetails");
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
							+ GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "") + "but Actual is"
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
			failed_Continue(driver, "Failed To Validate the Appointment schedule time In Review Appointment details Expected As "
					+ (GlobalVariables.SelectTimeSlotForAppointment) + ",But Actual is" + Apoointment_Time);
		}

		if (Apoointment_Date.trim().replaceAll("\\s+", "")
				.equals(GlobalVariables.SelectTravelDate.trim().replaceAll("\\s+", ""))) {

			passed("Successfully Validated the  Appointment schedule Date in Review Appointment details As"
					+ Apoointment_Date);
		} else {
			failed_Continue(driver,
					"Failed To Validate the  Appointment schedule Date In Review Appointment details Expected As "
							+ (GlobalVariables.SelectTravelDate) + ",But Actual is" + Apoointment_Date);
		}

		waitForElement(eleReviewAppointment_DOB);

		if (eleReviewAppointment_DOB.getText().trim().replaceAll("\\s+", "")
				.equals(GlobalVariables.DOB.trim().replaceAll("\\s+", ""))) {

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
			failed_Continue(driver, "Failed To Validate the Gender Identity in Review Appointment details Expected As "
					+ (GlobalVariables.CreateUserName) + ",But Actual is" + eleReviewAppointment_Email.getText());
		}

	} catch (Exception e) {

		failed(driver, "Exception caught " + e.getMessage());
	}

}




public void ValidateBookingConfirmedDetails() {
	try {
		waitForElement(lblBookingConfirmed);

		if (isElementPresent(lblBookingConfirmed)) {

			passed("Successfully Validated the Booking Confirmed label");
		}

		takeScreenshot(driver);
		
		waitForElement(eleReviewAppointment_ServiceIcon);

		if (isElementPresent(eleReviewAppointment_ServiceIcon)) {

			passed("Sucessfully Validated the Service icon In Booking Confirmed");

		} else {

			failed_Continue(driver, " failed to Validate the Service icon In Booking Confirmed");
		}

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
			failed_Continue(driver,"Failed To Add  the Appointment Name to Calender Expected As "+GlobalVariables.SelectServiceName+" But  Actual is "+eleAddToCalender_AppointmentName.getText());
		}

		waitForElement(btnAddToCalender_YES);
		
		clickOn(btnAddToCalender_YES, "Calender Yes button");
		
		passed("User successfully added the appointment To the Calender");
		
		
		}
		else {
			
			waitForElement(btnAddToWallet);
			
			TapOnElement(btnAddToWallet, "Add To Wallet");
			
			waitForElement(eleAddToWallet_AppointmentName);
			
			if(eleAddToWallet_AppointmentName.getText().trim().replaceAll("\\s+", "").contains(GlobalVariables.SelectServiceName.replaceAll("\\s+", ""))){
				
				passed("Successfully Added  the Appointment Name to Aplle Wallet As"+GlobalVariables.SelectServiceName);
			}
			else {
				failed_Continue(driver,"Failed To Add  the Appointment Name to Apple Wallet Expected As "+GlobalVariables.SelectServiceName+" But  Actual is "+eleAddToWallet_AppointmentName.getText());
			}

			waitForElement(btnAddToWallet_Add);
			
			clickOn(btnAddToWallet_Add, "Calender Yes button");
			
			
			
			passed("User successfully added the appointment To the Calender");
			
		}
	} catch (Exception e) {
	
		failed(driver, "Exception caught As" + e.getMessage());
	}
	
	
}



public AppointmentsPage clickOnDoneInBookingConfirmed() {

	try {
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
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}

	return new AppointmentsPage(driver, data);
}

public void ValidateSelectTravellingDateErrorMessageInWellSenessServices() {
	
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

public  void SelectTravellingDateAsCurrentDate() {
	
	SelectTravellingDateForAppointment(getCurrentDate());
}

	



	
	
	
	@Override
	protected void VerifyNavigationToValidPage() {
		
		try {
			waitForElement(lblWellnessServices);
			
			if (isElementPresent(lblWellnessServices)) {

				passed("User Successfully Navigated To Wellness Services Page");
			} else {
				failed(driver, "User Failed To navigate To  Wellness Services Page");
			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
		
	

}
