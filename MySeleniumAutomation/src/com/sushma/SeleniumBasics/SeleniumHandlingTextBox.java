package com.sushma.SeleniumBasics;


/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To implement WebDriver API commands for TextBox
 * Date - 09/29/2021
 *==================================================================*/






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHandlingTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com/demo-site/";
		String firstNameValue = "Sushma";

		//Launch the application
		myDriverInstance.get(URL);
		
		//Maximize the Application  
		myDriverInstance.manage().window().maximize();

		//Declare the webElement Object
		WebElement  firstName = myDriverInstance.findElement(By.id("vfb-5"));

		//Verify the first name displayed or not
		if(firstName.isDisplayed()) {
			System.out.println("The fisrt name is displayed");

			//Enter the first name
			firstName.sendKeys(firstNameValue);

			System.out.println("The first name is " + firstNameValue);
		}
		else
		{
			System.out.println("The first name is not displayed");
		}
		//Verify if first name is enabled or not
		if(firstName.isEnabled()) {
			System.out.println("The first name is enabled");
		}
		else
		{
			System.out.println("The first name is not enabled");
		}

		Thread.sleep(3000);

		//Clear the first name
		firstName.clear();
		System.out.println("First Name is cleared");

		Thread.sleep(3000);

		//Close the application
		myDriverInstance.close();
		System.out.println("Application is closed");





	}

}
