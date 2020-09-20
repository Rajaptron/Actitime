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

	@FindBy(xpath = "//input[@id='username']")
	static WebElement UsernameField;

	@FindBy(xpath = "//input[@type='password']")
	static WebElement PasswordField;

	@FindBy(xpath = "//a[@id='loginButton']")
	static WebElement LoginButton;

	@FindBy(xpath = "//input[@id='keepLoggedInCheckBox']")
	static WebElement RememberMeCheckBox;

	@FindBy(xpath = "//span[@class='errormsg']")
	static WebElement ErrorMessage;
	
	@FindBy(xpath = "//a[@id='toPasswordRecoveryPageLink']")
	static WebElement ForgetPasswordLink;
	
	public static void Login(String username, String password) throws InterruptedException {
		UsernameField.sendKeys(username);
		PasswordField.sendKeys(password);
		LoginButton.click();
		Thread.sleep(3000);
	}

}
