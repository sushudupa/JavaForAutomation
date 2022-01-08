package com.sushma.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To select and unselect multiple values from the dropdown
 * Date - 09/30/2021
 *==================================================================*/


public class SeleniumHandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com/demo-site/";

		//Launch the Application
		myDriverInstance.get(URL);
		System.out.println("Launch the Application");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();

		//Declaring WebElement Object
		WebElement countryDropDown = myDriverInstance.findElement(By.id("vfb-13-country"));

		if(countryDropDown.isDisplayed()) {
			System.out.println("country Dropdown is displayed");

		}
		else
		{
			System.out.println("Country Dropdown is not displayed");
		}

		String countryOne = "India";
		String countryTwo = "Luxembourg";
		int countryThree = 16 ;

		if(countryDropDown.isEnabled()) {
			System.out.println("Country Dropdown is enabled ");


			//Create the select object
			Select cDropDown = new Select(countryDropDown);

			//Select the Visible Text
			cDropDown.selectByVisibleText(countryOne);
			System.out.println(countryOne + " is selected");

			Thread.sleep(3000);

			//Select by Value
			cDropDown.selectByValue(countryTwo);
			System.out.println(countryTwo + " is selected");

			Thread.sleep(3000);

			//Select by Index
			cDropDown.selectByIndex(countryThree);
			System.out.println(countryThree + " is selected");

			Thread.sleep(3000);

			//Close the Application
			myDriverInstance.close();
			System.out.println("Application is closed");

		}
		else
		{
			System.out.println("Country Dropdown is not enabled");
		}











	}



}


