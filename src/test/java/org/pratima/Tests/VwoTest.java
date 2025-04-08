package org.pratima.Tests;

import org.pratima.BoilerPlate.BaseTestThreadLocal;
import org.testng.annotations.Test;

public class VwoTest extends BaseTestThreadLocal
{
    @Test
    public void createFreeAccount()
    {
        threadedDriver().get("https://app.vwo.com/#/login");

    }
}
