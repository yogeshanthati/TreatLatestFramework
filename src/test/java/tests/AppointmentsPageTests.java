package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.*;
import utilities.Common;
import utilities.Constants;
import utilities.Data;
import utilities.GlobalKeys;

public class AppointmentsPageTests extends Common {
//	
	public static int count = 1;
	private TestBase TestBase;
	private pages.LandingPage TreatLandingPage;
	private pages.SignInPage SignInPage;
	private pages.MyProfilePage MyProfilePage;
	private pages.DiscoverPage DiscoverPage;
	private pages.AppNavPage AppNavPage;
	private pages.MembershipDetailsPage MembershipDetailsPage;
	private pages.CreateProfilePage CreateProfilePage;
	private pages.AppointmentsPage AppointmentsPage;
	private MembershipCongratulationsPage MembershipCongratulationsPage;

	private Appointments_HealthServicesPage Appointments_HealthServicesPage;
	private Appointments_BookingDetailsPage Appointments_BookingDetailsPage;
	private Appointments_WellnessServicesPage Appointments_WellnessServicesPage;
	
	private HealthService_AddChildDetailsPage HealthService_AddChildDetailsPage;
	
	private Appointments_SelectAppointmentForPage Appointments_SelectAppointmentForPage;
	
	private AppointmentHistory_HealthServiceAppointments AppointmentHistory_HealthServiceAppointments;
	
	private MembershipBenefitsPage MembershipBenefitsPage;
	
	private BecomeAMemberPage BecomeAMemberPage;
	
	private ChatCare_PatientDetails ChatCare_PatientDetails;
	
	private AppointmentHistoryPage AppointmentHistoryPage;
	

	
	private AppointmentHistory_WellnessServiceAppointments AppointmentHistory_WellnessServiceAppointments;
	

	
	

