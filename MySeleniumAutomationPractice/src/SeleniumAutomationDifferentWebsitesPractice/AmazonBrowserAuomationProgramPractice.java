package SeleniumAutomationDifferentWebsitesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBrowserAuomationProgramPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://www.amazon.com/";
		
		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Get the title of the page and print
		driver.getTitle();
		System.out.println("The title of the page is " + driver.getTitle());
		
		//Click on the kindle books link
		WebElement kindleBooks = driver.findElement(By.partialLinkText("Kindle Books"));
		kindleBooks.click();
		System.out.println("Kindle Books link is clicked");
		
		//Get the page title of kindle books
		driver.getTitle();
		System.out.println("The page title of kindle books is " + driver.getTitle());
		
		//Navigate back to home page
		driver.navigate().back();
		System.out.println("Navigated back to the home page");
		
		//Page title of the amazon browser
		driver.getTitle();
		System.out.println("The title of the page is " + driver.getTitle());
		
		//Close the browser
		driver.close();
		System.out.println("Application is closed");
		
		
	}

}
