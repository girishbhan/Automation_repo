package pageObjectModelPrac;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class OrangeHrmLoginTest extends SeleniumUtility {
	WebDriver driver;
@BeforeClass
void setUp() {
	driver=setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

  @Test
  public void testLogin() {
	  OrangeHrmLoginPoc ref = new OrangeHrmLoginPoc(driver);
	  ref.userNameInput("Admin");
	  ref.passwdInput("admin123");
	  ref.loginBtn();
	  
	  
  }
}
