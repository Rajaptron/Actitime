package LoginPage_Test;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_main.TestBase;
import Pages_main.LoginPage;

public class LoginTest extends TestBase{
	static LoginPage login;
	
	public void LoginPageTest() throws IOException {
	
		PageFactory.initElements(driver, this);
	}
	
	@BeforeMethod 
	  public static void Setup() throws IOException, InterruptedException {
		initialization();
		Thread.sleep(1000);
		login=new LoginPage();
				}
	
	@Test
	public static void forgetPassword() throws IOException, InterruptedException {
       login.Forgetpass();
      String Actual="Cannot recover login info.
       Please make sure that everything is typed in correctly.";
       //System.out.println(text);
      // Assert.assertEquals(text, Actual);
       
	
	}
	
	
	
	@AfterMethod
	public void teardown() {
        //driver.quit();
 	
 		}


}
