package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingIFrameUsingNamePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Go to inspect in the website and click control f to find all the iframes. there are 3 iframes in the website
		

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";

		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		// Frame names details after inspecting
		//packageListFrame
		//packageFrame
		//classFrame
		
		//Paramaterizing the values
		String listFrame = "packageListFrame";
		String packageFrame = "packageFrame";
		String classFrame = "classFrame";
		
		//Activating the List Frame
		 driver.switchTo().frame(listFrame);
		
		// Click on org.openqa.selenium.chrome link
		 driver.findElement(By.xpath("/html/body/main/ul/li[2]/a")).click();
		 System.out.println("Selenium Chrome Link is Clicked");
		 
		// Mandatory step - Switch back to default content
		 driver.switchTo().defaultContent();
		 
		 //Activate to PackageFrame
		 driver.switchTo().frame(packageFrame);
		 
		//Click on ChromeOptions link
		 driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[7]/a")).click();
		 System.out.println("Chorme Option Link is Clicked");
		 
		 //Mandatory Step - Switch back to default content
		 driver.switchTo().defaultContent();
		 
		 //Activating the Class Frame
		 driver.switchTo().frame(classFrame);
		 
		 //Click on the Help link
		 driver.findElement(By.linkText("HELP")).click();
		 System.out.println("Help Link is Clicked");
		 
		 //Close the Application
		 driver.close();
		 System.out.println("Application is Closed");
		 
		 //Steps to be followed while doing this program
		 //1. Frame name details after inspecting and parameterize the values using string. Activate the List Frame by using "driver.switchTo.frame"
		 //2. Activate the List Frame first and then click on the org.openqa.selenium.chrome link and then write .click at the end after doing find
		 //element using xpath
		 //3. Switch back to default content
		 //4. Activate the Package Frame
		 //5. Click on the chrome option link using find element(using xpath) and write .click at the end
		 //6. Switch back to default content again
		 //7. Activate the Class Frame and in that click on the HELP tab(link)
		 //8. The above step can be done by doing find element (by partial link text) and then write .click at the end
		 //9. Close the Application
		 
		 //10. If we miss the switching back to default content, then we get the error called "org.openqa.selenium.NoSuchFrameException"
		 //11. Name value is the best if we are using iframe. 
		 //12. Activating the frame and default content are the two keywords in iframes
		 

	}

}
