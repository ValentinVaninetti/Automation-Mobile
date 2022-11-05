package com.solvd.carina.mobile.gui.pages.android;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.mobile.gui.pages.android.components.ProfileComponent;
import com.solvd.carina.mobile.gui.pages.android.components.SearchComponent;
import com.solvd.carina.mobile.gui.pages.common.HomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(id = "com.reddit.frontpage:id/skip_button")
    private ExtendedWebElement skipButton;
    @FindBy(id = "com.reddit.frontpage:id/feed_control_search_icon")
    private ExtendedWebElement search;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Profile avatar\"]/android.widget.ImageView")
    private ExtendedWebElement profile;

    @FindBy(id = "com.reddit.frontpage:id/item_community_nav_icon_large")
    private ExtendedWebElement navBar;
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @Override
    public void clickSkip(){
        if(skipButton.isElementPresent(5000)) {
            skipButton.click();
        }
    }

    @Override
    public ProfileComponent clickProfile() {
        profile.click();
        return new ProfileComponent(getDriver());
    }

    @Override
    public boolean isNavBarElementPresent() {
        return navBar.isElementPresent();
    }

    @Override
    public boolean isSearchElementPresent() {
        return search.isElementPresent();
    }

    @Override
    public SearchComponent clickSearch() {
        if (search.isElementPresent()){
            search.click();
        }
        return new SearchComponent(driver);
    }
}
