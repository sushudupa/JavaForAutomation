package JavaConstructor;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Java Constructor - Default Constructor
 * Date    - 10/18/2021
 *========================================================================*/

public class DefaultConstructor {

	String name;
	int empID;

	DefaultConstructor(){
		System.out.println("Default Constructor is executed first");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultConstructor obj = new DefaultConstructor();
		System.out.println(obj.name);
		System.out.println(obj.empID);

	}

}
