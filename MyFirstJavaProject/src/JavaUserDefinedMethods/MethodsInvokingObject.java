package JavaUserDefinedMethods;


/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Methods Invoking Objects (Instance or Non-Static Method)
 * Date    - 10/16/2021
 *========================================================================*/

public class MethodsInvokingObject {

	//1.Methods which returns value
	//Syntax
	// accessModifier returnType methodName(dataType variableName) // Arguments or Parameters

	public int addtion(int a, int b) {
		int result = a + b;
		return result;
	}

	public int subtraction(int a, int b) {
		int result = a - b;
		return result;
	}

	//2. Method without returning value
	//Syntax
	// accessModifier returnType methodName(dataType variableName) // Arguments or Parameters

	public void display(int value) {
		System.out.println("The value is " + value );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsInvokingObject obj = new MethodsInvokingObject();
		//Below code is for method which returns value
		int add = obj.addtion(20, 30);
		System.out.println(add);

		int sub = obj.subtraction(30, 20);
		System.out.println(sub);

		//Below code is for method without returning value
		int add1 = obj.addtion(20, 30);
		obj.display(add1);

		int sub1 = obj.subtraction(30, 20);
		obj.display(sub1);

	}

}
