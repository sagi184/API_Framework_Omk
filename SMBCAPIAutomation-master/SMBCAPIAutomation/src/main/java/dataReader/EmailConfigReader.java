package dataReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import helper.ExtentReportGeneration;

public class EmailConfigReader extends ExtentReportGeneration {

	private Properties readConfigFile() throws IOException {
			Properties prop = new Properties();
			InputStream stream = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/DataObjects/EmailConfig.properties");
			prop.load(stream);
		return prop;

	}

	public String getRecEmail() throws IOException {
		return readConfigFile().getProperty("RecipientEmail");
	}

	public String getSetEmailFrom() throws IOException {
		return readConfigFile().getProperty("SetEmailFrom");
	}

	public String setEmailSubject()throws IOException {
		return readConfigFile().getProperty("EmailSubject");
	}

	public String setEmailBody()throws IOException {
		return readConfigFile().getProperty("EmailBody");
	}

	public String setSmtpHost() throws IOException{
		return readConfigFile().getProperty("smtphost");
	}

	public String setSmtpPort() throws IOException{
		return readConfigFile().getProperty("smtpport");
	}

	public String setUsername() throws IOException{
		return readConfigFile().getProperty("Username");
	}

	public String setPassword() throws IOException{
		return readConfigFile().getProperty("Pwd");
	}

}
