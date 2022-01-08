package MyPracticeProjectJavaConcepts;

public class ReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
		
		//1. Example
		String s1 = "javatpoint is a very good website";
		String replaceString = s1.replace('a', 'e'); //replaces all occurances of a to e
		System.out.println(replaceString); //jevetpoint is e very good website
		
		//2. Example
		String s2 = "stackoverflow is a bible for coders";
		String replaceString1 = s2.replace('a', 'i'); //replaces all occurances of a to i
		System.out.println(replaceString1); //stickoverflow is i bible for coders

	}

}
