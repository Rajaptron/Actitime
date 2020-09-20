package com.ActiTIME.qa.pages;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTIME.qa.base.TestBase;

public class SignUpPage extends TestBase {

	public SignUpPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='button header__button']")
	static WebElement SignUpButton;

	@FindBy(xpath = "//input[@id='first-name']")
	static WebElement FirstName;

	@FindBy(xpath = "//input[@id='last-name']")
	static WebElement LastName;

	@FindBy(xpath = "//input[@id='email']")
	static WebElement EmailField;

	@FindBy(xpath = "//input[@id='company']")
	static WebElement Company;

	@FindBy(xpath = "//input[@id='start-trial-submit']")
	static WebElement StartButton;

	@FindBy(xpath = "//h1")
	static WebElement ProccessingText;

	@FindBy(xpath = "//h2")
	static WebElement TrialReadyText;

	public String SignUpForm(String firstname, String lastname, String email, String companyname)
			throws InterruptedException {
		SignUpButton.click();
		Thread.sleep(30000);
		String TitleSignUp = driver.getTitle();
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastname);
		EmailField.sendKeys(email);
		Company.sendKeys(companyname);
		StartButton.click();
		return TitleSignUp;
	}

	// Assertion for Text Displayed Return in List of Strings
	public List<String> PostSignUp() {
		String ProcessText = ProccessingText.getText();
		String ReadyText = TrialReadyText.getText();
		return Arrays.asList(ProcessText, ReadyText);
	}

}
