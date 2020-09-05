package Pages_main;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_main.TestBase;

public class Users extends TestBase {
	
	public Users() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='container_users']")
	static WebElement UsersTab;
	
	@FindBy(xpath="(//div[@class='components_button_label'])[1]")
     static WebElement NewUser;
	
	@FindBy(xpath="(//input[@name='firstName'])[2]")
	static WebElement FirstName;
	
	@FindBy(xpath="(//input[@name='lastName'])[2]")
	static WebElement LastName;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	static WebElement Email;
	
	@FindBy(xpath="(//div[@class='selectorPlaceholder'])/div[1]/div[1]")
	static WebElement Department;
	
	@FindBy(xpath="(//div[@class='itemsContainer'])/div[5]")
	static WebElement ItemSelected;
	
	@FindBy(xpath="(//td[@class='tumbler'])[2]/div")
	static WebElement TimeTrack;
	
	@FindBy(xpath="(//div[@class='components_button_label'])[4]")
	static WebElement Send;
	
	@FindBy(xpath="(//div[@class='addIcon'])")
     static WebElement AddIcon;
	
	public static void AddUser() throws InterruptedException {
		UsersTab.click();
		Thread.sleep(5000);
		NewUser.click();
		FirstName.sendKeys("Pallavi");
		LastName.sendKeys("Goel");
		Email.sendKeys("pal123@yopmail.com");
		Department.click();
		ItemSelected.click();
		TimeTrack.click();
		Send.click();
	}
	
}
