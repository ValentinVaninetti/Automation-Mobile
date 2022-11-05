package com.solvd.carina.mobile.gui.pages.android.components;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.mobile.gui.pages.common.components.NavBarComponentBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NavBarComponentBase.class)
public class NavBarComponent extends NavBarComponentBase {
    public NavBarComponent(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Search\"]")
    private ExtendedWebElement search;

    @FindBy(id="com.reddit.frontpage:id/search")
    private ExtendedWebElement searchType;
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"all\"]")
    private ExtendedWebElement allButton;
    @FindBy(xpath="com.reddit.frontpage:id/search_clear_icon")
    private ExtendedWebElement navBar;

    @FindBy(id = "com.reddit.frontpage:id/search_clear_icon")
    private ExtendedWebElement close;

    @Override
    public void NavbarClick() {
        if (navBar.isElementPresent()){
            navBar.click();
        }
    }

    @Override
    public void AllButtonClick(){
        if(allButton.isElementPresent()){
            allButton.click();
        }
    }
    @Override
    public boolean isAllButtonElementPresent(){
        return allButton.isElementPresent();
    }

}