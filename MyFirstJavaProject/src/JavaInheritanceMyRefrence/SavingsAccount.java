package JavaInheritanceMyRefrence;



public class SavingsAccount extends Account{
	
	//2. second step in coding:
	public int viewSummary (int accNum) {
		System.out.println("The account summary is displayed for " + accNum);
		System.out.println("Saving Account Class is executed");
		return accNum;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. first step in this coding
		SavingsAccount personOne = new SavingsAccount();
		personOne.deposit();
		personOne.withdrawal();
		//2. second step in coding
		personOne.viewSummary(12345);
		
	}

}
