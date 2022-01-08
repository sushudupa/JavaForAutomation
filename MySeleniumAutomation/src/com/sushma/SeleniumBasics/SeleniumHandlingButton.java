package com.sushma.SeleniumBasics;


/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To implement WebDriver API commands for HandlingButton
 * Date - 09/29/2021
 *==================================================================*/





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHandlingButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();
		
		String strURL = "https://nxtgenaiacademy.com/demo-site/";
		
		//Launch the URL
		myDriverInstance.get(strURL);
		
		//Maximize the URL
		myDriverInstance.manage().window().maximize();
		
		//Declare the WebElement Object
		WebElement submitBtn = myDriverInstance.findElement(By.id("vfb-4"));
		
		//Verify the submit button is displayed or not
		if(submitBtn.isDisplayed()) {
			System.out.println("Submit Button is displayed");
			
			//click on the submit button
			submitBtn.click();
			System.out.println("Submit button is clicked");
			
			//Alternative way to click submit button - just for knowledge purpose
			//submitBtn.submit();
			
		}
		else
		{
			System.out.println("Submit Button is not displayed");
		}
		
		//Verify the submit button if enabled or not
		if(submitBtn.isEnabled()) {
			System.out.println("Submit Button is enabled");
		}
		else
		{
			System.out.println("Submit Button is not enabled");
		}
		
		Thread.sleep(3000);
		
		//Close the application
		myDriverInstance.close();
		System.out.println("Application is closed");
		
	}

}
