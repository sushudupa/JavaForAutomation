package SeleniumAutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandingDynamicWebTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//All the webpages are designed based on the webtable(goibibo and many more)
		//All the web developers use the dynamic webtable
		//Hyper link is always represented by 'a' tag : //*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
		//We have to use the "List" concept to find the number of rows as it is stored in WebElement
		//WE have to save the companyTable to a variable to count how many rows we have:List<WebElement> rowsTable = companyTable.findElements(By.tagName("tr"));
		//If it is single element, we use findelement method
		//Here we have multiple elements to find in the rows, so we use findelements method by using tag name "tr"
		//To find the row count, we use the 'size' method
		//columnRows = is a variable for counting rows in a company table
		//List<WebElement> columnRows = rowsTable.get(row).findElements(By.tagName("td")); = this code is used to find how many columns in each row
		//To retrieve all the values of cell(rows & column), save the value of a cell to the String variable called 'cellText'

		
		//Step 1 = Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://money.rediff.com/gainers/bsc/daily/groupa";
		String companyName = "Polyplex Corpn.";

		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Step 2 = Identify the webtable
		String tableXpath = "//*[@id=\"leftcontainer\"]/table";
		WebElement companyTable = driver.findElement(By.xpath(tableXpath));

		//Step 3 = To locate the rows of the table
		List<WebElement> rowsTable = companyTable.findElements(By.tagName("tr"));

		// Step 4 : To calculate the total number of rows
		int rowCount = rowsTable.size();
		System.out.println("Total number of rows is " + rowCount);

		outerforloop: 
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
					//System.out.println(cellText);

					// Step 10 : Retrieve all the column values of the mentioned company name

					if(cellText.contains(companyName)) {

						//A. Company Name
						WebElement cmpName = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[1]/a"));
						String cmpNameValue = cmpName.getText();
						System.out.println("The name of the company is " + cmpNameValue);

						//B.Group Name
						WebElement grpName = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[2]"));
						String grpNameValue = grpName.getText();
						System.out.println("The name of the group is " + grpNameValue);

						//C. Prev Days Close Price
						WebElement prevDay = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[3]"));
						String prevDayValue = prevDay.getText();
						System.out.println("The previous day close price is " + prevDayValue);

						//D. Current Price
						WebElement currentPrice = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[4]"));
						String currentPriceValue = currentPrice.getText();
						System.out.println("The current price is " + currentPriceValue);

						//E.Percent Change
						WebElement percentChange = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[5]/font"));
						String percentChangeValue = percentChange.getText();
						System.out.println("The percent change is " + percentChangeValue);

						break outerforloop;


					}
				}

			}

         //Close the application
		driver.close();
		System.out.println("Application is closed");

	}

}
