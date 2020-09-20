package com.ActiTIME.qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ActiTIME.qa.base.TestBase;
import com.ActiTIME.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase {

	static SignUpPage sp;

	public SignUpPageTest() {
		super();
		PageFactory.initElements(driver, this);
	}

	@BeforeMethod
	public static void setup() throws InterruptedException {
		initialization();
		Thread.sleep(1000);
		sp = new SignUpPage();
	}

	@Test
	public static void SignUpFormTest() throws InterruptedException {
		String Title = sp.SignUpForm("Vineet", "Kumar", "vineet.ece2016@gmail.com", "Test");
		Assert.assertEquals(Title, "Free Timesheet Online Trial");
	}

	@Test
	public static void ConfirmMessage() {

	}

	@AfterMethod
	public static void TearDown() {
		driver.quit();
	}

}