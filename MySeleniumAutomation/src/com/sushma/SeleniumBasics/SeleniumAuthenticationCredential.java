package com.sushma.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To Authenticate Credentials
 * Date - 10/01/2021
 *==================================================================*/


public class SeleniumAuthenticationCredential {

	public static void main(String[] args) throws InterruptedException {
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
			System.out.println("The message is " + actMsg);
		}
		else
		{
			System.out.println("Both the actula and expected message are same");
			System.out.println("The actual message is " + actMsg);
			System.out.println("The expected message is " + expMsg);
		}

		Thread.sleep(3000);

		//Close the Application
		myDriverInstance.close();
		System.out.println("Application is closed");
	}

}


