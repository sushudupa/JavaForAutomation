package registerdemo.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterDemoDataTable {
	
	public WebDriver driver;
	
	@Given("navigated to demo site")
	public void navigated_to_demo_site() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
	    System.out.println("Register demo home page is launched successfully");
	}

	@When("user gives the credential")
	public void user_gives_the_credential(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<String> credential = dataTable.asList(String.class);
		driver.findElement(By.name("vfb-5")).sendKeys(credential.get(0));
		System.out.println("User enter the first name");
	}

	@And("last name is entered")
	public void last_name_is_entered(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<String> credential = dataTable.asList(String.class);
		driver.findElement(By.name("vfb-7")).sendKeys(credential.get(0));
		System.out.println("Last name is entered");
	}

	@Then("user selects the gender")
	public void user_selects_the_gender() {
	    driver.findElement(By.id("vfb-8-1")).click();
	    System.out.println("Gender is selected bt the user");
	}

	@Then("email id credential")
	public void email_id_credential(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		 List<String> credential = dataTable.asList(String.class);
		 driver.findElement(By.name("vfb-14")).sendKeys(credential.get(0));
	}

	@And("code to verify")
	public void code_to_verify(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		 List<String> credential = dataTable.asList(String.class);
		 driver.findElement(By.xpath("//input[@id='vfb-3']")).sendKeys(credential.get(0));
	}

	@Then("user enters submit button")
	public void user_enters_submit_button() {
		 driver.findElement(By.name("vfb-submit")).click();
		 System.out.println("Submit button entered");
	}
	
	@And("application closed by the user")
	public void application_closed_by_the_usesr() {
	   driver.close();
	   System.out.println("closed the application by user");
	}
}
