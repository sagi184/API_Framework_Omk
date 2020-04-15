package dataReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import helper.EndpointGeneration;
import helper.HttpStatusCodes;

public class JsonFileReader extends HttpStatusCodes{
	public EndpointGeneration endpoint;
	public APIConfigReader apiconfig;
	public ObjectMapper mapper;	
	public JsonNode rootNode;
	public JsonNode valueNode;
	
	public void api_objects() throws IOException {
		endpoint = new EndpointGeneration();
		apiconfig = new APIConfigReader();
		mapper = new ObjectMapper();
	}
	
	public String expectedInserjenkins() throws IOException
	{
		return  endpoint.postAPI_WithBodyParameter(apiconfig.insertJenkinsTransactionURL_Resoruce());
	}
	
	public String expectedupdatecatalog() throws IOException
	{
		return endpoint.postAPI_WithBodyParameter(apiconfig.updateCatalogURL_Resoruce());
	}
	
	public String expectedcustomScript() throws IOException
	{
		return endpoint.postAPI_WithBodyParameter(apiconfig.insertJCustomScriptDataURL_Resource());
	}
	
	public String expectedCreateHearingSheet() throws IOException
	{
		return endpoint.postAPI_WithBodyParameter(apiconfig.createHearingSheetURL_Resource());
	}
	
	public String expectedServerRequesturl() throws IOException
	{
		return endpoint.postAPI_WithBodyParameter(apiconfig.getCreateServerRequestURL_Resoruce());
	}
	
	public String expectedupdateServerRequesturl() throws IOException
	{
		return endpoint.postAPI_WithoutBodyParameter(apiconfig.updateServerRequestURL_Resoruce(), apiconfig.querPararmeter_seqNo(), seqNo(), null, null);
	}
	public String expectedinsertServerRequesturl() throws IOException
	{
	 return endpoint.postAPI_WithoutBodyParameter(apiconfig.insertserverrequestURL_Resoruce(), apiconfig.querPararmeter_hearingsheetid(), apiconfig.hearingsheetid_value(), null, null);
	}
	 
	public String generateStringFromResource(String path) throws IOException
	{
		return new String(Files.readAllBytes(Paths.get(path)));
	}
	
	
	public String bodyParameterJsonReader(String APIURL, String bodyParamValidation) throws IOException //String TC_Name
	{	
		String jsonBody;
		
		if (APIURL.equals(expectedupdatecatalog()))
		{
			jsonBody = generateStringFromResource(System.getProperty("user.dir") + "/src/main/java/DataObjects/UpdateCatalog_BodyParam.json");
		}
		else if(APIURL.equals(expectedcustomScript()))
		{
			jsonBody = generateStringFromResource(System.getProperty("user.dir") + "/src/main/java/DataObjects/InsertCustomScriptData.json");	
		}
		
		else if (APIURL.equals(expectedInserjenkins()))
		{
			jsonBody = generateStringFromResource(System.getProperty("user.dir") + "/src/main/java/DataObjects/InsertJenkins_BodyParam.json");
		}
		else if (APIURL.equals(expectedCreateHearingSheet()))
		{
			jsonBody = generateStringFromResource(System.getProperty("user.dir") + "/src/main/java/DataObjects/HearingSheet_BodyParam.json");
			//jsonBody = updateName(jsonBody);
		}
		else if (APIURL.equals(expectedServerRequesturl()) || APIURL.equals(expectedinsertServerRequesturl()) )
		{
			jsonBody = generateStringFromResource(System.getProperty("user.dir") + "/src/main/java/DataObjects/ServerRequest.json");
		}
		else if(APIURL.equals(expectedupdateServerRequesturl()))
		{
			jsonBody = generateStringFromResource(System.getProperty("user.dir") + "/src/main/java/DataObjects/UpdateServerRequest.json");
		}
		else
		{
			jsonBody = generateStringFromResource(System.getProperty("user.dir") + "/src/main/java/DataObjects/InsertCustomScriptData.json");
			jsonBody = editCustomScriptBodyParam(jsonBody);
		}
		
		if(bodyParamValidation.equals(apiconfig.invalidBodyParam())) //"invalidBodyParam")
		{
			jsonBody = "";
		}
		return jsonBody;		
	}
	
	
		
	
	public String buildId() throws IOException
	{		
		rootNode = mapper.readTree(bodyParameterJsonReader(expectedInserjenkins(), apiconfig.validBodyParam())); //"validBodyParam"
		valueNode = rootNode.path("buildId");
		return valueNode.asText();
	}	
	
	
	public String hearingsheetname_Value() throws IOException
	{		
		rootNode = mapper.readTree(bodyParameterJsonReader(expectedCreateHearingSheet(), apiconfig.validBodyParam())); //"validBodyParam"
		valueNode = rootNode.path("name");
		return valueNode.asText();
	}
	
	public String editCustomScriptBodyParam(String Jsonbody) throws JsonProcessingException, IOException
	{
		rootNode = mapper.readTree(Jsonbody);
		((ObjectNode)rootNode).remove("type");
		((ObjectNode)rootNode).remove("name");
		return mapper.writeValueAsString(rootNode);				
	}
	
	
	public String seqNo() throws IOException
	{		
		rootNode = mapper.readTree(bodyParameterJsonReader(expectedCreateHearingSheet(), apiconfig.validBodyParam())); //"validBodyParam"
		valueNode = rootNode.get("servers").get(0);
		return valueNode.asText();
	}
		
	public String type() throws IOException
	{		
		rootNode = mapper.readTree(bodyParameterJsonReader(expectedcustomScript(),apiconfig.validBodyParam()));
		valueNode = rootNode.path("type");
		return valueNode.asText();
	}
	
	public String name() throws IOException
	{		
		rootNode = mapper.readTree(bodyParameterJsonReader(expectedcustomScript(),apiconfig.validBodyParam()));
		valueNode = rootNode.path("name");
		return valueNode.asText();
	}
	
	public String queueId() throws IOException
	{		
		rootNode = mapper.readTree(bodyParameterJsonReader(expectedInserjenkins(),apiconfig.validBodyParam()));
		valueNode = rootNode.path("queueId");
		return valueNode.asText();
	}
	
	public String jobName() throws IOException
	{		
		rootNode = mapper.readTree(bodyParameterJsonReader(expectedInserjenkins(),apiconfig.validBodyParam()));
		valueNode = rootNode.path("jobName");
		return valueNode.asText();
	}


}
