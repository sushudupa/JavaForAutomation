package SeleniumHandlingBrowserPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHandlingBrowser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Set the system property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		
		//create the object instance
		WebDriver myDriverInstance = new ChromeDriver();
		
		String strURL = "https://nxtgenaiacademy.com/demo-site/";
		
		//Launch the URL
		myDriverInstance.get(strURL);
		
		//Maximize the URL
		myDriverInstance.manage().window().maximize();
		
	
		//1. Validating the Title
		String actTitle = myDriverInstance.getTitle();
		String expTitle = "Demo Site – Registration Form – NxtGen A.I Academy";
		
		if(actTitle.equals(expTitle)) {
			System.out.println("Both the actual and expected titles are same");
			System.out.println("The actual title is " + actTitle );
		}
		else
		{
			System.out.println("Both the actual and expected titles are not the same");
			System.out.println("The actual title is " + actTitle);
			System.out.println("The expected title is " + expTitle);
			
		}
		
	    //2. Finding Page source
		String pagesource = myDriverInstance.getPageSource();
		int pageSourceLength = pagesource.length();
		System.out.println("The page source length is " + pageSourceLength);
		
		//Quit Method - close all the windows opened by the web browser
		myDriverInstance.get("https://nxtgenaiacademy.com/multiplewindows/");
		myDriverInstance.findElement(By.name("newbrowserwindow123"));
		
		//myDriverInstance.quit();
		
		//Close the browser
		myDriverInstance.close();
		
		
            	
	}
	

}
