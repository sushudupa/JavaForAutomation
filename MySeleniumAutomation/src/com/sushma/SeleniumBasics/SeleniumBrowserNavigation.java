package com.sushma.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowserNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//create the instance for the driver
		WebDriver myDriverInstance = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com/demo-site/";
		myDriverInstance.get(URL);
		myDriverInstance.manage().window().maximize();

		//Click on back button
		myDriverInstance.navigate().back();


		//Click on forward button
		myDriverInstance.navigate().forward();


		//Home page
		myDriverInstance.navigate().to("https://nxtgenaiacademy.com/");


		//refresh
		myDriverInstance.navigate().refresh();



	}

}
