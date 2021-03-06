package utilities;

import java.io.IOException;

import helper.EndpointGeneration;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Authentication extends EndpointGeneration {	

	public RequestSpecification basicAuthentication() throws IOException
	{
		return RestAssured.given().auth().basic(username(),password()).header(tokenKey(), tokenValue());
	}

}
