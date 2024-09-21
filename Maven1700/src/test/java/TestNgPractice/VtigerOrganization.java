package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class VtigerOrganization extends SeleniumUtility {
@BeforeMethod
public void loginValidation() {
	driver= setUp("firefox","https://demo.vtiger.com/vtigercrm/index.php");
	WebElement userName = driver.findElement(By.name("username"));
	typeInput(userName, "admin");
	typeInput(driver.findElement(By.id("password")), "admin");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String expectedTitle = "Dashboard";
	getCurrentTitleOfApplication();
	Assert.assertEquals(expectedTitle, getCurrentTitleOfApplication(), "The HomePage Title is not changed");
	  WebElement menuBtn  =driver.findElement(By.cssSelector(".app-icon.fa.fa-bars"));
     JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click()",menuBtn);
    clickOnElement(driver.findElement(By.cssSelector("div[id='MARKETING_modules_dropdownMenu'] span[class='app-name textOverflowEllipsis']")));
    clickOnElement(driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&view=List&app=MARKETING'][@title='Organizations']")));	 
}
	
	
  @Test(priority=1,enabled=true)
  public void createOrganization() {
	 clickOnElement(driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")));
	 typeInput(driver.findElement(By.id("Accounts_editView_fieldName_accountname")),"Abc Corporation");
	 typeInput(driver.findElement(By.id("Accounts_editView_fieldName_website")),"www.abccorp.com");
	 typeInput(driver.findElement(By.id("Accounts_editView_fieldName_annual_revenue")),"35000");
	 clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
	 JavascriptExecutor js =(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//h4[@class='module-title pull-left text-uppercase']")));
     typeInput(driver.findElement(By.xpath("//input[@class='listSearchContributor inputElement'][@name='website']")),"www.abccorp.com");
     clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
     boolean status =driver.findElement(By.xpath("//a[text()='www.abccorp.com']")).isDisplayed();
	 Assert.assertTrue(status);
  }
  
  @Test(priority=2,enabled =true)
  public void editOrganization() throws InterruptedException { 
     typeInput(driver.findElement(By.xpath("//input[@class='listSearchContributor inputElement'][@name='website']")),"www.abccorp.com");
     clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
     WebElement checkbox= driver.findElement(By.xpath("//tr[td[span[span[a[@class='urlField cursorPointer']]]]]/td/div/span/input"));
     JavascriptExecutor js = (JavascriptExecutor)driver;
     Thread.sleep(3000);
     js.executeScript("arguments[0].click()",checkbox);
     clickOnElement(driver.findElement(By.cssSelector("#Accounts_listView_massAction_LBL_EDIT>i")));
     typeInput(driver.findElement(By.id("Accounts_editView_fieldName_phone")),"1234567890");
    // typeInput(driver.findElement(By.xpath("//input[@class='listSearchContributor inputElement'][@name='website']")),"www.abccorp.com");
    //clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
     boolean status =driver.findElement(By.xpath("//td[@class='listViewEntryValue'][@title='1234567890']")).isDisplayed();
     Assert.assertTrue(status);
     }
  @Test(priority=3,enabled =true)
  public void deleteOrganization() throws InterruptedException {
	  typeInput(driver.findElement(By.xpath("//input[@class='listSearchContributor inputElement'][@name='website']")),"www.abccorp.com");
	  clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
	  Thread.sleep(3000);
	 clickOnElement(driver.findElement(By.xpath("//tr[td[@title='1234567890']]/td/div/span/input")));
	  clickOnElement(driver.findElement(By.cssSelector("#Accounts_listView_massAction_LBL_DELETE>i")));
	  clickOnElement(driver.findElement(By.cssSelector(".confirm-box-ok.confirm-box-btn-pad.btn-primary")));
	  String actualDeleteMsg = driver.findElement(By.xpath("//div[@class='emptyRecordsContent']")).getText();
	  System.out.println(actualDeleteMsg);
	  Assert.assertEquals(actualDeleteMsg,"No Organizations found. Create or Import Organizations");
	    }
  
}