package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingIFrameUsingIndexPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";
		
		//Launch the Application
		driver.get(URL);
		System.out.println("Application is Launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Frame Index Details
		//packageListFrame = 0;
		//packageFrame = 1;
		//classFrame = 2;
		
		//Paramaterizing the values
		int listFrame = 0;
		int packageFrame = 1;
		int classFrame = 2;
		
		//Activating the List Frame
		driver.switchTo().frame(listFrame);
		
		//Click on openqa selenium link
		driver.findElement(By.xpath("//*[@target='packageFrame']//following::li[2]")).click();
		System.out.println("Selenium Chrome Link is Clicked");
		
		//Mandatory Step - Switch to default content
		driver.switchTo().defaultContent();
		
		//Activating the Frame
		driver.switchTo().frame(packageFrame);
		
		//Click on ChromeOptions link
		driver.findElement(By.xpath("//*[@target='classFrame']//following::li[7]")).click();
		System.out.println("Chorme Option Link is Clicked");
		
		//Mandatory Step - Switch to Default content
		driver.switchTo().defaultContent();
		
		//Activating the Class Frame
		driver.switchTo().frame(classFrame);
		
		//Click on the Help Link
		driver.findElement(By.linkText("HELP")).click();
		System.out.println("Help Link is Clicked");
		
		//Close the Application
		driver.close();
		System.out.println("Application is Closed");
		
	}

}
