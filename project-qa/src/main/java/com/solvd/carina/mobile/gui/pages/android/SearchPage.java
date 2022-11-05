package com.solvd.carina.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.mobile.gui.pages.common.LoginPageBase;
import com.solvd.carina.mobile.gui.pages.common.SearchPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SearchPageBase.class)
public class SearchPage extends SearchPageBase {

    @FindBy(id = "com.reddit.frontpage:id/profile_icon")
    private ExtendedWebElement profilePic;
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProfileElementPresent() {
        return profilePic.isPresent();
    }
}
