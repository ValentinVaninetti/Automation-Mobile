package com.solvd.carina.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.mobile.gui.pages.android.components.ProfileComponent;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }
    public abstract void clickSkip();
    public abstract ProfileComponent clickProfile();
    public abstract boolean isElementPresent();
}
