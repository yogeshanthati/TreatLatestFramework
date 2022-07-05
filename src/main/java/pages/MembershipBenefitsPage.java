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

public class MembershipBenefitsPage extends TestBase {

	protected MembershipBenefitsPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
	
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Become a Treat Member today')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']")
	private MobileElement eleTreatLogo;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Become a Treat Member today & enjoy premium benefits!']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Become a Treat Member today & enjoy premium benefits!']")
	private MobileElement txtBecomeTreatMember;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[1]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='unlimitedVirtualChat']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtUnlimitedVirtualCareTitle;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[1]//following-sibling::android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='unlimitedVirtualChat']//following-sibling::XCUIElementTypeStaticText[3]")
	private MobileElement txtUnlimitedVirtualCareDescription;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='unlimitedVirtualChat']")
	private MobileElement imgUnlimitedVirtualCare;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[2]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='virtualHealthWallet']//following-sibling:: XCUIElementTypeStaticText[2]")
	private MobileElement txtSecureHealthWalletTitle;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[2]//following-sibling::android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='virtualHealthWallet']//following-sibling:: XCUIElementTypeStaticText[4]")
	private MobileElement txtSecureHealthWalletDescription;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='virtualHealthWallet']")
	private MobileElement imgSecureHealthWallet;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[3]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='healthPortal']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtPrescriptinSavingsCardTitle;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[3]//following-sibling::android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='healthPortal']//following-sibling::XCUIElementTypeStaticText[3]")
	private MobileElement txtPrescriptinSavingsCardDescription;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='healthPortal']")
	private MobileElement imgPrescriptinSavingsCard;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[4]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='qrCode']//following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement txtSmartHealthCardsTitle;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[4]//following-sibling::android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='qrCode']//following-sibling::XCUIElementTypeStaticText[4]")
	private MobileElement txtSmartHealthCardsDescription;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='qrCode']")
	private MobileElement imgSmartHealthCards;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[contains(@resource-id,':id/faq_question')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Frequently Asked Questions']//following-sibling::XCUIElementTypeStaticText")
	private List<MobileElement> txtFAQ_Questions;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Frequently Asked Questions']//following-sibling::XCUIElementTypeImage[@name='dropDown']")
	private List<MobileElement> imgFAQ_down;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[contains(@resource-id,':id/faq_answer')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='dropDown'])//following-sibling::XCUIElementTypeStaticText[1]")
	private List<MobileElement> txtFAQ_Answers;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[contains(@resource-id,':id/faq_answer')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='dropDown'])//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtFAQ_Answer;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/button_continue_to_pay')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Become a Member']")
	private MobileElement btnBecomeAMember;
	
	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement NavBack;
	
	public void ValidateMembershipBenefitsTextInMembershipBenefitsPage() {
		


		try {
		

			takeScreenshot(driver);

			waitForElement(txtBecomeTreatMember);

			if (isElementPresent(txtBecomeTreatMember)) {

				passed("User Successfully Validated the Become Treat Member Text In Membership plans Page");
			} else {
				failed_Continue(driver, "User Failed To Validate the Become Treat Member Text In Membership plans Page");

			}

			SwipeUp();
			
		
			
			waitForElement(imgUnlimitedVirtualCare);

			if (isElementPresent(imgUnlimitedVirtualCare)) {

				passed("User Successfully Validated the Unlimited Virtual care Logo In Membership plans Page");
			} else {
				failed_Continue(driver, "User Failed To Validate the Unlimited Virtual care Logo In Membership plans Page");

			}

			waitForElement(txtUnlimitedVirtualCareTitle);

			if (txtUnlimitedVirtualCareTitle.getText().replaceAll("\\s+", "")
					.equals(Constants.UnLimitedVirtualCareTitle.replaceAll("\\s+", ""))) {

				passed("User Successfully Validated the Unlimited Virtual care Title In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate the Unlimited Virtual Title In Membership plans Page");
			}

			waitForElement(txtUnlimitedVirtualCareDescription);

			if (txtUnlimitedVirtualCareDescription.getText().replaceAll("\\s+", "")
					.equals(Constants.UnLimitedVirtualCareDescription.replaceAll("\\s+", ""))) {

				passed("User Successfully Validated the Unlimited Virtual care  Description In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate the Unlimited Virtual Description In Membership plans Page");
			}

			waitForElement(imgSecureHealthWallet);

			if (isElementPresent(imgSecureHealthWallet)) {

				passed("User Successfully Validated the Secure Health Wallet Logo In Membership plans Page");
			} else {
				failed_Continue(driver, "User Failed To Validate the Secure Health Wallet Logo In Membership plans Page");

			}

			waitForElement(txtSecureHealthWalletTitle);

			if (txtSecureHealthWalletTitle.getText().replaceAll("\\s+", "")
					.equals(Constants.SecureHealthWalletTitle.replaceAll("\\s+", ""))) {

				passed("User Successfully Validated the  Secure Health Wallet Title In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate  Secure Health Wallet Title In Membership plans Page");
			}

			waitForElement(txtSecureHealthWalletDescription);

			if (txtSecureHealthWalletDescription.getText().replaceAll("\\s+", "")
					.equals(Constants.SecureHealthWalletDescription.replaceAll("\\s+", ""))) {

				passed("User Successfully Validated the  Secure Health Wallet  Description In Membership plans Page");

			} else {
				failed_Continue(driver,
						"User Failed To Validate the Secure Health Wallet Description In Membership plans Page");
			}

			waitForElement(imgPrescriptinSavingsCard);

			if (isElementPresent(imgPrescriptinSavingsCard)) {

				passed("User Successfully Validated the Prescription Savings Card Logo In Membership plans Page");
			} else {
				failed_Continue(driver,
						"User Failed To Validate the  Prescription Savings Card Logo In Membership plans Page");

			}

			waitForElement(txtPrescriptinSavingsCardTitle);

			if (txtPrescriptinSavingsCardTitle.getText().replaceAll("\\s+", "")
					.equals(Constants.PrescriptionSavingsCardTitle.replaceAll("\\s+", ""))) {

				passed("User Successfully Validated the  Prescription Savings Card Title In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate  Prescription Savings Card Title In Membership plans Page");
			}

			waitForElement(txtPrescriptinSavingsCardDescription);

			if (txtPrescriptinSavingsCardDescription.getText().replaceAll("\\s+", "")
					.equals(Constants.PrescriptionSavingsCardDescription.replaceAll("\\s+", ""))) {

				passed("User Successfully Validated the    Prescription Savings Card Description In Membership plans Page");

			} else {
				failed_Continue(driver,
						"User Failed To Validate the   Prescription Savings Card Description In Membership plans Page");
			}

			waitForElement(imgSmartHealthCards);

			if (isElementPresent(imgSmartHealthCards)) {

				passed("User Successfully Validated the Smart Health Cards Logo In Membership plans Page");
			} else {
				failed_Continue(driver, "User Failed To Validate the  Smart Health Cards Logo In Membership plans Page");

			}

			waitForElement(txtSmartHealthCardsTitle);
			
			
			
			if (txtSmartHealthCardsTitle.getText().replaceAll("\\s+", "")
					.equals(Constants.SmartHealthCardsTitle.replaceAll("\\s+", ""))) {

				passed("User Successfully Validated the  Smart Health Cards Title In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate  Smart Health Cards Title In Membership plans Page");
			}

			waitForElement(txtSmartHealthCardsDescription);

			if (txtSmartHealthCardsDescription.getText().replaceAll("\\s+", "")
					.equals(Constants.SmartHealthCardsDescription.replaceAll("\\s+", ""))) {

				passed("User Successfully Validated the  Smart Health Cards Description In Membership plans Page");

			} else {
				failed_Continue(driver,
						"User Failed To Validate the  Smart Health Cards Description In Membership plans Page");
			}

		
		} catch (Exception e) {

			failed_Continue(driver, "Exception caught " + e.getMessage());
		}

	
	}
	
	
	public void ValidateTheFAQInMembershipBenefitsPage() {

		try {

			SwipeUp();

			SwipeUp();

	

			takeScreenshot(driver);
			waitForElement(txtFAQ_Questions.get(0));
			if (txtFAQ_Questions.get(0).getText().trim().equals(Constants.FAQ_Question1)) {

				passed("User Successfullly validated the 1 st FAQ In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate the the 1 st FAQ In Membership plans Page");
			}

			if (txtFAQ_Questions.get(1).getText().trim().equals(Constants.FAQ_Question2)) {

				passed("User Successfullly validated the 2nd FAQ In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate the the 2nd FAQ In Membership plans Page");
			}

			if (txtFAQ_Questions.get(2).getText().trim().equals(Constants.FAQ_Question3)) {

				passed("User Successfullly validated the  3rd FAQ In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate the the 3rd FAQ In Membership plans Page");
			}

			if (txtFAQ_Questions.get(3).getText().trim().equals(Constants.FAQ_Question4)) {

				passed("User Successfullly validated the  4th FAQ In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate the the 4th FAQ In Membership plans Page");
			}

			if (txtFAQ_Questions.get(4).getText().trim().equals(Constants.FAQ_Question5)) {

				passed("User Successfullly validated the 5th FAQ In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate the the 5th FAQ In Membership plans Page");
			}

			if (txtFAQ_Questions.get(5).getText().trim().equals(Constants.FAQ_Question6)) {

				passed("User Successfullly validated the 6th FAQ In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate the the 6th FAQ In Membership plans Page");
			}

		
		} catch (Exception e) {
			failed_Continue(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateTheFAQAnswesInMembershipBenefitsPage() {

		try {
			
			int imgDownCount = imgFAQ_down.size();
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				String[] FAQAnswers = {Constants.FAQ_Answer1,Constants.FAQ_Answer2,Constants.FAQ_Answer3,Constants.FAQ_Answer4,Constants.FAQ_Answer5,Constants.FAQ_Answer6};
				
				
				
				int i=0;
				while(i<imgDownCount) {
			
					clickOn(imgFAQ_down.get(i), "Dropdown Element" + (i + 1));
					
					
					
					if (txtFAQ_Answer.getText().replaceAll("\\s+", "")
							.equals(FAQAnswers[i].replaceAll("\\s+", ""))) {

						passed("User Successfullly validated the "+(i + 1)+"  FAQ Answer In Membership plans Page");

					} else {

						failed_Continue(driver, "User Failed To Validate the the "+(i + 1)+" FAQ Answer In Membership plans Page");
					}
					
					
					
					clickOn(imgFAQ_down.get(i), "Dropdown Element" + (i + 1));
					
					
					
					i++;
				
				}
				
				
			}
			else {
			

			for (int i = imgDownCount - 1; i >= 0; i--) {

				clickOn(imgFAQ_down.get(i), "Dropdown Element" + (i + 1));

			}

			SwipeUp();

			SwipeUp();

			SwipeUp();

			takeScreenshot(driver);

			if (txtFAQ_Answers.get(0).getText().replaceAll("\\s+", "")
					.equals(Constants.FAQ_Answer1.replaceAll("\\s+", ""))) {

				passed("User Successfullly validated the 1st  FAQ Answer In Membership plans Page");

			} else {

				failed_Continue(driver, "User Failed To Validate the the 1 st FAQ Answer In Membership plans Page");
			}

			if (txtFAQ_Answers.get(1).getText().replaceAll("\\s+", "")
					.equals(Constants.FAQ_Answer2.replaceAll("\\s+", ""))) {

				passed("User Successfullly validated the 2nd FAQ Answer In Membership plans Page");

			} else {

				failed_Continue(driver, "User Failed To Validate the the 2nd FAQ Answer In Membership plans Page");
			}

			if (txtFAQ_Answers.get(2).getText().replaceAll("\\s+", "")
					.equals(Constants.FAQ_Answer3.replaceAll("\\s+", ""))) {

				passed("User Successfullly validated the  3rd FAQ Answer In Membership plans Page");

			} else {

				failed_Continue(driver, "User Failed To Validate the the 3rd FAQ Answer In Membership plans Page");
			}

			if (txtFAQ_Answers.get(3).getText().replaceAll("\\s+", "")
					.equals(Constants.FAQ_Answer4.replaceAll("\\s+", ""))) {

				passed("User Successfullly validated the  4th FAQ Answer In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate the the 4th FAQ Answer In Membership plans Page");
			}

			if (txtFAQ_Answers.get(4).getText().replaceAll("\\s+", "")
					.equals(Constants.FAQ_Answer5.replaceAll("\\s+", ""))) {

				passed("User Successfullly validated the 5th FAQ Answer In Membership plans Page");

			} else {
				failed(driver, "User Failed To Validate the the 5th FAQ Answer In Membership plans Page");
			}

			if (txtFAQ_Answers.get(5).getText().replaceAll("\\s+", "")
					.equals(Constants.FAQ_Answer6.replaceAll("\\s+", ""))) {

				passed("User Successfullly validated the 6th FAQ Answer In Membership plans Page");

			} else {
				failed_Continue(driver, "User Failed To Validate the the 6th FAQ Answer In Membership plans Page");
			}
			}
		} catch (Exception e) {
			failed_Continue(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
	
	public BecomeAMemberPage clickOnBecomeAMemberInMembershipBenefits() {

		try {
			waitForElement(btnBecomeAMember);

			clickOn(btnBecomeAMember, "Become A member");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
			
			
		}
		
		return new BecomeAMemberPage(driver, data);
	}

	
	
	public AppointmentsPage ClickOnNavigateBackToAppointments() {
		try {
			clickOn(NavBack, "Navigate Back button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppointmentsPage(driver, data);
	}
	
	
	@Override
	protected void VerifyNavigationToValidPage() {
	
		try {
			waitForElement(eleTreatLogo);

			if (isElementPresent(eleTreatLogo)||isElementPresent(btnBecomeAMember)) {

				passed("User Successfully Navigated To Membership Benefits  Page");
			} else {
				failed(driver, "User Failed To navigate To Membership Benefits Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	
	}

}
