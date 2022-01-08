package MyPracticeProjectJavaConcepts;

public class CompareToTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//compareTo() method compares the given string with current string lexicographically. 
		//It returns positive number, negative number or 0.

		//1. Example
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";
		
		System.out.println(s1.compareTo(s2)); // 0 = because both hello are equal
		System.out.println(s1.compareTo(s3)); // -5 because "h" is 5 times lower than "m"
		System.out.println(s1.compareTo(s4)); // -1 because "l" is 1 time lower than "m"
		System.out.println(s1.compareTo(s5)); // 2 because "h" is 2 times greater than "f"

		//2. Example
		String s6 = "smile";
		String s7 = "smile";
		String s8 = "shame";
		String s9 = "silly";
		
		System.out.println(s6.compareTo(s7)); //0 = both are same
		System.out.println(s6.compareTo(s8)); //5 = "m" is greater than "h"
		System.out.println(s6.compareTo(s9)); //4 = "m" is greater than "i"
	
		//It means, in this method, every alpabet is compared. That is smile = shame
		//Here S is same for both, m and h are different. So m is greater than h as m comes later than h in alphabetic order
		
	}

}
