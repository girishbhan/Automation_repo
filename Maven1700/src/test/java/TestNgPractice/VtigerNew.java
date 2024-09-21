package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class VtigerNew extends SeleniumUtility {
	@BeforeMethod
	public void loginAndValidate() {
		driver = setUp("firefox", "https://demo.vtiger.com/vtigercrm/index.php");
		typeInput(driver.findElement(By.name("username")), "admin");
		typeInput(driver.findElement(By.id("password")), "admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String expectedTitle = "Dashboard";
		getCurrentTitleOfApplication();
		Assert.assertEquals(expectedTitle, getCurrentTitleOfApplication(), "The Login Is Successfully Validated");

	}

	@Test(priority = 1)
	public void createLead() {
		clickOnElement(driver.findElement(By.cssSelector(".app-icon.fa-bars")));
		clickOnElement(driver.findElement(By
				.cssSelector("div[id='MARKETING_modules_dropdownMenu'] span[class='app-name textOverflowEllipsis']")));
		clickOnElement(driver
				.findElement(By.xpath("//span[@class='module-name textOverflowEllipsis'][normalize-space()='Leads']")));
		clickOnElement(driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")));
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_firstname")), "Girish");
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_lastname")), "Bhangale");
		String custPhoneNo = "9000000000";
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_phone")), "9000000000");
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement mainBar = driver.findElement(By.cssSelector(".app-icon.fa-bars"));
		js.executeScript("arguments[0].click()", mainBar);
		clickOnElement(driver.findElement(By
				.cssSelector("div[id='MARKETING_modules_dropdownMenu'] span[class='app-name textOverflowEllipsis']")));
		clickOnElement(driver
				.findElement(By.xpath("//span[@class='module-name textOverflowEllipsis'][normalize-space()='Leads']")));
		typeInput(driver.findElement(By.xpath("//input[@class='listSearchContributor inputElement'][@name='phone']")),
				"9000000000");
		clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
		String phoneNumber = getTextFromElement(
				driver.findElement(By.xpath("//tbody[@class='overflow-y']/tr/td[5]/span/span")));
		Assert.assertEquals(phoneNumber, custPhoneNo, "The Lead has been sucessfully created");// why i am note getting
																								// string message
	}

	@Test(priority = 2)
	public void editLead() {
		clickOnElement(driver.findElement(By.cssSelector(".app-icon.fa-bars")));
		clickOnElement(driver.findElement(By
				.cssSelector("div[id='MARKETING_modules_dropdownMenu'] span[class='app-name textOverflowEllipsis']")));
		clickOnElement(driver
				.findElement(By.xpath("//span[@class='module-name textOverflowEllipsis'][normalize-space()='Leads']")));
		typeInput(driver.findElement(By.xpath("//input[@class='listSearchContributor inputElement'][@name='phone']")),
				"9000000000");
		clickOnElement(driver.findElement(By.xpath("//span[text()='Search']")));
		clickOnElement(driver.findElement(By.xpath("//tr[@id='Leads_listView_row_1']/td[1]/div/span/input")));// need to
																												// ask
																												// sir
																												// about
																												// dependant
																												// n
																												// independant

	}

	@Test(priority = 3)
	public void deleteLead() {
		clickOnElement(driver.findElement(By.cssSelector(".app-icon.fa-bars")));
		clickOnElement(driver.findElement(By
				.cssSelector("div[id='MARKETING_modules_dropdownMenu'] span[class='app-name textOverflowEllipsis']")));
		clickOnElement(driver
				.findElement(By.xpath("//span[@class='module-name textOverflowEllipsis'][normalize-space()='Leads']")));
		typeInput(driver.findElement(By.xpath("//input[@class='listSearchContributor inputElement'][@name='phone']")),
				"9000000000");
        clickOnElement(driver.findElement(By.xpath("//input[@value='3']")));
        clickOnElement(driver.findElement(By.xpath("//i[@class='fa fa-trash']")));
        clickOnElement(driver.findElement(By.xpath("//button[text()='Yes']")));
        
	}

}
