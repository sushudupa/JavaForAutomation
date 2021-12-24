package JavaFinalKeyword;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Java Final Keyword 
 * Date    - 10/18/2021
 *========================================================================*/

public class FinalKeyword {

	//Instance Variable
	final String customerName = "Pranav";
	final int SSN = 123456789;

	public void display() {
		//customerName = "Anand";
		//SSN = 987654321;
		System.out.println(customerName);
		System.out.println(SSN);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalKeyword obj = new FinalKeyword();
		obj.display();

	}

}
