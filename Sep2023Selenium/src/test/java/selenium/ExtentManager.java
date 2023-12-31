package selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager extends BaseTest
{
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports report;
	
	 public static ExtentReports getInstance()
	 {
		 if(htmlReport == null)
		 {
			 htmlReport = new ExtentHtmlReporter(projectPath+ "\\reports\\report.html");
			 htmlReport.config().setDocumentTitle("Automation report");
			 htmlReport.config().setReportName("Functional Report");
			 htmlReport.config().setTheme(Theme.STANDARD);
			 
			 report = new ExtentReports();
			 report.attachReporter(htmlReport);
			 report.setSystemInfo("os", "windows10");
			 report.setSystemInfo("Tester name", "Sharath");
			 report.setSystemInfo("browser", "chrome");
			 
		 }
		 
		 return report;
		 
	 }

}
