package MyPracticeProjectJavaConcepts;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The java string split() method splits this string against given regular expression and returns a char array.
		
		//1. Example
		String s1 = "Java string split method by javatpoint";
		String[] words = s1.split("\\s");//splits the string based on white space
		
		//Using java for each loop to print elements of string array
		for(String w:words) {
			System.out.println(w);
		}
		
		//2. Example
		String s2 = "selenium supports web based application only";
		String[] words1 = s2.split("\\s"); //splits the string based on white space
		
		//Using selenium for each loop to print elements of string array
		for(String w:words1) {
			System.out.println(w);
		}

		
	}

}
