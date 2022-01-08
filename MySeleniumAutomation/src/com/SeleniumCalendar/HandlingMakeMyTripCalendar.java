package com.SeleniumCalendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingMakeMyTripCalendar {

	public static void selectDate(WebElement calendar, String year, String month, String day, WebDriver driver) {

		//Click on Calendar
		calendar.click();


		//Handling Year
		WebElement date = driver.findElement(By.className("DayPicker-Caption"));
		String currentYear = date.getText();


		//Next Button
		WebElement next = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));

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
		WebElement selectDay = driver.findElement(By.xpath("//p[contains(text(),"+day+")]"));
		selectDay.click();
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\Chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		//Implicit Wait for 10 Seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String URL = "https://www.makemytrip.com/";
		String fromPlace = "New York";
		String toPlace = "Mumbai";

		//Launch the Application
		driver.get(URL);
		System.out.println("Application is Launched");

		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is Maximized");
		
		//Declaring the WebElement objects        
		WebElement from = driver.findElement(By.xpath("//*[@id='fromCity'] "));
		WebElement to = driver.findElement(By.xpath("//*[@id='toCity'] "));
		
		// Entering the From Place
		from.sendKeys(fromPlace);
		Thread.sleep(3000); //Only in keyboard action, thread.sleep is allowed. No where is allowed other than this.
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

		//Click on Calendar
		//Selecting the Departure Date
		WebElement departure = driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
		selectDate(departure, "2022", "February", "1", driver);
		
		//Selecting the Return Date
		WebElement returning = driver.findElement(By.xpath("//span[contains(text(),'RETURN')]"));
		selectDate(returning, "2022", "March", "16", driver);
	
		//Click on search button
		driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
		System.out.println("Search button is clicked");
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");
		

	}

}
