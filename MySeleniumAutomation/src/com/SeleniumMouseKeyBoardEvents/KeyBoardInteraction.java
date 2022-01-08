package com.SeleniumMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Understanding the real time application using keyboard events
 * Date    - 10/06/2021
 *========================================================================*/

public class KeyBoardInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver myDriverInstance = new ChromeDriver();

		// Parameterizing input values
		String URL = "https://www.goibibo.com/";
		String fromPlace = "Bengaluru";
		String toPlace = "Mangalore";
		String departure = "20211008"; //YYYYMMDD

		//Launch the Application
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maaximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");

		//Declaring the WebElement objects        
		WebElement from = myDriverInstance.findElement(By.xpath("//input[@placeholder='From']"));
		WebElement to = myDriverInstance.findElement(By.xpath("//input[@placeholder='Destination']"));

		// Entering the From Place
		from.sendKeys(fromPlace);
		Thread.sleep(3000);
		from.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		from.sendKeys(Keys.ENTER);
		System.out.println(fromPlace + " is selected ");

		// Entering the Destination 
		to.sendKeys(toPlace);
		Thread.sleep(3000);
		to.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		to.sendKeys(Keys.ENTER);
		System.out.println(toPlace + " is selected ");



		//Click on Calendar Icon
		myDriverInstance.findElement(By.xpath("//input[@placeholder='Departure']")).click();
		System.out.println("Departure is selected");

		// Click on select the date (dynamic)
		// myDriverInstance.findElement(By.xpath("//*[@id='fare_20211008']")).click();
		myDriverInstance.findElement(By.xpath("//*[@id='fare_"+departure+"']")).click();
		System.out.println("Date is selected " + departure);

		// Click on Search Button
		myDriverInstance.findElement(By.xpath("//button[@value='Search']")).click();
		System.out.println("Clicked on search button");

		Thread.sleep(3000);

		//Close the Application
		myDriverInstance.close();
		System.out.println("Application is closed");






	}

}
