package SeleniumAutomationDifferentWebsitesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class ParabankParasoftAutomationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Parameterize all input values
		String usernameIDValue = "johndoe1";
		String passwordValue = "automation";
		String transferAmountValue = "500.00";
		String payeeNameValue = "John Doe";
		String payeeAddressValue = "54 Rock Street";
		String payeeCityValue = "Spring";
		String payeeStateValue = "Texas";
		String payeeZipcodeValue = "77379";
		String payeePhoneValue = "5674354233";
		String payeeAccountNumValue = "23876";
		String payeeAccNumVerifyValue = "23876";
		String payeeBillAmountValue = "100.00";
		String updatedFNameValue = "Selma";
		String updatedLNameValue = "Dole";
		String updatedAddValue = "56 North Way";
		String updatedCityValue = "Henderson";
		String updatedStateValue = "Virginia";
		String updatedZipcodeValue = "87645";
		String updatedPhoneNumValue = "8796545676";
		String loanAmtValue = "1000";
		String downPaymentValue = "500";
		String regNewUserFNameValue = "Jane";
		String regNewUserLNameValue = "Hill";
		String regNewUserAddValue = "90 Silicon Drive";
		String regNewUserCityValue = "Seattle";
		String regNewUserStateValue = "Washington";
		String regNewUserZipValue = "98765";
		String regNewUserPhoneNumValue = "9654543677";
		String regNewUserSsnValue = "898756654";
		String regNewUserNameValue = "Mia";
		String regNewUserPasswordValue = "automation";
		String regNewUserPasswordConfirmValue = "automation";

		//Parameterize all webelement values

		String usernameLocator = "//input[@name='username']";
		String passwordLocator = "//input[@name='password']";
		String submitBtnLocator = "//input[@type='submit']";
		String checkingAccLocator = "//*[@id='type']";
		String accountNumberLocator = "//*[@id='fromAccountId']";
		String openNewAccLocator = "//*[@type='submit']";
		String homeButtonLocator = "//*[@class='home']";
		String transferAmountLocator = "//input[@id='amount']";
		String fromAccountLocator = "//select[@id='fromAccountId']";
		String toAccountLocator = "//select[@id='toAccountId']";
		String transferSubmitLocator = "//input[@type='submit']";
		String homeButton1Locator = "//*[@class='home']";
		String payeeNameLocator = "//input[@name='payee.name']";
		String payeeAddressLocator = "//input[@name='payee.address.street']";
		String payeeCityLocator = "//input[@name='payee.address.city']";
		String payeeStateLocator = "//input[@name='payee.address.state']";
		String payeeZipcodeLocator = "//input[@name='payee.address.zipCode']";
		String payeePhoneLocator = "//input[@name='payee.phoneNumber']";
		String payeeAccountNumnerLocator = "//input[@name='payee.accountNumber']";
		String payeeAccNumVerifyLocator = "//input[@name='verifyAccount']";
		String payeeBillAmountLocator = "//input[@name='amount']";
		String payeeFromAccLocator = "//*[@name='fromAccountId']";
		String sendPaymentLocator = "//*[@name='fromAccountId']";
		String homeButton2Locator = "//*[@class='home']";
		String updatedFNameLocator = "//input[@id='customer.firstName']";
		String updatedLNameLocator = "//input[@id='customer.lastName']";
		String updatedAddLocator = "//input[@id='customer.address.street']";
		String updatedCityLocator = "//input[@id='customer.address.city']";
		String updatedStateLocator = "//input[@id='customer.address.state']";
		String updatedZipcodeLocator = "//input[@id='customer.address.zipCode']";
		String updatedPhoneLocator = "//input[@id='customer.phoneNumber']";
		String updateProfileSubmitBtnLocator = "//input[@type='submit']";
		String loanAmountLocator = "//input[@id='amount']";
		String downPaymentLocator = "//input[@id='downPayment']";
		String fromAccountApplyLocator = "//*[@id='fromAccountId']";
		String applyNowSubmitBtnLocator = "//*[@type='submit']";
		String homeButton3Locator = "//*[@class='home']";
		String homeButton4Locator = "//*[@class='home']";
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
		String newUserSuccessfulMsgLocator = "//p[contains(text(),'Your account was created successfully. You are now')]";


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

		//1. Customer login
		//A.Enter the username
		WebElement userName = driver.findElement(By.xpath(usernameLocator));

		//Verify if username is displayed or not
		if(userName.isDisplayed()) {
			System.out.println("User name is displayed");
		}
		else
		{
			System.out.println("User name is not displayed");
		}

		//Verify if username is enabled or not
		if(userName.isEnabled()) {
			System.out.println("User name is enabled");

			//Enter the values
			userName.sendKeys(usernameIDValue);
			System.out.println("Customer user name value is " + usernameIDValue);
		}
		else
		{
			System.out.println("User name is not enabled");
		}

		//B.Enter the password
		WebElement userPassword = driver.findElement(By.xpath(passwordLocator));

		//Verify user password is displayed or not
		if(userPassword.isDisplayed()) {
			System.out.println("User password is displayed");
		}
		else
		{
			System.out.println("User password is not displayed");
		}

		//Verify user password is enabled or not
		if(userPassword.isEnabled()) {
			System.out.println("User password is enabled");

			//Enter the values
			userPassword.sendKeys(passwordValue);
			System.out.println("Customer user password value is " + passwordValue);
		}
		else
		{
			System.out.println("User password is not enabled");
		}

		//C.Enter submit button
		WebElement submitBtn = driver.findElement(By.xpath(submitBtnLocator));

		//Verify if submit button is displayed or not
		if(submitBtn.isDisplayed()) {
			System.out.println("Submit button is displayed");
		}
		else
		{
			System.out.println("Submit button is not displayed");
		}

		//Verify if sumbit button is enabled or not
		if(submitBtn.isEnabled()) {
			System.out.println("Submit button is enabled");
		}
		else
		{
			System.out.println("Submit button is not enabled");
		}

		//Verify is sumbit button is selected or not
		if(submitBtn.isSelected()) {
			System.out.println("Submit button is selected");
		}
		else
		{
			System.out.println("Submit button is not selected");

			//Click on submit button
			submitBtn.click();
			System.out.println("Submit button is selected");
		}

		//2. Account Services
		//A.Click on open new account
		WebElement newAccount = driver.findElement(By.partialLinkText("Open New Account"));
		newAccount.click();
		System.out.println("New Account link is clicked");

		//B.Type of account
		WebElement checkingAcc  = driver.findElement(By.xpath(checkingAccLocator));

		//Verify if checking account is displayed or not
		if(checkingAcc.isDisplayed()) {
			System.out.println("Checking account is displayed");
		}
		else
		{
			System.out.println("Checking account is not displayed");
		}

		//Verify if checking account is enabled or not
		if(checkingAcc.isEnabled()) {
			System.out.println("Checking account is enabled");

			//Click on checking account
			checkingAcc.click();
			System.out.println("Checking account is clicked");
		}
		else
		{
			System.out.println("Checking account is not enabled");
		}

		//C.Account number
		WebElement accountNum = driver.findElement(By.xpath(accountNumberLocator));

		//Verify if account number is displayed or not
		if(accountNum.isDisplayed()) {
			System.out.println("Account number is displayed");
		}
		else
		{
			System.out.println("Account number is not displayed");
		}

		//Verify if account number is enabled or not
		if(accountNum.isEnabled()) {
			System.out.println("Account number is enabled");
			//Click on the account number
			accountNum.click();
			System.out.println("Account number is clicked");

		}
		else
		{
			System.out.println("Account number is not enabled");
		}

		//D.Open New Account sumbit
		WebElement newAccSubmitBtn = driver.findElement(By.xpath(openNewAccLocator));

		//Verify if submit button is displayed or not
		if(newAccSubmitBtn.isDisplayed()) {
			System.out.println("Submit button is displayed");
		}
		else
		{
			System.out.println("Submit button is not displayed");
		}

		//Verify if sumbit button is enabled or not
		if(newAccSubmitBtn.isEnabled()) {
			System.out.println("Submit button is enabled");
		}
		else
		{
			System.out.println("Submit button is not enabled");
		}

		//Verify is sumbit button is selected or not
		if(newAccSubmitBtn.isSelected()) {
			System.out.println("Submit button is selected");
		}
		else
		{
			System.out.println("Submit button is not selected");

			//Click on submit button
			newAccSubmitBtn.click();
			System.out.println("Submit button is selected");
		}

		//3. Click on Accounts Overview
		//A.Click on the link
		WebElement accountOverview = driver.findElement(By.partialLinkText("Accounts Overview"));
		accountOverview.click();
		System.out.println("Account overview is clicked");


		//4.Click on Home button
		WebElement homeButton = driver.findElement(By.xpath(homeButtonLocator));

		//Verify if home button is displayed or not
		if(homeButton.isDisplayed()) {
			System.out.println("Home button is displayed");
		}
		else
		{
			System.out.println("Home button is not displayed");
		}

		//Verify if home button is enabled or not
		if(homeButton.isEnabled()) {
			System.out.println("Home button is enabled");

			//Click on home button
			homeButton.click();
			System.out.println("Home button is clicked");
		}
		else
		{
			System.out.println("Home button is not enabled");
		}

		//5.Click on Transfer Funds
		//A.Click on the link
		WebElement transferFunds = driver.findElement(By.partialLinkText("Transfer Funds"));
		transferFunds.click();
		System.out.println("Transfer Funds link is clicked");

		//B. Enter the amount value
		WebElement amountValue = driver.findElement(By.xpath(transferAmountLocator));

		//Verify if amount is displayed or not
		if(amountValue.isDisplayed()) {
			System.out.println("Amount value is displayed");
		}
		else
		{
			System.out.println("Amount value is not displayed");
		}

		//Veriyf if amount is enabled or not
		if(amountValue.isEnabled()) {
			System.out.println("Amount value is enabled");

			//Enter the amount value
			amountValue.sendKeys("500.00");
			System.out.println("Amount entered is " + transferAmountValue);
		}
		else
		{
			System.out.println("Amount value is not enabled");
		}

		//C. Trasnfer from account
		WebElement fromAccount = driver.findElement(By.xpath(fromAccountLocator));

		//Verify if from account is displayed or not
		if(fromAccount.isDisplayed()) {
			System.out.println("From account is displayed");
		}
		else
		{
			System.out.println("From account is not displayed");
		}

		//Verify if from acount is enabled or not
		if(fromAccount.isEnabled()) {
			System.out.println("From account is enabled");

			//click on the account
			fromAccount.click();
			System.out.println("From account is clicked");
		}
		else
		{
			System.out.println("From account is not enabled");
		}

		//D. Trasnsfer to account
		WebElement toAccount = driver.findElement(By.xpath(toAccountLocator));

		//Verify if to account is displayed or not
		if(toAccount.isDisplayed()) {
			System.out.println("To account is displayed");
		}
		else
		{
			System.out.println("To account is not displayed");
		}

		//Verify if to account is enabled or not
		if(toAccount.isEnabled()) {
			System.out.println("To account is enabled");

			//Click on the account
			toAccount.click();
			System.out.println("To account is clicked");
		}
		else
		{
			System.out.println("To account is not enabled");
		}

		//E. Click on Account Transfer submit
		WebElement trasferSubmit = driver.findElement(By.xpath(transferSubmitLocator));


		//Verify if submit button is displayed or not
		if(trasferSubmit.isDisplayed()) {
			System.out.println("Transfer Submit button is displayed");
		}
		else
		{
			System.out.println("Transfer Submit button is not displayed");
		}

		//Verify if sumbit button is enabled or not
		if(trasferSubmit.isEnabled()) {
			System.out.println("Transfer Submit button is enabled");
		}
		else
		{
			System.out.println("Transfer Submit button is not enabled");
		}

		//Verify is sumbit button is selected or not
		if(trasferSubmit.isSelected()) {
			System.out.println("Transfer Submit button is selected");
		}
		else
		{
			System.out.println("Transfer Submit button is not selected");

			//Click on submit button
			trasferSubmit.click();
			System.out.println("Transfer Submit button is clicked");
		}

		//6.Click on Home button
		WebElement homeButton1 = driver.findElement(By.xpath(homeButton1Locator));

		//Verify if home button is displayed or not
		if(homeButton1.isDisplayed()) {
			System.out.println("Home button is displayed");
		}
		else
		{
			System.out.println("Home button is not displayed");
		}

		//Verify if home button is enabled or not
		if(homeButton1.isEnabled()) {
			System.out.println("Home button is enabled");

			//Click on home button
			homeButton1.click();
			System.out.println("Home button is clicked");
		}
		else
		{
			System.out.println("Home button is not enabled");
		}

		//7. Click on bill payee link
		WebElement billPay = driver.findElement(By.partialLinkText("Bill Pay"));
		billPay.click();
		System.out.println("Bill Pay link is clicked");

		//A. Enter payee information
		//1.Payee Name
		WebElement payeeName = driver.findElement(By.xpath(payeeNameLocator));

		//Verify if payee name is displayed or not
		if(payeeName.isDisplayed()) {
			System.out.println("Payee Name is displayed");
		}
		else
		{
			System.out.println("Payee name is not displayed");
		}

		//Verify if payee name is enabled or not
		if(payeeName.isEnabled()) {
			System.out.println("Payee name is enabled");

			//Enter the values for payee name
			payeeName.sendKeys(payeeNameValue);
			System.out.println("Payee name entered is " + payeeNameValue);
		}

		//2. Payee Address
		WebElement payeeAdd = driver.findElement(By.xpath(payeeAddressLocator));

		//Verify if payee address is displayed or not
		if(payeeAdd.isDisplayed()) {
			System.out.println("Payee address is displayed");
		}
		else
		{
			System.out.println("Payee addree is not displayed");
		}

		//Verify if payee adress is enabled or not
		if(payeeAdd.isEnabled()) {
			System.out.println("Payee address is enabled");

			//Enter the values for payee address
			payeeAdd.sendKeys(payeeAddressValue);
			System.out.println("Payee address entered is " + payeeAddressValue);
		}

		//3. Payee City
		WebElement payeeCity = driver.findElement(By.xpath(payeeCityLocator));

		//Verify if payee city is displayed or not
		if(payeeCity.isDisplayed()) {
			System.out.println("Payee city is displayed");
		}
		else
		{
			System.out.println("Payee city is not displayed");
		}

		//Verify if payee city is enabled or not
		if(payeeCity.isEnabled()) {
			System.out.println("Payee City is enabled");

			//Enter the city values
			payeeCity.sendKeys(payeeCityValue);
			System.out.println("Payee city entered is " + payeeCityValue);
		}
		else
		{
			System.out.println("Payee city is not enabled");
		}

		//4. Payee State
		WebElement payeeState = driver.findElement(By.xpath(payeeStateLocator));

		//Verify if payee state is displayed or not
		if(payeeState.isDisplayed()) {
			System.out.println("Payee State is displayed");
		}
		else
		{
			System.out.println("Payee State is not displayed");
		}

		//Verify if payee state is enabled or not
		if(payeeState.isEnabled()) {
			System.out.println("Payee State is enabled");

			//Enter the State value
			payeeState.sendKeys(payeeStateValue);
			System.out.println("Payee state entered is " + payeeStateValue);
		}
		else
		{
			System.out.println("Payee State is not enabled");
		}

		//5. Payee ZipCode
		WebElement payeeZip = driver.findElement(By.xpath(payeeZipcodeLocator));

		//Verify if payee zip code is displayed or not
		if(payeeZip.isDisplayed()) {
			System.out.println("Payee zipcode is displayed");
		}
		else
		{
			System.out.println("Payee zipcode is not displayed");
		}

		//Verify if payee zipcode is enabled or not
		if(payeeZip.isEnabled()) {
			System.out.println("Payee zipcode is enabled");

			//Enter the values
			payeeZip.sendKeys(payeeZipcodeValue);
			System.out.println("Payee zipcode entered is " + payeeZipcodeValue);
		}
		else
		{
			System.out.println("Payee zipcode is nt enabled");		
		}

		//6. Payee Phone number
		WebElement payeePhone = driver.findElement(By.xpath(payeePhoneLocator));

		//Verify if payee phone number is displayed or not
		if(payeePhone.isDisplayed()) {
			System.out.println("Payee phone number is displayed");
		}
		else
		{
			System.out.println("Payee phone number is not displayed");
		}

		//Verify if payee phone number is enabled or not
		if(payeePhone.isEnabled()) {
			System.out.println("Payee phone number is enabled");

			//Enter the phone number values
			payeePhone.sendKeys(payeePhoneValue);
			System.out.println("Payee phone number entered is " + payeePhoneValue);
		}
		else
		{
			System.out.println("Payee phone number is not enabled");
		}

		//7. Payee Account number
		WebElement payeeAccNum = driver.findElement(By.xpath(payeeAccountNumnerLocator));

		//Verify if payee account number is displayed or not
		if(payeeAccNum.isDisplayed()) {
			System.out.println("Payee Account number is displayed");
		}
		else
		{
			System.out.println("Payee Account number is not displayed");
		}

		//Verify if payee account number is enabled or not
		if(payeeAccNum.isEnabled()) {
			System.out.println("Payee Account number is enabled");

			//Enter the values for payee account number
			payeeAccNum.sendKeys(payeeAccountNumValue);
			System.out.println("Payee Account Number value is " + payeeAccountNumValue);	
		}
		else
		{
			System.out.println("Payee account number is not enabled");
		}

		//8. Verify Payee Account Number
		WebElement payeeAccNumVer = driver.findElement(By.xpath(payeeAccNumVerifyLocator));

		//Verify if payee account number verified is displayed or not
		if(payeeAccNumVer.isDisplayed()) {
			System.out.println("Payee Account Number Verification is displayed");
		}
		else
		{
			System.out.println("Payee Account Number Verification is not displayed");
		}

		//Verify if payee account number verified is enabled or not
		if(payeeAccNumVer.isEnabled()) {
			System.out.println("Payee Account Number verification is enabled");

			//Enter the values
			payeeAccNumVer.sendKeys(payeeAccNumVerifyValue);
			System.out.println("Payee Account Number Verification is " + payeeAccNumVerifyValue);
		}
		else
		{
			System.out.println("Payee Account Number verification is not enabled");
		}

		//9. Payee Bill Amount 
		WebElement payeeBillAmt = driver.findElement(By.xpath(payeeBillAmountLocator));

		//Verify if payee bill amount is displayed or not
		if(payeeBillAmt.isDisplayed()) {
			System.out.println("Payee Bill Amount is displayed");		
		}
		else
		{
			System.out.println("Payee Bill Amount is not displayed");	
		}

		//Verify if payee bill amount is enabled or not
		if(payeeBillAmt.isEnabled()) {
			System.out.println("Payee Bill amount is enabled");

			//Enter the values
			payeeBillAmt.sendKeys(payeeBillAmountValue);
			System.out.println("Payee Bill amount entered value is " + payeeBillAmountValue);
		}
		else
		{
			System.out.println("Payee Bill amount is not enabled");
		}

		//10. Payee from account 
		WebElement payeeFromAcc = driver.findElement(By.xpath(payeeFromAccLocator));

		//Verify payee from account is displayed or not
		if(payeeFromAcc.isDisplayed()) {
			System.out.println("Payee from account is displayed");
		}
		else
		{
			System.out.println("Payee from account is not displayed");
		}

		//Verify if payee from account is enabled or not
		if(payeeFromAcc.isEnabled()) {
			System.out.println("Payee from account is enabled");

			//Click on the account
			payeeFromAcc.click();
			System.out.println("Payee from account is clicked");
		}
		else
		{
			System.out.println("Payee From account is not enabled");
		}

		//11. Payee Send payment
		WebElement payeeSendPayment = driver.findElement(By.xpath(sendPaymentLocator));

		//Verify if submit button is displayed or not
		if(payeeSendPayment.isDisplayed()) {
			System.out.println("Payee send payment button is displayed");
		}
		else
		{
			System.out.println("Payee send payment button is not displayed");
		}

		//Verify if sumbit button is enabled or not
		if(payeeSendPayment.isEnabled()) {
			System.out.println("Payee send payment button is enabled");
		}
		else
		{
			System.out.println("Payee send payment button is not enabled");
		}

		//Verify is sumbit button is selected or not
		if(payeeSendPayment.isSelected()) {
			System.out.println("Payee send payment button is selected");
		}
		else
		{
			System.out.println("Payee send payment button is not selected");

			//Click on submit button
			payeeSendPayment.click();
			System.out.println("Payee send payment button  is selected");
		}

		//8.Click on Home button
		WebElement homeButton2 = driver.findElement(By.xpath(homeButton2Locator));

		//Verify if home button is displayed or not
		if(homeButton2.isDisplayed()) {
			System.out.println("Home button is displayed");
		}
		else
		{
			System.out.println("Home button is not displayed");
		}

		//Verify if home button is enabled or not
		if(homeButton2.isEnabled()) {
			System.out.println("Home button is enabled");

			//Click on home button
			homeButton2.click();
			System.out.println("Home button is clicked");
		}
		else
		{
			System.out.println("Home button is not enabled");
		}	

		//9.Click on  Update the contact information
		WebElement updateContact = driver.findElement(By.partialLinkText("Update Contact"));
		updateContact.click();
		System.out.println("Update contact info link is clicked");

		//10. Update the customer information
		//A. Update First Name
		WebElement updatedFName = driver.findElement(By.xpath(updatedFNameLocator));

		//Verify the updated first name is displayed or not
		if(updatedFName.isDisplayed()) {
			System.out.println("Updated first name is displayed");
		}
		else
		{
			System.out.println("Updated first name is not displayed");
		}

		//Verify the updated first name is enabled or not
		if(updatedFName.isEnabled()) {
			System.out.println("Updated first name is enabled");

			//Enter the values
			updatedFName.clear();
			updatedFName.sendKeys(updatedFNameValue);
			System.out.println("Updated first name value is " + updatedFNameValue);
		}
		else
		{
			System.out.println("Updated first name is not enabled");
		}

		//B. Update Last Name
		WebElement updatedLName = driver.findElement(By.xpath(updatedLNameLocator));

		//Verify the updated first name is displayed or not
		if(updatedLName.isDisplayed()) {
			System.out.println("Updated last name is displayed");
		}
		else
		{
			System.out.println("Updated last name is not displayed");
		}

		//Verify the updated first name is enabled or not
		if(updatedLName.isEnabled()) {
			System.out.println("Updated last name is enabled");

			//Enter the values
			updatedLName.clear();
			updatedLName.sendKeys(updatedLNameValue);
			System.out.println("Updated last name value is " + updatedLNameValue);
		}
		else
		{
			System.out.println("Updated last name is not enabled");
		}

		//C. Update Address
		WebElement updateAdd = driver.findElement(By.xpath(updatedAddLocator));

		//Verify the updated first name is displayed or not
		if(updateAdd.isDisplayed()) {
			System.out.println("Updated address is displayed");
		}
		else
		{
			System.out.println("Updated address is not displayed");
		}

		//Verify the updated first name is enabled or not
		if(updateAdd.isEnabled()) {
			System.out.println("Updated address is enabled");

			//Enter the values
			updateAdd.clear();
			updateAdd.sendKeys(updatedAddValue);
			System.out.println("Updated address value is " + updatedAddValue);
		}
		else
		{
			System.out.println("Updated address is not enabled");
		}

		//D. Update City
		WebElement updatedCity = driver.findElement(By.xpath(updatedCityLocator));

		//Verify the updated first name is displayed or not
		if(updatedCity.isDisplayed()) {
			System.out.println("Updated city is displayed");
		}
		else
		{
			System.out.println("Updated city is not displayed");
		}

		//Verify the updated first name is enabled or not
		if(updatedCity.isEnabled()) {
			System.out.println("Updated city is enabled");

			//Enter the values
			updatedCity.clear();
			updatedCity.sendKeys(updatedCityValue);
			System.out.println("Updated city value is " + updatedCityValue);
		}
		else
		{
			System.out.println("Updated city is not enabled");
		}

		//E. Update State
		WebElement updatedState = driver.findElement(By.xpath(updatedStateLocator));

		//Verify the updated first name is displayed or not
		if(updatedState.isDisplayed()) {
			System.out.println("Updated state is displayed");
		}
		else
		{
			System.out.println("Updated state is not displayed");
		}

		//Verify the updated state is enabled or not
		if(updatedState.isEnabled()) {
			System.out.println("Updated state is enabled");

			//Enter the values
			updatedState.clear();
			updatedState.sendKeys(updatedStateValue);
			System.out.println("Updated state value is " + updatedStateValue);
		}
		else
		{
			System.out.println("Updated state is not enabled");
		}

		//F. Update ZipCode
		WebElement updatedZipcode = driver.findElement(By.xpath(updatedZipcodeLocator));

		//Verify the updated first name is displayed or not
		if(updatedZipcode.isDisplayed()) {
			System.out.println("Updated zip is displayed");
		}
		else
		{
			System.out.println("Updated zip is not displayed");
		}

		//Verify the updated first name is enabled or not
		if(updatedZipcode.isEnabled()) {
			System.out.println("Updated zip is enabled");

			//Enter the values
			updatedZipcode.clear();
			updatedZipcode.sendKeys(updatedZipcodeValue);
			System.out.println("Updated zip value is " + updatedZipcodeValue);
		}
		else
		{
			System.out.println("Updated zip is not enabled");
		}

		//G. Update Phone number
		WebElement updatedPhoneNum = driver.findElement(By.xpath(updatedPhoneLocator));

		//Verify the updated first name is displayed or not
		if(updatedPhoneNum.isDisplayed()) {
			System.out.println("Updated phone number is displayed");
		}
		else
		{
			System.out.println("Updated phone number is not displayed");
		}

		//Verify the updated first name is enabled or not
		if(updatedPhoneNum.isEnabled()) {
			System.out.println("Updated phone number is enabled");

			//Enter the values
			updatedPhoneNum.clear();
			updatedPhoneNum.sendKeys(updatedPhoneNumValue);
			System.out.println("Updated phone number value is " + updatedPhoneNumValue);
		}
		else
		{
			System.out.println("Updated phone numner is not enabled");
		}

		//F.Update Profile Button
		WebElement updatedSubmitBtn = driver.findElement(By.xpath(updateProfileSubmitBtnLocator));

		//Verify if submit button is displayed or not
		if(updatedSubmitBtn.isDisplayed()) {
			System.out.println("Submit button is displayed");
		}
		else
		{
			System.out.println("Submit button is not displayed");
		}

		//Verify if sumbit button is enabled or not
		if(updatedSubmitBtn.isEnabled()) {
			System.out.println("Submit button is enabled");
		}
		else
		{
			System.out.println("Submit button is not enabled");
		}

		//Verify is sumbit button is selected or not
		if(updatedSubmitBtn.isSelected()) {
			System.out.println("Submit button is selected");
		}
		else
		{
			System.out.println("Submit button is not selected");

			//Click on submit button
			updatedSubmitBtn.click();
			System.out.println("Submit button is selected");
		}

		//11. Apply for loan
		//A. Click on the link
		WebElement requestLoan = driver.findElement(By.partialLinkText("Request Loan"));
		requestLoan.click();
		System.out.println("Request for loan link in clicked");

		//B. Loan Amount
		WebElement loanAmount = driver.findElement(By.xpath(loanAmountLocator));

		//Verify loan amount is displayed or not
		if(loanAmount.isDisplayed()) {
			System.out.println("Loan amount is displayed");
		}
		else
		{
			System.out.println("Loan amount is not displayed");
		}

		//Verify loan amount is enabled or not
		if(loanAmount.isEnabled()) {
			System.out.println("Loan Amount is enabled");

			//Enter the values
			loanAmount.sendKeys(loanAmtValue);
			System.out.println("The loan amount entered is " + loanAmtValue);
		}
		else
		{
			System.out.println("Loan amount is not enabled");
		}

		//C. Down Payment
		WebElement downPayment = driver.findElement(By.xpath(downPaymentLocator));

		//Verify down payment is displayed or not
		if(downPayment.isDisplayed()) {
			System.out.println("Down Payment is displayed");
		}
		else
		{
			System.out.println("Down payment is not displayed");
		}

		//Verify own payment is enabled or not
		if(downPayment.isEnabled()) {
			System.out.println("Down Payment is enabled");

			//Enter the values
			downPayment.sendKeys(downPaymentValue);
			System.out.println("The down payment entered is " + downPaymentValue);
		}
		else
		{
			System.out.println("Down Payment is not enabled");
		}

		//D.From Account number
		WebElement fromAccountNum = driver.findElement(By.xpath(fromAccountApplyLocator));

		//Verify if account number is displayed or not
		if(fromAccountNum.isDisplayed()) {
			System.out.println("Account number is displayed");
		}
		else
		{
			System.out.println("Account number is not displayed");
		}

		//Verify if account number is enabled or not
		if(fromAccountNum.isEnabled()) {
			System.out.println("Account number is enabled");
			//Click on the account number
			fromAccountNum.click();
			System.out.println("Account number is clicked");

		}
		else
		{
			System.out.println("Account number is not enabled");
		}

		//E. Apply Now Button
		WebElement applyLoanSubmitBtn = driver.findElement(By.xpath(applyNowSubmitBtnLocator));

		//Verify if submit button is displayed or not
		if(applyLoanSubmitBtn.isDisplayed()) {
			System.out.println("Submit button is displayed");
		}
		else
		{
			System.out.println("Submit button is not displayed");
		}

		//Verify if sumbit button is enabled or not
		if(applyLoanSubmitBtn.isEnabled()) {
			System.out.println("Submit button is enabled");
		}
		else
		{
			System.out.println("Submit button is not enabled");
		}

		//Verify is sumbit button is selected or not
		if(applyLoanSubmitBtn.isSelected()) {
			System.out.println("Submit button is selected");
		}
		else
		{
			System.out.println("Submit button is not selected");

			//Click on submit button
			applyLoanSubmitBtn.click();
			System.out.println("Submit button is selected");
		}

		//12. Click on home link
		WebElement homeButton3 = driver.findElement(By.xpath(homeButton3Locator));

		//Verify if home button is displayed or not
		if(homeButton3.isDisplayed()) {
			System.out.println("Home button is displayed");
		}
		else
		{
			System.out.println("Home button is not displayed");
		}

		//Verify if home button is enabled or not
		if(homeButton3.isEnabled()) {
			System.out.println("Home button is enabled");

			//Click on home button
			homeButton3.click();
			System.out.println("Home button is clicked");
		}
		else
		{
			System.out.println("Home button is not enabled");
		}

		//13. Click on About Us link
		WebElement aboutUs = driver.findElement(By.partialLinkText("About Us"));
		aboutUs.click();
		System.out.println("About Us link is clicked");

		//14.Click on Home page
		WebElement homeButton4 = driver.findElement(By.xpath(homeButton4Locator));

		//Verify if home button is displayed or not
		if(homeButton4.isDisplayed()) {
			System.out.println("Home button is displayed");
		}
		else
		{
			System.out.println("Home button is not displayed");
		}

		//Verify if home button is enabled or not
		if(homeButton4.isEnabled()) {
			System.out.println("Home button is enabled");

			//Click on home button
			homeButton4.click();
			System.out.println("Home button is clicked");
		}
		else
		{
			System.out.println("Home button is not enabled");
		}

		//15. Click on Services Link
		WebElement services = driver.findElement(By.partialLinkText("Services"));
		services.click();
		System.out.println("Services Link is clicked");

		//16.Click on products link
		WebElement products = driver.findElement(By.partialLinkText("Products"));
		products.click();
		System.out.println("Product link is clicked");

		//17. Navigate back to home page
		driver.navigate().back();
		System.out.println("Navigated back to home page");

		//18. Click on logout button
		WebElement logout = driver.findElement(By.partialLinkText("Log Out"));
		logout.click();
		System.out.println("Logout link is clicked");

		//19. Register New User
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

		//20. Capture New User Successful Registered Message
		WebElement newUserSuccessfulMgs = driver.findElement(By.xpath(newUserSuccessfulMsgLocator));

		//Verify if successful message is displayed or not
		if(newUserSuccessfulMgs.isDisplayed()) {
			System.out.println("New User registerd successful message is displayed");
		}
		else
		{
			System.out.println("New user registered successful message is not displayed");
		}

		//Verify successful message is enabled or not
		if(newUserSuccessfulMgs.isEnabled()) {
			System.out.println("New User registerd successful message is enabled");

			//Capture the message
			System.out.println("The new user registered successful message is : " + newUserSuccessfulMgs.getText());
		}
		else
		{
			System.out.println("New User registerd successful message is not enabled");
		}

		//21. Click on logout button
		WebElement logout1 = driver.findElement(By.partialLinkText("Log Out"));
		logout1.click();
		System.out.println("Logout link is clicked");

		//22. Close the application
		driver.close();
		System.out.println();

	}

}
