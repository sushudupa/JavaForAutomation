package MyPracticeProjectJavaConcepts;

public class ConcatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//concat() method combines specified string at the end of this string. It returns combined string.
		
		//1. Example
		String s1 = "Java String";
		s1.concat("is immuatable");
		System.out.println(s1);
		s1 = s1.concat(" is immutable so assign it explicitly");
		System.out.println(s1);
		
		//2. Example
		String s2 = "Selenium";
		s2.concat("is very interesting");
		System.out.println(s2);
		s2 = s2.concat(" is very interesting and fun to learn");
		System.out.println(s2);

	}

}
