package JavaUserDefinedMethods;

/*===============================================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Methods No Objects (User  Defined Values) - 1.Methods without returning values
 *                                                       2. Methods which returns values 
 * Date    - 10/16/2021
 *==============================================================================================*/


public class MethodNoObject {

	//1. Methods which returns value
	//Syntax
	// accessModifier returnType methodName(dataType variableName) // Arguments or Parameters

	public static int addition(int a, int b) {
		int result = a + b;
		return result;

	}

	public static int subtraction(int a, int b) {
		int result = a - b;
		return result;
	}

	//2.  Method without returning value
	// accessModifier returnType methodName(dataType variableName)
	public static void display(int value) {
		System.out.println("The value is " + value);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int add = addition(20,30);
		display(add);

		int sub = subtraction(30,10);
		display(sub);
	}

}
