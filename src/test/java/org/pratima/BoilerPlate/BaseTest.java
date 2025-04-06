package org.pratima.BoilerPlate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
    public WebDriver driver;

    @BeforeTest
    public void startBrowser()
    {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        driver = new EdgeDriver(options);

    }

    @AfterTest
    public void closeBrowser()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver!=null)
            driver.quit();
    }


}
