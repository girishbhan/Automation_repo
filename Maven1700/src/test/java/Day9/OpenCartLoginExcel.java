package Day9;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class OpenCartLoginExcel extends SeleniumUtility {
	String url,userName,password;
  @Test
  public void preconditions() {
	  String url = ReusableComponent.ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\ownfile.xlsx","Login", 0, 0);
	  System.out.println(url);
	  String userName = ReusableComponent.ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\ownfile.xlsx","Login", 0, 1);
	  String password = ReusableComponent.ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\ownfile.xlsx","Login", 0, 2);

	  driver= setUp("firefox",url);
	  System.out.println(userName+"\n"+password);
 }
 // @Test
  public void loginAndValidate() {
	 
  }
}
