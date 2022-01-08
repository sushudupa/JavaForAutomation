package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAHandlingToolTipPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Actions class = A.class in selenium is a built in feature provided by the selenium for handling keyboard and mouse events.
		//Steps:
		//1. Create the Actions instnace
		//2. Declare the Web Element object for the google search(i used xpath)
		//3. Tool tip action = 1. action class 2. move the mouse pointer using moveToElement method(google search is the element) & click .perform
		

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://www.google.com";
		
		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		// Create an Instance in Actions Class by passing webdriver instance
		Actions action = new Actions(driver);
		
		//Declaring the webelement object
		WebElement googleSearch = driver.findElement(By.xpath("//input[@title='Search']"));
		
		// Using moveToElement() tool-tip
		action.moveToElement(googleSearch).perform();
		
		// Validating the tool-tip message
		String actGoogleSearch = googleSearch.getAttribute("Title");
		String expGoogleSearch = "Search";
		
		if(actGoogleSearch.equals(expGoogleSearch)) {
			System.out.println("Both the actual and expected tool tip message are same");
			System.out.println("The tool tip message is " + actGoogleSearch);
		}
		else
		{
			System.out.println("Both the actual and expected tool tip message are not same");
			System.out.println("The actual tool tip message is " + actGoogleSearch);
			System.out.println("The expected tool tip message is " + expGoogleSearch);
			
		}
		
		//Close the Application
		driver.close();
		System.out.println("Application is closed");
		
	}

}
