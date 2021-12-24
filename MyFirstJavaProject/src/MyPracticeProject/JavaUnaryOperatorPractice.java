package MyPracticeProject;

public class JavaUnaryOperatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pre-Increment 
		// ++i - It will first increment and then assign the value
		
		int i = 10;
		int j = ++i;
		
		System.out.println("The value of i is " + i);
		System.out.println("The value of j is " + j);
		
		// Post Increment - Important Concept
		// i++ - First it will assign the value and then only it will increment
		
		int a = 20;
		int b = a++;
		
		System.out.println("The value of b is " + b); //b value is 20, its not incrementing, so value stays the same
		System.out.println("The value of a is " + a);//a value will increment, that is a ++ means a=20 and + means 1, so a++ means 20+1 =21
		

	}

}
