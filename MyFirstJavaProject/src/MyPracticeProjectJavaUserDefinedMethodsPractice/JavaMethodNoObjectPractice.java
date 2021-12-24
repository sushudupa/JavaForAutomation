package MyPracticeProjectJavaUserDefinedMethodsPractice;

public class JavaMethodNoObjectPractice {
	
	//Same type of coding that we used in Java method Invoking Object works by adding word "Static" to it. 
	//This method is also called as static user defined methods
	//1. Methods which returns value
		//Syntax
		// accessModifier returnType methodName(dataType variableName) // Arguments or Parameters
	
	public static int addition(int a, int b) {
		int result = a+b;
		return result;
		
	}
	
	public static int subtraction(int a, int b) {
		int result = a-b;
		return result;
	}
	
	
	//2.  Method without returning value
	// accessModifier returnType methodName(dataType variableName)
	//The returnType is void
	//methodName is display
	//dataType variableName is int value
	//syntax: public void display(int value)
	
	public static void display(int value) {
		System.out.println("The value is " + value);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int add = addition(20,30);
		display(add);
		
		int sub = subtraction(30, 10);
		display(sub);
		
	}

}
