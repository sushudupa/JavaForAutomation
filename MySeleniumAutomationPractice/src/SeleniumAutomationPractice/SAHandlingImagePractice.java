package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingImagePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		
		//Launch the Application
		driver.get(URL);
		System.out.println("Application is Launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Maximize the Application");
		
		//Declaring the WebElement
		WebElement robotImage = driver.findElement(By.xpath("//img[@alt='Automation']"));
		
		//Verify robot image is displayed or not
		if(robotImage.isDisplayed()) {
			System.out.println("Robot Image is Displayed");
			
			//Get the robot image text
			String robotImageText = robotImage.getAttribute("alt");
			System.out.println("The text of Robot Image is " + robotImageText);
		}
		else
		{
			System.out.println("Robot Image is not Displayed");
		}
	    
		//Declaring the webelement of logo image
		WebElement logoImage  =driver.findElement(By.xpath("//img[@alt='NxtGen A.I Academy']"));
		
		if(logoImage.isDisplayed()) {
			System.out.println("Logo Image is Displayed");
			
			//Get the logo image text
			String logoImageText = logoImage.getAttribute("alt");
			System.out.println("The text of logo image is " + logoImageText);
			
			//Click on the logo image text
			logoImage.click();
			System.out.println("Logo Image is Clicked");
		}
		else
		{
			System.out.println("Logo Image is not Displayed");
		}
		
		//Close the Application
		driver.close();
		System.out.println("Application is closed");

	}

}
