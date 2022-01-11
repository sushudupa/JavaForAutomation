package Selenium.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Last step: It was @Then and we changed it into: @And("close the application")
//We imported @Given, @When, @Then and @And
//We are deleting this:  throw new io.cucumber.java.PendingException(); and adding sysout message
//Here we are adding the last code that is unable to login.
//We got that after updating the parabank.feature and adding one more method to it(negative scenario)
//We are adding invalid username and password are entered in negative scenario instead of: When username and password are entered
//We updated the method because we need one for positive scenario and one for negative scenario
//we are adding invalid user name and password code above the unable to login code
//Driver object is common and i am copying it from the maven-registerDemo program
//As of now, the parabank is taking any user name and password you enter, so in order to test the negative scenario, we are not using password

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParaBankLoginScenario {
	
	public WebDriver driver;
	
	
	@Given("user is navigating to the parabank url")
	public void user_is_navigating_to_the_parabank_url() {	
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
	    System.out.println("ParaBank home page is launched successfully");
	}

	@When("username and password are entered")
	public void username_and_password_are_entered() {
	    driver.findElement(By.name("username")).sendKeys("johndoe1");
	    driver.findElement(By.name("password")).sendKeys("johndoe1");
		System.out.println("Valid username and password are entered");
	}
	
	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Click on login button");
	}

	@Then("display the user home page")
	public void display_the_user_home_page() {
	    boolean status = driver.findElement(By.partialLinkText("New Account")).isDisplayed();
	    if(status) {
	    	 System.out.println("User home page is displayed");
	    }
	    else {
	    	System.out.println("User home page is not displayed");
	    }
	   
	}

	@And("close the application")
	public void close_the_application() {
	    driver.close();
	    System.out.println("Application is closed");
	}
	
	@When("invalid username and password are entered")
	public void invalid_username_and_password_are_entered() {
		driver.findElement(By.name("username")).sendKeys("johndoe1");
	    driver.findElement(By.name("password")).sendKeys("");
		System.out.println("Invalid username and password entered");
	}

	@Then("unable to login")
	public void unable_to_login() {
	    WebElement errorMsg = driver.findElement(By.xpath("//p[@class='error']"));
	    System.out.println("Login Failed. The error message is " + errorMsg.getText());
	}


}
