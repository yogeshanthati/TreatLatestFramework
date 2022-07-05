package utilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.response.Response;

public class ContentAPI extends Common {


	public static List<String> API_AuthorName;
	public static List<String> API_title;
	
	public static List<String> API_Description;
	

private Data data;
	
	public ContentAPI(Data data) {
		this.data = data;
	}

	public static Response resCategoryContentDetail;

	public void getCategoryContentDetails(String Category) {
	
		resCategoryContentDetail = getCategoryContentDetailsResponse(Category);
		try {
		
			API_AuthorName = resCategoryContentDetail.jsonPath().getList("records[0].childInfos.authorName");
			API_title = resCategoryContentDetail.jsonPath().getList("records[0].childInfos.title");
		} catch (Exception e) {
			failed(driver, "Exception caught , Message is : " + e.getMessage());
		}
	}

	private Response getCategoryContentDetailsResponse(String Category) {
		try {
		
			
			String apiKey = Constants.ContentAPI_Key;
			
	    	String baseURI=Constants.CategoryContentBaseURI;

			Map<String, String> headers = new HashMap<>();
			
			headers.put("Accept", "application/json");
			
			headers.put("ApiKey", apiKey);

			Map<String, String> params = new HashMap<>();
				
			params.put("category",Category);

			RestAPI restConnection = new RestAPI(baseURI, headers);
			
			
			Response res = restConnection.get(params);
			
		

			System.out.println(res.asPrettyString());

			return res;
		} catch (Exception e) {

			failed(driver, "Exception caught , Message is : " + e.getMessage());
			return null;
		}

	}

	public static Response resSearchContentDetail;

	public void getSearchContentDetails() {

		resSearchContentDetail = getSearchContentDetailsResponse();
		try {
			API_Description = resSearchContentDetail.jsonPath().getList("records.description");
			API_AuthorName = resSearchContentDetail.jsonPath().getList("records.authorName");
			API_title = resSearchContentDetail.jsonPath().getList("records.title");
		} catch (Exception e) {
			failed(driver, "Exception caught , Message is : " + e.getMessage());
		}
	
	}

	private Response getSearchContentDetailsResponse() {
		try {
			String apiKey = Constants.ContentAPI_Key;;

			String baseURI = Constants.SearchContentBaseURI;

			Map<String, String> headers = new HashMap<>();
			
			headers.put("Accept", "application/json");
			
			headers.put("ApiKey", apiKey);

			Map<String, String> params = new HashMap<>();
			
			params.put("query", Constants.QueryString);

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
