package TestNgPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ReusableComponent.ExcelUtility;
import ReusableComponent.SeleniumUtility;

public class VtigerLoginFromExcel extends SeleniumUtility {
	  String url,userName,password,expectTitle,actualTitle,status;
	
	
@BeforeTest
public void preconditions() throws IOException {
	FileInputStream file = new FileInputStream(".\\src\\test\\resources\\testData\\Book1.xlsx");
  Workbook workbook = new XSSFWorkbook(file);
  int countsheet = workbook.getNumberOfSheets();
  System.out.println(countsheet);
		 url=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\Book1.xlsx", "Sheet1", 1, 3);
		 userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\Book1.xlsx", "Sheet1", 1, 1);
		 password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\Book1.xlsx", "Sheet1", 1, 2);
		 expectTitle=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\Book1.xlsx", "Sheet1", 1, 8);
		 driver=setUp("chrome", url);
		 System.out.println(userName);
	}

	
	
	
	
//  @Test
  public void loginAndValidate() {
		typeInput(driver.findElement(By.name("username")), "userName");
		typeInput(driver.findElement(By.id("password")), "password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		getCurrentTitleOfApplication();
		Assert.assertEquals(expectTitle, getCurrentTitleOfApplication(), "The Login Is Successfully Validated");

	  
  }
}
