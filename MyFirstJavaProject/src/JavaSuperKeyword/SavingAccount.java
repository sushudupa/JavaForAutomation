package JavaSuperKeyword;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Java Super Keyword - Saving Account Class
 * Date    - 10/18/2021
 *========================================================================*/

public class SavingAccount extends Account {

	String name = "Saving Account Class - Child";
	public void display() {
		System.out.println("Saving Account Class (Child) is executed");
		System.out.println("The variable value is " + name);
		//Implementing the super keyword
		System.out.println("THe variale value is " + super.name);
	}

	public void show() {
		display();
		super.display();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount obj = new SavingAccount();
		obj.display();
		obj.show();

	}

}
