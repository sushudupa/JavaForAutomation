package SeleniumAutomationSynchronizationWaitStmtPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgressBarImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If we put implicit wait, find element will not throw an exception(NoSuchElementException)if the element is not found in first instance
		//Instead it will poll fo the element until the timeout and them proceeds furthur.
		//Syntax: driver.manage.timeouts.implicitlywait(TimeOut,TileUnits.SECONDS);
		//Code needs to be implemented below the webdriver statement. That is after creating the object instance for chromedrivre/edge/firefox
		//Below the object instance this code has to be implemtnted
		//Implicit wait works only for findelement or findelements method.
		//This code wont work for iframe, switchTo, alertBox
		//When to write this implicit wait is application is taking lot of time and slow network
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String URL = "https://nxtgenaiacademy.com";
		
		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("APplication is maximized");
		
		//Create the object instance for the action class
		Actions action = new Actions(driver);
		
		//Performing the mouse hover action on qa Automation
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Mouse hover action on QA automation");
		
		//Performing mouse hover action on Practice Automation
		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();
	    System.out.println("Mouse hover action on Practice Automation");
	    
	    //Performing mouse hover action on Multiple Windows
	    WebElement multipleWindows = driver.findElement(By.partialLinkText("Multiple Windows"));
	    multipleWindows.click();
	    System.out.println("Mouse hover action performed on multiple windows");

	    //Close the application
	    driver.close();
	    System.out.println("Application is closed");
		
	}

}
