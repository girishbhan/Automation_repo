package pageObjectModelPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPoc {
	WebDriver driver;
	SauceDemoLoginPoc(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
//locators
@FindBy (id="user-name") WebElement userNameInputField;
@FindBy (id="password") WebElement passwdField;
@FindBy (id ="login-button") WebElement loginBtn;
//action method
void setUpUser(String userName) {
	userNameInputField.sendKeys(userName);
	}
void setUpPassword(String password) {
	passwdField.sendKeys(password);
}
void loginBtnClick() {
	loginBtn.click();
}
	
	}

