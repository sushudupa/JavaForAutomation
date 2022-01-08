package SeleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SAHandlingAutomationTestingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Parameterized all Input Values
		String register = "Register";
		String firstNameValue = "Alvin";
		String lastNameValue = "Doe";
		String addressValue = "187 Eagle way";
		String emailIDValue = "alvin.doe@hotmail.com";
		String phoneNumberValue = "3454344456";
		//String languagesValue = "English";
		String skillsDrpDwnValue = "Ruby";
		String countryDrpDwnValue = "India";
		String yearValue = "2005";
		String monthValue = "March";
		String dayValue = "22";
		String passwordValue = "Ruby";
		String confirmPasswordValue = "Ruby";


		//Parameterized all the webelement value
		String regTitleLocator = "//*[contains(text(),'Register')]";
		String firstNameLocator = "//input[@placeholder='First Name']";
		String lastNameLocator = "//input[@placeholder='Last Name']";
		String addressLocator = "//textarea[@rows='3']";
		String emailIDLocator = "//input[@type='email']";
		String phoneNumberLocator = "//input[@type='tel']";
		String maleRadBtnLocator = "//input[@value='Male']";
		String cricketLocator = "//input[@value='Cricket']";
		//String languageLocator = "//*[@class='ui-autocomplete-multiselect ui-state-default ui-widget']";
		String skillsLocator = "//*[@id='Skills']";
		String countryLocator = "//select[@id='countries']";
		String countryDrpDwnLocator = "//select[@id='country']";
		String yearLocator = "//*[@id='yearbox']";
		String monthLocator = "//*[@placeholder='Month']";
		String dayLocator = "//*[@id='daybox']";
		String passwordLocator = "//input[@id='firstpassword']";
		String confirmPasswordLocator = "//input[@id='secondpassword']";
		String refreshButtonLocator = "//button[@id='Button1']";

		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		String URL = "http://demo.automationtesting.in/Register.html";

		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");

		//Validate the Title of Form is displayed as "Register"
		WebElement regTitleText = driver.findElement(By.xpath(regTitleLocator));
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
		String expRegTitleText = register;

		if(actRegTitleText.equals(expRegTitleText)) {
			System.out.println("The Register Title Text is : " + actRegTitleText);
		} 
		else 
		{
			System.out.println("Actual and Expected Register Title Text are not same");
			System.out.println("The Actual Title Text is :" + actRegTitleText);
			System.out.println("The Expected Title Text is : " + expRegTitleText);
		}


		//First Name
		WebElement firstName = driver.findElement(By.xpath(firstNameLocator));
		//Verify the First Name is Displayed or not
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
		WebElement lastName = driver.findElement(By.xpath(lastNameLocator));
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
		

		//Address
		WebElement stAddress = driver.findElement(By.xpath(addressLocator));
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
			stAddress.sendKeys(addressValue);
			System.out.println("Present Street Address is :" + addressValue);
		}
		else {
			System.out.println("Street Address is not Enabled");
		}

		//Email ID
		WebElement emailID = driver.findElement(By.xpath(emailIDLocator));
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

		//Phone Number
		WebElement phoneNumber = driver.findElement(By.xpath(phoneNumberLocator));
		//Verify Mobile Number is Displayed or Not
		if(phoneNumber.isDisplayed()) {
			System.out.println("Mobile Number is Displayed");
		}
		else {
			System.out.println("Mobile Number is not Displayed");
		}
		
     //Verify Phone Number is Enabled or Not
		if(phoneNumber.isEnabled()) {
			System.out.println("Mobile Number is Enabled");
			
			//Enter the Mobile Number
			phoneNumber.sendKeys(phoneNumberValue);
			System.out.println("Present Mobile Number Value is :" + phoneNumberValue);
			}
		else {
			System.out.println("Mobile Number is not Enabled");
		}
 
		//Gender - Male Button
		WebElement maleRadioBtn = driver.findElement(By.xpath(maleRadBtnLocator));
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

		//Hobbies
		WebElement cricketChk = driver.findElement(By.xpath(cricketLocator));
		
		//Verify Cricket check bor is displayed
		if(cricketChk.isDisplayed()) {
			System.out.println("Cricket Check Box is Displayed");
		}
		else {
			System.out.println("Cricket Check Box is not Displayed");
		}
		
		//Verify Cricket check bor is enabled
		
		if(cricketChk.isEnabled()) {
			System.out.println("Cricket Check Box is Enabled");
		}
		else {
			System.out.println("Cricket Check Box is not Enabled");
		}
		
		//Verify the cricket Check Box is Selected or not
		if(cricketChk.isSelected()) {
			System.out.println("Cricket Check Box is Selected");
		}
		else {
			System.out.println("Cricket Check Box is not Selected");
			
			//Click on cricket Check Box
			cricketChk.click();
			System.out.println("Cricket Check Box is Selected");
			}
		
		//Verify cricket Check Box is Selected or not
		if(cricketChk.isSelected()) {
			System.out.println("Verified Cricket Check Box is Selected");
		}
		else {
			System.out.println("Verified Cricket Check Box is not Selected");
		}
			
		
		//Skills
		
		WebElement skillDropDown = driver.findElement(By.xpath(skillsLocator));
		
		//Verify skill Drop Down is Displayed or Not
		if(skillDropDown.isDisplayed()) {
			System.out.println("Skill Drop Down is Displayed");
		}
		else {
			System.out.println("Skill Drop Down is not Displayed");
		}
		//Verify Skill Drop Down is Enabled or Not
		if(skillDropDown.isEnabled()) {
			System.out.println("Skill Drop Down is Enabled");

			//To Select the item from Convenient skill Drop Down. create the Select Object
			Select skillDrpDwn = new Select(skillDropDown);
			//Using the Visible Text
			skillDrpDwn.selectByVisibleText(skillsDrpDwnValue);
			System.out.println("Present skill Drop Down Value is : " + skillsDrpDwnValue);
		}
		else {
			System.out.println("Skill Drop Down is not Enabled");
		}

		//Country
		WebElement country = driver.findElement(By.xpath(countryLocator));
		
		//Verify country is displayed or not
		if(country.isDisplayed()) {
			System.out.println("Country is displayed");
		}
		else
		{
			System.out.println("country is not displayed");
		}
		
		//Verify country is enabled or not
		if(country.isEnabled()) {
			System.out.println("Country is enabled");
		}
		else
			System.out.println("Country is not enabled");
		
		//Verify country is selected or not
		if(country.isSelected()) {
			System.out.println("Country is selected");
		}
		else
		{
			System.out.println("Country is not selected");
			country.click();
			System.out.println("Country is selected");
		}
		
		//Country Drop Down
		
		WebElement countryDropDown = driver.findElement(By.xpath(countryDrpDwnLocator));
		
		//Verify country Drop Down is Displayed or Not
		if(countryDropDown.isDisplayed()) {
			System.out.println("Country Drop Down is Displayed");
		}
		else {
			System.out.println("Country Drop Down is not Displayed");
		}
		//Verify country Drop Down is Enabled or Not
		if(countryDropDown.isEnabled()) {
			System.out.println("Country Drop Down is Enabled");

			//To Select the item from Convenient country Drop Down. create the Select Object
			Select countryDrpDwn = new Select(countryDropDown);
			//Using the Visible Text
			countryDrpDwn.selectByVisibleText(countryDrpDwnValue);
			System.out.println("Present country Drop Down Value is : " + countryDrpDwnValue);
		}
		else {
			System.out.println("Country Drop Down is not Enabled");
		}
		
		//Date of Birth
		//Birth Year
		
		WebElement yearDropDown = driver.findElement(By.xpath(yearLocator));
		//Verify year Drop Down is Displayed or Not
		if(yearDropDown.isDisplayed()) {
			System.out.println("Year Drop Down is Displayed");
		}
		else {
			System.out.println("Year Drop Down is not Displayed");
		}
		//Verify if year Drop Down is Enabled or Not
		if(yearDropDown.isEnabled()) {
			System.out.println("Year Drop Down is Enabled");

			//To Select the item from Convenient Year Drop Down. create the Select Object
			Select yearDrpDwn = new Select(yearDropDown);
			//Using the Visible Text
			yearDrpDwn.selectByVisibleText(yearValue);
			System.out.println("Present year Drop Down Value is : " + yearValue);
		}
		else {
			System.out.println("Year Drop Down is not Enabled");
		}
		
		//Birth month
		WebElement monthDropDown = driver.findElement(By.xpath(monthLocator));
		//Verify month Drop Down is Displayed or Not
		if(monthDropDown.isDisplayed()) {
			System.out.println("Month Drop Down is Displayed");
		}
		else {
			System.out.println("Month Drop Down is not Displayed");
		}
		//Verify if year Drop Down is Enabled or Not
		if(monthDropDown.isEnabled()) {
			System.out.println("Month Drop Down is Enabled");

			//To Select the item from Convenient Month Drop Down. create the Select Object
			Select monthDrpDwn = new Select(monthDropDown);
			//Using the Visible Text
			monthDrpDwn.selectByVisibleText(monthValue);
			System.out.println("Present month Drop Down Value is : " + monthValue);
		}
		else {
			System.out.println("Month Drop Down is not Enabled");
		}
		
		//Birth Day
		WebElement dayDropDown = driver.findElement(By.xpath(dayLocator));
		//Verify day Drop Down is Displayed or Not
		if(dayDropDown.isDisplayed()) {
			System.out.println("Day Drop Down is Displayed");
		}
		else {
			System.out.println("Day Drop Down is not Displayed");
		}
		//Verify if day Drop Down is Enabled or Not
		if(dayDropDown.isEnabled()) {
			System.out.println("Day Drop Down is Enabled");

			//To Select the item from Convenient Day Drop Down. create the Select Object
			Select dayDrpDwn = new Select(dayDropDown);
			//Using the Visible Text
			dayDrpDwn.selectByVisibleText(dayValue);
			System.out.println("Present day Drop Down Value is : " + dayValue);
		}
		else {
			System.out.println("Day Drop Down is not Enabled");
		}
		
		
		//Password
		WebElement password = driver.findElement(By.xpath(passwordLocator));
		
		//Verify password is displayed or not
		if(password.isDisplayed()) {
			System.out.println("Password is displayed");
		}
		else
		{
			System.out.println("Password is not displayed");
		}
		
		//Verify password is enabled or not
		if(password.isEnabled()) {
			System.out.println("Password is enabled");
			
			//Enter the password value
			password.sendKeys(passwordValue);
			System.out.println("Password value is " + passwordValue);
		}
		else
		{
			System.out.println("Password is not enabled");
		}
		
		//Confirm password
		WebElement confirmPassword = driver.findElement(By.xpath(confirmPasswordLocator));
		
		//Verify confirm password is displayed or not
		if(confirmPassword.isDisplayed()) {
			System.out.println("Confirm Password is displayed");
		}
		else
		{
			System.out.println("Confirm password is not displayed");
		}
		
		//Verify confirm password is enabled or not
		if(confirmPassword.isEnabled()) {
			System.out.println("Confirm password is enabled");
			
			//Enter the value
			confirmPassword.sendKeys(confirmPasswordValue);
			System.out.println("Confirm Password Value is " + confirmPasswordValue);
		}
		else
		{
			System.out.println("Confirm password is not enabled");
		}
		
		//refresh button
		WebElement refreshBtn = driver.findElement(By.xpath(refreshButtonLocator));
		
		//Verify refresh Button is Displayed or not
		if(refreshBtn.isDisplayed()) {
			System.out.println("Refresh Button is Displayed");
		}
		else {
			System.out.println("Refresh Button is not Displayed");
		}
		//Verify refresh Button is Enabled or Not
		if(refreshBtn.isEnabled()) {
			System.out.println("Refresh Button is Enabled");
		}
		else {
			System.out.println("Refresh Button is not Enabled");
		}
   
		//Verify refresh Button is Selected or Not
		if(refreshBtn.isSelected()) {
			System.out.println("Refresh Button is Selected");
		}
		else {
			System.out.println("Refresh Button is not Selected");
			//Click on refresh button
			refreshBtn.click();
			System.out.println("Refresh Button is Clicked");
		}
		 
//Close Application
		driver.close();
		System.out.println("Application is closed");


	}

}
