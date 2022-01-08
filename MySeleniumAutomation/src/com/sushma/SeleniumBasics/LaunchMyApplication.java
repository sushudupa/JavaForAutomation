package com.sushma.SeleniumBasics;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchMyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set the system properties
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		// create new object instance of the driver
		WebDriver myDriverInstance = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		myDriverInstance.get(URL);
		myDriverInstance.manage().window().maximize();	
		//myDriverInstance.close();
//	
//	/*myDriverInstance.findElement(By.id("vfb-5")).sendKeys("Sushma");//ID Locator
//	myDriverInstance.findElement(By.name("vfb-7")).sendKeys("Udupa");//Name Locator
//	myDriverInstance.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("1000 Chessridge Way");//XPath Locator
//	myDriverInstance.findElement(By.cssSelector("#vfb-13-zip")).sendKeys("27560");//CSS Selector
//	myDriverInstance.findElement(By.cssSelector("#vfb-14")).sendKeys("sushma.udupa@gmail.com");//CSS Selector
//	myDriverInstance.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("Morrisville");//Xpath
//	myDriverInstance.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("North Carolina");
//	myDriverInstance.findElement(By.name("vfb-18")).sendKeys("09/27/21");//Name Locator
//
//	
//	
//	
//	//myDriverInstance.findElement(By.linkText("HOME")).click();//Link Text
//	//myDriverInstance.findElement(By.partialLinkText("FOR DATA")).click();//Partial Link Text
//	*/
	
		
	//Validating the title	
	String actTitle = myDriverInstance.getTitle();
	String expTitle = "Demo Site – Registration Form – NxtGen A.I Academy";
	
	if(actTitle.equals(expTitle)) {
		System.out.println("Both the actual and expected titles are same");
		System.out.println("The title is" + actTitle);
	
	}
	else	
	{
	 System.out.println("Both the actual and expected titles are not the same");
	 System.out.println("The expected title is " + expTitle);
	 System.out.println("The actual title is " + actTitle );
	}
	
	}
	

}
