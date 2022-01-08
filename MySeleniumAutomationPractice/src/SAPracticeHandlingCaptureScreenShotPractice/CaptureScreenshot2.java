package SAPracticeHandlingCaptureScreenShotPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/alertandpopup/";
		
		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Taking Sreenshot
		//Get entire page screenshot
				
		//Create an object instance in TakesScreenshot class/interface
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		
		// Call getScreenshotAs method to create image file
		File file = scrShot.getScreenshotAs(OutputType.FILE);
		
		// Copy file to Desired Location
		FileUtils.copyFile(file, new File(".\\Screenshot\\Alertandpopup.jpg"));
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");
		
		
	}

}
