package LoginPage_Test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_main.TestBase;
import Pages_main.LoginPage;
import Pages_main.Users;

public class UsersPage extends TestBase{
	
	static Users Add_Users;
    static LoginPage login;
	
	public void UsersTest() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	@BeforeMethod 
	  public static void Setup() throws IOException, InterruptedException {
		initialization();
		Thread.sleep(1000);
		Add_Users=new Users();
		login=new LoginPage();
				}
	
	@Test
	public static void NewUser() throws InterruptedException {
		login.ValidLogin();
		Thread.sleep(1000);
		Add_Users.AddUser();
	
	}
	
	@AfterMethod
	public void teardown() {
      driver.quit();
	
		}




}
