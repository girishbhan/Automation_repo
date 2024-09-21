package OpenCartProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class ExcelDataTest extends SeleniumUtility{
  @Test
  public void f() throws IOException {
	 FileOutputStream file = new FileOutputStream(".\\src\\test\\resources\\testData\\ownfile.xlsx");
	 XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet =workbook.createSheet("Login");
    XSSFRow row1	=sheet.createRow(0);
	row1.createCell(0).setCellValue("https://www.opencart.com/");
	row1.createCell(1).setCellValue("girishhhhhhhh@gmail.com");
	row1.createCell(2).setCellValue("girish");
	workbook.write(file);
	file.close();

	
  }
}
