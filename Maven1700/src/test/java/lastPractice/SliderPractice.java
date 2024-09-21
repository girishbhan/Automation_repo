package lastPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderPractice {

	public static void main(String[] args) {
      WebDriver driver = new FirefoxDriver();
     driver.get("https://testautomationpractice.blogspot.com");
     WebElement min_slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
    Point min_location =min_slider.getLocation();
    System.out.println(min_location);
   // (804, 1094)
    Actions act = new Actions(driver);
    act.dragAndDropBy(min_slider,904,1094).perform();
    System.out.println(min_location);
    
	}

}
