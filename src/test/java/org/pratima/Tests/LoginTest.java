package org.pratima.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pratima.BoilerPlate.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest
{
    @Test(priority = 1)
    public void loginVWO()
    {
        driver.get("https://app.vwo.com/");

        // Put assertion on text "Basic Account Setup"
    }


    @Test(priority = 2)
    public void loginTestingAcademy()
    {
        driver.get("https://courses.thetestingacademy.com/");
    }
}
