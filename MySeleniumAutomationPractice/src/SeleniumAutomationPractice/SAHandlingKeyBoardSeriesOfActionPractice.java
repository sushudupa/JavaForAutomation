package SeleniumAutomationPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SAHandlingKeyBoardSeriesOfActionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. To activate the text box(search space) in google, we have to use 'moveToElement' tool = action.moveToElement(searchBox)
		//2. Next step is to type the selenium in the google search box by using shift key. For the shift key, we have to use the code called '.keyDown'
		//3. Ater clicking .keyDown, we have to enter the values(searchBox and value(Keys.SHIFT) = .keyDown(searchBox, Keys.SHIFT)
		//4. Bext step is to perform sendKeys method to element(searchBox and type the value(selenium, already declared before) = .sendKeys(searchBox, value)
		//5. Taking finger out from the shift key is the next step. That is 'keyUp' from the search box and use keys.SHIFT = .keyUp(searchBox, Keys.SHIFT)
		//6. Giving some pause to execute the code
		//7. Next step is to press the enter key= so using sendKeys method. that is, = .sendKeys(Keys.ENTER)
		//8. then type and select perform action
		//9. key down means pressing the shift key to type anything in capital letters
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
	
		String URL = "https://www.google.com";
		String value = "selenium";
		
		//Launch the Application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Declaring the WebElement object
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		
		// Create an Instance in Actions Class by passing webdriver instance
		Actions action = new Actions(driver);
		
		// Method 1: Using Actions Class
      /*  action.moveToElement(searchBox)
		      .keyDown(searchBox, Keys.SHIFT)
		      .sendKeys(searchBox, value)
		      .keyUp(searchBox, Keys.SHIFT)
		      .pause(3000)
		      .sendKeys(Keys.ENTER )
		      .perform(); */
		
		// Method 2 : Using Action Interface
		 Action seriesOfAction = action.moveToElement(searchBox)
				.keyDown(searchBox, Keys.SHIFT)
				.sendKeys(searchBox, value)
				.keyUp(searchBox, Keys.SHIFT)
				.sendKeys(Keys.ENTER)
				.build();
		
		 seriesOfAction.perform();
		 
		 //Close the Application
		 driver.close();
		 System.out.println("Application is closed");
		 
		 
		 //Method 2
		 //Import Action method
		 //Next do seriesOfAction method
		 //Rest of the steps are same as Using Class method
		 
		 //Chain of action(seriesOfAction program) is saved in the seriesOfAction variable.
		 //SeriesOfAction method is called as Action Interface = this has to be done only if they ask for seriesOfAction method
		 //Or else go for the 1st method itself
		 //Action interface is an object in action method
			
	}

}
