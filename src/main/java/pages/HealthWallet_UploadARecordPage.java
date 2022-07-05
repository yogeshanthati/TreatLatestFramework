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

public class HealthWallet_UploadARecordPage extends TestBase {

	protected HealthWallet_UploadARecordPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Upload a Record')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Upload Record']")
	private MobileElement lblHealthWallet_UploadARecord;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[contains(@resource-id,'id/upload_recycler_view')]//android.widget.ImageView[contains(@resource-id,'id/iv_record_image')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Upload Record']//following::XCUIElementTypeImage[@name='treatIconSmall']")
	private List<MobileElement> lstAddImgToUploadRecord;

	@AndroidFindBy(xpath = "(//android.widget.Spinner)[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Please fill the details below for your record.')]//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtRecordFor;

	@AndroidFindBy(xpath = "(//android.widget.ImageButton[contains(@resource-id,'id/text_input_end_icon')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown'][1]")
	private MobileElement btnDrpDownRecordFor;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement PickerWheel;

	@iOSXCUITFindBy(accessibility = "Done")
	private MobileElement btnDone;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_record_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private MobileElement txtTitleOftheRecord;

	@AndroidFindBy(xpath = "(//android.widget.Spinner)[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[3]")
	private MobileElement txtTypeOfRecord;

	@AndroidFindBy(xpath = "(//android.widget.ImageButton[contains(@resource-id,'id/text_input_end_icon')])[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='dropDown'])[2]")
	private MobileElement btnDrpDownTypeOfRecord;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_record_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='calendar']")
	private MobileElement eleDateOnRecord;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/upload')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Upload']")
	private MobileElement btnUpload;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/cancel')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
	private MobileElement btnCancel;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Upload using Camera')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Upload using Camera']")
	private MobileElement btnUploadUsingCamera;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Upload from Gallery')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Upload from Gallery']")
	private MobileElement btnUploadFromGallery;
	
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Allow' or @text='ALLOW']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Upload from Gallery']")
	private MobileElement btnAllowPermissionForGallery;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.ImageView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")
	private List<MobileElement> lstPicsInGallery;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Add']")
	private MobileElement iOSGalleryAdd;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
	private MobileElement iOSGalleryCancel;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Shutter button']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='PhotoCapture']")
	private MobileElement btnCameraShutter;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Done']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']") 
	private MobileElement btnCameraUsePhoto;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Start over']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")  
	private MobileElement btnCameraRetake;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/record_cancel')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='close']")
	private List<MobileElement> lstImgRecordCancel;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'android:id/button1')]")
	private MobileElement Android_Ok;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Allow')]")
	private MobileElement Android_Allow;
	
	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement btnNavigateBack;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please select an option.')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please select a person for the record.']")
	private MobileElement errEmptyRecordFor;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter a title for the record')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter a title for the record']")
	private MobileElement errEmptyTitleOfRecord;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please specify the type of record')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please specify the type of record']")
	private MobileElement errEmptyTypeOfRecord;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter the date on the record')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter the date on the record']")
	private MobileElement errEmptyDateOnRecord;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_description')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Upload atleast')]")
	private MobileElement errEmptyImages;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Allow' or @text='ALLOW']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Upload from Gallery']")
	private MobileElement btnAllowPermissionForCancelBooking;



	public void EnterUploadRecordDetailsInUploadARecord() {

		try {
			
			
			EnterTextFieldsInUploadARecordForSelf();
			
			ClickOnFirstAddImageInUploadARecord();

			takeScreenshot(driver);

			ClickOnUploadImageFromGallery();
			
//			clickOnAllowPermissionForUploadFromGallery();

			selectImageFromGallery();
			
	        ClickOnSecondAddImageInUploadARecord();
			
			ClickOnUploadImageFromGallery();

			selectImageFromGallery();

			Thread.sleep(5000);


		

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void EnterUploadRecordDetailsInUploadARecordForDependent() {

		try {
			
            EnterTextFieldsInUploadARecordForSelf();
			
			ClickOnFirstAddImageInUploadARecord();

			takeScreenshot(driver);

			ClickOnUploadImageFromGallery();
			
			clickOnAllowPermissionForUploadFromGallery();

			selectImageFromGallery();
			
	        ClickOnSecondAddImageInUploadARecord();
			
			ClickOnUploadImageFromGallery();

			selectImageFromGallery();

			Thread.sleep(5000);



		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterDateOnRecordinIOS(String date) {

		try {
			List<WebElement> PickerWheel = driver.findElements(By.xpath("//XCUIElementTypePickerWheel"));

			String DOBString = getDateFormatToString(date);

			String DOBArr[] = DOBString.split(" ");

			waitForElement(PickerWheel.get(0));

			if (isElementPresent(PickerWheel.get(0))) {

				PickerWheel.get(0).sendKeys(DOBArr[0]);

			}

			if (isElementPresent(PickerWheel.get(1))) {

				// enterText(PickerWheel.get(1), "PickerValue Element Month", DOBArr[1]);

				PickerWheel.get(1).sendKeys(DOBArr[1]);

			}

			if (isElementPresent(PickerWheel.get(2))) {

				// enterText(PickerWheel.get(2), "PickerValue Element Year", DOBArr[2]);

				PickerWheel.get(1).sendKeys(DOBArr[2]);

			}

			passed("Enter Date On Record As" + DOBString);

			waitForElement(btnDone);

			if (isElementPresent(btnDone)) {

				clickOn(btnDone, "Done button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ClickOnSecondAddImageInUploadARecord() {

		try {
			waitForElement(lstAddImgToUploadRecord.get(1));

			if (isElementPresent(lstAddImgToUploadRecord.get(1))) {

				clickOn(lstAddImgToUploadRecord.get(1), "Add Image button In Upload Record");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ClickOnFirstAddImageInUploadARecord() {

		try {
			waitForElement(lstAddImgToUploadRecord.get(0));
			
			if (isElementPresent(lstAddImgToUploadRecord.get(0))) {

				clickOn(lstAddImgToUploadRecord.get(0), "Add Image button In Upload Record");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
public void clickOnAllowPermissionForUploadFromGallery() {
		
		
		
		try {

			if (isElementPresent(btnAllowPermissionForCancelBooking)) {


				TapOnElement(btnAllowPermissionForCancelBooking, "Allow Permission For Gallery");
				
				ClickOnUploadImageFromGallery();
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}

	public void ValidateImageUploadInUploadARecord() {

		try {
			waitForElement(lstImgRecordCancel.get(0));

			if (isElementPresent(lstImgRecordCancel.get(0))) {

				passed("Successfully Validated the Uploaded Image in Upload a Record");
			} else {
				failed(driver, "Failed To Validate the Uploaded Image in Upload a Record");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public HealthWallet_HealthRecordsPage clickOnUploadButton() {

		try {

			takeScreenshot(driver);

			waitForElement(btnUpload);

			if (isElementPresent(btnUpload)) {

				clickOn(btnUpload, "Upload button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new HealthWallet_HealthRecordsPage(driver, data);

	}

	public HealthWalletPage clickOnCalcelButtonInUploadARecordPage() {

		try {
			waitForElement(btnCancel);

			if (isElementPresent(btnCancel)) {

				clickOn(btnCancel, "Cancel button");
				
				SwipeDown();
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new HealthWalletPage(driver, data);

	}

	public void TakeAnImageUsingCamera() {

		try {

			waitForElement(btnCameraShutter);

			if (isElementPresent(btnCameraShutter)) {

				clickOn(btnCameraShutter, "Camera shutter button");
			}
			waitForElement(btnCameraUsePhoto);
			
			if (isElementPresent(btnCameraUsePhoto)) {

				clickOn(btnCameraUsePhoto, " Camera Use photo button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ClickOnUploadImageFromGallery() {
		try {
			waitForElement(btnUploadFromGallery);

			if (isElementPresent(btnUploadFromGallery)) {

				clickOn(btnUploadFromGallery, "Upload from gallery button");
			}
			
			

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void clickOnAllowPermissionForGallery() {
		
		
		
		try {
			Thread.sleep(3000);

			if (isElementPresent(btnAllowPermissionForGallery)) {


				TapOnElement(btnAllowPermissionForGallery, "Allow Permission For Gallery");
				
				ClickOnUploadImageFromGallery();
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}

	public void ClickOnUploadImageUsingCamera() {
		try {
			waitForElement(btnUploadUsingCamera);

			if (isElementPresent(btnUploadUsingCamera)) {

				

				TapOnElement(btnUploadUsingCamera, "Upload Using Camera button");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	

	public void selectImageFromGallery() {

		try {

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				waitForElement(lstPicsInGallery.get(1));

				if (isElementPresent(lstPicsInGallery.get(1))) {

					clickOn(lstPicsInGallery.get(1), "gallery Image");
				}
			}

			else {

				Thread.sleep(2000);
				waitForElement(lstPicsInGallery.get(0));

				if (isElementPresent(lstPicsInGallery.get(0))) {

					clickOn(lstPicsInGallery.get(0), "gallery Image");
				}

				waitForElement(iOSGalleryAdd);

				if (isElementPresent(iOSGalleryAdd)) {

					clickOn(iOSGalleryAdd, "Gallery  Image Add button");
				}

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterTextFieldsInUploadARecordForSelf() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtRecordFor);
				if (isElementPresent(txtRecordFor)) {

					TapOnElement(btnDrpDownRecordFor, "Record For Dropdown");

					enterText(txtRecordFor, "Record For", GlobalVariables.FirstName + " " + GlobalVariables.LastName);

					TapOnElement(txtTitleOftheRecord, "Title of the Record");

				}

				GlobalVariables.UploadRecordTitle = Constants.TitleOfTheRecord + generateRandomNumber(3);

				waitForElement(txtTitleOftheRecord);

				if (isElementPresent(txtTitleOftheRecord)) {

					enterText(txtTitleOftheRecord, "Title of the Record Text box", GlobalVariables.UploadRecordTitle);
				}

				GlobalVariables.DateOnRecord = getTodayUploadRecordDate();

				waitForElement(eleDateOnRecord);

				if (isElementPresent(eleDateOnRecord)) {

					enterText(eleDateOnRecord, "Date of the Record", GlobalVariables.DateOnRecord);
				}

				takeScreenshot(driver);
			}

			else {

				// ios

				waitForElement(btnDrpDownRecordFor);

				if (isElementPresent(btnDrpDownRecordFor)) {

					TapOnElement(btnDrpDownRecordFor, "Record For Dropdown");

					PickerWheel.sendKeys(GlobalVariables.FirstName + " " + GlobalVariables.LastName + " " + "(Self)");
					waitForElement(btnDone);

					if (isElementPresent(btnDone)) {

						clickOn(btnDone, "Done button");

					}

				}

				GlobalVariables.UploadRecordTitle = Constants.TitleOfTheRecord + generateRandomNumber(3);

				waitForElement(txtTitleOftheRecord);

				if (isElementPresent(txtTitleOftheRecord)) {

					enterText(txtTitleOftheRecord, "Title of the Record Text box", GlobalVariables.UploadRecordTitle);
				}

				GlobalVariables.DateOnRecord = getTodayUploadRecordDate();

				clickOn(eleDateOnRecord, "Date on Record");

				EnterDateOnRecordinIOS(GlobalVariables.DateOnRecord);

				takeScreenshot(driver);

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	
	public void EnterTextFieldInUploadARecordForDependent() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtRecordFor);
				if (isElementPresent(txtRecordFor)) {
					
					

					TapOnElement(btnDrpDownRecordFor, "Record For Dropdown");

				//	enterText(txtRecordFor, "Record For",  GlobalVariables.ChildName);
					
				//	TapOnElement(txtTypeOfRecord, "Type  of the Record");
					

					TapByCoordinates(txtTypeOfRecord.getLocation().getX()+200, txtTypeOfRecord.getLocation().getY()-50,"Type of Record");

				

				}

				GlobalVariables.UploadRecordTitle = Constants.TitleOfTheRecord + generateRandomNumber(3);

				waitForElement(txtTitleOftheRecord);

				if (isElementPresent(txtTitleOftheRecord)) {

					enterText(txtTitleOftheRecord, "Title of the Record Text box", GlobalVariables.UploadRecordTitle);
				}

				GlobalVariables.DateOnRecord = getTodayUploadRecordDate();

				waitForElement(eleDateOnRecord);

				if (isElementPresent(eleDateOnRecord)) {

					enterText(eleDateOnRecord, "Date of the Record", GlobalVariables.DateOnRecord);
				}

				takeScreenshot(driver);
			}

			else {

				// ios

				waitForElement(btnDrpDownRecordFor);

				if (isElementPresent(btnDrpDownRecordFor)) {

					TapOnElement(btnDrpDownRecordFor, "Record For Dropdown");

					PickerWheel.sendKeys( GlobalVariables.ChildName);
					waitForElement(btnDone);

					if (isElementPresent(btnDone)) {

						clickOn(btnDone, "Done button");

					}

				}

				GlobalVariables.UploadRecordTitle = Constants.TitleOfTheRecord + generateRandomNumber(3);

				waitForElement(txtTitleOftheRecord);

				if (isElementPresent(txtTitleOftheRecord)) {

					enterText(txtTitleOftheRecord, "Title of the Record Text box", GlobalVariables.UploadRecordTitle);
				}

				GlobalVariables.DateOnRecord = getTodayUploadRecordDate();

				clickOn(eleDateOnRecord, "Date on Record");

				EnterDateOnRecordinIOS(GlobalVariables.DateOnRecord);

				takeScreenshot(driver);

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	
		
		
		
	}
	
	public void EnterTypeOfRecordInUploadRecord() {
		
		try {
			String[] TypeOfRecord= {"Prescription","Test Report","Vaccination"};
			
			
			switch (TypeOfRecord[new Random().nextInt(3)]) {

			case "Prescription":

				EnterTypeOfRecordAsPrescriptionInUploadRecord();

				break;

			case "Test Report":

				EnterTypeOfRecordAsTestReportInUploadRecord();
				break;

			case "Vaccination":
				
				EnterTypeOfRecordAsVaccinationInUploadRecord();
				break;

			default:

				info("Invalid option Record Type selected");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	
		
		
		
	}
	public void EnterTypeOfRecordAsPrescriptionInUploadRecord() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				TapOnElement(btnDrpDownTypeOfRecord, "Dropdown Type Of record");

				waitForElement(txtTypeOfRecord);

				if (isElementPresent(txtTypeOfRecord)) {

					enterText(txtTypeOfRecord, "Type of the Record Text box", Constants.RecordType_Insurance);
				}

				GlobalVariables.SelectTypeOfRecord = Constants.RecordType_Prescription;

				TapOnElement(eleDateOnRecord, "Date on record");

			} else {// ios

				waitForElement(btnDrpDownTypeOfRecord);

				if (isElementPresent(btnDrpDownTypeOfRecord)) {

					TapOnElement(btnDrpDownTypeOfRecord, "Record For Dropdown");

					PickerWheel.sendKeys(Constants.RecordType_Prescription);

					passed("Enter Text In Type of Record As" + Constants.RecordType_Prescription);

					waitForElement(btnDone);

					if (isElementPresent(btnDone)) {

						clickOn(btnDone, "Done button");
					}
					takeScreenshot(driver);

					GlobalVariables.SelectTypeOfRecord = Constants.RecordType_Prescription;
				}

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterTypeOfRecordAsInsuranceInUploadRecord() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				TapOnElement(btnDrpDownTypeOfRecord, "Dropdown Type Of record");

				waitForElement(txtTypeOfRecord);

				if (isElementPresent(txtTypeOfRecord)) {

					enterText(txtTypeOfRecord, "Type of the Record Text box", Constants.RecordType_Insurance);
				}

				GlobalVariables.SelectTypeOfRecord = Constants.RecordType_Insurance;

				TapOnElement(eleDateOnRecord, "Date on record");

			} else {// ios

				waitForElement(btnDrpDownTypeOfRecord);

				if (isElementPresent(btnDrpDownTypeOfRecord)) {

					TapOnElement(btnDrpDownTypeOfRecord, "Record For Dropdown");

					PickerWheel.sendKeys(Constants.RecordType_Insurance);

					passed("Enter Text In Type of Record As" + Constants.RecordType_Insurance);

					waitForElement(btnDone);

					if (isElementPresent(btnDone)) {

						clickOn(btnDone, "Done button");
					}
					takeScreenshot(driver);

					GlobalVariables.SelectTypeOfRecord = Constants.RecordType_Insurance;
				}

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	public void EnterTypeOfRecordAsVaccinationInUploadRecord() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
			
				TapOnElement(btnDrpDownTypeOfRecord, "Dropdown Type Of record");

				waitForElement(txtTypeOfRecord);

				if (isElementPresent(txtTypeOfRecord)) {

					enterText(txtTypeOfRecord, "Type of the Record Text box", Constants.RecordType_Vaccination);
				}

				GlobalVariables.SelectTypeOfRecord = Constants.RecordType_Vaccination;

				TapOnElement(eleDateOnRecord, "Date on record");

				

			} else {
				// ios
				waitForElement(btnDrpDownTypeOfRecord);

				if (isElementPresent(btnDrpDownTypeOfRecord)) {

					TapOnElement(btnDrpDownTypeOfRecord, "Record For Dropdown");

					PickerWheel.sendKeys(Constants.RecordType_Vaccination);

					passed("Enter Text In Type of Record As" + Constants.RecordType_Vaccination);

					waitForElement(btnDone);

					if (isElementPresent(btnDone)) {

						clickOn(btnDone, "Done button");
					}
					takeScreenshot(driver);

					GlobalVariables.SelectTypeOfRecord = Constants.RecordType_Vaccination;
				}


				
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void EnterTypeOfRecordAsTestReportInUploadRecord() {

		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				TapOnElement(btnDrpDownTypeOfRecord, "Dropdown Type Of record");

				waitForElement(txtTypeOfRecord);

				if (isElementPresent(txtTypeOfRecord)) {

					enterText(txtTypeOfRecord, "Type of the Record Text box", Constants.RecordType_TestReports);
				}

				GlobalVariables.SelectTypeOfRecord = Constants.RecordType_TestReports;

				TapOnElement(eleDateOnRecord, "Date on record");


			} else {

				// ios
				waitForElement(btnDrpDownTypeOfRecord);

				if (isElementPresent(btnDrpDownTypeOfRecord)) {

					TapOnElement(btnDrpDownTypeOfRecord, "Record For Dropdown");

					PickerWheel.sendKeys(Constants.RecordType_TestReports);

					passed("Enter Text In Type of Record As" + Constants.RecordType_TestReports);

					waitForElement(btnDone);

					if (isElementPresent(btnDone)) {

						clickOn(btnDone, "Done button");
					}
					takeScreenshot(driver);

					GlobalVariables.SelectTypeOfRecord = Constants.RecordType_TestReports;
				}

			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public AppNavPage clickOnNavigateBackButtonInUploadARecord() {

		try {
			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {
				clickOn(btnNavigateBack, "Navigate Back button");

			}
			
			Thread.sleep(4000);
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppNavPage(driver, data);
	}
	
	
	public void ValidateTextButtonsInHealthWalletPage()
	{
		ValidateElementTextInPage(btnUpload, Constants.HealthWalletPage_UploadButton_text, "HealthWalletPage", "UploadButton");
		
		ValidateElementTextInPage(btnCancel, Constants.HealthWalletPage_CancelButton_text, "HealthWalletPage", "CancelButton");
	}

	
	public void ValidateTheFieldsInUploadARecord() {

		try {
			waitForElement(btnUpload);

			if (isElementPresent(btnUpload)) {

				clickOn(btnUpload, "Upload button");
			}

			waitForElement(errEmptyRecordFor);

			if (isElementPresent(errEmptyRecordFor)) {

				passed("Successfully validated the  Record for Text field  Empty Error Message");
			} else {
				failed(driver, "Failed To Validate the  Record for Text field Empty Error Message");

			}

			waitForElement(errEmptyTitleOfRecord);

			if (isElementPresent(errEmptyTitleOfRecord)) {

				passed("Successfully validated the  Title of Record Text field Empty Error Message");
			} else {
				failed(driver, "Failed To Validate the  Title of Record Text field Empty Error Message");

			}

			waitForElement(errEmptyTypeOfRecord);

			if (isElementPresent(errEmptyTypeOfRecord)) {

				passed("Successfully validated the Type Of Record Text field Empty Error Message");
			} else {
				failed(driver, "Failed To Validate the  Type Of Record Text field Empty Error Message");

			}

			waitForElement(errEmptyDateOnRecord);

			if (isElementPresent(errEmptyDateOnRecord)) {

				passed("Successfully validated the Date on record Text field Empty Error Message");
			} else {
				failed(driver, "Failed To Validate the  Date on recordss Text field Empty Error Message");

			}

			takeScreenshot(driver);

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	public void ValidateEmptySelectImagesToUploadARecord() {

		try {
			EnterTextFieldsInUploadARecordForSelf();

			EnterTypeOfRecordAsPrescriptionInUploadRecord();

			waitForElement(btnUpload);

			if (isElementPresent(btnUpload)) {

				clickOn(btnUpload, "Upload button");
			}

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				if (errEmptyImages.getText().trim().replaceAll("\\s+", "")
						.equalsIgnoreCase(Constants.errorEmptyImageSelect.replaceAll("\\s+", ""))) {

					takeScreenshot(driver);

					passed("User successfully validated the Select at least one Image to proceed error message");
				} else {
					failed(driver, "Failed To validate  Select at least one Image to proceed error message Expected is"
							+ Constants.errorEmptyImageSelect);
				}

			} else {

				if (isElementPresent(errEmptyImages)) {

					passed("User successfully validated the Select at least one Image to proceed error message");

				} else {
					failed(driver, "Failed To validate  Select at least one Image to proceed error message");
				}

			}

			ClickOnFirstAddImageInUploadARecord();

			takeScreenshot(driver);

			ClickOnUploadImageFromGallery();

			selectImageFromGallery();
			
	        ClickOnSecondAddImageInUploadARecord();
			
			ClickOnUploadImageFromGallery();


			selectImageFromGallery();

			Thread.sleep(5000);

			CancelTheUploadedImagesInUploadARecord();

			waitForElement(btnUpload);

			if (isElementPresent(btnUpload)) {

				clickOn(btnUpload, "Upload button");
			}

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				if (errEmptyImages.getText().trim().replaceAll("\\s+", "")
						.equalsIgnoreCase(Constants.errorEmptyImageSelect.replaceAll("\\s+", ""))) {

					takeScreenshot(driver);

					passed("User successfully validated the Select at least one Image to proceed error message");
				} else {
					failed(driver, "Failed To validate  Select at least one Image to proceed error message Expected is"
							+ Constants.errorEmptyImageSelect);
				}

			} else {

				if (isElementPresent(errEmptyImages)) {

					passed("User successfully validated the Select at least one Image to proceed error message");

				} else {
					failed(driver, "Failed To validate  Select at least one Image to proceed error message");
				}

			}

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	public void CancelTheUploadedImagesInUploadARecord() {

		try {

			waitForElement(lstImgRecordCancel.get(0));

			lstImgRecordCancel.get(0).click();

			Thread.sleep(2000);

			lstImgRecordCancel.get(0).click();

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
//errorfields

	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(lblHealthWallet_UploadARecord);

			if (isElementPresent(lblHealthWallet_UploadARecord)) {

				passed("User Successfully Navigated To  Health Wallet Upload Record  Page");
			} else {
				failed(driver, "User Failed To navigate To HealthWallet Upload Record  Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
