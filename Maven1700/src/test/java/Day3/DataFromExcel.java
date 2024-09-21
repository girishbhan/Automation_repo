package Day3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\OpenCart-TestCases.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Register");
		int rows = sheet.getLastRowNum();
		System.out.println(rows);//rows counting start fro zero
		//to capture the perticular row 
		sheet.getRow(1);
		//to get the cell numbers in row number 1
	int	totalCells=sheet.getRow(3).getLastCellNum();
		System.out.println(totalCells);
     for(int r =0;r<=rows;r++) {
    Row currentRow	=sheet.getRow(r);
    	 for(int c=0;c<totalCells;c++) {
   XSSFCell cell = (XSSFCell) currentRow.getCell(c);
   System.out.println(cell);
    
    	 }
     }
      
     
	}

}
