package TestNgPractice2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ReusableComponent.ExcelUtility;
import ReusableComponent.SeleniumUtility;

public class VtigerLoginWithExcel extends SeleniumUtility{
	 String path =".\\src\\test\\resources\\testData\\AppData.xlsx";
	 String url = ExcelUtility.getCellValue(path, "TC", 1, 0);
	 String userName = ExcelUtility.getCellValue(path, "TC", 1, 1);
	 String passwd = ExcelUtility.getCellValue(path, "TC", 1, 2);
	 String expectedTitle =ExcelUtility.getCellValue(path, "TC",1 , 3);
	 String status,actualTitle;
	 
	 
@BeforeTest
public void preconditions() {

 driver = setUp("firefox",url);
}

 @Test(priority=1,enabled = true)
  public void loginAndValidate() {
	typeInput(driver.findElement(By.id("username")),userName);
	typeInput(driver.findElement(By.name("pwd")),passwd);
	clickOnElement(driver.findElement(By.cssSelector("#loginButton>div")));
	String actualTitle= getCurrentTitleOfApplication();
	if(actualTitle.equals(expectedTitle)) {
		status = "PASS";
	}else {
		status="FAIL";}
	Assert.assertEquals(actualTitle, expectedTitle);
	  ExcelUtility.updateCellValue(path, "TC", 1, 4,actualTitle);	
	  ExcelUtility.updateCellValue(path, "TC", 1, 5, status);	 
}

 @AfterTest
 public void postConditions() {
   driver.quit();
	}
}