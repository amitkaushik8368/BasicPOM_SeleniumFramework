package org.pratima.Tests;

import org.pratima.BoilerPlate.BaseTestThreadLocal;
import org.testng.annotations.Test;

public class LoginTest_02 extends BaseTestThreadLocal
{

    @Test
    public void launchHeroku()
    {
        threadedDriver().get("https://katalon-demo-cura.herokuapp.com/");
    }

    @Test
    public void randomLaunch()
    {
        threadedDriver().get("https://httpbin.org/html");
    }


}
