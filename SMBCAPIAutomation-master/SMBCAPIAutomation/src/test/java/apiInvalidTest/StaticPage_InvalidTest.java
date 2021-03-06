package apiInvalidTest;

import java.io.IOException;
import org.testng.annotations.Test;
import utilities.TestBase;

public class StaticPage_InvalidTest extends TestBase{
	//public String apiURL;
	@Test
	public void insertJCustomScriptData_HappyPath() throws IOException
	{
		//Insert custom script data invalid test
		apiURL = postAPI_WithBodyParameter(insertJCustomScriptDataURL_Resource());
		postCall_WithBodyParameters("Insert Custom Script Data Invalid Test", apiURL, invalidBodyParam());
		validateStatusCodeBadRequest(response);
	}
}
