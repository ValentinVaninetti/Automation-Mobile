package com.solvd.carina.mobile.gui.pages.android.components;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.mobile.gui.pages.android.SearchPage;
import com.solvd.carina.mobile.gui.pages.common.components.ProfileComponentBase;
import com.solvd.carina.mobile.gui.pages.common.components.SearchComponentBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SearchComponentBase.class)

public class SearchComponent extends SearchComponentBase {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]")
    private ExtendedWebElement firstSearch;

    @FindBy(id = "com.reddit.frontpage:id/feed_control_search_icon")
    private ExtendedWebElement search;

    @FindBy(id="com.reddit.frontpage:id/search")
    private ExtendedWebElement searchType;



    public SearchComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public SearchPage clickOnFirstSearch() {
        firstSearch.click();
        return new SearchPage(driver);
    }

    @Override
    public void typeSomething(String something) {
        searchType.type(something);
    }

}
