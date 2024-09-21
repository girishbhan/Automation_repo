package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class VtigerLead extends SeleniumUtility {
	@BeforeTest
	public void openBrowser() {
		driver = setUp("firefox", "https://demo.vtiger.com/vtigercrm/index.php");
	}

	@BeforeMethod
	public void loginAndValidate() {
		driver = setUp("firefox", "https://demo.vtiger.com/vtigercrm/index.php");
		WebElement userName = driver.findElement(By.name("username"));
//userName.clear();
//userName.sendKeys("admin");
		typeInput(userName, "admin");
		typeInput(driver.findElement(By.id("password")), "admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String expectedTitle = "Dashboard";
		getCurrentTitleOfApplication();
		Assert.assertEquals(expectedTitle, getCurrentTitleOfApplication(), "The Login Is Successfully Validated");
/*		clickOnElement(driver.findElement(By.xpath("//div[@id='appnavigator']//span[@class='app-icon fa fa-bars']")));
		clickOnElement(driver.findElement(By
				.cssSelector("div[id='MARKETING_modules_dropdownMenu'] span[class='app-name textOverflowEllipsis']")));
		clickOnElement(driver
				.findElement(By.xpath("//span[@class='module-name textOverflowEllipsis'][normalize-space()='Leads']")));
*/
	
	}

	@Test(priority = 1)
	public void createLead() {
		clickOnElement(driver.findElement(By.xpath("//div[@id='appnavigator']//span[@class='app-icon fa fa-bars']")));
		clickOnElement(driver.findElement(By
				.cssSelector("div[id='MARKETING_modules_dropdownMenu'] span[class='app-name textOverflowEllipsis']")));
		clickOnElement(driver
				.findElement(By.xpath("//span[@class='module-name textOverflowEllipsis'][normalize-space()='Leads']")));

		clickOnElement(driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")));
//	clickOnElement(driver.findElement(By.id("select2-drop-mask")));
//	clickOnElement(driver.findElement(By.id("Leads_editView_fieldName_lastname")));
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_firstname")), "Anil");
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_lastname")), "Kale");
		String custPhoneNo = "8668257369";
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_phone")), "8668257369");
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		WebElement LeadBtn = driver.findElement(By.xpath("//div[@id='appnavigator']//span[@class='app-icon fa fa-bars']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",LeadBtn );
		//clickOnElement(driver.findElement(By.xpath("//h4[@class='module-title pull-left text-uppercase']"))); element not intercepted is coming
		//clickOnElement(driver.findElement(By
		//		.cssSelector("div[id='MARKETING_modules_dropdownMenu'] span[class='app-name textOverflowEllipsis']")));
		//clickOnElement(driver
		//		.findElement(By.xpath("//span[@class='module-name textOverflowEllipsis'][normalize-space()='Leads']")));
        typeInput(driver.findElement(By.xpath("//input[@class='listSearchContributor inputElement'][@name='phone']")), "8668257369");
		clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
		String phoneNumber = getTextFromElement(
				driver.findElement(By.xpath("//tbody[@class='overflow-y']/tr/td[5]/span/span")));
		Assert.assertEquals(phoneNumber, custPhoneNo, "The Lead has been sucessfully created");// why i am note getting
																								// this message
	}

//	@Test(priority =2)
	public void editLead() throws InterruptedException {
		clickOnElement(driver.findElement(By.xpath("//h4[@class='module-title pull-left text-uppercase']")));// click on
																												// phone
																												// number
		typeInput(driver.findElement(By.name("phone")), "8668257369");
		clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
		clickOnElement(driver.findElement(By.xpath("//tr[@class='listViewEntries'][@data-id='6']/td/div/span/input")));
		Thread.sleep(3000);
		clickOnElement(driver.findElement(By.xpath("//button[@id='Leads_listView_massAction_LBL_EDIT']//i[@class='fa fa-pencil']")));
        clickOnElement(driver.findElement(By.id("Leads_detailView_basicAction_LBL_EDIT")));
        clickOnElement(driver.findElement(By.id("Leads_editView_fieldName_email")));
        typeInput(driver.findElement(By.id("Leads_editView_fieldName_email")),"anilkale12@gmail.com");
        clickOnElement(driver.findElement(By.id("s2id_autogen8_search")));
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
