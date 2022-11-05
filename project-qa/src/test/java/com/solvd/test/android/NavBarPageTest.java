package com.solvd.test.android;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.solvd.test.mobile.gui.pages.common.NavBarPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavBarPageTest implements IAbstractTest, IMobileUtils {
    @Test(priority = 1)
    public void TestclikedNavbar() throws InterruptedException {
        NavBarPageBase navbar = initPage(getDriver(), NavBarPageBase.class);
        Thread.sleep(3000);
        navbar.clickSkip();
        Thread.sleep(3000);
        //navbar.NavbarClick();
        //Thread.sleep(4000);
        //navbar.AllButtonClick();
        //Thread.sleep(4000);
        navbar.SearchClick();
        Thread.sleep(2000);
        navbar.type();
        Thread.sleep(2000);
        Assert.assertTrue(navbar.isNavBarElementPresent(),"Element is not here");
        Assert.assertTrue(navbar.isAllButtonElementPresent(),"Element is not here");
    }

}