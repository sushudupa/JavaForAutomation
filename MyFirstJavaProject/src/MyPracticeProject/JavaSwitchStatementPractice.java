package MyPracticeProject;

import java.util.Scanner;

public class JavaSwitchStatementPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First of all write just case number and sysout message and then add break to it
		
		//To get the input from user during execution(run time)
		Scanner scn = new Scanner(System.in);
		
		//Enter the month number
		System.out.println("Enter the month number");
		int month = scn.nextInt();
		
		switch(month) {
		
		case 1 : System.out.println("Jan Month"); 
		break;
		
		case 2 : System.out.println("Feb Month");
		break;
		
		case 3 : System.out.println("March Month");
		break;
		
		case 4 : System.out.println("April Month");
		break;
		
		case 5 : System.out.println("May Month");
		break;
		
		case 6 : System.out.println("June Month");
		break;
		
		case 7 : System.out.println("July Month");
		break;
		
		case 8 : System.out.println("Aug Month");
		break;
		
		case 9 : System.out.println("Sep Month");
		break;
		
		case 10: System.out.println("Oct Month");
		break;
		
		case 11: System.out.println("Nov Month");
		break;
		
		case 12: System.out.println("Dec Month");
		break;
		
		default: System.out.println("Enter a valid month number");
		}

   //Difference between if else if ladder and switch statement means, 
		//Different condition and one value = if else if ladder statement
		//Differnt values and one condition  = switch statement
		
		scn.close();
	
	}
	

}
