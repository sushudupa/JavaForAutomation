package MyPracticeProjectJavaUserDefinedMethodsPractice;

public class JavaMethodRuleForVariablesPractice {
	
	//We are coding here first in public class
	//int a is a instance variable
	//int b is a static variable as we are adding static in the beginning of int
	//Third step is creating a method "public static void display"
	//Inside the static method, only static variable works.
	//when we do sysout for "a", it doesnot work as it is instance variable. It throws error.
	//If we execute the instance variable program, we get compile time error
	//No need to create the object instance for the static method
	
	
	
	int a = 10; //instance variable
	static int b = 20; // static variable
	
	public static void display() {
		//System.out.println(a);
		System.out.println(b);
	}
	
	// Non Static method Variable Rule (We can use both instance and static variable inside the non static method)
	//If it is non static instance method, we can access both codes
	//When we create a method, we do not add static to public static void display(), we just do public void display
	//We always have to create the object instance for the instance variable or non-static method
	
	//In most cases, we have to work with non-static method because of variable issues
	
	public void display2() {
		System.out.println(a);
		System.out.println(b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display();
		
		//To access the static and instance variable, we have to create the object constructor
		//Name should be whatever the class name we have given for this program for the object constructor creation
		JavaMethodRuleForVariablesPractice obj = new JavaMethodRuleForVariablesPractice();
		obj.display2();
		
	}

}
