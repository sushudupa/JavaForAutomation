package SeleniumHandlingBrowserPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHandlingBrowser5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the System property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		
		//Launch the Application
		myDriverInstance.get(URL);
		System.out.println("Applicaiton is launched");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Validate the title
		String actTitle = myDriverInstance.getTitle();
		String expTitle = "Demo Site ? Registration Form ? NxtGen A.I Academy";
		
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
	       //2. Finding page source
		  String pagesource = myDriverInstance.getPageSource();
		  int pageSourceLength = pagesource.length();
		  System.out.println("The page source length is" + pageSourceLength);
		  
		  //Quit method = closing multiple windows
		  myDriverInstance.get("https://nxtgenaiacademy.com/multiplewindows/");
		  myDriverInstance.findElement(By.name("newbrowserwindow123"));
		  System.out.println("Closing all the multiple windows");
		  
		  //myDriverInstance.quit();
		  
		  //Close the Application
		  myDriverInstance.close();
		  System.out.println("Application is closed");
		  
		  
	
	}
	
		

	}


