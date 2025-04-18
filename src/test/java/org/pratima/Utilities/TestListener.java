package org.pratima.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.pratima.BoilerPlate.BaseTestThreadLocal;
import org.pratima.Pages.LoginPage;
import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener  extends BaseTestThreadLocal implements ITestListener, IRetryAnalyzer
{

    @Override
    public void onTestFailure(ITestResult result) {
        LoginPage.takeFullScreenshot(threadedDriver());
    }
    int count = 0;
    int retryMax = 1;

    @Override
    public boolean retry(ITestResult iTestResult) {

        System.out.println("Retrying Failed Test: " + iTestResult.getMethod().getMethodName());
        if (count<retryMax)
        {
            count++;
            return true;
        }
        return false;
    }
}
