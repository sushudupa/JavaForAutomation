package MySeleniumLocatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the Object instance
		WebDriver myDriverInstance = new ChromeDriver();
		System.out.println("Object Instance has been created");
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		
		//Launch the Application
		myDriverInstance.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//1. ID locator
		myDriverInstance.findElement(By.id("vfb-5")).sendKeys("Sushma");
		myDriverInstance.findElement(By.id("vfb-7")).sendKeys("Udupa");
		
		//2. Name Locator
		myDriverInstance.findElement(By.name("vfb-13[address]")).sendKeys("1000 Chessridge Way");
		myDriverInstance.findElement(By.name("vfb-13[address-2]")).sendKeys("1000");
		
		//3. XPath Locator
		myDriverInstance.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("Morrisville");
		myDriverInstance.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("North Carolina");
		
		//4.CSS Selector
		myDriverInstance.findElement(By.cssSelector("#vfb-13-zip")).sendKeys("27560");
		myDriverInstance.findElement(By.cssSelector("#vfb-14")).sendKeys("sushma.udupa@gmail.com");
		
		//5. Link Selector
		myDriverInstance.findElement(By.linkText("HOME")).click();
		
		Thread.sleep(3000);
		
		//6. Partial Link Selector
		myDriverInstance.findElement(By.partialLinkText("DATA SCIENCE")).click();
		
		//Close the application
		myDriverInstance.close();
		System.out.println("Application is closed");

	}

}
