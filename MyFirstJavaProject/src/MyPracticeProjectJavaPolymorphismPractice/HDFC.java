package MyPracticeProjectJavaPolymorphismPractice;


//We are using inheritance method here by using "extends" key word

//Step 2: we are doing method overriding now. That is calling the child class(HDFC)

//Child Class
public class HDFC extends RBI {
	
	//If subclass(child class) has the same method as declared in the parent class is called method overriding
	//Here subclass(child) is HDFC has the same method (getHomeLoan) as declared in the parent class(RBI). RBI has also the same method 'getHomeLoan'
	//Method must have same parameter as in the parent class = parameter is 'Float'
	//Must be IS-A relationship (inheritance) = parent child relationship
	
	
	
	public float getHomeLoan(float interest) {
		System.out.println("Home Loan Interest " + interest);
		System.out.println("HDFC Class(child) is executed");
		return interest;
	}

	//After writing the Step 2, (after doing method overriding ), and running the program, we get the result as: Home Loan Interest 6.5
	//And HDFC Class(child) is executed
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Step: Creating the object instance because we have to call the method(parent class) to the main method
		//class name object name = new class name () - () represents constructor
		//After creating the object instance, when we type obj.(dot), we get RBI float interest as we have called the parent method
		//Before writing the step 2 above,when we run the program, the program is called inheritance as we are calling the parent class
		//The message we get is, Home Loan interst is 6.5 and RBI class(parent class) is executed
		//Even though we are calling parent class, we are using HDFC as object constructor, because the class name is HDFC
		//Always the class name should be used to create the object constructor
		
		
		HDFC obj = new HDFC();
		obj.getHomeLoan(6.5f);
	}

}
