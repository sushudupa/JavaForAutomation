package SeleniumAutomationDifferentWebsitesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFormAutomationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Parameterized all Input Values
		String firstNameValue = "Jasmine";
		String lastNameValue = "Wing";
		String dateValue = "12/12/2020";
		String drpDwnContinentsValue = "Asia";
		String seleniumCommandsValue = "Browser Commands";

		//Parameterized all the Webelement Value
		String firstNameLocator = "//input[@name='firstname']";
		String lastNameLocator = "//input[@name='lastname']";
		String femaleRadBtnLocator= "//input[@id='sex-1']";
		//String yrsOfExpLocator = "\exp-4\";
		String dateLocator = "//input[@id='datepicker']";
		String manualTesterLocator = "//input[@id='profession-0']";
		String automationTesterLocator= "//input[@id='profession-1']";
		String uftToolLocator = "//input[@id='tool-0']";
		String seleniumWebDriverLocator = "//input[@id='tool-2']";
		String continentDrpDwnLocator = "//select[@id='continents']";
		String seleniumCommandsLocator = "//select[@id='selenium_commands']";
		String submitBtnLocator = "//button[@id='submit']";


		//Set the system property
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		
		//Create the object instance
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.techlistic.com/p/selenium-practice-form.html";
		
		//Launch the Application
		driver.get(url);
		System.out.println("Application is launched");
		
		//Maximize the Application
		driver.manage().window().maximize();
		System.out.println("Application is maximized");
		
		//Fill the registration form by entering all the fields
		
		//First name
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
			System.out.println("Last name is displayed");
		}
		else
		{
			System.out.println("Last name is not displayed");
		}
		
		//Verify the last name is enabled or not
		if(lastName.isEnabled()) {
			System.out.println("Last name is enabled");
			
			//Enter the last name
			lastName.sendKeys(lastNameValue);
			System.out.println("The present last name value is " + lastNameValue);			
		}
		else
		{
			System.out.println("Last name is not enabled");
		}
		
		//Gender - Female Radio Button
		WebElement femaleRadBtn = driver.findElement(By.xpath(femaleRadBtnLocator));
		
		//Verify the female radio button is displayed or not
		if(femaleRadBtn.isDisplayed()) {
			System.out.println("Female Radio Button is displayed");
		}
		else
		{
			System.out.println("Female Radio Button is not displayed");
		}
		
		//Verify female radio button is enabled
		if(femaleRadBtn.isEnabled()) {
			System.out.println("Female Radio Button is enabled");
		}
		else
		{
			System.out.println("Female Radio Button is not enabled");
		}
		
		//Verify female radio button is selected or not
		if(femaleRadBtn.isSelected()) {
			System.out.println("Female radio button is selected");
		}
		else
		{
			System.out.println("Female radio button is not selected");
			//click on female radio button
			femaleRadBtn.click();
			System.out.println("Verified female radio button is selected");
		}
		
		//Year of experience
		WebElement yrsOfExp = driver.findElement(By.id("exp-2"));
		
		//Verify years of experience is displayed or not
		if(yrsOfExp.isDisplayed()) {
			System.out.println("Years of experience is displayed");
		}
		else
		{
			System.out.println("Years of experience is not displayed");
		}
		
		//Verify Years of experience is enabled
		if(yrsOfExp.isEnabled()) {
			System.out.println("Years of experience is enabled");
		}
		else
		{
			System.out.println("Years of experience is not enabled");
		}
		
		//Years of experience is Selected or not
		if(yrsOfExp.isSelected()) {
			System.out.println("Years of experience is selected");
		}
		else
		{
			System.out.println("Years of experience is not selected");
			
			//Click on years of experience radio button
			yrsOfExp.click();
			System.out.println("Years of experience is selected");
		}
	
		//Date
		WebElement date = driver.findElement(By.xpath(dateLocator));
		
		//Verify if date is displayed or not
		if(date.isDisplayed()) {
			System.out.println("Date is displayed");
		}
		else
		{
			System.out.println("Date is not displayed");
		}
		
		//Verify the date is enabled or not
		if(date.isEnabled()) {
			System.out.println("Date is enabled");
			
			//Enter the date
			date.sendKeys(dateValue);
			System.out.println("Date is " + dateValue);
		}
		else
		{
			System.out.println("Date is not enabled");
		}
		
		//Profession
		
		//Manual Tester
		
		WebElement manualTester = driver.findElement(By.xpath(manualTesterLocator));
		
		//Verify manual tester check box is displayed or not
		if(manualTester.isDisplayed()) {
			System.out.println("Manual Tester check box is displayed");
		}
		else
		{
			System.out.println("Manual Tester check box is not displayed");
		}
		
		//Verify manual tester check box is enabled or not
		if(manualTester.isEnabled()) {
			System.out.println("Manual Tester check box is enabled");
		}
		else
		{
			System.out.println("Manual Tester check box is not enabled");
		}
		
		//Verify manual tester check box is selected or not
		if(manualTester.isSelected()) {
			System.out.println("Manual tester check box is selected");			
		}
		else
		{
			System.out.println("Manual tester check box is not selected");
			
			//Click on the manual tester check box 
			manualTester.click();
			System.out.println("Manual Tester check box is checked");
		}
		//Verify manual tester check box is selected or not
		if(manualTester.isSelected()) {
			System.out.println("Verified manual tester check box is selected");
		}
		else
		{
			System.out.println("Verified manual tester check box is not selected");
		}
		
		//Automation Tester
		WebElement automationTester = driver.findElement(By.xpath(automationTesterLocator));
		
		//Verify automation tester check box is displayed or not
		if(automationTester.isDisplayed()) {
			System.out.println("Automation tester check box is displayed");
		}
		else
		{
			System.out.println("Automation tester check box is not displayed");
		}
		
		//Verify automation tester check box is enabled or not
		if(automationTester.isEnabled()) {
			System.out.println("Automation Tester check box is enabled");
		}
		else
		{
			System.out.println("Automation Tester check box is not enabled");
		}
		
		//Verify automation tester check box is selected or not
		if(automationTester.isSelected()) {
			System.out.println("Automation Tester check box is selected");
		}
		else
		{
			System.out.println("Automation Tester check box is not selected");
			
			//Check the automation tester check box 
			automationTester.click();
			System.out.println("Automation Tester check box is clicked");
		}
		
		//Verify automation tester check box is selected
		if(automationTester.isSelected()) {
			System.out.println("Verified Automation Tester check box is selected");
		}
		else
		{
			System.out.println("Verified Automation Tester check box is not selected");
		}
		
		
		//Automation Tools
		
		//UFT
		
		WebElement uftTool = driver.findElement(By.xpath(uftToolLocator));
		
		//Verify UFT Tool check box is displayed or not
		if(uftTool.isDisplayed()) {
			System.out.println("UFT Tool check box is displayed");
		}
		else
		{
			System.out.println("UFT Tool check box is not displayed");
		}
		
		//Verify UFT Tool check box is enabled or not
		if(uftTool.isEnabled()) {
			System.out.println("UFT Tool check box is enabled");
		}
		else
		{
			System.out.println("UFT Tool check box is not enabled");
		}
		
		//Verify UFT Tool check box is selected or not
		if(uftTool.isSelected()) {
			System.out.println("UFT Tool check box is selected");
		}
		else
		{
			System.out.println("UFT Tool check box is not selected");
			
			//Check the UFT Tool check box 
			uftTool.click();
			System.out.println("UFT Tool check box is clicked");
		}
		
		//Verify UFT Tool check box is selected
		if(uftTool.isSelected()) {
			System.out.println("Verified UFT Tool check box is selected");
		}
		else
		{
			System.out.println("Verified UFT Tool check box is not selected");
		}
		
		//Selenium Webdriver
		
		WebElement seleniumWebdriver = driver.findElement(By.xpath(seleniumWebDriverLocator));
		
		//Verify selenium Webdriver check box is displayed or not
		if(seleniumWebdriver.isDisplayed()) {
			System.out.println("selenium Webdriver check box is displayed");
		}
		else
		{
			System.out.println("selenium Webdriver Tool check box is not displayed");
		}
		
		//Verify selenium Webdriver check box is enabled or not
		if(seleniumWebdriver.isEnabled()) {
			System.out.println("selenium Webdriver check box is enabled");
		}
		else
		{
			System.out.println("selenium Webdriver check box is not enabled");
		}
		
		//Verify selenium Webdriver check box is selected or not
		if(seleniumWebdriver.isSelected()) {
			System.out.println("selenium Webdriver check box is selected");
		}
		else
		{
			System.out.println("selenium Webdriver check box is not selected");
			
			//Check the selenium Webdriver check box 
			seleniumWebdriver.click();
			System.out.println("selenium Webdriver check box is clicked");
		}
		
		//Verify selenium Webdriver check box is selected
		if(seleniumWebdriver.isSelected()) {
			System.out.println("Verified selenium Webdriver check box is selected");
		}
		else
		{
			System.out.println("Verified selenium Webdriver check box is not selected");
		}
		
		//Continents
		WebElement continentDropDown = driver.findElement(By.xpath(continentDrpDwnLocator));
		
		//Verify continent drop down is displayed or not
		if(continentDropDown.isDisplayed()) {
			System.out.println("Continent drop down is displayed");
		}
		else
		{
			System.out.println("Continent drop down is not displayed");
		}
		
		//Verify continent drop down is enabled or not
		if(continentDropDown.isEnabled()) {
			System.out.println("Continent drop down is enabled");
			
			//To Select the item from continent Drop Down. create the Select Object
			Select continentDrpDwn = new Select(continentDropDown);
			
			//Select by using visible text
			
			continentDrpDwn.selectByVisibleText(drpDwnContinentsValue);
			System.out.println("Present Continent Drop Down Value is : " + drpDwnContinentsValue);		
		}
		else
		{
			System.out.println("Continent drop down is not enabled");
		}
		
		//Selenium Commands
		WebElement seleniumCommandsDropDown = driver.findElement(By.xpath(seleniumCommandsLocator));
		
		//Verify selenium commands is displayed or not
		if(seleniumCommandsDropDown.isDisplayed()) {
			System.out.println("Selenium commands drop down is displayed");
		}
		else
		{
			System.out.println("Selenium command drop down is not displayed");
		}
		
		//Verify selenium commands is enabled or not
		if(seleniumCommandsDropDown.isEnabled()) {
			System.out.println("Selenium commands drop down is enabled");
			
			//To select the item from the selenium commands drop down list. Create the select object
			Select seleniumCommandsDrpDwn = new Select(seleniumCommandsDropDown);
			
			//Select by visible text
			seleniumCommandsDrpDwn.selectByVisibleText(seleniumCommandsValue);
			System.out.println("Present selenium commands drop down value is " + seleniumCommandsValue);	
		}
		else
		{
			System.out.println("Selenium commands drop down is not enabled");
		}
		
		//Submit Button
		
		WebElement submitBtn = driver.findElement(By.xpath(submitBtnLocator));
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
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");
		
		
	}

}
