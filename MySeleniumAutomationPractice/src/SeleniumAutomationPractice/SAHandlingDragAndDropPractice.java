package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAHandlingDragAndDropPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. In this drag and drop program, only you can do drag and drop, but reverse is not possible
		//2. After creating the actions class, then perform this action(shown in step 3)
		//3. object(action). method (i.e., draganddrop)(source and target webelement can be seen acutomatically).then perform
		//4. The answer for the above comment is : action.dragAndDrop(source, target).perform();
		
		
		//Set the system property
		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
		
		//Create object instance
		WebDriver driver = new EdgeDriver();
		
		String URL = "https://demoqa.com/droppable";
		
		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		// Declaring the WebElements object
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		// Create an Instance in Action Class by passing webdriver instance
		Actions action = new Actions(driver);
		
		//To perform Drag and Drop Action
		action.dragAndDrop(source, target).perform();
		System.out.println("Drag and Drop Action is performed");
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");
		
	}

}
