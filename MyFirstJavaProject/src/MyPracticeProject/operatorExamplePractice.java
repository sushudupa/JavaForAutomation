package MyPracticeProject;

public class operatorExamplePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. Assignment Operator - Assigning the Values
		 * 
		 * 2. Arithmetic Operator
		   *A. Addition Operator
		   *B. Subtraction Operator
		   *C. Multiplication Operator
		   *D. Division Operator
		   *E. Remainder Operator*/
				
		//2. Equality and Relational Operator

		/*3. Conditional Operator
		   *A. And Operator
		   *B. Or Operator*/
				
		/*4. Unary Operator
		   *A. Pre-increment Operator
		   *B. Post-increment Operator*/
				
			System.out.println("******************************************************************");	
			
			//1. Assignment Opertor
			//Assigning the numbers
			int Num1 = 10;
			int Num2 = 20;
			//int Num3 = 10; - just not using it
			//int Num4 = 6; - just not using it
			
		//A. Addition
			System.out.println(Num1 + Num2);
		//B. Subtraction
			System.out.println(Num2 - Num1);
		//C. Multiplication
			System.out.println(Num1*Num2); 
		//D. Division
			System.out.println(Num2/Num1);
		//E.Remainder
			System.out.println(20%6);
			
			System.out.println("******************************************************************");	
			
			
			//2. Equality and Relational Operator
		
			int Num5 = 100;
			int Num6 = 300;
			int Num7 = 100;
			
			System.out.println(Num5==Num7);
			System.out.println(Num5>Num6);
			System.out.println(Num5<Num6);
			System.out.println(Num6!=Num7); //! Exclamatory means not equal to
			System.out.println(Num6>=Num5);
			System.out.println(Num6<=Num5);
			
			System.out.println("******************************************************************");
			
			//3. Conditional Operator
			
			//And Operator
			
			System.out.println(Num5<Num6 && Num5==Num7);
			System.out.println(Num6>Num5 && Num5==Num6 );
			System.out.println(Num5<Num6 && Num5==Num7);
			System.out.println(Num6>Num5 && Num6==Num7);
			
			System.out.println("******************************************************************");
			
			//Or Operator
			
			System.out.println(Num5<Num6 || Num5==Num7);
			System.out.println(Num6>Num5 || Num5==Num6);
			System.out.println(Num5<Num6 || Num5==Num7);
			System.out.println(Num6>Num5 || Num6==Num7);
			System.out.println(Num5>Num6 || Num6==Num7);
			System.out.println(Num7>Num6 || Num5==Num6);
			
			System.out.println("******************************************************************");
			
			
			
		

	}

}
