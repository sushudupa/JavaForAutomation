package SeleniumAutomationDifferentWebsitesPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchtheGoDaddyWebsitePractice {

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
		
		//Close the Application
		driver.close();
		System.out.println("Application is closed");
	}

}
