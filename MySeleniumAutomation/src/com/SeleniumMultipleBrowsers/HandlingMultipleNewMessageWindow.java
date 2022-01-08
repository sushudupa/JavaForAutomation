package com.SeleniumMultipleBrowsers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Handling Multiple Message Window
 * Date    - 10/07/2021
 *========================================================================*/


public class HandlingMultipleNewMessageWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com";

		//Launch the URL
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");

		Actions action = new Actions(myDriverInstance);

		//Performing the mouse hover action on the qaAutomation
		WebElement qaAutomation = myDriverInstance.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Mouse Hover action on QA Automation");

		//Performing the mouse hover action on practice automation
		WebElement pracAutomation = myDriverInstance.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();
		System.out.println("Mouse Hover action on Practice Automation");

		////Perform the mouse hover action on multiple windows
		WebElement multipleWindows = myDriverInstance.findElement(By.partialLinkText("Multiple Windows"));
		multipleWindows.click();
		System.out.println("Multiple Windows link is clicked");

		//Opening the New Message Window
		myDriverInstance.findElement(By.xpath("//button[starts-with(@name, 'newmessagewindow')]")).click();
		System.out.println("Message Window is opened");

		////Retrieve the number of windows ID's or browsers ID's
		System.out.println(myDriverInstance.getWindowHandles());

		//Get the Window ID's
		Set<String> windowID = myDriverInstance.getWindowHandles();
		Iterator<String> iterator = windowID.iterator();

		//Storing the Window's ID in respective windows
		String homePage = iterator.next(); // Main window
		String newMsgWindow = iterator.next(); // New Window

		System.out.println("Parent Browser ID is " + homePage);
		System.out.println("Message Window ID is " + newMsgWindow);

		// Switching the control to new window and performing all the operations in New Page Window
		myDriverInstance.switchTo().window(newMsgWindow);
		System.out.println("New Message Window is activated");

		//Close the Browser
		myDriverInstance.close();
		System.out.println("Message window is closed");

		//Switching the control to the main window and performing all the operations in Home Page Window
		myDriverInstance.switchTo().window(homePage);
		System.out.println("Parent Browser Activated");

		//Close the parent browser/application
		myDriverInstance.close();
		System.out.println("Parent Browser is closed");


	}

}
