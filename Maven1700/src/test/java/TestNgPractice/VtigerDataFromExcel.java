package TestNgPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class VtigerDataFromExcel extends SeleniumUtility {
	@BeforeTest
	public void preconditions() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\file.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Data");
		XSSFRow row = sheet.getRow(0);
		String url = row.getCell(0).toString();
		setUp("firefox", url);
		String userName = row.getCell(1).toString();
		String Passwd = row.getCell(2).toString();
		typeInput(driver.findElement(By.id("username")),userName);
		typeInput(driver.findElement(By.id("password")),Passwd);
		clickOnElement(driver.findElement(By.xpath("//button[text()='Sign in']")));
		String expectedTitle = row.getCell(3).toString();
		Assert.assertEquals(expectedTitle,driver.getTitle());
		FileOutputStream fs = new FileOutputStream(System.getProperty("user.dir") +"\\TestData\\file.xlsx");
		 XSSFWorkbook workbook1 = new XSSFWorkbook();
        
	}

	@Test
	public void f() {
	}
}
