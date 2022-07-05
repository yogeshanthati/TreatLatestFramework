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
public class CreateProfilePageTests  extends Common {
//
//	public static int count = 1;
//	private TestBase TestBase;
//	private pages.LandingPage TreatLandingPage;
//	private pages.SignInPage SignInPage;
//	private pages.MyProfilePage MyProfilePage;
//	private pages.AppNavPage AppNavPage;
//	private pages.CreateProfilePage CreateProfilePage;
//	public Data data;
//	public ArrayList<String> datasets;
//
//	@BeforeMethod
//	public void testStart(Method method) {
//		String name = method.getName();
//		data = new Data("TestData");
//		datasets = data.getDataSets(name);
//	}
//
//
//	@Test
//	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
//	public void MOB_TC002_CreateAnAccountInTreatApp(String deviceName, String platformName, String platFormVersion) {
//
//		String strName = new Exception().getStackTrace()[0].getMethodName();
//
//		data.setColIndex(strName);
//
//		for (String dataset : datasets) {
//
//			data.setIndex(dataset);
//
//			datasetStart(dataset);
//
//			TreatLandingPage = TestBase.setUp(data);
//
//			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
//
//			CreateProfilePage = SignInPage.clickOnCreateAccountButton();
//
//			CreateProfilePage.EnterEmailAddressAndPasswordInCreateProfile();
//
//			CreateProfilePage.clickOnContinueButton();
//
//			CreateProfilePage.EnterCreateAccountFields();
//
//			CreateProfilePage.SelectUserAgreements();
//
//			CreateProfilePage.validateNavigationToMandatoryAgreementCheckboxLinks();
//			
//			CreateProfilePage.clickOnContinue_DoneButton();
//
//			CreateProfilePage.VerifyRegistrationStatus();
//			
//			AppNavPage=CreateProfilePage.clickOnSkipForNow();
//			
//			MyProfilePage = AppNavPage.clickOnMyAccountButton();
//
//			TreatLandingPage = MyProfilePage.clickOnSignOutButton();
//
//			TestBase.tearDown();
//
//			datasetEnd();
//		}
//	}
//
//	
//	
//	@Test
//	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
//	public void MOB_TC003_ValidateTheFiledsInCreateProfileLandingPage(String deviceName, String platformName,
//			String platFormVersion) {
//
//		String strName = new Exception().getStackTrace()[0].getMethodName();
//
//		data.setColIndex(strName);
//
//		for (String dataset : datasets) {
//
//			data.setIndex(dataset);
//
//			datasetStart(dataset);
//
//			TreatLandingPage = TestBase.setUp(data);
//
//			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
//
//			CreateProfilePage = SignInPage.clickOnCreateAccountButton();
//
//			CreateProfilePage.ValidatePasswordRegexAndMaskingInCreateProfileLandingPage();
//
//			CreateProfilePage.ValidateUserLogInWithEmptyEmailAddressAndPassword();
//
//			CreateProfilePage.ValidateUserLogInWithInvalidEmailAddressAndInvalidPassword();
//
//			CreateProfilePage.ValidateUserLogInWithValidEmailAddressAndInvalidPassword();
//
//			CreateProfilePage.ValidateUserLogInWithValidEmailAddressAndInvalidPassword();
//
//			TestBase.tearDown();
//
//			datasetEnd();
//		}
//	}
//	@Test
//	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
//	public void MOB_TC004_ValidateTheFieldsInCreateProfilePage(String deviceName, String platformName,
//			String platFormVersion) {
//
//		String strName = new Exception().getStackTrace()[0].getMethodName();
//
//		data.setColIndex(strName);
//
//		for (String dataset : datasets) {
//
//			data.setIndex(dataset);
//
//			datasetStart(dataset);
//
//			TreatLandingPage = TestBase.setUp(data);
//			
//			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
//
//			CreateProfilePage = SignInPage.clickOnCreateAccountButton();
//
//			CreateProfilePage.EnterEmailAddressAndPasswordInCreateProfile();
//
//			CreateProfilePage.clickOnContinueButton();
//
//		   CreateProfilePage.ValidateMandatoryFieldsInCreateProfilePage();
//
//			CreateProfilePage.verifyInvalidInputsToFieldsInCreateProfilePage();
//
//			CreateProfilePage.verifyAgreementsInCreateProfilePage();
//
//			TestBase.tearDown();
//
//			datasetEnd();
//
//		}
//	}
//
//	
//
//	
}
