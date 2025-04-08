package org.pratima.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager
{
    private static ExtentReports extentReports;
    public static ExtentReports getInstance()
    {
        if (extentReports==null)
            createInstance();

        return extentReports;


    }

    public static ExtentReports createInstance()
    {
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        extentSparkReporter.config().setReportName("My First Automation Report");
        extentSparkReporter.config().setDocumentTitle("Extent Report");

        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        return extentReports;
    }
}
