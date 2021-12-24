package JavaAbstraction;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Abstraction Class = Testing Abstraction ATMScreen
 * Date    - 10/18/2021
 *========================================================================*/

public class TestingAbstractionATMScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//classname obj = new classname constructor();

		//BankAtmScreen obj = new RBI();
		//BankAtmScreen obj = new HDFCBank(); //We cannot use obj again and rename obj2 as it throws error

		// Alternative Way to improve above code
		BankAtmScreen obj;

		// Creating object instance for RBI Bank
		obj = new RBI();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();

		// Creating object instance for HDFC Bank
		obj = new HDFCBank();
		obj.pinChange();
		obj.mobileRegistration();
		obj.minimumStatement();



	}

}
