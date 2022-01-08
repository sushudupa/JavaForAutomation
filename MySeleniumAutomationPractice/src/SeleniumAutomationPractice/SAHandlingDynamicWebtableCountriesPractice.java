package SeleniumAutomationPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SAHandlingDynamicWebtableCountriesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://cosmocode.io/automation-practice-webtable/";
		String countryName = "Ukraine";
		
		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Identify the webtable
		String tableXpath = "//*[@id=\"countries\"]/tbody";
		WebElement countryTable = driver.findElement(By.xpath(tableXpath));
		
		//To locate the rows of the table
		List<WebElement> rowsTable = countryTable.findElements(By.tagName("tr"));
		
		//To calculate the number of rows
		int rowCount = rowsTable.size();
		System.out.println("The total number of rows " + rowCount);
		
		outerforloop:
		// For loop - Loop will be executed till the last row of the table
		for(int row=1; row<rowCount; row++) {
			
			// To locate the columns of the specified row
			List<WebElement> columnRows = rowsTable.get(row-1).findElements(By.tagName("td"));
			
			// To calculate the total number of columns
			int colCount = columnRows.size();
		    //System.out.println("Total number of columns is " + colCount);
			
			// For Loop - Execute the loop till the last cell of the specified column of the table
			for(int col = 0; col< colCount; col++) {
				
				// To Retrieve all the cell text
				String cellText = columnRows.get(col).getText();
				//System.out.println(cellText);
				
				// Retrieve all the column values of the mentioned country 
				if(cellText.contains(countryName)) {
					
					//A.Country Visited
					WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+row+"]/td[1]/input"));
					checkBox.click();
					
					//B.Country Name
					WebElement cntryName = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+row+"]/td[2]/strong"));
					String countryNameValue = cntryName.getText();
					System.out.println("The name of the country is " + countryNameValue);
					
					//C.Country Capital
					WebElement cntryCapital = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+row+"]/td[3]"));
					String countryCapitalValue = cntryCapital.getText();
					System.out.println("Te capital of the country is " + countryCapitalValue);
					
					//D.Country Currency
					WebElement cntryCurrency = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+row+"]/td[4]"));
					String countryCurrencyValue = cntryCurrency.getText();
					System.out.println("The currency of the country is " + countryCurrencyValue);
					
					//E. Primary Language
					WebElement cntryPrimaryLan = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+row+"]/td[5]"));
					String countryPrimaryLanValue = cntryPrimaryLan.getText();
					System.out.println("The country primary language is " + countryPrimaryLanValue);
					
					break outerforloop;
					
				}

			}
			
		}
		
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");
		
	}

}
