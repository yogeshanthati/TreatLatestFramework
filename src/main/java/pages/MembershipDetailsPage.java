package pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.AppointmentBenfitAPI;
import utilities.Constants;
import utilities.Data;
import utilities.DependentAppointmentBenefitAPI;
import utilities.GlobalKeys;
import utilities.GlobalVariables;
import utilities.SubscriptionsAPI;

public class MembershipDetailsPage extends TestBase {

	protected MembershipDetailsPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Membership Details')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Membership Details']")
	private MobileElement eleMembershipDetails;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/button_upgrade')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Upgrade']")
	private MobileElement btnUpgrade;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/button_cancel')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
	private MobileElement btnCancel;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/imageView3')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']")
	private MobileElement imgTreatLogoInMemberCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/user_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtUserNameInMemberCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_membership_ends_label')] ")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement txtMembershipEndsInMemberCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/membership_period')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[3]")
	private MobileElement txtMembershipPeriodInMemberCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_label_membership_benefits')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Membership Benefits']//following-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement txtMembershipBenfitsUnderMemberCard;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,':id/text_input_end_icon')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']")
	private MobileElement btnDropDown;

	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Membership Benefits']//following-sibling:: XCUIElementTypeStaticText[2]")
	private MobileElement txtInDropDown;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_benefit_name')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Membership Benefits']//following-sibling:: XCUIElementTypeStaticText[3]")
	private MobileElement eleBenefitName1;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_benefit_remaining_count')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Membership Benefits']//following-sibling:: XCUIElementTypeStaticText[4]")
	private MobileElement eleBenefitRemainingCount1;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_benefit_name')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Membership Benefits']//following-sibling:: XCUIElementTypeStaticText[5]")
	private MobileElement eleBenefitName2;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_benefit_remaining_count')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Membership Benefits']//following-sibling:: XCUIElementTypeStaticText[6]")
	private MobileElement eleBenefitRemainingCount2;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/layout_plan')]/android.widget.TextView[contains(@resource-id,'id/tv_plan_price')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton)//following-sibling::XCUIElementTypeStaticText[1]")
	private List<MobileElement> txtPlanAmount;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton)//preceding-sibling::XCUIElementTypeStaticText[1]")
	private List<MobileElement> txtiOSPlanDuration;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/layout_plan')]/android.widget.TextView[1]")
	private List<MobileElement> txtAndroidPlanIntervalCount;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/layout_plan')]/android.widget.TextView[2]")
	private List<MobileElement> txtAndroidPlanInterval;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/button_continue_to_pay')]")
	@iOSXCUITFindBy(accessibility = "Continue To Pay")
	private MobileElement btnContinueToPay;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/tag_active')]//preceding-sibling::android.widget.TextView")
	private List<MobileElement> txtAndroidActivePlan;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Active']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtIOSActivePlanDuration;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Active']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtIOSActivePlanAmount;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/tag_active')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Active']")
	private MobileElement lablActive;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_tex')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']//preceding-sibling::XCUIElementTypeStaticText")
	private MobileElement eleCancelDialogboxText;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_yes')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private MobileElement btnCancelYes;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_no')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	private MobileElement btnCancelNo;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_done')]//following-sibling::android.widget.TextView[contains(@resource-id,'id/tv_description')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='doneToast']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement msgCancelSuccess;

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement btnNavigateBack;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btnDone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement elePickerWheel;

	// XCUIElementTypeStaticText[@name='Membership Benefits']

	// android.widget.TextView[contains(@text,'Membership Benefits')]
	// XCUIElementTypeStaticText[@name='Membership
	// Benefits']//following-sibling::XCUIElementTypeImage[@name='dropDown']

	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement DefaultDropdownSelect;

	public void clickOnUpgradeButton() {

		try {
			waitForElement(btnUpgrade);

			clickOn(btnUpgrade, "Upgrade button");
			Thread.sleep(2000);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void ValidateMembershipCardDetailsInMembershipDetailspage() {

		try {
			waitForElement(imgTreatLogoInMemberCard);

			if (isElementPresent(imgTreatLogoInMemberCard)) {
				passed("User Successfully Validated  The Teat Logo In  Membership Details Page");

			} else {
				failed(driver, "Failed To Validate The Treat Logo In  Membership Details Page");
			}

			waitForElement(txtUserNameInMemberCard);

			if (txtUserNameInMemberCard.getText().equals(GlobalVariables.FirstName + " " + GlobalVariables.LastName)) {

				passed(" Successfully Validated the User Name In   Membership Details Page As"
						+ txtUserNameInMemberCard.getText());

			} else {

				failed(driver, "Failed To Validate the User NAme In   Membership Details Page ");
			}

			waitForElement(txtMembershipPeriodInMemberCard);

			if (txtMembershipPeriodInMemberCard.getText()
					.equals(getSubscriptionDate(GlobalVariables.SelectMembershipPlanType))) {

				passed(" Successfully Validated The Membership Period In    Membership Details Page  As"
						+ txtMembershipPeriodInMemberCard.getText());

			} else {

				failed(driver, " Failed To Validate the Membership Period In    Membership Details Page");

			}

			waitForElement(txtMembershipEndsInMemberCard);

			if (txtMembershipEndsInMemberCard.getText().trim().equals(Constants.MembershipRenewsText)) {

				passed("Successfully Validated  Membership Ends Text In  Membership Details Page As"
						+ txtMembershipEndsInMemberCard.getText());

			} else {
				failed(driver, "Failed To Validate The Membership Ends Text In  Membership Details Page ");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUpgradeMembershipDetailsInMembershipDetailsPgae() {

		try {
			waitForElement(imgTreatLogoInMemberCard);

			if (isElementPresent(imgTreatLogoInMemberCard)) {
				passed(" Successfully Validated  The Teat Logo In  Membership Details Page");

			} else {
				failed(driver, "Failed To Validate The Treat Logo In  Membership Details Page");
			}

			waitForElement(txtUserNameInMemberCard);

			if (txtUserNameInMemberCard.getText().equals(GlobalVariables.FirstName + " " + GlobalVariables.LastName)) {

				passed(" Successfully Validated the User Name In   Membership Details Page As"
						+ txtUserNameInMemberCard.getText());

			} else {

				failed(driver, "Failed To Validate the User NAme In   Membership Details Page ");
			}

			waitForElement(txtMembershipPeriodInMemberCard);

			if (txtMembershipPeriodInMemberCard.getText()
					.equals(getSubscriptionDate(GlobalVariables.SelectUpgradeMembershipPlanType))) {

				passed(" Successfully Validated The  Upgraded Membership Period In Membership details Page As"
						+ txtMembershipPeriodInMemberCard.getText());

			} else {

				failed(driver, " Failed To Validate the  Upgraded Membership Period In    Membership Details Page");

			}

			waitForElement(txtMembershipEndsInMemberCard);

			if (txtMembershipEndsInMemberCard.getText().trim().equals("Membership Renews")) {

				passed(" Successfully Validated  Membership Ends Text In  Membership Details Page As"
						+ txtMembershipEndsInMemberCard.getText());

			} else {
				failed(driver, "Failed To Validate The Membership Ends Text In  Membership Details Page ");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateActivePlanInUpgradePage() {

		try {
			waitForElement(lablActive);

			if (isElementPresent(lablActive)) {

				if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

					waitForElement(txtAndroidActivePlan.get(0));

					String ActivePlan = txtAndroidActivePlan.get(0).getText() + txtAndroidActivePlan.get(1).getText();

					if (GlobalVariables.SelectMembershipPlanType.replaceAll("\\s+", "")
							.equals(ActivePlan.replaceAll("\\s+", ""))) {

						passed(" Successfully Validated the Active Plan In Upgrade Page As "
								+ GlobalVariables.SelectMembershipPlanType);

					} else {
						failed(driver, " Failed To Validate the Active Plan In Upgrade Page");
					}
				}

				else {

					waitForElement(txtIOSActivePlanDuration);

					String ActivePlan = txtIOSActivePlanDuration.getText();

					if (GlobalVariables.SelectMembershipPlanType.replaceAll("\\s+", "")
							.equals(ActivePlan.replaceAll("\\s+", ""))) {

						passed("Successfully Validated the Active Plan In Upgrade Page As "
								+ GlobalVariables.SelectMembershipPlanType);

					} else {
						failed(driver, " Failed To Validate the Active Plan In Upgrade Page");
					}
				}

			}

			else {
				failed(driver, " Failed To Locate the Active Plan In Upgrade Page");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void SelectPlanInUpgradePage() {

		try {
			String UpGradePlanType = data.get("UpGradePlanType");

			String UIAmount;

			WebElement chkboxselectUpgradePlan;

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				String[] arrUpgradePlanType = UpGradePlanType.split(" ");

				String planIntervalCount = arrUpgradePlanType[0];

				String planInterval = arrUpgradePlanType[1];

				chkboxselectUpgradePlan = driver.findElement(By.xpath(
						"//android.widget.TextView[contains(@resource-id,'id/tv_interval_count')]//self::android.widget.TextView[contains(@text,'"
								+ planIntervalCount + "')]//following-sibling::android.widget.TextView[contains(@text,'"
								+ planInterval + "')]//following-sibling::android.widget.ImageView"));

				clickOn(chkboxselectUpgradePlan, " Plan Select button");

				sleep(4000);
				takeScreenshot(driver);

				UIAmount = driver.findElement(By.xpath(
						"//android.widget.TextView[contains(@resource-id,'id/tv_interval_count')]//self::android.widget.TextView[contains(@text,'"
								+ planIntervalCount + "')]//following-sibling::android.widget.TextView[contains(@text,'"
								+ planInterval
								+ "')]//following-sibling::android.widget.TextView[contains(@resource-id,'id/tv_plan_price')]"))
						.getText();

				GlobalVariables.SelectUpgradeMembershipAmount = UIAmount;

				GlobalVariables.SelectUpgradeMembershipPlanType = UpGradePlanType;

			} else {

				// iOS

				if (UpGradePlanType.contains("month")) {

					UpGradePlanType = UpGradePlanType + "s";

				}

				chkboxselectUpgradePlan = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='"
						+ UpGradePlanType + "']//following-sibling::XCUIElementTypeButton[1]"));

				clickOn(chkboxselectUpgradePlan, " Plan Select button");
				sleep(4000);
				takeScreenshot(driver);

				UIAmount = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='" + UpGradePlanType
						+ "']//following-sibling::XCUIElementTypeStaticText[1]")).getText();

				GlobalVariables.SelectUpgradeMembershipAmount = "$" + (UIAmount.split("\\$"))[1];

				GlobalVariables.SelectUpgradeMembershipPlanType = UpGradePlanType;

			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void CancelTheExistingMembershipInMembershipDetails() {

		try {
			clickOnCancelButtonInMembershipDetailsPage();

			clickOnCancelButtonInMembershipDetailsPage();

			clickOnCancelYesButtonInMembershipDetailsPage();

			ValidateCancelSuccessMessage();

			ValidateCancelButtonStatusAfterCancellingTheMembership();

			ValidateMembershipEndsStatusForCancelInMembershipDetailsPage();
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnCancelButtonInMembershipDetailsPage() {

		try {
			waitForElement(btnCancel);
			if (isElementPresent(btnCancel)) {

				clickOn(btnCancel, "Cancel button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnCancelYesButtonInMembershipDetailsPage() {

		try {
			waitForElement(btnCancelYes);
			if (isElementPresent(btnCancelYes)) {

				clickOn(btnCancelYes, "Cancel Yes button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnCancelNoButtonInMembershipDetailsPage() {

		try {
			waitForElement(btnCancelNo);
			if (isElementPresent(btnCancelNo)) {

				clickOn(btnCancelNo, "Cancel No button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateCancelNoButtonFunctionality() {

		try {
			waitForElement(btnCancel);
			if (btnCancel.isEnabled()) {

				passed("Successfully Validated the Cancel No Button Functionality");
			} else {

				failed(driver, "Failed To Validate Cancel No Button Functionality");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateCancelDialogboxTextInMembershipDetailsPage() {

		try {
			takeScreenshot(driver);

			waitForElement(eleCancelDialogboxText);

			if (eleCancelDialogboxText.getText().equalsIgnoreCase(Constants.CancelDialogboxText)) {

				passed(" Successfully Validated the Cancel dialogbox text");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateCancelButtonStatusAfterCancellingTheMembership() {

		try {
			takeScreenshot(driver);
			waitForElement(btnCancel);
			if (!btnCancel.isEnabled()) {

				passed("Successfully Validated the  disable status of Cancel  Button  After Cancelling the  Membership");
			} else {

				failed(driver,
						"Failed To Validate  disable status of Cancel  Button  After Cancelling the  Membership");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateCancelSuccessMessage() {

		try {
			if (isElementPresent(msgCancelSuccess)) {

				if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

					if (msgCancelSuccess.getText().trim().equalsIgnoreCase(Constants.msgSuccessMembershipCancel)) {

						passed("Successfully validate Membership cancel Success Message");

					} else {
						failed(driver, "Failed To Validate  Membership cancel Success Message");
					}

				}

				else {

					if (msgCancelSuccess.getText().trim().equalsIgnoreCase(Constants.iOSmsgSuccessMembershipCancel)) {

						passed("Successfully validate Membership cancel Success Message");

					} else {
						failed(driver, "Failed To Validate  Membership cancel Success Message");
					}

				}
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateMembershipEndsStatusForCancelInMembershipDetailsPage() {

		try {
			waitForElement(txtMembershipEndsInMemberCard);

			if (txtMembershipEndsInMemberCard.getText().trim().equals(Constants.MembershipExpiresText)) {

				passed(" Successfully Validated  Membership Ends Text In  Membership Details Page As"
						+ txtMembershipEndsInMemberCard.getText());

			} else {
				failed(driver, "Failed To Validate The Membership Ends Text In  Membership Details Page ");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public MyProfilePage clickOnBackButton() {
		try {
			waitForElement(btnNavigateBack);

			clickOn(btnNavigateBack, "Navigate Back Button");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new MyProfilePage(driver, data);

	}

	public void ValidatePlansInUpgradePlanPage() {

		try {
			SubscriptionsAPI SubscriptionsAPI = new SubscriptionsAPI(data);

			SubscriptionsAPI.getSubscriptionPlanDetails(GlobalVariables.CreateUserName, GlobalVariables.CreateUserPwd);

			String UIPlanDuration;

			String UIPlanAmount;

			List lstUIPlanDuration = new ArrayList();

			List lstAPIPlanDuration = new ArrayList();

			List lstUIPlanAmount = new ArrayList();

			List lstAPIPlanAmount = new ArrayList();

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				for (int i = 0; i < txtAndroidPlanIntervalCount.size(); i++) {

					UIPlanDuration = txtAndroidPlanIntervalCount.get(i).getText()
							+ txtAndroidPlanInterval.get(i).getText();

					String APIPlanDuration = SubscriptionsAPI.IntervalCount.get(i) + SubscriptionsAPI.Interval.get(i);

					lstUIPlanDuration.add(UIPlanDuration.replaceAll("\\s+", ""));

					lstAPIPlanDuration.add(APIPlanDuration);

					UIPlanAmount = removeSpecialCharacters(txtPlanAmount.get(i).getText());

					String APIPLanAmount = String.valueOf(SubscriptionsAPI.Amount.get(i));

					lstUIPlanAmount.add(UIPlanAmount);

					lstAPIPlanAmount.add(APIPLanAmount);

				}

				if (lstUIPlanDuration.containsAll(lstAPIPlanDuration)) {

					passed(" Successfully validated the subscription plan durations as" + lstUIPlanDuration);

				} else {

					failed(driver, "Failed to validate the subscription plan durations Expected as" + lstAPIPlanDuration
							+ "but actual is" + lstUIPlanDuration);
				}

				if (lstUIPlanAmount.containsAll(lstAPIPlanAmount)) {

					passed("User Successfully validated the subscription plan Amounts as" + lstUIPlanAmount);

				} else {

					failed(driver, "Failed to validate the subscription plan Amounts Expected as" + lstUIPlanAmount
							+ "but actual is" + lstUIPlanAmount);
				}

			}

//----------------------------------------------------------------------------------------------------------------------------------
			else {
				lstUIPlanDuration.add(txtIOSActivePlanDuration.getText().replaceAll("s", "").replaceAll("\\s+", ""));

				lstUIPlanAmount.add(removeSpecialCharacters(txtIOSActivePlanAmount.getText().trim()));

				for (int i = 0; i < txtiOSPlanDuration.size(); i++) {

					UIPlanDuration = txtiOSPlanDuration.get(i).getText();

					UIPlanAmount = txtPlanAmount.get(i).getText().trim();

					lstUIPlanDuration.add((UIPlanDuration.replaceAll("s", "")).replaceAll("\\s+", ""));

					String PlanPeriod = SubscriptionsAPI.IntervalCount.get(i) + SubscriptionsAPI.Interval.get(i);

					lstAPIPlanDuration.add(PlanPeriod);

					lstUIPlanAmount.add(removeSpecialCharacters(UIPlanAmount));

					lstAPIPlanAmount.add(String.valueOf(SubscriptionsAPI.Amount.get(i)));

				}
				if (lstUIPlanDuration.containsAll(lstAPIPlanDuration)) {

					passed(" Successfully validated the subscription plan durations as" + lstUIPlanDuration);

				} else {

					failed(driver, "Failed to validate the subscription plan durations Expected as" + lstAPIPlanDuration
							+ "but actual is" + lstUIPlanDuration);
				}

				if (lstUIPlanAmount.containsAll(lstAPIPlanAmount)) {

					passed(" Successfully validated the subscription plan Amounts as" + lstUIPlanAmount);

				} else {

					failed(driver, "Failed to validate the subscription plan Amounts Expected as" + lstUIPlanAmount
							+ "but actual is" + lstUIPlanAmount);
				}

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public BuyMembershipPage clickOnContinueToPayButton() {

		try {
			waitForElement(btnContinueToPay);

			clickOn(btnContinueToPay, "Continue To Pay button");

			Thread.sleep(2000);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new BuyMembershipPage(driver, data);

	}

	public void SelectMembershipBenifitsForSelf() {

		try {
			waitForElement(btnDropDown);

			clickOn(btnDropDown, "Membership benfit for dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				clickOn(btnDropDown, "Membership Benfits for dropdown");

				TapOnElement(eleBenefitName1, " Membership Benfits ");
			} else {
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(GlobalVariables.FirstName + " " + GlobalVariables.LastName + " " + "(Self)");

				waitForElement(btnDone);

				clickOn(btnDone, "Done Button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateDefaultSelectOptionForSelfInMembershipDetails() {

		try {
			waitForElement(DefaultDropdownSelect);

			takeScreenshot(driver);

			if (DefaultDropdownSelect.getText().trim().replaceAll("\\s+", "")
					.equals((GlobalVariables.FirstName + GlobalVariables.LastName + "(Self)").replaceAll("\\s+", ""))) {

				passed(" successfully validated Membership Benfits for  Dropdown Default Select Option As"
						+ DefaultDropdownSelect.getText());
			} else {
				failed(driver,
						" Failed To Validate  Membership Benfits for Dropdown Default Select Option .Expected As"
								+ (GlobalVariables.FirstName + GlobalVariables.LastName + "(Self)").replaceAll("\\s+",
										"")
								+ "But Actual is" + DefaultDropdownSelect.getText().trim().replaceAll("\\s+", ""));
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateMembershipBenfitsforMemberSelf() {

		try {

			ValidateDefaultSelectOptionForSelfInMembershipDetails();

			AppointmentBenfitAPI AppointmentBenfitAPI = new AppointmentBenfitAPI(data);

			AppointmentBenfitAPI.getAppointmentBenefitDetails(GlobalVariables.CreateUserName,
					GlobalVariables.CreateUserPwd);

			waitForElement(eleBenefitRemainingCount1);

			if (eleBenefitRemainingCount1.getText().replaceAll("\\s+", "")
					.equals((AppointmentBenfitAPI.AllottedCount.get(0) + "remaining").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the First Membership benfit Count As "
						+ eleBenefitRemainingCount1.getText());
			} else {
				failed(driver,
						"Failed To Validate The First Membership benfit Count Expected "
								+ (AppointmentBenfitAPI.AllottedCount.get(0) + "remaining") + "But Actual is"
								+ eleBenefitRemainingCount1.getText());
			}

			waitForElement(eleBenefitRemainingCount2);

			if (eleBenefitRemainingCount2.getText().replaceAll("\\s+", "")
					.equals((AppointmentBenfitAPI.AllottedCount.get(1) + "remaining").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Second Membership benfit Count As "
						+ eleBenefitRemainingCount2.getText());
			} else {
				failed(driver,
						"Failed To Validate The Second Membership benfit Count Expected "
								+ (AppointmentBenfitAPI.AllottedCount.get(1) + "remaining") + "But Actual is"
								+ eleBenefitRemainingCount2.getText());
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateAvailedMembershipBenfitCountForSelf() {

		try {

			ValidateDefaultSelectOptionForSelfInMembershipDetails();

			AppointmentBenfitAPI AppointmentBenfitAPI = new AppointmentBenfitAPI(data);

			AppointmentBenfitAPI.getAppointmentBenefitDetails(GlobalVariables.CreateUserName,
					GlobalVariables.CreateUserPwd);

			waitForElement(eleBenefitRemainingCount1);
			

			if (eleBenefitRemainingCount1.getText().replaceAll("\\s+", "")
					.equals((AppointmentBenfitAPI.RemainingCount.get(0) + "remaining").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the First Membership benfit Count As "
						+ eleBenefitRemainingCount1.getText());
			} else {
				failed(driver,
						"Failed To Validate The First Membership benfit Count Expected "
								+ (AppointmentBenfitAPI.RemainingCount.get(0) + "remaining") + "But Actual is"
								+ eleBenefitRemainingCount1.getText());
			}

			waitForElement(eleBenefitRemainingCount2);

			if (eleBenefitRemainingCount2.getText().replaceAll("\\s+", "")
					.equals((AppointmentBenfitAPI.RemainingCount.get(1) + "remaining").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Second Membership benfit Count As "
						+ eleBenefitRemainingCount2.getText());
			} else {
				failed(driver,
						"Failed To Validate The Second Membership benfit Count Expected "
								+ (AppointmentBenfitAPI.RemainingCount.get(1) + "remaining") + "But Actual is"
								+ eleBenefitRemainingCount2.getText());
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
	
	public void SelectChildInMembershipBenfitDropDown() {
	
		try {
			waitForElement(btnDropDown);

			clickOn(btnDropDown, "Membership benfit for dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				TapOnElement(eleBenefitName2, " Membership Benfits ");
			} else {
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(GlobalVariables.ChildName );

				waitForElement(btnDone);

				clickOn(btnDone, "Done Button");
				
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	
		
		
		
	}
	
	public void SelecSelfInMembershipBenfitsDropDown() {
		
		try {
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("iOS")) {
			clickOn(btnDropDown, "Membership benfit for dropdown");
			
			elePickerWheel.sendKeys(data.get("FirstName")+" "+data.get("LastName")+" (Self)");
			
			waitForElement(btnDone);

			clickOn(btnDone, "Done Button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
	public void ValidateAllottedMembershipBenefitCountForDependent() {

		try {
			ValidateDefaultSelectOptionForSelfInMembershipDetails();

			SelectChildInMembershipBenfitDropDown();

			DependentAppointmentBenefitAPI DependentAppointmentBenefitAPI = new DependentAppointmentBenefitAPI(data);

			DependentAppointmentBenefitAPI.getDependentDetails(GlobalVariables.CreateUserName,
					GlobalVariables.CreateUserPwd);

			for (int i = 0; i < DependentAppointmentBenefitAPI.DependentGuiID.size(); i++) {

				if (GlobalVariables.ChildName.replaceAll("\\s+", "")
						.equalsIgnoreCase((DependentAppointmentBenefitAPI.firstName.get(i)
								+ DependentAppointmentBenefitAPI.firstName.get(i)).replaceAll("\\s+", ""))) {

					GlobalVariables.childGuid = DependentAppointmentBenefitAPI.DependentGuiID.get(i);
				}

			}

			DependentAppointmentBenefitAPI.getDependentAppointmentBenefitDetails(GlobalVariables.CreateUserName,
					GlobalVariables.childGuid, GlobalVariables.CreateUserName, GlobalVariables.CreateUserPwd);

			waitForElement(eleBenefitRemainingCount1);

			if (eleBenefitRemainingCount1.getText().replaceAll("\\s+", "").equals(
					(DependentAppointmentBenefitAPI.AllottedCount.get(0) + "remaining").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the First Membership benfit Count As "
						+ eleBenefitRemainingCount1.getText());
			} else {
				failed(driver,
						"Failed To Validate The First Membership benfit Count Expected "
								+ (DependentAppointmentBenefitAPI.AllottedCount.get(0) + "remaining") + "But Actual is"
								+ eleBenefitRemainingCount1.getText());
			}

			waitForElement(eleBenefitRemainingCount2);

			if (eleBenefitRemainingCount2.getText().replaceAll("\\s+", "").equals(
					(DependentAppointmentBenefitAPI.AllottedCount.get(1) + "remaining").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Second Membership benfit Count As "
						+ eleBenefitRemainingCount2.getText());
			} else {
				failed(driver,
						"Failed To Validate The Second Membership benfit Count Expected "
								+ (DependentAppointmentBenefitAPI.AllottedCount.get(1) + "remaining") + "But Actual is"
								+ eleBenefitRemainingCount2.getText());
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateAvailedMembershipBenfitCountForDependent() {

		try {

		

			SelectChildInMembershipBenfitDropDown();
			
		

			DependentAppointmentBenefitAPI DependentAppointmentBenefitAPI = new DependentAppointmentBenefitAPI(data);

			DependentAppointmentBenefitAPI.getDependentDetails(GlobalVariables.CreateUserName,
					GlobalVariables.CreateUserPwd);

			for (int i = 0; i < DependentAppointmentBenefitAPI.DependentGuiID.size(); i++) {

				if (GlobalVariables.ChildName.replaceAll("\\s+", "")
						.equalsIgnoreCase((DependentAppointmentBenefitAPI.firstName.get(i)
								+ DependentAppointmentBenefitAPI.lastName.get(i)).replaceAll("\\s+", ""))) {

					GlobalVariables.childGuid = DependentAppointmentBenefitAPI.DependentGuiID.get(i);
					break;
				}

			}

			DependentAppointmentBenefitAPI.getDependentAppointmentBenefitDetails(GlobalVariables.CreateUserName,
					GlobalVariables.childGuid, GlobalVariables.CreateUserName, GlobalVariables.CreateUserPwd);

			waitForElement(eleBenefitRemainingCount1);

			if (eleBenefitRemainingCount1.getText().replaceAll("\\s+", "").equals(
					(DependentAppointmentBenefitAPI.RemainingCount.get(0) + "remaining").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the First Membership benfit Count As "
						+ eleBenefitRemainingCount1.getText());
			} else {
				failed(driver,
						"Failed To Validate The First Membership benfit Count Expected "
								+ (DependentAppointmentBenefitAPI.RemainingCount.get(0) + "remaining") + "But Actual is"
								+ eleBenefitRemainingCount1.getText());
			}

			waitForElement(eleBenefitRemainingCount2);

			if (eleBenefitRemainingCount2.getText().replaceAll("\\s+", "").equals(
					(DependentAppointmentBenefitAPI.RemainingCount.get(1) + "remaining").replaceAll("\\s+", ""))) {

				passed("Successfully Validated the Second Membership benfit Count As "
						+ eleBenefitRemainingCount2.getText());
			} else {
				failed(driver,
						"Failed To Validate The Second Membership benfit Count Expected "
								+ (DependentAppointmentBenefitAPI.RemainingCount.get(1) + "remaining") + "But Actual is"
								+ eleBenefitRemainingCount2.getText());
			}
			
			
			SelecSelfInMembershipBenfitsDropDown();

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
	

	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(eleMembershipDetails);

			if (isElementPresent(eleMembershipDetails)) {

				passed("User Successfully Navigated To Membership Details Page");
			} else {
				failed(driver, "User Failed To navigate To Membership Details Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
