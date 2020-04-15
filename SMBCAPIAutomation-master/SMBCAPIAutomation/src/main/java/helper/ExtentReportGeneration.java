package helper;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportGeneration{

	
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	public void report()
	{
		extent = new ExtentReports (System.getProperty("user.dir") +"/STMExtentReport.html", true);
		 
		 extent
		                .addSystemInfo("Host Name", "Test")
		                .addSystemInfo("Environment", "Test Env")
		                .addSystemInfo("User Name", "Omkar");			
	}
	
	
	public void extlog(String testcasename)
	{
		logger = extent.startTest(testcasename);
		
	}
	
	public void extlogpass(String description)
	{
		logger.log(LogStatus.PASS, description);
	}
	
	public void extlogfail(String description)
	{
		logger.log(LogStatus.FAIL,description);
	}
	
	public void extflush()
	{
		extent.endTest(logger);
		extent.flush();
	}


}
