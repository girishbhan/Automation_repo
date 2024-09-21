package OpenCartProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class RegisterFunctionality extends SeleniumUtility {
@BeforeTest
public void openBrowser() {
	setUp("firefox","https://opencart.com/demo/");

}
@BeforeMethod
public void openRegisterAcctPage() {
	clickOnElement(driver.findElement(By.xpath("//div[@class='nav float-end']//i[@class='fa-solid fa-caret-down']")));
	clickOnElement(driver.findElement(By.xpath("//div[@class='nav float-end']//i[@class='fa-solid fa-caret-down']")));
	clickOnElement(driver.findElement(By.xpath("//div[@class='nav float-end']//i[@class='fa-solid fa-caret-down']")));
	clickOnElement(driver.findElement(By.xpath("//div[@class='nav float-end']//i[@class='fa-solid fa-caret-down']")));
	clickOnElement(driver.findElement(By.xpath("//div[@class='nav float-end']//i[@class='fa-solid fa-caret-down']")));
	clickOnElement(driver.findElement(By.xpath("//div[@class='nav float-end']//i[@class='fa-solid fa-caret-down']")));
    clickOnElement(driver.findElement(By.xpath("//a[text()='Register']")));
	}

  @Test
  public void registerAcctValidation() {
	typeInput(driver.findElement(By.id("input-firstname")),"girish");
	typeInput(driver.findElement(By.id("input-lastname")),"bhangale");
	typeInput(driver.findElement(By.id("input-email")),"girishhhhhhhh@gmail.com");
	typeInput(driver.findElement(By.id("input-password")),"girish");
	//clickOnElement(driver.findElement(By.id("input-newsletter")));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()",driver.findElement(By.name("agree")));
	//clickOnElement(driver.findElement(By.name("agree")));
	js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[text()='Continue']")));
	//clickOnElement(driver.findElement(By.xpath("//button[text()='Continue']")));
	String expectedTitle = "Your Account Has Been Created!";
	String ActualTitle= getCurrentTitleOfApplication(expectedTitle);
	Assert.assertTrue(true,"Error has been occured while getting the title");
 }
  
  
  
  
  
}
