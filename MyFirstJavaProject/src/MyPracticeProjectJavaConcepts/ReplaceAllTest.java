package MyPracticeProjectJavaConcepts;

public class ReplaceAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//The java string replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.
		
		//1. Example
		String s1 = "javatpoint is a very good website";
		String replaceString = s1.replaceAll("a", "i"); //replaces all occurances of a to i
		System.out.println(replaceString); //jivitpoint is i very good website
		
		//2.Example
		String s2 = "Jack is boy. Jill is girl. James is boy ";
		String replaceString2 = s2.replaceAll("is", "was"); //It replace is to was
		System.out.println(replaceString2); //Jack was boy. Jill was girl. James was boy
	}

}
