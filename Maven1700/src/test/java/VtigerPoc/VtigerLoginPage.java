package VtigerPoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponent.SeleniumUtility;

public class VtigerLoginPage extends SeleniumUtility {
	WebDriver driver;
	 public VtigerLoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
   //Locators
@FindBy (name=("username")) private WebElement userNameField;
public WebElement getUserNameField() {
	return userNameField;
}

public WebElement getPasswordField() {
	return passwordField;
}
public WebElement getLoginBtn() {
	return loginBtn;
}
@FindBy (id=("password")) private WebElement passwordField;
@FindBy (xpath=("//button[@type='submit']")) private WebElement loginBtn;

public void login(String username,String password) {
 typeInput(userNameField,username);
 typeInput(passwordField,password);
 clickOnElement(loginBtn);
}

	
}
