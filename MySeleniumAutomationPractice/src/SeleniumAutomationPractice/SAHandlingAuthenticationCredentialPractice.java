package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingAuthenticationCredentialPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//What is Authentication?
		//Company uses its own proxy setting to access the server. 
		//When you open some web pages, a pop up window will load and request to enter the user credential to access the user server



		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create object instance
		WebDriver driver = new ChromeDriver();


		//This URL's popup is window based popup. But selenium's popup is web based popup
		// Url without authenticate 
		// URL = "http://the-internet.herokuapp.com/basic_auth";

		//URL with authentication
		//Syntax : "http://username:password@url.......com"
		String URL2 = "http://admin:admin@the-internet.herokuapp.com/basic_auth";


		//Launch the URL
		driver.get(URL2);
		System.out.println("Application is Launched");

		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Declare the webelement
		WebElement msg = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]"));

		//Validating the greeting message
		String actMsg = msg.getText();
		String expMsg = "Congratulations! You must have the proper credentials.";

		if(actMsg.equals(expMsg)) {
			System.out.println("Both the actual and expected message are same");
			System.out.println("The actual message is " + actMsg);
		}
		else
		{
			System.out.println("Both the actual and expected message are not same");
			System.out.println("The actual message is " + actMsg);
			System.out.println("The expected message is " + expMsg);
		}

		//Close the Application
		driver.close();
		System.out.println("Application is closed");
	}

}
