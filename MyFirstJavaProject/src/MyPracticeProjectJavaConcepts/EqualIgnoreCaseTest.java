package MyPracticeProjectJavaConcepts;

public class EqualIgnoreCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The String equalsIgnoreCase() method compares the two given strings on the basis of content of the string irrespective of case of the string. 
		//It is like equals() method but doesn't check case. 
		//If any character is not matched, it returns false otherwise it returns true.
		
		//1. Example
		String s1 = "javaTutorialPoint";
		String s2 = "javaTutorialPoint";
		String s3 = "JAVATUTORIALPOINT";
		String s4 = "Python";
		System.out.println(s1.equalsIgnoreCase(s2)); //True = both are javaTutorialPoint
		System.out.println(s1.equalsIgnoreCase(s3)); //True = both are javaTutorialPoint
		System.out.println(s1.equalsIgnoreCase(s4)); //False = both are different
		
		//2. Example
		String s5 = "Selenium";
		String s6 = "Selenium";
		String s7 = "SELENIUM";
		String s8 = "Python";
		System.out.println(s5.equalsIgnoreCase(s6)); //True
		System.out.println(s5.equalsIgnoreCase(s7)); //True
		System.out.println(s5.equalsIgnoreCase(s8)); //False
		
	}

}
