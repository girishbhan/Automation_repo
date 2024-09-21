package pageObjectModelPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLogin {
	WebDriver driver;
	VtigerLogin(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//locators
	@FindBy (id="username") WebElement userNameField;
	@FindBy (id="password") WebElement passwdField;
	@FindBy(xpath="//button[normalize-space()='Sign in']") WebElement loginBtn;
	
	public void setUserName(String userName) {
		userNameField.sendKeys("admin");
	}
    public void setPassword(String password) {
    	passwdField.sendKeys("admin");
    }
    public void clickOnLoginBtn() {
    	loginBtn.click();
    }
}
