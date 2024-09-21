package SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ReusableComponent.SeleniumUtility;

public class OrangeHRM_PIM extends SeleniumUtility {

	ExtentReports extentReports;
	ExtentTest extentTest;
	boolean result;
	
	@BeforeClass
	public void precondition() {
		extentReports=new ExtentReports(".\\ExtentReport\\VtigerContact.html");
	}
	
	@BeforeMethod
	public void startUp() {
		driver= setUp("firefox","https://demo.vtiger.com/vtigercrm/index.php");
		WebElement userName = driver.findElement(By.name("username"));
		typeInput(userName, "admin");
		typeInput(driver.findElement(By.id("password")), "admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String expectedTitle = "Dashboard";
		getCurrentTitleOfApplication();//dont use assertion in preconditions
		Assert.assertEquals(expectedTitle, getCurrentTitleOfApplication(), "The HomePage Title is not changed");
		  WebElement menuBtn  =driver.findElement(By.cssSelector(".app-icon.fa.fa-bars"));
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()",menuBtn);//# to write here
	    clickOnElement(driver.findElement(By.cssSelector("div[id='MARKETING_modules_dropdownMenu'] span[class='app-name textOverflowEllipsis']")));
	    clickOnElement(driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&view=List&app=MARKETING']//span[@class='module-name textOverflowEllipsis'][normalize-space()='Contacts']")));
		
	}
	
	@Test
	public void testPimCreation() {
		extentTest=extentReports.startTest("Vtiger_Contact_Creation");
		//Code to create PIM and validate
		  clickOnElement(driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")));
		    clickOnElement(driver.findElement(By.xpath("//b[@role='presentation']")));
		    WebElement salutationDrpdwn =driver.findElement(By.xpath("//input[@id='Contacts_editView_fieldName_lastname']"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click()",salutationDrpdwn);
		    typeInput(driver.findElement(By.id("Contacts_editView_fieldName_firstname")),"Amol");
		    typeInput(driver.findElement(By.id("Contacts_editView_fieldName_lastname")),"Mahajan");
		    typeInput(driver.findElement(By.id("Contacts_editView_fieldName_phone")),"9881952149");
		    typeInput(driver.findElement(By.id("Contacts_editView_fieldName_title")),"Chawat Tatya");
		    WebElement saveBtn =driver.findElement(By.xpath("//button[text()='Save']"));
		    js.executeScript("arguments[0].click()",saveBtn);
		    js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//h4[@class='module-title pull-left text-uppercase']")));
		    typeInput(driver.findElement(By.xpath("//input[@class='listSearchContributor inputElement'][@name='phone']")),"9881952149");
		    WebElement officeNo = driver.findElement(By.xpath("//td[@data-name='phone'][@title='9881952149']/span/span"));
		    Assert.assertTrue(officeNo.isDisplayed());
		   }	
	
	@Test
	public void testPimUpdate() throws InterruptedException {
		extentTest=extentReports.startTest("Vtiger_contact_Update");
		//Code to update PIM and validate
		  typeInput(driver.findElement(By.xpath("//input[@class='listSearchContributor inputElement'][@name='phone']")),"9881952149");
		   clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
		   Thread.sleep(3000);//without thread it is not clicking it
		   clickOnElement(driver.findElement(By.xpath("//tr[td[@data-name='phone'][@title='9881952149']]/td/div/span/input")));
		   clickOnElement(driver.findElement(By.cssSelector("#Contacts_listView_massAction_LBL_EDIT>i")));
		   typeInput(driver.findElement(By.id("Contacts_editView_fieldName_email")),"xyz@gmail.com");
		   clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
		   boolean status =  driver.findElement(By.xpath("//a[text()='xyz@gmail.com']")).isDisplayed();
		   Assert.assertTrue(status);
		  
	}	
	
	@Test
	public void testPimDelete() throws InterruptedException {
		extentTest=extentReports.startTest("Vtiger_Contact_Delete");
		//Code to delete PIM and validate
		 typeInput(driver.findElement(By.xpath("//input[@class='listSearchContributor inputElement'][@name='phone']")),"9881952149");
		  clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
		  Thread.sleep(3000);
		  clickOnElement(driver.findElement(By.xpath("//tr[td[@data-name='phone'][@title='9881952149']]/td/div/span/input")));
		  clickOnElement(driver.findElement(By.cssSelector("#Contacts_listView_massAction_LBL_DELETE>i.fa.fa-trash")));
		  clickOnElement(driver.findElement(By.xpath("//button[text()='Yes']")));
		  Thread.sleep(3000);
		  typeInput(driver.findElement(By.xpath("//input[@class='listSearchContributor inputElement'][@name='phone']")),"9881952149");
		  clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
		  String validationMessage = driver.findElement(By.xpath("//div[@class='emptyRecordsContent']")).getText();
		  Assert.assertEquals(validationMessage,"No Contacts found. Create or Import Contacts");
		  
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {		
		if(result.getStatus() == ITestResult.FAILURE){
			extentTest.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(screenShot(driver)), "Test Case Failed is "+result.getThrowable());
		}else if(result.getStatus() == ITestResult.SKIP){
			extentTest.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
		}else if(result.getStatus() == ITestResult.SUCCESS){
			extentTest.log(LogStatus.PASS,extentTest.addScreenCapture(screenShot(driver)), "Test Case pass is "+result.getName());
		}
		extentReports.endTest(extentTest);
	}
	
	@AfterClass
	public void postcondition() {		
		
		extentReports.flush();
	}
	
	public static String screenShot(WebDriver driver) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../BStackImages/" + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		try {
			FileUtils.copyFile(scrFile, Dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return errflpath;
		}
}
