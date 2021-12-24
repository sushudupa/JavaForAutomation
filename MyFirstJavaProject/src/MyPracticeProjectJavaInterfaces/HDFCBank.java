package MyPracticeProjectJavaInterfaces;

//We have to do the 'implements' agian. That is BankAtmScreen to HDFC Bank
//Mouse hover concept on HDFCBank and add unimplemented methods
//Here we are adding code just for mobile registration as every other one's code is already entered in RBI. we dont need to redo it

//We are implementing internetBanking to this HDFCBank after creating the method internetBanking. HDFC is providing internet banking. 
//So we are adding/implmenting internetBanking to HDFC
//Now we add umimplented methods after mouse hovering to the HDFC bank


public class HDFCBank implements BankAtmScreen, InternetBanking {

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pinChange() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mobileRegistration() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Registration is displayed from HDFC Class");
		
	}

	@Override
	public void moneyTransfer() {
		// TODO Auto-generated method stub
		System.out.println("Money Trasnfer is displayed from HDFC Class");
		
	}

}
