package SeleniumAutomationSynchronizationWaitStmtPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ProgressBarFluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fluent wait = The maximum amount of time to wait for a condition, as well as the frequeny with which to check the condition
		//Frequency: Setting up a repeat cycle with the time frame to verify/check the condition at the regular interval of time
		//The user may configure the wait to ignore specific types of exceptions while waiting, such as NoSuchElementException
		//when searching for the element on that page
		//User can also customize the error exception message
		//Most of the cases, this explicit wait works better compared to implicit wait
		//Because, implicit wait is mainly for the network issues and findelement and findelements issue.
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://demoqa.com/progress-bar";
		
		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Click on the start button
		driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
		System.out.println("Start button is clicked");
		
		// Declaring the reset webelement
		 WebElement resetBtn;

		
		//Create the object instance for WebElement
		//Syntax: Wait<WebDriver>wait = new FluentWait<WebDriver><Reference> 
		                              //.withTimeOut(timeout, SECONDS)
		                              //.polllingEvery(timeout, SECONDS)
		                              //.ignoring(Exception.class)
		 
		 //You can include the message as well in the code
		 //This syntax means, after creating the object instance, 
		 //Wait until 20 sec time
		 //Poll every 5 sec
		 //And ignore every element exception
		 //20 sec means, it wait for 20 seconds total time to check
		 //5 sec means, it checks reset button every 5 seconds until 20 seconds time is over
		 //If it finds the reset button, it comes out of the code and click on reset button
		 //or esle, it throws an error message what we have coded
		 //This code will not throw the exception(nosuchelementexception) until 20 seconds.
		 
		 
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				        .withTimeout(Duration.ofSeconds(20))  
				        .pollingEvery(Duration.ofSeconds(5))
				        .withMessage("Fluent wait is implemented")
				        .ignoring(NoSuchElementException.class);
		 
		 resetBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='resetButton']")));
		 
		 //Click on the reset button
		 resetBtn.click();
		 System.out.println("Reset button is clicked");
		 
	
	}

}
