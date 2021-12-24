package JavaInterfaces;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Abstract Interface Class = RBI Bank
 * Date    - 10/19/2021
 *========================================================================*/


public class RBI implements BankAtmScreen, InternetBanking {

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit method is displayed from RBI Class ");
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal Method is displayed from RBI Class");

	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance Method is displayed from RBI Class");

	}

	@Override
	public void pinChange() {
		// TODO Auto-generated method stub
		System.out.println("Pin Change Method is displayed from RBI Class");

	}

	@Override
	public void mobileRegistration() {
		// TODO Auto-generated method stub


	}

	@Override
	public void moneyTransfer() {
		// TODO Auto-generated method stub

	}




}
