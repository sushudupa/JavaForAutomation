package MyFirstPackage;

import java.util.Scanner;

public class JavaIfElseIfLadderStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a Scanner object
		Scanner myScn = new Scanner(System.in);
		
		//4. if else if ladder
		System.out.println("Enter the marks");
		
		int marks = myScn.nextInt();	
		if(marks>=80 && marks<100) {System.out.println("O grade");}
		else if(marks>=75 && marks<90) {System.out.println("A grade");}
		else if(marks>=70 && marks<74) {System.out.println("B grade");}
		else if(marks>=60 && marks<69) {System.out.println("C grade");}
		else if(marks>=50 && marks<59) {System.out.println("D grade");}
		else if(marks>=45 && marks<49) {System.out.println("E grade");}
		else if(marks>=40 && marks<44) {System.out.println("P grade");}
		else if(marks>=39) {System.out.println("Fail");}
		else {System.out.println("Invalid");}	
		System.out.println("******************************************");
				
       myScn.close();
	}

}
