package MySeleniumLocatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		
		myDriverInstance.get(URL);
		myDriverInstance.manage().window().maximize();
		
		//Types of Selenium Locators
		
		//1. ID locator
		myDriverInstance.findElement(By.id("vfb-5")).sendKeys("Prasad");
		myDriverInstance.findElement(By.id("vfb-7")).sendKeys("Udupa");
		
		//2. Name Locator
		myDriverInstance.findElement(By.name("vfb-13[address]")).sendKeys("1000 Chessridge Way");
		myDriverInstance.findElement(By.name("vfb-13[address-2]")).sendKeys("1000");
		
		//3. Xpath Locator
		myDriverInstance.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("Morrisville");
		myDriverInstance.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("North Carolina");
		
		//4. CSS Selector
		myDriverInstance.findElement(By.cssSelector("#vfb-13-zip")).sendKeys("27560");
		myDriverInstance.findElement(By.cssSelector("#vfb-14")).sendKeys("sushma.udupa@gmail.com");
		
		//5. Link Text Locator
		myDriverInstance.findElement(By.linkText("HOME")).click();
		
		//6. Partial Link Text Locator
		myDriverInstance.findElement(By.partialLinkText("DATA SCIENCE")).click();
		
		myDriverInstance.close();
		
		
	}

}
