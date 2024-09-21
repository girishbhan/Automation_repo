package pageObjectModelPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLoginPoc {
	WebDriver driver;
	OrangeHrmLoginPoc(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
//locators
@FindBy (xpath="//input[@name='username']") WebElement userNameInputField;
@FindBy (xpath="//input[@name='password']") WebElement passwdInputField;
@FindBy (xpath ="//button[@type='submit']") WebElement loginBtn;
 
void userNameInput(String userName) {
	userNameInputField.sendKeys("admin");
}
void passwdInput(String passwd) {
	passwdInputField.sendKeys("admin");
}
void loginBtn() {
	loginBtn.click();
}
}
