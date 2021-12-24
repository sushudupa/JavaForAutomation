package JavaInheritance;

import JavaInheritanceMyRefrence.SavingsAccount;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Inheritance Class - Privileged Account
 * Date    - 10/17/2021
 *========================================================================*/


public class PrivilegedAccount extends SavingsAccount{

	public void creditCard(int accNum) {
		System.out.println("Credit Card is dispatched to the customer" + accNum);
		System.out.println("Privileged Account Class is executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrivilegedAccount personTwo = new PrivilegedAccount();
		personTwo.deposit();
		personTwo.withdrawal();
		personTwo.viewSummary(54321);
		personTwo.creditCard(56789);
	}

}
