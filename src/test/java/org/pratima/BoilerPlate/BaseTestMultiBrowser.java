package org.pratima.BoilerPlate;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTestMultiBrowser
{
    public WebDriver driver;

    @Parameters("browser")
    public void startBrowser(@Optional("edge") String browser)
    {
        switch (browser.toLowerCase()){
            case "chrome" :
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "edge" :
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--start-maximized");
                driver = new EdgeDriver(edgeOptions);
                break;

            default:
                throw new IllegalArgumentException("Browser Not Supported : " + browser);
        }

    }

    public void closeBrowser()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver!=null)
            driver.quit();
    }
}
