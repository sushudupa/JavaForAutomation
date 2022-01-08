package com.SeleniumMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Perform the double click mouse event
 * Date    - 10/03/2021
 *========================================================================*/



public class HandlingMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver myDriverInstance = new ChromeDriver();

		//Storing the Application URL in the String Variable
		String URL = "https://demoqa.com/selectable/";

		//Launch the Application
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");

		//Click on Grid Tab
		myDriverInstance.findElement(By.id("demo-tab-grid")).click();
		System.out.println("Demo Tab Grid is clicked");

		//Declaring the WebElement Object
		WebElement one = myDriverInstance.findElement(By.xpath("//li[normalize-space()='One']"));
		WebElement five = myDriverInstance.findElement(By.xpath("//li[normalize-space()='Five']"));
		WebElement seven = myDriverInstance.findElement(By.xpath("//li[normalize-space()='Seven']"));

		// Create an Instance in Action Class by passing webdriver instance
		Actions action = new Actions(myDriverInstance);

		action.keyDown(Keys.CONTROL)
		.click(one)
		.click(five)
		.click(seven)
		.keyUp(Keys.CONTROL)
		.perform();

		Thread.sleep(3000);

		//Close the Application
		myDriverInstance.close();
		System.out.println("Application is closed");

	}

}
