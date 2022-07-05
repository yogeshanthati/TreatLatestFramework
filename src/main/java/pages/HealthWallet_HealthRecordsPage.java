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

public class HealthWallet_HealthRecordsPage extends TestBase {

	protected HealthWallet_HealthRecordsPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Health Records')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Health Records']")
	private MobileElement lblHealthWallet_HealthRecords;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Record Uploaded Successfully')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Record Uploaded Successfully']")
	private MobileElement msgSuccessRecordUploaded;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Record Updated Successfully')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Record Updated Successfully']")
	private MobileElement msgSuccessRecordUpdated;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Record Deleted Successfully')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Record Deleted Successfully']")
	private MobileElement msgSuccessRecordDeleted;

	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement DefaultDropdownSelect;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'All')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='All']")
	private MobileElement btnAllHealthRecordFilter;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Prescription')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Prescription']")
	private MobileElement btnPrescriptionHealthRecordFilter;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Insurance')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Insurance']")
	private MobileElement btnInsuranceHealthRecordFilter;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Test Report')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Test report']")
	private MobileElement btnTestReportHealthRecordFilter;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Vaccination')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Vaccination']")
	private MobileElement btnVaccinationHealthRecordFilter;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[contains(@resource-id,'id/rv_records_result')]/android.view.ViewGroup")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
	private MobileElement btnLatestAddedRecordsInHealthRecords;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_record_type')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Record Details']//following::XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeImage")
	private MobileElement eleRecordTypeImage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/record_type_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Record Details']//following::XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	private MobileElement eleRecordTypeName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/record_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Record Details']//following::XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
	private MobileElement eleRecordName;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Record Details']//following::XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeStaticText[4]")
	private MobileElement IOS_eleRecordForName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/record_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Record Details']//following::XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeStaticText[6]")
	private MobileElement eleDateOnRecord;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/record_image')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Record Details']//following::XCUIElementTypeOther/XCUIElementTypeImage")
	private List<MobileElement> eleRecordImages;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/bt_update')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Update Record']")
	private MobileElement btnUpdateRecord;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/bt_delete')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Delete Record']")
	private MobileElement btnDeleteRecord;

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement btnNavigateBack;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_negative')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DELETE']")
	private MobileElement btnDeleteRecordYES;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	private MobileElement btnDeleteRecordCANCEL;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_record_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private MobileElement txtTitleOftheRecordInUpdateRecord;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/update')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Update']")
	private MobileElement btnUpdateInUpdateRecord;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='All']")
	private MobileElement btnAll;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Insurance']")
	private MobileElement btnInsurance;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Prescription']")
	private MobileElement btnPrescription;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Test Report']")
	private MobileElement btnTestReport;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Vaccination']")
	private MobileElement btnVaccination;
	
	public void ValidateTextButtonsInHealthRecords()
	{
		ValidateElementTextInPage(btnAll, Constants.HealthWalletPage_AllButton_text, "HealthWalletPage", "AllButton");
		
		ValidateElementTextInPage(btnInsurance, Constants.HealthWalletPage_InsuranceButton_text, "HealthWalletPage", "InsuranceButton");
		
		ValidateElementTextInPage(btnPrescription, Constants.HealthWalletPage_PrescriptionButton_text, "HealthWalletPage", "PrescriptionButton");
		
		ValidateElementTextInPage(btnTestReport, Constants.HealthWalletPage_TestReportButton_text, "HealthWalletPage", "TestReportButton");
		
		ValidateElementTextInPage(btnVaccination, Constants.HealthwalletPage_VaccinationButton_text, "HealthWalletPage", "VaccinationButton");
	}

	public void clickOnLatestRecordInAllHealthRecordsFilter() {

		try {
			waitForElement(btnAllHealthRecordFilter);

			if (isElementPresent(btnAllHealthRecordFilter)) {

				clickOn(btnAllHealthRecordFilter, "All filter button In Health Records");
			}

			takeScreenshot(driver);
			waitForElement(btnLatestAddedRecordsInHealthRecords);

			if (isElementPresent(btnLatestAddedRecordsInHealthRecords)) {

				clickOn(btnLatestAddedRecordsInHealthRecords, "Latest Record In Health Records");
			}

			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnLatestRecordInPrescriptionHealthRecordsFilter() {
		try {
			waitForElement(btnPrescriptionHealthRecordFilter);

			if (isElementPresent(btnPrescriptionHealthRecordFilter)) {

				clickOn(btnPrescriptionHealthRecordFilter, "Prescription filter button In Health Records");
			}

			takeScreenshot(driver);

			waitForElement(btnLatestAddedRecordsInHealthRecords);

			if (isElementPresent(btnLatestAddedRecordsInHealthRecords)) {

				clickOn(btnLatestAddedRecordsInHealthRecords, "Latest Record In Health Records");
			}

			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
	
	
	public void clickOnLatestRecordInInsuranceHealthRecordsFilter() {
		try {
			waitForElement(btnInsuranceHealthRecordFilter);

			if (isElementPresent(btnInsuranceHealthRecordFilter)) {

				clickOn(btnInsuranceHealthRecordFilter, "Insurance filter button In Health Records");
			}

			takeScreenshot(driver);

			waitForElement(btnLatestAddedRecordsInHealthRecords);

			if (isElementPresent(btnLatestAddedRecordsInHealthRecords)) {

				clickOn(btnLatestAddedRecordsInHealthRecords, "Latest Record In Health Records");
			}

			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnLatestRecordInTestReportHealthRecordsFilter() {
		try {
			waitForElement(btnTestReportHealthRecordFilter);

			if (isElementPresent(btnTestReportHealthRecordFilter)) {

				clickOn(btnTestReportHealthRecordFilter, "TestReport filter button In Health Records");
			}

			waitForElement(btnLatestAddedRecordsInHealthRecords);

			if (isElementPresent(btnLatestAddedRecordsInHealthRecords)) {

				clickOn(btnLatestAddedRecordsInHealthRecords, "Latest Record In Health Records");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnLatestRecordInVaccinationHealthRecordsFilter() {
		try {
			waitForElement(btnVaccinationHealthRecordFilter);

			if (isElementPresent(btnVaccinationHealthRecordFilter)) {

				clickOn(btnVaccinationHealthRecordFilter, "Vaccination filter button In Health Records");
			}

			waitForElement(btnLatestAddedRecordsInHealthRecords);

			if (isElementPresent(btnLatestAddedRecordsInHealthRecords)) {

				clickOn(btnLatestAddedRecordsInHealthRecords, "Latest Record In Health Records");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	

	public void ValidateRecordDetailsInHealthRecords() {

		try {
			waitForElement(eleRecordTypeImage);

			takeScreenshot(driver);

			if (isElementPresent(eleRecordTypeImage)) {

				passed("User Successfully validated Record Type Image In Record Details");

			} else {
				failed(driver, "Failed To Validate Record Type Image In Record Details");
			}

			
			
			
			
			waitForElement(eleRecordTypeName);
			
			if (eleRecordTypeName.getText().trim().equals(GlobalVariables.SelectTypeOfRecord.trim())) {

				passed("User Successfully validated the RecordType Name As" + eleRecordTypeName.getText());

			}

			else {

				failed(driver, "User Failed To Validate the RecordType Name Expected As "
						+ GlobalVariables.SelectTypeOfRecord + "But Actual is " + eleRecordTypeName.getText());

			}

			waitForElement(eleRecordName);

			if (eleRecordName.getText().trim().equals(GlobalVariables.UploadRecordTitle.trim())) {

				passed("User Successfully validated the Record Name As" + eleRecordName.getText());

			}

			else {

				failed(driver, "User Failed To Validate the Record Name Expected As "
						+ GlobalVariables.UploadRecordTitle + "But Actual is " + eleRecordName.getText());
			}

			if (eleDateOnRecord.getText().trim().equals(GlobalVariables.DateOnRecord)) {

				passed("User Successfully validated the Date On Record As" + eleDateOnRecord.getText());

			}

			else {

				failed(driver, "User Failed To Validate the Date On Record Expected As " + GlobalVariables.DateOnRecord
						+ "But Actual is " + eleDateOnRecord.getText());
			}

			if (eleRecordImages.size() > 0) {

				passed("User Successfully validated  uploaded Record  Images In Record Details");

			} else {
				failed(driver, "Failed To Validate  Uploaded Record  Images In Record Details");
			}

			if (isElementPresent(btnUpdateRecord)) {

				passed("User Successfully validated Update Record button In Record Details");

			} else {
				failed(driver, "Failed To Validate Update Record button In Record Details");
			}

			if (isElementPresent(btnDeleteRecord)) {

				passed("User Successfully validated Delete Record button In Record Details");

			} else {
				failed(driver, "Failed To Validate Delete Record button In Record Details");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public AppNavPage clickOnNavigateBackButtonInHealthRecords() {

		try {
			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {
				clickOn(btnNavigateBack, "Navigate Back button");

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppNavPage(driver, data);
	}

	public void clickOnNavigateBackButtonInRecordDetails() {

		try {
			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {
				clickOn(btnNavigateBack, "Navigate Back button");

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void ValidateRecordDetailsInTypeOfRecordFilter() {

		try {
			switch (GlobalVariables.SelectTypeOfRecord) {
			
			
			case "Insurance":

				clickOnLatestRecordInInsuranceHealthRecordsFilter();

				ValidateRecordDetailsInHealthRecords();

				break;

			case "Prescription":

				clickOnLatestRecordInPrescriptionHealthRecordsFilter();

				ValidateRecordDetailsInHealthRecords();

				break;

			case "Test Report":

				clickOnLatestRecordInTestReportHealthRecordsFilter();

				ValidateRecordDetailsInHealthRecords();

				break;

			case "Vaccination":
				if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

					SwipeToViewVaccinationButtonInAndroid();
				}
				clickOnLatestRecordInVaccinationHealthRecordsFilter();

				ValidateRecordDetailsInHealthRecords();

				break;

			default:

				info("Invalid option Record Type selected");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateDefaultSelectOptionForSelfInHealthRecords() {

		try {
			waitForElement(DefaultDropdownSelect);

			takeScreenshot(driver);

			if (DefaultDropdownSelect.getText().trim().replaceAll("\\s+", "")
					.equals((GlobalVariables.FirstName + GlobalVariables.LastName + "(Self)").replaceAll("\\s+", ""))) {

				passed("User successfully validated HealthRecords Dropdown Default Select Option As"
						+ DefaultDropdownSelect.getText());
			} else {
				failed(driver,
						"User Failed To Validate HealthRecords Dropdown Default Select Option .Expected As"
								+ (GlobalVariables.FirstName + GlobalVariables.LastName + "(Self)").replaceAll("\\s+",
										"")
								+ "But Actual is" + DefaultDropdownSelect.getText().trim().replaceAll("\\s+", ""));
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void ValidateDefaultSelectOptionForDependentInHealthRecords() {

		try {
			waitForElement(DefaultDropdownSelect);

			takeScreenshot(driver);

			if (DefaultDropdownSelect.getText().trim().replaceAll("\\s+", "")
					.equals(GlobalVariables.ChildName.replaceAll("\\s+", ""))) {

				passed("User successfully validated HealthRecords Dropdown Default Select Option  As"
						+ DefaultDropdownSelect.getText());
			} else {
				failed(driver,
						"User Failed To Validate HealthRecords Dropdown Default Select Option .Expected As"
								+ (GlobalVariables.ChildName)
								+ "But Actual is" + DefaultDropdownSelect.getText().trim().replaceAll("\\s+", ""));
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUploadSuccessMessage() {
		try {
			waitForElement(msgSuccessRecordUploaded);

			if (isElementPresent(msgSuccessRecordUploaded)) {

				takeScreenshot(driver);

				passed("Successfully Validated record Upload Success Message");
			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void SwipeToViewVaccinationButtonInAndroid() {
		try {
			scrollByDimension(0.9, 0.2, 0.2, 0.2);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void ValidateUploadedRecordDetailsForSelf() {

		try {

			ValidateDefaultSelectOptionForSelfInHealthRecords();

			clickOnLatestRecordInAllHealthRecordsFilter();

			ValidateRecordDetailsInHealthRecords();

			clickOnNavigateBackButtonInRecordDetails();

			ValidateRecordDetailsInTypeOfRecordFilter();

			

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void ValidateUploadedRecordDetailsForDependent() {

		try {

	//		ValidateDefaultSelectOptionForDependentInHealthRecords();

			clickOnLatestRecordInAllHealthRecordsFilter();

			ValidateRecordDetailsInHealthRecords();

			clickOnNavigateBackButtonInRecordDetails();

			ValidateRecordDetailsInTypeOfRecordFilter();

			

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUpdatedRecordDetails() {

		try {
			clickOnUpdateRecordInRecordDetails();

			EnterUpdateRecordDetails();

			clickonUpdateInUpdateRecordPage();

			ValidateUpdatedRecordSuccessMessage();

			ValidateRecordDetailsInTypeOfRecordFilter();

			

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateDeleteRecordInRecordDetails() {
		try {
			waitForElement(btnDeleteRecord);

			if (isElementPresent(btnDeleteRecord)) {
				clickOn(btnDeleteRecord, "Delete Record");
			}

			waitForElement(btnDeleteRecordCANCEL);

			if (isElementPresent(btnDeleteRecordCANCEL)) {
				clickOn(btnDeleteRecordCANCEL, "Delete Record Cancel");
			}

			waitForElement(btnUpdateRecord);

			if (isElementPresent(btnUpdateRecord) && isElementPresent(btnDeleteRecord)) {
				passed("User Successfully Validated the Cancel button functionality for Delete Record InRecord details");
			} else {
				failed(driver,
						"User Failed To Validate the Cancel button Functionality for Delete Record InRecord details ");
			}

			if (isElementPresent(btnDeleteRecord)) {

				// clickOn(btnDeleteRecord, "Delete Record");

				TapOnElement(btnDeleteRecord, "Delete Record");
			}

			waitForElement(btnDeleteRecordYES);

			if (isElementPresent(btnDeleteRecordYES)) {
				// clickOn(btnDeleteRecordYES, "Delete Record YES");

				TapOnElement(btnDeleteRecordYES, "Delete Record YES");
			}

			waitForElement(msgSuccessRecordDeleted);

			if (isElementPresent(msgSuccessRecordDeleted)) {

				passed("Successfully Validated record Deleted Success Message");
			}

			ValidateNoRecordsInHealthRecords();
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateNoRecordsInHealthRecords() {
		try {
			waitForElement(btnAllHealthRecordFilter);

			if (isElementPresent(btnAllHealthRecordFilter)) {

				clickOn(btnAllHealthRecordFilter, "All filter button In Health Records");
			}

			if (!isElementPresent(btnLatestAddedRecordsInHealthRecords)) {
				passed("Sucessfully Validated No Records Available in Health Records");
			} else {
				failed(driver, "Failed To Validate No Records Available in Health Records");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnUpdateRecordInRecordDetails() {

		try {
			waitForElement(btnUpdateRecord);

			if (isElementPresent(btnUpdateRecord)) {

				clickOn(btnUpdateRecord, "Update Record button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterUpdateRecordDetails() {
		try {
			GlobalVariables.UploadRecordTitle = Constants.TitleOfTheRecord + generateRandomNumber(3);

			waitForElement(txtTitleOftheRecordInUpdateRecord);

			if (isElementPresent(txtTitleOftheRecordInUpdateRecord)) {

				enterText(txtTitleOftheRecordInUpdateRecord, "Title of the Record Text box",
						GlobalVariables.UploadRecordTitle);
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickonUpdateInUpdateRecordPage() {

		try {
			waitForElement(btnUpdateInUpdateRecord);

			if (isElementPresent(btnUpdateInUpdateRecord)) {

				clickOn(btnUpdateInUpdateRecord, "Update Record button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUpdatedRecordSuccessMessage() {
		try {
			waitForElement(msgSuccessRecordUpdated);

			if (isElementPresent(msgSuccessRecordUpdated)) {

				passed("User successfully validated the Record Update Sucess message");

			}

			ValidateRecordDetailsInTypeOfRecordFilter();
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(lblHealthWallet_HealthRecords);

			if (isElementPresent(lblHealthWallet_HealthRecords)) {

				passed("User Successfully Navigated To  Health Wallet Health Records Page");
			} else {
				failed(driver, "User Failed To navigate To HealthWallet Health Records Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
