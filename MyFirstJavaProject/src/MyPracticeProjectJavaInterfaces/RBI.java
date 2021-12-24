package MyPracticeProjectJavaInterfaces;

//Here(Interface) we have to use the key word called "Implements".
//In inheritance, we use the word called "Extends".
//Do the mouse hover action in RBI and do add unimplemented methods just like interface, but the only difference here is, the code adds 'public' infront of void

//We implemented InternetBanking to RBI after creating InternetBanking and added InternetBanking to RBI while testing InternetBanking.
//We did add unimplemented methods to the RBI after mouse hovering on RBI. 

public class RBI implements BankAtmScreen, InternetBanking {

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit method is displayed from RBI Class ");
		
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal method is displayed from RBI Class ");
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance method is displayed from RBI Class ");
	}

	@Override
	public void pinChange() {
		// TODO Auto-generated method stub
		System.out.println("Pin Change method is displayed from RBI Class ");
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
