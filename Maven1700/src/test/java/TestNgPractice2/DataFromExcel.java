package TestNgPractice2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ReusableComponent.ExcelUtility;
import ReusableComponent.SeleniumUtility;

public class DataFromExcel extends SeleniumUtility {
  @Test
  public void login() throws InterruptedException {
	 String path = ".\\src\\test\\resources\\testData\\Details.xlsx";
	  int rows= ExcelUtility.getRowCount(path,"Sheet2");

	 for(int r =0;r<rows;r++) {
		 
		 String userName = ExcelUtility.getCellValue(path,"Sheet2",r, 0);
		 String passwd =ExcelUtility.getCellValue(path, "Sheet2", r, 1);
			driver = setUp("firefox","https://saucedemo.com");
			typeInput(driver.findElement(By.id("user-name")), userName);
			typeInput(driver.findElement(By.id("password")), passwd);
			clickOnElement(driver.findElement(By.id("login-button")));
			clickOnElement(driver.findElement(By.id("react-burger-menu-btn")));
			clickOnElement(driver.findElement(By.id("logout_sidebar_link")));
		Thread.sleep(3000);
			 
			 
		 
		 
	 }
		
  }
}
