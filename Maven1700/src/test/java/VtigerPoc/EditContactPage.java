package VtigerPoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponent.SeleniumUtility;

public class EditContactPage extends SeleniumUtility{
	WebDriver driver;
	 public EditContactPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
   @FindBy (id="Contacts_editView_fieldName_email")
   private WebElement editEmailIdInputField;
   
   @FindBy(xpath="//button[text()='Save']")
   private WebElement savebtn;
public WebElement getEditEmailIdInputField() {
	return editEmailIdInputField;
}

public WebElement getSavebtn() {
	return savebtn;
}
 void editContactEmail(String emailId) {
	 typeInput(editEmailIdInputField,"emailId");
 }
	 
	 
	 
}
