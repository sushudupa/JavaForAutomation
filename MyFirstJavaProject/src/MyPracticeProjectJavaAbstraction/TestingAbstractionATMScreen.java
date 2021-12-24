package MyPracticeProjectJavaAbstraction;


public class TestingAbstractionATMScreen {
	
	//No 'extends' keyword here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Step : Creating the object instance
		//classname obj = new classname constructor();
		//Here we cannot create the object instance of TestingAbstractionATMScreen as it throws error
		//So we have to create the object instance of which bank we want to access
		
		//BankAtmScreen obj = new RBIBank();
		//BankAtmScreen obj = new HDFCBank();
		
		//Alternative way to access the code
		//We are using 	BankAtmScreen obj; because, its an abstract method and it can be used in RBI and HDFC banks. 
		//Here 	BankAtmScreen is the main class/method. So RBI and HDFC depends on it as BankAtmScreen has abstract method.
		BankAtmScreen obj;
		
		// Creating object instance for RBI Bank
		obj = new RBI();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();
		
		// Creating object instance for HDFC Bank
		obj = new HDFCBank();
		obj.mobileRegistration();
		obj.mimimumStatement(); //This is implemented statement
		
		
		
		
		
		

}
}