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
public class EmailAddressPageTests  extends Common{

	public static int count = 1;
	private TestBase TestBase;
	private pages.LandingPage TreatLandingPage;
	private pages.SignInPage SignInPage;
	private pages.MyProfilePage MyProfilePage;
	private pages.DiscoverPage DiscoverPage;
	private pages.AppNavPage AppNavPage;
	private pages.EmailAddressPage EmailAddressPage;
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
	public void MOB_TC010_ValidateTheUpdateEmailAddressFlowAndFields(String deviceName, String platformName,String platFormVersion) {

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

			EmailAddressPage = MyProfilePage.clickOnEmailAddressButton();
			
			EmailAddressPage.clickOnEditButton();
			
			EmailAddressPage.ValidateUpdateEmptyEmailAddress();
			
			EmailAddressPage.ValidateUpdateInvalidEmailAddress();
			
			EmailAddressPage.EnterEmailAddressInEmailAddressPage();
			
			MyProfilePage=EmailAddressPage.clickOnUpdateEmailAddressButton();
			
			TreatLandingPage = MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();

		}

	}
	
	
	

}
