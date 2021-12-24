package MyPracticeProjectJavaInterfaces;

//When we created this class, we should not do, rightclick-new-class, rather rightclick-new-interface
//An interface in Java is a blue print of a class
//Like a class, an interface can have methods and variables, but the methods declared in an interface are by the default abstract(only method signature, no body)
//(only method signature, no body) = means, interface must have only abstract method, means method without body
//Its a mechanism to achieve abstraction
//It also represents the Is-A relationship
//In order to call the interface, use the implements keyword

//Step 1: I copied this from the java abstract program which was already written
//Only abstract method works here. It wont throw any error.



public interface BankAtmScreen {
	
	//abstract  void deposit();
	//abstract void withdrawal();	
	//abstract void balance();	
	//abstract void pinChange();	
	//abstract void mobileRegistration();
	
	//Step 2: I deleted the word abstract because abstract will be there by default in the back end.
	//2. Interface(100%) = means implemented (code with curly braces at the end)methods are not allowed. Only abstracts works. For eg:
	//void mimimumStatement() {
	//	System.out.println("Minimum statement method is displayed");
	//}
	
	 void deposit();
	
	 void withdrawal();
	
	 void balance();
	
	 void pinChange();
	
	 void mobileRegistration();

}
