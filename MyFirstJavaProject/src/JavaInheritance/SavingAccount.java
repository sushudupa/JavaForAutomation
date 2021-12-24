package JavaInheritance;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Inheritance Class - Savings Account - Child Class
 * Date    - 10/17/2021
 *========================================================================*/

//Child Class

public class SavingAccount extends Account {

	public int viewSummary(int accNum) {
		System.out.println("The account summary is displayed for " + accNum);
		System.out.println("Saving Account Class is executed");
		return accNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount personOne = new SavingAccount();
		personOne.deposit();
		personOne.withdrawal();
		personOne.viewSummary(12345);

	}

}
