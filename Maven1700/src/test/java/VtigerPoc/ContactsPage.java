package VtigerPoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponent.SeleniumUtility;

public class ContactsPage extends SeleniumUtility {
	WebDriver driver;
	public ContactsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
   @FindBy (id="\"Contacts_listView_basicAction_LBL_ADD_RECORD\"")
   private WebElement addContactBtn;
  
   @FindBy (id="Contacts_editView_fieldName_firstname")
   private WebElement firstNameInputField;
   
   @FindBy (id="Contacts_editView_fieldName_lastname")
   private WebElement lastNameInputField;
   
   @FindBy (id="Contacts_editView_fieldName_phone")
   private WebElement phoneNumberInputField;
   
   @FindBy (xpath ="//button[text()='Save']")
   private WebElement  saveBtn;
	
   @FindBy (xpath ="//h4[@class='module-title pull-left text-uppercase']")
   private WebElement contactsWord;
   
   @FindBy (xpath ="//input[@class='listSearchContributor inputElement'][@name='phone']")
   private WebElement searchByOfficeNoField;
   
   @FindBy (xpath="//td[@data-name='phone'][@title='9881952149']/span/span")
   private WebElement officeNumberValidationInContact;
   
   @FindBy (xpath="//span[text()='Search']")
   private WebElement searchBtnForContact;
   
   @FindBy(xpath ="//tr[td[@data-name='phone'][@title='9881952149']]/td/div/span/input")
   private WebElement checkBoxForContact;
   
   @FindBy (css="#Contacts_listView_massAction_LBL_EDIT>i")
   private WebElement editContactBtn;
   
   @FindBy(css="#Contacts_listView_massAction_LBL_DELETE>i.fa.fa-trash")
   private WebElement deleteContactBtn;
   
    @FindBy(xpath="//button[text()='Yes']")
    private WebElement confirmDeleteYesBtn;
    
    @FindBy(xpath="//div[@class='emptyRecordsContent']")
    private WebElement deleteContactConfirmationMsg;
    
public WebElement getAddContactBtn() {
	return addContactBtn;
}

public WebElement getFirstNameInputField() {
	return firstNameInputField;
}

public WebElement getLastNameInputField() {
	return lastNameInputField;
}

public WebElement getPhoneNumberInputField() {
	return phoneNumberInputField;
}

public WebElement getSaveBtn() {
	return saveBtn;
}

public WebElement getContactsWord() {
	return contactsWord;
}

public WebElement getSearchByOfficeNoField() {
	return searchByOfficeNoField;
}

public WebElement getOfficeNumberValidationInContact() {
	return officeNumberValidationInContact;
}
	
public boolean createNewContact(String firstName,String lastName,String officeNo) {
	typeInput(firstNameInputField,firstName);
	typeInput(lastNameInputField,lastName);
	typeInput(phoneNumberInputField,officeNo);
	clickOnElement(saveBtn);
	clickOnElement(contactsWord);
	typeInput(searchByOfficeNoField,officeNo);
	boolean result=officeNumberValidationInContact.isDisplayed();
	return result;
	}
public void searchCreatedContactWithPhone(String officeNo) {
	typeInput(searchByOfficeNoField,officeNo);
	clickOnElement(searchBtnForContact);
}
public boolean deleteContact(String officeNo) {
searchCreatedContactWithPhone(officeNo);
clickOnElement(checkBoxForContact);
clickOnElement(deleteContactBtn);
clickOnElement(confirmDeleteYesBtn);
boolean result=deleteContactConfirmationMsg.isDisplayed();
return result;
}

}
   
	
	

