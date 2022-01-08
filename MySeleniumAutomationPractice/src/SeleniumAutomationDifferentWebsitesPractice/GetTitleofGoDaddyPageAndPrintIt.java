package SeleniumAutomationDifferentWebsitesPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleofGoDaddyPageAndPrintIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.godaddy.com/";
		
		//Launch the Application
		driver.get(url);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Maximize the application");
		
		//Get the title of the page and print
		driver.getTitle();
		System.out.println("The title of the page is " + driver.getTitle());
		
		//URL of the page and print
		String strUrl = driver.getCurrentUrl();
		System.out.println("The current URL is " + strUrl);
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");
		
	}

}
