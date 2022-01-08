package SeleniumAutomationDifferentWebsitesPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTableGitHubPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		String Url = "https://qavbox.github.io/demo/webtable/";
		String employeeName = "Caesar Vance";

		//Launch the application
		driver.get(Url);
		System.out.println("Application is launched");

		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		String tableXpath = "//*[@id=\"table02\"]/tbody";
		WebElement jobTable = driver.findElement(By.xpath(tableXpath));

		//To locate the rows of the table
		List<WebElement> rowsTable = jobTable.findElements(By.tagName("tr"));

		// To calculate the total number of rows
		int rowCount = rowsTable.size();
		//System.out.println("Total number of rows is " + rowCount);
		
         outerforloop:
		// Step 5: For loop - Loop will be executed till the last row of the table
		for(int row = 1; row < rowCount; row++) {

			//Step 6: To locate the columns of the specified row
			List<WebElement> columnRows = rowsTable.get(row-1).findElements(By.tagName("td"));

			//Step 7: To calculate the total number of columns
			int colCount = columnRows.size();
			//System.out.println("Total number of columns is " + colCount);

			//Step 8 : For Loop - Execute the loop till the last cell of the specified column of the table
			for(int col = 0; col< colCount; col++) {

				// Step 9: To Retrieve all the cell textString cellText
				String cellText = columnRows.get(col).getText();
				//System.out.println(cellText);	

				//Retrieve all the column values of the mentioned company name
				if(cellText.contains(employeeName)) {
					
					//1. Employee Name
					WebElement empName = driver.findElement(By.xpath("//*[@id=\"table02\"]/tbody/tr["+row+"]/td[1]"));
					String empNameValue = empName.getText();
					System.out.println("The name of the employee is " + empNameValue);
					
					//Employee position
					WebElement empPosition = driver.findElement(By.xpath("//*[@id=\"table02\"]/tbody/tr["+row+"]/td[2]"));
					String empPositionValue = empPosition.getText();
					System.out.println("The position of the employee is " + empPositionValue);
					
					//Employee Office Name
					WebElement empOffice = driver.findElement(By.xpath("//*[@id=\"table02\"]/tbody/tr["+row+"]/td[3]"));
					String empOfficeValue = empOffice.getText();
					System.out.println("The office of the employee is in " + empOfficeValue);
					
					//Employee Age
					WebElement empAge = driver.findElement(By.xpath("//*[@id=\"table02\"]/tbody/tr["+row+"]/td[4]"));
					String empAgeValue = empAge.getText();
					System.out.println("The age of the employee is " + empAgeValue);
					
					//Employee Start Date
					WebElement empStartDate = driver.findElement(By.xpath("//*[@id=\"table02\"]/tbody/tr["+row+"]/td[5]"));
					String empStartDateValue = empStartDate.getText();
					System.out.println("The start date of the employee is " + empStartDateValue);
					
					//Employee Salary
					WebElement empSalary = driver.findElement(By.xpath("//*[@id=\"table02\"]/tbody/tr["+row+"]/td[6]"));
					String empSalaryValue = empSalary.getText();
					System.out.println("The salary of the employee is " + empSalaryValue);
					
					break outerforloop;
          		}

			}

		}
         
         //Close the application
         driver.close();
         System.out.println("Application is closed");

	}

}
