package com.solvd.carina.demo.mobile.gui.pages.common.components;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.android.components.LoginComponent;
import groovy.util.logging.Log;
import org.openqa.selenium.WebDriver;

public abstract class ProfileComponentBase extends AbstractPage {

    public ProfileComponentBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginComponent clickSignUpLogIn();

}
