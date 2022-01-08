package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAHandlingBrowserPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the System property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		
		//Launch the URL
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the URL
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Validating the title
		String actTitle = driver.getTitle();
		String expTitle = "Demo Site – Registration Form – NxtGen A.I Academy";
		
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
		
       //Click on DATA PYTHON link
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
		System.out.println("DATA SCIENCE link is clicked");
		
		//Validating the title
		String actCurrentUrl = driver.getCurrentUrl();
		String expCurrentUrl = "https://nxtgenaiacademy.com/python/";
		
		if(actCurrentUrl.equals(expCurrentUrl)) {
			System.out.println("Both the actual and current Url are same");
			System.out.println("The actual current url is " + actCurrentUrl);
		}
		else
		{
			System.out.println("Both the actual and expected current url are not same");
			System.out.println("The actual current url is " + actCurrentUrl);
			System.out.println("The expected current url is " + expCurrentUrl);
		}
		
		//Storing the page source in the string variable 
		String pageSource = driver.getPageSource();
		
		//Savin page source to a variable
		int pageSourceLength = pageSource.length();
		System.out.println("The total length of the page source is " + pageSourceLength);
		
		//Navigate to multiple browser window
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		System.out.println("Navigate to Multiple Window Browser");
		
		//Click on New Browser Window
		driver.findElement(By.name("newbrowserwindow123")).click();
		System.out.println("New Browser Window is Clicked");
		
		// Quit Method - It will close all the active browser opened by the chrome driver
		driver.quit();
		
		//id, name, style (you will get these when you inspect) are attributes and name="newbrowserwindow123" is the value in the name attribute
		//If we are validating the title directly, then use driver.(value we are validating) eg: String actTitle = driver.getTitle();
		//If we are validating the attribute value, then googleSearch.(attribute value) eg:String actGoogleSearch = googleSearch.getAttribute("Title");
		
		
		//Close the Application
		//driver.close();
		
		
		
	}

}
