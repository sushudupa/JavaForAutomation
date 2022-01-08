package com.SeleniumMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To perform mouse hover to select hyperlink from sub menu
 * Date    - 10/02/2021
 *========================================================================*/


public class HandlingMouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the System property
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");

		//Create the Object Instance
		WebDriver myDriverInstance = new FirefoxDriver();

		String url = "https://nxtgenaiacademy.com";

		//Launch the Application
		myDriverInstance.get(url);
		System.out.println("Application is launched");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");

		Actions action = new Actions(myDriverInstance);

		//Performing the mouse hover action on the qaAutomation
		WebElement qaAutomation = myDriverInstance.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Mouse Hover action on QA Automation");

		Thread.sleep(3000);

		//Performing the mouse hover action on the practiceAutomation
		WebElement pracAutomation = myDriverInstance.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();
		System.out.println("Mouse Hover action on Practice Automation");

		Thread.sleep(3000);

		// Click on Registration Form 
		WebElement registrationForm = myDriverInstance.findElement(By.partialLinkText("Registration Form"));
		registrationForm.click();
		System.out.println("Registration Form link is clicked");

		Thread.sleep(3000);

		//Close the Application
		myDriverInstance.close();
		System.out.println("Application is closed");
	}

}
