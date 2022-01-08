package com.SeleniumScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Capturing Screen Shot
 * Date - 10/26/2021
 *==================================================================*/

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create object instance
		WebDriver myDriverInstance = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/multiplewindows/";
		
		//Launch the URL
		myDriverInstance.get(URL);
		System.out.println("Application is Launched");
		
		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is Maximized");
		
		//Taking Sreenshot
		//Get entire page screenshot
		
		//Create an object instance in TakesScreenshot class/interface
		TakesScreenshot scrShot = ((TakesScreenshot)myDriverInstance);
		
		// Call getScreenshotAs method to create image file
		File file = scrShot.getScreenshotAs(OutputType.FILE);
		
		// Copy file to Desired Location
		FileUtils.copyFile(file, new File(".\\Sreenshot\\MultiBrowser.jpg"));
		
	
		// Screenshot for failure condition
		try {
			myDriverInstance.findElement(By.id("button")).click();
		}
		catch(Throwable e) {
			File file2 = scrShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file2, new File(".\\Screenshot\\ErrorPage.jpg"));
			System.out.println(e);
		}
			
		//Close the Application
		myDriverInstance.close();
		System.out.println("Application is Closed");
		
	}

}
