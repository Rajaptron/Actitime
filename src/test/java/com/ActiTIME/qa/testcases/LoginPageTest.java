package com.ActiTIME.qa.testcases;

import org.openqa.selenium.support.PageFactory;

import com.ActiTIME.qa.base.TestBase;
import com.ActiTIME.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	static LoginPage lp;

	public LoginPageTest() {
		super();
		PageFactory.initElements(driver, this);
	}

}
