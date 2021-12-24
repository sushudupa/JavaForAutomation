package JavaHandlingException;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Throw KeyWord Exception
 * Date    - 10/16/2021
 *========================================================================*/


public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 16;

		if(age<18) {
			throw new ArithmeticException("Not valid age to vote ");
		}
		else
		{
			System.out.println("Valid age to vote");
		}
	}

}
