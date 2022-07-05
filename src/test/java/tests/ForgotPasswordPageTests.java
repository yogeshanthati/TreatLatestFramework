package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.Common;
import utilities.Data;


@Listeners({ utilities.TestListener.class })
public class ForgotPasswordPageTests extends Common {

	public static int count = 1;
	private TestBase TestBase;
	private pages.LandingPage TreatLandingPage;
	private pages.SignInPage SignInPage;
	private pages.MyProfilePage MyProfilePage;
	private pages.AppNavPage AppNavPage;
	private pages.ForgotPasswordPage ForgotPasswordPage;
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
	public void MOB_TC006_ValidateTheForgetPasswordFlow(String deviceName, String platformName,
			String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.setUp(data);

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();

			ForgotPasswordPage = SignInPage.clickOnForgotPasswordButton();

			ForgotPasswordPage.ResetPasswordInForgetPasswordPage();

			SignInPage = ForgotPasswordPage.clickOnBackToLogInButton();

			AppNavPage = SignInPage.ValidateUserLogInWithUpdatedPassword();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			TreatLandingPage = MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();

		}
	}

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC007_ValidateTheFieldsInForgetPasswordFlow(String deviceName, String platformName,
			String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.setUp(data);

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();

			ForgotPasswordPage = SignInPage.clickOnForgotPasswordButton();
			
			ForgotPasswordPage.ValidateResetPasswordButtonInForgotPasswordPage();

			ForgotPasswordPage.validateEmailAddressFieldInForgotPasswordPage();
			
			ForgotPasswordPage.ValidateSetPasswordButtonAndResendEmailLinkInForgotPasswordPage();

			ForgotPasswordPage.validateVerificationCodeAndNewPasswordFields();

			TestBase.tearDown();
			
			datasetEnd();
		}

	}

	
}
