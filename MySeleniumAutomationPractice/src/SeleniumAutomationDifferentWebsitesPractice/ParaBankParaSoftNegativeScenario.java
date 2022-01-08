package SeleniumAutomationDifferentWebsitesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankParaSoftNegativeScenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Parameterize all input values
		String usernameIDValue = "johndoe1";
		String firstNameValue = "John";
		String lastNameValue = "Doe";
		String addressValue = "98 Spring Street";
		String cityValue = "Chandler";
		String stateValue = "Arizona";
		String zipcodeValue = "98745";
		String ssnValue = "876342334";
		String regNewUserFNameValue = "Jane";
		String regNewUserLNameValue = "Hill";
		String regNewUserAddValue = "90 Silicon Drive";
		String regNewUserCityValue = "Seattle";
		String regNewUserStateValue = "Washington";
		String regNewUserZipValue = "98765";
		String regNewUserPhoneNumValue = "9654543677";
		String regNewUserSsnValue = "898756654";
		String regNewUserNameValue = "JaneDoe";
		String regNewUserPasswordValue = "automation";
		String regNewUserPasswordConfirmValue = "automation1";



		//Parameterize all webelement values

		String usernameLocator = "//input[@name='username']";
		String submitBtnLocator = "//input[@type='submit']";
		String errorMsgLocator = "//p[@class='error']";
		String firstNameLocator = "//input[@id='firstName']";
		String lastNameLocator = "//input[@id='lastName']";
		String addressLocator = "//input[@id='address.street']";
		String cityLocator = "//input[@id='address.city']";
		String stateLocator = "//input[@id='address.state']";
		String zipLocator = "//input[@id='address.zipCode']";
		String ssnLocator = "//input[@id='ssn']";
		String findMyIdLocator = "//input[@value='Find My Login Info']";
		String loginErrorMsgLocator = "//p[@class='error']";
		String regNewUserFirstNameLocator = "//*[@id='customer.firstName']";
		String regNewUserLastNameLocator = "//input[@id='customer.lastName']";
		String regNewUserAddLocator = "//input[@id='customer.address.street']";
		String regNewUserCityLocator = "//input[@id='customer.address.city']";
		String regNewUserStateLocator = "//input[@id='customer.address.state']";
		String regNewUserZipLocator = "//input[@id='customer.address.zipCode']";
		String regNewUserPhoneNumLocator = "//input[@id='customer.phoneNumber']";
		String regNewUserSsnLocator = "//input[@id='customer.ssn']";
		String regNewUserNameLocator = "//input[@id='customer.username']";
		String regNewUserPasswordLocator = "//input[@id='customer.password']";
		String regNewUserPasswordConfirmLocator = "//input[@id='repeatedPassword']";
		String registerBtnLocator = "//input[@value='Register']";
		String registerNewUserErrorLocator = "//*[@class='error']";





		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://parabank.parasoft.com/parabank/index.htm";

		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Enter the username login values
		WebElement userName = driver.findElement(By.xpath(usernameLocator));

		//Verify if username is displayed or not
		if(userName.isDisplayed()) {
			System.out.println("User name is displayed");
		}
		else
		{
			System.out.println("User name is not displayed");
		}

		//Verify the user name is enabled or not
		if(userName.isEnabled()) {
			System.out.println("User name is enabled");

			//Enter the user name values
			userName.sendKeys(usernameIDValue);
			System.out.println("User Name values entered is " + usernameIDValue);
		}
		else
		{
			System.out.println("User name is not enabled");
		}

		//Enter the submit button
		WebElement submitBtn = driver.findElement(By.xpath(submitBtnLocator));

		//Verify if submit button is displayed or not
		if(submitBtn.isDisplayed()) {
			System.out.println("Submit button is displayed");
		}
		else
		{
			System.out.println("Submit button is not displayed");
		}

		//Verify is submit button is enabled or not
		if(submitBtn.isEnabled()) {
			System.out.println("Submit button is enabled");
		}
		else
		{
			System.out.println("Submit button is not enabled");
		}

		//Verify if submit button is selected or not
		if(submitBtn.isSelected()) {
			System.out.println("Submit button is selected");
		}
		else
		{
			System.out.println("Submit button is not selected");

			//Click on the submit button
			submitBtn.click();
			System.out.println("Submit button is selected");
		}

		//Error message capture
		WebElement errorMsg = driver.findElement(By.xpath(errorMsgLocator));

		//Verify error message is displayed or not
		if(errorMsg.isDisplayed()) {
			System.out.println("Error message is displayed");
		}
		else
		{
			System.out.println("Error message is not displayed");
		}

		//verify error message is enabled or not
		if(errorMsg.isEnabled()) {
			System.out.println("Error message is enabled");

			//Error Message
			System.out.println("Login failed. The error message is: " + errorMsg.getText());
		}
		else
		{
			System.out.println("Error message is not enabled");
		}

		//B. Click on Forgot Login Info
		WebElement loginInfo = driver.findElement(By.partialLinkText("Forgot login"));
		loginInfo.click();
		System.out.println("Forgot login info link is clicked");

		//Enter all the information of the customer
		//1. Customer First Name
		WebElement firstName = driver.findElement(By.xpath(firstNameLocator));

		//Verify first name is displayed or not
		if(firstName.isDisplayed()) {
			System.out.println("First Name is displayed");
		}
		else
		{
			System.out.println("First name is not displayed");
		}

		//Verify first name is enabled or not
		if(firstName.isEnabled()) {
			System.out.println("First name is enabled");

			//Enter the values
			firstName.sendKeys(firstNameValue);
			System.out.println("First name entered is " + firstNameValue);
		}
		else
		{
			System.out.println("First name is not enabled");
		}

		//2.Customer Last Name
		WebElement lastName = driver.findElement(By.xpath(lastNameLocator));

		//Verify last name is displayed or not
		if(lastName.isDisplayed()) {
			System.out.println("Last name is displayed");
		}
		else
		{
			System.out.println("Last name is not displayed");
		}

		//Verify last name is enabled or not
		if(lastName.isEnabled()) {
			System.out.println("Last name is enabled");

			//Enter the values
			lastName.sendKeys(lastNameValue);
			System.out.println("The last name entered is " + lastNameValue);
		}
		else
		{
			System.out.println("Last name is not enabled");
		}

		//3.Customer Address
		WebElement address = driver.findElement(By.xpath(addressLocator));

		//Verify address is displayed or not
		if(address.isDisplayed()) {
			System.out.println("Customer address is displayed");
		}
		else
		{
			System.out.println("Customer address is not displayed");
		}

		//Verify address is enabled or not
		if(address.isEnabled()) {
			System.out.println("Customer address is enabled");

			//Enter the values
			address.sendKeys(addressValue);
			System.out.println("Customer address entered is " + addressValue);
		}
		else
		{
			System.out.println("Customer address is not enabled");		
		}

		//4. Customer City
		WebElement cityName = driver.findElement(By.xpath(cityLocator));

		//Verify address is displayed or not
		if(cityName.isDisplayed()) {
			System.out.println("Customer city is displayed");
		}
		else
		{
			System.out.println("Customer city is not displayed");
		}

		//Verify address is enabled or not
		if(cityName.isEnabled()) {
			System.out.println("Customer city is enabled");

			//Enter the values
			cityName.sendKeys(cityValue);
			System.out.println("Customer city entered is " + cityValue);
		}
		else
		{
			System.out.println("Customer city is not enabled");		
		}

		//5. Customer State
		WebElement stateName = driver.findElement(By.xpath(stateLocator));

		//Verify address is displayed or not
		if(stateName.isDisplayed()) {
			System.out.println("Customer state is displayed");
		}
		else
		{
			System.out.println("Customer state is not displayed");
		}

		//Verify address is enabled or not
		if(stateName.isEnabled()) {
			System.out.println("Customer state is enabled");

			//Enter the values
			stateName.sendKeys(stateValue);
			System.out.println("Customer state entered is " + stateValue);
		}
		else
		{
			System.out.println("Customer state is not enabled");		
		}

		//6. Customer zip Code
		WebElement zipcode = driver.findElement(By.xpath(zipLocator));

		//Verify address is displayed or not
		if(zipcode.isDisplayed()) {
			System.out.println("Customer zipcode is displayed");
		}
		else
		{
			System.out.println("Customer zipcode is not displayed");
		}

		//Verify address is enabled or not
		if(zipcode.isEnabled()) {
			System.out.println("Customer zipcode is enabled");

			//Enter the values
			zipcode.sendKeys(zipcodeValue);
			System.out.println("Customer zipcode entered is " + zipcodeValue);
		}
		else
		{
			System.out.println("Customer zipcode is not enabled");		
		}

		//7. Customer SSN
		WebElement ssn = driver.findElement(By.xpath(ssnLocator));

		//Verify address is displayed or not
		if(ssn.isDisplayed()) {
			System.out.println("Customer ssn is displayed");
		}
		else
		{
			System.out.println("Customer ssn is not displayed");
		}

		//Verify address is enabled or not
		if(ssn.isEnabled()) {
			System.out.println("Customer ssn is enabled");

			//Enter the values
			ssn.sendKeys(ssnValue);
			System.out.println("Customer ssn entered is " + ssnValue);
		}
		else
		{
			System.out.println("Customer ssn is not enabled");		
		}

		//8. Find my login info of customer
		WebElement findMyIdBtn = driver.findElement(By.xpath(findMyIdLocator));

		//Verify if submit button is displayed or not
		if(findMyIdBtn.isDisplayed()) {
			System.out.println("Submit button is displayed");
		}
		else
		{
			System.out.println("Submit button is not displayed");
		}

		//Verify is submit button is enabled or not
		if(findMyIdBtn.isEnabled()) {
			System.out.println("Submit button is enabled");
		}
		else
		{
			System.out.println("Submit button is not enabled");
		}

		//Verify if submit button is selected or not
		if(findMyIdBtn.isSelected()) {
			System.out.println("Submit button is selected");
		}
		else
		{
			System.out.println("Submit button is not selected");

			//Click on the submit button
			findMyIdBtn.click();
			System.out.println("Submit button is selected");
		}

		//9.Capture the error message
		WebElement loginInfoErrorMsg = driver.findElement(By.xpath(loginErrorMsgLocator));


		//Verify error message is displayed or not
		if(loginInfoErrorMsg.isDisplayed()) {
			System.out.println("Error message is displayed");
		}
		else
		{
			System.out.println("Error message is not displayed");
		}

		//verify error message is enabled or not
		if(loginInfoErrorMsg.isEnabled()) {
			System.out.println("Error message is enabled");

			//Error Message
			System.out.println("Login failed. The error message is: " + loginInfoErrorMsg.getText());
		}
		else
		{
			System.out.println("Error message is not enabled");
		}


		//C. Click on Register link
		WebElement register = driver.findElement(By.partialLinkText("Register"));
		register.click();
		System.out.println("Register new customer link is clicked");

		//Register new user. Enter new user infomation
		//1. New User First Name
		WebElement newUserFirstName = driver.findElement(By.xpath(regNewUserFirstNameLocator));

		//Verify first name is displayed or not
		if(newUserFirstName.isDisplayed()) {
			System.out.println("New User First Name is displayed");
		}
		else
		{
			System.out.println("New User First name is not displayed");
		}

		//Verify first name is enabled or not
		if(newUserFirstName.isEnabled()) {
			System.out.println("New User First name is enabled");

			//Enter the values
			newUserFirstName.sendKeys(regNewUserFNameValue);
			System.out.println("New User First name entered is " + regNewUserFNameValue);
		}
		else
		{
			System.out.println("New User First name is not enabled");
		}

		//2.New User Last Name
		WebElement newUserLastName = driver.findElement(By.xpath(regNewUserLastNameLocator));

		//Verify last name is displayed or not
		if(newUserLastName.isDisplayed()) {
			System.out.println("Last name is displayed");
		}
		else
		{
			System.out.println("New User Last name is not displayed");
		}

		//Verify last name is enabled or not
		if(newUserLastName.isEnabled()) {
			System.out.println("New User Last name is enabled");

			//Enter the values
			newUserLastName.sendKeys(regNewUserLNameValue);
			System.out.println("The last name entered is " + regNewUserLNameValue);
		}
		else
		{
			System.out.println("New User Last name is not enabled");
		}

		//3. New User Address
		WebElement newUserAddress = driver.findElement(By.xpath(regNewUserAddLocator));

		//Verify address is displayed or not
		if(newUserAddress.isDisplayed()) {
			System.out.println("New User address is displayed");
		}
		else
		{
			System.out.println("New User address is not displayed");
		}

		//Verify address is enabled or not
		if(newUserAddress.isEnabled()) {
			System.out.println("New User address is enabled");

			//Enter the values
			newUserAddress.sendKeys(regNewUserAddValue);
			System.out.println("New User address entered is " + regNewUserAddValue);
		}
		else
		{
			System.out.println("New User address is not enabled");		
		}

		//4. New User City
		WebElement newUserCityName = driver.findElement(By.xpath(regNewUserCityLocator));

		//Verify address is displayed or not
		if(newUserCityName.isDisplayed()) {
			System.out.println("New User city is displayed");
		}
		else
		{
			System.out.println("New User city is not displayed");
		}

		//Verify address is enabled or not
		if(newUserCityName.isEnabled()) {
			System.out.println("New User city is enabled");

			//Enter the values
			newUserCityName.sendKeys(regNewUserCityValue);
			System.out.println("New User city entered is " + regNewUserCityValue);
		}
		else
		{
			System.out.println("New User city is not enabled");		
		}

		//5. New User State
		WebElement newUserStateName = driver.findElement(By.xpath(regNewUserStateLocator));

		//Verify address is displayed or not
		if(newUserStateName.isDisplayed()) {
			System.out.println("New User state is displayed");
		}
		else
		{
			System.out.println("New User state is not displayed");
		}

		//Verify address is enabled or not
		if(newUserStateName.isEnabled()) {
			System.out.println("New User state is enabled");

			//Enter the values
			newUserStateName.sendKeys(regNewUserStateValue);
			System.out.println("New User state entered is " + regNewUserStateValue);
		}
		else
		{
			System.out.println("New User state is not enabled");		
		}

		//6. New User zip Code
		WebElement newUserZipcode = driver.findElement(By.xpath(regNewUserZipLocator));

		//Verify address is displayed or not
		if(newUserZipcode.isDisplayed()) {
			System.out.println("New User zipcode is displayed");
		}
		else
		{
			System.out.println("New User zipcode is not displayed");
		}

		//Verify address is enabled or not
		if(newUserZipcode.isEnabled()) {
			System.out.println("New User zipcode is enabled");

			//Enter the values
			newUserZipcode.sendKeys(regNewUserZipValue);
			System.out.println("New User zipcode entered is " + regNewUserZipValue);
		}
		else
		{
			System.out.println("New user zipcode is not enabled");		
		}
		
		//7. New User Phone number
		WebElement newUserPhoneNum = driver.findElement(By.xpath(regNewUserPhoneNumLocator));
		

		//Verify new user phone numnber is displayed or not
		if(newUserPhoneNum.isDisplayed()) {
			System.out.println("New user phone number is displayed");
		}
		else
		{
			System.out.println("New user phone number is not displayed");
		}

		//Verify new user phone numnber is enabled or not
		if(newUserPhoneNum.isEnabled()) {
			System.out.println("New user phone number is enabled");

			//Enter the values
			newUserPhoneNum.sendKeys(regNewUserPhoneNumValue);
			System.out.println("New user phone number is " + regNewUserPhoneNumValue);
		}
		else
		{
			System.out.println("New user phone number is not enabled");		
		}
		
		//8. New User SSN
		WebElement newUserSsnNum = driver.findElement(By.xpath(regNewUserSsnLocator));
		

		//Verify new user ssn numnber is displayed or not
		if(newUserSsnNum.isDisplayed()) {
			System.out.println("New user ssn number is displayed");
		}
		else
		{
			System.out.println("New user ssn number is not displayed");
		}

		//Verify new user ssn numnber is enabled or not
		if(newUserSsnNum.isEnabled()) {
			System.out.println("New user ssn number is enabled");

			//Enter the values
			newUserSsnNum.sendKeys(regNewUserSsnValue);
			System.out.println("New user ssn number is " + regNewUserSsnValue);
		}
		else
		{
			System.out.println("New user ssn number is not enabled");		
		}


		//9. New User = UserName
		WebElement newUserName= driver.findElement(By.xpath(regNewUserNameLocator));
		

		//Verify new user name is displayed or not
		if(newUserName.isDisplayed()) {
			System.out.println("New user name is displayed");
		}
		else
		{
			System.out.println("New user name is not displayed");
		}

		//Verify new user name is enabled or not
		if(newUserName.isEnabled()) {
			System.out.println("New user name is enabled");

			//Enter the values
			newUserName.sendKeys(regNewUserNameValue);
			System.out.println("New user name is " + regNewUserNameValue);
		}
		else
		{
			System.out.println("New user name is not enabled");		
		}
		
		//10. New user password
		WebElement newUserPassword= driver.findElement(By.xpath(regNewUserPasswordLocator));
		

		//Verify new user password is displayed or not
		if(newUserPassword.isDisplayed()) {
			System.out.println("New user password is displayed");
		}
		else
		{
			System.out.println("New user password is not displayed");
		}

		//Verify new user password is enabled or not
		if(newUserPassword.isEnabled()) {
			System.out.println("New user password is enabled");

			//Enter the values
			newUserPassword.sendKeys(regNewUserPasswordValue);
			System.out.println("New user password is " + regNewUserPasswordValue);
		}
		else
		{
			System.out.println("New user password is not enabled");		
		}
		
		//11. New User confirm Password
		//	//Negative Scenario
		//Enter different confirm pass word
		WebElement newUserConfirmPassword= driver.findElement(By.xpath(regNewUserPasswordConfirmLocator));
		

		//Verify new user confirm password is displayed or not
		if(newUserConfirmPassword.isDisplayed()) {
			System.out.println("New user confirm password is displayed");
		}
		else
		{
			System.out.println("New user confirm password is not displayed");
		}

		//Verify new user confirm password is enabled or not
		if(newUserConfirmPassword.isEnabled()) {
			System.out.println("New user confirm password is enabled");

			//Enter the values
			newUserConfirmPassword.sendKeys(regNewUserPasswordConfirmValue);
			System.out.println("New user confirm password is " + regNewUserPasswordConfirmValue);
		}
		else
		{
			System.out.println("New user confirm password is not enabled");		
		}

		//12. Enter Register button for new user
		WebElement registerBtn = driver.findElement(By.xpath(registerBtnLocator));

		//Verify if New user Register button is displayed or not
		if(registerBtn.isDisplayed()) {
			System.out.println("New User Register button is displayed");
		}
		else
		{
			System.out.println("New User Register button is not displayed");
		}

		//Verify is New user Register button is enabled or not
		if(registerBtn.isEnabled()) {
			System.out.println("New User Register button is enabled");
		}
		else
		{
			System.out.println("New User Register button is not enabled");
		}

		//Verify if Register button is selected or not
		if(registerBtn.isSelected()) {
			System.out.println("New User Register button is selected");
		}
		else
		{
			System.out.println("New User Register button is not selected");

			//Click on the Register button
			registerBtn.click();
			System.out.println("New User Register button is selected");
		}

		//13. Capture the error message
		WebElement newUserRegisterErrorMsg = driver.findElement(By.xpath(registerNewUserErrorLocator));
		
		//Verify new user register error message is displayed or not
		if(newUserRegisterErrorMsg.isDisplayed()) {
			System.out.println("New user register error message is displayed");
		}
		else
		{
			System.out.println("New user register error message is not displayed");
		}
	
		//Verify new user register error messge is enabled or not
		if(newUserRegisterErrorMsg.isEnabled()) {
			System.out.println("New user register error message is enabled");
			
			//Capture the error message
			System.out.println("The new user registered error message is " + newUserRegisterErrorMsg.getText());
		}
		else
		{
			System.out.println("New user register error message is not displayed");
		}

		//Close the Application
		driver.close();
		System.out.println("Application is closed");
	
	}

}
