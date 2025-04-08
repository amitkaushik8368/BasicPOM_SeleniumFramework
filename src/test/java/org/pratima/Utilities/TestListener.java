package org.pratima.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener
{
    private static ExtentReports extentReports = ExtentManager.getInstance();
    private static ThreadLocal<ExtentReports> test = new ThreadLocal<ExtentReports>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extentReports.createTest(result.getMethod().getMethodName());
        test.set(extentTest.getExtent());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //test.get().
    }
}
