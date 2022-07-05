package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.BillingHistoryPage;
import pages.PaymentMethodsPage;
import utilities.Common;
import utilities.Data;
import utilities.GlobalKeys;

public class PaymentMethodsPageTests extends Common{
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
//	private pages.PaymentMethodsPage PaymentMethodsPage;
//
//	private pages.MembershipCongratulationsPage MembershipCongratulationsPage;
//	
//	private BillingHistoryPage BillingHistoryPage;
//	
//	private pages.CreateProfilePage CreateProfilePage;
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
//
//	@Test
//	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
//	public void MOB_TC024_ValidateThePaymentMethodsInMyProfile(String deviceName, String platformName,
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
//			CreateProfilePage=SignInPage.clickOnCreateAccountButton();
//			
//			CreateProfilePage.CreateAProfileInTreat();
//
//			AppNavPage=CreateProfilePage.clickOnSkipForNow();
//			
//			MyProfilePage=AppNavPage.clickOnMyAccountButton();
//			
//			PaymentMethodsPage=MyProfilePage.clickOnPaymentMethodsButton();
//			
//			PaymentMethodsPage.ValidateNoCardsAddedInPaymentMethods();
//			
//			PaymentMethodsPage.ValidateCreditCardFieldsInPaymentMethods();
//			
//			PaymentMethodsPage.clickOnAddCreditCardButton();
//			
//			PaymentMethodsPage.EnterValidCardDetailsInAddCreditCardPage();
//			
//			PaymentMethodsPage.clickOnAddCardButton();
//			
//			PaymentMethodsPage.ValidateAddCardSuccessMessage();
//			
//			PaymentMethodsPage.ValidateAddedCardDetailsInPaymentMethods();
//			
//            PaymentMethodsPage.clickOnAddCreditCardButton();
//			  		
//			PaymentMethodsPage.EnterValidCardDetailsForSecondCardInAddCreditCardPage();
//			
//			PaymentMethodsPage.clickOnAddCardButton();
//			
//			PaymentMethodsPage.ValidateAddCardSuccessMessage();
//			
//			PaymentMethodsPage.ValidateAddedCardDetailsInPaymentMethods();
//			
//			PaymentMethodsPage.ValidateAddedSecondCardDetailsInPaymentMethods();
//			
//			MyProfilePage=PaymentMethodsPage.NavigateBackToMyProfilePage();
//			
//			MembershipPlansPage=MyProfilePage.clickOnBecomeATreatMemberButton();
//			
//			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();
//				
//			MembershipPlansPage.SelectPlanInMembershipPlans();
//
//			BuyMembershipPage = MembershipPlansPage.clickOnProceedButton();
//
//		    BuyMembershipPage.clickOnIdontHaveCouponButton();
//		    
//		    BuyMembershipPage.ValidateAddingCardInAddCreditCardPage();
//		    
//		    BuyMembershipPage.clickOnBackButtonInBuyMembership();
//		    
//		    MembershipPlansPage =BuyMembershipPage.NavigateBackToMembershipPlans();
//		    
//		    MyProfilePage=MembershipPlansPage.clickOnNavigateBackInMembershipPlans();
//		    
//            MyProfilePage=AppNavPage.clickOnMyAccountButton();
//			
//			PaymentMethodsPage=MyProfilePage.clickOnPaymentMethodsButton();
//			
//			PaymentMethodsPage.DeleteAddedCardInPaymentMethods();
//			
//			PaymentMethodsPage.DeleteAddedCardInPaymentMethods();
//			
//			PaymentMethodsPage.ValidateNoCardsAddedInPaymentMethods();
//			
//			MyProfilePage=PaymentMethodsPage.NavigateBackToMyProfilePage();
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
