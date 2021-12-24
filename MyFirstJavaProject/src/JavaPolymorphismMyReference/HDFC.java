package JavaPolymorphismMyReference;


//Child Class 
//1. Step one = extending to the parent class
public class HDFC extends RBI {
	
	//2. Bring all the values from the parent class
	
	public float getHomeLoan(float interest) {
		System.out.println("Home Loan Interest " + interest);
		System.out.println("HDFC Class(child) is executed");
		return interest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC obj = new HDFC();
	    //obj.getHomeLoan(7.60f);= i just commented it so that the step 3 can be performed. Vinoth changed the interest rate in the same space(7.60f)
	    //Step 3 = change the interest rate
	    obj.getHomeLoan(6.50f);

	}

}
