package SeleniumHandlingBrowserPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHandlingBrowser4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Set the System Property
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		
		//Create the Object Instance
		WebDriver myDriverInstance = new FirefoxDriver();
		
		String strURL = "https://nxtgenaiacademy.com/demo-site/";
		
		//Launch the URL
		myDriverInstance.get(strURL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Validating the title
		String actTitle = myDriverInstance.getTitle();
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
			//Get pages source length
		String pageSource = myDriverInstance.getPageSource();
		int pageSourceLength = pageSource.length();
		System.out.println("The page source length is " + pageSourceLength);
		
		//Quit Method - Closing all the browsers
		myDriverInstance.get("https://nxtgenaiacademy.com/multiplewindows/");
	    myDriverInstance.findElement(By.name("newbrowserwindow123"));
	    System.out.println("Closing all the browsers");
	    
	    //myDriverInstance.quit();
	    
	    //Close the Application
	    myDriverInstance.close();
	    System.out.println("Application is closed");
		
		
		
		
		}
		
		
	
	}


