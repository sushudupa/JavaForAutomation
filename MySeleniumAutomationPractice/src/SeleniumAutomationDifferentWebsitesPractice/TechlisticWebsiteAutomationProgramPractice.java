package SeleniumAutomationDifferentWebsitesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TechlisticWebsiteAutomationProgramPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://www.techlistic.com/";
		
		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Click on Java tutorial link
		WebElement javaLink = driver.findElement(By.partialLinkText("JAVA"));
		javaLink.click();
		System.out.println("Mouse hover action performed on Java Tutorial Link");
			
		//Validate the Java Tutorial Page Title
		String actPageTitle = "Java Tutorial For Beginners - Techlistic";
		String expPageTitle = "Java Tutorial For Beginners - Techlistic";
		
		if(actPageTitle.equals(expPageTitle)) {
			System.out.println("Both the actual and expected page titles are same");
			System.out.println("The actual page title is " + actPageTitle);
		}
		else
		{
			System.out.println("Both the actual and expected page title are not same");
			System.out.println("The actual page title is " + actPageTitle);
			System.out.println("The expected page title is " + expPageTitle);
		}
		
		Thread.sleep(3000);
		
		
		//Navigate back to home page
		driver.navigate().back();
		System.out.println("Navigated back to the home page");
		
		//Click on Selenium tutorial link
		WebElement seleniumLink = driver.findElement(By.partialLinkText("SELENIUM"));
		seleniumLink.click();
		System.out.println("Mouse hover action performed on Selenium Tutorial Link");
	
		//Validate the Selenium Tutorial Page link
		String actPageTitle1 = "Selenium Webdriver Tutorial - Techlistic";
		String expPageTitle1 = "Selenium Webdriver Tutorial - Techlistic";
		
		if(actPageTitle1.equals(expPageTitle1)) {
			System.out.println("Both the actual and expected title are same");
			System.out.println("The actual title is " + actPageTitle1);
			
		}
		else
		{
			System.out.println("Both the actual and expected title are not same");
			System.out.println("The actual page title is " + actPageTitle1);
			System.out.println("The expected page title is " + expPageTitle1);
		}
		
		Thread.sleep(3000);
		
		//Navigate back to home page
		driver.navigate().back();
		System.out.println("Navigated back to home page");
		
		
		//Click on the selenium blog link doing mouse hover action
		WebElement seleniumBlog = driver.findElement(By.partialLinkText("BLOGS"));
		seleniumBlog.click();
		System.out.println("Mouse hover action performed on blogs link");
		
		//Validate the selenium blog title
		String actTitle = "Best Selenium Blogs";
		String expTitle = "Best Selenium Blogs";
		
		if(actTitle.equals(expTitle)) {
			System.out.println("Both actual and expected title are same");
			System.out.println("The actual title is " + actTitle);
		}
		else
		{
			System.out.println("Both actual and expected title are not same");
			System.out.println("The actual title is " + actTitle);
			System.out.println("The expected title is " + expTitle);
		}

		Thread.sleep(3000);
		
		//Navigate back to home page
		driver.navigate().back();
		System.out.println("Navigated back to home page");
		
		//Click on TestNG link
		WebElement testNGLink = driver.findElement(By.partialLinkText("TESTNG"));
		testNGLink.click();
		System.out.println("Mouse hover action performed on TestNG Link");
		
		//Validate the TestNg page title
		String actTitlePage = "Selenium with TestNG Tutorial";
		String expTitlePage = "Selenium with TestNG Tutorial";
		
		if(actTitlePage.equals(expTitlePage)) {
			System.out.println("Both actual and expected page title are same");
			System.out.println("The actual page title is " + actTitlePage);
		}
		else
		{
			System.out.println("Both actual ane expected page title are not same");
			System.out.println("The actual page title is " + actTitlePage);
			System.out.println("The expected page title is " + expTitlePage);
		}
		
		Thread.sleep(3000);
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");
		
	}

}
