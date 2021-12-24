package MyFirstPackage;

public class JavaMathBuiltinMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;
		int num3 = -10; // to calculate tha absolute value, put '-'(minu) sign in front of the number
		float num4 = 234.12f;
		
		//compare the numbers
		System.out.println(num1 == num2);
		System.out.println(num1 == num3);
		
		System.out.println("******************************************");
		
		//Mathematical Methods
		
		System.out.println("Maximun of two numbers is " + Math.max(num1, num2));
		System.out.println("Minimun of two numbers is " + Math.min(num1, num2));
		System.out.println("Absolute value is " + Math.abs(num3));
		System.out.println("Round of the value is " + Math.round(num4));
		System.out.println("Random number generated is " + Math.random());
		
		System.out.println("******************************************");
		
		//To generate random number between 0 to 1000
		 int randomNumber = (int)(Math.random()*1001);
		 System.out.println("Radnom number between 0 to 1000 is " + randomNumber);
		 
		 System.out.println("******************************************");
		 
		 //Integer Parsing - convert string to integer
		 
		 int x = Integer.parseInt("10");
		 System.out.println(x);
		 
		 int y = Integer.parseInt("20");
		 System.out.println(y);
		 
		//addition of x and y
		 System.out.println(x+y); 
		 
		 //Concatenating of two numbers
		 System.out.println("10" + "20");
		 
				
	}

}
