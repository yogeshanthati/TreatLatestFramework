

//
//package pages;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.poi.util.SystemOutLogger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import base.TestBase;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
//import utilities.Constants;
//import utilities.Data;
//import utilities.GlobalKeys;
//import utilities.GlobalVariables;
//import utilities.SubscriptionsAPI;
//
//public class MembershipPlansPage extends TestBase {
//
//	protected MembershipPlansPage(AppiumDriver<WebElement> driver2, Data data) {
//		super(driver2, data);
//		// TODO Auto-generated constructor stub
//	}
//
//	
//
//	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Become a Treat Member today')]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']")
//	private MobileElement eleTreatLogo;
//
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Become a Treat Member today & enjoy additional benefits!']")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Become a Treat Member today & enjoy additional benefits!']")
//	private MobileElement txtBecomeTreatMember;
//
//	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[1]//following-sibling::android.widget.TextView[1]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='unlimitedVirtualChat']//following-sibling::XCUIElementTypeStaticText[1]")
//	private MobileElement txtUnlimitedVirtualCareTitle;
//
//	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[1]//following-sibling::android.widget.TextView[2]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='unlimitedVirtualChat']//following-sibling::XCUIElementTypeStaticText[3]")
//	private MobileElement txtUnlimitedVirtualCareDescription;
//
//	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[1]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='unlimitedVirtualChat']")
//	private MobileElement imgUnlimitedVirtualCare;
//
//	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[2]//following-sibling::android.widget.TextView[1]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='freeCovidTest']//following-sibling:: XCUIElementTypeStaticText[2]")
//	private MobileElement txtFreeAnnualCovidTestTitle;
//
//	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[2]//following-sibling::android.widget.TextView[2]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='freeCovidTest']//following-sibling:: XCUIElementTypeStaticText[4]")
//	private MobileElement txtFreeAnnualCovidTestDescription;
//
//	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[2]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='freeCovidTest']")
//	private MobileElement imgFreeAnnualCovidTest;
//
//	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[3]//following-sibling::android.widget.TextView[1]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='freeFluVaccination']//following-sibling::XCUIElementTypeStaticText[1]")
//	private MobileElement txtFreeAnnualFluVaccinationTitle;
//
//	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[3]//following-sibling::android.widget.TextView[2]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='freeFluVaccination']//following-sibling::XCUIElementTypeStaticText[3]")
//	private MobileElement txtFreeAnnualFluVaccinationDescription;
//
//	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[3]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='freeFluVaccination']")
//	private MobileElement imgFreeAnnualFluVaccination;
//
//	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[4]//following-sibling::android.widget.TextView[1]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='virtualHealthWallet']//following-sibling::XCUIElementTypeStaticText[2]")
//	private MobileElement txtVirtualHealthWalletTitle;
//
//	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[4]//following-sibling::android.widget.TextView[2]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='virtualHealthWallet']//following-sibling::XCUIElementTypeStaticText[4]")
//	private MobileElement txtVirtualHealthWalletDescription;
//
//	@AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.ImageView)[4]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='virtualHealthWallet']")
//	private MobileElement imgVirtualHealthWallet;
//
//	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Membership Plans')]//following-sibling::android.widget.TextView[1]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Membership Plans']//following-sibling:: XCUIElementTypeStaticText[1]")
//	private MobileElement txtMembershipPlansSelect;
//
//	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/layout_plan')]/android.widget.ImageView")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Membership Plans']//following-sibling::XCUIElementTypeButton")
//	private List<MobileElement> btnPlanSelect;
//
//	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/layout_plan')]/android.widget.TextView[4]")
//	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Membership Plans']//following-sibling::XCUIElementTypeButton)//following::XCUIElementTypeStaticText[1]")
//	private List<MobileElement> txtPlanAmount;
//
//	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Membership Plans']//following-sibling::XCUIElementTypeButton)//preceding::XCUIElementTypeStaticText[1]")
//	private List<MobileElement> txtiOSPlanDuration;
//
//	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/layout_plan')]/android.widget.TextView[1]")
//	private List<MobileElement> txtAndroidPlanIntervalCount;
//
//	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/layout_plan')]/android.widget.TextView[2]")
//	private List<MobileElement> txtAndroidPlanInterval;
//
//	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Frequently Asked Questions')]//following::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[contains(@resource-id,':id/faq_question')])")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Frequently Asked Questions']//following-sibling::XCUIElementTypeStaticText")
//	private List<MobileElement> txtFAQ_Questions;
//
//	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Frequently Asked Questions')]//following::android.widget.LinearLayout/android.widget.ImageView")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Frequently Asked Questions']//following-sibling::XCUIElementTypeImage[@name='dropDown']")
//	private List<MobileElement> imgFAQ_down;
//
//	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[contains(@resource-id,':id/faq_answer')]")
//	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='dropDown'])//following-sibling::XCUIElementTypeStaticText[1]")
//	private List<MobileElement> txtFAQ_Answers;
//
//	
//	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[contains(@resource-id,':id/faq_answer')]")
//	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='dropDown'])//following-sibling::XCUIElementTypeStaticText[1]")
//	private MobileElement txtFAQ_Answer;
//	
//	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/button_continue_to_pay')]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Become ']")
//	private MobileElement btnProceed;
//	
//	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Membership Plans')]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Membership Plans']")
//	private MobileElement eleMembershipPlans;
//
//	@AndroidFindBy(accessibility ="Navigate up")
//	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='arrowLeft']")
//	private MobileElement NavBackButton;
//	
//	
//
//	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Proceed'])[2]")
//	private MobileElement btnProceekdInChatCare;
//	
//
//
//
//	public BuyMembershipPage clickOnProceedButton() {
//
//		try {
//			
//			SwipeUp();
//			
//			waitForElement(btnProceed);
//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//
//				clickOn(btnProceed, "Proceed button");
//
//			} else {
//				
//				
//				IOS_TapOnElement(btnProceed, "Proceed button");
//				
//				
//
//			}
//		} catch (Exception e) {
//
//			failed(driver, "Exception caught " + e.getMessage());
//
//		}
//		return new BuyMembershipPage(driver, data);
//
//	}
//	
//	public BuyMembershipPage clickOnProceedButtonInChatCare() {
//
//		try {
//			waitForElement(btnProceed);
//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//
//				clickOn(btnProceed, "Proceed button");
//
//			} else {
//				
//				
//				IOS_TapOnElement(btnProceekdInChatCare, "Proceed button");
//				
//				
//
//			}
//		} catch (Exception e) {
//
//			failed(driver, "Exception caught " + e.getMessage());
//
//		}
//		return new BuyMembershipPage(driver, data);
//
//	}
//
//	public void ValidateTheBenfitsInMembershipPlansPage() {
//
//		try {
//		
//
//			takeScreenshot(driver);
//
//			waitForElement(txtBecomeTreatMember);
//
//			if (isElementPresent(txtBecomeTreatMember)) {
//
//				passed("User Successfully Validated the Become Treat Member Text In Membership plans Page");
//			} else {
//				failed(driver, "User Failed To Validate the Become Treat Member Text In Membership plans Page");
//
//			}
//
//			SwipeUp();
//			
//		
//			
//			waitForElement(imgUnlimitedVirtualCare);
//
//			if (isElementPresent(imgUnlimitedVirtualCare)) {
//
//				passed("User Successfully Validated the Unlimited Virtual care Logo In Membership plans Page");
//			} else {
//				failed(driver, "User Failed To Validate the Unlimited Virtual care Logo In Membership plans Page");
//
//			}
//
//			waitForElement(txtUnlimitedVirtualCareTitle);
//
//			if (txtUnlimitedVirtualCareTitle.getText().replaceAll("\\s+", "")
//					.equals(Constants.UnLimitedVirtualCareTitle.replaceAll("\\s+", ""))) {
//
//				passed("User Successfully Validated the Unlimited Virtual care Title In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate the Unlimited Virtual Title In Membership plans Page");
//			}
//
//			waitForElement(txtUnlimitedVirtualCareDescription);
//
//			if (txtUnlimitedVirtualCareDescription.getText().replaceAll("\\s+", "")
//					.equals(Constants.UnLimitedVirtualCareDescription.replaceAll("\\s+", ""))) {
//
//				passed("User Successfully Validated the Unlimited Virtual care  Description In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate the Unlimited Virtual Description In Membership plans Page");
//			}
//
//			waitForElement(imgFreeAnnualCovidTest);
//
//			if (isElementPresent(imgFreeAnnualCovidTest)) {
//
//				passed("User Successfully Validated the Free Annual covid test Logo In Membership plans Page");
//			} else {
//				failed(driver, "User Failed To Validate the Free Annual covid test Logo In Membership plans Page");
//
//			}
//
//			waitForElement(txtFreeAnnualCovidTestTitle);
//
//			if (txtFreeAnnualCovidTestTitle.getText().replaceAll("\\s+", "")
//					.equals(Constants.FreeAnnualCovidTestTitle.replaceAll("\\s+", ""))) {
//
//				passed("User Successfully Validated the  Free Annual covid test Title In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate  Free Annual covid test Title In Membership plans Page");
//			}
//
//			waitForElement(txtFreeAnnualCovidTestDescription);
//
//			if (txtFreeAnnualCovidTestDescription.getText().replaceAll("\\s+", "")
//					.equals(Constants.FreeAnnualCovidTestDescription.replaceAll("\\s+", ""))) {
//
//				passed("User Successfully Validated the  Free Annual covid test  Description In Membership plans Page");
//
//			} else {
//				failed(driver,
//						"User Failed To Validate the Free Annual covid test Description In Membership plans Page");
//			}
//
//			waitForElement(imgFreeAnnualFluVaccination);
//
//			if (isElementPresent(imgFreeAnnualFluVaccination)) {
//
//				passed("User Successfully Validated the Free Annual Flu Vaccination Logo In Membership plans Page");
//			} else {
//				failed(driver,
//						"User Failed To Validate the  Free Annual Flu Vaccination Logo In Membership plans Page");
//
//			}
//
//			waitForElement(txtFreeAnnualFluVaccinationTitle);
//
//			if (txtFreeAnnualFluVaccinationTitle.getText().replaceAll("\\s+", "")
//					.equals(Constants.FreeAnnualFluVaccinationTitle.replaceAll("\\s+", ""))) {
//
//				passed("User Successfully Validated the  Free Annual Flu Vaccination Title In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate  Free Annual Flu VaccinationTitle In Membership plans Page");
//			}
//
//			waitForElement(txtFreeAnnualFluVaccinationDescription);
//
//			if (txtFreeAnnualFluVaccinationDescription.getText().replaceAll("\\s+", "")
//					.equals(Constants.FreeAnnualFluVaccinationDescription.replaceAll("\\s+", ""))) {
//
//				passed("User Successfully Validated the   Free Annual Flu Vaccination  Description In Membership plans Page");
//
//			} else {
//				failed(driver,
//						"User Failed To Validate the  Free Annual Flu Vaccination Description In Membership plans Page");
//			}
//
//			waitForElement(imgVirtualHealthWallet);
//
//			if (isElementPresent(imgVirtualHealthWallet)) {
//
//				passed("User Successfully Validated the Virtual Health Wallet Logo In Membership plans Page");
//			} else {
//				failed(driver, "User Failed To Validate the   Virtual Health Wallet Logo In Membership plans Page");
//
//			}
//
//			waitForElement(txtFreeAnnualFluVaccinationTitle);
//
//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//				if (txtVirtualHealthWalletTitle.getText().replaceAll("\\s+", "")
//						.equals(Constants.HealthWalletTitle.replaceAll("\\s+", ""))) {
//
//					passed("User Successfully Validated the  Virtual Health Wallet Title In Membership plans Page");
//
//				} else {
//					failed(driver, "User Failed To Validate   Virtual Health Wallet Title In Membership plans Page");
//				}
//			} else {
//
//				if (txtVirtualHealthWalletTitle.getText().replaceAll("\\s+", "")
//						.equals(Constants.VirtualHealthWalletTitle.replaceAll("\\s+", ""))) {
//
//					passed("User Successfully Validated the  Virtual Health Wallet Title In Membership plans Page");
//
//				} else {
//					failed(driver, "User Failed To Validate   Virtual Health Wallet Title In Membership plans Page");
//				}
//			}
//
//			waitForElement(txtFreeAnnualFluVaccinationDescription);
//
//			if (txtVirtualHealthWalletDescription.getText().replaceAll("\\s+", "")
//					.equals(Constants.VirtualHealthWalletDescription.replaceAll("\\s+", ""))) {
//
//				passed("User Successfully Validated the    Virtual Health Wallet Description In Membership plans Page");
//
//			} else {
//				failed(driver,
//						"User Failed To Validate the   Virtual Health Wallet  Description In Membership plans Page");
//			}
//		} catch (Exception e) {
//
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//	}
//
//	public static String UIPlanDuration;
//
//	public static String UIPlanAmount;
//
//	public void ValidateThePlansInMembershipPlansPage() {
//
//		try {
//			SwipeUp();
//
//			waitForElement(txtMembershipPlansSelect);
//
//			if (txtMembershipPlansSelect.getText().trim().replaceAll("\\s+", "")
//					.equals(Constants.txtMembershipPlans.replaceAll("\\s+", ""))) {
//
//				passed("User Successfully Validated the Membership Plans select Text In Membership plans Page");
//			} else {
//				failed(driver, "User Failed To Validate the Membership Plans select Text In Membership plans Page");
//
//			}
//
//			HalfSwipeUp();
//
//			takeScreenshot(driver);
//
//			SubscriptionsAPI SubscriptionsAPI = new SubscriptionsAPI(data);
//
//			SubscriptionsAPI.getSubscriptionPlanDetails(GlobalVariables.CreateUserName, GlobalVariables.CreateUserPwd);
//
//			List lstUIPlanDuration = new ArrayList();
//
//			List lstAPIPlanDuration = new ArrayList();
//
//			List lstUIPlanAmount = new ArrayList();
//
//			List lstAPIPlanAmount = new ArrayList();
//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//
//				for (int i = 0; i < btnPlanSelect.size(); i++) {
//
//					UIPlanDuration = txtAndroidPlanIntervalCount.get(i).getText()
//							+ txtAndroidPlanInterval.get(i).getText();
//
//					UIPlanAmount = txtPlanAmount.get(i).getText();
//
//					String APIPlanPeriod = SubscriptionsAPI.IntervalCount.get(i) + SubscriptionsAPI.Interval.get(i);
//
//					lstUIPlanDuration.add(UIPlanDuration.replaceAll("\\s+", ""));
//
//					lstAPIPlanDuration.add(APIPlanPeriod);
//
//					lstUIPlanAmount.add(removeSpecialCharacters(UIPlanAmount));
//
//					lstAPIPlanAmount.add(String.valueOf(SubscriptionsAPI.Amount.get(i)));
//				}
//				if (lstUIPlanDuration.containsAll(lstAPIPlanDuration)) {
//
//					passed("User Successfully validated the subscription plan durations as" + lstUIPlanDuration);
//
//				} else {
//
//					failed(driver, "Failed to validate the subscription plan durations Expected as" + lstAPIPlanDuration
//							+ "but actual is" + lstUIPlanDuration);
//				}
//
//				if (lstUIPlanAmount.containsAll(lstAPIPlanAmount)) {
//
//					passed("User Successfully validated the subscription plan Amounts as" + lstUIPlanAmount);
//
//				} else {
//
//					failed(driver, "Failed to validate the subscription plan Amounts Expected as" + lstUIPlanAmount
//							+ "but actual is" + lstUIPlanAmount);
//				}
//
//			} else {
//
//				for (int i = 0; i < btnPlanSelect.size(); i++) {
//
//					UIPlanDuration = txtiOSPlanDuration.get(i).getText();
//
//					UIPlanAmount = txtPlanAmount.get(i).getText().trim();
//
//					lstUIPlanDuration.add((UIPlanDuration.replaceAll("s", "")).replaceAll("\\s+", ""));
//
//					String PlanPeriod = SubscriptionsAPI.IntervalCount.get(i) + SubscriptionsAPI.Interval.get(i);
//
//					lstAPIPlanDuration.add(PlanPeriod);
//
//					lstUIPlanAmount.add(removeSpecialCharacters(UIPlanAmount));
//
//					lstAPIPlanAmount.add(String.valueOf(SubscriptionsAPI.Amount.get(i)));
//
//				}
//
//				if (lstUIPlanDuration.containsAll(lstAPIPlanDuration)) {
//
//					passed("User Successfully validated the subscription plan durations as" + lstUIPlanDuration);
//
//				} else {
//
//					failed(driver, "Failed to validate the subscription plan durations Expected as" + lstAPIPlanDuration
//							+ "but actual is" + lstUIPlanDuration);
//				}
//
//				if (lstUIPlanAmount.containsAll(lstAPIPlanAmount)) {
//
//					passed("User Successfully validated the subscription plan Amounts as" + lstUIPlanAmount);
//
//				}
//
//			
//
//			}
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//	}
//
//	
//	public MyProfilePage clickOnNavigateBackInMembershipPlans() {
//		
//		try {
//			SwipeDown();
//
//			SwipeDown();
//			
//			SwipeDown();
//
//		
//					waitForElement(NavBackButton);
//					
//					clickOn(NavBackButton, "Navigate Back button");
//				
//			
//			SwipeDown();
//			SwipeDown();
//			
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//		
//		return new MyProfilePage(driver, data);
//			
//	
//		
//	}
//	public void SwipeDownTillSelectMembershipPlan() {
//
//		try {
//
//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//			
//				SwipeDown();
//
//			} else {
//				SwipeDown();
//
//				SwipeDown();
//				
//				IOS_SwipeDown();
//			}
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//	}
//
//	public void SwipeUpTillSelectMembershipPlan() {
//		try {
//			SwipeUp();
//
//			SwipeUp();
//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//				HalfSwipeUp();
//			} else {
//				SwipeUp();
//			}
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//	}
//
//	public void SelectPlanInMembershipPlans() {
//
//		try {
//			String PlanType = data.get("PlanType");
//
//			String UIAmount;
//
//			WebElement chkboxselectPlan;
//
//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//
//				String[] arrPlanType = PlanType.split(" ");
//
//				String planIntervalCount = arrPlanType[0];
//
//				String planInterval = arrPlanType[1];
//
//				chkboxselectPlan = driver.findElement(By.xpath(
//						"//android.widget.TextView[contains(@resource-id,'id/tv_interval_count')]//self::android.widget.TextView[contains(@text,'"
//								+ planIntervalCount + "')]//following-sibling::android.widget.TextView[contains(@text,'"
//								+ planInterval + "')]//following-sibling::android.widget.ImageView"));
//
//				sleep(2000);
//				clickOn(chkboxselectPlan, " Plan Select button");
//
//				takeScreenshot(driver);
//
//				UIAmount = driver.findElement(By.xpath(
//						"//android.widget.TextView[contains(@resource-id,'id/tv_interval_count')]//self::android.widget.TextView[contains(@text,'"
//								+ planIntervalCount + "')]//following-sibling::android.widget.TextView[contains(@text,'"
//								+ planInterval
//								+ "')]//following-sibling::android.widget.TextView[contains(@resource-id,'id/tv_plan_price')]"))
//						.getText();
//
//				GlobalVariables.SelectMembershipPlanType = PlanType;
//
//				GlobalVariables.SelectMembershipAmount = UIAmount;
//
//			}
//
//			else {
//
//				if (PlanType.contains("month")) {
//					PlanType = PlanType + "s";
//
//				}
//
//				chkboxselectPlan = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='" + PlanType
//						+ "']//following-sibling::XCUIElementTypeButton[1]"));
//				UIAmount = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='" + PlanType
//						+ "']//following-sibling::XCUIElementTypeStaticText[1]")).getText();
//
//				GlobalVariables.SelectMembershipPlanType = PlanType;
//
//				sleep(2000);
//				clickOn(chkboxselectPlan, " Plan Select button");
//
//				takeScreenshot(driver);
//				
//				GlobalVariables.SelectMembershipAmount = "$" + (UIAmount.split("\\$"))[1];
//
//				GlobalVariables.SelectMembershipPlanType = PlanType;
//
//			}
//
//		}
//
//		catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//	}
//
//	public void ValidateTheFAQInMembershipPlansPage() {
//
//		try {
//
//			SwipeUp();
//
//			SwipeUp();
//
//			SwipeUp();
//
//			takeScreenshot(driver);
//			waitForElement(txtFAQ_Questions.get(0));
//			if (txtFAQ_Questions.get(0).getText().trim().equals(Constants.FAQ_Question1)) {
//
//				passed("User Successfullly validated the 1 st FAQ In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate the the 1 st FAQ In Membership plans Page");
//			}
//
//			if (txtFAQ_Questions.get(1).getText().trim().equals(Constants.FAQ_Question2)) {
//
//				passed("User Successfullly validated the 2nd FAQ In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate the the 2nd FAQ In Membership plans Page");
//			}
//
//			if (txtFAQ_Questions.get(2).getText().trim().equals(Constants.FAQ_Question3)) {
//
//				passed("User Successfullly validated the  3rd FAQ In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate the the 3rd FAQ In Membership plans Page");
//			}
//
//			if (txtFAQ_Questions.get(3).getText().trim().equals(Constants.FAQ_Question4)) {
//
//				passed("User Successfullly validated the  4th FAQ In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate the the 4th FAQ In Membership plans Page");
//			}
//
//			if (txtFAQ_Questions.get(4).getText().trim().equals(Constants.FAQ_Question5)) {
//
//				passed("User Successfullly validated the 5th FAQ In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate the the 5th FAQ In Membership plans Page");
//			}
//
//			if (txtFAQ_Questions.get(5).getText().trim().equals(Constants.FAQ_Question6)) {
//
//				passed("User Successfullly validated the 6th FAQ In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate the the 6th FAQ In Membership plans Page");
//			}
//
//			// -------------------------------------------------------------------------------
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//	}
//
//	public void ValidateTheFAQAnswesInMembershipPlansPage() {
//
//		try {
//			
//			int imgDownCount = imgFAQ_down.size();
//			
//			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
//				
//				String[] FAQAnswers = {Constants.FAQ_Answer1,Constants.FAQ_Answer2,Constants.FAQ_Answer3,Constants.FAQ_Answer4,Constants.FAQ_Answer5,Constants.FAQ_Answer6};
//				
//				
//				
//				int i=0;
//				while(i<imgDownCount) {
//			
//					clickOn(imgFAQ_down.get(i), "Dropdown Element" + (i + 1));
//					
//					
//					
//					if (txtFAQ_Answer.getText().replaceAll("\\s+", "")
//							.equals(FAQAnswers[i].replaceAll("\\s+", ""))) {
//
//						passed("User Successfullly validated the "+(i + 1)+"  FAQ Answer In Membership plans Page");
//
//					} else {
//
//						failed(driver, "User Failed To Validate the the "+(i + 1)+" FAQ Answer In Membership plans Page");
//					}
//					
//					
//					
//					clickOn(imgFAQ_down.get(i), "Dropdown Element" + (i + 1));
//					
//					
//					
//					i++;
//				
//				}
//				
//				
//			}
//			else {
//			
//
//			for (int i = imgDownCount - 1; i >= 0; i--) {
//
//				clickOn(imgFAQ_down.get(i), "Dropdown Element" + (i + 1));
//
//			}
//
//			SwipeUp();
//
//			SwipeUp();
//
//			SwipeUp();
//
//			takeScreenshot(driver);
//
//			if (txtFAQ_Answers.get(0).getText().replaceAll("\\s+", "")
//					.equals(Constants.FAQ_Answer1.replaceAll("\\s+", ""))) {
//
//				passed("User Successfullly validated the 1st  FAQ Answer In Membership plans Page");
//
//			} else {
//
//				failed(driver, "User Failed To Validate the the 1 st FAQ Answer In Membership plans Page");
//			}
//
//			if (txtFAQ_Answers.get(1).getText().replaceAll("\\s+", "")
//					.equals(Constants.FAQ_Answer2.replaceAll("\\s+", ""))) {
//
//				passed("User Successfullly validated the 2nd FAQ Answer In Membership plans Page");
//
//			} else {
//
//				failed(driver, "User Failed To Validate the the 2nd FAQ Answer In Membership plans Page");
//			}
//
//			if (txtFAQ_Answers.get(2).getText().replaceAll("\\s+", "")
//					.equals(Constants.FAQ_Answer3.replaceAll("\\s+", ""))) {
//
//				passed("User Successfullly validated the  3rd FAQ Answer In Membership plans Page");
//
//			} else {
//
//				failed(driver, "User Failed To Validate the the 3rd FAQ Answer In Membership plans Page");
//			}
//
//			if (txtFAQ_Answers.get(3).getText().replaceAll("\\s+", "")
//					.equals(Constants.FAQ_Answer4.replaceAll("\\s+", ""))) {
//
//				passed("User Successfullly validated the  4th FAQ Answer In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate the the 4th FAQ Answer In Membership plans Page");
//			}
//
//			if (txtFAQ_Answers.get(4).getText().replaceAll("\\s+", "")
//					.equals(Constants.FAQ_Answer5.replaceAll("\\s+", ""))) {
//
//				passed("User Successfullly validated the 5th FAQ Answer In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate the the 5th FAQ Answer In Membership plans Page");
//			}
//
//			if (txtFAQ_Answers.get(5).getText().replaceAll("\\s+", "")
//					.equals(Constants.FAQ_Answer6.replaceAll("\\s+", ""))) {
//
//				passed("User Successfullly validated the 6th FAQ Answer In Membership plans Page");
//
//			} else {
//				failed(driver, "User Failed To Validate the the 6th FAQ Answer In Membership plans Page");
//			}
//			}
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//	}
//	
//	
//	public void ValidateDetailsInMembershipPlansPage() {
//		
//		try {
//			ValidateTheBenfitsInMembershipPlansPage();
//
//			ValidateThePlansInMembershipPlansPage();
//
//			ValidateTheFAQInMembershipPlansPage();
//
//			ValidateTheFAQAnswesInMembershipPlansPage();
//			
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//	}
//
//	@Override
//	protected void VerifyNavigationToValidPage() {
//		try {
//			waitForElement(eleTreatLogo);
//
//			if (isElementPresent(eleTreatLogo)||isElementPresent(eleMembershipPlans)) {
//
//				passed("User Successfully Navigated To Membership plans Page");
//			} else {
//				failed(driver, "User Failed To navigate To Membership plans Page");
//
//			}
//
//			takeScreenshot(driver);
//
//		} catch (Exception e) {
//			failed(driver, "Exception caught " + e.getMessage());
//		}
//
//	}
//}

