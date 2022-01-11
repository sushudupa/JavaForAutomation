package registerdemo.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterDemoScenario {
	public WebDriver driver;
	
	@Given("user is navigated to the demo site")
	public void user_is_navigated_to_the_demo_site() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
	    System.out.println("Register demo home page is launched successfully");
	}
	

	@When("user first name is entered")
	public void user_first_name_is_entered() {
    driver.findElement(By.name("vfb-5")).sendKeys("John");
    System.out.println("User first name is entered");
	}

	@And("and last name if filled")
	public void and_last_name_if_filled() {
	driver.findElement(By.name("vfb-7")).sendKeys("Doe");
	System.out.println("Last name entered");
	}

	@Then("user select the gender")
	public void user_select_the_gender() {
    driver.findElement(By.id("vfb-8-1")).click();
    System.out.println("User select the gender");
	}

	@Then("email id is entered by user")
	public void email_id_is_entered_by_user() {
	driver.findElement(By.name("vfb-14")).sendKeys("johndoe@gmail.com");
	System.out.println("Email id is entered by the user");
	}

	@And("enter verification code")
	public void enter_verification_code() {
	 driver.findElement(By.xpath("//input[@id='vfb-3']")).sendKeys("84");
	 System.out.println("Enter verification code");
	}

	@Then("submit button entered")
	public void submit_button_entered() {
	 driver.findElement(By.name("vfb-submit")).click();
	 System.out.println("Submit button entered");
	}

	@And("closed application")
	public void closed_application() {
	driver.close();
	System.out.println("closed application");
	}
	
	
	
	

}
