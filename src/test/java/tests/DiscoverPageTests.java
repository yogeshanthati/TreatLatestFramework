package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.BuyMembershipPage;
import pages.CreateProfilePage;
import pages.MembershipCongratulationsPage;

import utilities.Common;
import utilities.Data;
import utilities.YopMail;

public class DiscoverPageTests extends Common {

	public static int count = 1;
	private TestBase TestBase;
	private pages.LandingPage TreatLandingPage;
	private pages.SignInPage SignInPage;
	private pages.MyProfilePage MyProfilePage;
	private pages.AppNavPage AppNavPage;
	private pages.DiscoverPage DiscoverPage;
	private pages.CreateProfilePage CreateProfilePage;

	private BuyMembershipPage BuyMembershipPage;
	private MembershipCongratulationsPage MembershipCongratulationsPage;
	


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
	public void MOB_TC012_ValidateTheArticleContentInDiscoverPage(String deviceName, String platformName,
			String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.setUp(data);

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();

			SignInPage.EnterUserNameAndPassword();

			AppNavPage=SignInPage.clickOnSignInButton();	
				
			DiscoverPage = AppNavPage.clickOnDiscoverButton();
			
			DiscoverPage.ValidateLatestTravelArticleContentInDiscoverPage();

		    DiscoverPage.ValidateLatestHealthArticleContentInDiscoverPage();

		    DiscoverPage.ValidateLatestWellnessArticleContentInDiscoverPage();
		
			AppNavPage = DiscoverPage.returnAppNavPageInDiscover();

			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();

		}

	}

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC013_ValidateTheTravelArticleContentShareInDiscoverPage(String deviceName, String platformName,
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

			DiscoverPage = AppNavPage.clickOnDiscoverButton();

			DiscoverPage.validateTheTravelArticleShareFunctionality();

			AppNavPage = DiscoverPage.returnAppNavPageInDiscover();

			MyProfilePage=AppNavPage.clickOnMyAccountButton();

			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();

		}

	}

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC014_ValidateTheHealthArticleContentShareInDiscoverPage(String deviceName, String platformName,
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
		
			DiscoverPage = AppNavPage.clickOnDiscoverButton();

			DiscoverPage.ValidateTheHealthArticleShareFunctionality();

			AppNavPage = DiscoverPage.returnAppNavPageInDiscover();

			MyProfilePage=AppNavPage.clickOnMyAccountButton();

			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();

		}

	}


	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC015_ValidateTheWellnessArticleContentShareInDiscoverPage(String deviceName, String platformName,
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
		
			DiscoverPage = AppNavPage.clickOnDiscoverButton();

			DiscoverPage.ValidateTheWellnessArticleShareFunctionality();

			AppNavPage = DiscoverPage.returnAppNavPageInDiscover();

			MyProfilePage=AppNavPage.clickOnMyAccountButton();

			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();

		}

	}
	
	
	@Test 
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC021_ValidateTheArticleContentByLogInAsAGuest(String deviceName, String platformName,
			String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.setUp(data);

			AppNavPage = TreatLandingPage.clicOnContinueAsGuest();

			DiscoverPage = AppNavPage.clickOnDiscoverButton();
			
			DiscoverPage.ValidateBecomeAMemberCardForGuestUser();

			DiscoverPage.ValidateLatestTravelArticleContentInDiscoverPage();

			DiscoverPage.ValidateLatestHealthArticleContentInDiscoverPage();

			DiscoverPage.ValidateLatestWellnessArticleContentInDiscoverPage();

			TestBase.tearDown();

			datasetEnd();


		}

	}
	
	
	
	
	
	
	

}
