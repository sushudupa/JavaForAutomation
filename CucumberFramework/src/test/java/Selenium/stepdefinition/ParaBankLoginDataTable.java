package Selenium.stepdefinition;

import java.util.List;
import java.util.Map;

//Again here we are copying the code from the parabanklogindata
//Again changing @Then to @And, so @Given,@When,@And,@Then,@And
//dataTable.asMap(null, null) = here null represents | UserName | Password | and | johndoe1 | johndoe1 |
//UserName and PassWord are called as 'keyword' and johndoe1 and johndoe1 are called as 'values'
//Both are strings, so the null will be String.class, String.class =dataTable.asMap(String.class, String.class);
//Mouse hover on the .asMaps and copy the List<Map<String, String>> 
//And it becomes: List<Map<String, String>> dataTable.asMaps(String.class, String.class);
//And add credentials = (after dataTable). So it becomes: List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
//We have to save the credentials(userName and password) in the string
//We are changing the runner class code now
//From this code :@CucumberOptions(features =".\\FeatureFiles\\parabankData.feature", glue = "Selenium.stepdefinition" )
//To : @CucumberOptions(features =".\\FeatureFiles\\parabankDataTable.feature", glue = "Selenium.stepdefinition" )

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ParaBankLoginDataTable {
	
	public WebDriver driver;
	
	@Given("user on login page")
	public void user_on_login_page() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
	    System.out.println("ParaBank home page is launched successfully");
	}

	@When("user enters the credentials")
	public void user_enters_the_credentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
		String username = credentials.get(0).get("UserName");
		String password = credentials.get(0).get("Password");
		System.out.println(username + "," + password);
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
		System.out.println("Valid username and password are entered");
	}

	@And("clicks at login button")
	public void clicks_at_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Click on login button");
	}

	@Then("user views home page")
	public void user_views_home_page() {
	    boolean status = driver.findElement(By.partialLinkText("New Account")).isDisplayed();
	    if(status) {
	    	 System.out.println("User home page is displayed");
	    }
	    else {
	    	System.out.println("User home page is not displayed");
	    }
	}

	@And("application is closed by the user")
	public void application_is_closed_by_the_user() {
	    driver.close();
	    System.out.println("Application is closed");
	}

	}


