package JavaInheritance;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Inheritance Class - Current Account - Hierarchical Inheritance
 * Date    - 10/17/2021
 *========================================================================*/

public class CurrentAccount extends Account  {

	public float getRateOfInterest(float interest) {
		System.out.println("Rate of Interest is " + interest);
		System.out.println("Current Account Class is executed");
		return interest;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CurrentAccount personThree = new CurrentAccount();

		personThree.deposit();
		personThree.withdrawal();
		personThree.getRateOfInterest(4.5f);
	}

}
