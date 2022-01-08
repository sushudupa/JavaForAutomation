package SeleniumAutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingStaticWebtableInDynamicCodePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Step 1 = Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/webtable/";
		
		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Step 2 = Identify the webtable
		String tableXpath = "//*[@id=\"content\"]//table/tbody";
		WebElement companyTable = driver.findElement(By.xpath(tableXpath));
		
		//Step 3 = To locate the rows of the table
		List<WebElement> rowsTable = companyTable.findElements(By.tagName("tr"));
		
		// Step 4 : To calculate the total number of rows
		int rowCount = rowsTable.size();
		System.out.println("Total number of rows is " + rowCount);
		
		
		// Step 5: For loop - Loop will be executed till the last row of the table
		for(int row=0; row<rowCount; row++) {
			
			//Step 6: To locate the columns of the specified row
			List<WebElement> columnRows = rowsTable.get(row).findElements(By.tagName("td"));
			
			//Step 7: To calculate the total number of columns
			int colCount = columnRows.size();
			//System.out.println("total number of columns is " + colCount);
			
			//Step 8 : For Loop - Execute the loop till the last cell of the specified column of the table
			for(int col = 0; col<colCount; col++) {
				
				// Step 9: To Retrieve all the cell textString cellText
				String cellText = columnRows.get(col).getText();
				System.out.println(cellText);
				
				
			}
			
			
		}
			

	}

}
