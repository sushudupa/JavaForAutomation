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
 * Purpose - Handling Multiple Browsers as per the requirement
 * Date    - 10/07/2021
 *========================================================================*/



public class HandlingMultipleBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com";

		//Launch the URL
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");

		Actions action = new Actions(myDriverInstance);

		//Performing the mouse hover action on the qaAutomation
		WebElement qaAutomation = myDriverInstance.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();
		System.out.println("MouseHover action on QA Automation");

		//Performing the mouse hover action on the practiceAutomation
		WebElement pracAutomation = myDriverInstance.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();
		System.out.println("MouseHover action on Practice Automation");

		//Performing the mouse hover action on the multipleWindows
		WebElement multipleWindows = myDriverInstance.findElement(By.partialLinkText("Multiple Windows"));
		multipleWindows.click();
		System.out.println("Multiple Windows link is clicked");

		//Opening New Browser window
		myDriverInstance.findElement(By.xpath("//button[starts-with(@name, 'newbrowserwindow')]")).click();
		System.out.println("Child Browser is opened");

		//Retrieve the number of windows ID's or browsers ID's
		System.out.println(myDriverInstance.getWindowHandles());

		//Get the Window ID's
		Set<String> windowID = myDriverInstance.getWindowHandles();
		Iterator<String> iterator = windowID.iterator();

		//Storing the Window's ID in respective windows
		String homePage = iterator.next();
		String newPage = iterator.next();

		System.out.println("Parent Browser ID is " + homePage);
		System.out.println("Child Browser ID is " + newPage); 

		// Switching the control to new window and performing all the operations in New Page Window
		myDriverInstance.switchTo().window(newPage);
		System.out.println("Child Browser is activated");

		//Maximize the Child Browser
		myDriverInstance.manage().window().maximize();
		System.out.println("Child Browser is Maximized");

		//Click on Python For Data Science in Home page
		myDriverInstance.findElement(By.partialLinkText("DATA SCIENCE")).click();
		System.out.println("Data Science Page is loaded in child browser");

		//Close the Child Browser
		myDriverInstance.close();
		System.out.println("Child Browser is closed");

		//Switching the control from child to parent
		myDriverInstance.switchTo().window(homePage);
		System.out.println("Parent Browser is activated");

		//Click on Home Link
		myDriverInstance.findElement(By.linkText("HOME")).click();
		System.out.println("Home link is clicked in parent browser");

		//Close the Parent Browser/application
		myDriverInstance.close();
		System.out.println("Parent Browser is closed");


	}

}
