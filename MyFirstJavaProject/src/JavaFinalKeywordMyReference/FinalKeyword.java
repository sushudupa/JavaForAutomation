package JavaFinalKeywordMyReference;

//Final Keyword =  The final keyword in java is used to restrict the user.
//Final keyword can be:
//1. variable - If you make any variable as final, you cannot change the value of final variable   (It will be constant).
//2.method - If you make any method as final, you cannot override it.   (- Implement final keyword in polymorphism over riding program for methods)
//3. class - If you make any class as final, you cannot extend it.   (- Implement final keyword in inheritance program for class)


public class FinalKeyword {
	
	//1. Step one - enter the value for the variable
	
	//Instance Variable
	final String customerName = "Pranav";
	final int SSN = 123456789;
	
	//2. Second step 
	public void display() {
		//Step 4 = Adding other name and SSN 
		//Step 5 = If we dont want to change the original name and SSN, we have to use the word "FINAL" and comment name and SSN
		// We get the message saying "Remove final modifier of cusotmerName and SSN. Then we comment it
		//If a variable is declared as final means it is constant
		//customerName = "Anand";
		//SSN = 987654321;
		
		System.out.println(customerName);
		System.out.println(SSN);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 3 - object instance
		FinalKeyword obj = new FinalKeyword();
		obj.display();
		

	}

}