	private pages.ChatCarePage ChatCarePage;
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
	public void MOB_TC028_ValidateTheAppointmentsFunctionalityForGuestUserInTreatApp(String deviceName,
			String platformName, String platFormVersion) {
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

			AppNavPage = TreatLandingPage.clicOnContinueAsGuest();

			AppointmentsPage = AppNavPage.clickOnBookingsButton();

			AppointmentsPage.ValidateFieldsInAppointmentsPageForGuestUser();

			SignInPage = AppointmentsPage.clickOnLogInButton();

			AppointmentsPage = SignInPage.ClickOnNavigateBackToAppointments();

			AppointmentsPage.ValidateCreateAppointmentsForGuestUser();

			TestBase.tearDown();

			datasetEnd();
		}

	}

	
	
	

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC029_ValidateCreatingAHealthServicesAppointmentForMemberUser(String deviceName,
			String platformName, String platFormVersion) {
		
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

			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateIVTheraphyAvailabilityText();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceAppointment(Constants.Self);
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
			
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.ValidateLatestUpcomingAppointments();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
		
            AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceSecondAppointment(Constants.Self);
			
	        Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
			
        	AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.ValidateSecondUpcomingAppointmentForHealth();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForSecondUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
            AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceThirdAppointment(Constants.Self);
			
	        Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
			
        	AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.ValidateThirdUpcomingAppointmentForHealth();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForThirdUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	

	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC031_ValidateRescheduleAndCancelOfAHealthServiceAppointmentForAnUser(String deviceName,
			String platformName, String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
			
     //       SignInPage.EnterUserNameAndPassword();
	        
	//        AppNavPage=SignInPage.clickOnSignInButton();

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

			AppointmentsPage = AppNavPage.clickOnBookingsButton();

			AppointmentsPage.clickOnHealthServicesButton();

			Appointments_HealthServicesPage = AppointmentsPage.SelectWellnessCenterLocationForHealthServices();

			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();

			Appointments_HealthServicesPage.ValidateCreateAHealthServiceAppointment(Constants.Self);

			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();

			Appointments_HealthServicesPage.clickOnConfirmBookingButton();

			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();

			AppointmentsPage = Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();

			AppointmentsPage.clickOnUpcomingHealthServiceButton();

			AppointmentsPage.ValidateLatestUpcomingAppointments();

			Appointments_BookingDetailsPage = AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();

			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();

			Appointments_BookingDetailsPage.RescheduleAppointmentInBookingDetails();

			AppointmentsPage = Appointments_BookingDetailsPage.clickOnDoneInBookingUpdated();

			Appointments_BookingDetailsPage = AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();

			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();

			AppointmentsPage = Appointments_BookingDetailsPage.CancelAppointmentInBookingDetails();

			AppointmentsPage.ValidateCancelHealthAppointmentInUpcomingAppointmentsPage();

			AppNavPage = AppointmentsPage.NavigateToAppNavPage();

			AppointmentsPage = AppNavPage.clickOnBookingsButton();

			AppointmentsPage.clickOnHealthServicesButton();

			Appointments_HealthServicesPage = AppointmentsPage.SelectWellnessCenterLocationForHealthServices();

			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();

			Appointments_HealthServicesPage.ValidateCreateAHealthServiceAppointment(Constants.Self);

			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();


			Appointments_HealthServicesPage.clickOnConfirmBookingButton();

			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();

			AppointmentsPage = Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();

			AppointmentsPage.clickOnUpcomingHealthServiceButton();

			AppointmentsPage.ValidateLatestUpcomingAppointments();

			Appointments_BookingDetailsPage = AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();

			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();

			Appointments_BookingDetailsPage.RescheduleAppointmentInBookingDetails();

			AppointmentsPage = Appointments_BookingDetailsPage.clickOnDoneInBookingUpdated();

			Appointments_BookingDetailsPage = AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();

			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();

			AppointmentsPage = Appointments_BookingDetailsPage.CancelAppointmentInBookingDetails();

			AppointmentsPage.ValidateCancelHealthAppointmentInUpcomingAppointmentsPage();

			AppNavPage = AppointmentsPage.NavigateToAppNavPage();

			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC032_ValidateTheFieldsInHealthServiceAppointmentsFlow(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
	        
	        SignInPage.EnterUserNameAndPassword();
	        
	        AppNavPage=SignInPage.clickOnSignInButton();
	        		   	       
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectTravellingDateErrorMessageInHealthServices();
			
			Appointments_HealthServicesPage.SelectTravellingDateAsCurrentDate();
			
			Appointments_HealthServicesPage.clickOnProceedButton();
			
			Appointments_HealthServicesPage.ValidateSelectHealthServiceErrorMessageInHealthServices();
			
			Appointments_HealthServicesPage.clickOnBackButtonInHealthServices();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceThirdAppointment(Constants.Self);

			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
		
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateSelectReasonForCancelErrorMessageForHealthServices();
			
			Appointments_BookingDetailsPage.clickOnNavBackButtonInCancelBooking();
			
			AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetails();
			
            AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	


	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC033_ValidateCreatingAWellnessServicesAppointmentForAMemberAndNonMemberUser(String deviceName,
			String platformName, String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

		   SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
			
//		   	SignInPage.EnterUserNameAndPassword();
//	        
//	        AppNavPage=SignInPage.clickOnSignInButton();
	 

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


			AppointmentsPage = AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnWellnessServicesButton();

			Appointments_WellnessServicesPage = AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();

			Appointments_WellnessServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_WellnessServicesPage.ValidateCreateAWellnessServiceAppointmentMemberForSelf();

			Appointments_WellnessServicesPage.ValidateReviewYourAppointmentDetails();

			Appointments_WellnessServicesPage.clickOnConfirmBookingButton();

			Appointments_WellnessServicesPage.ValidateBookingConfirmedDetails();

			AppointmentsPage = Appointments_WellnessServicesPage.clickOnDoneInBookingConfirmed();

			AppointmentsPage.clickOnUpcomingWellnessServiceButton();

			AppointmentsPage.ValidateLatestUpcomingAppointments();

			Appointments_BookingDetailsPage = AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();

			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();

			AppNavPage = Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC034_ValidateCancelOfAWellnessServiceAppointmentForAnUser(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
	       	    
//	        SignInPage.EnterUserNameAndPassword();
//	        
//	        AppNavPage=SignInPage.clickOnSignInButton();
	 
	    	MembershipBenefitsPage = SignInPage.clickOnBecomeAMemberButton();

			BecomeAMemberPage = MembershipBenefitsPage.clickOnBecomeAMemberInMembershipBenefits();

			BecomeAMemberPage.EnterEmailAddressAndPasswordInBecomeAMemberPageToBecomeAMember();

			BecomeAMemberPage.clickOnContinueButton();

			BecomeAMemberPage.EnterBecomeAMemberFields();

			BecomeAMemberPage.SelectUserAgreements();

			BecomeAMemberPage.clickOnContinue_DoneButton();

			BecomeAMemberPage.VerifyBecomeAMemberStatus();

			DiscoverPage = BecomeAMemberPage.clickOnExploreTreatButton();

			AppNavPage = DiscoverPage.ReturnAppNavPage();

            AppointmentsPage=AppNavPage.clickOnBookingsButton();

		    AppointmentsPage.clickOnWellnessServicesButton();
			
			Appointments_WellnessServicesPage=AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();
			
			Appointments_WellnessServicesPage.ValidateSelectedWellnessCenterLocation();
		
			Appointments_WellnessServicesPage.ValidateWellnessServiceEligibilityText();

			Appointments_WellnessServicesPage.ValidateCreateAWellnessServiceAppointmentNonMemberForSelf();

			Appointments_WellnessServicesPage.ValidateReviewYourAppointmentDetails();

			Appointments_WellnessServicesPage.clickOnConfirmBookingButton();

			Appointments_WellnessServicesPage.ValidateBookingConfirmedDetails();

			AppointmentsPage = Appointments_WellnessServicesPage.clickOnDoneInBookingConfirmed();

			AppointmentsPage.clickOnUpcomingWellnessServiceButton();

			AppointmentsPage.ValidateLatestUpcomingAppointments();

			Appointments_BookingDetailsPage = AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();

			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetailsForWellnessService();
						
			AppointmentsPage.ValidateCancelWellnessAppointmentInUpcomingAppointmentsPage();
			
			AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC035_ValidateTheFieldsInWellnessServiceAppointmentsFlow(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
	        
	        SignInPage.EnterUserNameAndPassword();
	        
	        AppNavPage=SignInPage.clickOnSignInButton();
	        		   	       
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
		
			AppointmentsPage.clickOnWellnessServicesButton();
			
			Appointments_WellnessServicesPage=AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();
			
			Appointments_WellnessServicesPage.ValidateSelectTravellingDateErrorMessageInWellSenessServices();
			
			Appointments_WellnessServicesPage.ValidateCreateAWellnessServiceAppointmentNonMemberForSelf();
			
			Appointments_WellnessServicesPage.clickOnConfirmBookingButton();
			
			AppointmentsPage = Appointments_WellnessServicesPage.clickOnDoneInBookingConfirmed();

			AppointmentsPage.clickOnUpcomingWellnessServiceButton();

			Appointments_BookingDetailsPage = AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateSelectReasonForCancelErrorMessageForWellnessServices();
			
			Appointments_BookingDetailsPage.clickOnNavBackButtonInCancelBooking();
			
			AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetailsForWellnessService();
			
            AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}


	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC038_ValidateCreatingAHealthServicesAppointmentForADependent(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);	
			
	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();

       	    
//	        SignInPage.EnterUserNameAndPassword();
//	        
//	        AppNavPage=SignInPage.clickOnSignInButton();
//	 
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


			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateIVTheraphyAvailabilityText();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			

			Appointments_HealthServicesPage.ValidateCreateAHealthServiceAppointmentForNewChild();
			
			Appointments_SelectAppointmentForPage=Appointments_HealthServicesPage.returnAppointmentSelectAppointmentForPage();
			    

			HealthService_AddChildDetailsPage=Appointments_SelectAppointmentForPage.SelectChildToCreate();
			
			Appointments_HealthServicesPage=HealthService_AddChildDetailsPage.AddChildInHealthServiceAppointmentPage();
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();

			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
		
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.ValidateLatestUpcomingAppointments();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
            AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceSecondAppointment(Constants.Child);
			
            Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();

            Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
			
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.ValidateSecondUpcomingAppointmentForHealth();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForSecondUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
            AppNavPage=MyProfilePage.NavigateToAppNavPage();

            AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceThirdAppointment(Constants.Child);
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
								
	        Appointments_HealthServicesPage.clickOnConfirmBookingButton();
				
	        Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
				
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.ValidateThirdUpcomingAppointmentForHealth();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForThirdUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC039_ValidateReschduleAndCancelOfAHealthServicesAppointmentForADependent(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);	
			
	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
	        
//          SignInPage.EnterUserNameAndPassword();
//	        
//	        AppNavPage=SignInPage.clickOnSignInButton();
	        

	        MembershipBenefitsPage = SignInPage.clickOnBecomeAMemberButton();
	        
	        BecomeAMemberPage = MembershipBenefitsPage.clickOnBecomeAMemberInMembershipBenefits();
			
			BecomeAMemberPage.EnterEmailAddressAndPasswordInBecomeAMemberPageToBecomeAMember();
			
			BecomeAMemberPage.clickOnContinueButton();
			
			BecomeAMemberPage.EnterBecomeAMemberFields();
			
			BecomeAMemberPage.SelectUserAgreements();
	
			BecomeAMemberPage.clickOnContinue_DoneButton();
			
			BecomeAMemberPage.VerifyBecomeAMemberStatus();
			
			DiscoverPage=BecomeAMemberPage.clickOnExploreTreatButton();
			
			AppNavPage=DiscoverPage.ReturnAppNavPage();
  	
            ChatCarePage = AppNavPage.clickOnChatCareButton();
			
			ChatCare_PatientDetails=ChatCarePage.SelectChildToAddInChatCare();
			
			ChatCare_PatientDetails.AddChildInChatCarePatientDetailsPage();
			
			AppNavPage=ChatCare_PatientDetails.clickOnChatCareTextPopUpOkButton();
			
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateIVTheraphyAvailabilityText();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceAppointment(Constants.Child);
			
			Appointments_HealthServicesPage.ValidateHealthProfileTextForChatCareDependent();
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
		
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.ValidateLatestUpcomingAppointments();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			Appointments_BookingDetailsPage.RescheduleAppointmentInBookingDetails();
			
            AppointmentsPage=Appointments_BookingDetailsPage.clickOnDoneInBookingUpdated();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetails();
			
			AppointmentsPage.ValidateCancelHealthAppointmentInUpcomingAppointmentsPage();
			
			AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC040_ValidateCreateAnInvalidAppointmentsForADependent(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);	
			
			
	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
	        
//            SignInPage.EnterUserNameAndPassword();
//	        
//	        AppNavPage=SignInPage.clickOnSignInButton();
	        

	        MembershipBenefitsPage = SignInPage.clickOnBecomeAMemberButton();
	        
	        BecomeAMemberPage = MembershipBenefitsPage.clickOnBecomeAMemberInMembershipBenefits();
			
			BecomeAMemberPage.EnterEmailAddressAndPasswordInBecomeAMemberPageToBecomeAMember();
			
			BecomeAMemberPage.clickOnContinueButton();
			
			BecomeAMemberPage.EnterBecomeAMemberFields();
			
			BecomeAMemberPage.SelectUserAgreements();
	
			BecomeAMemberPage.clickOnContinue_DoneButton();
			
			BecomeAMemberPage.VerifyBecomeAMemberStatus();
			
			DiscoverPage=BecomeAMemberPage.clickOnExploreTreatButton();
			
			AppNavPage=DiscoverPage.ReturnAppNavPage();
    			
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateIVTheraphyAvailabilityText();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateIVTheraphyHealthServiceAppointmentForDependent();
			
			AppointmentsPage=Appointments_HealthServicesPage.ClickOnCloseAppointmentAtSelectAppointmentFor();
			
			AppointmentsPage.clickOnWellnessServicesButton();
			
            Appointments_WellnessServicesPage=AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();
			
            Appointments_WellnessServicesPage.ValidateCreateAWellnessServiceAppointmentForDependent();
            
            AppointmentsPage=Appointments_WellnessServicesPage.ClickOnCloseAppointmentAtSelectAppointmentFor();
			
			AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC044_ValidateAppointmentHistoryForHealthServicesAppointment(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);	
			
	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
        
//            SignInPage.EnterUserNameAndPassword();
//	        
//	        AppNavPage=SignInPage.clickOnSignInButton();
	        
	        MembershipBenefitsPage = SignInPage.clickOnBecomeAMemberButton();
	        
	        BecomeAMemberPage = MembershipBenefitsPage.clickOnBecomeAMemberInMembershipBenefits();
			
			BecomeAMemberPage.EnterEmailAddressAndPasswordInBecomeAMemberPageToBecomeAMember();
			
			BecomeAMemberPage.clickOnContinueButton();
			
			BecomeAMemberPage.EnterBecomeAMemberFields();
			
			BecomeAMemberPage.SelectUserAgreements();
	
			BecomeAMemberPage.clickOnContinue_DoneButton();
			
			BecomeAMemberPage.VerifyBecomeAMemberStatus();
			
			DiscoverPage=BecomeAMemberPage.clickOnExploreTreatButton();
			
			AppNavPage=DiscoverPage.ReturnAppNavPage();

	            	
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
						
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceAppointment(Constants.Self);
			
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			AppointmentHistoryPage=MyProfilePage.clickOnAppointmentHistoryButton();
			
			AppointmentHistory_HealthServiceAppointments=AppointmentHistoryPage.clickOnHealthAppointmentsButton();
			
			AppointmentHistory_HealthServiceAppointments.ValidateAppointmentHistoryDetailsInHealthAppointments();
			
			AppointmentHistory_HealthServiceAppointments.ValidateHealthAppointmentsAppointmentHistoryDetails();
			
			MyProfilePage=AppointmentHistory_HealthServiceAppointments.NavBackToMyProfilePage();
			
           AppNavPage=MyProfilePage.NavigateToAppNavPage();
		
           AppointmentsPage=AppNavPage.clickOnBookingsButton();
		
		   AppointmentsPage.clickOnHealthServicesButton();
		
		Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
		
		Appointments_HealthServicesPage.ValidateCreateAHealthServiceSecondAppointment(Constants.Self);
		
		Appointments_HealthServicesPage.clickOnConfirmBookingButton();
		
		AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
		
		AppointmentsPage.clickOnUpcomingHealthServiceButton();
		
		Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForSecondUpComingAppointments();
		
		AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetails();
		
		AppNavPage=AppointmentsPage.NavigateToAppNavPage();
		
		MyProfilePage=AppNavPage.clickOnMyAccountButton();
	
		AppointmentHistoryPage=MyProfilePage.clickOnAppointmentHistoryButton();
		
		AppointmentHistory_HealthServiceAppointments=AppointmentHistoryPage.clickOnHealthAppointmentsButton();
		
		AppointmentHistory_HealthServiceAppointments.ValidateAppointmentHistoryDetailsInHealthAppointments();
		
		AppointmentHistory_HealthServiceAppointments.ValidateHealthAppointmentsAppointmentHistoryDetails();
		
		MyProfilePage=AppointmentHistory_HealthServiceAppointments.NavBackToMyProfilePage();
		
//		AppNavPage=AppointmentsPage.NavigateToAppNavPage();
//		
//        MyProfilePage=AppNavPage.clickOnMyAccountButton();
		
		AppointmentHistoryPage=MyProfilePage.clickOnAppointmentHistoryButton();
		
		AppointmentHistory_HealthServiceAppointments=AppointmentHistoryPage.clickOnHealthAppointmentsButton();
		
		AppointmentHistory_HealthServiceAppointments.ValidateAppointmentHistoryDetailsInHealthAppointments();
		
		AppointmentHistory_HealthServiceAppointments.ValidateHealthAppointmentsAppointmentHistoryDetails();
		
		MyProfilePage=AppointmentHistory_HealthServiceAppointments.NavBackToMyProfilePage();
		
		MyProfilePage.clickOnSignOutButton();

		TestBase.tearDown();

			datasetEnd();
		}

	}

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC045_ValidateAppointmentHistoryForWellnessServicesAppointment(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);	
			
	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();

        
//          SignInPage.EnterUserNameAndPassword();    
	        
//	       AppNavPage=SignInPage.clickOnSignInButton()
	             
	        MembershipBenefitsPage = SignInPage.clickOnBecomeAMemberButton();

	        BecomeAMemberPage = MembershipBenefitsPage.clickOnBecomeAMemberInMembershipBenefits();
			
			BecomeAMemberPage.EnterEmailAddressAndPasswordInBecomeAMemberPageToBecomeAMember();
			
			BecomeAMemberPage.clickOnContinueButton();
			
			BecomeAMemberPage.EnterBecomeAMemberFields();
			
			BecomeAMemberPage.SelectUserAgreements();
	
			BecomeAMemberPage.clickOnContinue_DoneButton();
			
			BecomeAMemberPage.VerifyBecomeAMemberStatus();
			
			DiscoverPage=BecomeAMemberPage.clickOnExploreTreatButton();
			
			AppNavPage=DiscoverPage.ReturnAppNavPage();
      			
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnWellnessServicesButton();

			Appointments_WellnessServicesPage = AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();

			Appointments_WellnessServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_WellnessServicesPage.ValidateCreateAWellnessServiceAppointmentNonMemberForSelf();

			Appointments_WellnessServicesPage.clickOnConfirmBookingButton();

			AppointmentsPage = Appointments_WellnessServicesPage.clickOnDoneInBookingConfirmed();

			AppointmentsPage.clickOnUpcomingWellnessServiceButton();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			AppointmentHistoryPage=MyProfilePage.clickOnAppointmentHistoryButton();
			
			AppointmentHistory_WellnessServiceAppointments=AppointmentHistoryPage.clickOnWellnessAppointmentsButton();
			
			AppointmentHistory_WellnessServiceAppointments.ValidateAppointmentHistoryDetailsInWellnessAppointments();
			
			AppointmentHistory_WellnessServiceAppointments.ValidateWellnessAppointmentsAppointmentHistoryDetails();
			
			MyProfilePage=AppointmentHistory_WellnessServiceAppointments.NavBackToMyProfilePage();
			
           AppNavPage=MyProfilePage.NavigateToAppNavPage();
           
           AppointmentsPage=AppNavPage.clickOnBookingsButton();
           
           AppointmentsPage.clickOnWellnessServicesButton();

			Appointments_WellnessServicesPage = AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();

			Appointments_WellnessServicesPage.ValidateSelectedWellnessCenterLocation();
			
		   Appointments_WellnessServicesPage.ValidateCreateAWellnessServiceAppointmentMemberForSelf();

			Appointments_WellnessServicesPage.clickOnConfirmBookingButton();

			AppointmentsPage = Appointments_WellnessServicesPage.clickOnDoneInBookingConfirmed();

			AppointmentsPage.clickOnUpcomingWellnessServiceButton();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForSecondUpComingAppointments();
			
			AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetailsForWellnessService();
			
			AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
		
			AppointmentHistoryPage=MyProfilePage.clickOnAppointmentHistoryButton();
			
			AppointmentHistory_WellnessServiceAppointments=AppointmentHistoryPage.clickOnWellnessAppointmentsButton();
			
			AppointmentHistory_WellnessServiceAppointments.ValidateAppointmentHistoryDetailsInWellnessAppointments();
			
			AppointmentHistory_WellnessServiceAppointments.ValidateWellnessAppointmentsAppointmentHistoryDetails();
			
			MyProfilePage=AppointmentHistory_WellnessServiceAppointments.NavBackToMyProfilePage();
			
           AppNavPage=MyProfilePage.NavigateToAppNavPage();
          
		   MyProfilePage.clickOnSignOutButton();

		   TestBase.tearDown();

			datasetEnd();
		}

	}

	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC046_ValidateAppointmentHistoryForDependentHealthServicesAppointment(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);	
			
	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
//	        
//          SignInPage.EnterUserNameAndPassword();    
//          
//	       AppNavPage=SignInPage.clickOnSignInButton();

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

			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();

			Appointments_HealthServicesPage.ValidateIVTheraphyAvailabilityText();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceAppointmentForNewChild();
			
			Appointments_SelectAppointmentForPage=Appointments_HealthServicesPage.returnAppointmentSelectAppointmentForPage();
			    
			HealthService_AddChildDetailsPage=Appointments_SelectAppointmentForPage.SelectChildToCreate();
			
			Appointments_HealthServicesPage=HealthService_AddChildDetailsPage.AddChildInHealthServiceAppointmentPage();
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();

			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
		
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.ValidateLatestUpcomingAppointments();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();

			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
            AppointmentHistoryPage=MyProfilePage.clickOnAppointmentHistoryButton();
			
			AppointmentHistory_HealthServiceAppointments=AppointmentHistoryPage.clickOnHealthAppointmentsButton();
			
			AppointmentHistory_HealthServiceAppointments.selectChilldInHealthAppointmentsAppointmentHistory();
			
			AppointmentHistory_HealthServiceAppointments.ValidateAppointmentHistoryDetailsInHealthAppointments();
			
			AppointmentHistory_HealthServiceAppointments.ValidateHealthAppointmentsAppointmentHistoryDetails();
			
			MyProfilePage=AppointmentHistory_HealthServiceAppointments.NavBackToMyProfilePage();
			
           AppNavPage=MyProfilePage.NavigateToAppNavPage();
           
           AppointmentsPage=AppNavPage.clickOnBookingsButton();
   		
		   AppointmentsPage.clickOnHealthServicesButton();
		
		Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
		
		Appointments_HealthServicesPage.ValidateCreateAHealthServiceSecondAppointment(Constants.Child);
		
		Appointments_HealthServicesPage.clickOnConfirmBookingButton();
		
		AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
		
		AppointmentsPage.clickOnUpcomingHealthServiceButton();
		
		Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForSecondUpComingAppointments();
		
		AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetails();
		
		AppNavPage	=AppointmentsPage.NavigateToAppNavPage();
		
		MyProfilePage=AppNavPage.clickOnMyAccountButton();
		
		AppointmentHistoryPage=MyProfilePage.clickOnAppointmentHistoryButton();
		
		AppointmentHistory_HealthServiceAppointments=AppointmentHistoryPage.clickOnHealthAppointmentsButton();
		
		AppointmentHistory_HealthServiceAppointments.selectChilldInHealthAppointmentsAppointmentHistory();
		
		AppointmentHistory_HealthServiceAppointments.ValidateAppointmentHistoryDetailsInHealthAppointments();
		
		AppointmentHistory_HealthServiceAppointments.ValidateHealthAppointmentsAppointmentHistoryDetails();
		
		MyProfilePage=AppointmentHistory_HealthServiceAppointments.NavBackToMyProfilePage();
		
		MyProfilePage.clickOnSignOutButton();
			
		
		TestBase.tearDown();

			datasetEnd();
		}

	}
	
	
	
	
	

}

//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 


//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 


