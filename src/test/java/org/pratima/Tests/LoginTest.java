package org.pratima.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pratima.BoilerPlate.BaseTest;
import org.pratima.BoilerPlate.BaseTestMultiBrowser;
import org.pratima.BoilerPlate.BaseTestThreadLocal;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTestThreadLocal
{
    @Test
    public void launchBing()
    {
        threadedDriver().get("https://www.bing.com/");
        threadedDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        //driver.get("https://app.vwo.com/");

        // Put assertion on text "Basic Account Setup"
    }


    @Test
    public void launchGoogle()
    {
        threadedDriver().get("https://www.google.com/");

    }
}
