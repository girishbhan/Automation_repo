package ClassAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SliderPractice {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	/*WebElement minSlider = driver.findElement(By.cssSelector(".ui-slider-handle"));
	System.out.println(minSlider.getLocation());
	//(638, 1085)
	Actions act = new Actions(driver);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", minSlider);*/
	
	 WebElement searchTxt = driver.findElement(By.id("field1"));
	/*act.doubleClick(searchTxt).perform();
	WebElement searchINputField= driver.findElement(By.id("field1"));
	act.keyDown(Keys.CONTROL).sendKeys("A").perform();
	act.keyDown(Keys.CONTROL).sendKeys("C").perform();
    driver.findElement(By.id("field2")).click();
   
    act.keyDown(Keys.CONTROL).sendKeys("V").perform();
    */
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",searchTxt);
	js.executeScript("arguments[0].setAttribute('value','bhosada')",searchTxt);
	}

}
