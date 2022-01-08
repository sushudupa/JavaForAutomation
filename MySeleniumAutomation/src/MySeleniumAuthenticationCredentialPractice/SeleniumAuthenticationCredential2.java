package MySeleniumAuthenticationCredentialPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAuthenticationCredential2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver myDriverInstance = new ChromeDriver();

		//URL without Authentication
		//String URL = "http://the-internet.herokuapp.com/basic_auth";

		//URL with Authentication
		String URL2 = "http://admin:admin@the-internet.herokuapp.com/basic_auth";


		//Launch the Application
		myDriverInstance.get(URL2);
		System.out.println("Application is launched");

		//Maximize the application
		myDriverInstance.manage().window().maximize();
		
		WebElement msg = myDriverInstance.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]"));
	    String actMsg = msg.getText();
	    String expMsg = "Congratulations! You must have the proper credentials.";
	    
	    if(actMsg.equals(expMsg)) {
	    	System.out.println("Both the actual and expected message are same");
	    	System.out.println("The actual message is " + actMsg);
	    }
	    else
	    {
	    	System.out.println("Both the actual and expected message are not same");
	    	System.out.println("The actual message is " + actMsg);
	    	System.out.println("The expected message is " + expMsg);
	    	
	    }
	    	
	    	//Close the application
	    	myDriverInstance.close();
	    	System.out.println("The application is closed");
	    	
	   
	
	
	
	
	}
	

}
