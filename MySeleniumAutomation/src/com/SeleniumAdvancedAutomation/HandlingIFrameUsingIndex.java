package com.SeleniumAdvancedAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Perform the action as per the requirement using index concept
 * Date    - 10/01/2021
 *========================================================================*/


public class HandlingIFrameUsingIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver myDriverInstance = new ChromeDriver();

		String URL = "https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";

		//Launch the Application
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");

		//Frame Index Details
		//packageListFrame = 0;
		//packageFrame = 1;
		//classFrame = 2;

		//Activating the List Frame
		myDriverInstance.switchTo().frame(0);

		//Click on openqa selenium chrome link
		myDriverInstance.findElement(By.xpath("/html/body/main/ul/li[2]/a")).click();
		System.out.println("Selenium Chrome link is clicked");

		//Mandatory Step - Switch to default content
		myDriverInstance.switchTo().defaultContent();

		//Activating the Package Frame
		myDriverInstance.switchTo().frame(1);

		//Click on ChromeOptions link
		myDriverInstance.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[5]/a")).click();
		System.out.println("Chrome Option link is clicked");

		//Mandatory Step - Switch to default content
		myDriverInstance.switchTo().defaultContent();

		//Activating the Class Frame
		myDriverInstance.switchTo().frame(2);

		//Click on the Help link
		myDriverInstance.findElement(By.linkText("HELP")).click();
		System.out.println("Help link is clicked");

		Thread.sleep(3000);

		//Close the application
		myDriverInstance.close();
		System.out.println("Application is closed");












	}

}
