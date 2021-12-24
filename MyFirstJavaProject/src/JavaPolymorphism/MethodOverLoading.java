package JavaPolymorphism;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Polymorphism - MethodOverLoading
 * Date    - 10/18/2021
 *========================================================================*/


public class MethodOverLoading {

	// 1. By changing the number of arguments
	public static int multiply(int a, int b) {
		int result = a * b;
		return result;
	}

	public static int multiply(int a, int b, int c) {
		int result = a * b *c;
		return result;
	}

	// 2 By changing the data type of the method
	public static float multiply(float a, float b) {
		float result = a * b;
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(multiply(10, 20));
		System.out.println(multiply(10,20,30));

		System.out.println(multiply(7.5f, 8.5f));
		System.out.println(multiply(10, 5.5f));
	}

}
