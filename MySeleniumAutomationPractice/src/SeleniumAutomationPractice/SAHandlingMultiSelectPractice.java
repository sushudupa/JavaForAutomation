package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAHandlingMultiSelectPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. To perform the "control" function without touching control tab nwith finger, you have to use "KeyDown" (human interaction key)

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver driver = new ChromeDriver();

		//Storing the Application URL in the String Variable
		String URL = "https://demoqa.com/selectable/";

		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		// Click on Grid Tab 
		driver.findElement(By.xpath("//a[@id='demo-tab-grid']")).click();
		System.out.println("Demo Tab Grid is Clicked");

		//Declare the WebElement Values
		WebElement one = driver.findElement(By.xpath("//li[contains(text(),'One')]"));
		WebElement five = driver.findElement(By.xpath("//li[contains(text(),'Five')]"));
		WebElement seven = driver.findElement(By.xpath("//li[contains(text(),'Seven')]"));

		// Create an Instance in Action Class by passing webdriver instance
		Actions action = new Actions(driver);

		// To select multiple values
		action.keyDown(Keys.CONTROL)
		.click(one)
		.click(five)
		.click(seven)
		.keyUp(Keys.CONTROL);


		//Click on perform action
		action.perform();
		System.out.println("Multiple Values are selected from the grid");

		//Close the Application
		driver.close();
		System.out.println("Application is Closed");

	}

}
