package JavaAbstraction;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Abstraction Class = BankAtmScreen
 * Date    - 10/18/2021
 *========================================================================*/

public abstract class BankAtmScreen {

	abstract void deposit();

	abstract void withdrawal();

	abstract void balance();

	abstract void pinChange();

	abstract void mobileRegistration();

	void minimumStatement() {
		System.out.println("Minimum Statement method is displayed");
	}

}
