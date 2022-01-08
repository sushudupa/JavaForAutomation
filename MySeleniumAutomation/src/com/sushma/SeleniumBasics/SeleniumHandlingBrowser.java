package com.sushma.SeleniumBasics;


/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - To implement WebDriver API commands for BrowserButton
 * Date - 09/28/2021
 *==================================================================*/




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHandlingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set my system property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		
		//create the object instance
		WebDriver myDriverInstance = new ChromeDriver();

		String strURL = "https://nxtgenaiacademy.com/demo-site/";

		//Launch the URL
		myDriverInstance.get(strURL);

		//Maximize the URL
		myDriverInstance.manage().window().maximize();

		//Validating the title
		String actTitle = myDriverInstance.getTitle();
		String expTitle = "Demo Site – Registration Form – NxtGen A.I Academy";

		if(actTitle.equals(expTitle)) {
			System.out.println("Both the actual and expected titles are same");
			System.out.println("The actual title " + actTitle);
		}
		else
		{
			System.out.println("Both the actual and expected titles are not same");
			System.out.println("The actual title " + actTitle);
			System.out.println("The expected title" + expTitle);
		}


		//2.Click on the Data Science Link
		myDriverInstance.findElement(By.partialLinkText("DATA SCIENCE")).click();
		


		//Validating the URL
		String actCurrentURL = myDriverInstance.getCurrentUrl();
		String expCurrentURL = "https://nxtgenaiacademy.com/python/";

		if(actCurrentURL.equals(expCurrentURL)) {
			System.out.println("Both the actual and expected current URL'S are same");
			System.out.println("The actual current URL" + actCurrentURL);
		}
		else
		{
			System.out.println("Both the actual and expected current URL'S are not same ");
			System.out.println("The actCurrentURL " + actCurrentURL);
			System.out.println("The expCurrentURL " + expCurrentURL);
		}

		//3. Finding pageSource length
		String pageSource = myDriverInstance.getPageSource();
		int pageSourceLength = pageSource.length();
		System.out.println("The total page source length is " + pageSourceLength);

		//Quit Method - closes all the windows opened by the web browser
		myDriverInstance.get("https://nxtgenaiacademy.com/multiplewindows/");
		myDriverInstance.findElement(By.name("newbrowserwindow123")).click();

		//myDriverInstance.quit();

		//To close the application
		myDriverInstance.close();






	}

}
