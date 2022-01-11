package Selenium.stepdefinition;

//User page login code is same as parabankloginscenario code
//Here we are almost copying the code from parabankLoginScenario
//	@When("user enters the {string} and {string}")
//public void user_enters_the_and(String username, String password)
//Instead of this, driver.findElement(By.name("username")).sendKeys("johndoe1"); , we will be changing .sendkeys(username)
//Click on login button is same as the old code
//Here we will be changing @When to @And, because thaat is what we gave in parabankdatafeature
//Beofre: @When("clicks on login button") After: @And("clicks on login button")
//Same thing, we will be changing - Before: @Then("user will close the application") to @And("user will close the application")
//WE are changing the runner class code now 
//@CucumberOptions(features =".\\FeatureFiles\\parabankData.feature", glue = "Selenium.stepdefinition" )
//from parabank to parabankData

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ParaBankLoginData {
	
	public WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
	    System.out.println("ParaBank home page is launched successfully");
	}

	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String username, String password) {
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
		System.out.println("Valid username and password are entered");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Click on login button");
	}

	@Then("display user home page")
	public void display_user_home_page() {
	    boolean status = driver.findElement(By.partialLinkText("New Account")).isDisplayed();
	    if(status) {
	    	 System.out.println("User home page is displayed");
	    }
	    else {
	    	System.out.println("User home page is not displayed");
	    }
	}

	@And("user will close the application")
	public void user_will_close_the_application() {
	    driver.close();
	    System.out.println("Application is closed");
	}


}
