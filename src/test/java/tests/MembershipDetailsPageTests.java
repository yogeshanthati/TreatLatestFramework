package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.Common;
import utilities.Data;
import utilities.GlobalKeys;

public class MembershipDetailsPageTests extends Common {
//
//	public static int count = 1;
//	private TestBase TestBase;
//	private pages.LandingPage TreatLandingPage;
//	private pages.SignInPage SignInPage;
//	private pages.MyProfilePage MyProfilePage;
//	private pages.DiscoverPage DiscoverPage;
//	private pages.AppNavPage AppNavPage;
//	private pages.MembershipDetailsPage MembershipDetailsPage;
//
//	private pages.MembershipPlansPage MembershipPlansPage;
//
//	private pages.BuyMembershipPage BuyMembershipPage;
//
//	private pages.CreateProfilePage CreateProfilePage;
//
//	
//	private pages.MembershipCongratulationsPage MembershipCongratulationsPage;
//
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
//	@Test
//	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
//	public void MOB_TC019_ValidateTheUpgradeMembershipFlow(String deviceName, String platformName,
//			String platFormVersion) {
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
//			CreateProfilePage.CreateAProfileInTreat();
//			
//			MembershipPlansPage = CreateProfilePage.clickOnBecomeATreatMemberButton();
//			
//			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();
//
//			MembershipPlansPage.SelectPlanInMembershipPlans();
//
//			BuyMembershipPage = MembershipPlansPage.clickOnProceedButton();
//
//			BuyMembershipPage.clickOnIdontHaveCouponButton();
//
//			BuyMembershipPage.EnterValidCardDetailsInAddCreditCardPage();
//
//			BuyMembershipPage.clickOnAddCardButton();
//
//			BuyMembershipPage.ValidateAddingCardInAddCreditCardPage();
//
//			BuyMembershipPage.selectCardInAddCreditCardPage();
//
//			MembershipCongratulationsPage = BuyMembershipPage.clickOnMakePaymentButton();
//
//			MembershipCongratulationsPage.ValidateDetailsInMembershipCardUsingCardPayment();
//
//			AppNavPage = MembershipCongratulationsPage.clickOnDonebutton();
//
//			MyProfilePage = AppNavPage.clickOnMyAccountButton();
//
//			MyProfilePage.ValidateMemberLabelInMyprofilePage();
//
//			MembershipDetailsPage = MyProfilePage.clickOnMembershipDetailsButton();
//
//			MembershipDetailsPage.ValidateMembershipCardDetailsInMembershipDetailspage();
//
//			MembershipDetailsPage.clickOnUpgradeButton();
//
//			MembershipDetailsPage.ValidateActivePlanInUpgradePage();
//
//			MembershipDetailsPage.ValidatePlansInUpgradePlanPage();
//
//			MembershipDetailsPage.SelectPlanInUpgradePage();
//
//			BuyMembershipPage = MembershipDetailsPage.clickOnContinueToPayButton();
//
//			BuyMembershipPage.selectCardInAddCreditCardPage();
//
//			MembershipDetailsPage = BuyMembershipPage.clickOnMakePaymentButtonInUpGrade();
//
//			MembershipDetailsPage.ValidateUpgradeMembershipDetailsInMembershipDetailsPgae();
//			
//			MyProfilePage = MembershipDetailsPage.clickOnBackButton();
//
//			TreatLandingPage = MyProfilePage.clickOnSignOutButton();
//
//			TestBase.tearDown();
//
//			datasetEnd();
//		}
//
//	}
//	
//	@Test
//	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
//	public void MOB_TC020_ValidateTheCancelMembershipFlow(String deviceName, String platformName,
//			String platFormVersion) {
//		String strName = new Exception().getStackTrace()[0].getMethodName();
//
//		data.setColIndex(strName);
//
//		for (String dataset : datasets) {
//
//			data.setIndex(dataset);
//
//			TreatLandingPage = TestBase.setUp(data);
//
//			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
//
//			CreateProfilePage = SignInPage.clickOnCreateAccountButton();
//		
//			CreateProfilePage.CreateAProfileInTreat();
//
//			MembershipPlansPage = CreateProfilePage.clickOnBecomeATreatMemberButton(); 
//			
//			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();
//
//			MembershipPlansPage.SelectPlanInMembershipPlans();
//
//			BuyMembershipPage = MembershipPlansPage.clickOnProceedButton();
//
//		    BuyMembershipPage.clickOnIdontHaveCouponButton();
//		    
//		    BuyMembershipPage.EnterValidCardDetailsInAddCreditCardPage();
//			
//			BuyMembershipPage.clickOnAddCardButton();
//
//			BuyMembershipPage.ValidateAddingCardInAddCreditCardPage();
//
//			BuyMembershipPage.selectCardInAddCreditCardPage();
//
//			MembershipCongratulationsPage = BuyMembershipPage.clickOnMakePaymentButton();
//
//			MembershipCongratulationsPage.ValidateDetailsInMembershipCardUsingCardPayment();
//			
//			AppNavPage = MembershipCongratulationsPage.clickOnDonebutton();
//
//			MyProfilePage = AppNavPage.clickOnMyAccountButton();
//
//			MyProfilePage.ValidateMemberLabelInMyprofilePage();
//			
//			MembershipDetailsPage=MyProfilePage.clickOnMembershipDetailsButton();
//			
//			MembershipDetailsPage.CancelTheExistingMembershipInMembershipDetails();
//			
//			MyProfilePage =MembershipDetailsPage.clickOnBackButton();
//
//			TreatLandingPage = MyProfilePage.clickOnSignOutButton();
//
//			TestBase.tearDown();
//
//			datasetEnd();
//		}
//
//	}


}
