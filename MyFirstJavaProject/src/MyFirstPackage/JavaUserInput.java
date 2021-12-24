package MyFirstPackage;
import java.util.Scanner;
public class JavaUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Which class you will use to get an input from the user means scanner class
		
		// To get the input from user dynamically 
	   // ScannerClass objectName = new ScannerConstructor()

		//1.Java User Input = Scanner Class
		Scanner scn = new Scanner(System.in);


		System.out.println("What day is today?");
		String weekDay = scn.nextLine();
		System.out.println("Today is " + weekDay);
		System.out.println("********************************");


		System.out.println("How many people in your family? ");
		int intFamillyMembers = scn.nextInt();
		System.out.println("Number of family members " + intFamillyMembers );
		System.out.println("********************************");

		
		System.out.println("How many pounds in a kilogram ?");
		float fltLbsKgConversion = scn.nextFloat();
		System.out.println("Number of pounds in a kilogram  " + fltLbsKgConversion);
		System.out.println("********************************");

		
		System.out.println("What is the initial letter of your middle name? ");
		char initial = scn.next().charAt(0);
		System.out.println("initial " + initial );
		System.out.println("********************************");

		//2.Control Statement


		System.out.println("enter the age of the person");
		int age = scn.nextInt();



		//A. If Statement/True statement
		//check is age is greater than 18
		if (age >=18)
		{
			System.out.println(age + " is a major age ");
		}
		System.out.println("****************************************************************");


		//B. Else Statement
		//check if age is less than 18
		if (age <=18)
		{
			System.out.println(age + " is a minor age ");
		}
		System.out.println("****************************************************************");

		//C. Nested If Statement 
		if (age>=18)  {
			if(age>50) {
				System.out.println("You are eligible to donate blood");
			}
			else
			{
				System.out.println("You are not elible to donate blood");
			}
		}
		else
		{	
			System.out.println("Age must be greater than 18");
		}
		System.out.println("****************************************************************");

		
		//4. if else if ladder
			System.out.println("Enter the marks");
			int marks = scn.nextInt();	
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
					


		//4. Switch Statement
		int month = 8;
		switch (month) {
		case 1: System.out.println("January"); break;
		case 2:	System.out.println("February"); break;	
		case 3: System.out.println("March"); break;	
		case 4:	System.out.println("April"); break;
		case 5:	System.out.println("May"); break;
		case 6: System.out.println("June"); break;
		case 7: System.out.println("July"); break;
		case 8:	System.out.println("August");break;
		case 9: System.out.println("September"); break;
		case 10: System.out.println("October"); break;
		case 11: System.out.println("November"); break;
		case 12: System.out.println("December"); break;
		}
		System.out.println("month");
		System.out.println("******************************************"); 


		//5. Descending order for loop
		//program to print from 10-1
		//syntax : for(initialization;condition;increment/decrement)
		for(int num=10; num>=1; num--) {System.out.println(num);}
		System.out.println("*************************************");

		//nested for loop
		for(int num1=10; num1>=1; num1--) {
			for(int num2=10; num2>=1; num2--) {	System.out.println(num1 + "-" + num2);}
		}
		System.out.println("*************************************");

		//6. Ascending order using while and do while loop
		// declare variables
		int intNum5 = 1, n = 10;
		// while loop from 1 to 10
		while(intNum5 <= n) {
			System.out.println(intNum5);
			intNum5++;
		}
		System.out.println("*************************************");

		//declare variables
		int intNum6 = 1, n1 = 10;
		// do...while loop from 1 to 10
		do {
			System.out.println(intNum6);
			intNum6++;
		} while(intNum6 <= n1);
		System.out.println("**************************************");
	

	//7. Difference between break and continue
	for (int i = 0; i < 10; i++) {
		if (i == 4) {break;}
		System.out.println(i);
		}
	for (int i = 0; i < 10; i++) {
		  if (i == 4) {continue;}
		  System.out.println(i);
		} 
	
	  scn.close();
	}	
	}









































