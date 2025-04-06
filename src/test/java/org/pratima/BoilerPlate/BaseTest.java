package org.pratima.BoilerPlate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.*;

public class BaseTest
{
    public WebDriver driver;

    @BeforeClass
    public void startBrowser()
    {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        driver = new EdgeDriver(options);

    }

    @AfterClass
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
