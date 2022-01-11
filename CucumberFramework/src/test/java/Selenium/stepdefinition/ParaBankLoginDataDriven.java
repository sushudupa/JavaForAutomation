package Selenium.stepdefinition;


//We are coding the same thing as parabank login data for the "user enter credentials {String} and {String}"
//The code before changing: public void user_enter_credentials_and(String string, String string2) {
//After changing it becomes: public void user_enter_credentials_and(String username, String password) {
//We are chaning string and string 2 as username and password

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParaBankLoginDataDriven {
	
	public WebDriver driver;
	
	@Given("user launch parabank page")
	public void user_launch_parabank_page() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
	    System.out.println("ParaBank home page is launched successfully");
	}

	@When("user enter credentials {string} and {string}")
	public void user_enter_credentials_and(String username, String password) {
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
		System.out.println("Valid username and password are entered");
	}

	@And("click login button")
	public void click_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Click on login button");
	}

	@Then("user should view home page")
	public void user_should_view_home_page() {
	    boolean status = driver.findElement(By.partialLinkText("New Account")).isDisplayed();
	    if(status) {
	    	 System.out.println("User home page is displayed");
	    }
	    else {
	    	System.out.println("User home page is not displayed");
	    }
	}

	@And("user should close the application")
	public void user_should_close_the_application() {
	    driver.close();
	    System.out.println("Application is closed");
	}


}
