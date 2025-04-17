package org.pratima.Tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pratima.BoilerPlate.BaseTestThreadLocal;
import org.testng.annotations.Test;

import java.io.File;

public class Screenshot_Exception extends BaseTestThreadLocal
{
    @Test
    public void screenshotException()
    {
        threadedDriver().get("https://www.google.com");
        threadedDriver().quit();
        File screenshot = ((TakesScreenshot) threadedDriver()).getScreenshotAs(OutputType.FILE);
    }
}
