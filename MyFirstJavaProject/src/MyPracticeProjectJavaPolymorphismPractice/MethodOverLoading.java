package MyPracticeProjectJavaPolymorphismPractice;

public class MethodOverLoading {

    
	//POLYMORPHISM = means one task performed in different ways
	//In Java, we use two types of methods to perform polymorphism. 
	//They are 1. Method Overloading and 2. Method OverRiding
	//Other name for methodOverloading is compile time polymorphism
	//Method Overloading means = if a class has multiple methods having same name but different in parameters.
	//If the data type is integer, the return type also should be integer. It cannot be float. It throws an error.
	
	//We are creating public static, so no need to create the constructor 
	
	//A. Changing the number of parameters
	//Step 1(1st step in step 1): entering this value. that is multiply
	public static int multiply(int a, int b) {
		int result = a*b;
		return result;
	}

	//Method Overloading means = if a 'class' has multiple 'methods' having same name but 'different in parameters'.
	//Class = methodOverloading, method name = multiply, different in parameters means = int a, int b (for step 1), int c(adding for step 2)
	
	//Step 2(1st step in step 2): entering this value. that is multiply
	public static int multiply(int a, int b, int c) {
		int result = a * b * c;
		return result;
	}
	
	//B. changing the data type
	//We can do more functions by changing the data type
	
	public static float multiply(float a, float b) {
		float result = a*b;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 2 (2nd step for step 1): After entering the multiply value, we have to call the method
		System.out.println(multiply(20, 30));
		
		//Step 2(2nd step in step 2)
		//Adding one more number here
		System.out.println(multiply(10,20,30));
		
		//Step 3: changing the data type
		//Even if we don't add 'f' at the end of one number, still it considers as float because the other number is a float number
		System.out.println(multiply(3.5f, 2.5f));
		System.out.println(multiply(5.5f, 3));
		
		
	}

}
