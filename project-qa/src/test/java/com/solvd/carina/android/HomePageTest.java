package com.solvd.carina.android;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.solvd.carina.demo.mobile.gui.pages.common.HomePageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest implements IAbstractTest, IMobileUtils {

    @Test()
    public void testOpenReddit() throws InterruptedException {
        HomePageBase home  = initPage(getDriver(), HomePageBase.class);
        home.clickSkip();
        Assert.assertTrue(home.isElementPresent(),"Element is not here");
    }
}
