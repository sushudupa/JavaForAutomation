package MyPracticeProjectJavaConcepts;

public class TrimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The java string trim() method eliminates leading and trailing spaces.
		
		//1. Example
		
		String s1 = "  hello string  ";
		System.out.println(s1+"javatpoint"); //without the trim() method 
		System.out.println(s1.trim() + "javatpoint"); //with trim() method = we are trimming the space here between string and javatpoint
		
		//2. Example
		String s2 = "  Selenium  ";
		System.out.println(s2+"web based application");
		System.out.println(s2.trim() + "web based application");

		
	}

}
