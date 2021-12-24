package MyPracticeProjectJavaInheritancePractice;

public class SavingAccount extends Account{
	
	//2. second step in coding:
	public int viewSummary (int accNum) {
		System.out.println("The account summary is displayed for " + accNum);
		System.out.println("Saving account class is executed");
		return accNum;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Savings account(Child Account) can have its own methods
		//EXTENDS is the main keyword in Java Inheritance
		//We have to create the object instance for the saving account(child class), because the above method is instance method
		//We have to create the object instance even before coding in the above method(not the main(below) method)
		//In the 2nd step, its always recommended to mention which class it belongs to(saving account)
		//Its a return type method in the 2nd step, so add the return statement(keep cursor on top of the public int viewSummary, it asks us to add return stmt)
		
		
		
		
		//1. First Step in coding
		//Creating the object instance for savings account
		//ClassName object = new ClassName();
		SavingAccount personOne = new SavingAccount();
		personOne.deposit();
		personOne.withdrawal();
		
		//2. second step in coding
		personOne.viewSummary(12343);
		
		

	}

}
