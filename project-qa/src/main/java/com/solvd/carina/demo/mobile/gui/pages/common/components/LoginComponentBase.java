package com.solvd.carina.demo.mobile.gui.pages.common.components;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.android.LoginPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginComponentBase extends AbstractPage {

    public LoginComponentBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginPage clickLogIn();

}
