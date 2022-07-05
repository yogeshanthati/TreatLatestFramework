package utilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.restassured.response.Response;

public class SubscriptionsAPI extends Common {

	public static List<String> ProductName;
	public static List<String> Currency;
	public static List<String> Interval;
	public static List<String> API_Description;
	public static List<Integer> Amount;
	public static List<Integer> IntervalCount;

	private Data data;

	public SubscriptionsAPI(Data data) {
		this.data = data;
	}

	public static Response resSubscriptionPlanDetail;

	public void getSubscriptionPlanDetails(String EmailAddress, String Password) {

		resSubscriptionPlanDetail = getSubscriptionPlanDetailsResponse(EmailAddress, Password);
		try {
			ProductName = resSubscriptionPlanDetail.jsonPath().getList("data.planDetials.productName");
			Currency = resSubscriptionPlanDetail.jsonPath().getList("data.planDetials.currency");
			Interval = resSubscriptionPlanDetail.jsonPath().getList("data.planDetials.interval");
			IntervalCount = resSubscriptionPlanDetail.jsonPath().getList("data.planDetials.intervalCount");
			Amount = resSubscriptionPlanDetail.jsonPath().getList("data.planDetials.unitAmount");
		} catch (Exception e) {
			failed(driver, "Exception caught , Message is : " + e.getMessage());
		}
	}

	private Response getSubscriptionPlanDetailsResponse(String EmailAddress, String Password) {
		try {

			BearerTokenAPI Token = new BearerTokenAPI(data);

			String AuthToken = Token.getBearerToken(EmailAddress, Password);

			String baseURI = data.get("SubscriptionsBaseURI");

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
