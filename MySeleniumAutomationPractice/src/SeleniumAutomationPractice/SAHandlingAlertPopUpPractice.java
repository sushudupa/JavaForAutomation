package SeleniumAutomationPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAHandlingAlertPopUpPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The biggest disadvantage of pop up alert is, you cannot do next step without handling or clicking the pop up alert box
		//Alert PopUp browser is a parent browser and alert box is a child window. So after clicking alertbox, we have to switch back to parent window
		//1. Step :First we have to click on ok button after clicking the aler box
		//2. Capture the alert box message. we have 3 options. i.e., capture, dismiss(cancel) and get text. Click on get text at the end
		// Because we are capturing the "ok" message from clicking the alert box. Syntax: driver.switchTo().alert().getText();
		//3.AletBox message should be declared to a variable. i.e., "String"
		//4.OK button code is almost same, but at the end, instead of getText, change it to accept. That is accepting the ok button
		//5. Confirm Alert Box coding is almost same as above. only change the name.
		//6.You have to click on "confirmationAlertBox" and click ok button. You get message like "You clicked on OK!"
		//7. You have to click one more time "confirmationAlertBox" to get the message after clicking the cancel button as "You clicked on Cancel!"
		//8. Use this syntax to click on cancel button = driver.switchTo().alert().dismiss();
		//9. Instead of using switchTo code multiple times in the PromptAlertBox, we are using Alert Class for this.
		//10. The syntax is = Alert alert = driver.switchTo().alert();
		//11. So we can just use = alert.getText(); insead of = driver.switchTo().alert().getText();
		//12. Alert(Interface) alert(class) = driver.switchTo.alert
		//13. Always to enter the value in selenium, we have to use "semdKeys"
		//14. If we have to click "OK"  button, we always have to use, alert.accept();
		
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://nxtgenaiacademy.com";
		
		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is Maximized");
		
		//Create the object instance for object class
		Actions action = new Actions(driver);
		
		//Performing the mouse hover action on the qaAutomation
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();
		System.out.println("Mouse Hover action on Q A Automation");
		
		//Performing the mouse hover action on the practice automation
		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();
		System.out.println("Mouse Hover action on Practice Automation");
		
		//Performing the mouse hover action on the Alert and Popup
		WebElement alertAndPopup = driver.findElement(By.partialLinkText("Alert And Popup"));
		alertAndPopup.click();
		System.out.println("Alert and Popup link is clicked");
		
		//1.Handling Alert Box
		//Click on Alert Box
		WebElement alertBox = driver.findElement(By.xpath("//button[@name='alertbox']"));
		alertBox.click();
		
		//Capture the message
		String alertBoxMsg = driver.switchTo().alert().getText();
		System.out.println(alertBoxMsg);
		
		//Click on ok button
		driver.switchTo().alert().accept();
		System.out.println("OK button is clicked");
		
		//2.Handling Confirm Alert Box
		//Click on confirm alert box
		WebElement confirmationAlertBox = driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		confirmationAlertBox.click();
		
		//Capture the message
		String confirmationAlertMsg = driver.switchTo().alert().getText();
		System.out.println(confirmationAlertMsg);
		
		//Click on ok button
		driver.switchTo().alert().accept();
		System.out.println("OK button is clicked");
		
		//Click on confirmation alert box//to get the message like "You clicked on Cancel!"
		confirmationAlertBox.click();
		
		//Click on cancel button
		driver.switchTo().alert().dismiss();
		System.out.println("Cancel button is clicked");
		
		//3.Prompt ALert Box
		//Click on Prompt Alert Box
		WebElement promptAlertBox = driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		promptAlertBox.click();
		
		//Switching to Alert (Alert Class)
		Alert alert = driver.switchTo().alert();
		
		//Capture the message
		String promptAlertMsg = alert.getText();
		System.out.println(promptAlertMsg);
		
		//Enter the YES
		alert.sendKeys("Yes");
		System.out.println("Yes button is clicked");
		
		//Click on OK Button -  This step is done to get the message after you enter the "yes" value
		alert.accept();
		System.out.println("Ok button is clicked");
			
		//Click on Prompt ALert Box = This step is done to enter the "No" value later in the box 
		promptAlertBox.click();
		System.out.println("Prompt Alert Box is clicked");
		
		//Enter NO
		alert.sendKeys("No");
		System.out.println("No button is clicked");
		
		//Click on OK button - This step is done to get the message after you enter the "no" value
		alert.accept();
		System.out.println("Ok button is clicked");
			
		//Click on Prompt Alert Box
		promptAlertBox.click();
		System.out.println("Prompt Alert Box is clicked");
		
		//Click on Cancel
		alert.dismiss();
		System.out.println("Cancel button is clicked");
		
		//Close the Application
		driver.close();
		System.out.println("Application is closed");

		
	}

}
