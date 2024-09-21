package TestNgPractice2;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ReusableComponent.ExcelUtility;
import ReusableComponent.SeleniumUtility;


	public class SauceDemoPrac extends SeleniumUtility{
	 String path =".\\src\\test\\resources\\testData\\AppData.xlsx";
	String url =ExcelUtility.getCellValue(path,"TC",3, 0);
	String userName =ExcelUtility.getCellValue(path,"TC",3, 1);
	String passwd =ExcelUtility.getCellValue(path,"TC",3, 2);
	String expectedTitle=ExcelUtility.getCellValue(path, "TC",3, 3);
	String status;
	@BeforeTest
	public void login() {
	driver= setUp("firefox",url);	
}
 @Test(priority=1,enabled=true)
 public void loginAndValidate() {
	 typeInput(driver.findElement(By.name("username")),userName);
	 typeInput(driver.findElement(By.name("password")),passwd);
	 clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
	 String actualTitle = getCurrentTitleOfApplication();
	 if(actualTitle.equals(expectedTitle)) {
		 status="PASS";
	 }else { status ="FAIL";
 }
	 ExcelUtility.updateCellValue(path, "TC", 3, 4, actualTitle);
	 ExcelUtility.updateCellValue(path, "TC", 3, 5, status);
 }
 @AfterTest
 public void closeBrowser() {
	 driver.quit();
 }
}