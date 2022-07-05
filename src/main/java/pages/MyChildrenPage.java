package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.TestBase;
import groovy.lang.Newify;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Constants;
import utilities.Data;
import utilities.GlobalKeys;
import utilities.GlobalVariables;

public class MyChildrenPage extends TestBase {

	protected MyChildrenPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
		
	}

	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'My Children')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My Children']")
	private MobileElement lblMyChildren;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'My Children')]//following::android.view.ViewGroup/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My Children']//following::XCUIElementTypeButton")
	private List<MobileElement> btnlstMyChildren;
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_first_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[1]")
	private MobileElement txtFirstName;
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_last_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[2]")
	private MobileElement txtLastName;
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='calendar']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtDOB;
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_date')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='calendar']")
	private MobileElement imgCalender;
	
	
	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/edit_gender')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtGender;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/text_input_end_icon')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']")
	private MobileElement btndrpDownGender;
	
	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement btnBack;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_toggle_edit')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='EDIT']")
	private MobileElement btnEdit;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_toggle_edit')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	private MobileElement btnCancel;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_update_details')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Update Details']")
	private MobileElement btnUpdateDetails;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,':id/textinput_error')])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField//following-sibling:: XCUIElementTypeStaticText)[1]")
	private MobileElement errFirstName;
	
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,':id/textinput_error')])[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='warningDark'])[2]//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement errLastName;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_dependent_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My Children']//following::XCUIElementTypeButton")
	private MobileElement btnChildNameInMyChildren;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement PickerWheel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btnDone;
	
	
	
	
	public void ValidateChildNameInMyChildrenPage() {
		
		
		try {
			
			
			waitForElement(btnChildNameInMyChildren);
			
			if(btnChildNameInMyChildren.getText().replaceAll("\\s+", "").equals(GlobalVariables.ChildName.replaceAll("\\s+", ""))){
				
				passed("Successfully Validated Child Name in MyChildren  As"+btnChildNameInMyChildren.getText());
			}
			
			else {
				failed(driver,"Failed To Validate the Child Name in MyChildren Expected As"+GlobalVariables.ChildName+"But Actual is"+btnChildNameInMyChildren.getText());
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		
	}
	
	public void clickOnChildrenLinkInMyChildren() {
		
		try {
			waitForElement(btnChildNameInMyChildren);
			
			if(isElementPresent(btnChildNameInMyChildren)) {
				
				clickOn(btnChildNameInMyChildren, "Child Name button in MyChildren");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		
	}
	 
	public void ValidateChildDetailsInMyChildren() {
		
		try {
			waitForElement(txtFirstName);

			if (txtFirstName.getText().replaceAll("\\s+", "")
					.equals(GlobalVariables.FirstName.replaceAll("\\s+", ""))) {

				passed("Successfully Validated Child FirstName in MyChildren  As" + txtFirstName.getText());
			}

			else {
				failed(driver, "Failed To Validate the Child FirstName in MyChildren Expected As"
						+ GlobalVariables.FirstName + "But Actual is" + txtFirstName.getText());
			}

			waitForElement(txtLastName);

			if (txtLastName.getText().replaceAll("\\s+", "").equals(GlobalVariables.LastName.replaceAll("\\s+", ""))) {

				passed("Successfully Validated Child LastName in MyChildren  As" + txtLastName.getText());
			}

			else {
				failed(driver, "Failed To Validate the Child LastName in MyChildren Expected As"
						+ GlobalVariables.LastName + "But Actual is" + txtLastName.getText());
			}

			waitForElement(txtDOB);

			if (txtDOB.getText().trim().replaceAll("\\s+", "")
					.equals(GlobalVariables.DOB.trim().replaceAll("\\s+", ""))) {

				passed("Successfully Validated Child DOB in MyChildren  As" + txtDOB.getText());
			}

			else {
				failed(driver, "Failed To Validate the Child DOB in MyChildren Expected As" + GlobalVariables.DOB
						+ "But Actual is" + txtDOB.getText());
			}

			waitForElement(txtGender);

			if (txtGender.getText().trim().replaceAll("\\s+", "")
					.equals(GlobalVariables.GenderIdentity.trim().replaceAll("\\s+", ""))) {

				passed("Successfully Validated Child Gender in MyChildren  As" + txtGender.getText());
			}

			else {
				failed(driver, "Failed To Validate the Child Gender in MyChildren Expected As"
						+ GlobalVariables.GenderIdentity + "But Actual is" + txtGender.getText());
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		
		
	}
	
	public MyProfilePage clickOnBackInMyChildrenDetails() {
		try {
			waitForElement(btnBack);

			clickOn(btnBack, "Back button");

			waitForElement(btnBack);

			clickOn(btnBack, "Back button");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new MyProfilePage(driver, data);
	}
	
	
	
	
	public void UpdateDetailsInMyChildrenPage() {
		
		try {
			waitForElement(btnEdit);
			
			clickOn(btnEdit, "Edit button");
			
			
			waitForElement(txtFirstName);
			
			enterText(txtFirstName, "First Name", GlobalVariables.FirstName+Constants.ChildUpdate);
			
			
			waitForElement(txtLastName);
			
			enterText(txtLastName, "Last Name", GlobalVariables.LastName+Constants.ChildUpdate);
			
		
			waitForElement(txtGender);
			
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				UpdateGenderIdentityInAndroid();
			} else {
				UpdateGenderIdentityIniOS();
			}
			
			waitForElement(btnUpdateDetails);
		    
		    clickOn(btnUpdateDetails, "Update Details Button");
		    
		    
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		}
	
	public void UpdateGenderIdentityInAndroid() {

		try {
			waitForElement(txtGender);
			
			txtGender.sendKeys(Constants.ChildUpdateGender);
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	
	

	public void UpdateGenderIdentityIniOS() {

		try {
			waitForElement(btndrpDownGender);

			clickOn(btndrpDownGender, "Gender Identity");
			
		
			PickerWheel.sendKeys(Constants.ChildUpdateGender);

			
			waitForElement(btnDone);

			if (isElementPresent(btnDone)) {

				clickOn(btnDone, "Done button");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void ValidateUpdatedDetailsInMyChildrenPage() {
		try {
			
			UpdateDetailsInMyChildrenPage();
			
			
			
			waitForElement(txtFirstName);

			if (txtFirstName.getText().replaceAll("\\s+", "")
					.equals((GlobalVariables.FirstName+Constants.ChildUpdate).replaceAll("\\s+", ""))) {

				passed("Successfully Validated Updated Child FirstName in MyChildren  As" + txtFirstName.getText());
			}

			else {
				failed(driver, "Failed To Validate the Updated Child FirstName in MyChildren Expected As"
						+ GlobalVariables.FirstName+Constants.ChildUpdate + "But Actual is" + txtFirstName.getText());
			}

			waitForElement(txtLastName);

			if (txtLastName.getText().replaceAll("\\s+", "").equals((GlobalVariables.LastName+Constants.ChildUpdate).replaceAll("\\s+", ""))) {

				passed("Successfully Validated Updated Child LastName in MyChildren  As" + txtLastName.getText());
			}

			else {
				failed(driver, "Failed To Validate the Updated Child LastName in MyChildren Expected As"
						+ GlobalVariables.LastName+Constants.ChildUpdate + "But Actual is" + txtLastName.getText());
			}

			waitForElement(txtDOB);
			
			if(!txtDOB.isEnabled()) {
				passed("Successfully validated The  DOB Field is Non Editable In My children Page");
			}
			else {
				failed(driver,"Failed To validate  DOB Field is Non Editable In My children Page");
			}
			
			
			waitForElement(txtGender);

			if (txtGender.getText().trim().replaceAll("\\s+", "")
					.equals(Constants.ChildUpdateGender.trim().replaceAll("\\s+", ""))) {

				passed("Successfully Validated Updated Child Gender in MyChildren  As" + txtGender.getText());
			}

			else {
				failed(driver, "Failed To Validate Updated the Child Gender in MyChildren Expected As"
						+ Constants.ChildUpdateGender + "But Actual is" + txtGender.getText());
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	public void ValidateFieldsInMyChildren() {
		
		try {
			
			
            waitForElement(btnEdit);
			
			clickOn(btnEdit, "Edit button");
			
			
			waitForElement(txtFirstName);

			txtFirstName.clear();

			waitForElement(txtLastName);

			txtLastName.clear();

			waitForElement(btnUpdateDetails);

			clickOn(btnUpdateDetails, "Update Details Button");

			

				if (errFirstName.getText().trim().replaceAll("\\s+", "")
						.equalsIgnoreCase(Constants.ErrEmptyFirstName.trim().replaceAll("\\s+", ""))) {

					passed("Successfully Validated FirstName Empty Error Message in My Profile  As"
							+ errFirstName.getText());
				}

				else {
					failed(driver, "Failed To Validate FirstName Empty Error Message in My Profile Expected  As"
							+ Constants.ErrEmptyFirstName + "But Actual is" + errFirstName.getText());
				}

				if (errLastName.getText().trim().replaceAll("\\s+", "")
						.equalsIgnoreCase(Constants.ErrEmptyLastName.trim().replaceAll("\\s+", ""))) {

					passed("Successfully Validated LastName Empty Error Message in My Profile  As"
							+ errLastName.getText());
				}

				else {
					failed(driver, "Failed To Validate  LastName Empty Error Message in My Profile Expected  As"
							+ Constants.ErrEmptyLastName + "But Actual is" + errLastName.getText());
				}



			


		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	
	
	}
	
	
	
	
	
	
	
	

	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(lblMyChildren);

			if (isElementPresent(lblMyChildren)) {

				passed("User Successfully Navigated To MyChildren Page");
			} else {
				failed(driver, "User Failed To navigate To  MyChildren Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}

}
