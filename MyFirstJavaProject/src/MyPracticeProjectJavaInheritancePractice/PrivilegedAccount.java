package MyPracticeProjectJavaInheritancePractice;

public class PrivilegedAccount extends SavingAccount {
	
	//Second Step in this coding
	public void creditCard(int accNum) {
		System.out.println("Credit card is dispatched to the customer " + accNum);
		System.out.println("Privileged account class is executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is MULTILEVEL Inheritance(child, parent and grandparent). This is never called as mulitple level.
		//In real time scenario, we can have many level inheritance
		//We have to create the object instance
		
		//1. First Step in coding
		//Creating the object instance for savings account
		//ClassName object = new ClassName();
		//Repeate the same process as Savings account(deposit, withdrawal and view Summary)
		//WE are adding one more component like credit card in the second step, not in main
		//Adding personTwo - creditCard in the second step
		
		PrivilegedAccount personTwo	= new PrivilegedAccount();
		personTwo.deposit();
		personTwo.withdrawal();
		personTwo.viewSummary(23242);
		
		//Second Step:
		personTwo.creditCard(23242);
		
	}

}
