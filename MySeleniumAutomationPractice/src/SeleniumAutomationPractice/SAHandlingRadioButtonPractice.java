package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingRadioButtonPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create an object instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com/demo-site/";

		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Declaring the WebElement
		WebElement femaleRadBtn = driver.findElement(By.xpath("//input[@id='vfb-8-2']"));

		//Verify if female radio button is Displayed or not
		if(femaleRadBtn.isDisplayed()) {
			System.out.println("Female Radio Button is Displayed");
		}
		else
		{
			System.out.println("Female Radio Button is not Displayed");
		}

		//Verify  if female radio button is Enabled or not
		if(femaleRadBtn.isEnabled()) {
			System.out.println("Female Radio Button is Enabled");
		}
		else
		{
			System.out.println("Female Radio Button in not Enabled");
		}

		//Verify if female radio button is Selected or not
		if(femaleRadBtn.isSelected()) {
			System.out.println("Female Radio Button is Selected");
		}
		else
		{
			System.out.println("Female Radio Button is not Selected");

			//Select Female Radio Button
			femaleRadBtn.click();
			System.out.println("FEMALE Radio Button is SELECTED");
		}

		// Verify the Female Radio Button is selected = This step is after entering the value in else (above mentioned)
		if(femaleRadBtn.isSelected()) {
			System.out.println("Female Radio Button is Selected");
		}
		else
		{
			System.out.println("Female Radio Button is not Selected");
		}

		//Close the Application
		driver.close();
		System.out.println("Application is Closed");

		//We have to code femaleradbtn.click in the else condition only. no change whatsoever. this is done in isSelected's else condition
	}

}
