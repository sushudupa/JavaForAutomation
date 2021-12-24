package JavaUserDefinedMethods;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Methods Rule For Variable for Static and Non Static Methods
 * Date    - 10/16/2021
 *========================================================================*/

public class MethodsRuleForVariables {

	int a = 10; // Instance Variable
	static int b = 20; // Static Variable

	public static void display() {
		// System.out.println(a); //COMPILE TIME ERROR
		System.out.println(b);
	}

	// Non Static method Variable Rule (We can use both instance and static variable inside the non static method)
	public void display2() {
		System.out.println(a);
		System.out.println(b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display();
		MethodsRuleForVariables obj = new MethodsRuleForVariables();
		obj.display2(); 
	}

}
