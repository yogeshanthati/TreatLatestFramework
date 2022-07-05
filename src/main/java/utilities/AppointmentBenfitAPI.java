package utilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.response.Response;

public class AppointmentBenfitAPI extends Common {


	public static List<Integer> AllottedCount;
	public static List<Integer> RemainingCount;
	public static List<String> AppointmentName;


	private Data data;

	public AppointmentBenfitAPI(Data data) {
		this.data = data;
	}

	public static Response resAppointmentBenefitDetail;

	public void getAppointmentBenefitDetails(String EmailAddress, String Password) {

		resAppointmentBenefitDetail = getAppointmentBenefitDetailsResponse(EmailAddress, Password);
		try {
			AllottedCount = resAppointmentBenefitDetail.jsonPath().getList("data.appointmentBenefit.allottedCount");
			RemainingCount = resAppointmentBenefitDetail.jsonPath().getList("data.appointmentBenefit.remainingCount");
			AppointmentName = resAppointmentBenefitDetail.jsonPath().getList("data.appointmentBenefit.appointmentName");
			
		} catch (Exception e) {
			failed(driver, "Exception caught , Message is : " + e.getMessage());
		}
	}

	private Response getAppointmentBenefitDetailsResponse(String EmailAddress, String Password) {
		try {

			BearerTokenAPI Token = new BearerTokenAPI(data);

			String AuthToken = Token.getBearerToken(EmailAddress, Password);

			String baseURI = data.get("AppointmentsBaseURI");//AppointmentsBaseURI

			Map<String, String> headers = new HashMap<>();

			headers.put("Accept", "application/json");

			headers.put("Authorization", "Bearer " + AuthToken);

			Map<String, String> params = new HashMap<>();

			params.put("limit", "10");

			RestAPI restConnection = new RestAPI(baseURI, headers);

			Response res = restConnection.get(params);

			System.out.println(res.asPrettyString());

			return res;
		} catch (Exception e) {

			failed(driver, "Exception caught , Message is : " + e.getMessage());
			return null;
		}

	}
	
	
	
	
	
	
	
	


}
