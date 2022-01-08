package com.SeleniumMultipleBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingPopUpAdvertiseWindowInNaukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("user-agent=\"Chrome/60.0.3112.50\"");
		WebDriver myDriverInstance = new ChromeDriver(chromeOptions);

		String URL = "https://www.naukri.com/";
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		myDriverInstance.manage().deleteAllCookies();
	
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");	

       //myDriverInstance.findElement(By.cssSelector("#block")).click();

	}

}
