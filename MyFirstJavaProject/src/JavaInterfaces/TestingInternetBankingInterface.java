package JavaInterfaces;

/*=============================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Abstraction Interface Class = Testing Internet Banking Interface
 * Date    - 10/19/2021
 *=============================================================================*/
public class TestingInternetBankingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaring the object

		InternetBanking obj;

		obj = new RBI();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();

		obj = new HDFCBank();
		obj.mobileRegistration();
		obj.moneyTransfer();



	}

}
