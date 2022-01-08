package com.SeleniumWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Handling Static WebTable
 * Date    - 10/08/2021
 *========================================================================*/


public class HandlingStaticWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com";

		//Launch the URL
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		Actions action = new Actions(driver);

		//Performing the mouse hover action on the qaAutomation
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Mouse Hover action on QA Automation");

		//Perform the mouse hover action on the practice automation
		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();
		System.out.println("Mouse Hover action on Practice Automation");

		//Perform the mouse hover action on WebTable
		WebElement webTable = driver.findElement(By.partialLinkText("WebTable"));
		webTable.click();
		System.out.println("Mouse Hover action on Web Table");

		String startXpath = "//*/table/tbody/";

		//First Name
		WebElement firstName = driver.findElement(By.xpath(startXpath + "tr[1]/td[2]"));
		String empFirstName = firstName.getText();
		System.out.println("Employer First Name is " + empFirstName);

		//Last Name
		WebElement lastName = driver.findElement(By.xpath(startXpath + "tr[2]/td[2]"));
		String empLastName = lastName.getText();
		System.out.println("Employer Last Name is " + empLastName);

		//Employer Gender
		WebElement gender = driver.findElement(By.xpath(startXpath + "tr[3]/td[2]"));
		String empGender = gender.getText();
		System.out.println("Employer Gender is " + empGender);

		//Employer Date of Birth
		WebElement birthDate = driver.findElement(By.xpath(startXpath + "tr[4]/td[2]"));
		System.out.println("Employer Date of Birth is " + birthDate.getText());

		//Employer Birth Place
		WebElement birthPlaceValue = driver.findElement(By.xpath(startXpath + "tr[5]/td[2]"));
		System.out.println("Employer Birth Place is " + birthPlaceValue.getText());

		//Employer Title
		WebElement empTitleValue = driver.findElement(By.xpath(startXpath + "tr[6]/td[2]"));
		System.out.println("Employer title is " + empTitleValue.getText());

		//Employer Number
		WebElement empID = driver.findElement(By.xpath(startXpath + "tr[7]/td[2]"));
		String empIDValue = empID.getText();
		System.out.println("Employer ID is " + empIDValue);

		//Employer Salary
		WebElement empSalary = driver.findElement(By.xpath(startXpath + "tr[8]/td[2]"));
		System.out.println("Employer Salaray is " + empSalary.getText());

		//Employer Email ID
		WebElement empEmailID = driver.findElement(By.xpath(startXpath + "tr[9]/td[2]"));
		System.out.println("Employer Email ID is " +  empEmailID.getText());

		//Close the application
		driver.close();
		System.out.println("Application is closed");

	}

}
