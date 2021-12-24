package MyPracticeProjectJavaExceptionHandlingPractice;

import java.util.Scanner;

public class JavaExceptionHandlingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exception = An exception is a problem that occurs during the execution of a program
		//It occurs due to coding errors made bt the programmer, errors due to invalid input
		//When an exception occurs, program execution will stop and generate an error message
		//Java Exception Handling(try and catch) is used
		//In Java all the exceptions and errors come in the package called "THROWABLE"


		//System.out.println(10/0);

		//1. Aithemtic Exception
		// Error message is saving in a variable called 'e'
		//15/5 is a positive scenario. so the result we get is 3
		//So we are changing it from 15/5 to 15/0 to get the error message
		//Error message is: Don't divide the number by zero. The error message is java.lang.ArithmeticException: / by zero

		int a = 15;
		int b = 0;

		try {
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Don't divide the number by zero. The error message is " + e);
		}


		//2. Null Pointer Exception
		//In Java, special Null value can be assigned to a object reference
		//For String = null, interger = zero = These are the values you get when there is no values assigned to the objects
		//Values are NULL and ZERO
		//We have entered variable name as "Selenium". so we are getting positive answer as "Values are same"
		// I will then change it to SELENIUMS just to get the answer as "Values are not same"
		//THen, i will change the String name Selenium to "null"
		//We will get the error message as :Dont enter the null value. The error message is java.lang.NullPointerException
		//When we get the error  NullPointerException means, we did the biggest mistake in variable
		//When variables not passed between one file to the other file, same error we can see. i.e., java.lang.NullPointerException
		//Its the most important exception.


		String name = null;

		try {
			if(name.equals("Selenium")) {
				System.out.println("The values are same");
			}
			else 
			{
				System.out.println("The values are not same");
			}

		}
		catch(NullPointerException e) {
			System.out.println("Dont enter the null value. The error message is " + e);
		}

		// 3. Array Index out of bounds exception
		//Variable declared with the memory allocation of "4"
		//When declaring the index, it should always have square bracket []
		//Declaring the index variable value to 100 = num[3] = 100;
		//I am changing the num[3] to num[9]. This is negative scenario
		//Learn this exception for interview purpose = "Accessing the index which is not in the defined range" = meaning
	


		int num[] = new int[4];
		try {
			num[9] = 100;
			System.out.println(num[9]);
		}

		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The error message is " + e);
		}

		//4.Number format exception
		//We have to give integers(numbers) = this is a postive case
		//In this program, we are giving characters(alphabets) = this is a negtive scenario
		//We can add teh integers but we cannot add characters
		//We have to import scanner class here
		//The error message is java.lang.NumberFormatException: For input string: "u"
		//I can add two number when i get the message "Read two number" i.e., 4+5 = 9
		//When i add two characters i.e., a +b, we get the above error. : java.lang.NumberFormatException
		//Integer.parseInt is used to convert data type string to an integer data type


		Scanner scn = new Scanner(System.in);
		System.out.println("Read two numbers");

		String n1 = scn.nextLine();
		String n2 = scn.nextLine();

		try {
			int c = Integer.parseInt(n1);
			int d = Integer.parseInt(n2);
			System.out.println(c+d);
		}
		catch(NumberFormatException e)	{
			System.out.println("The error message is " + e);
		}

		//Try Catch Finally
		//This try catch finally is used to handle the exception = Interview Question
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
