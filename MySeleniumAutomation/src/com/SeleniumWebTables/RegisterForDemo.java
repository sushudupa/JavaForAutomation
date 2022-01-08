package com.SeleniumWebTables;

/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Handling Register For Demo
 * Date - 10/20/2021
 *==================================================================*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Parameterized all Input Values
		String URL = "https://nxtgenaiacademy.com";
		String regForm = "Registration Form";
		String regForDemo = "Register For Demo";
		String firstNameValue = "Prasad";
		String lastNameValue = "Udupa";
		String streetAddressValue = "Chessridge Way";
		String apartmentValue = "1000";
		String cityNameValue = "Morrisville";
		String stateNameValue = "North Carolina";
		String postalCodeValue = "27560";
		String emailIDValue = "prasad_udupa@yahoo.com";
		String countryDrpDwnValue = "United States of America";
		String dateOfDemoValue = "10/20/2021";
		String hourValue = "10";
		String minuteValue = "30";
		String amPmValue = "AM";
		String mobileNumberValue = "7325958413";
		String enterYourQueryValue = "How many days online training?";
		String successfulMessageText = "Registration Form is Successfully Submitted. The Transaction ID : NXTGEN1937465";


		//Parameterized all the Webelement Value

		String qaAutomationLocator =  "//span[normalize-space()='QA Automation']";
		String practiceAutomationLocator = "//span[normalize-space()='Practice Automation']";
		String regTitleTextLocator = "//h3[normalize-space()='Register For Demo']";
		String firstNameLocator = "//input[@id='vfb-5']";
		String lastNameLocator = "//input[@id='vfb-7']";
		String maleRadBtnLocator = "//input[@id='vfb-8-1']";
		String stAddressNameLocator = "//input[@id = 'vfb-13-address']";
		String apartmentLocator = "//input[@id = 'vfb-13-address-2']";
		String cityLocator = "//input[@id = 'vfb-13-city']";
		String stateLocator = "//input[@id='vfb-13-state']";
		String postalCodeLocator = "//input[@id='vfb-13-zip']";
		String emailIDLocator = "//input[@id='vfb-14']";
		String countryDrpDwnLocator = "//select[@id='vfb-13-country']";
		String dateOfDemoLocator = "//input[@id='vfb-18']";
		String hourLocator = "//select[@id='vfb-16-hour']";
		String minuteLocator = "//select[@id='vfb-16-min']";
		String amPmLocator = "//select[@id='vfb-16-ampm']";
		String mobileNoLocator = "//input[@id='vfb-19']";
		String seleniumWebDriverLocator = "//input[@id='vfb-20-0']";
		String functionalTestingLocator = "//input[@id='vfb-20-4']";
		String enterYourQueryLocator = "//textarea[@id='vfb-23']";
		String enterTwoDigitsLocator = "//input[@id='vfb-3']";
		String submitButtonLocator = "//input[@id='vfb-4']";
		String successfulMsgTextLocator = "//div[@class='elementor-shortcode']";






		//Set the System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");


		//Create the object instance
		WebDriver myDriverInstance = new ChromeDriver();

		//Setp 2 - "https://nxtgenaiacademy.com";

		//Launch the URL
		myDriverInstance.get(URL);
		System.out.println("Application is Launched");

		//Maximize the Application
		myDriverInstance.manage().window().maximize();
		System.out.println("Application is maximized");


		//Step 3 - Mouse Hover Action
		//Create an instance in Action Class by passing WebDriver Instance
		Actions action = new Actions(myDriverInstance);

		//Click on QA Automation 
		WebElement qaAutomation = myDriverInstance.findElement(By.xpath(qaAutomationLocator));

		//Move the mouse above the QA Automation
		action.moveToElement(qaAutomation).perform();

		//Click on Practice Automation
		WebElement pracAutomation = myDriverInstance.findElement(By.xpath(practiceAutomationLocator));

		//Move the mouse above the Practice Automation
		action.moveToElement(pracAutomation).perform();

		//Click on Demo-Site Registration Form
		myDriverInstance.findElement(By.partialLinkText(regForm)).click();
		System.out.println("Register for Demo link is clicked");

		//Step 4 = Validate the Title of Form is displayed as "Register For Demo"
		WebElement regTitleText = myDriverInstance.findElement(By.xpath(regTitleTextLocator));
		//Verify Registered Title is Displayed or not
		if(regTitleText.isDisplayed()) {
			System.out.println("Register Title is Displayed");
		}
		else 
		{
			System.out.println("Register Title is not Displayed");
		}

		//Verify Registered Title is Enabled or not
		if(regTitleText.isEnabled()) {
			System.out.println("Register Title is Enabled");
		}
		else {
			System.out.println("Register Title is not Enabled");
		}
		//Validating the text
		String actRegTitleText = regTitleText.getText();
		String expRegTitleText = regForDemo;

		if(actRegTitleText.equals(expRegTitleText)) {
			System.out.println("The Register Title Text is : " + actRegTitleText);
		} 
		else 
		{
			System.out.println("Actual and Expected Register Title Text are not same");
			System.out.println("The Actual Title Text is :" + actRegTitleText);
			System.out.println("The Expected Title Text is : " + expRegTitleText);
		}

		//Step 5 - Fill the registration form by entering all the fields

		//First Name
		WebElement firstName = myDriverInstance.findElement(By.xpath(firstNameLocator));
		
		if(firstName.isDisplayed()) {
			System.out.println("First Name is Displayed");
		}
		else {
			System.out.println("First name is not Displayed");
		}
		//Verify the First Name is Enabled or Not
		if(firstName.isEnabled()) {
			System.out.println("First Name is Enabled");

			//Enter the First Name
			firstName.sendKeys(firstNameValue);
			System.out.println("The present First Name Value is :" + firstNameValue);
		}
		else {
			System.out.println("First Name is not Enabled");
		}

		//Last Name
		WebElement lastName = myDriverInstance.findElement(By.xpath(lastNameLocator));
		//Verify the Last Name is Displayed or not
		if(lastName.isDisplayed()) {
			System.out.println("Last Name is Displayed");
		}
		else {
			System.out.println("Last Name is not Displayed");
		}
		//Verify is Last Name is Enabled or Not
		if(lastName.isEnabled()) {
			System.out.println("Last Name is Enabled");

			//Enter the Last NAme
			lastName.sendKeys(lastNameValue);
			System.out.println("The present Last Name Value is :" + lastNameValue);
		}	
		else {
			System.out.println("Last Name is not Enabled");
		}

		//Gender - Male Button
		WebElement maleRadioBtn = myDriverInstance.findElement(By.xpath(maleRadBtnLocator));
		//Verify the Male Radio Button is Displayed or not
		if(maleRadioBtn.isDisplayed()) {
			System.out.println("Verified Male Radio Button is Displayed");
		}
		else {
			System.out.println("Verified Male Radio Button is not Displayed");
		}
		//Verify the Male Radio Button is Enabled or Not
		if(maleRadioBtn.isEnabled()) {
			System.out.println("Verified Male Radio Button is Enabled");
		}
		else {
			System.out.println("Verified Male Radio Button is not Enabled");
		}
		//Verify the Male Radio Button is Selected or Not
		if(maleRadioBtn.isSelected()) {
			System.out.println("Verified Male Radio Button is Selected");
		}
		else {
			System.out.println("Verified Male Radio Button is not Selected");
			//Click on Male Radio Button
			maleRadioBtn.click();
			System.out.println("Verified Male Radio Button is Selected");
		}

		//Address
		//Street Address
		WebElement stAddress = myDriverInstance.findElement(By.xpath(stAddressNameLocator));
		//Verify the Street Address is Displayed or Not
		if(stAddress.isDisplayed()) {
			System.out.println("Street Address is Displayed");
		}
		else {
			System.out.println("Street Address is not Displayed");
		}
		//Verify the Street Address is Enabled or Not
		if(stAddress.isEnabled()) {
			System.out.println("Street Address is Enabled");

			//Enter the Street Address
			stAddress.sendKeys(streetAddressValue);
			System.out.println("Present Street Address is :" + streetAddressValue);
		}
		else {
			System.out.println("Street Address is not Enabled");
		}

		//Address 2
		//Apartment Number
		WebElement apartmentNo = myDriverInstance.findElement(By.xpath(apartmentLocator));
		//Verify the Apartment Number is Displayed or Not
		if(apartmentNo.isDisplayed()) {
			System.out.println("Apartment Number is Displayed");
		}
		else {
			System.out.println("Apartment Number is not Displayed");
		}
		//Verify the Apartment Number is Enabled or Not
		if(apartmentNo.isEnabled()) {
			System.out.println("Apartment Number is Enabled");

			//Enter the Apartment Number
			apartmentNo.sendKeys(apartmentValue);
			System.out.println("Present Apartment Number is :" + apartmentValue);
		}
		else {
			System.out.println("Apartment Number is not Enabled");
		}

		//City
		WebElement cityName = myDriverInstance.findElement(By.xpath(cityLocator));
		//Verify the City Name is Displayed or Not
		if(cityName.isDisplayed()) {
			System.out.println("City Name is Displayed");
		}
		else {
			System.out.println("City Name is not Displayed");
		}
		//Verify the City Name is Enabled or Not
		if(cityName.isEnabled()) {
			System.out.println("City Name is Enabled");

			//Enter the City Name
			cityName.sendKeys(cityNameValue);
			System.out.println("Present City Name is :" + cityNameValue);
		}
		else {
			System.out.println("City Name is not Displayed");
		}

		//State
		WebElement stateName = myDriverInstance.findElement(By.xpath(stateLocator));
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

		//Postal/Zip Code
		WebElement postalCode = myDriverInstance.findElement(By.xpath(postalCodeLocator));
		//Verify the Postal Code is Displayed or Not
		if(postalCode.isDisplayed()) {
			System.out.println("Postal Code is Displayed");
		}
		else {
			System.out.println("Postal Code is Not Displayed");
		}
		//Verify the Postal Code is Enabled or Not
		if(postalCode.isEnabled()) {
			System.out.println("Postal Code is Enabled");

			//Enter the Postal Code
			postalCode.sendKeys(postalCodeValue);
			System.out.println("Present Postal Code is : " + postalCodeValue);
		}
		else {
			System.out.println("Postal Code is not Enabled");
		}

		//Email ID
		WebElement emailID = myDriverInstance.findElement(By.xpath(emailIDLocator));
		//Verify the Email Id is Displayed or Not
		if(emailID.isDisplayed()) {
			System.out.println("Email ID is Displayed");
		}
		else {
			System.out.println("Email ID is not Displayed");
		}
		//Verify the Email ID is Enabled or Not
		if(emailID.isEnabled()) {
			System.out.println("Email ID is Enabled");

			//Enter the Email ID
			emailID.sendKeys(emailIDValue);
			System.out.println("Present Email ID is :" + emailIDValue);
		}
		else {
			System.out.println("Email ID is not Enabled");
		}

		//Country 
		WebElement countryDropDown = myDriverInstance.findElement(By.xpath(countryDrpDwnLocator));
		//Verify Country Drop Down is Displayed or Not
		if(countryDropDown.isDisplayed()) {
			System.out.println("Country Drop Down is Displayed");
		}
		else {
			System.out.println("Country Drop Down is not Displayed");
		}
		//Verify Country Drop Down is Enabled or Not
		if(countryDropDown.isEnabled()) {
			System.out.println("Country Drop Down is Enabled");
		}
		else {
			System.out.println("Country Drop Down is not Enabled");
		}

		//To Select the item from Country Drop Down, create the Select Object
		Select countryDrpDwn = new Select(countryDropDown);
		//Select Using Visible Text
		countryDrpDwn.selectByVisibleText(countryDrpDwnValue);
		System.out.println("Present Country Drop Down Value is : " + countryDrpDwnValue);

		//Date of Demo
		WebElement dateOfDemo = myDriverInstance.findElement(By.xpath(dateOfDemoLocator));
		//Verify Date of Demo is Displayed or Not
		if(dateOfDemo.isDisplayed()) {
			System.out.println("Date Of Demo is Displayed");
		}
		else {
			System.out.println("Date of Demo is not Displayed");
		}
		//Verify Date Of Demo is Enabled or Not
		if(dateOfDemo.isEnabled()) {
			System.out.println("Date Of Demo is Enabled");

			//Enter the Date Of Demo
			dateOfDemo.sendKeys(dateOfDemoValue);
			System.out.println("Present Date Of Demo is :" + dateOfDemoValue);
		}
		else {
			System.out.println("Date Of Demo is not Enabled");
		}

		//Convenient Time
		//Hour Drop Down
		WebElement hourDropDown = myDriverInstance.findElement(By.xpath(hourLocator));
		//Verify Hour Drop Down is Displayed or Not
		if(hourDropDown.isDisplayed()) {
			System.out.println("Hour Drop Down is Displayed");
		}
		else {
			System.out.println("Hour Drop Down is not Displayed");
		}
		//Verify Hour Drop Down is Enabled or Not
		if(hourDropDown.isEnabled()) {
			System.out.println("Hour Drop Down is Enabled");

			//To Select the item from Convenient Time Hour Drop Down. create the Select Object
			Select hourDrpDwn = new Select(hourDropDown);
			//Using the Visible Text
			hourDrpDwn.selectByVisibleText(hourValue);
			System.out.println("Present Hour Drop Down Value is : " + hourValue);
		}
		else {
			System.out.println("Hour Drop Down is not Enabled");
		}

		//Minute Drop Down
		WebElement minuteDropDown = myDriverInstance.findElement(By.xpath(minuteLocator));
		//Verify Minute Drop Down is Displayed or Not
		if(minuteDropDown.isDisplayed()) {
			System.out.println("Minute Drop Down is Displayed");
		}
		else {
			System.out.println("Minute Drop Down is not Displayed");
		}
		//Verify if Minute Drop Down is Enabled or Not
		if(minuteDropDown.isEnabled()) {
			System.out.println("Minute Drop Down is Enabled");

			//To Select the item from Convenient Time Minute Drop Down. create the Select Object
			Select minuteDrpDwn = new Select(minuteDropDown);
			//Using the Visible Text
			minuteDrpDwn.selectByVisibleText(minuteValue);
			System.out.println("Present Minute Drop Down Value is : " + minuteValue);
		}
		else {
			System.out.println("Minute Drop Down is not Enabled");
		}

		//AM/PM Drop Down
		WebElement amPmDropDown = myDriverInstance.findElement(By.xpath(amPmLocator));
		//Verify AM/PM Drop Down is Displayed or Not
		if(amPmDropDown.isDisplayed()) {
			System.out.println("AM/PM Drop Down is Displayed");
		}
		else {
			System.out.println("AM/PM Drop Down is not Displayed");
		}
		//Verify AM/PM Drop Down is Enabled or Not
		if(amPmDropDown.isEnabled()) {
			System.out.println("AM/PM Drop Down is Enabled");

			//To Select the item from Convenient Time AM/PM Drop Down. create the Select Object
			Select amPmDrpDwn = new Select(amPmDropDown);
			//Using the Visible Text
			amPmDrpDwn.selectByVisibleText(amPmValue);
			System.out.println("Present AM/PM Drop Down is :" + amPmValue);
		}
		else {
			System.out.println("AM/PM Drop Down is not Enabled");
		}

	//Mobile Number
		WebElement mobileNumber = myDriverInstance.findElement(By.xpath(mobileNoLocator));
		//Verify Mobile Number is Displayed or Not
		if(mobileNumber.isDisplayed()) {
			System.out.println("Mobile Number is Displayed");
		}
		else {
			System.out.println("Mobile Number is not Displayed");
		}
  //Verify Mobile Number is Enabled or Not
		if(mobileNumber.isEnabled()) {
			System.out.println("Mobile Number is Enabled");
			
			//Enter the Mobile Number
			mobileNumber.sendKeys(mobileNumberValue);
			System.out.println("Present Mobile Number Value is :" + mobileNumberValue);
			}
		else {
			System.out.println("Mobile Number is not Enabled");
		}
		
		//Step 6 - Course Interested
		
		//Selenium WebDriver Check Box
		WebElement seleniumWebDriverChk = myDriverInstance.findElement(By.xpath(seleniumWebDriverLocator));
		
		//Verify the Selenium WebDriver Check Box is Displayed or not
		if(seleniumWebDriverChk.isDisplayed()) {
			System.out.println("Selenium WebDriver Check Box is Displayed");
		}
		else {
			System.out.println("Selenium WebDriver Check Box is not Displayed");
		}
		
		//Verify the Selenium WebDriver Check Box is Enabled or not
		if(seleniumWebDriverChk.isEnabled()) {
			System.out.println("Selenium WebDriver Check Box is Enabled");
		}
		else {
			System.out.println("Selenium WebDriver Check Box is not Enabled");
		}
		
		//Verify the Selenium WebDriver Check Box is Selected or not
		if(seleniumWebDriverChk.isSelected()) {
			System.out.println("Selenium WebDriver Check Box is Selected");
		}
		else {
			System.out.println("Selenium WebDriver Check Box is not Selected");
			//Click on Selenium Web Driver Check Box
			seleniumWebDriverChk.click();
			System.out.println("Selenium Web Driver Check Box is Checked");
		}
		//Verify Selenium Web Driver Check Box is Selected or not
		if(seleniumWebDriverChk.isSelected()) {
			System.out.println("Verified Selenium WebDriver Check Box is Selected");
		}
		else {
			System.out.println("Verified Selenium WebDriver Check Box is not Selected");
		}
			
		//Functional Testing Check Box
		WebElement functionalTestingChk = myDriverInstance.findElement(By.xpath(functionalTestingLocator));
		//Verify the Functinal Testing Check Box is Displayed or not
		if(functionalTestingChk.isDisplayed()) {
			System.out.println("Functinal Testing Check Box is Displayed");
		}
		else {
			System.out.println("Functinal Testing Check Box is not Displayed");
		}
		
		//Verify the Functinal Testing Check Box is Enabled or not
		if(functionalTestingChk.isEnabled()) {
			System.out.println("Functinal Testing Check Box is Enabled");
		}
		else {
			System.out.println("Functinal Testing Check Box is not Enabled");
		}
		
		//Verify the Functinal Testing Check Box is Selected or not
		if(functionalTestingChk.isSelected()) {
			System.out.println("Functional Testing Check Box is Selected");
		}
		else {
			System.out.println("Functional Testing Check Box is not Selected");
			
			//Click on Functional Testing Check Box
			functionalTestingChk.click();
			System.out.println("Functional Testing Check Box is Selected");
			}
		
		//Verify Functional Testing Check Box is Selected or not
		if(functionalTestingChk.isSelected()) {
			System.out.println("Verified Functional Testing Check Box is Selected");
		}
		else {
			System.out.println("Verified Functional Testing Check Box is not Selected");
		}
		
		//Step 7 - Enter Your Query
	
		WebElement enterYourQuery = myDriverInstance.findElement(By.xpath(enterYourQueryLocator));
		//Verify the Enter Your Query is Displayed or Not
		if(enterYourQuery.isDisplayed()) {
			System.out.println("Enter Your Query is Displayed");
		}
		else {
			System.out.println("Enter Your Query is not Displayed");
		}
		//Verify the Enter Your Query is Enabled or Not
		if(enterYourQuery.isEnabled()) {
			System.out.println("Enter Your Query is Enabled");
			//Enter Your Query Value
			enterYourQuery.sendKeys(enterYourQueryValue);
			System.out.println("Present Enter Your Query : " + enterYourQuery.getAttribute("value"));
		}
		else {
			System.out.println("Enter Your Query is not Enabled");
		}
		
		//Step 8 = Two Digits
		//Enter Any Two Digits
		WebElement enterTwoDigits = myDriverInstance.findElement(By.xpath(enterTwoDigitsLocator));
		//Verify Enter Any Two Digit is Displayed or Not
		if(enterTwoDigits.isDisplayed()) {
			System.out.println("Enter Any Two Digits is Displayed");
		}
		else {
			System.out.println("Enter Any Two Digits is not Displayed");
		}
		//Verify Enter Any Two Digit is Enabled or Not
		if(enterTwoDigits.isEnabled()) {
			System.out.println("Enter Any Two Digits is Enabled");
			
			//Retrieve the Verification Number during run time and enter the value
			String text = myDriverInstance.findElement(By.xpath("//label[normalize-space()='Example: 84']")).getText();
			String num[]=text.split(":");
			enterTwoDigits.sendKeys(num[1].trim());
			System.out.println("Enter Any Two Digit is :" + num[1] );
		}
		else {
			System.out.println("Enter Any Two Digits is not Enabled");
		}
		
		//Step 9 = Submit Button
		WebElement submitBtn = myDriverInstance.findElement(By.xpath(submitButtonLocator));
		//Verify Submit Button is Displayed or not
		if(submitBtn.isDisplayed()) {
			System.out.println("Submit Button is Displayed");
		}
		else {
			System.out.println("Submit Button is not Displayed");
		}
		//Verify Submit Button is Enabled or Not
		if(submitBtn.isEnabled()) {
			System.out.println("Submit Button is Enabled");
		}
		else {
			System.out.println("Submit Button is not Enabled");
		}
   
		//Verify Submit Button is Selected or Not
		if(submitBtn.isSelected()) {
			System.out.println("Submit Button is Selected");
		}
		else {
			System.out.println("Submit Button is not Selected");
			//Click on Submit button
			submitBtn.click();
			System.out.println("Submit Button is Clicked");
		}
		
		//Step 10 -Submit the Form
		WebElement successfulMsgText = myDriverInstance.findElement(By.xpath(successfulMsgTextLocator));
		//Verify Successful Message Text is Displayed or Not
		if(successfulMsgText.isDisplayed()) {
			System.out.println("Successful Message Text is Displayed");
		}
		else {
			System.out.println("Successful Message Text is not Displayed");
		}
		//Verify Successful Message is Enabled or Not
		if(successfulMsgText.isEnabled()) {
			System.out.println("Successful Message Text is Enabled");
		}
		else {
			System.out.println("Successful Message Text is not Enabled");
		}
		
		//Validating the Successful Text Message
		String actSuccessfulMsgText = successfulMsgText.getText();
		String expSuccessfulMsgText = successfulMessageText;
		
		if(actSuccessfulMsgText.equals(expSuccessfulMsgText)) {
			System.out.println("The Successful Message Text is :" + actSuccessfulMsgText);
		}
		else {
			System.out.println("Actual and Expected Succesful Message are not same");
			System.out.println("Actual Text is " + actSuccessfulMsgText);
			System.out.println("Expected Text is " + expSuccessfulMsgText);
		}
		
		//Close the Application
		myDriverInstance.close();
		System.out.println("Application is Closed");
}
}


