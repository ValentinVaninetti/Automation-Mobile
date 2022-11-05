package com.solvd.test.demo.mobile.gui.pages.ios;

import com.solvd.test.mobile.gui.pages.common.LoginPageBase;
import org.openqa.selenium.WebDriver;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
@DeviceType(pageType = Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {


	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void clickUsername() {
	}

	@Override
	public void clickPassword() {

	}

	@Override
	public void clickContinue() {

	}

}
