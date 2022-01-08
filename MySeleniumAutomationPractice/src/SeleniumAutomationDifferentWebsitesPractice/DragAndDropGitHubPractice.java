package SeleniumAutomationDifferentWebsitesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropGitHubPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://qavbox.github.io/demo/dragndrop/";
		
		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Declaring the webelement
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//Create the object instance for action class
		Actions action = new Actions(driver);
		
		//To perform Drag and Drop Action
		action.dragAndDrop(source, target).perform();
		System.out.println("Drag and drop action is performed");
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");
		
	}

}
