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
import utilities.GlobalKeys;

@Listeners({ utilities.TestListener.class })
public class SignInPageTests extends Common {
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
	public void MOB_TC001_LogIntoTreatAppWithValidCredentials(String deviceName, String platformName,
			String platFormVersion) {
		String strName = new Exception().getStackTrace()[0].getMethodName();
		data.setColIndex(strName);
		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.InstallApp(data);
				
			TreatLandingPage.ClickOnAppAskNotToTrackIniOS();
			
	//		TreatLandingPage = TestBase.setUp(data);
			
			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
			
			SignInPage.EnterUserNameAndPassword();

			AppNavPage = SignInPage.clickOnSignInButton();
			
			AppNavPage.HandleAppTutorialButtons();
			
			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			TreatLandingPage = MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}
	}

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC005_ValidateTheFieldsInLogInPage(String deviceName, String platformName, String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.setUp(data);
			
			TreatLandingPage.ValidateButtonTextfieldsInWelcomePage();

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
			
			SignInPage.ValidateLinkAndButtonTextfieldsInSignInPage();

			SignInPage.ValidatePasswordTextFieldMaskingInSignInPage();

			SignInPage.ValidateUserLogInWithEmptyUseAndPassword();

			SignInPage.ValidateUserLogInWithInvalidEmailAddressAndValidPassword();

			SignInPage.ValidateUserLogInWithUnregisterEmailAddressAndValidPassword();

			SignInPage.ValidateUserLogInWithValidEmailAndInValidPassword();

			TestBase.tearDown();

			datasetEnd();
		}
	}

}
