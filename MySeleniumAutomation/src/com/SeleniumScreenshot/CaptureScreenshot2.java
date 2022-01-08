package com.SeleniumScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Capturing Screen Shot - My Reference
 * Date - 10/26/2021
 *==================================================================*/

public class CaptureScreenshot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/alertandpopup/";
		
		//Launch the Application
		myDriverInstance.get(URL);
		System.out.println("Application is Launched");
		
		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is Maximized");
		
		//Taking Sreenshot
		//Get entire page screenshot
				
		//Create an object instance in TakesScreenshot class/interface
		TakesScreenshot ScrShot = ((TakesScreenshot)myDriverInstance);
		
		// Call getScreenshotAs method to create image file
		File file = ScrShot.getScreenshotAs(OutputType.FILE);
		
		// Copy file to Desired Location
		FileUtils.copyFile(file, new File(".\\Screenshot\\Alertandpopup.jpg"));
		
		//Close the Application
		myDriverInstance.close();
		System.out.println("Application is Closed");
		
	
	}
}
		