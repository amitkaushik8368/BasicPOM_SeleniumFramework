package org.pratima.Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.pratima.BoilerPlate.BaseTestThreadLocal;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows extends BaseTestThreadLocal
{
    @Test
    public void multipleWindowTest()
    {
        threadedDriver().get("https://www.google.com");

        ((JavascriptExecutor) threadedDriver()).executeScript("window.open('https://www.bing.com');");
        ((JavascriptExecutor) threadedDriver()).executeScript("window.open('https://www.guru99.com', '_blank', 'noopener,noreferrer,width=800,height=600');");


        System.out.println("Current Window: " + threadedDriver().getWindowHandle());
        threadedDriver().close();

        Set<String> getWindowHandles = threadedDriver().getWindowHandles();

        //threadedDriver().close();
        for (String str: getWindowHandles)
        {

            threadedDriver().switchTo().window(str);
            System.out.println("Window Handle Id: " + str + " URL: " + threadedDriver().getCurrentUrl());
            threadedDriver().close();

        }


        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
