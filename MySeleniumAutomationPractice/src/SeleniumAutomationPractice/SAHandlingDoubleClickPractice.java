package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAHandlingDoubleClickPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Create the object class(that is Actions action = new Actions(driver)
		//2. object(i.e, action). method(ie., doubleClick) and then pass the webelement object(i.e., doubleClickMe) and then perform
		//3. the answer for above comment is = action.doubleClick(doubleClickMe).perform();
		//4. Other way of doing double click method is:object(action).moveToElement(webelement object i.e.,doubleClickMe).method(doubleClick).perform
		//5. the answer for above comment is : action.moveToElement(doubleClickMe).doubleClick().perform();

		
		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://demoqa.com/buttons";
		
		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Declaring the web element object
		WebElement doubleClickMe = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		// Create an Instance in Action Class by passing web driver instance
		//In actions class, we always have to pass the driver object, i.e, new Actions(driver);
		Actions action = new Actions(driver);
		
		// To perform the double click on webelement
		
		// Method 1:  Using doubleClick() method
		action.doubleClick(doubleClickMe).perform(); //This is direct way of performing action
		System.out.println("Double Click is performed");
		
		// Method 2:  Using moveToElement() method
		//action.moveToElement(doubleClickMe).doubleClick().perform(); //This is human way of performing action
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");
	
	}

}
