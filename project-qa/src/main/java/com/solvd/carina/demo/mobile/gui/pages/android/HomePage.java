package com.solvd.carina.demo.mobile.gui.pages.android;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.pages.common.HomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(id = "com.reddit.frontpage:id/skip_button")
    private ExtendedWebElement skipButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @Override
    public void clickSkip(){
        skipButton.click();

    }
}
