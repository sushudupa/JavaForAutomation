package MyPracticeProjectJavaUserDefinedMethodsPractice;

import JavaUserDefinedMethods.MethodsInvokingObject;

public class JavaMethodInvokingObjectPractice {
	
	
	//Instance Variable = this is for employee information = this is object level. We will create a object instance to get the object value
	//Static Variable = common for every object(employee) = company name email id, company address = this is class level
	//Local Variable = temporary calculation purpose = salary
	//Object name class name = new class name constructor = synatax or formula = this is for only instance variable
	//No need to create the object instance for static variable
	//Java Methods = A set of statements that are grouped together to perform an opertation
	//Types of methods: 1. Predefined or Built in method 2. User Defined method
	//1. Predefined or Built in method is already readily available. Someone already created it
	//2. User Defined method is creating our own method. This method is a heart for testNG
	//User defined method types : 1. Instance or non-static method 2. Static method
	//Instance or non-static method types: a. MEthods Which returns value b. Methods without returning values
	//Methods without returning values are also called as void method
	//MethodInvokingObject is instance method or non-static method
	//Public Static void means = accessing the code can be accessed within the class, outside the class, outside the package(only in java)
	//public static void main(String[] args) = itself is a method. So we have to create inside this public class. It should be accessible to all
	
	
	//1.Methods which returns value
	//Syntax
	// accessModifier returnType methodName(dataType variableName) // Arguments or Parameters
    //public int(returnType) addtion(methodName)(int a, int b)(dataType variableName)
	//Method means = reusing the code again and again
	//Methods return the value means giving an input
	//Methods return the values means giving an output
	//We can put num1, num2 also instead of int a, int b
	
	public int additon(int a, int b) {
		int result = a+b;
		return result;
		
	}
	
	public int subtraction(int a, int b) {
		int result = a-b;
		return result;
	}
	
	//2. Method without returning value
	//Syntax
	// accessModifier returnType methodName(dataType variableName) // Arguments or Parameters
	//The returnType is void
	//methodName is display
	//dataType variableName is int value
	//syntax: public void display(int value)
	
	public void display(int value) {
		System.out.println("The value is " + value);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating the object instance
		MethodsInvokingObject obj = new MethodsInvokingObject();
		//class name object = new classname(); = () = constructor
		//obj.addtion(10, 20); is an integer. So we have to save it as a varibale
		//we have to add int add infront of: obj.addtion(10, 20);
		
		int add = obj.addtion(10, 20);
		System.out.println(add);
		
		int sub = obj.subtraction(20, 10);
		System.out.println(sub);

		//Below code is for method without returning value
		//public void is object, then display and int Value is add
		
		int add1 = obj.addtion(10, 20);
		obj.display(add1);
		
		int sub1 = obj.subtraction(20, 10);
		obj.display(sub1);
		

	}

}
