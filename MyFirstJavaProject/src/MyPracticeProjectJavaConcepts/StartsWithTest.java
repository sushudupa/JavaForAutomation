package MyPracticeProjectJavaConcepts;

public class StartsWithTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The java string startsWith() method checks if this string starts with given prefix. 
		//It returns true if this string starts with given prefix else returns false.
		
		//1. Example
		String s1 = "Java string split method by javatpoint";
		System.out.println(s1.startsWith("Java")); //true
		System.out.println(s1.startsWith("Java string")); //true
		
		//2. Example
		String s2 = "Selenium supports web based applications only";
		System.out.println(s2.startsWith("Selenium")); //true
		System.out.println(s2.startsWith("Selenium supports")); //true
		System.out.println(s2.startsWith("web based")); //false

	}

}
