package registerdemo.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterDemoDataDriven {
	
	public WebDriver driver;
	
	@Given("user navigates to demo site")
	public void user_navigates_to_demo_site() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
	    System.out.println("Register demo home page is launched successfully");
	}

	@When("user enters the credential {string}")
	public void first_name_entered(String firstName) {
		driver.findElement(By.name("vfb-5")).sendKeys("John");
        System.out.println("First Name entered");
	}

	@And("user entered last name credential {string}")
	public void user_entered_last_name_credential(String lastName) {
		driver.findElement(By.name("vfb-7")).sendKeys("Doe");
		System.out.println("User entered the last name credential");
	}

	@Then("user choose the gender")
	public void user_choose_the_gender() {
	    driver.findElement(By.id("vfb-8-1")).click();
	    System.out.println("User choose the gender");
	}

	@Then("email id entered by the user {string}")
	public void email_id_entered_by_the_user(String emailID) {
		driver.findElement(By.name("vfb-14")).sendKeys("johndoe@gmail.com");
		System.out.println("Email id entered by the user");
	}

	@And("user verify the code {string}")
	public void user_verify_the_code(String verificationCode) {
		driver.findElement(By.xpath("//input[@id='vfb-3']")).sendKeys("84");
		System.out.println("User verify the code");
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
		 driver.findElement(By.name("vfb-submit")).click();
		 System.out.println("Submit button entered");
	}
	
	@And("user closes the application")
	public void user_closes_the_application() {
	   driver.close();
	   System.out.println("user closes the application");
	}

}
