package com.SeleniumSynchronizationWaitStmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Synchronization - Explicit Wait
 * Date    - 10/19/2021
 *========================================================================*/

public class ProgressBarExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();

		//Adding Implicit Wait for 20 Seconds(Implicit wait works as well)
		//myDriverInstance.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String URL = "https://demoqa.com/progress-bar";

		//Launch the application
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");

		// Click on Start Button 
		myDriverInstance.findElement(By.xpath("//button[@id='startStopButton']")).click();

		// Declaring the reset webelement
		WebElement resetBtn;

		// Explicit Wait for maximum of 20 seconds until the expected condition is met
		WebDriverWait wait = new WebDriverWait(myDriverInstance,20);
		resetBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='resetButton']")));

		//Click on reset button
		resetBtn.click();
		System.out.println("Reset Button is clicked");

		//Reset Button
		//myDriverInstance.findElement(By.xpath("//button[@id='resetButton']")).click();

	}

}
