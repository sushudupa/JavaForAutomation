package SeleniumAutomationPractice;

//1.After launching the url, i did find the xpath for calendar and clicked it.
//2. Handling year is the second step(I used December month). 
//3. Handling next button: i took a xpath and clicked on next button
//4. Handling next button
//5. I have given the name currentMonth here. So i should not get confused between currentYear and currentYear again for month=String currentMonth = date.getText();
//We are using the same code for both month and year String currentMonth = date.getText();/String currentYear = date.getText();
//Next step i did  is selectDay
//Next coding is all the way up, public static void selectDate(Its a method)(WebElement calendar(Departure and Return are object), String year, String Month, String Day, WebDriver driver)
//I am copy pasting the calendar from down to here on the upper static void main(1st one we just created)
//This calendar was below maximize the application
//We changed the original calendar name to departure: WebElement departure = driver.findElement(By.xpath("//*[contains(text(),'DEPARTURE')]"));
//This WebElement departure was WebElement Calendar before
//We can never use the 'return' keyword. so we are using returning word instead

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingCalendarPractice {

	public static void selectDate(WebElement calendar, String year, String month, String day, WebDriver driver) {

		//Click on calendar
		calendar.click();

		//Handling year
		WebElement date = driver.findElement(By.className("DayPicker-Caption"));
		String currentYear = date.getText();


		//Next button
		WebElement next = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));


		// Click on next arrow till we get the desired year
		if(!currentYear.contains(year)) {
			do {
				next.click();
			}while(!date.getText().contains(year));
		}

		//click on the next arrow till we get the desired month
		String currentMonth = date.getText();

		if(!currentMonth.contains(month)) {
			do {
				next.click();
			}while(!date.getText().contains(month));
		}

		//Select the date
		WebElement selectDay = driver.findElement(By.xpath("//p[contains(text(),"+day+")]"));
		selectDay.click();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://www.makemytrip.com/";

		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Click on the calendar
		//Select the departure date
		WebElement departure = driver.findElement(By.xpath("//*[contains(text(),'DEPARTURE')]"));
		selectDate(departure, "2022", "March", "4", driver);

		//Select the return date
		WebElement returning = driver.findElement(By.xpath("//*[contains(text(),'RETURN')]"));
		selectDate(returning, "2022", "April", "14", driver);	

	}

}
