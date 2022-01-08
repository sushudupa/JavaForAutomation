package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAHandlingMillionWordsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Parameterized all Input Values
		String firstAndLastNameValue = "Sushma Udupa";
		String emailIDValue = "sushma.udupa@gmail.com";
		String subjectValue = "Learn more about computers";
		String messageTextValue = "How long do you take to finish the program?";
		
		//Parameterized all the Webelement Value
		String firstAndLastNamelocator = "//input[@name='name']";
		String emailIDlocator = "//input[@type='email']";
		String subjectlocator = "//input[@name='subject']";
		String messagelocator = "//textarea[@data-msg='Please write something for us']";
		String submitButtonLocator = "//button[@type='submit']";

		
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\Chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String url = "https://millionwords.com/";
		
		//Launch the application
		driver.get(url);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Create the object instance
		Actions action = new Actions(driver);
		
		//Mouse hover action on Our mission
		WebElement ourMission = driver.findElement(By.partialLinkText("Mission"));
		action.moveToElement(ourMission).perform();
		System.out.println("Mouse Hover action on Our Mission");
		
		//1.First Name
		WebElement firstAndLastName = driver.findElement(By.xpath(firstAndLastNamelocator));
		
		//Verify if the first and last name is Displayed or not
		if(firstAndLastName.isDisplayed()) {
			System.out.println("First name and last name value is displayed");
		}
		else
		{
			System.out.println("First Name and last name value is not displayed");
		}
		
		//Verify if the first and last name is Enabled or not
		if(firstAndLastName.isEnabled()) {
			System.out.println("First and last name value is enabled");
			//Enter the first and last name
			firstAndLastName.sendKeys(firstAndLastNameValue);
			System.out.println("The present first and last name value is " + firstAndLastNameValue);
		}
		else
		{
		  System.out.println("First and last name is not enabled");
		}
		
		//2.Email ID
		WebElement emailID = driver.findElement(By.xpath(emailIDlocator));
		
		//Verify is email id is Displayed or not
		if(emailID.isDisplayed()) {
			System.out.println("Email ID is displayed");
		}
		else
		{
			System.out.println("Email Id is not displayed");
		}
			
		//Verify if email ID is enabled or not
		if(emailID.isEnabled()) {
			System.out.println("Email ID is enabled");
			
			//Enter the email ID value
			emailID.sendKeys(emailIDValue);
			System.out.println("Email Id values is " + emailIDValue);
		}
		
		//3.Subject Query
		WebElement subject = driver.findElement(By.xpath(subjectlocator));
		
		//Verify if subject is displayed or not
		if(subject.isDisplayed()) {
			System.out.println("Subject query is displayed");
		}
		else
		{
			System.out.println("Subject query is not displayed");
		}
		
		//Verify if subject query is enabled or not
		if(subject.isEnabled()) {
			System.out.println("Subject query is enabled");
			
			//Enter the subject query
			subject.sendKeys(subjectValue);
			System.out.println("The subject query value is " + subjectValue);
		}
		else
		{
			System.out.println("Subject query is not enabled");
		}
		
		
		//4. Message Locator
		WebElement messageText = driver.findElement(By.xpath(messagelocator));
		
		//Verify if message text is dispalyed or not
		if(messageText.isDisplayed()) {
			System.out.println("Message Text is Displayed");
		}
		else
		{
			System.out.println("Message text is not Displayed");
		}
		
		//Verify the message text is Enabled or not
		
		if(messageText.isEnabled()) {
			System.out.println("Message text is Enabled");
			
			//Enter the message
			messageText.sendKeys(messageTextValue);
			System.out.println("The message text value is " + messageTextValue);
		}
		else
		{
			System.out.println("Message Text is not enabled");
		}
		
		//5. Submit Button/Send Message button
		WebElement submitButton = driver.findElement(By.xpath(submitButtonLocator));
		
		//Verify if submit Button is Displayed or not
		if(submitButton.isDisplayed()) {
			System.out.println("Submit button is Displayed");
		}
		else
		{
			System.out.println("Submit button is not displayed");
		}
		
		//Verify if submit button is Enabled or not
		if(submitButton.isEnabled()) {
			System.out.println("Submit button is enabled");
		}
		else
		{
			System.out.println("Submit button is not enabled");
		}
		
		//Verify is submit button is Seleced or not
		if(submitButton.isSelected()) {
			System.out.println("Submit button is Selected");
		}
		else
		{
			System.out.println("Submit button is not selected");
			
			//Click on Submit button
			submitButton.click();
			System.out.println("Submit button is clicked");
		}
		
		//Close the Application
		driver.close();
		System.out.println("Application is closed");
		
	}

}
