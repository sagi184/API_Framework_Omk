package apiHappyPathTest;

import java.io.IOException;
import org.testng.annotations.Test;
import utilities.TestBase;

public class StaticPage_HappyPathTest extends TestBase{
	//public String apiURL;
	
	@Test (priority = 1)
	public void insertJCustomScriptData_HappyPath() throws IOException
	{
		apiURL = postAPI_WithBodyParameter(insertJCustomScriptDataURL_Resource());
		postCall_WithBodyParameters("Insert Custom Script Data Happy Path Test", apiURL, validBodyParam());
		validateStatusCodeCreated(response);
	}
	
	@Test (priority = 2)
	public void getAllCustomScriptDataDetails_HappyPath() throws IOException
	{
		apiURL = getAPI_WithoutQueryParameter(insertJCustomScriptDataURL_Resource());
		getCall("Get All Custom Script Data Happy Path Test", apiURL);
		validateStatusCodeOK(response);
	}
	
	@Test(priority = 3)
	public void searchCustomScriptData_HappyPath() throws IOException
	{
		apiURL = getAPI_WithQueryParam(searchCustomScriptDataURL_Resoruce(), querPararmeter_type(),type(),querPararmeter_name(), name());
		getCall("Search Custom Script Data Happy Path Test", apiURL);
		validateStatusCodeOK(response);
	}
	
	@Test (priority = 4)
	public void editCustomScriptData_HappyPath() throws IOException
	{
		apiURL = getAPI_WithQueryParam(editCustomScriptDataURL_Resoruce(), querPararmeter_type(),type(),querPararmeter_name(), name());;
		postCall_WithBodyParameters("Edit Custom Script Data Happy Path Test", apiURL, validBodyParam());
		validateStatusCodeOK(response);
	}
	
	@Test (priority = 5)
	public void deleteCustomScriptData_HappyPath() throws IOException
	{
		apiURL = deleteAPI_Delete(insertJCustomScriptDataURL_Resource(), querPararmeter_type(),type(),querPararmeter_name(), name());		
		deleteCall("Delete Custom Script Data Happy Path Test", apiURL);
		validateStatusCodeOK(response);
	}
}
