package utilities;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseBodyData;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.ValidatableResponse;

public class ValidateResponse extends EndPointExecution{
	int expectedStatusCode; //Used for loggin status in Extent report
	ValidatableResponse responseStatusCode;
	
	public ValidatableResponse validateStatusCodeOK(Response response)
	{
		expectedStatusCode = response.getStatusCode();
		if (OK == expectedStatusCode )
		{
			extlogpass("Pass");
		}
		else
		{			
			extlogfail("Fail");
			
		}
		
		return response.then().assertThat().statusCode(OK);
	}

	public ValidatableResponse validateStatusCodeCreated(Response response)
	{		
		expectedStatusCode = response.getStatusCode();
		if (CREATED == expectedStatusCode )
		{
			extlogpass("Pass");
		}
		else
		{
			extlogfail("Fail");
		}

		return response.then().assertThat().statusCode(CREATED);
	}

	public ValidatableResponse validateStatusCodeBadRequest(Response response)
	{		
		expectedStatusCode = response.getStatusCode();

		if (BAD_REQUEST == expectedStatusCode )
		{
			extlogpass("Pass");
		}
		else
		{
			extlogfail("Fail");
		}
		return response.then().assertThat().statusCode(BAD_REQUEST);
	}
	
	public ValidatableResponse validateStatusCodeInternalServerError(Response response)
	{		
		expectedStatusCode = response.getStatusCode();

		if (INTERNAL_SERVER_ERROR == expectedStatusCode )
		{
			extlogpass("Pass");
		}
		else
		{
			extlogfail("Fail");
		}
		return response.then().assertThat().statusCode(INTERNAL_SERVER_ERROR);
	}

}
