package MyFirstPackage;
import java.util.Scanner;

public class JavaIfandElseandNestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScn = new Scanner(System.in);
		
		System.out.println("enter the age of the person");
		int age = myScn.nextInt();

		//A. If Statement/True statement
				//check is age is greater than 18
				if (age >=18)
				{
					System.out.println(age + " is a major age ");
				}
				System.out.println("****************************************************************");


				//B. Else Statement
				//check if age is less than 18
				if (age <18)
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

				myScn.close();
	}
	
	

}
