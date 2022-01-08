package SeleniumAutomationDifferentWebsitesPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatePageTitleogGoDaddyWebsitePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.godaddy.com/";
		
		//Launch the Application
		driver.get(url);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Maximize the application");
		
		//Get the title of the page
		driver.getTitle();
		System.out.println("The title of the page is " + driver.getTitle());
		
		//Validate the title of the page
		String actTitle = driver.getTitle();
		String expTitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy";
		
		if(actTitle.equals(expTitle)) {
			System.out.println("Both the actual and expected titles are same");
			System.out.println("The actual title is " + actTitle);
		}
		else
		{
			System.out.println("Both the actual and expected titles are not same");
			System.out.println("The actual title is " + actTitle);
			System.out.println("The expected title is " + expTitle);
		}
		
		//Get the URL of the page
		String strUrl = driver.getCurrentUrl();
		System.out.println("The current url is " + strUrl);
		
		//Validate the url
		String actCurrentUrl = driver.getCurrentUrl();
		String expCurrentUrl = "https://www.godaddy.com/";
		
		if(actCurrentUrl.equals(expCurrentUrl)) {
			System.out.println("Both the actual and expected current url are same");
			System.out.println("The actual current url is " + actCurrentUrl);
		}
		else
		{
			System.out.println("Both the actual and expected current url are not same");
			System.out.println("The actual current url is " + actCurrentUrl);
			System.out.println("The expected current url is " + expCurrentUrl);
		}
		
		//Getting page source length
		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length();
		System.out.println("The total page source length is " + pageSourceLength);
		
		//Validate the page source
		String actPageTitle = driver.getTitle();
		String expPageTitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy";
		
		if(actPageTitle.equals(expPageTitle)) {
			System.out.println("Both the actual and expected title in page source are same");
			System.out.println("The actual title in the page source is " + actPageTitle);
		}
		else
		{
			System.out.println("Both the actual and expected title in page source are not same");
			System.out.println("The actual title in the page source is " + actPageTitle);
			System.out.println("The expected title in the page source is " + expPageTitle);
			
		}
		
		//Close the Application
		driver.close();
		System.out.println("Application is closed");
		
		
	}

}
