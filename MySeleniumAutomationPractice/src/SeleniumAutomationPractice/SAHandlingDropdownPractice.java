package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SAHandlingDropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Set the System Property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		
		//Create object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";

		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Applcation is maximized");
		
        //When you inspect a website, if you see 'select' as the input value (attribute), its nothing but dropdown. It is a single
		//webelement with multiple values
		
		//Declaring the webelement object
		WebElement countryDropDown = driver.findElement(By.xpath("//select[@id='vfb-13-country']"));
		
		//Verify if country drop down is displayed
		if(countryDropDown.isDisplayed()) {
			System.out.println("Country Drop Down is Displayed");
		}
		else
		{
			System.out.println("Country Drop Down is not Displayed");
		}
		
		//Verify if the country drop down is enabled
		if(countryDropDown.isEnabled()) {
			System.out.println("Country Drop Down is Enabled");
		}
		else
		{
			System.out.println("Couontry drop down is not Enabled");
		}
		
		// Create the select object to select value from dropdown

		Select cDropDown = new Select(countryDropDown);
		
		// Dropdown values to be selected
		String countryOne = "India"; //Visible
		String countryTwo = "Switzerland"; //Value
		int countryThree = 15; //Index
		
		// Always mention the selection value inside the if statement (is Enabled)
		if(countryDropDown.isEnabled()) {
			System.out.println("Country Drop Down is Enabled");
			
			// Select using VisibleText
			cDropDown.selectByVisibleText(countryOne);
			System.out.println(countryOne + "is selected");
			
			Thread.sleep(3000);
			
			//Select using Value
			cDropDown.selectByValue(countryTwo);
			System.out.println(countryTwo + "is selected");
			
			Thread.sleep(3000);
			
			//Select by Index = Index number always starts with zero
			cDropDown.selectByIndex(countryThree);
			System.out.println("Barbados is selected");
			
		}
			else
			{
				System.out.println("Country Drop Down is not Enabled");
			}
			
			Thread.sleep(3000); //Just using this for execution purpose
			
			//Close the application
			driver.close();
			System.out.println("Application is Closed");
			
			
			//Always first priority to visible text, next value and then index(this index option is used when values are dynamic)
			
		}
	
	}


