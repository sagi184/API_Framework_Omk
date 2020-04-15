package utilities;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestBase extends ValidateResponse {
	public String apiURL;

	@BeforeClass
	public void beforeclass() throws IOException
	{
		api_objects();
	}	
	
	@BeforeTest
	public void reportGeneration() 
	{
		report();          //initExtentReport, initReport		
	}
	
	@AfterSuite
	public void email() throws AddressException, MessagingException, Throwable
	{
		extflush();
		sendMailWithAttachment();
		
	}

}
