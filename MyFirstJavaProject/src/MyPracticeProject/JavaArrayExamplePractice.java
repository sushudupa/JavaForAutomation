package MyPracticeProject;

import java.util.Arrays;

public class JavaArrayExamplePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//In an ARRAY, you can save multiple values in a single variable, instead of declaring seperate variable for each value
		//All the data values should be of same type, that is if it is integer value, everything should be integer
		//Same goes for string or float
		//Arrays are always index based. Index always starts with zero
		//Differntiate between arrayname and non array name is by adding arr in front of the name. That is arrName
		//DataType is integer
		//Allocatating the memory to the data type is very important and it has to be done before the coding
		//Allocate the memory to the arrNum value, so the syntax is arrNum = new int[]. You can give any number of values inside[] square bracket



		//1. Create Array
		//  Syntax : dataType arrName[];
		int arrNum[];

		// 2 . Define Arrays - Allocate Memory
		//Syntax: arrName = new dataType[size]  
		arrNum = new int[4];

		//Assign the values for int
		arrNum[0] = 100;
		arrNum[1] = 200;
		arrNum[2] = 300;
		arrNum[3] = 400;

		//1. Array name = type of an array we are going to use
		//2. Size = How many values i am going to save it
		//3. What are all the values i am going to save it.
		//4. These 3 steps are very important in the array concept in java

		//Access the value
		System.out.println(arrNum[3]);
		System.out.println(arrNum[2]);

		//The exception we get in java array is :  java.lang.ArrayIndexOutOfBoundsException:

		//Alternative Way
		int arrNum2[] = {10,20,30,40,50,60,70};

		System.out.println(arrNum2[5]);

		System.out.println("***********************************NUMBERS***************************************");

		//Print all the values as a list
		//syntax: for(initialization;conditon;increment/decrement) = we dont have to use the increment/decrement for Array as one value[arrNum] has all the requirements
		//int iArr is initialization and arrNum2 is condition

		for(int iArr : arrNum2) {
			System.out.println(iArr);
		}

		//Print as a list
		//Converting integer data type to s string data type and put it into a "list"
		//How do you convert Arrays to a List is by using Arrays.toString method
		
		String arrNumList = Arrays.toString(arrNum2);
		System.out.println(arrNumList);
		
		
		System.out.println("***********************************STRINGS***************************************");

		//Always mention array with [] brackets or else it will throw error

		String arrName[] = {"Saahasi", "Sushma", "Prasad","Sihi","Rashmi","Aarush"};

		System.out.println(arrName[4]);

		for(String iName : arrName) {
			System.out.println(iName);
		}
		
		//Print as a list
		String arrNameList = Arrays.toString(arrName);
		System.out.println(arrNameList);
		
		System.out.println("***********************************METHODS********************************************");
		
		//Present or not/Exists or not
		//This is done to check whether the name we give is present or not
		//This is case sensitive.Name has to be exact match as the name given. or else, the result will be false
		
		boolean name = Arrays.asList(arrName).contains("Sushma");
		System.out.println(name);
		
		// String Method
    	// split() method
		//Split method doesn't take the special character. i.e., "dot .", but it does allow space " " in the place of "AI"
		
		String message = "Welcome to NxtGen AI Academy. AI is called Artificical Intellience";
		String arrWords[] = message.split("AI");
		
		for(String iArr: arrWords) {
			System.out.println(iArr);
		}
	
		//To find the length of the particular array
		System.out.println(arrWords.length);
		
		//The anser we got is 3 for the above code = (arrWords.length), because it counted the number of lines the output is split into
		//Welcome to NxtGen 
		 //Academy. 
		 //is called Artificical Intellience
		//If we want to count just AI means, we have to pit minus one next to length = (arrWords.length-1).Output is 2 AI's.
		//arrWords is a variable
	}

}
