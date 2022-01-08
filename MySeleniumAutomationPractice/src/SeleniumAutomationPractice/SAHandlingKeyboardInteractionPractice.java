package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingKeyboardInteractionPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver driver = new ChromeDriver();
		
		//Parameterizing the values
		String URL = "https://www.goibibo.com/";
		String fromPlace = "Bengaluru";
		String toPlace = "Mumbai";
		String departure = "20211119";
	
		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maaximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Declaring the WebElement objects        
		WebElement from = driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']"));
		WebElement to = driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']"));
		
		// Entering the From Place
		from.sendKeys(fromPlace);
		Thread.sleep(3000); //Only in keyboard action, thread.sleep is allowed. No where is allowed other than this.
		from.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		from.sendKeys(Keys.ENTER);
		System.out.println(fromPlace + " is selected ");
		
		// Entering the Destination 
		to.sendKeys(toPlace);
		Thread.sleep(3000);
		to.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		to.sendKeys(Keys.ENTER);
		System.out.println(toPlace + " is selected ");
		
		//Click on calendar icon
		driver.findElement(By.xpath("//*[@id='departureCalendar']")).click();
		System.out.println("Calendar is clicked");
		
		//Click on select the date
		driver.findElement(By.xpath("//*[@id='fare_"+departure+"']")).click();
		System.out.println("Date is selected");
		
		//Click on search button
		driver.findElement(By.xpath("//*[@id='gi_search_btn']")).click();
		System.out.println("Search button is clicked");
		
		//Close the Application
		driver.close();
		System.out.println("Application is closed");

		
		

	}

}
