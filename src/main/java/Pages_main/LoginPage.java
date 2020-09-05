package Pages_main;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_main.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(id="toPasswordRecoveryPageLink")
	static WebElement forgetpassword ;
	
	@FindBy(id="forgetPasswordEmailOrUsername")
    static WebElement forgetemail;
	
	@FindBy(id="forgetPasswordButton")
	static WebElement forgetbutton;
	
	@FindBy(xpath="(//td[@id='errorContainer'])[1]/span")
	static WebElement errormessage;
	
	@FindBy(id="username")
	static WebElement UserName_Field;
	
	@FindBy(name="pwd")
	static WebElement Password;
	
	@FindBy(id="loginButton")
	static WebElement LoginButton;
	
	@FindBy(xpath="//div[@class='tooltip-content']")
	static WebElement validmessage;
	
	
	public static String Forgetpass() throws InterruptedException {
		Thread.sleep(3000);
		forgetpassword.click();
		forgetemail.sendKeys("Vineet@yopmail.com");
		forgetbutton.click();
		Thread.sleep(2000);
		boolean error=errormessage.isDisplayed();
		String text=errormessage.getText();
		System.out.println(text);
		System.out.println(error);
		return text;
	}
	
	public static void ValidPassword() throws InterruptedException {
		Forgetpass();
		boolean valid=validmessage.isDisplayed();
		System.out.println(valid);
	}
	
	public static void ValidLogin() {
		UserName_Field.sendKeys("vineet.ece2014@gmail.com");
		Password.sendKeys("GEsyHevU");
		LoginButton.click();
	}

}
