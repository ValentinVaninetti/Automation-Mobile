package com.solvd.carina.android;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.solvd.carina.demo.mobile.gui.pages.android.LoginPage;
import com.solvd.carina.demo.mobile.gui.pages.android.components.LoginComponent;
import com.solvd.carina.demo.mobile.gui.pages.android.components.ProfileComponent;
import com.solvd.carina.demo.mobile.gui.pages.common.HomePageBase;
import org.testng.annotations.Test;

public class ProfileComponentTest implements IAbstractTest, IMobileUtils {


   @Test()
    public void logIn() throws InterruptedException {
        HomePageBase homePageBase = initPage(getDriver(), HomePageBase.class);
        homePageBase.clickSkip();
        ProfileComponent profileComponent = homePageBase.clickProfile();
        LoginComponent loginComponent = profileComponent.clickSignUpLogIn();
        LoginPage loginPage = loginComponent.clickLogIn();
        loginPage.clickUsername();
        loginPage.clickPassword();
        loginPage.clickContinue();
        Thread.sleep(3000);

        // inspector cant make a screenshot. secure flag problem.

    }
}
