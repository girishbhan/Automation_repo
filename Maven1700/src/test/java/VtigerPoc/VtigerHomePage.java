package VtigerPoc;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponent.SeleniumUtility;

public class VtigerHomePage extends SeleniumUtility{
	WebDriver driver;
	public VtigerHomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='row']/div[1]/div/div/div/span")
	private WebElement navigationPannel;
	
	@FindBy(xpath="//span[text()=' MARKETING']")
	private WebElement marketingOption;
	
	@FindBy(css=".dropdown.open>ul li>a>span:nth-of-type(2)")
	private List<WebElement> menuOption;
	
	@FindBy(xpath="//button[@id='Leads_listView_basicAction_LBL_ADD_RECORD']")
	private WebElement addLeadsButton;
	
	
	public void selectRequiredOption(String option) {
		performMouseOverOperation(marketingOption);
		for(int i=0;i<menuOption.size();i++) {
			if(menuOption.get(i).getText().equals(option)) {
				clickOnElement(menuOption.get(i));
				break;
			}
		}
	}
	
	
	

}
