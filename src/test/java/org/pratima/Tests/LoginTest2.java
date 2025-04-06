package org.pratima.Tests;

import org.pratima.BoilerPlate.BaseTest;
import org.testng.annotations.Test;

public class LoginTest2 extends BaseTest
{
    @Test
    public void anotherLogin()
    {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
    }
}
