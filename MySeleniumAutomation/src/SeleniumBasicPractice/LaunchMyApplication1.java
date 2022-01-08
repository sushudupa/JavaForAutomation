package SeleniumBasicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchMyApplication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the Object Instance
		WebDriver myDriverInstance = new ChromeDriver();
		System.out.println("Object Instance is created");

		String URL = "https://nxtgenaiacademy.com/demo-site/";

		//Launch the URL
		myDriverInstance.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");

		//Validating the title
		String actTitle = myDriverInstance.getTitle();
		String expTitle =  "Demo Site – Registration Form – NxtGen A.I Academy";

		if(actTitle.equals(expTitle)) {
			System.out.println("Both the actual and expected titles ar same");
			System.out.println("The actual title is " + actTitle);
		}

		else
		{
			System.out.println("Both the actual and expected titles are not same");
			System.out.println("The actual title is " + actTitle);
			System.out.println("The expected title is " + expTitle);

			//Close the application
			myDriverInstance.close();
			System.out.println("Application is closed");

		}
	}

}
