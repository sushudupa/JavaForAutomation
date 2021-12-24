package MyPracticeProjectJavaAbstraction;

//When we add the 'extends' method to RBI, we get a error and if we mouse hover on top of the error, we get two options
//1.Add Unimplemented MEthods 2.Make type RBI extract
//If we dont get the above 2 options, we have to do the right click-source-override/implement methods
//Click on the add umimplemented methods
//Then all the methods are automatically created
//Here when we do 'extends' program, we have to do the extends from the original program. that is BankAtmScree here. Its not like inheritance.
//Abstract code is used only for BankAtmScreen and no where else. Once abstract method is created, it is good for the rest of the program
//Because you create object instance only using BankAtmScreen.


public class RBI extends BankAtmScreen {

	@Override
	void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit method is displayed from RBI class");
		
	}

	@Override
	void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal method is displayed from RBI class");
		
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance method is displayed from RBI class");
		
	}

	@Override
	void pinChange() {
		// TODO Auto-generated method stub
		System.out.println("Pin Change method is displayed from RBI class");
		
	}

	@Override
	void mobileRegistration() {
		// TODO Auto-generated method stub
		
	}

}
