package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class VtigerCampaign extends SeleniumUtility {
@BeforeMethod
public void clickOnCampaigns(){
	driver = setUp("firefox", "https://demo.vtiger.com/vtigercrm/index.php");
	typeInput(driver.findElement(By.name("username")), "admin");
	typeInput(driver.findElement(By.id("password")), "admin");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String expectedTitle = "Dashboard";
	getCurrentTitleOfApplication();
	Assert.assertEquals(expectedTitle, getCurrentTitleOfApplication(), "Either the title is not changed or Login failed");
    
	
}
@Test(priority =1)
public void createCampaign() {
	  WebElement menuBtn  =driver.findElement(By.cssSelector(".app-icon.fa.fa-bars"));
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].click()",menuBtn);
	//  clickOnElement(driver.findElement(By.cssSelector(".app-icon.fa.fa-bars")));
    clickOnElement(driver.findElement(By.cssSelector("div[id='MARKETING_modules_dropdownMenu'] span[class='app-name textOverflowEllipsis']")));
    clickOnElement(driver.findElement(By.xpath("//a[@title='Campaigns']/span[2]")));
    clickOnElement(driver.findElement(By.cssSelector("button#Campaigns_listView_basicAction_LBL_ADD_RECORD")));
    typeInput(driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")),"Vaccination");
    driver.findElement(By.xpath("//span[text()='Select an Option']")).click();
    driver.findElement(By.id("s2id_autogen4_search")).sendKeys("Planning");//Need to ask sir about pseudo elements and dopdown 
    driver.findElement(By.id("s2id_autogen4_search")).sendKeys(Keys.ENTER);
    clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
    clickOnElement(driver.findElement(By.xpath("//i[@class='fa fa-calendar ']")));//what if class name have space in ending
    clickOnElement(driver.findElement(By.xpath("//table[@class=' table-condensed']/tbody/tr[5]/td[5]")));
    clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
    WebElement CampaignBtn = driver.findElement(By.xpath("//h4[@class='module-title pull-left text-uppercase']"));
    js.executeScript("arguments[0].click()",CampaignBtn);
    typeInput(driver.findElement(By.name("campaignname")),"Vaccination");
    clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
    boolean Status  =driver.findElement(By.xpath("//a[text()='Vaccination']")).isDisplayed();
    Assert.assertTrue(Status);
}
	
	
  @Test(priority =2)
  public void editCampaign() throws InterruptedException {
	  WebElement menuBtn  =driver.findElement(By.cssSelector(".app-icon.fa.fa-bars"));
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].click()",menuBtn);
      clickOnElement(driver.findElement(By.cssSelector("div[id='MARKETING_modules_dropdownMenu'] span[class='app-name textOverflowEllipsis']")));
      clickOnElement(driver.findElement(By.xpath("//a[@title='Campaigns']/span[2]")));
      typeInput(driver.findElement(By.name("campaignname")),"Vaccination");
      clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
      Thread.sleep(3000);
      WebElement checkBox = driver.findElement(By.xpath("//tr[td[span[span[a[text()='Vaccination']]]]]/td/div/span/input"));
      checkBox.click();
      //Thread.sleep(3000);
      //js.executeScript("arguments[0].click()",checkBox);
    //  clickOnElement(driver.findElement(By.id("Campaigns_listView_massAction_LBL_DELETE")));
      clickOnElement(driver.findElement(By.cssSelector("#Campaigns_listView_massAction_LBL_EDIT>i")));
      typeInput(driver.findElement(By.id("Campaigns_editView_fieldName_targetsize")),"254");
      clickOnElement(driver.findElement(By.cssSelector(".saveButton")));
    //  clickOnElement(driver.findElement(By.xpath("//span[@class='value']/a[text()='Vaccination']")));
      driver.navigate().refresh();
      WebElement vaccinationLink= driver.findElement(By.xpath("//tr[td[span[span[contains(text(),'08-29-2024')]]]]/td[2]/span/span/a"));
      js.executeScript("arguments[0].click",vaccinationLink);
      boolean status= driver.findElement(By.cssSelector("#Campaigns_detailView_fieldValue_targetsize>span")).isDisplayed();
      Assert.assertTrue(status);
      }
  @Test(priority=3)
  public void deleteCampaign() throws InterruptedException {
	  WebElement menuBtn  =driver.findElement(By.cssSelector(".app-icon.fa.fa-bars"));
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].click()",menuBtn);
      clickOnElement(driver.findElement(By.cssSelector("div[id='MARKETING_modules_dropdownMenu'] span[class='app-name textOverflowEllipsis']")));
      clickOnElement(driver.findElement(By.xpath("//a[@title='Campaigns']/span[2]")));
      typeInput(driver.findElement(By.name("campaignname")),"Vaccination");
      clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
      Thread.sleep(3000);
      WebElement checkBox = driver.findElement(By.xpath("//tr[td[span[span[a[text()='Vaccination']]]]]/td/div/span/input"));
      checkBox.click();
    //  clickOnElement(driver.findElement(By.xpath("//tbody[@class='overflow-y']/tr/td/div/span/input")));
      clickOnElement(driver.findElement(By.xpath("//button[@id='Campaigns_listView_massAction_LBL_DELETE']//i[@class='fa fa-trash']")));
      clickOnElement(driver.findElement(By.xpath("//button[@class='btn confirm-box-ok confirm-box-btn-pad btn-primary']")));
      WebElement NoCampaignFoundMsg = driver.findElement(By.xpath("//div[@class='emptyRecordsContent']"));
      String msg=NoCampaignFoundMsg.getText();
      Assert.assertEquals(msg,"No Campaigns found. Create Campaign");
       }
  @AfterTest
  public void closeBrowser() {
	  driver.quit();
  }
  
  
  
}
