package com.ActiTIME.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ActiTIME.qa.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	static WebElement UserName;
	@FindBy(xpath = "//input[@name='pwd']")
	static WebElement Password;
	@FindBy(xpath = "//a[@id='loginButton']")
	static WebElement LoginButton;

	public static String Login(String username, String password) {
		UserName.sendKeys(username);
		Password.sendKeys(password);
		LoginButton.click();
		String Title = driver.getTitle();
		return Title;
	}

}
