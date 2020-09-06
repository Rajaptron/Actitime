package com.ActiTIME.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ActiTIME.qa.base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		super();
		PageFactory.initElements(driver, this);
	}
}
