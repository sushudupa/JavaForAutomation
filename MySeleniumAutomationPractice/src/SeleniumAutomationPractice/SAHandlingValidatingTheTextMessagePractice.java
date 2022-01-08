package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingValidatingTheTextMessagePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create object instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com/demo-site/";

		//Launch the URL
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Positive Scenario
		//Declaring the webelement object
		WebElement regTitleText = driver.findElement(By.xpath("//h3[contains(text() ,'Register For Demo')]"));

		//Verify the Registration Title is displayed
		if(regTitleText.isDisplayed()) {
			System.out.println("Registration Title Text is Displayed");
		}
		else
		{
			System.out.println("Registration Title Text is not Displayed");
		}

		//Validating the text
		//When there is no attributes at all when we inspect, go for getText() method.

		System.out.println(regTitleText.getText()); //This step is done just to make sure that it displays the "register for demo" text

		String actRegTitle = regTitleText.getText();
		String expRegTitle = "Register For Demo";

		if(actRegTitle.equals(expRegTitle)) {
			System.out.println("The actual and expected titles are same");
			System.out.println("The Actual Registration Title is " + actRegTitle);
		}
		else
		{
			System.out.println("The actual and expected titles are not same");
			System.out.println("The Actual Registration Title is " + actRegTitle);
			System.out.println("The Expected Registration Title is " + expRegTitle);
		}

		//Click on Submit Button - To get the mandatory error message
		driver.findElement(By.xpath("//input[@id='vfb-4']")).click();

		// Negative Scenario /Error Message
		//First name error message

		// Declaring the WebElement object
		WebElement firstNameErrMsg =  driver.findElement(By.xpath("//label[@class='vfb-error']"));

		String actFirstNameErrMsg = firstNameErrMsg.getText();
		String expFirstNameErrMsg = "This field is required.";

		if(actFirstNameErrMsg.equals(expFirstNameErrMsg)) {
			System.out.println("The Actual an Expected First Name Error Message are same");
			System.out.println("The First Name Error Message is " + actFirstNameErrMsg);
		}
		else
		{
			System.out.println("The Actual an Expected First Name Error Message are not same");
			System.out.println("The Actual First Name Error Message is " + actFirstNameErrMsg);
			System.out.println("The Expected First Name Error Message is " + expFirstNameErrMsg);
		}

		//Close the Application
		driver.close();
		System.out.println("Application is Closed");

	}

}
