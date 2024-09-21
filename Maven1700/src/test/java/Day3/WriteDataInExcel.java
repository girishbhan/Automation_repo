package Day3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {
	 FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\file.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook();
  XSSFSheet sheet =workbook.createSheet("Data");
  XSSFRow row1 = sheet.createRow(0);
    row1.createCell(0).setCellValue("Manual");
    row1.createCell(1).setCellValue("Automation");
    row1.createCell(2).setCellValue("Testing");
    XSSFRow row2 =sheet.createRow(1);
    row2.createCell(0).setCellValue("Ajay");
    row2.createCell(1).setCellValue("Vijay");
    row2.createCell(2).setCellValue("Samay");
    //Now attach the workbook to the file we have created
    workbook.write(file);
    
    
	}

}
