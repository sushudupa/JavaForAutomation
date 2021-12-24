package JavaThisKeyword;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Java This Keyword
 * Date    - 10/18/2021
 *========================================================================*/


public class ThisKeyword {
	
	//Instance Variable
	
	String empName = "Prasad";
	int empID = 12345;
	
	ThisKeyword(String empName, int empID){
		this.empName = empName;
		this.empID = empID;
	}

	void display() {
		System.out.println(empName + "-" + empID);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword obj = new ThisKeyword("Anand", 54321);
		obj.display();
	}

}
