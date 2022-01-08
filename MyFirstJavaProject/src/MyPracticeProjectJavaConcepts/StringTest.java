package MyPracticeProjectJavaConcepts;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s=new String("Welcome");//creates two objects and one  reference variable  
		//In such case, JVM will create a new string object in normal (non-pool) heap memory, 
		//and the literal "Welcome" will be placed in the string constant pool. 
		//The variables will refer to the object in a heap (non-pool).

		//Example 1:
		String s1 = "Java"; // creating string by java string literal
		char ch[] = {'s','t','r','i','n','g','s'};
		String s2 = new String(ch); //converting char array to string
		String s3 = new String("Example"); //creating java string by new keyword
		System.out.println("Literal String " + s1); //Literal String Java
		System.out.println("Convert Array to String " + s2); //Convert Array to String strings
		System.out.println("Non-Literal String " + s3); //Non-Literal String Example
		
        //Example 2:
		String s4 = "Selenium";
		char ch1[] = {'s','e','l','e','n','i','u','m'};
		String s5 = new String(ch1);
		String s6 = new String("Welcome");
		System.out.println("Literal String " + s4); //Literal String Selenium
		System.out.println("Convert Array to String " + s5); //Convert Array to String selenium
		System.out.println("Non - Literal String " + s6); //Non - Literal String Welcome
	}

}
