package com.solvd.test.mobile.gui.pages.android.components;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.test.demo.mobile.gui.pages.android.LoginPage;
import com.solvd.test.mobile.gui.pages.common.components.LoginComponentBase;
import com.solvd.test.mobile.gui.pages.common.components.ProfileComponentBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProfileComponentBase.class)
public class LoginComponent extends LoginComponentBase {

    @FindBy(id = "com.reddit.frontpage:id/login_cta")
    private ExtendedWebElement logIn;
    public LoginComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage clickLogIn() {
        logIn.click();
        return new LoginPage(getDriver());
    }

}
