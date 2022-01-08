package MyPracticeProjectJavaConcepts;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The java string equals() method compares the two given strings based on the content of the string. 
		//If any character is not matched, it returns false. If all characters are matched, it returns true.
		
		//1. Example
		String s1 = "javaTutorialPoint";
		String s2 = "javaTutorialPoint";
		String s3 = "JavaPoint";
		String s4 = "Python";
		System.out.println(s1.equals(s2)); //True
		System.out.println(s1.equals(s3)); //False
		System.out.println(s1.equals(s4)); //False

		//Example 2
		String s5 = "Selenium";
		String s6 = "Selenium";
		String s7 = "SELENIUM";
		String s8 = "PYTHON";
		System.out.println(s5.equals(s6)); //True
		System.out.println(s5.equals(s7)); //False
		System.out.println(s5.equals(s8)); //False
	}

}
