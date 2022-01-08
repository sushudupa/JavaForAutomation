package com.sushma.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchMyEdgeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the System property
		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");

		//Create the object instance
		WebDriver myDriverInstance = new EdgeDriver();

		String URL = "https://nxtgenaiacademy.com/demo-site/";

		//Launch the application
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");





	}

}
