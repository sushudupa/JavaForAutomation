package JavaConstructor;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Java Constructor - Parameterized Constructor
 * Date    - 10/18/2021
 *========================================================================*/


public class ParaConstructor {

	//Instance Variable
	String empName;
	int empID;

	ParaConstructor(String n, int i){
		empName = n;
		empID = i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParaConstructor obj = new ParaConstructor("Sushma", 12345);
		System.out.println(obj.empName);
		System.out.println(obj.empID);

	}

}
