package com.sushma.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To implement WebDriver API commands for CheckBox
 * Date - 09/29/2021
 *==================================================================*/


public class SeleniumHandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver myDriverInstance = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com/demo-site/";

		//Launch the application
		myDriverInstance.get(URL);
		System.out.println("Launch the application");

		//Maximize the application
		myDriverInstance.manage().window().maximize();

		//Declare the WebElement object
		WebElement testNGCheckBox = myDriverInstance.findElement(By.id("vfb-20-2"));

		//Verify the testNG CheckBox displayed or not
		if(testNGCheckBox.isDisplayed()) {
			System.out.println("TestNG CheckBox is displayed");
		}
		else
			System.out.println("TestNG CheckBox is not displayed");


		//Verify the testNG CheckBox enabled or not

		if(testNGCheckBox.isEnabled()) {
			System.out.println("TestNG CheckBox is enabled");
		}
		else
			System.out.println("TestNG CheckBox is not enabled");


		//Verify the testNG CheckBox selected or not

		if(testNGCheckBox.isSelected()) {
			System.out.println("TestNG CheckBox is selected");
		}
		else
			System.out.println("TestNG CheckBox is not selected");

		//Selecting the CheckBox
		testNGCheckBox.click();


		//Verify the testNG CheckBox selected or not

		if(testNGCheckBox.isSelected()) {
			System.out.println("TestNG CheckBox is selected");
		}
		else
			System.out.println("TestNG CheckBox is not selected");

		Thread.sleep(3000);

		//Code to uncheck the testNG CheckBox
		if(testNGCheckBox.isSelected()) {
			//Selecting the CheckBox
			testNGCheckBox.click();
			System.out.println("TestNG CheckBox is unchecked");
		}
		else
		{
			System.out.println("TestNG CheckBox is  not unchecked");

		}
		Thread.sleep(3000);

		//Close the application
		myDriverInstance.close();
		System.out.println("Application is closed");

	}


}


