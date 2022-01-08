package MyPracticeProjectJavaConcepts;

public class IndexOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The java string indexOf() method returns index of given character value or substring. 
		//If it is not found, it returns -1. The index counter starts from zero.
		
		//1. Example
		String s1 = "this is index of example";
		//passing substring
		int index1 = s1.indexOf("is"); //Return the index of is substring
		int index2 = s1.indexOf("index"); //return the index of index substring
		System.out.println(index1+ " "+index2); //2,8
		
		//Passing the substring with from index
		int index3 = s1.indexOf("is", 4); //returns the index of is substring after the 4th index
		System.out.println(index3); // 5 
		
		//passing char value
		int index4 = s1.indexOf("s"); //returns the index value of s character value
		System.out.println(index4); //3 
		
		
		//2. Example
		String s2 = "this is example of index";
		//Passing substring
		int index5 = s2.indexOf("of"); //Return the index of is substring
		int index6 = s2.indexOf("index"); //return the index of index substring
		System.out.println(index5+" "+index6); //16 19
		
		//Passing the substring with from index
		int index7 = s2.indexOf("is", 4); //returns the index of is substring after the 4th index
		System.out.println(index7); // 5 
		
		//Passing char value
		int index8 = s2.indexOf("d");
		System.out.println(index8); //21

	}

}
