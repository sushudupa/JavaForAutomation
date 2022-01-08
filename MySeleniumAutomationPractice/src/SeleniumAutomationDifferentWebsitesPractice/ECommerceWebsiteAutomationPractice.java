package SeleniumAutomationDifferentWebsitesPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ECommerceWebsiteAutomationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Parameterized all Input Values

		String emailIDValue = "customerlady4@gmail.com";
		String customerFirstNameValue = "Shaila"; 
		String customerLastNameValue = "Sharma";
		String passwordValue = "sharma"; 
		String dayDrpDwnValue = "2";
		String monthDrpDwnValue = "August";
		String yearDrpDwnValue = "1977";	
		String companyNameValue = "Siri Technology";
		String streetAddressValue = "Orchid Lane";
		String addressTwoValue = "2B";
		String cityValue = "Franklin Park";
		String stateNameValue = "New Jersey";
		String zipcodeValue = "34545";
		String countryValue = "United States";
		String enterYourQueryValue = "Drop it off at the door";
		String homeNoValue = "9976554345";
		String mobileNoValue = "8898776545";
		String aliasValue =  "Franklin Park";
		String successfulUserCreatedText = "Welcome to your account. Here you can manage all of your personal information and orders.";

		//Parameterized all the Webelement Value


		String emailIDLocator = "//*[@id='email_create']";
		String createAccBtnLocator = "//button[@id='SubmitCreate']";
		String mrsRadBtnLocator ="//label[normalize-space()='Mrs.']";
		String customerFirstNameLocator = "//*[@name='customer_firstname']";
		String customerLastNameLocator = "//*[@name='customer_lastname']";
		String passwordLocator = "//input[@type='password']";
		String dayDrpDwnLocator = "//*[@id='days']";
		String monthDrpDwnLocator = "//*[@id='months']";
		String yearDrpDwnLocator = "//*[@id='years']";
		String newsLetterLocator = "//input[@id='newsletter']";	
		String companyNameLocator = "//*[@id='company']";
		String streetAddressLocator = "//input[@id='address1']";
		String addressTwoLocator = "//input[@id='address2']";
		String cityLocator = "//input[@id='city']";
		String stateLocator = "//*[@id='id_state']";
		String zipcodeLocator = "//*[@id='postcode']";
		String countryLocator = "//*[@name='id_country']";
		String enterYourQueryLocator = "//*[@name='other']";
		String homeNoLocator = "//*[@name='phone']";
		String mobileNoLocator = "//*[@name='phone_mobile']";
		String aliasLocator = "//*[@id='alias']";
		String submitBtnLocator = "//button[@id='submitAccount']";
		String successfulUserCreatedLocator = "//*[@class='info-account']";


		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		String url = "http://automationpractice.com/index.php";

		//Launch the Application
		driver.get(url);
		System.out.println("Application is launched");

		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Step 1: Creating the account
		//Click on Sign In link
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("Sign In link is clicked");

		//Enter the email id
		WebElement customerEmailID = driver.findElement(By.xpath(emailIDLocator));

		//Verify the email id is displayed or not
		if(customerEmailID.isDisplayed()) {
			System.out.println("Customer email id is displayed");
		}
		else
		{
			System.out.println("Customer email id is not displayed");
		}

		//Verify the email id is enabled or not
		if(customerEmailID.isEnabled()) {
			System.out.println("Customer email id is enabled");

			//enter the email id
			customerEmailID.sendKeys(emailIDValue);
			System.out.println("Customer login email id is " + emailIDValue);	
		}
		else
		{
			System.out.println("Customer email id is not enabled");
		}

		//Click on create account button locator
		WebElement createAccBtn = driver.findElement(By.xpath(createAccBtnLocator));

		//Verify the account button is displayed or not
		if(createAccBtn.isDisplayed()) {
			System.out.println("Create Account button is displayed");
		}
		else
		{
			System.out.println("Create Account Button is not displayed");
		}

		//Verify the account button is enabled or not
		if(createAccBtn.isEnabled()) {
			System.out.println("Create Account button is enabled");
		}
		else
		{
			System.out.println("Create Account button is not enabled");
		}

		//Verify the account button is selected or not
		if(createAccBtn.isSelected()) {
			System.out.println("Create Account button is selected");
		}
		else
		{
			System.out.println("Create Account button is not selected");

			//Select the submit button
			createAccBtn.submit();
			System.out.println("Create Account button is selected");
		}
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		//Step 2: Enter the value after creating the account
		
		//Title
		WebElement titleButton = driver.findElement(By.xpath(mrsRadBtnLocator));

		//Verify if title button is displayed or not
		if(titleButton.isDisplayed()) {
			System.out.println("Title button is displayed");
		}
		else
		{
			System.out.println("Title button is not displayed");
		}

		//Verify if title button is enabled or not
		if(titleButton.isEnabled()) {
			System.out.println("Title button is enabled");
		}
		else
		{
			System.out.println("Title button is not enabled");
		}

		//Verify if title button is selected or not
		if(titleButton.isSelected()) {
			System.out.println("Title button is selected");
		}
		else
		{
			System.out.println("Title button is not selected");

			//Click on the title button
			titleButton.click();
			System.out.println("Title button is selected");
		}


		//First Name
		WebElement customerFirstName = driver.findElement(By.xpath(customerFirstNameLocator));

		if(customerFirstName.isDisplayed()) {
			System.out.println("First Name is Displayed");
		}
		else {
			System.out.println("First name is not Displayed");
		}
		//Verify the First Name is Enabled or Not
		if(customerFirstName.isEnabled()) {
			System.out.println("First Name is Enabled");

			//Enter the First Name
			customerFirstName.sendKeys(customerFirstNameValue);
			System.out.println("The present First Name Value is :" + customerFirstNameValue);
		}
		else {
			System.out.println("First Name is not Enabled");
		}

		//Last Name
		WebElement customerLastName = driver.findElement(By.xpath(customerLastNameLocator));
		//Verify the Last Name is Displayed or not
		if(customerLastName.isDisplayed()) {
			System.out.println("Last Name is Displayed");
		}
		else {
			System.out.println("Last Name is not Displayed");
		}
		//Verify is Last Name is Enabled or Not
		if(customerLastName.isEnabled()) {
			System.out.println("Last Name is Enabled");

			//Enter the Last NAme
			customerLastName.sendKeys(customerLastNameValue);
			System.out.println("The present Last Name Value is :" + customerLastNameValue);
		}	
		else {
			System.out.println("Last Name is not Enabled");
		}
		
		//PassWord
		WebElement password = driver.findElement(By.xpath(passwordLocator));
		
		//Verify if password is displayed or not
		if(password.isDisplayed()) {
			System.out.println("Password is displayed");
		}
		else
		{
			System.out.println("Password is not displayed");
		}
		
		//Verify if password is enabled or not
		if(password.isEnabled()) {
			System.out.println("Password is enabled");
			
			//Enter the password
			password.sendKeys(passwordValue);
			System.out.println("The password value is " + passwordValue);
		}
		
		//Date of Birth
		
		//Day value
		WebElement day = driver.findElement(By.xpath(dayDrpDwnLocator));
		
		//Verify day is displayed or not
		if(day.isDisplayed()) {
			System.out.println("Day drop down is displayed");
		}
		else
		{
			System.out.println("Day drop down is not displayed");
		}
		
		//Verify day is enabled or not
		if(day.isEnabled()) {
			System.out.println("Day drop down is enabled");
			
			//Select the day
			day.sendKeys(dayDrpDwnValue);
			System.out.println("Day drop drop is " + dayDrpDwnValue);		
		}
		else
		{
			System.out.println("Day drop down is not enabled");
		}
		
		//Month
		WebElement month = driver.findElement(By.xpath(monthDrpDwnLocator));
		
		//Verify day is displayed or not
		if(month.isDisplayed()) {
			System.out.println("Month drop down is displayed");
		}
		else
		{
			System.out.println("Month drop down is not displayed");
		}
		
		//Verify day is enabled or not
		if(month.isEnabled()) {
			System.out.println("Month drop down is enabled");
			
			//Select the day
			month.sendKeys(monthDrpDwnValue);
			System.out.println("Month drop drop is " + monthDrpDwnValue);		
		}
		else
		{
			System.out.println("Month drop down is not enabled");
		}
		
		//Year
		WebElement year = driver.findElement(By.xpath(yearDrpDwnLocator));
		
		//Verify day is displayed or not
		if(year.isDisplayed()) {
			System.out.println("Year drop down is displayed");
		}
		else
		{
			System.out.println("Year drop down is not displayed");
		}
		
		//Verify day is enabled or not
		if(year.isEnabled()) {
			System.out.println("Year drop down is enabled");
			
			//Select the day
			year.sendKeys(yearDrpDwnValue);
			System.out.println("Year drop drop is " + yearDrpDwnValue);		
		}
		else
		{
			System.out.println("Year drop down is not enabled");
		}


		//Newsletter
		
		WebElement newsLetter = driver.findElement(By.xpath(newsLetterLocator));
		
		//Verify if news letter check box is displayed or not
		if(newsLetter.isDisplayed()) {
			System.out.println("News letter check box is displayed");
		}
		else
		{
			System.out.println("News letter check box is not displayed");
		}

		//Verify if news letter check box is enabled or not
		if(newsLetter.isEnabled()) {
			System.out.println("News letter check box is enabled");
		}
		else
		{
			System.out.println("New letter check box is not enabled");
		}

		//Verify if news letter check box is selected or not
		if(newsLetter.isSelected()) {
			System.out.println("News letter check box is selected");
		}
		else
		{
			System.out.println("News letter check box is not selected");
			
			//Select the check box
			newsLetter.click();
			System.out.println("News letter check box is selected");
		}

		//Company Name
		
		WebElement companyName = driver.findElement(By.xpath(companyNameLocator));
		
		//Verify if company name is displayed or not
		if(companyName.isDisplayed()) {
			System.out.println("Company name is dispalyed");
		}
		else
		{
			System.out.println("Company name is not displayed");
		}

		//Verify if company name is enabled or not
		if(companyName.isEnabled()) {
			System.out.println("Company name is enabled");
			
			//Enter the company value
			companyName.sendKeys(companyNameValue);
			System.out.println("The name of the company is " + companyNameValue);
		}
		else
		{
			System.out.println("Company name is not enabled");
		}
		
		//Street Address
		WebElement streetAdd = driver.findElement(By.xpath(streetAddressLocator));
		
		//Verify street address is displayed or not
		if(streetAdd.isDisplayed()) {
			System.out.println("Street address is displayed");
		}
		else
		{
			System.out.println("Street address is not displayed");
		}

		//Verify street address is enabled or not
		if(streetAdd.isEnabled()) {
			System.out.println("Street address is enabled");
			
			//Enter the values for street address
			streetAdd.sendKeys(streetAddressValue);
			System.out.println("The name of the street is " + streetAddressValue);	
		}
		else
		{
			System.out.println("Street address is not enabled");
		}
		
		//Address two 
		WebElement addressTwo = driver.findElement(By.xpath(addressTwoLocator));
		
		//Verify if address two is displayed or not
		if(addressTwo.isDisplayed()) {
			System.out.println("Address two is displayed");
		}
		else
		{
			System.out.println("Address two is not displayed");
		}

		//Verify if address two is enabled or not
		if(addressTwo.isEnabled()) {
			System.out.println("Address two is enabled");
			
			//Enter the value for address two
			addressTwo.sendKeys(addressTwoValue);
			System.out.println("The address two is " + addressTwoValue);
		}
		else
		{
			System.out.println("Address two is not enabled");
		}

		//City
		
		WebElement cityName = driver.findElement(By.xpath(cityLocator));
		
		//Verify if city name is displayed or not
		if(cityName.isDisplayed()) {
			System.out.println("City name is displayed");
		}
		else
		{
			System.out.println("City name is not displayed");
		}

		//Verify if city name is enabled or not
		if(cityName.isEnabled()) {
			System.out.println("City name is enabled");
			
			//Send the values to the city name
			cityName.sendKeys(cityValue);
			System.out.println("The name of the city is " + cityValue);
		}
		else
		{
			System.out.println("City name is not enabled");
		}

		//State Name
		WebElement stateName = driver.findElement(By.xpath(stateLocator));
		//Verify the State Name is Displayed or Not
		if(stateName.isDisplayed()) {
			System.out.println("State Name is Displayed");
		}
		else {
			System.out.println("State Name is not Displayed");
		}
		//Verify the State Name is Enabled or Not
		if(stateName.isEnabled()) {
			System.out.println("State Name is Enabled");

			//Enter the State Name
			stateName.sendKeys(stateNameValue);
			System.out.println("Present State Name is :" + stateNameValue);
		}
		else {
			System.out.println("State Name is not Enabled");
		}

		//Zip Code
		
		WebElement zipCode = driver.findElement(By.xpath(zipcodeLocator));
		
		//Verify the zip Code is Displayed or Not
		if(zipCode.isDisplayed()) {
			System.out.println("Zip Code is Displayed");
		}
		else {
			System.out.println("Zip Code is Not Displayed");
		}
		//Verify the Zip Code is Enabled or Not
		if(zipCode.isEnabled()) {
			System.out.println("Zip Code is Enabled");

			//Enter the zip Code
			zipCode.sendKeys(zipcodeValue);
			System.out.println("Present Zip Code is : " + zipcodeValue);
		}
		else {
			System.out.println("Zip Code is not Enabled");
		}
		
		//Country
		
		WebElement country = driver.findElement(By.xpath(countryLocator));
		
		//Verify the zip Code is Displayed or Not
		if(country.isDisplayed()) {
			System.out.println("Country is Displayed");
		}
		else {
			System.out.println("Country is Not Displayed");
		}
		//Verify the Zip Code is Enabled or Not
		if(country.isEnabled()) {
			System.out.println("Country is Enabled");

			//Enter the zip Code
			country.sendKeys(countryValue);
			System.out.println("Country is : " + countryValue);
		}
		else {
			System.out.println("Country is not Enabled");
		}
		

		//Additional information
		WebElement additionalInfo = driver.findElement(By.xpath(enterYourQueryLocator));
		
		//Verify if additional information is displayed or not
		if(additionalInfo.isDisplayed()) {
			System.out.println("Additional information is displayed");
		}
		else
		{
			System.out.println("Additional information is not displayed");
		}

		//Verify if additional information is enabled
		if(additionalInfo.isEnabled()) {
			System.out.println("Additional information is enabled");
			
			//Enter the information
			additionalInfo.sendKeys(enterYourQueryValue);
			System.out.println("The additional information is " + enterYourQueryValue);
		}
		else
		{
			System.out.println("Additional information is not enabled");
		}

		//Home Phone
		WebElement homeNum = driver.findElement(By.xpath(homeNoLocator));
		
		//Verify home phone number is displayed or not
		if(homeNum.isDisplayed()) {
			System.out.println("Home phone number is displayed");
		}
		else
		{
			System.out.println("Home phone number is not displayed");
		}

		//Verify home phone number is enabled or not
		if(homeNum.isEnabled()) {
			System.out.println("Home phone number is enabled");
			
			//Enter the value of home phone number
			homeNum.sendKeys(homeNoValue);
			System.out.println("Home phone number is " + homeNoValue);
		}


		//Mobile Number
		WebElement mobNum = driver.findElement(By.xpath(mobileNoLocator));
		
		//Verify if mobile number is displayed or not
		if(mobNum.isDisplayed()) {
			System.out.println("Mobile number is displayed");
		}
		else
		{
			System.out.println("Mobile number is not displayed");
		}

		//Verify if mobile number is enabled or not
		if(mobNum.isEnabled()) {
			System.out.println("Mobile number is enabled");
			
			//Enter the mobile number value
			mobNum.sendKeys(mobileNoValue);
			System.out.println("Mobile number is " + mobileNoValue);
		}

		//Address Alias
		
		WebElement aliasAddress = driver.findElement(By.xpath(aliasLocator));
		
		//Verify if alias address is displayed or not
		if(aliasAddress.isDisplayed()) {
			System.out.println("Alias address is displayed");
		}
		else
		{
			System.out.println("Alias address is not displayed");
		}

		//Verify if alias address is enabled or not
		if(aliasAddress.isEnabled()) {
			System.out.println("Alias address is enabled");
			
			//Enter the value for the alias address
			aliasAddress.sendKeys(aliasValue);
			System.out.println("Alias address is " + aliasValue);
		}
		else
		{
			System.out.println("Alias address is not enabled");
		}
		
		//Register
		
		WebElement register = driver.findElement(By.xpath(submitBtnLocator));
		
		//Verify if register button is displayed or not
		if(register.isDisplayed()) {
			System.out.println("Register button is displayed");
		}
		else
		{
			System.out.println("Register button is not displayed");
		}

		//Verify if register button is enabled or not
		if(register.isEnabled()) {
			System.out.println("Register button is enabled");
		}
		else
		{
			System.out.println("Register button is not enabled");
		}

		//Verify if register button is selected or not
		if(register.isSelected()) {
			System.out.println("Register button is selected");
		}
		else
		{
			System.out.println("Register button is not selected");
			
			//Click on the register button
			register.click();
			System.out.println("Register button is selected");
		}

		//Retrieving the successful message after creating the account
		WebElement successfulUser = driver.findElement(By.xpath(successfulUserCreatedLocator));
		
		//Verify message is displayed or not
		if(successfulUser.isDisplayed()) {
			System.out.println("Successful Message is displayed");
		}
		else
		{
			System.out.println("Successful message is not displayed");
		}

		//Verify message is enabled or not
		if(successfulUser.isEnabled()) {
			System.out.println("Successful Message is enabled");
		}
		else
		{
			System.out.println("Successful message is not enabled");
		}

		//Validating the user created succesfully
		String actSuccessfulUser = successfulUser.getText();
		String expSuccessfulUser = successfulUserCreatedText;
		
		if(actSuccessfulUser.equals(expSuccessfulUser)) {
			System.out.println("Both the actual and expected successful user are same");
			System.out.println("The actual successful user validated message is " + actSuccessfulUser);
		}
		else
		{
			System.out.println("Both the actual and expected successful user are not same");
			System.out.println("Actual user is "+ actSuccessfulUser);
			System.out.println("Expected user is " + expSuccessfulUser);
		}
		
		//close the application
		driver.close();
		System.out.println("Application is closed");

	}

}
