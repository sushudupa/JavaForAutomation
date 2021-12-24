package MyFirstPackage;

import java.util.Arrays;

/*=================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Array Example
 * Date - 10/12/2021
 *==================================================================*/



public class JavaArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Create Array
		//Syntax:  dataType arrName[]

		int arrNum[];

		// 2 . Define Arrays - Allocate Memory
		//Syntax: arrName = new dataType[size]
		arrNum = new int[4];

		//Assign the value
		arrNum[0] = 100;
		arrNum[1] = 200;
		arrNum[2] = 300;
		arrNum[3] = 400;

		//Display Accessing
		System.out.println(arrNum[0]);

		System.out.println("*********************Numbers***********************");

		//Alternative Way
		int arrNum2[] = {10,20,30,40,50,60};

		System.out.println(arrNum2[4]);

		//Print all the values
		for(int iArr: arrNum2 ) {
			System.out.println(iArr);
		}
		//Print as a List
		String arrNumList = Arrays.toString(arrNum2);
		System.out.println(arrNumList);


		System.out.println("*********************Strings***********************");

		String arrName[] = {"Suma","Isha","Maya","Sihi","Siya"};
		System.out.println(arrName[3]);

		//Display
		for(String iName: arrName) {
			System.out.println(iName);
		}
		//Print as a List
		String arrNumList2 = Arrays.toString(arrName);
		System.out.println(arrNumList2);

		System.out.println("********************Methods***********************");

		//Present or not
		boolean name = Arrays.asList(arrName).contains("Sihi");
		System.out.println(name);

		// String Method
		// split() method

		String message = "Welcome to NxtGen AI Academy. AI is called Artificical Intellience";
		String arrWords[] = message.split("AI");

		for(String iArr: arrWords) {
			System.out.println(iArr);


		}




	}
}
