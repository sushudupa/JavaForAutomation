package MyPracticeProjectJavaFinalKeyword;

//Final keyword: Its a non-access modifier applicable only to a variable, a method or a class
//Final keyword is used to denote the constants. That is your ssn, adharcard no. cannot be changed and should not be allowed to change
//1. Final Variable = To create constant variable
//2. Final method = To prevent method overriding= (- Implement final keyword in polymorphism over riding program for methods). If we put
//the word 'final' infront of RBI class, then it wont let us override the SBI class. RBI will be a final method(RBI)
//3. Final class = To prevent inheritance = (Implement final keyword in inheritance program for class. If we add final infront of account class,
//you cannot do the inheritance for the savingClass). Then 'extends' concept doesnt work anymore if you add final to the account class

public class FinalKeyword {

	//1st.Step: Enter the value for the variable
	//Instance Variable
	
	//Step 5: We have to add 'Final' word to the original values to become constant. so no one can change it.
	//Once we add 'final' to the customerName and SSN, we can comment the other values (Sihi and 987654321)
	//If a variable declared as final means, its a constant
	
    final String customerName = "Saahasi";
	final int SSN = 123456789;
	
	public void display() {
		//Step 3:
		//Because the above mentioned customerName and SSN are instance not constant, we can change the values here
		//We ae over riding the value during runtime
		
		//Step 4:
		//The output for this is Sihi and 987654321. The old value is over ride by new value because this is the latest value
	    //customerName = "Sihi";
	    //SSN = 987654321;
		
		
		System.out.println(customerName);
		System.out.println(SSN);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 2: Calling the method, so create the object instance
		//After writing the obj.display and executinf it,  we get the results as Saahasi and 123456789
		//This above result is called as instance variable
		
		FinalKeyword obj = new FinalKeyword();
		obj.display();
		
	}

}
