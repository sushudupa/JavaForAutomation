package MySeleniumAuthenticationCredentialPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAuthenticationCredential1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create an object instance
		WebDriver myDriverInstance = new ChromeDriver();
		System.out.println("Object instance is created");
		
		//URL without Authentication
		//String URL = "http://the-internet.herokuapp.com/basic_auth";
	   	
	   	//URL with Authentication
		String URL2 = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
	   	
	   	//Launch the application
	   	myDriverInstance.get(URL2);
	   	System.out.println("Application is launched");
	   	
	   	//Maximize the application
	   	myDriverInstance.manage().window().maximize();
	   	System.out.println("Application is maximized");
	   	
		//Declaring the WebElement
	   	WebElement msg = myDriverInstance.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]"));
	   	String actMsg = msg.getText();
	   	String expMsg = "Congratulations! You must have the proper credentials.";
	   	
	   	if(actMsg.equals(expMsg)) {
	   		System.out.println("Both the actual and expected message are same");
	   		System.out.println("Actual message is " + actMsg);
	   	}
	   	else
	   	{
	   		System.out.println("Both the actual and expected message are not same");
	   		System.out.println("The actual message is " + actMsg);
	   		System.out.println("The expected message is " + expMsg);
	   	}
		
		//Close the Application
	   	myDriverInstance.close();
	   	System.out.println("Application is closed");

	}

}
