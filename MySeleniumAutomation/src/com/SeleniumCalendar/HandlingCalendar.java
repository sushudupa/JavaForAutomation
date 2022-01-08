package com.SeleniumCalendar;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Handling Calendar
 * Date - 10/26/2021
 *==================================================================*/

public class HandlingCalendar {

	public static void selectDate(WebElement calendar, String year, String month, String day, WebDriver myDriverInstance) {

		//Click on Calendar
		calendar.click();


		//Handling Year
		WebElement date = myDriverInstance.findElement(By.className("DayPicker-Caption"));
		String currentYear = date.getText();


		//Next Button
		WebElement next = myDriverInstance.findElement(By.xpath("//span[@aria-label='Next Month']"));

		// Click on next arrow till we get the desired year
		if(!currentYear.contains(year)) {
			do {
				next.click();
			}while(!date.getText().contains(year));
		}

		//Select the Month
		String currentMonth = date.getText();
		if(!currentMonth.contains(month)) {
			do {
				next.click();
			}while(!date.getText().contains(month));
		}

		//Select the Date
		WebElement selectDay = myDriverInstance.findElement(By.xpath("//p[contains(text(),"+day+")]"));
		selectDay.click();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\Chromedriver.exe");

		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();

		//Implicit Wait for 10 Seconds
		myDriverInstance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String URL = "https://www.makemytrip.com/";

		//Launch the Application
		myDriverInstance.get(URL);
		System.out.println("Application is Launched");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is Maximized");

		//Click on Calendar
		//Selecting the Departure Date
		WebElement departure = myDriverInstance.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
		selectDate(departure, "2022", "February", "1", myDriverInstance);
		
		//Selecting the Return Date
		WebElement returning = myDriverInstance.findElement(By.xpath("//span[contains(text(),'RETURN')]"));
		selectDate(returning, "2022", "April", "16", myDriverInstance);
	

	}

}
