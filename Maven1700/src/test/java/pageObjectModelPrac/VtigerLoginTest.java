package pageObjectModelPrac;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class VtigerLoginTest extends SeleniumUtility{
	WebDriver driver;
	@BeforeClass
	public void setUp() {
	 driver = setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	}
	
  @Test
  public void testLogin() {
	 VtigerLogin ref = new VtigerLogin(driver);
	 ref.setUserName("admin");
	 ref.setPassword("admin");
	 ref.clickOnLoginBtn();
	 
  }
}
