package helper;

import java.io.IOException;

import dataReader.APIConfigReader;

public class EndpointGeneration extends APIConfigReader {
public String APIURL;

	
public String getAPI_WithoutQueryParameter(String apiResource) throws IOException
{
return APIURL = baseURL() + apiResource;
}

public String getAPI_WithQueryParam(String apiResource, String firstQueryParmVariable, String firstQueryParmValue, String secondQueryParmVariable, String secondQueryParmValue) throws IOException
{
	if (secondQueryParmVariable == null && secondQueryParmValue == null)
	{
	return APIURL = baseURL() + apiResource + apiQuerySpearator() + firstQueryParmVariable + firstQueryParmValue;
	}
	else {
		
	return APIURL = baseURL() + apiResource + apiQuerySpearator() + firstQueryParmVariable + firstQueryParmValue + queryParameter_Operator() + secondQueryParmVariable + secondQueryParmValue;
	}
}

public String postAPI_WithBodyParameter(String apiResource) throws IOException
{
 return APIURL = baseURL() + apiResource;
}


public String postAPI_WithoutBodyParameter(String apiResource, String firstQueryParmVariable, String firstQueryParmValue, String secondQueryParmVariable, String secondQueryParmValue) throws IOException
{
	if (secondQueryParmVariable == null && secondQueryParmValue == null)
	{
	return APIURL = baseURL() + apiResource + apiQuerySpearator() + firstQueryParmVariable + firstQueryParmValue;
	}
	else
	{
	return APIURL = baseURL() + apiResource + apiQuerySpearator() + firstQueryParmVariable + firstQueryParmValue + queryParameter_Operator() + secondQueryParmVariable + secondQueryParmValue;
	}
}

public String deleteAPI_Delete(String apiResource, String firstQueryParmVariable, String firstQueryParmValue, String secondQueryParmVariable, String secondQueryParmValue) throws IOException
{
	if (secondQueryParmVariable == null && secondQueryParmValue == null)
	{
	return APIURL = baseURL() + apiResource + apiQuerySpearator() + firstQueryParmVariable + firstQueryParmValue;
	}
	else
	{
	return APIURL = baseURL() + apiResource + apiQuerySpearator() + firstQueryParmVariable + firstQueryParmValue + queryParameter_Operator() + secondQueryParmVariable + secondQueryParmValue;
	}
}

}
