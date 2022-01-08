package SeleniumAutomationSynchronizationWaitStmtPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProgressBarExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//It is used to tell the WebDriver to wait for certain conditions(Expected conditions)or the maximium time exceeded before
		//throwing and "ElementNotVisibleException" exception
		//Syntax: WebDriverWait wait = new WebDriverWait(WebDriverReference,TimeOut); = WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedCondtions.VisibilityOf(WebElement))
		//Explicit wait is used only when few web elements are troubling the application
		
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		//Adding Implicit Wait for 20 Seconds(Implicit wait works as well)
		//Here we can use implicit wait aslo. We have to mention below object instance, if at all we have to mention it.
		//We dont have to use implict because we are using wait statement only for 'reset' button.
		//If we are using wait statement for more than one program, then we have to use implict wait rather than explicit wait
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String URL = "https://demoqa.com/progress-bar";
		
		//Launch the URL
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		// Click on Start Button
		driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
		System.out.println("Start button is clicked");
		
		//We have to declare webelement for the reset button
		WebElement resetBtn;
		
		//Explicit wait
		//We are creating the object instance of WebDriverWait. WebDriverWait is called as class or interface. Pass the driver object
		WebDriverWait wait = new WebDriverWait(driver,20);
		resetBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='startStopButton']")));
		
		//Click on reset button
		resetBtn.click();
		System.out.println("Reset button is clicked");
		
		//Meaning of the above code is:
		//Commanding the program to 'wait' until the expected condition, that is visibility of the element(here, the element is resetBtn)
		//is located and then click. we have given the time frame of 20 sec for the program to look for the element
		
	
		
	}

}
