package SeptemberPrac;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ReusableComponent.SeleniumUtility;

public class DataProviderSauceDemo extends SeleniumUtility {
	ExtentReports extentReports;
	ExtentTest extentTest;
	boolean status;
	String expectedTitle = "Swag Labs";

	@BeforeClass
	public void preConditions() {
		extentReports = new ExtentReports(".\\ExtentReport\\SauceDemo.html");
		
	
		driver = setUp("firefox", "https://www.saucedemo.com/");
	//	extentReports = new ExtentReports(".\\ExtentReport\\SauceDemo.html");
		//extentTest=extentReports.startTest("testLogin");
	}

	@DataProvider(name = "data")
	public Object[][] loginData() {
		Object[][] data = { { "problem_user", "secret_sauce" }, { "standard_user", "secret_sauce" },
				{ "performance_glitch_user", "secret_sauce" }, };
		return data;
	}

	@Test(priority = 1, enabled = true, dataProvider = "data")
	public void testLogin(String userName, String passwd) {
		extentTest=extentReports.startTest(userName);
		typeInput(driver.findElement(By.id("user-name")), userName);
		typeInput(driver.findElement(By.id("password")), passwd);
		clickOnElement(driver.findElement(By.id("login-button")));
		String actualTitle = getCurrentTitleOfApplication();
		status = actualTitle.equals(expectedTitle);
		Assert.assertTrue(status);
	}

@AfterTest
	public void postConditions() {
		if (status) {
			extentTest.log(LogStatus.PASS,"Login validation is successful");
		} else {
			extentTest.log(LogStatus.FAIL,"Login validation is not successful");
		}
		extentReports.endTest(extentTest);
		extentReports.flush();
	}

}


