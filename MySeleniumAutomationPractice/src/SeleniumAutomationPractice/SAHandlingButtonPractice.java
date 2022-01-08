package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingButtonPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		
		//Launch the URL
		driver.get(URL);
		System.out.println("Application is Launched");

		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Declare the webelement object
		WebElement submitBtn = driver.findElement(By.xpath("//input[@name='vfb-submit']"));
		
		//Verify if Submit Button is Displayed or not
		if(submitBtn.isDisplayed()) {
			System.out.println("Submit Button is Displayed");
			
			//Click on the Submit Button
			submitBtn.click();
			System.out.println("Submit Button is Clicked");
		}
		else
		{
			System.out.println("Submit Button is not Displayed");
		}
        
		Thread.sleep(3000);
		
		
		//Verify if Submit Button is Enabled or not
		if(submitBtn.isEnabled()) {
			System.out.println("Submit Button is Enabled");
		}
		else
		{
			System.out.println("Submit Button is not Enabled");
		}
		
		//Only for execution purpose. Not recommended to use it elsewhere
		Thread.sleep(3000);
		
		//Close the Applicaiton
		driver.close();
		System.out.println("Application is closed");
		
	}

}
