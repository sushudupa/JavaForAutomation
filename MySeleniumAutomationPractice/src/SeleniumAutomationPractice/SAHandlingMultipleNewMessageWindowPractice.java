package SeleniumAutomationPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAHandlingMultipleNewMessageWindowPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the System property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com";
		
		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Create the object instance for action class
		Actions action = new Actions(driver);
		
		//Mouse hover action on QA automation
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Mouse hover action on QA Automation");
		
		//Mouse Hover action on Practice Automation
		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();
		System.out.println("Mouse hover action on practice automation");
		
		//Mouse Hover action on Multiple Windows
		WebElement multipleWindows = driver.findElement(By.partialLinkText("Multiple Windows"));
		multipleWindows.click();
		System.out.println("Mouse hover action on multiple windows");
		
		//Opening the new message window
		driver.findElement(By.xpath("//button[@name='newmessagewindow321']")).click();
		
	    //Retrieve the number of windows ID's or browsers ID's
		System.out.println(driver.getWindowHandles());
		
		//Get the Window ID's
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> iterator = windowID.iterator();
		
		//Storing the Window's ID in respective windows
		String homePage = iterator.next(); //Main Window
		String newMsgWindow = iterator.next(); // New Window
		
		System.out.println("Parent Browser ID is " + homePage);
		System.out.println("Child Browser ID is " + newMsgWindow);
		
		// Switching the control to new window and performing all the operations in New Page Window
		driver.switchTo().window(newMsgWindow);
		System.out.println("New Message Window is activated");
		
		//Close the child window (new message window)
		driver.close();
		System.out.println("New message window is closed");
		
		//Switching the control to main window and performing all the operations in Home Page Window
		driver.switchTo().window(homePage);
		System.out.println("Parent browser window is activated");
		
		//Close the parent window
		driver.close();
		System.out.println("Parent window is closed");
		
	}

}
