package com.SeleniumWebTables;


/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Handling Banking Application
 * Date    - 11/13/2021
 *========================================================================*/

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBankingApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://business.alinma.com/cb/servlet/cb/jsp-ns/demo/en/landing.jsp?cu=bpayments/multipaybill-wait.jsp&module=bpayments";
		String companyAccount = "100003924";

		//Launch the URL
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Step 2 - Identify the table
		String tableXpath = "//table[@class='border']";
		WebElement companyTable = driver.findElement(By.xpath(tableXpath));

		//Step 3 : To locate the rows of the table
		List<WebElement> rowsTable = companyTable.findElements(By.tagName("tr"));

		// Step 4 : To calculate the total number of rows
		int rowCount = rowsTable.size();
		System.out.println("Total number of rows is " + rowCount);

		outerforloop:
			// Step 5: For loop - Loop will be executed till the last row of the table
			for(int row = 1; row < rowCount+1; row++) {

				//Step 6: To locate the columns of the specified row
				List<WebElement> columnRows = rowsTable.get(row-1).findElements(By.tagName("td"));

				//Step 7: To calculate the total number of columns
				int colCount = columnRows.size();
				//  System.out.println("Total number of columns is " + colCount);

				//Step 8 : For Loop - Execute the loop till the last cell of the specified column of the table
				for(int col = 0; col< colCount; col++) {

					// Step 9: To Retrieve all the cell text
					String cellText = columnRows.get(col).getText();
					//System.out.println(cellText);


					// Step 10 : Retrieve all the column values of the mentioned company account
					if(cellText.contains(companyAccount)) {

						//A. Check Box
						WebElement checkBox = driver.findElement(By.xpath("//table[@class='border']/tbody/tr["+row+"]/td[1]"));

						Boolean checkBoxStatus = false;
						checkBox.click();
						checkBoxStatus = true;

						//B. Company 
						WebElement cmpName = driver.findElement(By.xpath("//table[@class='border']/tbody/tr["+row+"]/td[2]"));
						String cmpNameValue = cmpName.getText();
						System.out.println("The name of the Company is " + cmpNameValue);

						//C. Nick Name
						WebElement nickName = driver.findElement(By.xpath("//table[@class='border']/tbody/tr["+row+"]/td[3]"));
						String nickNameAcc = nickName.getText();
						System.out.println("The nick name of the account is " + nickNameAcc);

						//D. Account Number
						String accNum = driver.findElement(By.xpath("//table[@class='border']/tbody/tr["+row+"]/td[5]")).getText();						
						System.out.println("The account number is " + accNum);

						//E. Selecting the Company Name

						//if(checkBox.isSelected()) {
						if(checkBoxStatus) {
							System.out.println(cmpNameValue + " is  Selected");
						}
						else
						{
							System.out.println(cmpNameValue + " is not selcted");
						}

						//F. Amount
						WebElement billAmt = driver.findElement(By.xpath("//table[@class='border']/tbody/tr["+row+"]/td[4]/input"));
						billAmt.clear();
						billAmt.sendKeys("500");
						System.out.println("The bill amount entered is " + billAmt.getAttribute("value"));		 


						//G. Add Bill
						WebElement addBill = driver.findElement(By.xpath("//input[@name='ADDPAYEE']"));
						addBill.click();
						System.out.println("Submit Button is Clicked");

						//H. Status
						WebElement billStatus = driver.findElement(By.xpath("//table[@class='border']/tbody/tr["+row+"]/td[6]/span"));
						String billStatusValue = billStatus.getText();
						System.out.println("Billing Status is " + billStatusValue);

						//I. Bill Date
						WebElement billDate = driver.findElement(By.xpath("//table[@class='border']/tbody/tr["+row+"]/td[7]"));
						String billDateValue = billDate.getText();
						System.out.println("Billing Date is " + billDateValue);

						break outerforloop;	

					}
				}

			}

		//Step 11: Close the Application
		driver.close();
		System.out.println("Application is Closed");

	}

}


