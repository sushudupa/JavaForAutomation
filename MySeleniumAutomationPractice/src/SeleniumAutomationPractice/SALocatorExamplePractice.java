package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SALocatorExamplePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create an object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		
		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Applicationis maximized");
		
		//1. ID locator
		//First Name
		driver.findElement(By.id("vfb-5")).sendKeys("Sushma");
		//Last Name
		driver.findElement(By.id("vfb-7")).sendKeys("Udupa");
		
		//2. Name Locator
		//Address 1
		driver.findElement(By.name("vfb-13[address]")).sendKeys("Chessridge Way");
		//Address 2
		driver.findElement(By.name("vfb-13[address-2]")).sendKeys("1000");
		
		//3. Link text
		//driver.findElement(By.linkText("HOME")).click();
		
		//4. Partial Link Text
		//driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
		
		//5. Xpath locator
		//City Name
		driver.findElement(By.xpath("//input[@name='vfb-13[city]']")).sendKeys("Morrisville");
		//State Name
		driver.findElement(By.xpath("//input[@name='vfb-13[state]']")).sendKeys("North Carolina");
		
		//6. CSS Selector
		//zip code
		driver.findElement(By.cssSelector("#vfb-13-zip")).sendKeys("27560");
		//Email ID
		driver.findElement(By.cssSelector("#vfb-14")).sendKeys("sushma.udupa@gmail.com");
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");
		
	
		
		

	}

}
