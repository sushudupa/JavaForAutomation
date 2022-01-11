package com.SeleniumAdvancedAutomation.com.SeleniumAdvancedAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameUsingName {

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

				//Frame index details
				//packageListFrame
				//packageFrame
				//classFrame

				//Activating the List Frame
				myDriverInstance.switchTo().frame("packageListFrame");

				//Click on openqa selenium chrome link
				myDriverInstance.findElement(By.xpath("/html/body/main/ul/li[2]/a")).click();
				System.out.println("Selenium Chrome Link is Clicked");

				//Mandatory step - Switch back to default content 
				myDriverInstance.switchTo().defaultContent();

				//Activating the Package Frame
				myDriverInstance.switchTo().frame("packageFrame");

				//Click on ChromeOptions link
				myDriverInstance.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[5]/a")).click();
				System.out.println("Chrome Options link is clicked");

				//Mandatory step - Switch back to default content 
				myDriverInstance.switchTo().defaultContent();

				//Activating the Class Frame
				myDriverInstance.switchTo().frame("classFrame");

				//Click on the help link
				myDriverInstance.findElement(By.linkText("HELP")).click();
				System.out.println("Help link is clicked");

				Thread.sleep(3000);

				//Close the application
				myDriverInstance.close();
				System.out.println("Application is closed");

			}

		}

	
