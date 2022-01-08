package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAHandlingStaticWebtablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//web table always starts and ends with 'table' tab


		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://nxtgenaiacademy.com";

		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Create the object instance for action class
		Actions action = new Actions(driver);

		//Mouse hover action on QA automation
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Mouse Hover Action performed on QA Automation");

		//Mouse hover action on Practice Automation
		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();
		System.out.println("Mouse hover action performed on Practice Automation");

		//Mouse hover action on webtable link
		WebElement webTable = driver.findElement(By.partialLinkText("WebTable"));
		webTable.click();
		System.out.println("Mouse Hover action on Web Table");

		//1. Step: Find the table xpath
		String startXpath = "//*/table/tbody/";

		//Employer First Name
		WebElement firstName = driver.findElement(By.xpath(startXpath + "tr[1]/td[2]"));
		String empFirstName = firstName.getText();
		System.out.println("The first name of the employer is " + empFirstName);

		//Employer Last Name
		WebElement lastName = driver.findElement(By.xpath(startXpath + "tr[2]/td[2]"));
		String empLastName = lastName.getText();
		System.out.println("The last name of the employer is " + empLastName);

		//Employer Gender
		WebElement gender = driver.findElement(By.xpath(startXpath + "tr[3]/td[2]"));
		String empGender = gender.getText();
		System.out.println("The gender of the employer is " + empGender);

		//Employer date of birth
		WebElement dateOfBirth = driver.findElement(By.xpath(startXpath + "tr[4]/td[2]"));
		String empBirthDate = dateOfBirth.getText();
		System.out.println("The date of birth of the employer is " + empBirthDate);

		//Employer birth place
		WebElement birthPlace = driver.findElement(By.xpath(startXpath + "tr[5]/td[2]"));
		String empBirthPlace = birthPlace.getText();
		System.out.println("The birth place of employer is " + empBirthPlace);

		//Employer Title
		WebElement title = driver.findElement(By.xpath(startXpath + "tr[6]/td[2]"));
		String empTitle = title.getText();
		System.out.println("The title of the employer is " + empTitle);

		//Employer number
		WebElement numberID = driver.findElement(By.xpath(startXpath + "tr[7]/td[2]"));
		String empNumberID = numberID.getText();
		System.out.println("The employer ID number is " + empNumberID);

		//Employer Salary
		WebElement salary = driver.findElement(By.xpath(startXpath + "tr[8]/td[2]"));
		String empSalary = salary.getText();
		System.out.println("The salary of the employer is " + empSalary);

		//Employer Email ID
		WebElement emailID = driver.findElement(By.xpath(startXpath + "tr[9]/td[2]"));
		String empEmailID = emailID.getText();
		System.out.println("The email ID of the employer is " + empEmailID);

		//close the application
		driver.close();
		System.out.println("Application is closed");

	}

}
