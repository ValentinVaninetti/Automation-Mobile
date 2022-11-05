package com.solvd.test.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class NavBarPageBase extends AbstractPage {

    public NavBarPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract void clickSkip() throws InterruptedException;
    public void NavbarClick(){

    }
    public void AllButtonClick(){

    }
    public void type(){

    }
    public void SearchClick(){

    }
    public abstract boolean isNavBarElementPresent();
    public abstract boolean isAllButtonElementPresent();
    public abstract boolean isSearchElementPresent();

}

