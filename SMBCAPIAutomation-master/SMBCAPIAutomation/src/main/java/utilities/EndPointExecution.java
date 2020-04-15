package utilities;

import java.io.IOException;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class EndPointExecution extends Authentication {
	public Response response;

	public Response getCall(String tcName, String apiURL) throws IOException
	{
		extlog(tcName);
		response = basicAuthentication().
				get(apiURL);
		return response;
	}

	public Response postCall_WithBodyParameters(String tcName, String apiURL, String bodyParamValidation) throws IOException
	{
		extlog(tcName);		
		String bodyParam = bodyParameterJsonReader(apiURL, bodyParamValidation);
		response =  basicAuthentication().
				contentType(ContentType.JSON).
				body(bodyParam).
				post(apiURL);
		return response;
	}
	
	public Response postCall_WithQueryAndBodyParameters(String tcName, String apiURL, String bodyParamValidation) throws IOException
	{
		extlog(tcName);	
		String bodyParam = bodyParameterJsonReader(apiURL, bodyParamValidation);
		response =  basicAuthentication().
				contentType(ContentType.JSON).
				body(bodyParam).
				post(apiURL);
		return response;
		
	}
	
	public Response postCall_WithOutBodyParameters(String tcName, String apiURL) throws IOException
	{
		extlog(tcName);
		response =basicAuthentication().			
				post(apiURL);
		return response;
	}

	public Response deleteCall(String tcName, String apiURL) throws IOException
	{
		extlog(tcName);
		response = basicAuthentication().delete(apiURL);
		return response;
	}
}
