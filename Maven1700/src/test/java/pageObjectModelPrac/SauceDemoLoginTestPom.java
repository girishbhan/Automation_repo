package pageObjectModelPrac;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class SauceDemoLoginTestPom extends SeleniumUtility {
  //WebDriver driver;
	@BeforeClass
	public void setUp() {
	driver = setUp("firefox","http://saucedemo.com");
	}
  @Test
  public void testLogin () {
	  SauceDemoLoginPoc res = new SauceDemoLoginPoc(driver);//cons. undefined means cons of that class is parameterised
	  res.setUpUser("standard_user");
	  res.setUpPassword("secret_sauce");
	  res.loginBtnClick();
	  
	  
  }
}
