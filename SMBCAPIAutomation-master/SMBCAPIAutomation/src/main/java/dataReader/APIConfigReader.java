package dataReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class APIConfigReader extends JsonFileReader {
	
		public Properties prop() throws IOException 
		{
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream(System.getProperty("user.dir") + "/src/main/java/DataObjects/APIConfig.properties");
		prop.load(ip);
		return prop;
		}
		
		public String username() throws IOException
		{			
			return prop().getProperty("Username");
		}
		
		public String password() throws IOException
		{
			return prop().getProperty("Password");
		}
		
		public String tokenKey() throws IOException
		{
			return prop().getProperty("AuthorizationKey");
		}
		
		public String tokenValue() throws IOException
		{
			String tokenValuePart1 = prop().getProperty("AuthorizationValuePart1");
			String tokenValuePart2 = prop().getProperty("AuthorizationValuePart2");
			
			return tokenValuePart1 + " " + tokenValuePart2;
			
		}
		
		public String getAllJenkinsTransactionsURL_Resoruce() throws IOException
		{
			
			return prop().getProperty("GetallJenkinsTransactionsURL_Resoruce");
		}
		
		public String insertJenkinsTransactionURL_Resoruce() throws IOException
		{
			return prop().getProperty("InserJenkinsTransactionURL_Resoruce");
		}
		
		public String getAllHearingSheetURL_Resoruce() throws IOException
		{
			return prop().getProperty("GetAllHearingSheet_Resource");
		}
		
		public String createHearingSheetURL_Resource() throws IOException
		{
			String getallhearingsheetPostFix = prop().getProperty("GetAllHearingSheet_Resource");
			return getallhearingsheetPostFix.substring(0, getallhearingsheetPostFix.length()-1);
		}
		
		public String getorderforHearingSheetURL_Resource() throws IOException
		{
			return prop().getProperty("GetOrderForlHearingSheet_Resource");
		}
		
		
		
		public String getCreateServerRequestURL_Resoruce() throws IOException
		{
			return prop().getProperty("CreateServerRequest_Resource");
		}
		
		public String updateServerRequestURL_Resoruce() throws IOException
		{
			return prop().getProperty("updateServerRequestURL_Resoruce");
		}
		
		public String linkOrderToHearingSheetURL_Resoruce() throws IOException
		{
			return prop().getProperty("linkordertohearingsheetURL_Resoruce");
		}
		
		public String insertserverrequestURL_Resoruce() throws IOException
		{
			return prop().getProperty("insertserverrequestURL_Resoruce");
		}
		
		public String insertJCustomScriptDataURL_Resource() throws IOException
		{
			return prop().getProperty("insertJCustomScriptDataURL_Resource");
		}
		
		public String updateCatalogURL_Resoruce() throws IOException
		{
			return prop().getProperty("UpdateCatalogURL_Resoruce");
		}

		public String findAJenkinsTrnasactionBybuildIdURL_Resoruce() throws IOException
		{
			return prop().getProperty("FindaJenkinsTrnasactionfindbybuildIdURL_Resoruce");
		}
		
		public String searchCustomScriptDataURL_Resoruce() throws IOException
		{
			return prop().getProperty("searchCustomScriptDataURL_Resoruce");
		}
		
		
		public String editCustomScriptDataURL_Resoruce() throws IOException
		{
			return prop().getProperty("editCustomScriptDataURL_Resoruce");
		}
		
		public String findAJenkinsTrnasactionByqueueIdURL_Resoruce() throws IOException
		{
			return prop().getProperty("FindaJenkinsTrnasactionfindbyqueueIdURL_Resoruce");
		}
		
		public String deleteJenkinsTransactionURL_Resoruce() throws IOException
		{
			return prop().getProperty("DeleteJenkinsTransactionURL_Resoruce");
		}
		
		public String cancelJekninsTransactionURL_Resoruce() throws IOException
		{
			return prop().getProperty("CancelJekninsTransactionURL_Resoruce");
		}
		

		public String getAllPendingScheduledJobsURL_Resource() throws IOException
		{			
		return prop().getProperty("GetAllPendingScheduledJobsURL_Resource");
		}
		
		public String apiQuerySpearator() throws IOException
		{		
			return prop().getProperty("QuerySeparatior");
		}
		
		public String queryParameter_Operator() throws IOException
		{
			return prop().getProperty("QueryParameter_Operator");
		}
		
		public String querPararmeter_Buildid() throws IOException
		{
			return prop().getProperty("QuerPararmeter_buildId");
		}
		
		public String querPararmeter_seqNo() throws IOException
		{
			return prop().getProperty("querPararmeter_seqNo");
		}
		
		public String querPararmeter_OrderId() throws IOException
		{
			return prop().getProperty("queryparameter_orderId");
		}
		
		public String orderId_Value() throws IOException
		{
			return prop().getProperty("orderId_Value");
		}
		
		public String querPararmeter_type() throws IOException
		{
		return 	prop().getProperty("QuerPararmeter_type");
		}
		
		public String querPararmeter_hearingsheetid() throws IOException
		{
		return 	prop().getProperty("queryparameter_hearingsheetid");
		}
		
		public String querPararmeter_hearingsheetname() throws IOException
		{
		return 	prop().getProperty("hearingsheetname");
		}
		
		public String searchhearingsheetsURL_Resource() throws IOException
		{
		return 	prop().getProperty("searchhearingsheetsURL_Resource");
		}
		
		public String deletesheetURL_Resource() throws IOException
		{
		return 	prop().getProperty("deletesheetURL_Resource");
		}
		
		
		
		public String querPararmeter_Orderforhearingsheetid() throws IOException
		{
		return 	prop().getProperty("queryparameter_Orderforhearingsheetid");
		}
		
		public String hearingsheetid_value() throws IOException
		{
		return 	prop().getProperty("hearingsheetidvalue");
		}
		
		public String querPararmeter_name() throws IOException
		{
			return prop().getProperty("QuerPararmeter_name");
		}
		
		public String querPararmeter_queueid() throws IOException
		{
			return prop().getProperty("QuerPararmeter_queueId");
		}
		
		public String querPararmeter_jobName() throws IOException
		{
			return prop().getProperty("QuerPararmeter_jobName");
		}
		
		public String querPararmeterhearingsheet_id() throws IOException
		{
			return prop().getProperty("QuerPararmeter_hearingSheetid");
		}
		
		public String querPararmeterhearingsheet_name() throws IOException
		{
			return prop().getProperty("QuerPararmeter_hearingSheetName");
		}
		
		public String querPararmeterhearingsheet_createdBy() throws IOException
		{
			return prop().getProperty("QuerPararmeter_hearingSheetcreatedBy");
		}

		public String getAllUpdatedScheduledJobs_Resource() throws IOException
		{
			return prop().getProperty("GetAllUpdatedScheduledJobs_Resource");
		}
		
		//GetAllCancelledScheduledJobs_Resource
		public String getAllCancelledScheduledJobs_Resource() throws IOException
		{
		return 	prop().getProperty("GetAllCancelledScheduledJobs_Resource");
		}
		
		public String validBodyParam() throws IOException
		{
		return 	prop().getProperty("validBodyParameter");
		}
		
		public String invalidBodyParam() throws IOException
		{
		return 	prop().getProperty("invalidBodyParameter");
		}
		
		public String baseURL() throws IOException
		{
			return prop().getProperty("Base_URL");
		}

}
