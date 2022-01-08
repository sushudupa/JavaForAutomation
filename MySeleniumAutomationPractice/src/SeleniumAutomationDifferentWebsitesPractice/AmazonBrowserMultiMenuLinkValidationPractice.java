package SeleniumAutomationDifferentWebsitesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBrowserMultiMenuLinkValidationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://www.amazon.com/";

		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Get the title of the page and print
		driver.getTitle();
		System.out.println("The title of the page is " + driver.getTitle());

		//Click on the best sellers menu link
		WebElement bestSellers = driver.findElement(By.partialLinkText("Best Sellers"));
		bestSellers.click();
		System.out.println("Best seller menu is clicked");

		//Get page title of best seller menu link
		driver.getTitle();
		System.out.println("The page title of best seller menu page is " + driver.getTitle());

		//Verify the expected value of the best seller page title
		String actPageTitle = driver.getTitle();
		String expPageTitle = "Amazon.com Best Sellers: The most popular items on Amazon";

		if(actPageTitle.equals(expPageTitle)) {
			System.out.println("Both actual and expected page titles are same");
			System.out.println("The actual page title is " + actPageTitle);
		}
		else
		{
			System.out.println("Both actual and expected page titles are not same");
			System.out.println("The actual page title is " + actPageTitle);
			System.out.println("The expected page title is " + expPageTitle);
		}

		Thread.sleep(3000);

		//Navigate back to home page
		driver.navigate().back();
		System.out.println("Navigated back to home page");

		//Get the home page title
		driver.getTitle();
		System.out.println("The title of the page is " + driver.getTitle());

		//Verify the home page title with the expected value
		String actPageTitle1 = driver.getTitle();
		String expPageTitle1 = "Amazon.com. Spend less. Smile more.";

		if(actPageTitle1.equals(expPageTitle1)) {
			System.out.println("Both actual and expected page titles are same");
			System.out.println("The actual page title is " + actPageTitle1);
		}
		else
		{
			System.out.println("Both actual and expected page titles are not same");
			System.out.println("The actual page title is " + actPageTitle1);
			System.out.println("The expected page title is " + expPageTitle1);
		}

		Thread.sleep(3000);

		//Click on the books menu link
		WebElement books = driver.findElement(By.partialLinkText("Books"));
		books.click();
		System.out.println("Books menu is clicked");


		//Get the page title of books link in the menu
		driver.getTitle();
		System.out.println("The title of the books menu page is " + driver.getTitle());

		//Verify the expected value of the books menu page title
		String actPageTitle2 = driver.getTitle();
		String expPageTitle2 = "Amazon.com: Books";

		if(actPageTitle2.equals(expPageTitle2)) {
			System.out.println("Both actual and expected books page titles are same");
			System.out.println("The actual books page title is " + actPageTitle2);
		}
		else
		{
			System.out.println("Both actual and expected books page titles are not same");
			System.out.println("The actual books page title is " + actPageTitle2);
			System.out.println("The expected books page title is " + expPageTitle2);
		}


		Thread.sleep(3000);

		//Navigate back to home page
		driver.navigate().back();
		System.out.println("Navigated back to home page");

		//Get the home page title
		driver.getTitle();
		System.out.println("The title of the page is " + driver.getTitle());

		//Verify the home page title with the expected value
		String actPageTitle3 = driver.getTitle();
		String expPageTitle3 = "Amazon.com. Spend less. Smile more.";

		if(actPageTitle1.equals(expPageTitle3)) {
			System.out.println("Both actual and expected home page titles are same");
			System.out.println("The actual home page title is " + actPageTitle3);
		}
		else
		{
			System.out.println("Both actual and expected home page titles are not same");
			System.out.println("The actual home page title is " + actPageTitle1);
			System.out.println("The expected home page title is " + expPageTitle3);
		}

		Thread.sleep(3000);

		//Click on the fashion menu link
		WebElement fashion = driver.findElement(By.partialLinkText("Fashion"));
		fashion.click();
		System.out.println("Fashion menu is clicked");


		//Get the page title of fashion link in the menu
		driver.getTitle();
		System.out.println("The title of the fashion menu page is " + driver.getTitle());

		//Verify the expected value of the fashion menu page title
		String actPageTitle4 = driver.getTitle();
		String expPageTitle4 = "Amazon.com: Books";

		if(actPageTitle4.equals(expPageTitle4)) {
			System.out.println("Both actual and expected fashion page titles are same");
			System.out.println("The actual fashion page title is " + actPageTitle4);
		}
		else
		{
			System.out.println("Both actual and expected fashion page titles are not same");
			System.out.println("The actual fashion page title is " + actPageTitle2);
			System.out.println("The expected fashion page title is " + expPageTitle2);
		}

		Thread.sleep(3000);

		//Navigate back to home page
		driver.navigate().back();
		System.out.println("Navigated back to home page");

		//Get the home page title
		driver.getTitle();
		System.out.println("The title of the home page is " + driver.getTitle());

		//Verify the home page title with the expected value
		String actPageTitle5 = driver.getTitle();
		String expPageTitle5 = "Amazon.com. Spend less. Smile more.";

		if(actPageTitle1.equals(expPageTitle5)) {
			System.out.println("Both actual and expected home page titles are same");
			System.out.println("The actual home page title is " + actPageTitle5);
		}
		else
		{
			System.out.println("Both actual and expected home page titles are not same");
			System.out.println("The actual home page title is " + actPageTitle5);
			System.out.println("The expected home page title is " + expPageTitle5);
		}
		
		//Close the browser
		driver.close();
		System.out.println("Application is closed");
		

	}

}
