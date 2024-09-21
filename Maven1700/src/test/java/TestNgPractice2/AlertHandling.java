package TestNgPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class AlertHandling extends SeleniumUtility {
  @Test
  public void f() throws InterruptedException {
	  driver=setUp("firefox","https://testautomationpractice.blogspot.com/");
	//  clickOnElement(driver.findElement(By.xpath("//button[text()='Alert']")));
//Alert alert	 =driver.switchTo().alert();
  //  System.out.println(alert.getText());
	//  clickOnElement(driver.findElement(By.xpath("//button[text()='Prompt']")));
	  //Thread.sleep(3000);
     //driver.switchTo().alert().sendKeys("I am Batman");
  //  WebElement frame = driver.findElement(By.id("frame-one796456169"));
    driver.switchTo().frame(0);
    typeInput(driver.findElement(By.id("RESULT_TextField-0")),"Girish");
    driver.switchTo().defaultContent();
    
    
  }
}
