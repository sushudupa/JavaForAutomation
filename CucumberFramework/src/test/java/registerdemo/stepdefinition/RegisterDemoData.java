package registerdemo.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterDemoData {
	
	public WebDriver driver;
	
	@Given("demo site is navigated")
	public void demo_site_is_navigated() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
	    System.out.println("Register demo home page is launched successfully");
	}

	@When("first name entered {string}")
	public void first_name_entered(String firstName) {
		driver.findElement(By.name("vfb-5")).sendKeys(firstName);
		System.out.println("User first name is entered");

	}

	@And("user enter last name {string}")
	public void user_enter_last_name(String lastName) {
		driver.findElement(By.name("vfb-7")).sendKeys(lastName);
		System.out.println("Last name is entered by the user");
	}

	@Then("gender is selected by user")
	public void gender_is_selected_by_user() {
	    driver.findElement(By.id("vfb-8-1")).click();
	    System.out.println("Gender is selected bt the user");
	}

	@Then("user entered email id {string}")
	public void user_entered_email_id(String emailID) {
		driver.findElement(By.name("vfb-14")).sendKeys(emailID);
		System.out.println("User entered email id");
	}

	@And("verification code {string}")
	public void verification_code(String verificationCode) {
		driver.findElement(By.xpath("//input[@id='vfb-3']")).sendKeys(verificationCode);
		System.out.println("Verification code entered");
	}

	@Then("enter submit button")
	public void enter_submit_button() {
		 driver.findElement(By.name("vfb-submit")).click();
		 System.out.println("Submit button entered");
	}

	@And("application is closed")
	public void application_is_closed() {
	   driver.close();
	   System.out.println("User closed the application");
	}

}
