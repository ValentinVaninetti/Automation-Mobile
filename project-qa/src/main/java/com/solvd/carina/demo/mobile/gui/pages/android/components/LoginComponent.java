package com.solvd.carina.demo.mobile.gui.pages.android.components;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.pages.common.components.LoginComponentBase;
import com.solvd.carina.demo.mobile.gui.pages.common.components.ProfileComponentBase;
import org.apache.logging.log4j.core.impl.ExtendedStackTraceElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProfileComponentBase.class)
public class LoginComponent extends LoginComponentBase {

    @FindBy(id = "00000000-0000-01ab-ffff-ffff00000200")
    private ExtendedWebElement logIn;
    public LoginComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickLogIn() {
        logIn.click();
    }

}
