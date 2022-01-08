package com.SeleniumMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To perform Tool tip action and verify the tool-tip message
 * Date    - 10/02/2021
 *========================================================================*/


public class HandlingToolTip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver myDriverInstance = new ChromeDriver();

		String URL = "https://www.google.com";

		//Launch the Application
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");

		//Create an Instance in Actions Class by passing webdriver instance
		Actions action = new Actions(myDriverInstance);

		// Declaring the WebElements object
		WebElement googleSearch = myDriverInstance.findElement(By.name("q"));

		//Using moveToElement() tool-tip
		action.moveToElement(googleSearch).perform();

		//Validating the tool-tip message
		String actGoogleSearch = googleSearch.getAttribute("title");
		String expGoogleSearch = "Search";

		if(actGoogleSearch.equals(expGoogleSearch)) {
			System.out.println("Both the actual and expected tool tip message are same");
			System.out.println("The tool tip message is " + actGoogleSearch );
		}

		else
		{
			System.out.println("Both the actual and expected tool tip message are not same");
			System.out.println("The actual tool tip message is " + actGoogleSearch);
			System.out.println("The expected tool tip message is " + expGoogleSearch);
		}
		Thread.sleep(3000);

		//Close the Applicatin
		myDriverInstance.close();

	}

}
