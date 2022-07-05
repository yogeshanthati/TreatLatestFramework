package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.WelcomePage;
import utilities.Common;
import utilities.Data;
import utilities.GlobalKeys;

public class BecomeAMemberPageTests extends Common {
	
	
	public static int count = 1;
	private TestBase TestBase;
	private pages.LandingPage TreatLandingPage;
	private pages.SignInPage SignInPage;
	private pages.MyProfilePage MyProfilePage;
	private pages.AppNavPage AppNavPage;
	private pages.BecomeAMemberPage  BecomeAMemberPage;
	
	private pages.DiscoverPage DiscoverPage;
	
	private pages.WelcomePage WelcomePage;
	
	private pages.MembershipBenefitsPage MembershipBenefitsPage;
	
	
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
	public void MOB_TC002_BecomeAMemberInTreatApp(String deviceName, String platformName, String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.setUp(data);
			
			WelcomePage=TreatLandingPage.clickOnGetStartedButton();
			
			WelcomePage.ValidateTextFieldsInWelcomScreens();
			
			MembershipBenefitsPage=WelcomePage.clickOnBecomeMember();
			
			MembershipBenefitsPage.ValidateMembershipBenefitsTextInMembershipBenefitsPage();
			
			MembershipBenefitsPage.ValidateTheFAQInMembershipBenefitsPage();
			
			MembershipBenefitsPage.ValidateTheFAQAnswesInMembershipBenefitsPage();
			
			BecomeAMemberPage=MembershipBenefitsPage.clickOnBecomeAMemberInMembershipBenefits();
			
			BecomeAMemberPage.EnterEmailAddressAndPasswordInBecomeAMemberPageToBecomeAMember();
			
			BecomeAMemberPage.clickOnContinueButton();
			
			BecomeAMemberPage.EnterBecomeAMemberFields();
			
			BecomeAMemberPage.SelectUserAgreements();
			

		//	BecomeAMemberPage.validateNavigationToMandatoryAgreementCheckboxLinks();

			
			BecomeAMemberPage.clickOnContinue_DoneButton();
			
			BecomeAMemberPage.VerifyBecomeAMemberStatus();
			
			DiscoverPage=BecomeAMemberPage.clickOnExploreTreatButton();
			
			AppNavPage=DiscoverPage.returnAppNavPageInDiscover();
			
			AppNavPage.HandleAppTutorialButtons();
			
			AppNavPage=DiscoverPage.ReturnAppNavPage();
			
			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			TreatLandingPage = MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}
	}
	
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC003_ValidateTheFiledsInBecomeAMemberLandingPage(String deviceName, String platformName,
			String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.setUp(data);

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();

			MembershipBenefitsPage = SignInPage.clickOnBecomeAMemberButton();

			BecomeAMemberPage = MembershipBenefitsPage.clickOnBecomeAMemberInMembershipBenefits();

			BecomeAMemberPage.ValidatePasswordRegexAndMaskingInBecomeAMemberLandingPage();

			BecomeAMemberPage.ValidateUserLogInWithEmptyEmailAddressAndPassword();

			BecomeAMemberPage.ValidateUserLogInWithInvalidEmailAddressAndInvalidPassword();

			BecomeAMemberPage.ValidateUserLogInWithValidEmailAddressAndInvalidPassword();

			BecomeAMemberPage.ValidateUserLogInWithValidEmailAddressAndInvalidPassword();

			TestBase.tearDown();

			datasetEnd();
		}
	}
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC004_ValidateTheFieldsInBecomeAMemberPage(String deviceName, String platformName,
			String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.setUp(data);
			
			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();

			MembershipBenefitsPage = SignInPage.clickOnBecomeAMemberButton();

			BecomeAMemberPage = MembershipBenefitsPage.clickOnBecomeAMemberInMembershipBenefits();

			BecomeAMemberPage.EnterEmailAddressAndPasswordInBecomeAMemberPage();

			BecomeAMemberPage.clickOnContinueButton();

			BecomeAMemberPage.ValidateMandatoryFieldsInBecomeAMemberPage();

			BecomeAMemberPage.verifyInvalidInputsToFieldsInBecomeAMemberPage();

			BecomeAMemberPage.verifyAgreementsInBecomeAMemberPage();

			TestBase.tearDown();

			datasetEnd();

		}
	}


	

}
