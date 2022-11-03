package com.solvd.carina.mobile.gui.pages.common.components;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.mobile.gui.pages.android.components.LoginComponent;
import org.openqa.selenium.WebDriver;

public abstract class ProfileComponentBase extends AbstractPage {

    public ProfileComponentBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginComponent clickSignUpLogIn();

}
