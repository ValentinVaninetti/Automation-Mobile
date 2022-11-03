package com.solvd.carina.demo.mobile.gui.pages.android;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.LoginPageBase;

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
