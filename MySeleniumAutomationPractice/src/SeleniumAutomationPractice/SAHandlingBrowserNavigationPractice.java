package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingBrowserNavigationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		
		//Create an object Instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		
		//Launch the URL
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Navigate to Python For Data Science Page
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
		System.out.println("Python For Data Science Page is Clicked");
		
		//Back Button - Return to Demo Page
		driver.navigate().back();
		System.out.println("Navigated back to Demo Page");
		
		//Forward Button - Return to Data Science Page
		driver.navigate().forward();
		System.out.println("Navigated forward to Data Science Page");
		
		//Navigate to home page
		driver.navigate().to("https://nxtgenaiacademy.com");
		System.out.println("Navigated to Home Page");
		
		//Refresh the Home Page
		driver.navigate().refresh();
		System.out.println("Home Page is Refreshed");
		
		//Close the Application
		driver.close();
		System.out.println("Application is closed");
	
		
		
		
	}

}
