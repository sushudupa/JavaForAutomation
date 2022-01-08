package SeleniumAutomationDifferentWebsitesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFormGitHubPractice {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Parameterizing the values

		String userNameValue = "John Doe";
		String emailIDValue = "johndoe@gmail.com";
		String teleNumberValue = "7654569875";
		String faxNumberValue = "9871215342";
		String genderValue = "Male";
		String automationToolsValue = "JMeter";

		//Parameterizing all weelement values

		String userNameLocator = "//input[@id='username']";
		String emailIDLocator = "//input[@id='email']";
		String teleNumberLocator = "//input[@id='tel']";
		String faxNumberLocator = "//input[@id='fax']";
		String genderLocator = "//select[@name='sgender']";
		String yrsOfExpLocator= "//input[@value='four']";
		String skillsLocator = "//input[@value='Selenium']";
		String automationToolsLocator = "//select[@id='tools']";
		String submitButtonLocator = "//input[@id='submit']";


		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance
		WebDriver driver = new ChromeDriver();

		String URL = "https://qavbox.github.io/demo/signup/";

		//Launch the application
		driver.get(URL);
		System.out.println("Application is launched");

		//Maximize the window
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Fill the registration form
		//First and Last name
		WebElement userName = driver.findElement(By.xpath(userNameLocator));
		
		//Verify if user name is displayed or not
		if(userName.isDisplayed()) {
			System.out.println("User name is displayed");
		}
		else
		{
			System.out.println("User name is not displayed");
		}
		
		//Verify if user name is enabled or not
		if(userName.isEnabled()) {
			System.out.println("User name is enabled");
			
			//Enter the user name values
			userName.sendKeys(userNameValue);
			System.out.println("The user name is " + userNameValue);
		}
		else
		{
			System.out.println("User name is not displayed");
		}

		//Enter Email ID
		WebElement emailID = driver.findElement(By.xpath(emailIDLocator));
		
		//Verify if email id is displayed or not
		if(emailID.isDisplayed()) {
			System.out.println("Email ID is displayed");
		}
		else
		{
			System.out.println("Email ID is not displayed");
		}

		//Verify if email Id is enabled or not
		if(emailID.isEnabled()) {
			System.out.println("Email Id is enabled");
			
			//Enter the email id value
			emailID.sendKeys(emailIDValue);
			System.out.println("Email ID value is " + emailIDValue);
		}
		else
		{
			System.out.println("Email ID is not enabled");
		}

		//Telephone number
		WebElement teleNumber = driver.findElement(By.xpath(teleNumberLocator));
		
		//Verify if telephone number is displayed or not
		if(teleNumber.isDisplayed()) {
			System.out.println("Telephone number is displayed");
		}
		else
		{
			System.out.println("Telephone number is not displayed");
		}
		
		//Verify if telephone number is enabled or not
		if(teleNumber.isEnabled()) {
			System.out.println("Telephone number is enabled");
			
			//Enter the telephone number value
			teleNumber.sendKeys(teleNumberValue);
			System.out.println("The telephone number is " + teleNumberValue);
		}
		else
		{
			System.out.println("Telephone number is not enabled");
		}

		//Fax number
		
		WebElement faxNumber = driver.findElement(By.xpath(faxNumberLocator));
		
		//Verify if fax number is displayed or not
		if(faxNumber.isDisplayed()) {
			System.out.println("Fax number is displayed");
		}
		else
		{
			System.out.println("Fax number is not displayed");
		}

		//Verify if fax number is enabled or not
		if(faxNumber.isEnabled()) {
			System.out.println("Fax number is enabled");
			
			//Enter the fax number value
			faxNumber.sendKeys(faxNumberValue);
			System.out.println("The fax number is " + faxNumberValue);
		}
		else
		{
			System.out.println("Fax number is not enabled");
		}
		
		//Gender
		WebElement maleGender = driver.findElement(By.xpath(genderLocator));
		
		//Verify if gender value is displayed or not
		if(maleGender.isDisplayed()) {
			System.out.println("Male gender value is displayed");
		}
		else
		{
			System.out.println("Male gender value is not displayed");
		}

		//Verify if gender value is enabled or not
		if(maleGender.isEnabled()) {
			System.out.println("Male gender value is enabled");
			
			//Create the object instance for selecting male gender value
			Select genderDrpDwn = new Select(maleGender);
			genderDrpDwn.selectByVisibleText(genderValue);
			System.out.println("The gender value is " + genderValue);
		}
		else
		{
			System.out.println("Male gender value is not enabled");
				
		}
		
		//Years of Experience
		WebElement expYears = driver.findElement(By.xpath(yrsOfExpLocator));
		
		//Verify if years of experience is displayed or not
		if(expYears.isDisplayed()) {
			System.out.println("Years of experience is displayed");
		}
		else 
		{
			System.out.println("Years of experience is  not displayed");
		}
		
		//Verify if years of experience is enabled or not
		if(expYears.isEnabled()) {
			System.out.println("Years of experience is enabled");
		}
		else
		{
			System.out.println("Years of experience is not enabled");
		}

		//Verify if years of experience is selected or not
		if(expYears.isSelected()) {
			System.out.println("Years of experience is selected");
		}
		else
		{
			System.out.println("Years of experience is not selected");
			
			//Click on the years of experience
			expYears.click();
			System.out.println("Years of experience is selected");
		}
		
		//Skills
		WebElement seleniumSkill = driver.findElement(By.xpath(skillsLocator));
		
		//Verify if skill is displayed or  not
		if(seleniumSkill.isDisplayed()) {
			System.out.println("Selenium skill is displayed");
		}
		else
		{
			System.out.println("Selenium Skill is not displayed");		
		}
		
		//Verify if skill is enabled or not
		if(seleniumSkill.isEnabled()) {
			System.out.println("Seelenium skill is enabled");
		}
		else
		{
			System.out.println("Selenium skill is not enabled");
		}

		//Verify if skill is selected or not
		if(seleniumSkill.isSelected()) {
			System.out.println("Selenium skill is selected");
		}
		else
		{
			System.out.println("Selenium skill is not selected");
			
			//Click on the selenium skill
			seleniumSkill.click();
			System.out.println("Selenium skill is checked");
		}
		
		//Verify if selenium skill is selected or not
		if(seleniumSkill.isSelected()) {
			System.out.println("Selenium Skill is selected");
		}
		else
		{
			System.out.println("Selenium Skill is not selected");
		}

		//Automation Tools
		WebElement autoTools = driver.findElement(By.xpath(automationToolsLocator));
		
		//Verify if automation tools is displayed or not
		if(autoTools.isDisplayed()) {
			System.out.println("Automation tools is displayed");
		}
		else
		{
			System.out.println("Automation tools is not displayed");
		}

		//Verify if automation tools is enabled or not
		if(autoTools.isEnabled()) {
			System.out.println("Automation tools is enabled");
			
			//Create the object instance for select class
			Select autoToolsDrpDwn = new Select(autoTools);
			
			//Select from visible text
			autoToolsDrpDwn.selectByVisibleText(automationToolsValue);
			System.out.println("The tools selected is " + automationToolsValue);	
		}
		else
		{
			System.out.println("Automation tool is not enabled");
		}
		
		//Submit button
		WebElement submitBtn = driver.findElement(By.xpath(submitButtonLocator));
		
		//Verify if submit button is displayed or not
		if(submitBtn.isDisplayed()) {
			System.out.println("Submit button is displayed");
		}
		else
		{
			System.out.println("Submit button is not displayed");
		}

		//Verify if submit button is enabled or not
		if(submitBtn.isEnabled()) {
			System.out.println("Submnit button is enabled");
		}
		else
		{
			System.out.println("submit button is not enabled");
		}

		//Verify is submit button is selected or not
		if(submitBtn.isSelected()) {
			System.out.println("submit button is selected");
		}
		else
		{
			System.out.println("Submit button is not selected");
			
			//Click on submit button
			submitBtn.click();
			System.out.println("Submit button is clicked");
		}
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");

	}

}
