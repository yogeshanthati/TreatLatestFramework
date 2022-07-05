package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.*;
import utilities.Common;
import utilities.Data;
import utilities.GlobalKeys;

public class ChatCarePageTests extends Common {
//
	public static int count = 1;

	private TestBase TestBase;

	private pages.LandingPage TreatLandingPage;

	private pages.SignInPage SignInPage;

	private pages.MyProfilePage MyProfilePage;

	private pages.AppNavPage AppNavPage;

	private pages.CreateProfilePage CreateProfilePage;


	private pages.ChatCarePage ChatCarePage;

	private pages.BuyMembershipPage BuyMembershipPage;

	private pages.MembershipCongratulationsPage MembershipCongratulationsPage;

	private MembershipDetailsPage MembershipDetailsPage;

	private BecomeAMemberPage BecomeAMemberPage;
	private pages.ProfileDetailsPage ProfileDetailsPage;
	
	private ChatCare_PatientDetails ChatCare_PatientDetails;
	
	private MyChildrenPage MyChildrenPage;
	
	private DiscoverPage DiscoverPage;
	
	private MembershipBenefitsPage MembershipBenefitsPage;

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
	public void MOB_TC018_ValidateChatCarePermissionsForTheUserInTreatApp(String deviceName, String platformName,
			String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			    TreatLandingPage = TestBase.setUp(data);

			    SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();

			
		        MembershipBenefitsPage = SignInPage.clickOnBecomeAMemberButton();

		        BecomeAMemberPage=MembershipBenefitsPage.clickOnBecomeAMemberInMembershipBenefits();
				
				BecomeAMemberPage.EnterEmailAddressAndPasswordInBecomeAMemberPageToBecomeAMember();

	            BecomeAMemberPage.clickOnContinueButton();
				
				BecomeAMemberPage.EnterBecomeAMemberFields();
				
				BecomeAMemberPage.SelectUserAgreements();
				
				BecomeAMemberPage.clickOnContinue_DoneButton();
				
				BecomeAMemberPage.VerifyBecomeAMemberStatus();
				
				DiscoverPage=BecomeAMemberPage.clickOnExploreTreatButton();
				
				AppNavPage=DiscoverPage.ReturnAppNavPage();
			    
    			ChatCarePage = AppNavPage.clickOnChatCareButton();
			
			    ChatCarePage.ValidateChatCarePermissionsForMemberUser();
			
			    AppNavPage = ChatCarePage.NavigateBackToApplicationFrom98point6SDK();

			    MyProfilePage = AppNavPage.clickOnMyAccountButton();

			   TreatLandingPage = MyProfilePage.clickOnSignOutButton();

			   TestBase.tearDown();

			   datasetEnd();
		}
	}
	

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC037_ValidateChatCareLaunchPermissionsForDependentInTreatApp(String deviceName, String platformName,
			String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();

	        MembershipBenefitsPage = SignInPage.clickOnBecomeAMemberButton();

	        BecomeAMemberPage=MembershipBenefitsPage.clickOnBecomeAMemberInMembershipBenefits();
			
			BecomeAMemberPage.EnterEmailAddressAndPasswordInBecomeAMemberPageToBecomeAMember();

            BecomeAMemberPage.clickOnContinueButton();
			
			BecomeAMemberPage.EnterBecomeAMemberFields();
			
			BecomeAMemberPage.SelectUserAgreements();
			
			BecomeAMemberPage.clickOnContinue_DoneButton();
			
			BecomeAMemberPage.VerifyBecomeAMemberStatus();
			
			DiscoverPage=BecomeAMemberPage.clickOnExploreTreatButton();
			
			AppNavPage=DiscoverPage.ReturnAppNavPage();

			ChatCarePage = AppNavPage.clickOnChatCareButton();

			ChatCare_PatientDetails = ChatCarePage.SelectChildToAddInChatCare();

			ChatCare_PatientDetails.AddChildInChatCarePatientDetailsPage();

			ChatCarePage = ChatCare_PatientDetails.ValidateChareFirstTimeChildCreateText();

			ChatCarePage.ValidateChatCarePermissionForDependent();

			AppNavPage = ChatCarePage.NavigateBackToApplicationFrom98point6SDK();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			TreatLandingPage = MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}
	}
	


	
	
	
	
	
	


}
