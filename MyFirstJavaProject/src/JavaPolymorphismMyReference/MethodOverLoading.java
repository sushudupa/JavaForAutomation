package JavaPolymorphismMyReference;

//OVERLOADING MEANING - if a class has multiple methods having same name but different in parameters

public class MethodOverLoading {

	//1. First step is to declare the values
	// 1. By changing the number of arguments

	public static int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
	// 2. Step 2 = just including the 'int c'

	public static int multiply(int a, int b, int c) {
		int result = a * b * c;
		return result;

	}	
	//Step 3 - Multiply using float method
	// 2 By changing the data type of the method

	public static float multiply(float a, float b) {
		float result = a * b;
		return result;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(multiply(10, 20));
		System.out.println(multiply(10,20,30));

		System.out.println(multiply(10.5f, 5.5f));
		System.out.println(multiply(10, 6.7f));
	}

}
