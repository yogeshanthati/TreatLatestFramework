package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import utilities.Data;
import utilities.Util;

public class AppNavPage extends TestBase {

	public AppNavPage(AppiumDriver<WebElement> driver, Data data) {
		super(driver, data);
	}

	private TestBase page;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Discover']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Discover']")
	private MobileElement txtDiscover;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'id/discover')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton[1]")
	private MobileElement btnDiscover;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'id/bookings')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton[2]")
	private MobileElement btnBookings;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'id/chat')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton[3]")
	private MobileElement btnChatCare;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'id/health_wallet')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton[4]")
	private MobileElement btnHealthWallet;

	@AndroidFindBy( accessibility ="My Profile")	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton[5]")
	private MobileElement btnMyAccount;

	@AndroidFindBy(id = "android:id/button2")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Not Now']")
	private MobileElement btnNotNow;
	
	@AndroidFindBy(xpath = "//*[@text='Next']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Next']")
	private MobileElement btnNextInAppTutorials;
	
	@AndroidFindBy(xpath = "//*[@text='Get Started']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Get Started']")
	private MobileElement btnGetStartedInAppTutorials;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Don’t Allow']")
	private MobileElement btnDontAllow;
	
	


	public MyProfilePage clickOnMyAccountButton() {

		try {
			waitForElement(btnMyAccount);
			
			if (isElementPresent(btnMyAccount)) {

				clickOn(btnMyAccount, "My Account button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught As " + e.getMessage());
		}

		return new MyProfilePage(driver, data);

	}

	public void clickOnNotNowButton() {

		try {
			waitForElement(btnNotNow);

			if (isElementPresent(btnNotNow)) {

				clickOn(btnNotNow, "NotNow  button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught As " + e.getMessage());
		}
	}

		
	public DiscoverPage clickOnDiscoverButton() {
		try {
			
		
			waitForElement(btnDiscover);

			if (isElementPresent(btnDiscover)) {

				clickOn(btnDiscover, "Discover button");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught As " + e.getMessage());
		}

		return new DiscoverPage(driver, data);

	}

	public HealthWalletPage clickOnHealthWalletButton() {
		try {
			waitForElement(btnHealthWallet);

			if (isElementPresent(btnHealthWallet)) {

				clickOn(btnHealthWallet, "Health Wallet");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught As " + e.getMessage());
		}

		return new HealthWalletPage(driver, data);

	}

	public ChatCarePage clickOnChatCareButton() {
		try {
			waitForElement(btnChatCare);

			if (isElementPresent(btnChatCare)) {

				clickOn(btnChatCare, "ChatCare button");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught As " + e.getMessage());
		}

		return new ChatCarePage(driver, data);

	}
	
	public AppointmentsPage clickOnBookingsButton() {
		
		try {
			waitForElement(btnBookings);

			if (isElementPresent(btnBookings)) {

				clickOn(btnBookings, "Bookings button");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught As " + e.getMessage());
		}
		return new AppointmentsPage(driver, data);
		
	}

	public void HandleAppTutorialButtons() {
		
		try {
			if(isElementPresent(btnNextInAppTutorials)) {
				
			waitForElement(btnNextInAppTutorials);
			if(isElementPresent(btnNextInAppTutorials)) {
			clickOn(btnNextInAppTutorials, "Next Button In App Tutorials");	
			}
			waitForElement(btnNextInAppTutorials);
			if(isElementPresent(btnNextInAppTutorials)) {
			clickOn(btnNextInAppTutorials, "Next Button In App Tutorials");	
			}
			waitForElement(btnNextInAppTutorials);
			if(isElementPresent(btnNextInAppTutorials)) {
			clickOn(btnNextInAppTutorials, "Next Button In App Tutorials");	
			}
			
			waitForElement(btnNextInAppTutorials);
			if(isElementPresent(btnNextInAppTutorials)) {
			clickOn(btnNextInAppTutorials, "Next Button In App Tutorials");	
			}
			
			waitForElement(btnGetStartedInAppTutorials);
			if(isElementPresent(btnGetStartedInAppTutorials)) {
			clickOn(btnGetStartedInAppTutorials, "Get  Started Button In App Tutorials");	
			}
			
			waitForElement(btnDontAllow);
			if(isElementPresent(btnDontAllow)) {
				clickOn(btnDontAllow, "Don't Allow Button In App Tutorials");	
				}
			
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		
}

	
	
	
	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(btnDiscover);

			if (isElementPresent(btnDiscover)) {

				passed("Successfully Navigated To Treat Home Page");

				takeScreenshot(driver);

			} else {
				failed(driver, "Failed to Navigate To Treat Home Page");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught while logging in " + e.getMessage());
		}

	}

}
