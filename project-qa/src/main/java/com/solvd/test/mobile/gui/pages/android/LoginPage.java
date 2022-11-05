package com.solvd.test.demo.mobile.gui.pages.android;

import com.solvd.test.mobile.gui.pages.common.LoginPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils {

    @FindBy(id = "username")
    private ExtendedWebElement username1;
    @FindBy(id = "password")
    private ExtendedWebElement password1;
    @FindBy(id = "com.reddit.frontpage:id/confirm")
    private ExtendedWebElement conntinue;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickUsername() {
        username1.click();
        username1.type("automation_test");
        hideKeyboard();
    }
    @Override
    public void clickPassword() {
        password1.click();
        password1.type("12345automat");
    }
    @Override
    public void clickContinue() {
        conntinue.click();
    }


}
