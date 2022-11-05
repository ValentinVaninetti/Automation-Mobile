package com.solvd.carina.mobile.gui.pages.common.components;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class NavBarComponentBase extends AbstractPage {

    public NavBarComponentBase(WebDriver driver) {
        super(driver);
    }
    public abstract void NavbarClick();
    public abstract void AllButtonClick();
    public abstract boolean isAllButtonElementPresent();

}

