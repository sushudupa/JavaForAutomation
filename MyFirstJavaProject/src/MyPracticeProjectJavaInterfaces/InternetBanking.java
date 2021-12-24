package MyPracticeProjectJavaInterfaces;

//We created this method by rightclick-new-interface
//If we want to call one interface to other interface, we can use the 'extends' word.
//We will be calling BankAtmScreen to this InternetBanking
//We already have all the methods like deposit, withdrwal, balance, pin change, register mobile when we did extends from BankAtmScreen
//We are just adding money transfer as it is used in internet banking

public interface InternetBanking extends BankAtmScreen {
	
	void moneyTransfer();

}
