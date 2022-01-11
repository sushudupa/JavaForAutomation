package com.SeleniumAdvancedAutomation.com.SeleniumAdvancedAutomation;



import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		/*========================================================================
		 * Author - Sushma Prasad
		 * Project - NxtGen AI Academy
		 * Purpose - Handling 3 types of PopUp Alert
		 * Date    - 10/07/2021
		 *========================================================================*/


		public class HandlingPopUpAlert {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				//Set the System Property
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

				//Create the object instance
				WebDriver myDriverInstance = new ChromeDriver();

				String URL = "https://nxtgenaiacademy.com";

				//Launch the application
				myDriverInstance.get(URL);
				System.out.println("Application is launched");

				//Maximize the application
				myDriverInstance.manage().window().maximize();
				System.out.println("Application is maximized");

				Actions action = new Actions(myDriverInstance);

				//Performing the mouse hover action on the qaAutomation
				WebElement qaAutomation = myDriverInstance.findElement(By.linkText("QA AUTOMATION"));
				action.moveToElement(qaAutomation).perform();
				System.out.println("MouseHover action on QA Automation");

				//Performing the mouse hover action on the practiceAutomation
				WebElement pracAutomation = myDriverInstance.findElement(By.linkText("Practice Automation"));
				action.moveToElement(pracAutomation).perform();
				System.out.println("MouseHove action on Practice Automation");

				//Click on Alert and PopUp
				WebElement alertAndPopup = myDriverInstance.findElement(By.partialLinkText("Alert And Popup"));
				alertAndPopup.click();
				System.out.println("Alert and PopUp link is clicked");

				//1. Handling Alert Box
				//Click on alert box
				WebElement alertBox = myDriverInstance.findElement(By.xpath("//button[@name='alertbox'] "));
				alertBox.click();

				//Capture the Alert Message
				String alertBoxMsg = myDriverInstance.switchTo().alert().getText();
				System.out.println(alertBoxMsg);

				//Click on OK Button
				myDriverInstance.switchTo().alert().accept();
				System.out.println("OK Button is Clicked");

				//2. Handling Confirm Alert Box
				//Click on Confirm Alert Box
				WebElement confirmationAlert = myDriverInstance.findElement(By.xpath(" //button[@name='confirmalertbox'] "));
				confirmationAlert.click();

				//Capture the Alert Message
				String confirmationAlertMsg = myDriverInstance.switchTo().alert().getText();
				System.out.println(confirmationAlertMsg);

				//Click on OK Button
				myDriverInstance.switchTo().alert().accept();
				System.out.println("OK Button is Clicked");

				confirmationAlert.click();

				//Click on Cancel Button
				myDriverInstance.switchTo().alert().dismiss();
				System.out.println("Cancel Button is clicked");

				//3. Handling Prompt Alert Box
				WebElement promptAlertBox = myDriverInstance.findElement(By.xpath("//button[@name='promptalertbox1234']"));
				promptAlertBox.click();

				Alert alert = myDriverInstance.switchTo().alert();

				//Capture the Alert Message
				String promptAlertMsg = alert.getText();
				System.out.println(promptAlertMsg);

				//Enter YES
				alert.sendKeys("Yes");
				System.out.println("Yes Button is clicked");

				//Click on OK Button
				alert.accept();
				System.out.println("OK button is clicked");

				// Click on Prompt Alert Box
				promptAlertBox.click();

				//Enter NO
				alert.sendKeys("No");
				System.out.println("NO Button is clcked");

				//Click on OK Button
				alert.accept();
				System.out.println("OK Button is clicked");

				// Click on Prompt Alert Box
				promptAlertBox.click();

				//Click on Cancel
				alert.dismiss();

				//Close the application
				myDriverInstance.close();
				System.out.println("Application is closed");

			}

		}

