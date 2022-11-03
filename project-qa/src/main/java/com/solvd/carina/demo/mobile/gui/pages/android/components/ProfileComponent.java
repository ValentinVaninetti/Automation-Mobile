package com.solvd.carina.demo.mobile.gui.pages.android.components;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.pages.common.components.ProfileComponentBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProfileComponentBase.class)
public class ProfileComponent extends ProfileComponentBase {

    @FindBy(id ="com.reddit.frontpage:id/drawer_nav_item_title")
    private ExtendedWebElement logInSignUp;

    public ProfileComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginComponent clickSignUpLogIn() {
        logInSignUp.click();
        return new LoginComponent(getDriver());
    }


}
