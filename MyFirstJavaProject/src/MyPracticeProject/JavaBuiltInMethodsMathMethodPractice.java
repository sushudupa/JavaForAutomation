package MyPracticeProject;

public class JavaBuiltInMethodsMathMethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 200;
		int num3 = -100; // to calculate tha absolute value, put '-'(minu) sign in front of the number
		float num4 = 234.34f;
		
		//compare the numbers
		System.out.println(num1 == num2);
		System.out.println(num1 == num3);
		
		System.out.println("***********************************************");
		
		//Mathematical Methods
		
		//Maximum of two numbers
		System.out.println("Maximum of two numbers is " + Math.max(num1, num2));
		
		//Minimun of two numbers
		System.out.println("Minimun of two numbers is " + Math.min(num1, num2));
		
		//Absolute value of a number
		System.out.println("Absolute value is " + Math.abs(num3));
		
		//Round value of a number
		System.out.println("Round of the value is " + Math.round(num4));
		
		//Random value of a number = It will be always decimal only
		System.out.println("Random number generted is " + Math.random());
		
		System.out.println("*********************************************************");
		
		//To generate the random number. We have to write 1001 to inclue 1000 number
		int randomNumber = (int)(Math.random()*1001);
		System.out.println("Random Number between 0 to 1000 generated is " + randomNumber);
		
		System.out.println("*************************************************************");
		
		//Interview Question = take some number from the webpage and do all the mathematical calculation 
		//and finally save this value in the database
		
		//Answer for above question is : save the string to a interger by using Integer.parseInt and save it to a variable(x and y)
		
		//Integer parsing - convert string to integer
		int x = Integer.parseInt("10");
		System.out.println(x);
		
		int y = Integer.parseInt("20");
		System.out.println(y);
		
		//Addition of x and y
		System.out.println(x+y);
		
		//Concatenating of two numbers
		System.out.println("10" + "20");
		
	}

}
