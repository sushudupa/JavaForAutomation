package com.SeleniumMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To perform series of action using keyboard 
 * Date    - 10/06/2021
 *========================================================================*/


public class KeyboardSeriesOfAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver myDriverInstance = new ChromeDriver();

		String URL = "https://www.google.com";
		String value = "selenium";

		//Launch the Application
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");


		WebElement searchBox = myDriverInstance.findElement(By.xpath("//input[@type='text']"));

		Actions action = new Actions(myDriverInstance);

		//Method 1 - Using Action Class
		/*	action.moveToElement(searchBox)
		      .keyDown(searchBox, Keys.SHIFT)
		      .sendKeys(searchBox, value)
		      .keyUp(searchBox, Keys.SHIFT)
		      .pause(3000)
		      .sendKeys(Keys.ENTER)
		      .perform(); */

		//Method 2 - Using Action Interface
		Action seriesOfAction = action.moveToElement(searchBox)
				.keyDown(searchBox, Keys.SHIFT)
				.sendKeys(searchBox, value)
				.keyUp(searchBox, Keys.SHIFT)
				.sendKeys(Keys.ENTER)
				.build();

		seriesOfAction.perform();

		Thread.sleep(3000);

		//Close the Application
		myDriverInstance.close();
		System.out.println("Application is closed");









	}

}
