package com.sushma.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To implement WebDriver API commands for HandlingImage
 * Date - 09/30/2021
 *==================================================================*/




public class SeleniumHandlingImage {

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

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		
		//Declaring the WebElement
		WebElement robotImage = myDriverInstance.findElement(By.xpath("//img[@class='attachment-large size-large']"));

		//Verify the robot image displayed or not
		if(robotImage.isDisplayed()) {
			System.out.println("Robot image is displayed");
			
			String robotImageText = robotImage.getAttribute("alt");
			System.out.println("The Text of RobotImage is " + robotImageText);
		}
		else
		{
			System.out.println("Robot image is not displayed");
			
		}
        //Declaring the WebElement Object - Logo Image
		WebElement logoImage = myDriverInstance.findElement(By.xpath("//*[@id=\"site-logo-inner\"]/a/img"));
		
		if(logoImage.isDisplayed()) {
			String logoImageText = logoImage.getAttribute("alt");
			System.out.println("The text of the LogoImage " +logoImageText );
			System.out.println("The text of LogoImage is displayed");
			
			//Click the LogoImage
			logoImage.click();
			System.out.println("LogoImage is clicked");
		}
		else
		{
			System.out.println("The text of LogoImage is not displayed");
		
		}
	  Thread.sleep(3000);
	  
	  //Close the application
	  myDriverInstance.close();
	  System.out.println("Application is closed");
	}

}
