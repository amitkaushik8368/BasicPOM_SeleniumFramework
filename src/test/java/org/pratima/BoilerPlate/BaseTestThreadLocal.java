package org.pratima.BoilerPlate;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.*;

public class BaseTestThreadLocal
{
    private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();


    @BeforeMethod
    @Parameters("browser")
    public void startBrowser(@Optional("edge") String browser)
    {
        WebDriver localDriver = null;
        switch (browser.toLowerCase()){
            case "chrome" :
                localDriver = new ChromeDriver();
                break;
            case "edge" :
                localDriver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser Not Supported : " + browser);
        }
        localDriver.manage().window().maximize();
        threadLocal.set(localDriver);

    }

    public WebDriver getDriver()
    {
        return threadLocal.get();
    }


    @AfterMethod
    public void closeBrowser()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (getDriver()!=null)
        {
            getDriver().quit();
            threadLocal.remove();
        }
    }
}
