package MyPracticeProject;

import java.util.Scanner;

public class JavaIfStatementPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a scanner object
		Scanner scn = new Scanner(System.in);
		
		//Enter the age of the person
		System.out.println("Enter the age");
		int age = scn.nextInt();
		
		if(age>=18) {
			
			//This program will be executed only if the condition turns out to be true
			System.out.println(age + " is a major age");
		}
		else {
			//This program will be executed only if the condition turns out to be false
			System.out.println(age + " is a minor age");
		}
		
		
		scn.close();
		
		

	}

}
