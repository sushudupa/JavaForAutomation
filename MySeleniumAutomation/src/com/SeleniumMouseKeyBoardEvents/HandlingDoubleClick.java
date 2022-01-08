package com.SeleniumMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Perform the double click mouse event
 * Date    - 10/02/2021
 *========================================================================*/


public class HandlingDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver myDriverInstance = new ChromeDriver();

		//Storing the Application URL in the String Variable
		String url = "https://demoqa.com/buttons";

		//Launch the Application
		myDriverInstance.get(url);
		System.out.println("Application is launched");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is Maximized");

		//Declaring the WebElement Object
		WebElement doubleClickMe = myDriverInstance.findElement(By.id("doubleClickBtn"));

		// Create an Instance in Action Class by passing web driver instance
		Actions action = new Actions(myDriverInstance);

		//Method 1 - Using Double click method
		action.doubleClick(doubleClickMe).perform();
		System.out.println("Double Click is performed");

		// Method 2:  Using moveToElement() method
		//action.moveToElement(doubleClickMe).doubleClick().perform();
		//System.out.println("Double Click is performed");

		Thread.sleep(3000);
		
		//Close the Application
		myDriverInstance.close();
		System.out.println("Application is closed");





	}

}
