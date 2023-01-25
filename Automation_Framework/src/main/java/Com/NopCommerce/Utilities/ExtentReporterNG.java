package Com.NopCommerce.Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentReporterNG {
	static ExtentReports extent;
	
	public static ExtentReports getReportObject()	
	{	
        String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    	String Name = "ExtentReport - "+Timestamp;
        String path = System.getProperty("user.dir")+"/Reports/"+Name+" "+".html";
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		reporter.config().setReportName("Automation Framework Extent Report");
		reporter.config().setDocumentTitle("( Automation framework Execution Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Automation Engineer", "Pratik kakad");
		extent.setSystemInfo("Suite name", "Regression");

		return extent;
		
	}
	   
	 
	 
}
