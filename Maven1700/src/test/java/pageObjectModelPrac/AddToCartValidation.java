package pageObjectModelPrac;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class AddToCartValidation extends SeleniumUtility {
	WebDriver driver;
	
@BeforeClass
void setUp() {
	driver= setUp("Chrome","http://saucedemo.com");
}
@BeforeMethod
void testAddCart() {
SauceDemoLoginTestPom ref = new SauceDemoLoginTestPom();
ref.testLogin();
AddElement rev = new AddElement(driver);// for all POC object creation we need to pass the driver in constructor
rev.addBagPack();
rev.addToCartLogo();
rev.checkElement();
rev.checkElement();
Assert.assertTrue(rev.checkElement());//need to ask is the validation ok or not?
}
@Test
void f() {
}
}