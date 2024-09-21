package vtigerTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;
import VtigerPoc.ContactsPage;
import VtigerPoc.EditContactPage;
import VtigerPoc.VtigerHomePage;
import VtigerPoc.VtigerLoginPage;

public class VtigerContact extends SeleniumUtility {
	WebDriver driver;
	VtigerLoginPage ref;
	VtigerHomePage rev;
	ContactsPage rev1;
	EditContactPage rev2;

	@BeforeClass
	public void setUp() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	}

	@BeforeMethod
	void login() {
		VtigerLoginPage ref = new VtigerLoginPage(driver);
		ref.login("admin", "admin");
	}

	@Test(priority = 1, enabled = true)
	void createContact() {
		rev = new VtigerHomePage(driver);
		rev.selectRequiredOption("Contacts");
		rev1 = new ContactsPage(driver);
		boolean status = rev1.createNewContact("girish", "bhangale", "9881952149");
		Assert.assertTrue(status);
	}

	@Test(priority = 2, enabled = true)
	public void editContact() {
		rev1.searchCreatedContactWithPhone("9881952149");
		rev2 = new EditContactPage(driver);

	}

	@Test(priority = 3, enabled = true)
	void deleteContact() {
		boolean status = rev1.deleteContact("9881952149");
		Assert.assertTrue(status);
	}
}
