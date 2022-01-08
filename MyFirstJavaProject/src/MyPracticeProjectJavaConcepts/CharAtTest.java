package MyPracticeProjectJavaConcepts;

public class CharAtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//charAt() method returns a char value at the given index number.
		//The index number starts from 0 and goes to n-1, where n is length of the string. 


		//1. Example
		String name = "Karthikeyan";
		
		char ch = name.charAt(4);
		System.out.println("4th index value is " + ch);
		
		//2. Example
		String name1 = "Divakara";
		char cha = name1.charAt(5);
		System.out.println("5th index value is " + cha);
		
		
	}

}
