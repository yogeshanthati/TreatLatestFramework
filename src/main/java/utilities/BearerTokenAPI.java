package utilities;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import io.restassured.response.Response;

public class BearerTokenAPI extends Common {

	private Data data;

	public BearerTokenAPI(Data data) {
		this.data = data;
	}

	public static String bearerToken;

	public static Response resBearerToken;

	public String getBearerToken(String EmailAddress, String Password) {

		resBearerToken = getBearerTokenResponse(EmailAddress, Password);
		try {
			bearerToken = resBearerToken.jsonPath().get("data.accessToken");

		} catch (Exception e) {
			failed(driver, "Exception caught , Message is : " + e.getMessage());
		}

		return bearerToken;
	}

	private Response getBearerTokenResponse(String EmailAddress, String Password) {
		try {
			String baseURI = data.get("BearerTokenBaseURI");

			String postURL = data.get("PostURL");

			Map<String, String> headers = new HashMap<>();

			headers.put("Accept", "*/*");

			headers.put("Content-Type", "application/json");

			headers.put("Connection", "keep-alive");

			JSONObject requestParams = new JSONObject();

			requestParams.put("username", EmailAddress);

			requestParams.put("password", Password);

			String body = requestParams.toJSONString();

			RestAPI restConnection = new RestAPI(baseURI, headers);

			Response res = restConnection.postRequest(postURL, body);

			System.out.println(res.asPrettyString());

			return res;

		} catch (Exception e) {

			failed(driver, "Exception caught , Message is : " + e.getMessage());
			return null;
		}

	}

}
