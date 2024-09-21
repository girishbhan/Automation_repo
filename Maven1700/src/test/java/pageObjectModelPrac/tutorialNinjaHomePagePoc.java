package pageObjectModelPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tutorialNinjaHomePagePoc {
	WebDriver driver;
	tutorialNinjaHomePagePoc(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy (xpath="//span[@class='caret']") WebElement myAccountTab;
@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']") WebElement loginTab;

public void clickOnLoginTab() {
	myAccountTab.click();
	loginTab.click();
}


}
