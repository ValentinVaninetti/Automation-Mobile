package com.solvd.carina.android;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.solvd.carina.mobile.gui.pages.android.components.SearchComponent;
import com.solvd.carina.mobile.gui.pages.common.HomePageBase;
import com.solvd.carina.mobile.gui.pages.common.SearchPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPageTest  implements IAbstractTest, IMobileUtils {


    @Test()
    public void searchWorks() throws InterruptedException {
        HomePageBase homePageBase = initPage(getDriver(), HomePageBase.class);
        homePageBase.clickSkip();
        SearchComponent searchComponent = homePageBase.clickSearch();
        searchComponent.typeSomething("peronia");
        SearchPageBase searchPageBase = searchComponent.clickOnFirstSearch();
        Assert.assertTrue(searchPageBase.isProfileElementPresent(),"Profile picture element is not present");
    }

}
