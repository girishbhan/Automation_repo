package pageObjectModelPrac;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddElement {
	WebDriver driver;
	AddElement(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
//locators
	@FindBy (id="add-to-cart-sauce-labs-backpack") WebElement bagPackAdd;
	@FindBy (xpath="//span[@class='shopping_cart_badge']")  WebElement addToCartLogo;
	@FindBy (xpath ="//div[text()='Sauce Labs Backpack']")  WebElement addedElement;
	@FindBy (xpath ="//div[@class='inventory_item_price']") List<WebElement> itemPrices;
	@FindBy (xpath ="//div[@class='inventory_item_name ']")  List<WebElement> itemNames;	
 void addBagPack () {
	bagPackAdd.click();
 }
	
 void addToCartLogo() {
	 addToCartLogo.click();
 }
boolean checkElement() {
	boolean result=addedElement.isDisplayed();
	return result;
}
void getListOfItems() {
	int numberOfItems=itemPrices.size();
	
}

}