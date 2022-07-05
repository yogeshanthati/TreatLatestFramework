package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.Common;
import utilities.Data;

public class UpdatePasswordPageTests extends Common {

	public static int count = 1;
	private TestBase TestBase;
	private pages.LandingPage TreatLandingPage;
	private pages.SignInPage SignInPage;
	private pages.MyProfilePage MyProfilePage;
	private pages.DiscoverPage DiscoverPage;
	private pages.AppNavPage AppNavPage;
	private pages.CreateProfilePage CreateProfilePage;
	private pages.ForgotPasswordPage ForgotPasswordPage;
	private pages.UpdatePasswordPage UpdatePasswordPage;
	private pages.EmailAddressPage EmailAddressPage;
	private pages.ProfileDetailsPage ProfileDetailsPage;

	public Data data;
	public ArrayList<String> datasets;

	@BeforeMethod
	public void testStart(Method method) {
		String name = method.getName();
		data = new Data("TestData");
		datasets = data.getDataSets(name);
	}

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC008_ValidateTheUpdatePasswordFlow(String deviceName, String platformName,
			String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.setUp(data);

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();

			SignInPage.EnterUserNameAndPassword();

			AppNavPage = SignInPage.clickOnSignInButton();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			UpdatePasswordPage = MyProfilePage.clickOnUpdatePasswordButton();

			UpdatePasswordPage.EnterCurrentPassword();

			UpdatePasswordPage.EnterNewPassword();

			MyProfilePage = UpdatePasswordPage.clickOnUpdatePassswordButton();

			TreatLandingPage = MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();

		}

	}

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC009_ValidateTheFieldsInUpdatePasswordFlow(String deviceName, String platformName,
			String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.setUp(data);

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();

			SignInPage.EnterUserNameAndPassword();

			AppNavPage = SignInPage.clickOnSignInButton();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			UpdatePasswordPage = MyProfilePage.clickOnUpdatePasswordButton();

			UpdatePasswordPage.validateUserUpdateEmptyCurrentPasswordAndEmptyNewPassword();

			UpdatePasswordPage.ValidateUserUpdateIncorrectCurrentPasswordAndValidNewPassword();

			UpdatePasswordPage.ValidateUserUpdateValidCurrentPasswordAndInValidNewPassword();

			UpdatePasswordPage.ValidateUserUpdateInValidCurrentPasswordAndValidNewPassword();

			MyProfilePage = UpdatePasswordPage.clickOnBackButton();

			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();

		}

	}

}
