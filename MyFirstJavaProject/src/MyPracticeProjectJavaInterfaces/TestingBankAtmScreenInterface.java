package MyPracticeProjectJavaInterfaces;

public class TestingBankAtmScreenInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1: Create the object  for the BankAtmScreen 
		
		BankAtmScreen obj;
		
		//Step: 3 = we have to create the object  for the RBI class to access all the methods
		
		obj = new RBI();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();
		
		//Step 4: we have to crate the object instance for the HDFCBank class to access all the methods
		
		obj = new HDFCBank();
		obj.mobileRegistration();
		
		//When we run the program, we get the results as:
		//Deposit method is displayed from RBI Class 
		//Withdrawal method is displayed from RBI Class 
		//Balance method is displayed from RBI Class 
		//Pin Change method is displayed from RBI Class 
		//Mobile Registration is displayed from HDFC Class

		
	}

}
