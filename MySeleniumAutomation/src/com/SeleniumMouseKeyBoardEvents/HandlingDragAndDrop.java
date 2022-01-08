package com.SeleniumMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Perform the drag and drop mouse event
 * Date    - 10/02/2021
 *========================================================================*/

public class HandlingDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/droppable";

		//Launch the Appication
		driver.get(url);
		System.out.println("Application is launched");

		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is Maximized");

		//To perform Drag and Drop action
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		// Create an Instance in Action Class
		Actions action = new Actions(driver);

		//To perform Drag and Drop Action
		action.dragAndDrop(source, target).perform();
		System.out.println("Drag and drop action is performed");

		Thread.sleep(3000);

		//Close the Application
		driver.close();
		System.out.println("Application is closed");













	}

}
