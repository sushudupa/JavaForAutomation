package SeleniumAutomationPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAHAndlingMultipleTabsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/";
		
		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Create the object instance for action class
		Actions action = new Actions(driver);
		
		//Mouse Hover action on QA Automation
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Mouse Hover action on QA Automation");
		
		//Mouse Hover action on Practice Automation
		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();
		System.out.println("Mouse Hover action on Practice Automation");
		
		//Mouse Hover action on Multiple Windows
		WebElement multipleWindows = driver.findElement(By.partialLinkText("Multiple Windows"));
		multipleWindows.click();
		System.out.println("Mouse Hover action on Multiple Windows link");
		
		//Opening the new broswer window
		driver.findElement(By.xpath("//button[@name='newbrowsertab453']")).click();
		System.out.println("Child browser tab is opened");
		
		//Retrieve the number of windows ID's or browsers ID's
		System.out.println(driver.getWindowHandles());
		
		///Get the Window ID's
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> iterator = windowID.iterator();
		
		//Storing the Window's ID in respective windows
		String homePage = iterator.next(); //Main Window
		String newTab = iterator.next(); //New window
		
		System.out.println("Parent Browser ID is " + homePage);
		System.out.println("Child Browser ID is " + newTab);
		
		// Switching the control to new window and performing all the operations in New Page Window
		driver.switchTo().window(newTab);
		System.out.println("Child Browser Tab is activated");
		
		//Click on Python For Data Science in Home page
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
		System.out.println("Python for Data Science link is clicked in child browser tab");
		
		//close the child browser tab
		driver.close();
		System.out.println("Child Browser Tab is closed");
		
		//Switching the control from child to parent
		driver.switchTo().window(homePage);
		System.out.println("Parent Browser tab is activated");
		
		//Click on Home page link in parent window browser
		driver.findElement(By.linkText("HOME")).click();
		System.out.println("Home Link is clicked in parent window browser");
		
		//Close the parent window
		driver.close();
		System.out.println("Parent browser window is closed");

	}

}
