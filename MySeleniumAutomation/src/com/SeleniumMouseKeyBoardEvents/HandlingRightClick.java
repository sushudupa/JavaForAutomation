package com.SeleniumMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To perform right click mouse event
 * Date    - 10/02/2021
 *========================================================================*/



public class HandlingRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");

		//Create the Object Instance
		WebDriver myDriverInstance = new FirefoxDriver();

		String URL = "http://demo.guru99.com/test/simple_context_menu.html";

		//Launch the Application
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");

		//Declare the WebElement Object
		WebElement rightClickMe = myDriverInstance.findElement(By.xpath("/html/body/span"));
		WebElement copyOption = myDriverInstance.findElement(By.xpath("/html/body/ul/li[3]/span"));

		// Create an Instance in Action Class
		Actions action = new Actions(myDriverInstance);

		//Method 1 using ContextClick method
		action.contextClick(rightClickMe).click(copyOption).perform();

		//Method 2 using MoveToelement method
		/*action.moveToElement(rightClickMe)
		       .contextClick()
		       .click(copyOption)
		       .perform(); */

		System.out.println("Right Click action is performed");

		Thread.sleep(3000);

		//Click on ok button
		myDriverInstance.switchTo().alert().accept();
		System.out.println("OK button is clicked");

		Thread.sleep(3000);

		//Close the application
		myDriverInstance.close();
		System.out.println("Application is closed");







	}

}
