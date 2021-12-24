package JavaHandlingException;

import java.util.Scanner;

/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Java Exception Handling
 * Date - 10/13/2021
 *==================================================================*/

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	System.out.println(10/0);

		//1. Aithemtic Exception

		int a = 20;
		int b = 0;
		try {
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Dont divide the number by zero. The error message is " + e);
		}

		//2. Null Pointer Exception

		String name = null;

		try {
			if(name.equals("Selenium")) {
				System.out.println("Values are same");
			}
			else
			{
				System.out.println("Values are not same");
			}

		}
		catch(NullPointerException e) {
			System.out.println("Dont enter the null value. The error message is "+ e);
		}

		// 3. Array Index out of bounds exception

		int num[] = new int[4];

		try {
			num[9] = 100;
			System.out.println(num[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Mention the value within the array limit");
			System.out.println("Error Message is" + e);
		}

		// 4. Number Format Exception

		Scanner scn = new Scanner(System.in);
		System.out.println("Read two numbers");

		String n1 = scn.nextLine();
		String n2 = scn.nextLine();

		try {
			int c =Integer.parseInt(n1);
			int d =Integer.parseInt(n2);
			System.out.println(c+d);
		}
		catch(NumberFormatException e) {
			System.out.println("The error Message is " + e);
		}


		//Try Catch Finally
		try {
			// Connect to data base
			// Run the query
			// Display the output}
		}
		catch(Exception e) {
			// Exception code for data base issue
		}
		finally {
			// This code will be executed as compulsory 
			System.out.println("Finally Block is Executed");
		}



	}
}



















