package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import ReusableComponent.SeleniumUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoStepDefinition extends SeleniumUtility{
	WebDriver driver;
	@Given("open browser")
	public void open_browser() {
		WebDriverManager.firefoxdriver().setup();
	   driver= new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.manage().window().maximize();
	}

	@When("Enter the url ")
	public void enter_the_url() {
		driver.get("http://saucedemo.com");
	   }

	@When("Enter valid username")
	public void enter_valid_username() {
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  
	}

	@When("Enter valid password")
	public void enter_valid_password() {
	  driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("User should be able to login and see the homepage")
	public void user_should_be_able_to_login_and_see_the_homepage() {
	  String ActualTitle = driver.getTitle();
	  String ExpectedTitle ="Swag Labs";
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	}


}
