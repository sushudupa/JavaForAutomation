package com.SeleniumWebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Handling Dynamic WebTable
 * Date    - 10/09/2021
 *========================================================================*/

public class HandlingDynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Set for chrome driver and launch the url

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();

		String URL = "https://money.rediff.com/gainers/bsc/daily/groupa";
		String companyName = "PC Jeweller L";

		//Launch the Application
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");

		// Step 2 : Identify the Table
		String tableXpath = "//*[@id=\"leftcontainer\"]/table";
		WebElement companyTable = myDriverInstance.findElement(By.xpath(tableXpath));

		//Step 3 : To locate the rows of the table
		List<WebElement> rowsTable = companyTable.findElements(By.tagName("tr"));

		// Step 4 : To calculate the total number of rows
		int rowCount = rowsTable.size();
		System.out.println("Total number of rows is " + rowCount);

		outerforloop:
			// Step 5: For loop - Loop will be executed till the last row of the table
			for(int row = 0; row < rowCount; row++) {

				//Step 6: To locate the columns of the specified row
				List<WebElement> columnRows = rowsTable.get(row).findElements(By.tagName("td"));

				//Step 7: To calculate the total number of columns
				int colCount = columnRows.size();
				//  System.out.println("Total number of columns is " + colCount);

				//Step 8 : For Loop - Execute the loop till the last cell of the specified column of the table
				for(int col = 0; col< colCount; col++) {

					// Step 9: To Retrieve all the cell textString cellText
					String cellText = columnRows.get(col).getText();
					//		System.out.println(cellText);

					// Step 10 : Retrieve all the column values of the mentioned company name
					if(cellText.contains(companyName)) {


						//A. Company Name
						WebElement cmpName = myDriverInstance.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[1]/a"));
						String companyNameValue = cmpName.getText();
						System.out.println("The Company Name is " + companyNameValue);

						//B. Group Name
						String group = myDriverInstance.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[2]")).getText();
						System.out.println("The group is " + group);

						//C. Prev Days Close Price
						String prevDay = myDriverInstance.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[3]")).getText();
						System.out.println("The Previous Day Close Price is " + prevDay);

						//D. Current Price
						String currentPrice = myDriverInstance.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[4]")).getText();
						System.out.println("The Current Price is " + currentPrice);

						//E. Percent(%) Change
						String change = myDriverInstance.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[5]/font")).getText();
						System.out.println("The percent change is " + change);

						break outerforloop;				

					}


				}

			}
		//Close the application
		myDriverInstance.close();
		System.out.println("Application is closed");

	}

}
