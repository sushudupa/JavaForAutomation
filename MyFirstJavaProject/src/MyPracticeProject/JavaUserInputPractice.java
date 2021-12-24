package MyPracticeProject;
import java.util.Scanner;
public class JavaUserInputPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner Class
		Scanner scn = new Scanner(System.in);


		System.out.println("What day is today?");
		String weekDay = scn.nextLine();
		System.out.println("Today is " + weekDay);
		System.out.println("************************************");

		System.out.println("How many people are there in your family?");
		int intFamilyMember = scn.nextInt();
		System.out.println("Number of family members " + intFamilyMember);
		System.out.println("************************************");

		System.out.println("How many pounds in a kilogram?");
		float fltLbsKgConversion = scn.nextFloat();
		System.out.println("Number of pounds in a kilogram" + fltLbsKgConversion);
		System.out.println("************************************");

		System.out.println("What is the initial letter of your middle name?");
		char chrInitial = scn.next().charAt(0);
		System.out.println("Initial " + chrInitial);
		System.out.println("************************************");

		scn.close();

	}




   //In scanner class, if it is string then the scanner class will be always scn.nextLine();
	//for float scn.nextFloat();
	//for int scn.nextInt();






}


