package MyPracticeProjectThisKeyWordPractice;

public class ThisKeyword {

	//This Keyword refers to the current object in a method or a constructor
	//This keyword refers to the variable that refers current object
	//This eliminates the confusion between class attributes and parameters with the same name
	//In this program, we are using the same name for the instance variable and parameters for this method(ThisKeyword) or local variable,
	//So the program gets confused, regarding which program (prasad or anand) we are calling
	//We have to create a method called "DISPLAY"
	//Use of this Keyword = "Refrence variable that refers to the current object"
    //In the below example, the 'current object' is 	"Anand-54321"
	
	
	
	//Instance Variable
	
	String empName = "Prasad";
	int empID = 12345;
	
	ThisKeyword(String empName, int empID){
		this.empName = empName;
		this.empID = empID;
	}
	
	//This is the step before you enter obj.dispaly in below
    void display() {
		System.out.println(empName +"-" + empID);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//We are creating the object constructor
		//This is a local value
		ThisKeyword obj = new ThisKeyword("Anand", 54321);
		//After writing void display() step above, then, we write the below step
		obj.display();
		
		//If we run without executing the keyword, we get the result as "Prasad-12345"
		//We have to get the value of Anand-54321, so for that, we have to add "this" keyword in front of "this.empName = empName;"

		

	}

}
