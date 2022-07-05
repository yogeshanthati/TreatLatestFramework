package pages;

import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Data;

public class AppointmentHistoryPage extends TestBase {

	protected AppointmentHistoryPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
		
	}

	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Appointment History')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment History']")
	private MobileElement lblAppointmentHistory;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Health Appointments')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Health Appointments']")
	private MobileElement btnHealthAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Wellness Appointments')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Wellness Appointments']")
	private MobileElement btnWellnessAppointments;
	
	
	
	
	
	public AppointmentHistory_HealthServiceAppointments clickOnHealthAppointmentsButton() {
		
		try {
			waitForElement(btnHealthAppointments);
			
			if (isElementPresent(btnHealthAppointments)) {
				
          clickOn(btnHealthAppointments, "Health Appointments Button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		return new AppointmentHistory_HealthServiceAppointments(driver, data);
		
	}
	

public AppointmentHistory_WellnessServiceAppointments clickOnWellnessAppointmentsButton() {
		
		try {
			waitForElement(btnWellnessAppointments);
			
			if (isElementPresent(btnWellnessAppointments)) {
				
            clickOn(btnWellnessAppointments, "Wellness Appointments Button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		return new AppointmentHistory_WellnessServiceAppointments(driver, data);
		
	}
	
	
	
	
	
	
	
	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(lblAppointmentHistory);
			
			if (isElementPresent(lblAppointmentHistory)) {

				passed("User Successfully Navigated To Appointment History  Page");
			} else {
				failed(driver, "User Failed To navigate To Appointment History  Page");
			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
	

}
