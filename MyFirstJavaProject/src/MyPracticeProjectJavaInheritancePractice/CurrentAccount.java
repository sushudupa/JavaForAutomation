package MyPracticeProjectJavaInheritancePractice;

public class CurrentAccount extends Account {
	
	//Parent class can have its own method. 
	//Rate of Interest uses only float method as the ROI changes everytime
	//We have to add return interest by hovering the mouse over to the 	public float getRateOfInterest(float interest)
	
	//2.Second Step
	
	public float getRateOfInterest(float interest) {
		System.out.println("The rate of interest is " + interest);
		System.out.println("The Current Account Class is executed");
		return interest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hierarchial Inheritance = This is between parent and kids(Brother and sister, brothers or sisters)
		//Sharing equally or giving equal importance or rights to parents properties(variables and methods)
		//Parent = brother and sister = account = saving and current account
		//We have to call the parent class. That is account class.
		
		//1. First Step in coding
		//Creating the object instance for current account
		//ClassName object = new ClassName();
		//Here, the personThree has only two methods because, we are extending parent class. 
		//Parent class has only deposit and withdrawal. Parent class has the rights only to the children of the parent
		
		CurrentAccount personThree = new CurrentAccount();
		personThree.deposit();
		personThree.withdrawal();
		
		//Step 2
		personThree.getRateOfInterest(3.5f);

	}

}
