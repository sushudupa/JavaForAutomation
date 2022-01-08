package SAPracticeHandlingCaptureScreenShotPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Advantages of screenshot
//1. Analyze the bug
//2. Trace and examine the reason behind the failure
//3. Understand the end to end test case flow
//4. Track test execution
//5. Analyze the  behaviour of the test in different browsers/environment

//When to capture screenshot? 1.each and every test case 2.when there is a failure 3.specific checkpoints 4.Different browsers 5.specific elements in webpage

public class CaptureScreenShot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com/multiplewindows/";
		
		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//First Step: Taking screenshot of entire page
		//Create the object instance for screenshot class
		//After typing Takes, i pressed control and spacebar together. so it created TakesScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		
		// Call getScreenshotAs method to create image file
		File file = scrShot.getScreenshotAs(OutputType.FILE);
		
		//Copy the file to the desired location
		//It means saving the file to the location we want
		//Whenever we handle a screen shot, we need some jar file. That is additional set up needs to be done
		//I had already downloaded the jar file long ago, so i configured build path on the SeleniumAutomationPrctice folder
		//I went to class path-add external Jars-add the files we need(C:\SeleniumAutomation\SeleniumSupportFiles\Apache\commons-io-2.11.0-bin\commons-io-2.11.0)-apply & close
		//FileUtils.copyFile(file, file);Here, first file is source file, so we gave the above "file" as source file
		//The other file is destination file: we have to mention where the screen shot should be captured.
		//After typing the below code, it asks to add throw decleration which i did.
		
		//Copy the file to the desired location
		FileUtils.copyFile(file, new File(".\\Screenshot\\MultiBrowser.jpg"));
		
		//Taking screenshot for failure condition
		//We are doing try catch method here.
		//The Throwable class is the superclass of all errors andexceptions in the Java language. 
		//Initially we use proper value "newbrowserwindow123", i am changing it to "newbrowserwindow" just to capture negative scenario
		
		try {
			driver.findElement(By.name("newbrowserwindow")).click();
		}
		catch (Throwable e ){
			File file1 = scrShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file1, new File(".\\Screenshot\\error.jpg"));
			System.out.println(e);
		}
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");
		
	}

}
