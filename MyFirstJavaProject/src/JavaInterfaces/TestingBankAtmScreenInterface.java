package JavaInterfaces;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Abstraction Interface Class = Testing Abstraction ATMScreen
 * Date    - 10/19/2021
 *========================================================================*/

public class TestingBankAtmScreenInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAtmScreen obj;

		obj = new RBI();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();

		obj = new HDFCBank();
		obj.mobileRegistration();


	}

}
