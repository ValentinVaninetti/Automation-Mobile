package com.solvd.carina.mobile.gui.pages.common.components;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.mobile.gui.pages.android.SearchPage;
import org.openqa.selenium.WebDriver;

public abstract class SearchComponentBase extends AbstractPage {

    public SearchComponentBase(WebDriver driver) {
        super(driver);
    }

    public abstract SearchPage clickOnFirstSearch();

    public abstract void typeSomething(String something);

}
