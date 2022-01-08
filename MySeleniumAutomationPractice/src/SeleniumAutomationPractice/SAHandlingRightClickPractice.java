package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAHandlingRightClickPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Right Click action is performed by using contextClick method
		//2. object(action). method (i.e., contextClick)(choose rightClickMe).then click again to choose the action to be performed
		//(i.e., copyOption). perform
		//4. The answer for the above comment is : action.contextClick(rightClickMe).click(copyOption).perform();
		//5. Method 1 is used most commonly. Any method you can use. Always go with "contextClick"
		
		
		//Set the System property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://demo.guru99.com/test/simple_context_menu.html";
		
		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		// Declaring the WebElements object
		WebElement rightClickMe = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		WebElement copyOption = driver.findElement(By.xpath("//span[contains(text(),'Copy')]"));
		
		// Create an Instance in Action Class by passing webdriver instance
		Actions action = new Actions(driver);
		
		// Method 1 - Using contextClick() method 
		action.contextClick(rightClickMe).click(copyOption).perform();
		
		/* Method 1 -  one more way of doing it
		action.contextClick(rightClickMe)
		      .pause(3000)
		      .click(copyOption)
		      .perform(); */
		
		/*Method 2 = Using moveToElement() method
		action.moveToElement(rightClickMe)
		      .contextClick()
		      .click(copyOption)
		      .perform(); */
		
		System.out.println("Right click action is performed");
		
		//Click on Ok button
		driver.switchTo().alert().accept();
		System.out.println("OK button is clicked");
		
		//Close the Application
		driver.close();
		System.out.println("Application is closed");
		
		
		

	}

}
