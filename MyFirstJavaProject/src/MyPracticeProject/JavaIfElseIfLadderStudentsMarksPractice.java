package MyPracticeProject;

import java.util.Scanner;

public class JavaIfElseIfLadderStudentsMarksPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
		
		//Enter the marks of the students
		System.out.println("Enter the marks");
		int marks = scn.nextInt();
		
		if(marks==35) {
			System.out.println(marks + " is just pass");
		}
		else if(marks>35 && marks <90) {
			System.out.println(marks + " is a good marks");
		}
		else if(marks>=90) {
			System.out.println(marks + " is a merit marks");
		}
		else {
			System.out.println(marks + " is a fail marks");
		}
		
		//If Else If Ladder with graded marks
		
		int marks1 = scn.nextInt();
		if(marks1>=80 && marks1<100) {
			System.out.println("O Grade");
			}
		else if(marks1>=75 && marks1<=90){
			System.out.println("A Grade");
		}
		else if(marks1>=70 && marks1<=74){
			System.out.println("B Grade");
		}
		else if(marks1>=60 && marks1<=69){
			System.out.println("C Grade");
		}
		else if(marks1>=50 && marks1<=59){
			System.out.println("D Grade");
		}
		else if(marks1>=45 && marks1<=49){
			System.out.println("E Grade");
		}
		else if(marks1>=40 && marks1<=44){
			System.out.println("P Grade");
		}
		else if(marks1>39) {
			System.out.println("F Grade");
		}
		else {
			System.out.println("Invalid");
		}
		
		scn.close();
	}   
	

}
