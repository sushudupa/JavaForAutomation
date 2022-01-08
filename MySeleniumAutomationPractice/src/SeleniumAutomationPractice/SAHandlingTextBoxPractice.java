package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingTextBoxPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create an object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		String firstNameValue = "Sushma";
		
		//Launch the URL
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Declaring the WebElement Object that is First Name //WebElement is a datetype
		WebElement firstName = driver.findElement(By.xpath("//input[@name='vfb-5']"));
		
		//Verify if first name is Displayed or not
		if(firstName.isDisplayed()) {
			System.out.println("First Name is Displayed");
		}
		else
		{
			System.out.println("First Name is not Displayed");
		}
     
		//Verify if first name is Enabled or not
		if(firstName.isEnabled()) {
			System.out.println("First Name is Enabled");
			
			//Enter the first name = Always enter the values(statement) either inside is displayed or is enabled.
			firstName.sendKeys(firstNameValue);
			System.out.println("First Name value is " + firstNameValue);
			
		}
		else
		{
			System.out.println("First Name is not Enabled");
		}
		
		Thread.sleep(3000);
		
		// Clear first name
		firstName.clear();
		System.out.println("First Name is Cleared");
		
		Thread.sleep(3000);
		
		//Close the Application
		driver.close();
		System.out.println("Application is Closed");
	
	}

}
