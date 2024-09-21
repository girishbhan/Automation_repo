package TestNgPractice2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ReusableComponent.ExcelUtility;
import ReusableComponent.SeleniumUtility;
/*1. Open the application URL
2. Enter the valid login credentials
3. Click on the login Button
4.Add a product to cart
5.Click on the shopping cart icon
6. Click on the Menu icon and desired navitem*/
public class SauceDemoOrder extends SeleniumUtility {
	String url = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\Details.xlsx", "Sheet1", 1, 0);
	String userName = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\Details.xlsx", "Sheet1", 1, 1);
	String passwd = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\Details.xlsx", "Sheet1", 1, 2);
	String validationMsg = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\Details.xlsx", "Sheet1", 1, 3);
	String status;

	@BeforeMethod //need to ask about using beforeclass and beforemethod
	public void preRequisite() {
		driver = setUp("firefox", url);
		typeInput(driver.findElement(By.id("user-name")), userName);
		typeInput(driver.findElement(By.id("password")), passwd);
		clickOnElement(driver.findElement(By.id("login-button")));
	}

	@Test(priority = 1, enabled = true)
	public void testAddProduct() {
		clickOnElement(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")));
		clickOnElement(driver.findElement(By.xpath("//button[text()='ADD TO CART']")));
		clickOnElement(driver.findElement(By.cssSelector("a.shopping_cart_link>svg>path")));
		boolean status = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed();// Validation
																											// done with
																											// text()
		Assert.assertTrue(status, "Product is not Added in Cart");
	}

	@Test(priority = 2, enabled = true)
	public void testCheckout() {
		clickOnElement(driver.findElement(By.cssSelector("a.shopping_cart_link>svg>path")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='CHECKOUT']")));
		typeInput(driver.findElement(By.id("first-name")), "Girish");
		typeInput(driver.findElement(By.id("last-name")), "b");
		typeInput(driver.findElement(By.id("postal-code")), "411057");
		clickOnElement(driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")));
		clickOnElement(driver.findElement(By.cssSelector(".btn_action.cart_button")));
		String actualMsg = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']")).getText();
		if(actualMsg.equals(validationMsg)) {
		status="PASS";
			}else { status="FAIL";
			}
		Assert.assertEquals(actualMsg, validationMsg);
			
	}

	@AfterMethod
	public void postOperations() {
		ExcelUtility.updateCellValue(".\\src\\test\\resources\\testData\\Details.xlsx","Sheet1",1,4,status);
		driver.quit();
	}
}
