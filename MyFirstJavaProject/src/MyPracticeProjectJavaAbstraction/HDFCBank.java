package MyPracticeProjectJavaAbstraction;

//We did mouse hover concept on HDFC bank and added unimplemented methods just like RBI
//Here when we do 'extends' program, we have to do the extends from the original program. that is BankAtmScree here. Its not like inheritance.
//Difference b/w inheritance and abstract is , in inheritance ,we do extends from the previous program always, but here its done from the 1st program.
//Abstract code is used only for BankAtmScreen and no where else. Once abstract method is created, it is good for the rest of the program
//Because you create object instance only using BankAtmScreen.


public class HDFCBank extends BankAtmScreen{

	@Override
	void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void withdrawal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void pinChange() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mobileRegistration() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Registration is displayed from HDFC Class");
		
	}

}
