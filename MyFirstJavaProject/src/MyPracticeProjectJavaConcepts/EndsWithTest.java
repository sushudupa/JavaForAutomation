package MyPracticeProjectJavaConcepts;

public class EndsWithTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//The java string endsWith() method checks if this string ends with given suffix. 
		//It returns true if this string ends with given suffix else returns false.
		
		//1. Example
		String s1 = "Java by Javapoint";
		System.out.println(s1.endsWith("t")); // true
		System.out.println(s1.endsWith("Javapoint")); //true
		
		//2. Example
		String s2 = "Selenium is awesome";
		System.out.println(s2.endsWith("e")); //true
		System.out.println(s2.endsWith("awesome")); //true
		System.out.println(s2.endsWith("good")); //false
	
	}

}
