package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAHandlingMouseHoverPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create object instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com";

		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is Maximized");

		// Create an Instance in Action Class by passing webdriver instance
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the qaAutomation
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Mouse Hover Action on Q A Automation");

		//Performing the mouse hover action on the Practice Automation
		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();
		System.out.println("Mouse Hover Action on the Practice Automation");

		//Performing the mouse hover action on the Registration Form
		WebElement registrationForm = driver.findElement(By.partialLinkText("Registration Form"));
		registrationForm.click();
		System.out.println("Registration Form is clicked");

		//Close the Application
		driver.close();
		System.out.println("Application is closed");

	}

}
