package com.solvd.carina.mobile.gui.pages.android;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.mobile.gui.pages.common.NavBarPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NavBarPageBase.class)
public class NavBarPage extends NavBarPageBase {
    public NavBarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.reddit.frontpage:id/skip_button")
    private ExtendedWebElement skipButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Search\"]")
    private ExtendedWebElement search;
    @FindBy(id="com.reddit.frontpage:id/search")
    private ExtendedWebElement searchType;

    @FindBy(xpath="//android.widget.TextView[@content-desc=\"all\"]")
    private ExtendedWebElement allButton;

    @FindBy(xpath="//android.widget.ImageButton[@content-desc=\"Communities\"]")
    private ExtendedWebElement navBar;

    @Override
    public void NavbarClick() {
        if (navBar.isElementPresent()){
            navBar.click();
        }


    }
    @Override
    public void type(){
        searchType.type("peronia");

    }

    @Override
    public void AllButtonClick(){
        if(allButton.isElementPresent()){
            allButton.click();
        }
    }
    @Override
    public void SearchClick(){
        if (search.isElementPresent()){
            search.click();
        }
    }
    @Override
    public void clickSkip() throws InterruptedException {
        if (skipButton.isElementPresent()){
            skipButton.click();
        }

    }

    @Override
    public boolean isNavBarElementPresent() {
        return navBar.isElementPresent();
    }

    @Override
    public boolean isAllButtonElementPresent(){
        return allButton.isElementPresent();
    }

    @Override
    public boolean isSearchElementPresent(){
        return search.isElementPresent();
    }

}