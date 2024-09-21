package ClassAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoPractice {
	WebDriver driver;
@BeforeMethod
public void setUp() {
	driver=new ChromeDriver();
	driver.get("http://saucedemo.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
}
  @Test(priority=1)
  public void testLoginWithValidCredentials() {
  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
  driver.findElement(By.id("password")).sendKeys("secret_sauce");
  driver.findElement(By.id("login-button")).click();
  String actualTitle=driver.getTitle();
  Assert.assertEquals(actualTitle,"Swag Labs");
  }
  @Test(priority=2,invocationCount=1)
  public void testAddProductToCart() {
	  testLoginWithValidCredentials();
	  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	  driver.findElement(By.cssSelector(".shopping_cart_link")).click();
	  boolean addedProduct=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed();
	  Assert.assertTrue(addedProduct);
  }
}
