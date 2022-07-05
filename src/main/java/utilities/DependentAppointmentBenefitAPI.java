package utilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.response.Response;

public class DependentAppointmentBenefitAPI extends Common {

	public static List<String> firstName;
	public static List<String> lastName;
	public static List<String> DependentGuiID;

	private Data data;

	public DependentAppointmentBenefitAPI(Data data) {
		this.data = data;
	}

	public static Response resDependentDetailResponse;

	public void getDependentDetails(String EmailAddress, String Password) {

		resDependentDetailResponse = getDependentDetailsResponse(EmailAddress, Password);
		try {
			DependentGuiID = resDependentDetailResponse.jsonPath().getList("data.dependents.dependentGuid");
			firstName = resDependentDetailResponse.jsonPath().getList("data.dependents.firstName");
			lastName = resDependentDetailResponse.jsonPath().getList("data.dependents.lastName");

		} catch (Exception e) {
			failed(driver, "Exception caught , Message is : " + e.getMessage());
		}
	}

	private Response getDependentDetailsResponse(String EmailAddress, String Password) {
		try {

			BearerTokenAPI Token = new BearerTokenAPI(data);

			String AuthToken = Token.getBearerToken(EmailAddress, Password);

			String baseURI = data.get("DependentBaseURI");

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

	public static List<Integer> AllottedCount;
	public static List<Integer> RemainingCount;
	public static List<String> AppointmentName;

	public static Response resAppointmentBenefitDetail;

	public void getDependentAppointmentBenefitDetails(String CognitoUserName, String GuiID, String EmailAddress,
			String Password) {

		resAppointmentBenefitDetail = getDependentAppointmentBenefitDetailsResponse(CognitoUserName, GuiID,
				EmailAddress, Password);
		try {
			AllottedCount = resAppointmentBenefitDetail.jsonPath().getList("data.appointmentBenefit.allottedCount");
			RemainingCount = resAppointmentBenefitDetail.jsonPath().getList("data.appointmentBenefit.remainingCount");
			AppointmentName = resAppointmentBenefitDetail.jsonPath().getList("data.appointmentBenefit.appointmentName");

		} catch (Exception e) {
			failed(driver, "Exception caught , Message is : " + e.getMessage());
		}
	}

	private Response getDependentAppointmentBenefitDetailsResponse(String CognitoUserName, String GuiID,
			String EmailAddress, String Password) {
		try {

			String baseURI = data.get("AppointmentsBaseURI");

			Map<String, String> headers = new HashMap<>();

			BearerTokenAPI Token = new BearerTokenAPI(data);

			String AuthToken = Token.getBearerToken(EmailAddress, Password);

			headers.put("Authorization", "Bearer " + AuthToken);

			headers.put("Accept", "application/json");

			Map<String, String> params = new HashMap<>();

			params.put("cognitoUserName", CognitoUserName);

			params.put("dependentGuid", GuiID);

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
