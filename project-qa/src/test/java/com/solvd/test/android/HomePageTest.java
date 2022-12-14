package com.solvd.test.android;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.solvd.test.mobile.gui.pages.common.HomePageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest implements IAbstractTest, IMobileUtils {

    @Test()
    public void testOpenReddit() throws InterruptedException {
        HomePageBase home  = initPage(getDriver(), HomePageBase.class);
        Thread.sleep(2000);
        home.clickSkip();
        Assert.assertTrue(home.isElementPresent(),"Element is not here");
    }
}
