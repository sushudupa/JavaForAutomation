package com.SeleniumSynchronizationWaitStmt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Synchronization - Implicit Wait
 * Date    - 10/19/2021
 *========================================================================*/



public class ProgressBarImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();

		//Implicit Wait for 10 Seconds
		myDriverInstance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String URL = "https://nxtgenaiacademy.com";

		//Launch the application
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
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

		//Close the application
		myDriverInstance.close();
		System.out.println("Application is closed");



	}

}
