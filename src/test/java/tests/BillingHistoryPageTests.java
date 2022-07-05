package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.BillingHistoryPage;
import utilities.Common;
import utilities.Data;
import utilities.GlobalKeys;

public class BillingHistoryPageTests extends Common{
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
//	private pages.MembershipCongratulationsPage MembershipCongratulationsPage;
//	
//	private BillingHistoryPage BillingHistoryPage;
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
//	public void MOB_TC022_ValidateTheBillingHistoryDetailsForTheMembershipUsingCouponCode(String deviceName, String platformName,
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
//			CreateProfilePage.CreateAProfileInTreat();
//			
//			AppNavPage=CreateProfilePage.clickOnSkipForNow(); 
//			
//			MyProfilePage = AppNavPage.clickOnMyAccountButton();
//			
//		    BillingHistoryPage=MyProfilePage.clickOnBillingHistoryButton();
//			
//			BillingHistoryPage.ValidateBillingHistoryForNoMembershipPlan();
//			
//			MyProfilePage=BillingHistoryPage.NavigateBackFromBillingHistory();
//			
//			MembershipPlansPage = MyProfilePage.clickOnBecomeATreatMemberButton(); 
//			
//			MembershipPlansPage.ValidateDetailsInMembershipPlansPage();
//			
//			MembershipPlansPage.SwipeDownTillSelectMembershipPlan();
//
//			MembershipPlansPage.SelectPlanInMembershipPlans();
//
//			BuyMembershipPage = MembershipPlansPage.clickOnProceedButton();
//			
//			BuyMembershipPage.ValidateDetailsInBuyMembership();
//
//			BuyMembershipPage.EnterCouponCode();
//
//			BuyMembershipPage.clickOnApplyCoupon();
//
//			BuyMembershipPage.ValidateApplyCouponDetailsInBuyMembership();
//
//			MembershipCongratulationsPage = BuyMembershipPage.clickOnProceedButton();
//
//			MembershipCongratulationsPage.ValidateDetailsInMembershipCardUsingCouponCode();
//
//			AppNavPage = MembershipCongratulationsPage.clickOnDonebutton();  
//
//			MyProfilePage = AppNavPage.clickOnMyAccountButton();
//			 
//	        BillingHistoryPage=MyProfilePage.clickOnBillingHistoryButton();
//			
//			BillingHistoryPage.ValidateBillingHistoryForMembershipUsingCouponCode(); 
//			
//			BillingHistoryPage.ValidateInVoiceDetailsInBillingHistoryForCouponCode();
//			
//			BillingHistoryPage.NavigateBackFromInvoicePage(); 
//			
//			MyProfilePage=BillingHistoryPage.NavigateBackFromBillingHistory();
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
//	
//	@Test
//	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
//	public void MOB_TC023_ValidateTheBillingHistoryDetailsForTheMembershipUsingCard(String deviceName, String platformName,
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
//			CreateProfilePage.CreateAProfileInTreat();
//			
//			AppNavPage=CreateProfilePage.clickOnSkipForNow(); 
//
//			MyProfilePage = AppNavPage.clickOnMyAccountButton();
//			
//		    BillingHistoryPage=MyProfilePage.clickOnBillingHistoryButton();
//			
//			BillingHistoryPage.ValidateBillingHistoryForNoMembershipPlan();
//			
//			MyProfilePage=BillingHistoryPage.NavigateBackFromBillingHistory();
//			
//			MembershipPlansPage = MyProfilePage.clickOnBecomeATreatMemberButton(); 
//			
//			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();
//
//			MembershipPlansPage.SelectPlanInMembershipPlans();
//
//			BuyMembershipPage = MembershipPlansPage.clickOnProceedButton();
//			
//			BuyMembershipPage.ValidateDetailsInBuyMembership();
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
//	        BillingHistoryPage=MyProfilePage.clickOnBillingHistoryButton();
//			
//			BillingHistoryPage.ValidateBillingHistoryForUserWithMembershipPlanUsingCard(); 
//			
//			BillingHistoryPage.ValidateInVoiceDetailsInBillingHistoryForCardPayment();
//					
//			BillingHistoryPage.NavigateBackFromInvoicePage(); 
//			
//			MyProfilePage=BillingHistoryPage.NavigateBackFromBillingHistory();
//		
//            MembershipDetailsPage=MyProfilePage.clickOnMembershipDetailsButton();
//            	
//			MembershipDetailsPage.clickOnCancelButtonInMembershipDetailsPage();
//		
//			MembershipDetailsPage.clickOnCancelYesButtonInMembershipDetailsPage();
//			
//			MembershipDetailsPage.ValidateCancelSuccessMessage();
//			
//            MembershipDetailsPage.ValidateCancelButtonStatusAfterCancellingTheMembership();
//            
//            MembershipDetailsPage.ValidateMembershipEndsStatusForCancelInMembershipDetailsPage();
//			
//			MembershipDetailsPage.clickOnUpgradeButton();
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
//	        BillingHistoryPage=MyProfilePage.clickOnBillingHistoryButton();
//			
//			BillingHistoryPage.ValidateBillingHistoryForUserWithMembershipPlanUpgradeUsingCard(); 
//			
//            BillingHistoryPage.ValidateInVoiceDetailsInBillingHistoryForUpgradePlanCardPayment();
//			
//			BillingHistoryPage.NavigateBackFromInvoicePage(); 
//			
//			MyProfilePage=BillingHistoryPage.NavigateBackFromBillingHistory();
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
//	
}
