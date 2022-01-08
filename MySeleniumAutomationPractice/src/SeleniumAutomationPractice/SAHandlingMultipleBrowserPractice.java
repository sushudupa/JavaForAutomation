package SeleniumAutomationPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAHandlingMultipleBrowserPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"Set" is a java functionality
		//"Set" - Each window(parent and children )value will be saved in the "Set"
		//The "Set" values will be stored in the String type
		//Iterator is the compulsory step
		//1.Set<String> windowID = myDriverInstance.getWindowHandles(); = gets all the window ID's
		//2. Iterator<String> iterator = windowID.iterator();
		//a.String homePage = iterator.next(); //Parent = Assiging each window ID to respectable variable name (homePage - variable name)
	    //b.String newPage = iterator.next(); //Child = Assiging each window ID to respectable variable name (newPage - variable name)
		//c.System.out.println("Parent Broswer ID is " + homePage);
		//d.System.out.println("Child Browser ID is " + newPage);
		//3. The above 4 lines(a,b,c,d)code is very imptortant for handling the multiple browser
		//4. driver.switchTo().window(newPage); = This code is used to activate the child browser =using variable names to switch between each windows
		//5. Same code is used to take back control from child to parent : driver.switchTo().window(homePage);
		//6. It it is child window, we use (newPage), and for parent window, we use (homePage)
		
		
		
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com";
		
		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Create the object instance for action class
		Actions action = new Actions(driver);
		
		//Mouse hover action on Q A automation
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Mouse Hover action on Q A Automation");
		
		//Mouse hover action on practice automation
		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();
		System.out.println("Mouse Hover aciton on Practice Automtion");
		
		//Performing mouse hover action on multiple windows
		WebElement multipleWindows = driver.findElement(By.partialLinkText("Multiple Windows"));
		multipleWindows.click();
		System.out.println("Mouse hover action on multiple windows");
		
		//Opening new browser window
		driver.findElement(By.xpath("//button[@name='newbrowserwindow123']")).click();
		System.out.println("Child browser window is opened");
		
		//Now switching the control from parent to child
		//getWindowHandles code is used to get the number of browsers opened(that is parent and children)
		//Syntax used is: (driver.getWindowHandles());
		//getWindowHandles : try to get window ID of each window.
		
		//Retrieve the number of windows ID's or browsers ID's
		System.out.println(driver.getWindowHandles());
		
		//Get the window ID
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> iterator = windowID.iterator();
		
		//Storing the Window's ID in respective windows
		String homePage = iterator.next(); //Parent
		String newPage = iterator.next(); //Child
		
		System.out.println("Parent Broswer ID is " + homePage);
		System.out.println("Child Browser ID is " + newPage);
		
		// Switching the control to new window and performing all the operations in New Page Window
		driver.switchTo().window(newPage);
		System.out.println("Child browser is activated");
		
		//Maximize the child browser
		driver.manage().window().maximize();
		System.out.println("Child browser is maximized");
		
		//Click on Python for data science link
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
		System.out.println("Python for Data science link is clicked");
		
		//Close the child browser
		driver.close();
		System.out.println("Child browser window is closed");
		
		//Switching the control from child to parent
		driver.switchTo().window(homePage);
		System.out.println("Parent window is activated");
		
		//click on Home Link
		driver.findElement(By.linkText("HOME")).click();
		System.out.println("Home link is clicked in parent window");
		
		//Close the parent window
		driver.close();
		System.out.println("Parent browser window is closed");
		
	}

}
