package com.solvd.carina.mobile.gui.pages.android;

import com.solvd.carina.mobile.gui.pages.common.LoginPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils {

    @FindBy(id = "")
    private ExtendedWebElement username;
    @FindBy(id = "")
    private ExtendedWebElement password;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickUsername() {

    }
    @Override
    public void clickPassword() {

    }


}
