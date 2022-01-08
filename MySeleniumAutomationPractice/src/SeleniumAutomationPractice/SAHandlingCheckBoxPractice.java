package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingCheckBoxPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com/demo-site/";

		//Launch the Application
		driver.get(URL);
		System.out.println("Application is Launched");

		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Declaring the webelement object
		WebElement coreJavaCheckBox = driver.findElement(By.xpath("//input[@id='vfb-20-3']"));

		//Verify the Core Java Check Box is Displayed or not
		if(coreJavaCheckBox.isDisplayed()) {
			System.out.println("Core Java Check Box is Displayed");
		}
		else
		{
			System.out.println("Core Java Check Box is not Displayed");
		}

		//Verify the Core Java Check Box is Enabled or not
		if(coreJavaCheckBox.isEnabled()) {
			System.out.println("Core Java Check Box is Enabled");
		}
		else
		{
			System.out.println("Core Java Check Box is not Enabled");
		}

		//1.Verify the Core Java Check Box is Selected
		if(coreJavaCheckBox.isSelected()) {
			System.out.println("Core Java Check Box is Selected");
		}
		else
		{
			System.out.println("Core Java Check Box is not Selected");

			//Check the Core Java Check Box
			coreJavaCheckBox.click();
		}

		Thread.sleep(3000);

		//2.Verify the Core Java Check Box is Selected // In this case, the above program will come here and check the status of check box
		if(coreJavaCheckBox.isSelected()) {
			System.out.println("Core Java Check Box is Selected");
		}
		else
		{
			System.out.println("Core Java Check Box is not Selected");
		}

		Thread.sleep(3000);

		//3.Verify the Core Java Check Box is Selected or not = This program is to uncheck the check bob
		if(coreJavaCheckBox.isSelected()) {

			//Uncheck the Core Java Check Box
			coreJavaCheckBox.click();
			System.out.println("Core Java Check Box is unchecked");
		}
		else
		{
			System.out.println("Core Java Check Box is not unchecked");
		}

		//If you want to select the course, then put it in the else condition
		//If you want to unselect the course, then put it in the if condition
		//If the course if already selected before the coding, then put the coding in 'if' condition to uncheck it

		//Close the Application
		driver.close();
		System.out.println("Application is Closed");








	}

}
