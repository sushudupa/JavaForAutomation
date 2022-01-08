package MyPracticeProjectJavaConcepts;

public class ContainsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Contains () method searches the sequence of characters in this string. 
		//It returns true if sequence of char values are found in this string otherwise returns false.

		//1. Example
		String name = "what do you know about me?";
		System.out.println(name.contains("do you know")); //true
		System.out.println(name.contains("about")); //true
		System.out.println(name.contains("name")); //false
		
		
		//2. Example
		String name1 = "What is your name ?";
		System.out.println(name1.contains("is your")); //true
		System.out.println(name1.contains("name")); //true
		System.out.println(name1.contains("hello")); //false
	}

}
