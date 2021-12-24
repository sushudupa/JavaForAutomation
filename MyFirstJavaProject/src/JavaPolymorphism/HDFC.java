package JavaPolymorphism;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Polymorphism - MethodOverRiding = HDFC
 * Date    - 10/18/2021
 *========================================================================*/

//Child Class

public class HDFC extends RBI {
	
	public float getHomeLoan(float interest) {
		System.out.println("Home Loan Interest " + interest);
		System.out.println("HDFC Class(child) is executed");
		return interest;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC obj = new HDFC();
		obj.getHomeLoan(6.50f);
		

	}

}
