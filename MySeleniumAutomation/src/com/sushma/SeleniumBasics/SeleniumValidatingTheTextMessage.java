package com.sushma.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To validating the text message and mandatory error message
 * Date - 09/29/2021
 *==================================================================*/



public class SeleniumValidatingTheTextMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com/demo-site/";
		//String firstNameValue = "Sushma";

		//Launch the application
		myDriverInstance.get(URL);
		System.out.println("Launch the application");

		//Maximize the Application  
		myDriverInstance.manage().window().maximize();

		//Positive Scenario
		//Declaring WebElement Object
		WebElement regTitleText = myDriverInstance.findElement(By.xpath("//h3[contains(text(),'Register For Demo')]"));

		//Verify the Registration Title is displayed

		if(regTitleText.isDisplayed()) {
			System.out.println("The Registration Title is displayed");
		}
		else
		{
			System.out.println("The Registration Title is not displayed");
		}

		//Validating the title
		System.out.println(regTitleText.getText());
		String actRegTitle = regTitleText.getText();
		String expRegTitle = "Register For Demo";

		if(actRegTitle.equals(expRegTitle)) {
			System.out.println("The Actual and Expected Registration Title are same");
			System.out.println("The Registration Title is "+ actRegTitle);
		}
		else
		{
			System.out.println("The Actual and Expected Registration Title are not same");
			System.out.println("The Actual Registration Title is "+ actRegTitle);
			System.out.println("The Expected Registration Title is "+ expRegTitle);
		}


		//Click on the submit button to get the mandatory error message
		myDriverInstance.findElement(By.id("vfb-4")).click();

		//Negative Error/ Message Validation
		//First Name error message
		WebElement firstNameErrMsg = myDriverInstance.findElement(By.xpath("//*[@id=\"item-vfb-5\"]/label[2]"));

		//Validating the First Name Error Message


		String actfirstNameErrMsg = firstNameErrMsg.getText();
		String expfirstNameErrMsg = "This field is required.";

		if(actfirstNameErrMsg.equals(expfirstNameErrMsg)) {
			System.out.println("The Actual and Expected First Name Error Message are same");
			System.out.println("The First Name Error Message is "+ actfirstNameErrMsg);
		}
		else
		{
			System.out.println("The Actual and Expected First Name Error Message are not same");
			System.out.println("The Actual First Name Error Message is "+ actfirstNameErrMsg);
			System.out.println("The Expected First Name Error Message is "+ expfirstNameErrMsg);
		}
        
		Thread.sleep(3000);
		
		//Close the Application
		myDriverInstance.close();
		System.out.println("Application is closed");
		
	}

}
