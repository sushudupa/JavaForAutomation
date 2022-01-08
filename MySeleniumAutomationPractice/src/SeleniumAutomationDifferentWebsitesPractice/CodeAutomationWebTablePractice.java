package SeleniumAutomationDifferentWebsitesPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeAutomationWebTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
			
		String URL = "http://codenboxautomationlab.com/practice/";
		String courseName = "Write effective QA Resume that will turn to interview call";
		
		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Identify the table
		String tableXpath = "//*[@id=\"product\"]/tbody";
		WebElement courseTable = driver.findElement(By.xpath(tableXpath));
		
		//To locate the rows of the table
		List<WebElement> rowsTable = courseTable.findElements(By.tagName("tr"));
		
		//To calculate the number of rows
		int rowCount = rowsTable.size();
		//System.out.println("Total number of rows " + rowCount);
		
		outerforloop:
		//For loop - Loop will be executed till the last row of the table
		for(int row=1; row<rowCount+1; row++) {
			
			 //To locate the columns of the specified row
			List<WebElement>columnRows = rowsTable.get(row-1).findElements(By.tagName("td"));
			
			//To calculate the total number of column
			int colCount = columnRows.size();
			//System.out.println("Total number of column" + colCount);
			
			// For Loop - Execute the loop till the last cell of the specified column of the table
			for(int col=0; col< colCount; col++) {
				
				//To Retrieve all the cell text
				String cellText = columnRows.get(col).getText();
				
				//Retrieve all the column values of the mentioned course
				if(cellText.contains(courseName)) {
					
					//A. Instructor
					WebElement instructor = driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr["+row+"]/td[1]"));
					String instructorName = instructor.getText();
					System.out.println("The name of the instructor is " + instructorName);
					
					//B.Course
					WebElement course = driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr["+row+"]/td[2]"));
					String courseNameValue = course.getText();
					System.out.println("The course selected is " + courseNameValue);
					
					//C. Price
					WebElement price = driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr["+row+"]/td[3]"));
					String priceValue = price.getText();
					System.out.println("The price of the course is " + priceValue);
					
					break outerforloop;
						
				 }
				
				
			   }
			}
		//Close the application
		driver.close();
		System.out.println("Application is closed");

	}

}
