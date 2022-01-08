package myfirstattemptSeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebBroserLaunch13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set the system property
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumAutomation\\SeleniumSupportFiles\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.close();

	}

}
