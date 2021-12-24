package JavaThisKeywordMyReference;

public class ThisKeyword {
	
	//1. Step 1 - Create an instance variable
	
	//Instance Variable
	String empName = "Prasad";
	int empID = 12345;
	
	//Step 3 = you have to add 'this' in front of empName. Then it becomes this.empName
	ThisKeyword(String empName, int empID){
		this.empName = empName;
		this.empID = empID;
	}

	//Step 2 = Trying to print and show the above emp name/'display' is a method
	
	void display() {
		System.out.println(empName + "-" + empID);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThisKeyword obj = new ThisKeyword("Anand", 54321);
		obj.display();
		
		
		//"This" - keyword is a reference variable that refers to the current object. Here Anand and 54321 is the current object.
		//When the instance and parameters have the same name, then thiskey word/method is used
		
	}

}
