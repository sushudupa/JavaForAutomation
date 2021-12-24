package JavaInheritanceMyRefrence;

import JavaInheritance.SavingAccount;

public class PrivilegedAccount extends SavingAccount{
	
	//Second Step in this coding
	public void creditCard(int accNum) {
		System.out.println("Credit Card is dispatched to the customer " + accNum);
		System.out.println("Privileged Account class is executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrivilegedAccount personTwo = new PrivilegedAccount();
		personTwo.deposit();
		personTwo.withdrawal();
		personTwo.viewSummary(54321);
		
		//Second step in this coding
		personTwo.creditCard(56789);
	}

}
