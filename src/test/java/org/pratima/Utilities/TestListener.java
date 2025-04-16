package org.pratima.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.pratima.BoilerPlate.BaseTestThreadLocal;
import org.pratima.Pages.LoginPage;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener  extends BaseTestThreadLocal implements ITestListener
{

    @Override
    public void onTestFailure(ITestResult result) {
        LoginPage.takeFullScreenshot(threadedDriver());
    }
}
