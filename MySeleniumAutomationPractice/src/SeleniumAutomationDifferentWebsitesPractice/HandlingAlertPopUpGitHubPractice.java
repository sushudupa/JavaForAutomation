package SeleniumAutomationDifferentWebsitesPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopUpGitHubPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://qavbox.github.io/demo/alerts/";
		
		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//1. Handling Alert box
		//Click on alert box
		WebElement alertBox = driver.findElement(By.xpath("//input[@value='Submit']"));
		alertBox.click();
		System.out.println("Clicked on the alert box");
		
		//capture the mesage
		String alertBoxMsg = driver.switchTo().alert().getText();
		System.out.println(alertBoxMsg);
		
		//click on ok button
		driver.switchTo().alert().accept();
		System.out.println("Ok button is clicked");
		
		//2. Handling Prompt Box
		//Click on Prompt box
		WebElement promptAlertBox = driver.findElement(By.xpath("//input[@value='PromptMe']"));
		promptAlertBox.click();
		System.out.println("Prompt alert box is clicked");
		
		//Switching to alert class
		Alert alert = driver.switchTo().alert();
		
		//Capture the message
		String promptAlertMsg = alert.getText();
		System.out.println(promptAlertMsg);
		
		//Enter the name
		alert.sendKeys("Rio");
		System.out.println("Name is entered");
		
		//Click on ok button
		alert.accept();
		System.out.println("Ok button is clicked");
		
		//3. Handling Confirm ALert Box
		//Confirm AlertBox
		WebElement confirmAlertBox = driver.findElement(By.xpath("//input[@value='Confirm']"));
		confirmAlertBox.click();
		System.out.println("Confirm alert box is clicked");
		
		//Capture the message
		String confirmAlertBoxMsg = driver.switchTo().alert().getText();
		System.out.println(confirmAlertBoxMsg);	
		
		//Click on ok button
		driver.switchTo().alert().accept();
		System.out.println("Ok button is clicked");
		
		//Click on confirm alert box
		confirmAlertBox.click();
		System.out.println("Confirm alert box is clicked");
		
		//Click on cancel button
		driver.switchTo().alert().dismiss();
		System.out.println("Cancel button is clicked");
		
		//Close the Application
		driver.close();
		System.out.println("Application is closed");
		
	}

}
