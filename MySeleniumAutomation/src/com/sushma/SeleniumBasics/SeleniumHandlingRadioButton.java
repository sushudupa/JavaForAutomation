package com.sushma.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To implement WebDriver API commands for RadioButton
 * Date - 09/29/2021
 *==================================================================*/



public class SeleniumHandlingRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create object instance
		WebDriver myDriverInstance = new ChromeDriver();


		String URL = "https://nxtgenaiacademy.com/demo-site/";

		//Launch the URL
		myDriverInstance.get(URL);
		
		//Maximize the application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is launched");

		//Declaring the WebElement object - Female Radio Button
		WebElement femaleRadioBtn = myDriverInstance.findElement(By.id("vfb-8-2"));

		//Female Button displayed or not

		if(femaleRadioBtn.isDisplayed()) {
			System.out.println("Female Radio Button is displayed");
		}
		else
		{
			System.out.println("Female Radio Button is not displayed");
		}

		//Female Button enabled or not

		if(femaleRadioBtn.isEnabled()) {
			System.out.println("Female Radio Button is enabled");
		}
		else
		{
			System.out.println("Female Radio Button is not enabled");
		}
 
		//Verify if Female Button is selected or not

		if(femaleRadioBtn.isSelected()) {
			System.out.println("Female Radio Button is SELECTED");
		}
		else
		{
			//Select Radio Button
			femaleRadioBtn.click();
			System.out.println("Female Radio Button is not selected");
		}

		//Verify if Female Button is selected or not
		if(femaleRadioBtn.isSelected()) {
			System.out.println("FEMALE Radio Button is SELECTED");
		}
		else
		{
			System.out.println("Female Radio Button is not selected");
		}

		Thread.sleep(3000);

		//Close the application
		myDriverInstance.close();
		System.out.println("Application is closed");

	}








}


