package MyPracticeProjectJavaConcepts;

public class CharArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The java string toCharArray() method converts this string into character array. 
		//It returns a newly created character array, 
		//its length is similar to this string and its contents are initialized with the characters of this string.
		
		//1. Example
		String s1 = "hello";
		char[] ch = s1.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		//2. Example
		String s2 = "selenium";
		char[] ch1 =s2.toCharArray();
		for(int i = 0; i < ch1.length; i ++) {
			System.out.println(ch1[i]);
		}

	}

}
