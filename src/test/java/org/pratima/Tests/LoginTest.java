package org.pratima.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pratima.BoilerPlate.BaseTest;
import org.pratima.BoilerPlate.BaseTestMultiBrowser;
import org.pratima.BoilerPlate.BaseTestThreadLocal;
import org.pratima.Pages.LoginPage;
import org.pratima.Utilities.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.swing.text.Utilities;
import java.sql.Time;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Listeners(TestListener.class)
public class LoginTest extends BaseTestThreadLocal
{
    @Test(retryAnalyzer = org.pratima.Utilities.TestListener.class)
    public void loginVWO() {

        threadedDriver().get("https://app.vwo.com");
        LoginPage loginPage = new LoginPage(threadedDriver());
        loginPage.enterLoginEmail("amit.kaushik9466@gmail.com");
        loginPage.enterLoginPass("Amit@123");
        loginPage.clickLoginButton();

        WebDriverWait wait = new WebDriverWait(threadedDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Basic Account Setup']")));
        WebElement dashElement = threadedDriver().findElement(By.xpath("//h1[text()='Basic Account Setup']"));

        threadedDriver().navigate().refresh();
        try {
            Assert.assertEquals(dashElement.getText(), "Basic Account Setup");
        }catch (StaleElementReferenceException e)
        {
            System.out.println("Stale Exception appeared: " + e.getMessage());
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Basic Account Setup']")));
            WebElement dashElement_1 = threadedDriver().findElement(By.xpath("//h1[text()='Basic Account Setup']"));
            Assert.assertEquals(dashElement_1.getText(), "Basic Account Setu");
        }



    }
}
