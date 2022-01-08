package MyPracticeProjectJavaConcepts;

public class SubStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The java string substring() method returns a part of the string.
		//We pass begin index and end index number position in the java substring method where start index is inclusive and end index is exclusive. 
		//In other words, start index starts from 0 whereas end index starts from 1.

		//1.Example
		String s1 = "javatpoint";
		System.out.println(s1.substring(2,4)); //va
		System.out.println(s1.substring(2)); //vatpoint
		
		//2.Example
		String s2 = "selenium";
		System.out.println(s2.substring(3,5)); //en
		System.out.println(s2.substring(5)); //ium
		
		//3. Example
		String s3 = "application";
		System.out.println(s3.substring(3,6)); //lic = here counting for 3 stats from 0,1,2,3 and for 6 starts from 1-6, so 3-6 is lic
		System.out.println(s3.substring(5)); //cation

	}

}
