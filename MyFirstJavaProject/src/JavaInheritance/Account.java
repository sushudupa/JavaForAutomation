package JavaInheritance;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Inheritance Class - Accounts - Parent Class
 * Date    - 10/17/2021
 *========================================================================*/

public class Account {

	//Parent Class

	public void deposit() {
		System.out.println("Money is deposited");
		System.out.println("Account class is executed");
	}

	public void withdrawal() {
		System.out.println("Money is withdrawn");
		System.out.println("Account class is executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account parent = new Account();
		parent.deposit();
		parent.withdrawal();

	}

}
