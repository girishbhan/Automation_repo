package OpenCartProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ReusableComponent.ExcelUtility;
import ReusableComponent.SeleniumUtility;

public class LoginFunctionalityTest extends SeleniumUtility {
 String path = ".\\src\\test\\resources\\testData\\Project.xlsx";
 String url = ExcelUtility.getCellValue(path,"Sheet1" , 1, 0);
 String userName = ExcelUtility.getCellValue(path,"Sheet1" , 1, 1);
 String passwd =ExcelUtility.getCellValue(path,"Sheet1" , 1, 1);
 String expectedTitle=ExcelUtility.getCellValue(path, "Sheet1", 1, 3);
 String actualTitle;
 String warningMsg="Warning: No match for E-Mail Address and/or Password.";
@BeforeMethod
public void openBrowser() {
  driver= setUp("firefox",url);
  clickOnElement(driver.findElement(By.xpath("//a[@class='dropdown-toggle'][@title='My Account']")));
  clickOnElement(driver.findElement(By.xpath("//a[text()='Login']")));
}
@Test(priority =1,enabled = true)
public void testValidLogin() {
 typeInput(driver.findElement(By.id("input-email")),"admin1111@gmail.com");
 typeInput(driver.findElement(By.id("input-password")),passwd);
 clickOnElement(driver.findElement(By.xpath("//input[@class='btn btn-primary']")));
 actualTitle=getCurrentTitleOfApplication();
 if(actualTitle.equals(expectedTitle)) {
	ExcelUtility.updateCellValue(path, "Sheet1", 1, 5,"PASS");
    }
 else { ExcelUtility.updateCellValue(path, "Sheet1", 1, 5,"FAIL");
}
Assert.assertEquals(actualTitle, expectedTitle);
}
@Test(priority =2,enabled = true)
public void testInvalidLogin() {
 typeInput(driver.findElement(By.id("input-email")),"test123@gmail.com");
 typeInput(driver.findElement(By.id("input-password")),passwd);
 clickOnElement(driver.findElement(By.xpath("//input[@class='btn btn-primary']")));
 String errMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
 System.out.println(errMsg);
 Assert.assertEquals(errMsg, warningMsg, "Test case Failed");
 }

}