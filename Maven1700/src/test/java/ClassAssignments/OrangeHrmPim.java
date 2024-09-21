package ClassAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class OrangeHrmPim extends SeleniumUtility{
	WebDriver driver;

 @BeforeMethod
  public void loginToOrangeHrm() throws InterruptedException {
	 driver=new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	 driver.findElement(By.className("orangehrm-login-button")).click();
	}
 
  @Test(enabled=true,invocationCount=1)
  public void TestcreatePim() throws InterruptedException {
	  Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()=\"PIM\"]")).click();
	  Thread.sleep(3000);

	driver.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();
	  Thread.sleep(3000);

	driver.findElement(By.name("firstName")).sendKeys("girish");
	driver.findElement(By.name("middleName")).sendKeys("vikas");
	driver.findElement(By.name("lastName")).sendKeys("Bhnagle");
	WebElement empId=driver.findElement(By.cssSelector("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
	empId.clear();
	empId.sendKeys("111");
	driver.findElement(By.xpath("button[type='submit']")).click();
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
