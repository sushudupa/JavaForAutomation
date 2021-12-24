package JavaPolymorphism;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Polymorphism - MethodOverRiding = RBI
 * Date    - 10/18/2021
 *========================================================================*/

//Parent Class

public class RBI {
	float interest = 7.60f;
	public float getHomeLoan(float interest) {
		System.out.println("Home Loan Interest " + interest);
		System.out.println("RBI Class(parent) is executed");
		return interest;
	}

}
