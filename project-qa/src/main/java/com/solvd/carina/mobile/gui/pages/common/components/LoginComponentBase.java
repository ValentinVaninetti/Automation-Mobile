package com.solvd.carina.mobile.gui.pages.common.components;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginComponentBase extends AbstractPage {

    public LoginComponentBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickLogIn();

}
